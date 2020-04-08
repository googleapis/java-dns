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

import static com.google.cloud.dns.v1.ManagedZoneOperationClient.ListManagedZoneOperationsPagedResponse;
import static com.google.cloud.dns.v1.stub.HttpJsonManagedZoneOperationStub.getManagedZoneOperationMethodDescriptor;
import static com.google.cloud.dns.v1.stub.HttpJsonManagedZoneOperationStub.listManagedZoneOperationsMethodDescriptor;

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
import com.google.cloud.dns.v1.stub.ManagedZoneOperationStubSettings;
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
public class ManagedZoneOperationClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              getManagedZoneOperationMethodDescriptor, listManagedZoneOperationsMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(
          METHOD_DESCRIPTORS, ManagedZoneOperationStubSettings.getDefaultEndpoint());

  private static ManagedZoneOperationClient client;
  private static ManagedZoneOperationSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        ManagedZoneOperationSettings.newBuilder()
            .setTransportChannelProvider(
                ManagedZoneOperationSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ManagedZoneOperationClient.create(clientSettings);
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
  public void getManagedZoneOperationTest() {
    String id = "id3355";
    String kind = "kind3292052";
    String startTime = "startTime-1573145462";
    String status = "status-892481550";
    String type = "type3575610";
    String user = "user3599307";
    Operation expectedResponse =
        Operation.newBuilder()
            .setId(id)
            .setKind(kind)
            .setStartTime(startTime)
            .setStatus(status)
            .setType(type)
            .setUser(user)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectManagedZoneOperationName operation =
        ProjectManagedZoneOperationName.of("[PROJECT]", "[MANAGED_ZONE]", "[OPERATION]");

    Operation actualResponse = client.getManagedZoneOperation(operation);
    Assert.assertEquals(expectedResponse, actualResponse);

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
  public void getManagedZoneOperationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectManagedZoneOperationName operation =
          ProjectManagedZoneOperationName.of("[PROJECT]", "[MANAGED_ZONE]", "[OPERATION]");

      client.getManagedZoneOperation(operation);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listManagedZoneOperationsTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    Operation operationsElement = Operation.newBuilder().build();
    List<Operation> operations = Arrays.asList(operationsElement);
    ManagedZoneOperationsListResponse expectedResponse =
        ManagedZoneOperationsListResponse.newBuilder()
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .addAllOperations(operations)
            .build();
    mockService.addResponse(expectedResponse);

    String sortBy = "sortBy-2024591720";
    ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");

    ListManagedZoneOperationsPagedResponse pagedListResponse =
        client.listManagedZoneOperations(sortBy, managedZone);

    List<Operation> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getOperationsList().get(0), resources.get(0));

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
  public void listManagedZoneOperationsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String sortBy = "sortBy-2024591720";
      ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");

      client.listManagedZoneOperations(sortBy, managedZone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
