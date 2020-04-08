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

import static com.google.cloud.dns.v1.ManagedZoneOperationClient.ListManagedZoneOperationsPagedResponse;

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
import com.google.cloud.dns.v1.GetManagedZoneOperationHttpRequest;
import com.google.cloud.dns.v1.ListManagedZoneOperationsHttpRequest;
import com.google.cloud.dns.v1.ManagedZoneOperationsListResponse;
import com.google.cloud.dns.v1.Operation;
import com.google.cloud.dns.v1.ProjectManagedZoneName;
import com.google.cloud.dns.v1.ProjectManagedZoneOperationName;
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
public class HttpJsonManagedZoneOperationStub extends ManagedZoneOperationStub {
  @InternalApi
  public static final ApiMethodDescriptor<GetManagedZoneOperationHttpRequest, Operation>
      getManagedZoneOperationMethodDescriptor =
          ApiMethodDescriptor.<GetManagedZoneOperationHttpRequest, Operation>newBuilder()
              .setFullMethodName("dns.managedZoneOperations.get")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<GetManagedZoneOperationHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/managedZones/{managedZone}/operations/{operation}"))
                      .setQueryParams(Sets.<String>newHashSet("clientOperationId"))
                      .setResourceNameFactory(ProjectManagedZoneOperationName.newFactory())
                      .setResourceNameField("operation")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<
          ListManagedZoneOperationsHttpRequest, ManagedZoneOperationsListResponse>
      listManagedZoneOperationsMethodDescriptor =
          ApiMethodDescriptor
              .<ListManagedZoneOperationsHttpRequest, ManagedZoneOperationsListResponse>newBuilder()
              .setFullMethodName("dns.managedZoneOperations.list")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<ListManagedZoneOperationsHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create("{project}/managedZones/{managedZone}/operations"))
                      .setQueryParams(Sets.<String>newHashSet("maxResults", "pageToken", "sortBy"))
                      .setResourceNameFactory(ProjectManagedZoneName.newFactory())
                      .setResourceNameField("managedZone")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<ManagedZoneOperationsListResponse>newBuilder()
                      .setResponseInstance(ManagedZoneOperationsListResponse.getDefaultInstance())
                      .build())
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetManagedZoneOperationHttpRequest, Operation>
      getManagedZoneOperationCallable;
  private final UnaryCallable<
          ListManagedZoneOperationsHttpRequest, ManagedZoneOperationsListResponse>
      listManagedZoneOperationsCallable;
  private final UnaryCallable<
          ListManagedZoneOperationsHttpRequest, ListManagedZoneOperationsPagedResponse>
      listManagedZoneOperationsPagedCallable;

  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonManagedZoneOperationStub create(
      ManagedZoneOperationStubSettings settings) throws IOException {
    return new HttpJsonManagedZoneOperationStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonManagedZoneOperationStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonManagedZoneOperationStub(
        ManagedZoneOperationStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonManagedZoneOperationStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonManagedZoneOperationStub(
        ManagedZoneOperationStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonManagedZoneOperationStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonManagedZoneOperationStub(
      ManagedZoneOperationStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonManagedZoneOperationCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonManagedZoneOperationStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonManagedZoneOperationStub(
      ManagedZoneOperationStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<GetManagedZoneOperationHttpRequest, Operation>
        getManagedZoneOperationTransportSettings =
            HttpJsonCallSettings.<GetManagedZoneOperationHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(getManagedZoneOperationMethodDescriptor)
                .build();
    HttpJsonCallSettings<ListManagedZoneOperationsHttpRequest, ManagedZoneOperationsListResponse>
        listManagedZoneOperationsTransportSettings =
            HttpJsonCallSettings
                .<ListManagedZoneOperationsHttpRequest, ManagedZoneOperationsListResponse>
                    newBuilder()
                .setMethodDescriptor(listManagedZoneOperationsMethodDescriptor)
                .build();

    this.getManagedZoneOperationCallable =
        callableFactory.createUnaryCallable(
            getManagedZoneOperationTransportSettings,
            settings.getManagedZoneOperationSettings(),
            clientContext);
    this.listManagedZoneOperationsCallable =
        callableFactory.createUnaryCallable(
            listManagedZoneOperationsTransportSettings,
            settings.listManagedZoneOperationsSettings(),
            clientContext);
    this.listManagedZoneOperationsPagedCallable =
        callableFactory.createPagedCallable(
            listManagedZoneOperationsTransportSettings,
            settings.listManagedZoneOperationsSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<GetManagedZoneOperationHttpRequest, Operation>
      getManagedZoneOperationCallable() {
    return getManagedZoneOperationCallable;
  }

  @BetaApi
  public UnaryCallable<ListManagedZoneOperationsHttpRequest, ListManagedZoneOperationsPagedResponse>
      listManagedZoneOperationsPagedCallable() {
    return listManagedZoneOperationsPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListManagedZoneOperationsHttpRequest, ManagedZoneOperationsListResponse>
      listManagedZoneOperationsCallable() {
    return listManagedZoneOperationsCallable;
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
