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

import static com.google.cloud.dns.v1.ManagedZoneClient.ListManagedZonesPagedResponse;
import static com.google.cloud.dns.v1.stub.HttpJsonManagedZoneStub.createManagedZoneMethodDescriptor;
import static com.google.cloud.dns.v1.stub.HttpJsonManagedZoneStub.deleteManagedZoneMethodDescriptor;
import static com.google.cloud.dns.v1.stub.HttpJsonManagedZoneStub.getManagedZoneMethodDescriptor;
import static com.google.cloud.dns.v1.stub.HttpJsonManagedZoneStub.listManagedZonesMethodDescriptor;
import static com.google.cloud.dns.v1.stub.HttpJsonManagedZoneStub.patchManagedZoneMethodDescriptor;
import static com.google.cloud.dns.v1.stub.HttpJsonManagedZoneStub.updateManagedZoneMethodDescriptor;

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
import com.google.cloud.dns.v1.stub.ManagedZoneStubSettings;
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
public class ManagedZoneClientTest {

  private static final List<ApiMethodDescriptor> METHOD_DESCRIPTORS =
      ImmutableList.copyOf(
          Lists.<ApiMethodDescriptor>newArrayList(
              createManagedZoneMethodDescriptor,
              deleteManagedZoneMethodDescriptor,
              getManagedZoneMethodDescriptor,
              listManagedZonesMethodDescriptor,
              patchManagedZoneMethodDescriptor,
              updateManagedZoneMethodDescriptor));
  private static final MockHttpService mockService =
      new MockHttpService(METHOD_DESCRIPTORS, ManagedZoneStubSettings.getDefaultEndpoint());

  private static ManagedZoneClient client;
  private static ManagedZoneSettings clientSettings;

  @BeforeClass
  public static void setUp() throws IOException {
    clientSettings =
        ManagedZoneSettings.newBuilder()
            .setTransportChannelProvider(
                ManagedZoneSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ManagedZoneClient.create(clientSettings);
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
  public void createManagedZoneTest() {
    String creationTime = "creationTime1932333101";
    String description = "description-1724546052";
    String dnsName = "dnsName411992033";
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    String nameServerSet = "nameServerSet-1673582694";
    String visibility = "visibility1941332754";
    ManagedZone expectedResponse =
        ManagedZone.newBuilder()
            .setCreationTime(creationTime)
            .setDescription(description)
            .setDnsName(dnsName)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setNameServerSet(nameServerSet)
            .setVisibility(visibility)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectName project = ProjectName.of("[PROJECT]");
    ManagedZone managedZoneResource = ManagedZone.newBuilder().build();

    ManagedZone actualResponse = client.createManagedZone(project, managedZoneResource);
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
  public void createManagedZoneExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectName project = ProjectName.of("[PROJECT]");
      ManagedZone managedZoneResource = ManagedZone.newBuilder().build();

      client.createManagedZone(project, managedZoneResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteManagedZoneTest() {
    mockService.addNullResponse();

    ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");

    client.deleteManagedZone(managedZone);

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
  public void deleteManagedZoneExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");

      client.deleteManagedZone(managedZone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getManagedZoneTest() {
    String creationTime = "creationTime1932333101";
    String description = "description-1724546052";
    String dnsName = "dnsName411992033";
    String id = "id3355";
    String kind = "kind3292052";
    String name = "name3373707";
    String nameServerSet = "nameServerSet-1673582694";
    String visibility = "visibility1941332754";
    ManagedZone expectedResponse =
        ManagedZone.newBuilder()
            .setCreationTime(creationTime)
            .setDescription(description)
            .setDnsName(dnsName)
            .setId(id)
            .setKind(kind)
            .setName(name)
            .setNameServerSet(nameServerSet)
            .setVisibility(visibility)
            .build();
    mockService.addResponse(expectedResponse);

    ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");

    ManagedZone actualResponse = client.getManagedZone(managedZone);
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
  public void getManagedZoneExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");

      client.getManagedZone(managedZone);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listManagedZonesTest() {
    String kind = "kind3292052";
    String nextPageToken = "";
    ManagedZone managedZonesElement = ManagedZone.newBuilder().build();
    List<ManagedZone> managedZones = Arrays.asList(managedZonesElement);
    ManagedZonesListResponse expectedResponse =
        ManagedZonesListResponse.newBuilder()
            .setKind(kind)
            .setNextPageToken(nextPageToken)
            .addAllManagedZones(managedZones)
            .build();
    mockService.addResponse(expectedResponse);

    String dnsName = "dnsName411992033";
    ProjectName project = ProjectName.of("[PROJECT]");

    ListManagedZonesPagedResponse pagedListResponse = client.listManagedZones(dnsName, project);

    List<ManagedZone> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getManagedZonesList().get(0), resources.get(0));

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
  public void listManagedZonesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String dnsName = "dnsName411992033";
      ProjectName project = ProjectName.of("[PROJECT]");

      client.listManagedZones(dnsName, project);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void patchManagedZoneTest() {
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

    ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
    ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    Operation actualResponse = client.patchManagedZone(managedZone, managedZoneResource, fieldMask);
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
  public void patchManagedZoneExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
      ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.patchManagedZone(managedZone, managedZoneResource, fieldMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateManagedZoneTest() {
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

    ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
    ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
    List<String> fieldMask = new ArrayList<>();

    Operation actualResponse =
        client.updateManagedZone(managedZone, managedZoneResource, fieldMask);
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
  public void updateManagedZoneExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
      ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
      List<String> fieldMask = new ArrayList<>();

      client.updateManagedZone(managedZone, managedZoneResource, fieldMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
