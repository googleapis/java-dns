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
import com.google.cloud.dns.v1.stub.ResourceRecordSetStub;
import com.google.cloud.dns.v1.stub.ResourceRecordSetStubSettings;
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
 * try (ResourceRecordSetClient resourceRecordSetClient = ResourceRecordSetClient.create()) {
 *   String name = "";
 *   String type = "";
 *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
 *   for (ResourceRecordSet element : resourceRecordSetClient.listResourceRecordSets(name, type, managedZone).iterateAll()) {
 *     // doThingsWith(element);
 *   }
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the resourceRecordSetClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
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
 * <p>This class can be customized by passing in a custom instance of ResourceRecordSetSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * ResourceRecordSetSettings resourceRecordSetSettings =
 *     ResourceRecordSetSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ResourceRecordSetClient resourceRecordSetClient =
 *     ResourceRecordSetClient.create(resourceRecordSetSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ResourceRecordSetSettings resourceRecordSetSettings =
 *     ResourceRecordSetSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ResourceRecordSetClient resourceRecordSetClient =
 *     ResourceRecordSetClient.create(resourceRecordSetSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ResourceRecordSetClient implements BackgroundResource {
  private final ResourceRecordSetSettings settings;
  private final ResourceRecordSetStub stub;

  /** Constructs an instance of ResourceRecordSetClient with default settings. */
  public static final ResourceRecordSetClient create() throws IOException {
    return create(ResourceRecordSetSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ResourceRecordSetClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ResourceRecordSetClient create(ResourceRecordSetSettings settings)
      throws IOException {
    return new ResourceRecordSetClient(settings);
  }

  /**
   * Constructs an instance of ResourceRecordSetClient, using the given stub for making calls. This
   * is for advanced usage - prefer to use ResourceRecordSetSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ResourceRecordSetClient create(ResourceRecordSetStub stub) {
    return new ResourceRecordSetClient(stub);
  }

  /**
   * Constructs an instance of ResourceRecordSetClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected ResourceRecordSetClient(ResourceRecordSetSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((ResourceRecordSetStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ResourceRecordSetClient(ResourceRecordSetStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ResourceRecordSetSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ResourceRecordSetStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate ResourceRecordSets that have been created but not yet deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ResourceRecordSetClient resourceRecordSetClient = ResourceRecordSetClient.create()) {
   *   String name = "";
   *   String type = "";
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   for (ResourceRecordSet element : resourceRecordSetClient.listResourceRecordSets(name, type, managedZone).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param name Restricts the list to return only records with this fully qualified domain name.
   * @param type Restricts the list to return only records of this type. If present, the "name"
   *     parameter must also be present.
   * @param managedZone Identifies the managed zone addressed by this request. Can be the managed
   *     zone name or id.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListResourceRecordSetsPagedResponse listResourceRecordSets(
      String name, String type, ProjectManagedZoneName managedZone) {
    ListResourceRecordSetsHttpRequest request =
        ListResourceRecordSetsHttpRequest.newBuilder()
            .setName(name)
            .setType(type)
            .setManagedZone(managedZone == null ? null : managedZone.toString())
            .build();
    return listResourceRecordSets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate ResourceRecordSets that have been created but not yet deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ResourceRecordSetClient resourceRecordSetClient = ResourceRecordSetClient.create()) {
   *   String name = "";
   *   String type = "";
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   for (ResourceRecordSet element : resourceRecordSetClient.listResourceRecordSets(name, type, managedZone.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param name Restricts the list to return only records with this fully qualified domain name.
   * @param type Restricts the list to return only records of this type. If present, the "name"
   *     parameter must also be present.
   * @param managedZone Identifies the managed zone addressed by this request. Can be the managed
   *     zone name or id.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListResourceRecordSetsPagedResponse listResourceRecordSets(
      String name, String type, String managedZone) {
    ListResourceRecordSetsHttpRequest request =
        ListResourceRecordSetsHttpRequest.newBuilder()
            .setName(name)
            .setType(type)
            .setManagedZone(managedZone)
            .build();
    return listResourceRecordSets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate ResourceRecordSets that have been created but not yet deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ResourceRecordSetClient resourceRecordSetClient = ResourceRecordSetClient.create()) {
   *   String name = "";
   *   String type = "";
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   ListResourceRecordSetsHttpRequest request = ListResourceRecordSetsHttpRequest.newBuilder()
   *     .setName(name)
   *     .setType(type)
   *     .setManagedZone(formattedManagedZone)
   *     .build();
   *   for (ResourceRecordSet element : resourceRecordSetClient.listResourceRecordSets(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListResourceRecordSetsPagedResponse listResourceRecordSets(
      ListResourceRecordSetsHttpRequest request) {
    return listResourceRecordSetsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate ResourceRecordSets that have been created but not yet deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ResourceRecordSetClient resourceRecordSetClient = ResourceRecordSetClient.create()) {
   *   String name = "";
   *   String type = "";
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   ListResourceRecordSetsHttpRequest request = ListResourceRecordSetsHttpRequest.newBuilder()
   *     .setName(name)
   *     .setType(type)
   *     .setManagedZone(formattedManagedZone)
   *     .build();
   *   ApiFuture&lt;ListResourceRecordSetsPagedResponse&gt; future = resourceRecordSetClient.listResourceRecordSetsPagedCallable().futureCall(request);
   *   // Do something
   *   for (ResourceRecordSet element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListResourceRecordSetsHttpRequest, ListResourceRecordSetsPagedResponse>
      listResourceRecordSetsPagedCallable() {
    return stub.listResourceRecordSetsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate ResourceRecordSets that have been created but not yet deleted.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ResourceRecordSetClient resourceRecordSetClient = ResourceRecordSetClient.create()) {
   *   String name = "";
   *   String type = "";
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   ListResourceRecordSetsHttpRequest request = ListResourceRecordSetsHttpRequest.newBuilder()
   *     .setName(name)
   *     .setType(type)
   *     .setManagedZone(formattedManagedZone)
   *     .build();
   *   while (true) {
   *     ResourceRecordSetsListResponse response = resourceRecordSetClient.listResourceRecordSetsCallable().call(request);
   *     for (ResourceRecordSet element : response.getRrsetsList()) {
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
  public final UnaryCallable<ListResourceRecordSetsHttpRequest, ResourceRecordSetsListResponse>
      listResourceRecordSetsCallable() {
    return stub.listResourceRecordSetsCallable();
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

  public static class ListResourceRecordSetsPagedResponse
      extends AbstractPagedListResponse<
          ListResourceRecordSetsHttpRequest,
          ResourceRecordSetsListResponse,
          ResourceRecordSet,
          ListResourceRecordSetsPage,
          ListResourceRecordSetsFixedSizeCollection> {

    public static ApiFuture<ListResourceRecordSetsPagedResponse> createAsync(
        PageContext<
                ListResourceRecordSetsHttpRequest,
                ResourceRecordSetsListResponse,
                ResourceRecordSet>
            context,
        ApiFuture<ResourceRecordSetsListResponse> futureResponse) {
      ApiFuture<ListResourceRecordSetsPage> futurePage =
          ListResourceRecordSetsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListResourceRecordSetsPage, ListResourceRecordSetsPagedResponse>() {
            @Override
            public ListResourceRecordSetsPagedResponse apply(ListResourceRecordSetsPage input) {
              return new ListResourceRecordSetsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListResourceRecordSetsPagedResponse(ListResourceRecordSetsPage page) {
      super(page, ListResourceRecordSetsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListResourceRecordSetsPage
      extends AbstractPage<
          ListResourceRecordSetsHttpRequest,
          ResourceRecordSetsListResponse,
          ResourceRecordSet,
          ListResourceRecordSetsPage> {

    private ListResourceRecordSetsPage(
        PageContext<
                ListResourceRecordSetsHttpRequest,
                ResourceRecordSetsListResponse,
                ResourceRecordSet>
            context,
        ResourceRecordSetsListResponse response) {
      super(context, response);
    }

    private static ListResourceRecordSetsPage createEmptyPage() {
      return new ListResourceRecordSetsPage(null, null);
    }

    @Override
    protected ListResourceRecordSetsPage createPage(
        PageContext<
                ListResourceRecordSetsHttpRequest,
                ResourceRecordSetsListResponse,
                ResourceRecordSet>
            context,
        ResourceRecordSetsListResponse response) {
      return new ListResourceRecordSetsPage(context, response);
    }

    @Override
    public ApiFuture<ListResourceRecordSetsPage> createPageAsync(
        PageContext<
                ListResourceRecordSetsHttpRequest,
                ResourceRecordSetsListResponse,
                ResourceRecordSet>
            context,
        ApiFuture<ResourceRecordSetsListResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListResourceRecordSetsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListResourceRecordSetsHttpRequest,
          ResourceRecordSetsListResponse,
          ResourceRecordSet,
          ListResourceRecordSetsPage,
          ListResourceRecordSetsFixedSizeCollection> {

    private ListResourceRecordSetsFixedSizeCollection(
        List<ListResourceRecordSetsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListResourceRecordSetsFixedSizeCollection createEmptyCollection() {
      return new ListResourceRecordSetsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListResourceRecordSetsFixedSizeCollection createCollection(
        List<ListResourceRecordSetsPage> pages, int collectionSize) {
      return new ListResourceRecordSetsFixedSizeCollection(pages, collectionSize);
    }
  }
}
