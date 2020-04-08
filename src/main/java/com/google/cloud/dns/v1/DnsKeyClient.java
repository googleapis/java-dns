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
import com.google.cloud.dns.v1.stub.DnsKeyStub;
import com.google.cloud.dns.v1.stub.DnsKeyStubSettings;
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
 * try (DnsKeyClient dnsKeyClient = DnsKeyClient.create()) {
 *   ProjectManagedZoneDnsKeyDnsKeyIdName dnsKeyId = ProjectManagedZoneDnsKeyDnsKeyIdName.of("[PROJECT]", "[MANAGED_ZONE]", "[DNS_KEY_ID]");
 *   DnsKey response = dnsKeyClient.getDnsKey(dnsKeyId);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the dnsKeyClient object to clean up resources such as
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
 * <p>This class can be customized by passing in a custom instance of DnsKeySettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * DnsKeySettings dnsKeySettings =
 *     DnsKeySettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * DnsKeyClient dnsKeyClient =
 *     DnsKeyClient.create(dnsKeySettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * DnsKeySettings dnsKeySettings =
 *     DnsKeySettings.newBuilder().setEndpoint(myEndpoint).build();
 * DnsKeyClient dnsKeyClient =
 *     DnsKeyClient.create(dnsKeySettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class DnsKeyClient implements BackgroundResource {
  private final DnsKeySettings settings;
  private final DnsKeyStub stub;

  /** Constructs an instance of DnsKeyClient with default settings. */
  public static final DnsKeyClient create() throws IOException {
    return create(DnsKeySettings.newBuilder().build());
  }

  /**
   * Constructs an instance of DnsKeyClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final DnsKeyClient create(DnsKeySettings settings) throws IOException {
    return new DnsKeyClient(settings);
  }

  /**
   * Constructs an instance of DnsKeyClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use DnsKeySettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final DnsKeyClient create(DnsKeyStub stub) {
    return new DnsKeyClient(stub);
  }

  /**
   * Constructs an instance of DnsKeyClient, using the given settings. This is protected so that it
   * is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected DnsKeyClient(DnsKeySettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((DnsKeyStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected DnsKeyClient(DnsKeyStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final DnsKeySettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public DnsKeyStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing DnsKey.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DnsKeyClient dnsKeyClient = DnsKeyClient.create()) {
   *   ProjectManagedZoneDnsKeyDnsKeyIdName dnsKeyId = ProjectManagedZoneDnsKeyDnsKeyIdName.of("[PROJECT]", "[MANAGED_ZONE]", "[DNS_KEY_ID]");
   *   DnsKey response = dnsKeyClient.getDnsKey(dnsKeyId);
   * }
   * </code></pre>
   *
   * @param dnsKeyId The identifier of the requested DnsKey.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final DnsKey getDnsKey(ProjectManagedZoneDnsKeyDnsKeyIdName dnsKeyId) {
    GetDnsKeyHttpRequest request =
        GetDnsKeyHttpRequest.newBuilder()
            .setDnsKeyId(dnsKeyId == null ? null : dnsKeyId.toString())
            .build();
    return getDnsKey(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing DnsKey.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DnsKeyClient dnsKeyClient = DnsKeyClient.create()) {
   *   ProjectManagedZoneDnsKeyDnsKeyIdName dnsKeyId = ProjectManagedZoneDnsKeyDnsKeyIdName.of("[PROJECT]", "[MANAGED_ZONE]", "[DNS_KEY_ID]");
   *   DnsKey response = dnsKeyClient.getDnsKey(dnsKeyId.toString());
   * }
   * </code></pre>
   *
   * @param dnsKeyId The identifier of the requested DnsKey.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final DnsKey getDnsKey(String dnsKeyId) {
    GetDnsKeyHttpRequest request = GetDnsKeyHttpRequest.newBuilder().setDnsKeyId(dnsKeyId).build();
    return getDnsKey(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing DnsKey.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DnsKeyClient dnsKeyClient = DnsKeyClient.create()) {
   *   String formattedDnsKeyId = ProjectManagedZoneDnsKeyDnsKeyIdName.format("[PROJECT]", "[MANAGED_ZONE]", "[DNS_KEY_ID]");
   *   GetDnsKeyHttpRequest request = GetDnsKeyHttpRequest.newBuilder()
   *     .setDnsKeyId(formattedDnsKeyId)
   *     .build();
   *   DnsKey response = dnsKeyClient.getDnsKey(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final DnsKey getDnsKey(GetDnsKeyHttpRequest request) {
    return getDnsKeyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing DnsKey.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DnsKeyClient dnsKeyClient = DnsKeyClient.create()) {
   *   String formattedDnsKeyId = ProjectManagedZoneDnsKeyDnsKeyIdName.format("[PROJECT]", "[MANAGED_ZONE]", "[DNS_KEY_ID]");
   *   GetDnsKeyHttpRequest request = GetDnsKeyHttpRequest.newBuilder()
   *     .setDnsKeyId(formattedDnsKeyId)
   *     .build();
   *   ApiFuture&lt;DnsKey&gt; future = dnsKeyClient.getDnsKeyCallable().futureCall(request);
   *   // Do something
   *   DnsKey response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetDnsKeyHttpRequest, DnsKey> getDnsKeyCallable() {
    return stub.getDnsKeyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate DnsKeys to a ResourceRecordSet collection.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DnsKeyClient dnsKeyClient = DnsKeyClient.create()) {
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   for (DnsKey element : dnsKeyClient.listDnsKeys(managedZone).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param managedZone Identifies the managed zone addressed by this request. Can be the managed
   *     zone name or id.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListDnsKeysPagedResponse listDnsKeys(ProjectManagedZoneName managedZone) {
    ListDnsKeysHttpRequest request =
        ListDnsKeysHttpRequest.newBuilder()
            .setManagedZone(managedZone == null ? null : managedZone.toString())
            .build();
    return listDnsKeys(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate DnsKeys to a ResourceRecordSet collection.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DnsKeyClient dnsKeyClient = DnsKeyClient.create()) {
   *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
   *   for (DnsKey element : dnsKeyClient.listDnsKeys(managedZone.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param managedZone Identifies the managed zone addressed by this request. Can be the managed
   *     zone name or id.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListDnsKeysPagedResponse listDnsKeys(String managedZone) {
    ListDnsKeysHttpRequest request =
        ListDnsKeysHttpRequest.newBuilder().setManagedZone(managedZone).build();
    return listDnsKeys(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate DnsKeys to a ResourceRecordSet collection.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DnsKeyClient dnsKeyClient = DnsKeyClient.create()) {
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   ListDnsKeysHttpRequest request = ListDnsKeysHttpRequest.newBuilder()
   *     .setManagedZone(formattedManagedZone)
   *     .build();
   *   for (DnsKey element : dnsKeyClient.listDnsKeys(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListDnsKeysPagedResponse listDnsKeys(ListDnsKeysHttpRequest request) {
    return listDnsKeysPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate DnsKeys to a ResourceRecordSet collection.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DnsKeyClient dnsKeyClient = DnsKeyClient.create()) {
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   ListDnsKeysHttpRequest request = ListDnsKeysHttpRequest.newBuilder()
   *     .setManagedZone(formattedManagedZone)
   *     .build();
   *   ApiFuture&lt;ListDnsKeysPagedResponse&gt; future = dnsKeyClient.listDnsKeysPagedCallable().futureCall(request);
   *   // Do something
   *   for (DnsKey element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListDnsKeysHttpRequest, ListDnsKeysPagedResponse>
      listDnsKeysPagedCallable() {
    return stub.listDnsKeysPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate DnsKeys to a ResourceRecordSet collection.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (DnsKeyClient dnsKeyClient = DnsKeyClient.create()) {
   *   String formattedManagedZone = ProjectManagedZoneName.format("[PROJECT]", "[MANAGED_ZONE]");
   *   ListDnsKeysHttpRequest request = ListDnsKeysHttpRequest.newBuilder()
   *     .setManagedZone(formattedManagedZone)
   *     .build();
   *   while (true) {
   *     DnsKeysListResponse response = dnsKeyClient.listDnsKeysCallable().call(request);
   *     for (DnsKey element : response.getDnsKeysList()) {
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
  public final UnaryCallable<ListDnsKeysHttpRequest, DnsKeysListResponse> listDnsKeysCallable() {
    return stub.listDnsKeysCallable();
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

  public static class ListDnsKeysPagedResponse
      extends AbstractPagedListResponse<
          ListDnsKeysHttpRequest,
          DnsKeysListResponse,
          DnsKey,
          ListDnsKeysPage,
          ListDnsKeysFixedSizeCollection> {

    public static ApiFuture<ListDnsKeysPagedResponse> createAsync(
        PageContext<ListDnsKeysHttpRequest, DnsKeysListResponse, DnsKey> context,
        ApiFuture<DnsKeysListResponse> futureResponse) {
      ApiFuture<ListDnsKeysPage> futurePage =
          ListDnsKeysPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListDnsKeysPage, ListDnsKeysPagedResponse>() {
            @Override
            public ListDnsKeysPagedResponse apply(ListDnsKeysPage input) {
              return new ListDnsKeysPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListDnsKeysPagedResponse(ListDnsKeysPage page) {
      super(page, ListDnsKeysFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListDnsKeysPage
      extends AbstractPage<ListDnsKeysHttpRequest, DnsKeysListResponse, DnsKey, ListDnsKeysPage> {

    private ListDnsKeysPage(
        PageContext<ListDnsKeysHttpRequest, DnsKeysListResponse, DnsKey> context,
        DnsKeysListResponse response) {
      super(context, response);
    }

    private static ListDnsKeysPage createEmptyPage() {
      return new ListDnsKeysPage(null, null);
    }

    @Override
    protected ListDnsKeysPage createPage(
        PageContext<ListDnsKeysHttpRequest, DnsKeysListResponse, DnsKey> context,
        DnsKeysListResponse response) {
      return new ListDnsKeysPage(context, response);
    }

    @Override
    public ApiFuture<ListDnsKeysPage> createPageAsync(
        PageContext<ListDnsKeysHttpRequest, DnsKeysListResponse, DnsKey> context,
        ApiFuture<DnsKeysListResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListDnsKeysFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListDnsKeysHttpRequest,
          DnsKeysListResponse,
          DnsKey,
          ListDnsKeysPage,
          ListDnsKeysFixedSizeCollection> {

    private ListDnsKeysFixedSizeCollection(List<ListDnsKeysPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListDnsKeysFixedSizeCollection createEmptyCollection() {
      return new ListDnsKeysFixedSizeCollection(null, 0);
    }

    @Override
    protected ListDnsKeysFixedSizeCollection createCollection(
        List<ListDnsKeysPage> pages, int collectionSize) {
      return new ListDnsKeysFixedSizeCollection(pages, collectionSize);
    }
  }
}
