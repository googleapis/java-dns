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
package com.google.cloud.dns.v1.stub;

import static com.google.cloud.dns.v1.ResourceRecordSetClient.ListResourceRecordSetsPagedResponse;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMessageHttpRequestFormatter;
import com.google.api.gax.httpjson.ApiMessageHttpResponseParser;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import com.google.cloud.dns.v1.ListResourceRecordSetsHttpRequest;
import com.google.cloud.dns.v1.ProjectManagedZoneName;
import com.google.cloud.dns.v1.ResourceRecordSetsListResponse;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * HTTP stub implementation for dns.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonResourceRecordSetStub extends ResourceRecordSetStub {
  @InternalApi
  public static final ApiMethodDescriptor<
          ListResourceRecordSetsHttpRequest, ResourceRecordSetsListResponse>
      listResourceRecordSetsMethodDescriptor =
          ApiMethodDescriptor
              .<ListResourceRecordSetsHttpRequest, ResourceRecordSetsListResponse>newBuilder()
              .setFullMethodName("dns.resourceRecordSets.list")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<ListResourceRecordSetsHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create("{project}/managedZones/{managedZone}/rrsets"))
                      .setQueryParams(
                          Sets.<String>newHashSet("maxResults", "name", "pageToken", "type"))
                      .setResourceNameFactory(ProjectManagedZoneName.newFactory())
                      .setResourceNameField("managedZone")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<ResourceRecordSetsListResponse>newBuilder()
                      .setResponseInstance(ResourceRecordSetsListResponse.getDefaultInstance())
                      .build())
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<ListResourceRecordSetsHttpRequest, ResourceRecordSetsListResponse>
      listResourceRecordSetsCallable;
  private final UnaryCallable<
          ListResourceRecordSetsHttpRequest, ListResourceRecordSetsPagedResponse>
      listResourceRecordSetsPagedCallable;

  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonResourceRecordSetStub create(ResourceRecordSetStubSettings settings)
      throws IOException {
    return new HttpJsonResourceRecordSetStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonResourceRecordSetStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonResourceRecordSetStub(
        ResourceRecordSetStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonResourceRecordSetStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonResourceRecordSetStub(
        ResourceRecordSetStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonResourceRecordSetStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonResourceRecordSetStub(
      ResourceRecordSetStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonResourceRecordSetCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonResourceRecordSetStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonResourceRecordSetStub(
      ResourceRecordSetStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<ListResourceRecordSetsHttpRequest, ResourceRecordSetsListResponse>
        listResourceRecordSetsTransportSettings =
            HttpJsonCallSettings
                .<ListResourceRecordSetsHttpRequest, ResourceRecordSetsListResponse>newBuilder()
                .setMethodDescriptor(listResourceRecordSetsMethodDescriptor)
                .build();

    this.listResourceRecordSetsCallable =
        callableFactory.createUnaryCallable(
            listResourceRecordSetsTransportSettings,
            settings.listResourceRecordSetsSettings(),
            clientContext);
    this.listResourceRecordSetsPagedCallable =
        callableFactory.createPagedCallable(
            listResourceRecordSetsTransportSettings,
            settings.listResourceRecordSetsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<ListResourceRecordSetsHttpRequest, ListResourceRecordSetsPagedResponse>
      listResourceRecordSetsPagedCallable() {
    return listResourceRecordSetsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListResourceRecordSetsHttpRequest, ResourceRecordSetsListResponse>
      listResourceRecordSetsCallable() {
    return listResourceRecordSetsCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
