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

import static com.google.cloud.dns.v1.DnsKeyClient.ListDnsKeysPagedResponse;
import static com.google.cloud.dns.v1.stub.HttpJsonDnsKeyStub.getDnsKeyMethodDescriptor;
import static com.google.cloud.dns.v1.stub.HttpJsonDnsKeyStub.listDnsKeysMethodDescriptor;

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
import com.google.cloud.dns.v1.stub.DnsKeyStubSettings;
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
public class DnsKeyClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              getDnsKeyMethodDescriptor, listDnsKeysMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, DnsKeyStubSettings.getDefaultEndpoint());

  private static DnsKeyClient client;
  private static DnsKeySettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        DnsKeySettings.newBuilder()
            .setTransportChannelProvider(
                DnsKeySettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = DnsKeyClient.create(clientSettings);
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
  public void getDnsKeyTest() {
    String algorithm = "algorithm225490031";
    String creationTime = "creationTime1932333101";
    String description = "description-1724546052";
    String id = "id3355";
    Boolean isActive = false;
    Integer keyLength = 312377542;
    Integer keyTag = 815118918;
    String kind = "kind3292052";
    String publicKey = "publicKey1904812937";
    String type = "type3575610";
    DnsKey expectedResponse =
        DnsKey.newBuilder()
            .setAlgorithm(algorithm)
            .setCreationTime(creationTime)
            .setDescription(description)
            .setId(id)
            .setIsActive(isActive)
            .setKeyLength(keyLength)
            .setKeyTag(keyTag)
            .setKind(kind)
            .setPublicKey(publicKey)
            .setType(type)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectManagedZoneDnsKeyDnsKeyIdName dnsKeyId =
        ProjectManagedZoneDnsKeyDnsKeyIdName.of("[PROJECT]", "[MANAGED_ZONE]", "[DNS_KEY_ID]");

    DnsKey actualResponse = client.getDnsKey(dnsKeyId);
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
  public void getDnsKeyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectManagedZoneDnsKeyDnsKeyIdName dnsKeyId =
          ProjectManagedZoneDnsKeyDnsKeyIdName.of("[PROJECT]", "[MANAGED_ZONE]", "[DNS_KEY_ID]");

      client.getDnsKey(dnsKeyId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listDnsKeysTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    DnsKey dnsKeysElement = DnsKey.newBuilder().build();
    List<DnsKey> dnsKeys = Arrays.asList(dnsKeysElement);
    DnsKeysListResponse expectedResponse =
        DnsKeysListResponse.newBuilder()
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .addAllDnsKeys(dnsKeys)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");

    ListDnsKeysPagedResponse pagedListResponse = client.listDnsKeys(managedZone);

    List<DnsKey> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getDnsKeysList().get(0), resources.get(0));

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
  public void listDnsKeysExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");

      client.listDnsKeys(managedZone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
