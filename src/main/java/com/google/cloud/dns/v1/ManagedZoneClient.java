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

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dns.v1.stub.ManagedZoneStub;
import com.google.cloud.dns.v1.stub.ManagedZoneStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Configures and serves authoritative DNS records.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
 *   ProjectName project = ProjectName.of("[PROJECT]");
 *   ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
 *   ManagedZone response = managedZoneClient.createManagedZone(project, managedZoneResource);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the managedZoneClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of ManagedZoneSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * ManagedZoneSettings managedZoneSettings =
 *     ManagedZoneSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ManagedZoneClient managedZoneClient =
 *     ManagedZoneClient.create(managedZoneSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ManagedZoneSettings managedZoneSettings =
 *     ManagedZoneSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ManagedZoneClient managedZoneClient =
 *     ManagedZoneClient.create(managedZoneSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ManagedZoneClient implements BackgroundResource {
  private final ManagedZoneSettings settings;
  private final ManagedZoneStub stub;

  /** Constructs an instance of ManagedZoneClient with default settings. */
  public static final ManagedZoneClient create() throws IOException {
    return create(ManagedZoneSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ManagedZoneClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ManagedZoneClient create(ManagedZoneSettings settings) throws IOException {
    return new ManagedZoneClient(settings);
  }

  /**
   * Constructs an instance of ManagedZoneClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use ManagedZoneSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ManagedZoneClient create(ManagedZoneStub stub) {
    return new ManagedZoneClient(stub);
  }

  /**
   * Constructs an instance of ManagedZoneClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected ManagedZoneClient(ManagedZoneSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((ManagedZoneStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ManagedZoneClient(ManagedZoneStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ManagedZoneSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ManagedZoneStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a new ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
   *   ManagedZone response = managedZoneClient.createManagedZone(project, managedZoneResource);
   * }
   * </code></pre>
   *
   * @param project Identifies the project addressed by this request.
   * @param managedZoneResource A zone is a subtree of the DNS namespace under one administrative
   *     responsibility. A ManagedZone is a resource that represents a DNS zone hosted by the Cloud
   *     DNS service.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ManagedZone createManagedZone(ProjectName project, ManagedZone managedZoneResource) {
    CreateManagedZoneHttpRequest request =
        CreateManagedZoneHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .setManagedZoneResource(managedZoneResource)
            .build();
    return createManagedZone(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a new ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
   *   ManagedZone response = managedZoneClient.createManagedZone(project.toString(), managedZoneResource);
   * }
   * </code></pre>
   *
   * @param project Identifies the project addressed by this request.
   * @param managedZoneResource A zone is a subtree of the DNS namespace under one administrative
   *     responsibility. A ManagedZone is a resource that represents a DNS zone hosted by the Cloud
   *     DNS service.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ManagedZone createManagedZone(String project, ManagedZone managedZoneResource) {
    CreateManagedZoneHttpRequest request =
        CreateManagedZoneHttpRequest.newBuilder()
            .setProject(project)
            .setManagedZoneResource(managedZoneResource)
            .build();
    return createManagedZone(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a new ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
   *   CreateManagedZoneHttpRequest request = CreateManagedZoneHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setManagedZoneResource(managedZoneResource)
   *     .build();
   *   ManagedZone response = managedZoneClient.createManagedZone(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ManagedZone createManagedZone(CreateManagedZoneHttpRequest request) {
    return createManagedZoneCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a new ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
   *   CreateManagedZoneHttpRequest request = CreateManagedZoneHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setManagedZoneResource(managedZoneResource)
   *     .build();
   *   ApiFuture&lt;ManagedZone&gt; future = managedZoneClient.createManagedZoneCallable().futureCall(request);
   *   // Do something
   *   ManagedZone response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<CreateManagedZoneHttpRequest, ManagedZone>
      createManagedZoneCallable() {
    return stub.createManagedZoneCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Delete a previously created ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   managedZoneClient.deleteManagedZone(managedZone);
   * }
   * </code></pre>
   *
   * @param managedZone Identifies the managed zone addressed by this request. Can be the managed
   *     zone name or id.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final void deleteManagedZone(ProjectManagedZoneName managedZone) {
    DeleteManagedZoneHttpRequest request =
        DeleteManagedZoneHttpRequest.newBuilder()
            .setManagedZone(managedZone == null ? null : managedZone.toString())
            .build();
    deleteManagedZone(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Delete a previously created ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   managedZoneClient.deleteManagedZone(managedZone.toString());
   * }
   * </code></pre>
   *
   * @param managedZone Identifies the managed zone addressed by this request. Can be the managed
   *     zone name or id.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final void deleteManagedZone(String managedZone) {
    DeleteManagedZoneHttpRequest request =
        DeleteManagedZoneHttpRequest.newBuilder().setManagedZone(managedZone).build();
    deleteManagedZone(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Delete a previously created ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   DeleteManagedZoneHttpRequest request = DeleteManagedZoneHttpRequest.newBuilder()
   *     .setManagedZone(formattedManagedZone)
   *     .build();
   *   managedZoneClient.deleteManagedZone(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final void deleteManagedZone(DeleteManagedZoneHttpRequest request) {
    deleteManagedZoneCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Delete a previously created ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   DeleteManagedZoneHttpRequest request = DeleteManagedZoneHttpRequest.newBuilder()
   *     .setManagedZone(formattedManagedZone)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = managedZoneClient.deleteManagedZoneCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteManagedZoneHttpRequest, Void> deleteManagedZoneCallable() {
    return stub.deleteManagedZoneCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   ManagedZone response = managedZoneClient.getManagedZone(managedZone);
   * }
   * </code></pre>
   *
   * @param managedZone Identifies the managed zone addressed by this request. Can be the managed
   *     zone name or id.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ManagedZone getManagedZone(ProjectManagedZoneName managedZone) {
    GetManagedZoneHttpRequest request =
        GetManagedZoneHttpRequest.newBuilder()
            .setManagedZone(managedZone == null ? null : managedZone.toString())
            .build();
    return getManagedZone(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   ManagedZone response = managedZoneClient.getManagedZone(managedZone.toString());
   * }
   * </code></pre>
   *
   * @param managedZone Identifies the managed zone addressed by this request. Can be the managed
   *     zone name or id.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ManagedZone getManagedZone(String managedZone) {
    GetManagedZoneHttpRequest request =
        GetManagedZoneHttpRequest.newBuilder().setManagedZone(managedZone).build();
    return getManagedZone(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   GetManagedZoneHttpRequest request = GetManagedZoneHttpRequest.newBuilder()
   *     .setManagedZone(formattedManagedZone)
   *     .build();
   *   ManagedZone response = managedZoneClient.getManagedZone(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ManagedZone getManagedZone(GetManagedZoneHttpRequest request) {
    return getManagedZoneCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   GetManagedZoneHttpRequest request = GetManagedZoneHttpRequest.newBuilder()
   *     .setManagedZone(formattedManagedZone)
   *     .build();
   *   ApiFuture&lt;ManagedZone&gt; future = managedZoneClient.getManagedZoneCallable().futureCall(request);
   *   // Do something
   *   ManagedZone response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetManagedZoneHttpRequest, ManagedZone> getManagedZoneCallable() {
    return stub.getManagedZoneCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate ManagedZones that have been created but not yet deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   String dnsName = "";
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (ManagedZone element : managedZoneClient.listManagedZones(dnsName, project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param dnsName Restricts the list to return only zones with this domain name.
   * @param project Identifies the project addressed by this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListManagedZonesPagedResponse listManagedZones(String dnsName, ProjectName project) {
    ListManagedZonesHttpRequest request =
        ListManagedZonesHttpRequest.newBuilder()
            .setDnsName(dnsName)
            .setProject(project == null ? null : project.toString())
            .build();
    return listManagedZones(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate ManagedZones that have been created but not yet deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   String dnsName = "";
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (ManagedZone element : managedZoneClient.listManagedZones(dnsName, project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param dnsName Restricts the list to return only zones with this domain name.
   * @param project Identifies the project addressed by this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListManagedZonesPagedResponse listManagedZones(String dnsName, String project) {
    ListManagedZonesHttpRequest request =
        ListManagedZonesHttpRequest.newBuilder().setDnsName(dnsName).setProject(project).build();
    return listManagedZones(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate ManagedZones that have been created but not yet deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   String dnsName = "";
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   ListManagedZonesHttpRequest request = ListManagedZonesHttpRequest.newBuilder()
   *     .setDnsName(dnsName)
   *     .setProject(formattedProject)
   *     .build();
   *   for (ManagedZone element : managedZoneClient.listManagedZones(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListManagedZonesPagedResponse listManagedZones(ListManagedZonesHttpRequest request) {
    return listManagedZonesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate ManagedZones that have been created but not yet deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   String dnsName = "";
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   ListManagedZonesHttpRequest request = ListManagedZonesHttpRequest.newBuilder()
   *     .setDnsName(dnsName)
   *     .setProject(formattedProject)
   *     .build();
   *   ApiFuture&lt;ListManagedZonesPagedResponse&gt; future = managedZoneClient.listManagedZonesPagedCallable().futureCall(request);
   *   // Do something
   *   for (ManagedZone element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListManagedZonesHttpRequest, ListManagedZonesPagedResponse>
      listManagedZonesPagedCallable() {
    return stub.listManagedZonesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate ManagedZones that have been created but not yet deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   String dnsName = "";
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   ListManagedZonesHttpRequest request = ListManagedZonesHttpRequest.newBuilder()
   *     .setDnsName(dnsName)
   *     .setProject(formattedProject)
   *     .build();
   *   while (true) {
   *     ManagedZonesListResponse response = managedZoneClient.listManagedZonesCallable().call(request);
   *     for (ManagedZone element : response.getManagedZonesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListManagedZonesHttpRequest, ManagedZonesListResponse>
      listManagedZonesCallable() {
    return stub.listManagedZonesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Apply a partial update to an existing ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   Operation response = managedZoneClient.patchManagedZone(managedZone, managedZoneResource, fieldMask);
   * }
   * </code></pre>
   *
   * @param managedZone Identifies the managed zone addressed by this request. Can be the managed
   *     zone name or id.
   * @param managedZoneResource A zone is a subtree of the DNS namespace under one administrative
   *     responsibility. A ManagedZone is a resource that represents a DNS zone hosted by the Cloud
   *     DNS service.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchManagedZone(
      ProjectManagedZoneName managedZone, ManagedZone managedZoneResource, List<String> fieldMask) {
    PatchManagedZoneHttpRequest request =
        PatchManagedZoneHttpRequest.newBuilder()
            .setManagedZone(managedZone == null ? null : managedZone.toString())
            .setManagedZoneResource(managedZoneResource)
            .addAllFieldMask(fieldMask)
            .build();
    return patchManagedZone(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Apply a partial update to an existing ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   Operation response = managedZoneClient.patchManagedZone(managedZone.toString(), managedZoneResource, fieldMask);
   * }
   * </code></pre>
   *
   * @param managedZone Identifies the managed zone addressed by this request. Can be the managed
   *     zone name or id.
   * @param managedZoneResource A zone is a subtree of the DNS namespace under one administrative
   *     responsibility. A ManagedZone is a resource that represents a DNS zone hosted by the Cloud
   *     DNS service.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchManagedZone(
      String managedZone, ManagedZone managedZoneResource, List<String> fieldMask) {
    PatchManagedZoneHttpRequest request =
        PatchManagedZoneHttpRequest.newBuilder()
            .setManagedZone(managedZone)
            .setManagedZoneResource(managedZoneResource)
            .addAllFieldMask(fieldMask)
            .build();
    return patchManagedZone(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Apply a partial update to an existing ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PatchManagedZoneHttpRequest request = PatchManagedZoneHttpRequest.newBuilder()
   *     .setManagedZone(formattedManagedZone)
   *     .setManagedZoneResource(managedZoneResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   Operation response = managedZoneClient.patchManagedZone(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchManagedZone(PatchManagedZoneHttpRequest request) {
    return patchManagedZoneCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Apply a partial update to an existing ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PatchManagedZoneHttpRequest request = PatchManagedZoneHttpRequest.newBuilder()
   *     .setManagedZone(formattedManagedZone)
   *     .setManagedZoneResource(managedZoneResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = managedZoneClient.patchManagedZoneCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchManagedZoneHttpRequest, Operation> patchManagedZoneCallable() {
    return stub.patchManagedZoneCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Update an existing ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   Operation response = managedZoneClient.updateManagedZone(managedZone, managedZoneResource, fieldMask);
   * }
   * </code></pre>
   *
   * @param managedZone Identifies the managed zone addressed by this request. Can be the managed
   *     zone name or id.
   * @param managedZoneResource A zone is a subtree of the DNS namespace under one administrative
   *     responsibility. A ManagedZone is a resource that represents a DNS zone hosted by the Cloud
   *     DNS service.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateManagedZone(
      ProjectManagedZoneName managedZone, ManagedZone managedZoneResource, List<String> fieldMask) {
    UpdateManagedZoneHttpRequest request =
        UpdateManagedZoneHttpRequest.newBuilder()
            .setManagedZone(managedZone == null ? null : managedZone.toString())
            .setManagedZoneResource(managedZoneResource)
            .addAllFieldMask(fieldMask)
            .build();
    return updateManagedZone(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Update an existing ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   Operation response = managedZoneClient.updateManagedZone(managedZone.toString(), managedZoneResource, fieldMask);
   * }
   * </code></pre>
   *
   * @param managedZone Identifies the managed zone addressed by this request. Can be the managed
   *     zone name or id.
   * @param managedZoneResource A zone is a subtree of the DNS namespace under one administrative
   *     responsibility. A ManagedZone is a resource that represents a DNS zone hosted by the Cloud
   *     DNS service.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateManagedZone(
      String managedZone, ManagedZone managedZoneResource, List<String> fieldMask) {
    UpdateManagedZoneHttpRequest request =
        UpdateManagedZoneHttpRequest.newBuilder()
            .setManagedZone(managedZone)
            .setManagedZoneResource(managedZoneResource)
            .addAllFieldMask(fieldMask)
            .build();
    return updateManagedZone(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Update an existing ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   UpdateManagedZoneHttpRequest request = UpdateManagedZoneHttpRequest.newBuilder()
   *     .setManagedZone(formattedManagedZone)
   *     .setManagedZoneResource(managedZoneResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   Operation response = managedZoneClient.updateManagedZone(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateManagedZone(UpdateManagedZoneHttpRequest request) {
    return updateManagedZoneCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Update an existing ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   UpdateManagedZoneHttpRequest request = UpdateManagedZoneHttpRequest.newBuilder()
   *     .setManagedZone(formattedManagedZone)
   *     .setManagedZoneResource(managedZoneResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = managedZoneClient.updateManagedZoneCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdateManagedZoneHttpRequest, Operation> updateManagedZoneCallable() {
    return stub.updateManagedZoneCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListManagedZonesPagedResponse
      extends AbstractPagedListResponse<
          ListManagedZonesHttpRequest,
          ManagedZonesListResponse,
          ManagedZone,
          ListManagedZonesPage,
          ListManagedZonesFixedSizeCollection> {

    public static ApiFuture<ListManagedZonesPagedResponse> createAsync(
        PageContext<ListManagedZonesHttpRequest, ManagedZonesListResponse, ManagedZone> context,
        ApiFuture<ManagedZonesListResponse> futureResponse) {
      ApiFuture<ListManagedZonesPage> futurePage =
          ListManagedZonesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListManagedZonesPage, ListManagedZonesPagedResponse>() {
            @Override
            public ListManagedZonesPagedResponse apply(ListManagedZonesPage input) {
              return new ListManagedZonesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListManagedZonesPagedResponse(ListManagedZonesPage page) {
      super(page, ListManagedZonesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListManagedZonesPage
      extends AbstractPage<
          ListManagedZonesHttpRequest,
          ManagedZonesListResponse,
          ManagedZone,
          ListManagedZonesPage> {

    private ListManagedZonesPage(
        PageContext<ListManagedZonesHttpRequest, ManagedZonesListResponse, ManagedZone> context,
        ManagedZonesListResponse response) {
      super(context, response);
    }

    private static ListManagedZonesPage createEmptyPage() {
      return new ListManagedZonesPage(null, null);
    }

    @Override
    protected ListManagedZonesPage createPage(
        PageContext<ListManagedZonesHttpRequest, ManagedZonesListResponse, ManagedZone> context,
        ManagedZonesListResponse response) {
      return new ListManagedZonesPage(context, response);
    }

    @Override
    public ApiFuture<ListManagedZonesPage> createPageAsync(
        PageContext<ListManagedZonesHttpRequest, ManagedZonesListResponse, ManagedZone> context,
        ApiFuture<ManagedZonesListResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListManagedZonesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListManagedZonesHttpRequest,
          ManagedZonesListResponse,
          ManagedZone,
          ListManagedZonesPage,
          ListManagedZonesFixedSizeCollection> {

    private ListManagedZonesFixedSizeCollection(
        List<ListManagedZonesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListManagedZonesFixedSizeCollection createEmptyCollection() {
      return new ListManagedZonesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListManagedZonesFixedSizeCollection createCollection(
        List<ListManagedZonesPage> pages, int collectionSize) {
      return new ListManagedZonesFixedSizeCollection(pages, collectionSize);
    }
  }
}
