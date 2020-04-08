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

import static com.google.cloud.dns.v1.DnsKeyClient.ListDnsKeysPagedResponse;

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
import com.google.cloud.dns.v1.DnsKey;
import com.google.cloud.dns.v1.DnsKeysListResponse;
import com.google.cloud.dns.v1.GetDnsKeyHttpRequest;
import com.google.cloud.dns.v1.ListDnsKeysHttpRequest;
import com.google.cloud.dns.v1.ProjectManagedZoneDnsKeyDnsKeyIdName;
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
public class HttpJsonDnsKeyStub extends DnsKeyStub {
  @InternalApi
  public static final ApiMethodDescriptor<GetDnsKeyHttpRequest, DnsKey> getDnsKeyMethodDescriptor =
      ApiMethodDescriptor.<GetDnsKeyHttpRequest, DnsKey>newBuilder()
          .setFullMethodName("dns.dnsKeys.get")
          .setHttpMethod(HttpMethods.GET)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<GetDnsKeyHttpRequest>newBuilder()
                  .setPathTemplate(
                      PathTemplate.create(
                          "{project}/managedZones/{managedZone}/dnsKeys/{dnsKeyId}"))
                  .setQueryParams(Sets.<String>newHashSet("clientOperationId", "digestType"))
                  .setResourceNameFactory(ProjectManagedZoneDnsKeyDnsKeyIdName.newFactory())
                  .setResourceNameField("dnsKeyId")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<DnsKey>newBuilder()
                  .setResponseInstance(DnsKey.getDefaultInstance())
                  .build())
          .build();

  @InternalApi
  public static final ApiMethodDescriptor<ListDnsKeysHttpRequest, DnsKeysListResponse>
      listDnsKeysMethodDescriptor =
          ApiMethodDescriptor.<ListDnsKeysHttpRequest, DnsKeysListResponse>newBuilder()
              .setFullMethodName("dns.dnsKeys.list")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<ListDnsKeysHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create("{project}/managedZones/{managedZone}/dnsKeys"))
                      .setQueryParams(
                          Sets.<String>newHashSet("digestType", "maxResults", "pageToken"))
                      .setResourceNameFactory(ProjectManagedZoneName.newFactory())
                      .setResourceNameField("managedZone")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<DnsKeysListResponse>newBuilder()
                      .setResponseInstance(DnsKeysListResponse.getDefaultInstance())
                      .build())
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetDnsKeyHttpRequest, DnsKey> getDnsKeyCallable;
  private final UnaryCallable<ListDnsKeysHttpRequest, DnsKeysListResponse> listDnsKeysCallable;
  private final UnaryCallable<ListDnsKeysHttpRequest, ListDnsKeysPagedResponse>
      listDnsKeysPagedCallable;

  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonDnsKeyStub create(DnsKeyStubSettings settings) throws IOException {
    return new HttpJsonDnsKeyStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonDnsKeyStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonDnsKeyStub(DnsKeyStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonDnsKeyStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonDnsKeyStub(
        DnsKeyStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonDnsKeyStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonDnsKeyStub(DnsKeyStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonDnsKeyCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonDnsKeyStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonDnsKeyStub(
      DnsKeyStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<GetDnsKeyHttpRequest, DnsKey> getDnsKeyTransportSettings =
        HttpJsonCallSettings.<GetDnsKeyHttpRequest, DnsKey>newBuilder()
            .setMethodDescriptor(getDnsKeyMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListDnsKeysHttpRequest, DnsKeysListResponse> listDnsKeysTransportSettings =
        HttpJsonCallSettings.<ListDnsKeysHttpRequest, DnsKeysListResponse>newBuilder()
            .setMethodDescriptor(listDnsKeysMethodDescriptor)
            .build();

    this.getDnsKeyCallable =
        callableFactory.createUnaryCallable(
            getDnsKeyTransportSettings, settings.getDnsKeySettings(), clientContext);
    this.listDnsKeysCallable =
        callableFactory.createUnaryCallable(
            listDnsKeysTransportSettings, settings.listDnsKeysSettings(), clientContext);
    this.listDnsKeysPagedCallable =
        callableFactory.createPagedCallable(
            listDnsKeysTransportSettings, settings.listDnsKeysSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<GetDnsKeyHttpRequest, DnsKey> getDnsKeyCallable() {
    return getDnsKeyCallable;
  }

  @BetaApi
  public UnaryCallable<ListDnsKeysHttpRequest, ListDnsKeysPagedResponse>
      listDnsKeysPagedCallable() {
    return listDnsKeysPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListDnsKeysHttpRequest, DnsKeysListResponse> listDnsKeysCallable() {
    return listDnsKeysCallable;
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
