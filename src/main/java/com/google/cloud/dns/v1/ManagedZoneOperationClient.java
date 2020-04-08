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
import com.google.cloud.dns.v1.stub.ManagedZoneOperationStub;
import com.google.cloud.dns.v1.stub.ManagedZoneOperationStubSettings;
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
 * try (ManagedZoneOperationClient managedZoneOperationClient = ManagedZoneOperationClient.create()) {
 *   ProjectManagedZoneOperationName operation = ProjectManagedZoneOperationName.of("[PROJECT]", "[MANAGED_ZONE]", "[OPERATION]");
 *   Operation response = managedZoneOperationClient.getManagedZoneOperation(operation);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the managedZoneOperationClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
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
 * <p>This class can be customized by passing in a custom instance of ManagedZoneOperationSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * ManagedZoneOperationSettings managedZoneOperationSettings =
 *     ManagedZoneOperationSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ManagedZoneOperationClient managedZoneOperationClient =
 *     ManagedZoneOperationClient.create(managedZoneOperationSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ManagedZoneOperationSettings managedZoneOperationSettings =
 *     ManagedZoneOperationSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ManagedZoneOperationClient managedZoneOperationClient =
 *     ManagedZoneOperationClient.create(managedZoneOperationSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ManagedZoneOperationClient implements BackgroundResource {
  private final ManagedZoneOperationSettings settings;
  private final ManagedZoneOperationStub stub;

  /** Constructs an instance of ManagedZoneOperationClient with default settings. */
  public static final ManagedZoneOperationClient create() throws IOException {
    return create(ManagedZoneOperationSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ManagedZoneOperationClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ManagedZoneOperationClient create(ManagedZoneOperationSettings settings)
      throws IOException {
    return new ManagedZoneOperationClient(settings);
  }

  /**
   * Constructs an instance of ManagedZoneOperationClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use ManagedZoneOperationSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ManagedZoneOperationClient create(ManagedZoneOperationStub stub) {
    return new ManagedZoneOperationClient(stub);
  }

  /**
   * Constructs an instance of ManagedZoneOperationClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected ManagedZoneOperationClient(ManagedZoneOperationSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((ManagedZoneOperationStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ManagedZoneOperationClient(ManagedZoneOperationStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ManagedZoneOperationSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ManagedZoneOperationStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing Operation.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneOperationClient managedZoneOperationClient = ManagedZoneOperationClient.create()) {
   *   ProjectManagedZoneOperationName operation = ProjectManagedZoneOperationName.of("[PROJECT]", "[MANAGED_ZONE]", "[OPERATION]");
   *   Operation response = managedZoneOperationClient.getManagedZoneOperation(operation);
   * }
   * </code></pre>
   *
   * @param operation Identifies the operation addressed by this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation getManagedZoneOperation(ProjectManagedZoneOperationName operation) {
    GetManagedZoneOperationHttpRequest request =
        GetManagedZoneOperationHttpRequest.newBuilder()
            .setOperation(operation == null ? null : operation.toString())
            .build();
    return getManagedZoneOperation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing Operation.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneOperationClient managedZoneOperationClient = ManagedZoneOperationClient.create()) {
   *   ProjectManagedZoneOperationName operation = ProjectManagedZoneOperationName.of("[PROJECT]", "[MANAGED_ZONE]", "[OPERATION]");
   *   Operation response = managedZoneOperationClient.getManagedZoneOperation(operation.toString());
   * }
   * </code></pre>
   *
   * @param operation Identifies the operation addressed by this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation getManagedZoneOperation(String operation) {
    GetManagedZoneOperationHttpRequest request =
        GetManagedZoneOperationHttpRequest.newBuilder().setOperation(operation).build();
    return getManagedZoneOperation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing Operation.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneOperationClient managedZoneOperationClient = ManagedZoneOperationClient.create()) {
   *   String formattedOperation = ProjectManagedZoneOperationName.format("[PROJECT]", "[MANAGED_ZONE]", "[OPERATION]");
   *   GetManagedZoneOperationHttpRequest request = GetManagedZoneOperationHttpRequest.newBuilder()
   *     .setOperation(formattedOperation)
   *     .build();
   *   Operation response = managedZoneOperationClient.getManagedZoneOperation(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation getManagedZoneOperation(GetManagedZoneOperationHttpRequest request) {
    return getManagedZoneOperationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing Operation.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneOperationClient managedZoneOperationClient = ManagedZoneOperationClient.create()) {
   *   String formattedOperation = ProjectManagedZoneOperationName.format("[PROJECT]", "[MANAGED_ZONE]", "[OPERATION]");
   *   GetManagedZoneOperationHttpRequest request = GetManagedZoneOperationHttpRequest.newBuilder()
   *     .setOperation(formattedOperation)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = managedZoneOperationClient.getManagedZoneOperationCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetManagedZoneOperationHttpRequest, Operation>
      getManagedZoneOperationCallable() {
    return stub.getManagedZoneOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate Operations for the given ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneOperationClient managedZoneOperationClient = ManagedZoneOperationClient.create()) {
   *   String sortBy = "";
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   for (Operation element : managedZoneOperationClient.listManagedZoneOperations(sortBy, managedZone).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param sortBy Sorting criterion. The only supported values are START_TIME and ID.
   * @param managedZone Identifies the managed zone addressed by this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListManagedZoneOperationsPagedResponse listManagedZoneOperations(
      String sortBy, ProjectManagedZoneName managedZone) {
    ListManagedZoneOperationsHttpRequest request =
        ListManagedZoneOperationsHttpRequest.newBuilder()
            .setSortBy(sortBy)
            .setManagedZone(managedZone == null ? null : managedZone.toString())
            .build();
    return listManagedZoneOperations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate Operations for the given ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneOperationClient managedZoneOperationClient = ManagedZoneOperationClient.create()) {
   *   String sortBy = "";
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   for (Operation element : managedZoneOperationClient.listManagedZoneOperations(sortBy, managedZone.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param sortBy Sorting criterion. The only supported values are START_TIME and ID.
   * @param managedZone Identifies the managed zone addressed by this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListManagedZoneOperationsPagedResponse listManagedZoneOperations(
      String sortBy, String managedZone) {
    ListManagedZoneOperationsHttpRequest request =
        ListManagedZoneOperationsHttpRequest.newBuilder()
            .setSortBy(sortBy)
            .setManagedZone(managedZone)
            .build();
    return listManagedZoneOperations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate Operations for the given ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneOperationClient managedZoneOperationClient = ManagedZoneOperationClient.create()) {
   *   String sortBy = "";
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   ListManagedZoneOperationsHttpRequest request = ListManagedZoneOperationsHttpRequest.newBuilder()
   *     .setSortBy(sortBy)
   *     .setManagedZone(formattedManagedZone)
   *     .build();
   *   for (Operation element : managedZoneOperationClient.listManagedZoneOperations(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListManagedZoneOperationsPagedResponse listManagedZoneOperations(
      ListManagedZoneOperationsHttpRequest request) {
    return listManagedZoneOperationsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate Operations for the given ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneOperationClient managedZoneOperationClient = ManagedZoneOperationClient.create()) {
   *   String sortBy = "";
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   ListManagedZoneOperationsHttpRequest request = ListManagedZoneOperationsHttpRequest.newBuilder()
   *     .setSortBy(sortBy)
   *     .setManagedZone(formattedManagedZone)
   *     .build();
   *   ApiFuture&lt;ListManagedZoneOperationsPagedResponse&gt; future = managedZoneOperationClient.listManagedZoneOperationsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Operation element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<
          ListManagedZoneOperationsHttpRequest, ListManagedZoneOperationsPagedResponse>
      listManagedZoneOperationsPagedCallable() {
    return stub.listManagedZoneOperationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate Operations for the given ManagedZone.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ManagedZoneOperationClient managedZoneOperationClient = ManagedZoneOperationClient.create()) {
   *   String sortBy = "";
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   ListManagedZoneOperationsHttpRequest request = ListManagedZoneOperationsHttpRequest.newBuilder()
   *     .setSortBy(sortBy)
   *     .setManagedZone(formattedManagedZone)
   *     .build();
   *   while (true) {
   *     ManagedZoneOperationsListResponse response = managedZoneOperationClient.listManagedZoneOperationsCallable().call(request);
   *     for (Operation element : response.getOperationsList()) {
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
  public final UnaryCallable<
          ListManagedZoneOperationsHttpRequest, ManagedZoneOperationsListResponse>
      listManagedZoneOperationsCallable() {
    return stub.listManagedZoneOperationsCallable();
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

  public static class ListManagedZoneOperationsPagedResponse
      extends AbstractPagedListResponse<
          ListManagedZoneOperationsHttpRequest,
          ManagedZoneOperationsListResponse,
          Operation,
          ListManagedZoneOperationsPage,
          ListManagedZoneOperationsFixedSizeCollection> {

    public static ApiFuture<ListManagedZoneOperationsPagedResponse> createAsync(
        PageContext<
                ListManagedZoneOperationsHttpRequest, ManagedZoneOperationsListResponse, Operation>
            context,
        ApiFuture<ManagedZoneOperationsListResponse> futureResponse) {
      ApiFuture<ListManagedZoneOperationsPage> futurePage =
          ListManagedZoneOperationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListManagedZoneOperationsPage, ListManagedZoneOperationsPagedResponse>() {
            @Override
            public ListManagedZoneOperationsPagedResponse apply(
                ListManagedZoneOperationsPage input) {
              return new ListManagedZoneOperationsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListManagedZoneOperationsPagedResponse(ListManagedZoneOperationsPage page) {
      super(page, ListManagedZoneOperationsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListManagedZoneOperationsPage
      extends AbstractPage<
          ListManagedZoneOperationsHttpRequest,
          ManagedZoneOperationsListResponse,
          Operation,
          ListManagedZoneOperationsPage> {

    private ListManagedZoneOperationsPage(
        PageContext<
                ListManagedZoneOperationsHttpRequest, ManagedZoneOperationsListResponse, Operation>
            context,
        ManagedZoneOperationsListResponse response) {
      super(context, response);
    }

    private static ListManagedZoneOperationsPage createEmptyPage() {
      return new ListManagedZoneOperationsPage(null, null);
    }

    @Override
    protected ListManagedZoneOperationsPage createPage(
        PageContext<
                ListManagedZoneOperationsHttpRequest, ManagedZoneOperationsListResponse, Operation>
            context,
        ManagedZoneOperationsListResponse response) {
      return new ListManagedZoneOperationsPage(context, response);
    }

    @Override
    public ApiFuture<ListManagedZoneOperationsPage> createPageAsync(
        PageContext<
                ListManagedZoneOperationsHttpRequest, ManagedZoneOperationsListResponse, Operation>
            context,
        ApiFuture<ManagedZoneOperationsListResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListManagedZoneOperationsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListManagedZoneOperationsHttpRequest,
          ManagedZoneOperationsListResponse,
          Operation,
          ListManagedZoneOperationsPage,
          ListManagedZoneOperationsFixedSizeCollection> {

    private ListManagedZoneOperationsFixedSizeCollection(
        List<ListManagedZoneOperationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListManagedZoneOperationsFixedSizeCollection createEmptyCollection() {
      return new ListManagedZoneOperationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListManagedZoneOperationsFixedSizeCollection createCollection(
        List<ListManagedZoneOperationsPage> pages, int collectionSize) {
      return new ListManagedZoneOperationsFixedSizeCollection(pages, collectionSize);
    }
  }
}
