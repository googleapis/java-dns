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

import static com.google.cloud.dns.v1.ChangeClient.ListChangesPagedResponse;

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
import com.google.cloud.dns.v1.Change;
import com.google.cloud.dns.v1.ChangesListResponse;
import com.google.cloud.dns.v1.CreateChangeHttpRequest;
import com.google.cloud.dns.v1.GetChangeHttpRequest;
import com.google.cloud.dns.v1.ListChangesHttpRequest;
import com.google.cloud.dns.v1.ProjectManagedZoneChangeChangeIdName;
import com.google.cloud.dns.v1.ProjectManagedZoneName;
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
public class HttpJsonChangeStub extends ChangeStub {
  @InternalApi
  public static final ApiMethodDescriptor<CreateChangeHttpRequest, Change>
      createChangeMethodDescriptor =
          ApiMethodDescriptor.<CreateChangeHttpRequest, Change>newBuilder()
              .setFullMethodName("dns.changes.create")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<CreateChangeHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create("{project}/managedZones/{managedZone}/changes"))
                      .setQueryParams(Sets.<String>newHashSet("clientOperationId"))
                      .setResourceNameFactory(ProjectManagedZoneName.newFactory())
                      .setResourceNameField("managedZone")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Change>newBuilder()
                      .setResponseInstance(Change.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<GetChangeHttpRequest, Change> getChangeMethodDescriptor =
      ApiMethodDescriptor.<GetChangeHttpRequest, Change>newBuilder()
          .setFullMethodName("dns.changes.get")
          .setHttpMethod(HttpMethods.GET)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<GetChangeHttpRequest>newBuilder()
                  .setPathTemplate(
                      PathTemplate.create(
                          "{project}/managedZones/{managedZone}/changes/{changeId}"))
                  .setQueryParams(Sets.<String>newHashSet("clientOperationId"))
                  .setResourceNameFactory(ProjectManagedZoneChangeChangeIdName.newFactory())
                  .setResourceNameField("changeId")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Change>newBuilder()
                  .setResponseInstance(Change.getDefaultInstance())
                  .build())
          .build();

  @InternalApi
  public static final ApiMethodDescriptor<ListChangesHttpRequest, ChangesListResponse>
      listChangesMethodDescriptor =
          ApiMethodDescriptor.<ListChangesHttpRequest, ChangesListResponse>newBuilder()
              .setFullMethodName("dns.changes.list")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<ListChangesHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create("{project}/managedZones/{managedZone}/changes"))
                      .setQueryParams(
                          Sets.<String>newHashSet("maxResults", "pageToken", "sortBy", "sortOrder"))
                      .setResourceNameFactory(ProjectManagedZoneName.newFactory())
                      .setResourceNameField("managedZone")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<ChangesListResponse>newBuilder()
                      .setResponseInstance(ChangesListResponse.getDefaultInstance())
                      .build())
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<CreateChangeHttpRequest, Change> createChangeCallable;
  private final UnaryCallable<GetChangeHttpRequest, Change> getChangeCallable;
  private final UnaryCallable<ListChangesHttpRequest, ChangesListResponse> listChangesCallable;
  private final UnaryCallable<ListChangesHttpRequest, ListChangesPagedResponse>
      listChangesPagedCallable;

  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonChangeStub create(ChangeStubSettings settings) throws IOException {
    return new HttpJsonChangeStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonChangeStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonChangeStub(ChangeStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonChangeStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonChangeStub(
        ChangeStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonChangeStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonChangeStub(ChangeStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonChangeCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonChangeStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonChangeStub(
      ChangeStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<CreateChangeHttpRequest, Change> createChangeTransportSettings =
        HttpJsonCallSettings.<CreateChangeHttpRequest, Change>newBuilder()
            .setMethodDescriptor(createChangeMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetChangeHttpRequest, Change> getChangeTransportSettings =
        HttpJsonCallSettings.<GetChangeHttpRequest, Change>newBuilder()
            .setMethodDescriptor(getChangeMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListChangesHttpRequest, ChangesListResponse> listChangesTransportSettings =
        HttpJsonCallSettings.<ListChangesHttpRequest, ChangesListResponse>newBuilder()
            .setMethodDescriptor(listChangesMethodDescriptor)
            .build();

    this.createChangeCallable =
        callableFactory.createUnaryCallable(
            createChangeTransportSettings, settings.createChangeSettings(), clientContext);
    this.getChangeCallable =
        callableFactory.createUnaryCallable(
            getChangeTransportSettings, settings.getChangeSettings(), clientContext);
    this.listChangesCallable =
        callableFactory.createUnaryCallable(
            listChangesTransportSettings, settings.listChangesSettings(), clientContext);
    this.listChangesPagedCallable =
        callableFactory.createPagedCallable(
            listChangesTransportSettings, settings.listChangesSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<CreateChangeHttpRequest, Change> createChangeCallable() {
    return createChangeCallable;
  }

  @BetaApi
  public UnaryCallable<GetChangeHttpRequest, Change> getChangeCallable() {
    return getChangeCallable;
  }

  @BetaApi
  public UnaryCallable<ListChangesHttpRequest, ListChangesPagedResponse>
      listChangesPagedCallable() {
    return listChangesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListChangesHttpRequest, ChangesListResponse> listChangesCallable() {
    return listChangesCallable;
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
