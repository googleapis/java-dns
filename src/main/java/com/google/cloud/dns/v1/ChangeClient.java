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
import com.google.cloud.dns.v1.stub.ChangeStub;
import com.google.cloud.dns.v1.stub.ChangeStubSettings;
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
 * try (ChangeClient changeClient = ChangeClient.create()) {
 *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
 *   Change changeResource = Change.newBuilder().build();
 *   Change response = changeClient.createChange(managedZone, changeResource);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the changeClient object to clean up resources such as
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
 * <p>This class can be customized by passing in a custom instance of ChangeSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * ChangeSettings changeSettings =
 *     ChangeSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ChangeClient changeClient =
 *     ChangeClient.create(changeSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ChangeSettings changeSettings =
 *     ChangeSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ChangeClient changeClient =
 *     ChangeClient.create(changeSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ChangeClient implements BackgroundResource {
  private final ChangeSettings settings;
  private final ChangeStub stub;

  /** Constructs an instance of ChangeClient with default settings. */
  public static final ChangeClient create() throws IOException {
    return create(ChangeSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ChangeClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ChangeClient create(ChangeSettings settings) throws IOException {
    return new ChangeClient(settings);
  }

  /**
   * Constructs an instance of ChangeClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use ChangeSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ChangeClient create(ChangeStub stub) {
    return new ChangeClient(stub);
  }

  /**
   * Constructs an instance of ChangeClient, using the given settings. This is protected so that it
   * is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected ChangeClient(ChangeSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((ChangeStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ChangeClient(ChangeStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ChangeSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ChangeStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Atomically update the ResourceRecordSet collection.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ChangeClient changeClient = ChangeClient.create()) {
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   Change changeResource = Change.newBuilder().build();
   *   Change response = changeClient.createChange(managedZone, changeResource);
   * }
   * </code></pre>
   *
   * @param managedZone Identifies the managed zone addressed by this request. Can be the managed
   *     zone name or id.
   * @param changeResource A Change represents a set of ResourceRecordSet additions and deletions
   *     applied atomically to a ManagedZone. ResourceRecordSets within a ManagedZone are modified
   *     by creating a new Change element in the Changes collection. In turn the Changes collection
   *     also records the past modifications to the ResourceRecordSets in a ManagedZone. The current
   *     state of the ManagedZone is the sum effect of applying all Change elements in the Changes
   *     collection in sequence.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Change createChange(ProjectManagedZoneName managedZone, Change changeResource) {
    CreateChangeHttpRequest request =
        CreateChangeHttpRequest.newBuilder()
            .setManagedZone(managedZone == null ? null : managedZone.toString())
            .setChangeResource(changeResource)
            .build();
    return createChange(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Atomically update the ResourceRecordSet collection.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ChangeClient changeClient = ChangeClient.create()) {
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   Change changeResource = Change.newBuilder().build();
   *   Change response = changeClient.createChange(managedZone.toString(), changeResource);
   * }
   * </code></pre>
   *
   * @param managedZone Identifies the managed zone addressed by this request. Can be the managed
   *     zone name or id.
   * @param changeResource A Change represents a set of ResourceRecordSet additions and deletions
   *     applied atomically to a ManagedZone. ResourceRecordSets within a ManagedZone are modified
   *     by creating a new Change element in the Changes collection. In turn the Changes collection
   *     also records the past modifications to the ResourceRecordSets in a ManagedZone. The current
   *     state of the ManagedZone is the sum effect of applying all Change elements in the Changes
   *     collection in sequence.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Change createChange(String managedZone, Change changeResource) {
    CreateChangeHttpRequest request =
        CreateChangeHttpRequest.newBuilder()
            .setManagedZone(managedZone)
            .setChangeResource(changeResource)
            .build();
    return createChange(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Atomically update the ResourceRecordSet collection.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ChangeClient changeClient = ChangeClient.create()) {
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   Change changeResource = Change.newBuilder().build();
   *   CreateChangeHttpRequest request = CreateChangeHttpRequest.newBuilder()
   *     .setManagedZone(formattedManagedZone)
   *     .setChangeResource(changeResource)
   *     .build();
   *   Change response = changeClient.createChange(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Change createChange(CreateChangeHttpRequest request) {
    return createChangeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Atomically update the ResourceRecordSet collection.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ChangeClient changeClient = ChangeClient.create()) {
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   Change changeResource = Change.newBuilder().build();
   *   CreateChangeHttpRequest request = CreateChangeHttpRequest.newBuilder()
   *     .setManagedZone(formattedManagedZone)
   *     .setChangeResource(changeResource)
   *     .build();
   *   ApiFuture&lt;Change&gt; future = changeClient.createChangeCallable().futureCall(request);
   *   // Do something
   *   Change response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<CreateChangeHttpRequest, Change> createChangeCallable() {
    return stub.createChangeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing Change.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ChangeClient changeClient = ChangeClient.create()) {
   *   ProjectManagedZoneChangeChangeIdName changeId = ProjectManagedZoneChangeChangeIdName.of("[PROJECT]", "[MANAGED_ZONE]", "[CHANGE_ID]");
   *   Change response = changeClient.getChange(changeId);
   * }
   * </code></pre>
   *
   * @param changeId The identifier of the requested change, from a previous
   *     ResourceRecordSetsChangeResponse.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Change getChange(ProjectManagedZoneChangeChangeIdName changeId) {
    GetChangeHttpRequest request =
        GetChangeHttpRequest.newBuilder()
            .setChangeId(changeId == null ? null : changeId.toString())
            .build();
    return getChange(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing Change.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ChangeClient changeClient = ChangeClient.create()) {
   *   ProjectManagedZoneChangeChangeIdName changeId = ProjectManagedZoneChangeChangeIdName.of("[PROJECT]", "[MANAGED_ZONE]", "[CHANGE_ID]");
   *   Change response = changeClient.getChange(changeId.toString());
   * }
   * </code></pre>
   *
   * @param changeId The identifier of the requested change, from a previous
   *     ResourceRecordSetsChangeResponse.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Change getChange(String changeId) {
    GetChangeHttpRequest request = GetChangeHttpRequest.newBuilder().setChangeId(changeId).build();
    return getChange(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing Change.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ChangeClient changeClient = ChangeClient.create()) {
   *   String formattedChangeId = ProjectManagedZoneChangeChangeIdName.format("[PROJECT]", "[MANAGED_ZONE]", "[CHANGE_ID]");
   *   GetChangeHttpRequest request = GetChangeHttpRequest.newBuilder()
   *     .setChangeId(formattedChangeId)
   *     .build();
   *   Change response = changeClient.getChange(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Change getChange(GetChangeHttpRequest request) {
    return getChangeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing Change.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ChangeClient changeClient = ChangeClient.create()) {
   *   String formattedChangeId = ProjectManagedZoneChangeChangeIdName.format("[PROJECT]", "[MANAGED_ZONE]", "[CHANGE_ID]");
   *   GetChangeHttpRequest request = GetChangeHttpRequest.newBuilder()
   *     .setChangeId(formattedChangeId)
   *     .build();
   *   ApiFuture&lt;Change&gt; future = changeClient.getChangeCallable().futureCall(request);
   *   // Do something
   *   Change response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetChangeHttpRequest, Change> getChangeCallable() {
    return stub.getChangeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate Changes to a ResourceRecordSet collection.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ChangeClient changeClient = ChangeClient.create()) {
   *   String sortOrder = "";
   *   String sortBy = "";
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   for (Change element : changeClient.listChanges(sortOrder, sortBy, managedZone).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param sortOrder Sorting order direction: 'ascending' or 'descending'.
   * @param sortBy Sorting criterion. The only supported value is change sequence.
   * @param managedZone Identifies the managed zone addressed by this request. Can be the managed
   *     zone name or id.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListChangesPagedResponse listChanges(
      String sortOrder, String sortBy, ProjectManagedZoneName managedZone) {
    ListChangesHttpRequest request =
        ListChangesHttpRequest.newBuilder()
            .setSortOrder(sortOrder)
            .setSortBy(sortBy)
            .setManagedZone(managedZone == null ? null : managedZone.toString())
            .build();
    return listChanges(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate Changes to a ResourceRecordSet collection.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ChangeClient changeClient = ChangeClient.create()) {
   *   String sortOrder = "";
   *   String sortBy = "";
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   for (Change element : changeClient.listChanges(sortOrder, sortBy, managedZone.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param sortOrder Sorting order direction: 'ascending' or 'descending'.
   * @param sortBy Sorting criterion. The only supported value is change sequence.
   * @param managedZone Identifies the managed zone addressed by this request. Can be the managed
   *     zone name or id.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListChangesPagedResponse listChanges(
      String sortOrder, String sortBy, String managedZone) {
    ListChangesHttpRequest request =
        ListChangesHttpRequest.newBuilder()
            .setSortOrder(sortOrder)
            .setSortBy(sortBy)
            .setManagedZone(managedZone)
            .build();
    return listChanges(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate Changes to a ResourceRecordSet collection.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ChangeClient changeClient = ChangeClient.create()) {
   *   String sortOrder = "";
   *   String sortBy = "";
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   ListChangesHttpRequest request = ListChangesHttpRequest.newBuilder()
   *     .setSortOrder(sortOrder)
   *     .setSortBy(sortBy)
   *     .setManagedZone(formattedManagedZone)
   *     .build();
   *   for (Change element : changeClient.listChanges(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListChangesPagedResponse listChanges(ListChangesHttpRequest request) {
    return listChangesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate Changes to a ResourceRecordSet collection.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ChangeClient changeClient = ChangeClient.create()) {
   *   String sortOrder = "";
   *   String sortBy = "";
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   ListChangesHttpRequest request = ListChangesHttpRequest.newBuilder()
   *     .setSortOrder(sortOrder)
   *     .setSortBy(sortBy)
   *     .setManagedZone(formattedManagedZone)
   *     .build();
   *   ApiFuture&lt;ListChangesPagedResponse&gt; future = changeClient.listChangesPagedCallable().futureCall(request);
   *   // Do something
   *   for (Change element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListChangesHttpRequest, ListChangesPagedResponse>
      listChangesPagedCallable() {
    return stub.listChangesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate Changes to a ResourceRecordSet collection.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ChangeClient changeClient = ChangeClient.create()) {
   *   String sortOrder = "";
   *   String sortBy = "";
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   ListChangesHttpRequest request = ListChangesHttpRequest.newBuilder()
   *     .setSortOrder(sortOrder)
   *     .setSortBy(sortBy)
   *     .setManagedZone(formattedManagedZone)
   *     .build();
   *   while (true) {
   *     ChangesListResponse response = changeClient.listChangesCallable().call(request);
   *     for (Change element : response.getChangesList()) {
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
  public final UnaryCallable<ListChangesHttpRequest, ChangesListResponse> listChangesCallable() {
    return stub.listChangesCallable();
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

  public static class ListChangesPagedResponse
      extends AbstractPagedListResponse<
          ListChangesHttpRequest,
          ChangesListResponse,
          Change,
          ListChangesPage,
          ListChangesFixedSizeCollection> {

    public static ApiFuture<ListChangesPagedResponse> createAsync(
        PageContext<ListChangesHttpRequest, ChangesListResponse, Change> context,
        ApiFuture<ChangesListResponse> futureResponse) {
      ApiFuture<ListChangesPage> futurePage =
          ListChangesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListChangesPage, ListChangesPagedResponse>() {
            @Override
            public ListChangesPagedResponse apply(ListChangesPage input) {
              return new ListChangesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListChangesPagedResponse(ListChangesPage page) {
      super(page, ListChangesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListChangesPage
      extends AbstractPage<ListChangesHttpRequest, ChangesListResponse, Change, ListChangesPage> {

    private ListChangesPage(
        PageContext<ListChangesHttpRequest, ChangesListResponse, Change> context,
        ChangesListResponse response) {
      super(context, response);
    }

    private static ListChangesPage createEmptyPage() {
      return new ListChangesPage(null, null);
    }

    @Override
    protected ListChangesPage createPage(
        PageContext<ListChangesHttpRequest, ChangesListResponse, Change> context,
        ChangesListResponse response) {
      return new ListChangesPage(context, response);
    }

    @Override
    public ApiFuture<ListChangesPage> createPageAsync(
        PageContext<ListChangesHttpRequest, ChangesListResponse, Change> context,
        ApiFuture<ChangesListResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListChangesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListChangesHttpRequest,
          ChangesListResponse,
          Change,
          ListChangesPage,
          ListChangesFixedSizeCollection> {

    private ListChangesFixedSizeCollection(List<ListChangesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListChangesFixedSizeCollection createEmptyCollection() {
      return new ListChangesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListChangesFixedSizeCollection createCollection(
        List<ListChangesPage> pages, int collectionSize) {
      return new ListChangesFixedSizeCollection(pages, collectionSize);
    }
  }
}
