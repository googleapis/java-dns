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

import static com.google.cloud.dns.v1.ChangeClient.ListChangesPagedResponse;
import static com.google.cloud.dns.v1.stub.HttpJsonChangeStub.createChangeMethodDescriptor;
import static com.google.cloud.dns.v1.stub.HttpJsonChangeStub.getChangeMethodDescriptor;
import static com.google.cloud.dns.v1.stub.HttpJsonChangeStub.listChangesMethodDescriptor;

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
import com.google.cloud.dns.v1.stub.ChangeStubSettings;
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
public class ChangeClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              createChangeMethodDescriptor,
              getChangeMethodDescriptor,
              listChangesMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, ChangeStubSettings.getDefaultEndpoint());

  private static ChangeClient client;
  private static ChangeSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        ChangeSettings.newBuilder()
            .setTransportChannelProvider(
                ChangeSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ChangeClient.create(clientSettings);
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
  public void createChangeTest() {
    String id = "id3355";
    Boolean isServing = false;
    String kind = "kind3292052";
    String startTime = "startTime-1573145462";
    String status = "status-892481550";
    Change expectedResponse =
        Change.newBuilder()
            .setId(id)
            .setIsServing(isServing)
            .setKind(kind)
            .setStartTime(startTime)
            .setStatus(status)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
    Change changeResource = Change.newBuilder().build();

    Change actualResponse = client.createChange(managedZone, changeResource);
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
  public void createChangeExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
      Change changeResource = Change.newBuilder().build();

      client.createChange(managedZone, changeResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getChangeTest() {
    String id = "id3355";
    Boolean isServing = false;
    String kind = "kind3292052";
    String startTime = "startTime-1573145462";
    String status = "status-892481550";
    Change expectedResponse =
        Change.newBuilder()
            .setId(id)
            .setIsServing(isServing)
            .setKind(kind)
            .setStartTime(startTime)
            .setStatus(status)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectManagedZoneChangeChangeIdName changeId =
        ProjectManagedZoneChangeChangeIdName.of("[PROJECT]", "[MANAGED_ZONE]", "[CHANGE_ID]");

    Change actualResponse = client.getChange(changeId);
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
  public void getChangeExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectManagedZoneChangeChangeIdName changeId =
          ProjectManagedZoneChangeChangeIdName.of("[PROJECT]", "[MANAGED_ZONE]", "[CHANGE_ID]");

      client.getChange(changeId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listChangesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    Change changesElement = Change.newBuilder().build();
    List<Change> changes = Arrays.asList(changesElement);
    ChangesListResponse expectedResponse =
        ChangesListResponse.newBuilder()
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .addAllChanges(changes)
            .build();
    mockService.addResponse(expectedResponse);

    String sortOrder = "sortOrder-374296211";
    String sortBy = "sortBy-2024591720";
    ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");

    ListChangesPagedResponse pagedListResponse = client.listChanges(sortOrder, sortBy, managedZone);

    List<Change> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getChangesList().get(0), resources.get(0));

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
  public void listChangesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String sortOrder = "sortOrder-374296211";
      String sortBy = "sortBy-2024591720";
      ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");

      client.listChanges(sortOrder, sortBy, managedZone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
