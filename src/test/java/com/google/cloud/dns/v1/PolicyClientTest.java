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

import static com.google.cloud.dns.v1.PolicyClient.ListPoliciesPagedResponse;
import static com.google.cloud.dns.v1.stub.HttpJsonPolicyStub.createPolicyMethodDescriptor;
import static com.google.cloud.dns.v1.stub.HttpJsonPolicyStub.deletePolicyMethodDescriptor;
import static com.google.cloud.dns.v1.stub.HttpJsonPolicyStub.getPolicyMethodDescriptor;
import static com.google.cloud.dns.v1.stub.HttpJsonPolicyStub.listPoliciesMethodDescriptor;
import static com.google.cloud.dns.v1.stub.HttpJsonPolicyStub.patchPolicyMethodDescriptor;
import static com.google.cloud.dns.v1.stub.HttpJsonPolicyStub.updatePolicyMethodDescriptor;

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
import com.google.cloud.dns.v1.stub.PolicyStubSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class PolicyClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              createPolicyMethodDescriptor,
              deletePolicyMethodDescriptor,
              getPolicyMethodDescriptor,
              listPoliciesMethodDescriptor,
              patchPolicyMethodDescriptor,
              updatePolicyMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, PolicyStubSettings.getDefaultEndpoint());

  private static PolicyClient client;
  private static PolicySettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        PolicySettings.newBuilder()
            .setTransportChannelProvider(
                PolicySettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = PolicyClient.create(clientSettings);
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
  public void createPolicyTest() {
    String description = "description-1724546052";
    Boolean enableInboundForwarding = false;
    Boolean enableLogging = false;
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    Policy expectedResponse =
        Policy.newBuilder()
            .setDescription(description)
            .setEnableInboundForwarding(enableInboundForwarding)
            .setEnableLogging(enableLogging)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");
    Policy policyResource = Policy.newBuilder().build();

    Policy actualResponse = client.createPolicy(project, policyResource);
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
  public void createPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      Policy policyResource = Policy.newBuilder().build();

      client.createPolicy(project, policyResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deletePolicyTest() {
    mockService.addNullResponse();

    ProjectPolicyName policy = ProjectPolicyName.of("[PROJECT]", "[POLICY]");

    client.deletePolicy(policy);

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
  public void deletePolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectPolicyName policy = ProjectPolicyName.of("[PROJECT]", "[POLICY]");

      client.deletePolicy(policy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getPolicyTest() {
    String description = "description-1724546052";
    Boolean enableInboundForwarding = false;
    Boolean enableLogging = false;
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    Policy expectedResponse =
        Policy.newBuilder()
            .setDescription(description)
            .setEnableInboundForwarding(enableInboundForwarding)
            .setEnableLogging(enableLogging)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectPolicyName policy = ProjectPolicyName.of("[PROJECT]", "[POLICY]");

    Policy actualResponse = client.getPolicy(policy);
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
  public void getPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectPolicyName policy = ProjectPolicyName.of("[PROJECT]", "[POLICY]");

      client.getPolicy(policy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listPoliciesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    Policy policiesElement = Policy.newBuilder().build();
    List<Policy> policies = Arrays.asList(policiesElement);
    PoliciesListResponse expectedResponse =
        PoliciesListResponse.newBuilder()
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .addAllPolicies(policies)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");

    ListPoliciesPagedResponse pagedListResponse = client.listPolicies(project);

    List<Policy> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getPoliciesList().get(0), resources.get(0));

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
  public void listPoliciesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listPolicies(project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchPolicyTest() {
    PoliciesPatchResponse expectedResponse = PoliciesPatchResponse.newBuilder().build();
    mockService.addResponse(expectedResponse);

    ProjectPolicyName policy = ProjectPolicyName.of("[PROJECT]", "[POLICY]");
    Policy policyResource = Policy.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    PoliciesPatchResponse actualResponse = client.patchPolicy(policy, policyResource, fieldMask);
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
  public void patchPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectPolicyName policy = ProjectPolicyName.of("[PROJECT]", "[POLICY]");
      Policy policyResource = Policy.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.patchPolicy(policy, policyResource, fieldMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updatePolicyTest() {
    PoliciesUpdateResponse expectedResponse = PoliciesUpdateResponse.newBuilder().build();
    mockService.addResponse(expectedResponse);

    ProjectPolicyName policy = ProjectPolicyName.of("[PROJECT]", "[POLICY]");
    Policy policyResource = Policy.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    PoliciesUpdateResponse actualResponse = client.updatePolicy(policy, policyResource, fieldMask);
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
  public void updatePolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectPolicyName policy = ProjectPolicyName.of("[PROJECT]", "[POLICY]");
      Policy policyResource = Policy.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.updatePolicy(policy, policyResource, fieldMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
