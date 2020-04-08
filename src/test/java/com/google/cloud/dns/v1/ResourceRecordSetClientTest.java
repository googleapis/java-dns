/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.dns.v1;

import static com.google.cloud.dns.v1.ResourceRecordSetClient.ListResourceRecordSetsPagedResponse;
import static com.google.cloud.dns.v1.stub.HttpJsonResourceRecordSetStub.listResourceRecordSetsMethodDescriptor;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode.Code;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.dns.v1.stub.ResourceRecordSetStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class ResourceRecordSetClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(listResourceRecordSetsMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, ResourceRecordSetStubSettings.getDefaultEndpoint());

  private static ResourceRecordSetClient client;
  private static ResourceRecordSetSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        ResourceRecordSetSettings.newBuilder()
            .setTransportChannelProvider(
                ResourceRecordSetSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ResourceRecordSetClient.create(clientSettings);
  }

  @After
  public void cleanUp() {
    mockService.reset();
  }

  @AfterClass
  public static void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void listResourceRecordSetsTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    ResourceRecordSet rrsetsElement = ResourceRecordSet.newBuilder().build();
    List<ResourceRecordSet> rrsets = Arrays.asList(rrsetsElement);
    ResourceRecordSetsListResponse expectedResponse =
        ResourceRecordSetsListResponse.newBuilder()
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .addAllRrsets(rrsets)
            .build();
    mockService.addResponse(expectedResponse);

    String name = "name3373707";
    String type = "type3575610";
    ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");

    ListResourceRecordSetsPagedResponse pagedListResponse =
        client.listResourceRecordSets(name, type, managedZone);

    List<ResourceRecordSet> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getRrsetsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  @SuppressWarnings("all")
  public void listResourceRecordSetsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "name3373707";
      String type = "type3575610";
      ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");

      client.listResourceRecordSets(name, type, managedZone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
