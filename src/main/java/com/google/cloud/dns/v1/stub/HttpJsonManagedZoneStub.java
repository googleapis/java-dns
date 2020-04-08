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

import static com.google.cloud.dns.v1.ManagedZoneClient.ListManagedZonesPagedResponse;

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
import com.google.cloud.dns.v1.CreateManagedZoneHttpRequest;
import com.google.cloud.dns.v1.DeleteManagedZoneHttpRequest;
import com.google.cloud.dns.v1.GetManagedZoneHttpRequest;
import com.google.cloud.dns.v1.ListManagedZonesHttpRequest;
import com.google.cloud.dns.v1.ManagedZone;
import com.google.cloud.dns.v1.ManagedZonesListResponse;
import com.google.cloud.dns.v1.Operation;
import com.google.cloud.dns.v1.PatchManagedZoneHttpRequest;
import com.google.cloud.dns.v1.ProjectManagedZoneName;
import com.google.cloud.dns.v1.ProjectName;
import com.google.cloud.dns.v1.UpdateManagedZoneHttpRequest;
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
public class HttpJsonManagedZoneStub extends ManagedZoneStub {
  @InternalApi
  public static final ApiMethodDescriptor<CreateManagedZoneHttpRequest, ManagedZone>
      createManagedZoneMethodDescriptor =
          ApiMethodDescriptor.<CreateManagedZoneHttpRequest, ManagedZone>newBuilder()
              .setFullMethodName("dns.managedZones.create")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<CreateManagedZoneHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/managedZones"))
                      .setQueryParams(Sets.<String>newHashSet("clientOperationId"))
                      .setResourceNameFactory(ProjectName.newFactory())
                      .setResourceNameField("project")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<ManagedZone>newBuilder()
                      .setResponseInstance(ManagedZone.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<DeleteManagedZoneHttpRequest, Void>
      deleteManagedZoneMethodDescriptor =
          ApiMethodDescriptor.<DeleteManagedZoneHttpRequest, Void>newBuilder()
              .setFullMethodName("dns.managedZones.delete")
              .setHttpMethod(HttpMethods.DELETE)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<DeleteManagedZoneHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/managedZones/{managedZone}"))
                      .setQueryParams(Sets.<String>newHashSet("clientOperationId"))
                      .setResourceNameFactory(ProjectManagedZoneName.newFactory())
                      .setResourceNameField("managedZone")
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<GetManagedZoneHttpRequest, ManagedZone>
      getManagedZoneMethodDescriptor =
          ApiMethodDescriptor.<GetManagedZoneHttpRequest, ManagedZone>newBuilder()
              .setFullMethodName("dns.managedZones.get")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<GetManagedZoneHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/managedZones/{managedZone}"))
                      .setQueryParams(Sets.<String>newHashSet("clientOperationId"))
                      .setResourceNameFactory(ProjectManagedZoneName.newFactory())
                      .setResourceNameField("managedZone")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<ManagedZone>newBuilder()
                      .setResponseInstance(ManagedZone.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<ListManagedZonesHttpRequest, ManagedZonesListResponse>
      listManagedZonesMethodDescriptor =
          ApiMethodDescriptor.<ListManagedZonesHttpRequest, ManagedZonesListResponse>newBuilder()
              .setFullMethodName("dns.managedZones.list")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<ListManagedZonesHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/managedZones"))
                      .setQueryParams(Sets.<String>newHashSet("dnsName", "maxResults", "pageToken"))
                      .setResourceNameFactory(ProjectName.newFactory())
                      .setResourceNameField("project")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<ManagedZonesListResponse>newBuilder()
                      .setResponseInstance(ManagedZonesListResponse.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<PatchManagedZoneHttpRequest, Operation>
      patchManagedZoneMethodDescriptor =
          ApiMethodDescriptor.<PatchManagedZoneHttpRequest, Operation>newBuilder()
              .setFullMethodName("dns.managedZones.patch")
              .setHttpMethod(HttpMethods.PATCH)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<PatchManagedZoneHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/managedZones/{managedZone}"))
                      .setQueryParams(Sets.<String>newHashSet("clientOperationId"))
                      .setResourceNameFactory(ProjectManagedZoneName.newFactory())
                      .setResourceNameField("managedZone")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<UpdateManagedZoneHttpRequest, Operation>
      updateManagedZoneMethodDescriptor =
          ApiMethodDescriptor.<UpdateManagedZoneHttpRequest, Operation>newBuilder()
              .setFullMethodName("dns.managedZones.update")
              .setHttpMethod(HttpMethods.PUT)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<UpdateManagedZoneHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/managedZones/{managedZone}"))
                      .setQueryParams(Sets.<String>newHashSet("clientOperationId"))
                      .setResourceNameFactory(ProjectManagedZoneName.newFactory())
                      .setResourceNameField("managedZone")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<CreateManagedZoneHttpRequest, ManagedZone> createManagedZoneCallable;
  private final UnaryCallable<DeleteManagedZoneHttpRequest, Void> deleteManagedZoneCallable;
  private final UnaryCallable<GetManagedZoneHttpRequest, ManagedZone> getManagedZoneCallable;
  private final UnaryCallable<ListManagedZonesHttpRequest, ManagedZonesListResponse>
      listManagedZonesCallable;
  private final UnaryCallable<ListManagedZonesHttpRequest, ListManagedZonesPagedResponse>
      listManagedZonesPagedCallable;
  private final UnaryCallable<PatchManagedZoneHttpRequest, Operation> patchManagedZoneCallable;
  private final UnaryCallable<UpdateManagedZoneHttpRequest, Operation> updateManagedZoneCallable;

  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonManagedZoneStub create(ManagedZoneStubSettings settings)
      throws IOException {
    return new HttpJsonManagedZoneStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonManagedZoneStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonManagedZoneStub(ManagedZoneStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonManagedZoneStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonManagedZoneStub(
        ManagedZoneStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonManagedZoneStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonManagedZoneStub(ManagedZoneStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonManagedZoneCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonManagedZoneStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonManagedZoneStub(
      ManagedZoneStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<CreateManagedZoneHttpRequest, ManagedZone>
        createManagedZoneTransportSettings =
            HttpJsonCallSettings.<CreateManagedZoneHttpRequest, ManagedZone>newBuilder()
                .setMethodDescriptor(createManagedZoneMethodDescriptor)
                .build();
    HttpJsonCallSettings<DeleteManagedZoneHttpRequest, Void> deleteManagedZoneTransportSettings =
        HttpJsonCallSettings.<DeleteManagedZoneHttpRequest, Void>newBuilder()
            .setMethodDescriptor(deleteManagedZoneMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetManagedZoneHttpRequest, ManagedZone> getManagedZoneTransportSettings =
        HttpJsonCallSettings.<GetManagedZoneHttpRequest, ManagedZone>newBuilder()
            .setMethodDescriptor(getManagedZoneMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListManagedZonesHttpRequest, ManagedZonesListResponse>
        listManagedZonesTransportSettings =
            HttpJsonCallSettings.<ListManagedZonesHttpRequest, ManagedZonesListResponse>newBuilder()
                .setMethodDescriptor(listManagedZonesMethodDescriptor)
                .build();
    HttpJsonCallSettings<PatchManagedZoneHttpRequest, Operation> patchManagedZoneTransportSettings =
        HttpJsonCallSettings.<PatchManagedZoneHttpRequest, Operation>newBuilder()
            .setMethodDescriptor(patchManagedZoneMethodDescriptor)
            .build();
    HttpJsonCallSettings<UpdateManagedZoneHttpRequest, Operation>
        updateManagedZoneTransportSettings =
            HttpJsonCallSettings.<UpdateManagedZoneHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(updateManagedZoneMethodDescriptor)
                .build();

    this.createManagedZoneCallable =
        callableFactory.createUnaryCallable(
            createManagedZoneTransportSettings,
            settings.createManagedZoneSettings(),
            clientContext);
    this.deleteManagedZoneCallable =
        callableFactory.createUnaryCallable(
            deleteManagedZoneTransportSettings,
            settings.deleteManagedZoneSettings(),
            clientContext);
    this.getManagedZoneCallable =
        callableFactory.createUnaryCallable(
            getManagedZoneTransportSettings, settings.getManagedZoneSettings(), clientContext);
    this.listManagedZonesCallable =
        callableFactory.createUnaryCallable(
            listManagedZonesTransportSettings, settings.listManagedZonesSettings(), clientContext);
    this.listManagedZonesPagedCallable =
        callableFactory.createPagedCallable(
            listManagedZonesTransportSettings, settings.listManagedZonesSettings(), clientContext);
    this.patchManagedZoneCallable =
        callableFactory.createUnaryCallable(
            patchManagedZoneTransportSettings, settings.patchManagedZoneSettings(), clientContext);
    this.updateManagedZoneCallable =
        callableFactory.createUnaryCallable(
            updateManagedZoneTransportSettings,
            settings.updateManagedZoneSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<CreateManagedZoneHttpRequest, ManagedZone> createManagedZoneCallable() {
    return createManagedZoneCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteManagedZoneHttpRequest, Void> deleteManagedZoneCallable() {
    return deleteManagedZoneCallable;
  }

  @BetaApi
  public UnaryCallable<GetManagedZoneHttpRequest, ManagedZone> getManagedZoneCallable() {
    return getManagedZoneCallable;
  }

  @BetaApi
  public UnaryCallable<ListManagedZonesHttpRequest, ListManagedZonesPagedResponse>
      listManagedZonesPagedCallable() {
    return listManagedZonesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListManagedZonesHttpRequest, ManagedZonesListResponse>
      listManagedZonesCallable() {
    return listManagedZonesCallable;
  }

  @BetaApi
  public UnaryCallable<PatchManagedZoneHttpRequest, Operation> patchManagedZoneCallable() {
    return patchManagedZoneCallable;
  }

  @BetaApi
  public UnaryCallable<UpdateManagedZoneHttpRequest, Operation> updateManagedZoneCallable() {
    return updateManagedZoneCallable;
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
