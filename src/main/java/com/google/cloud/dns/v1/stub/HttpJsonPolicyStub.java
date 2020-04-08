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

import static com.google.cloud.dns.v1.PolicyClient.ListPoliciesPagedResponse;

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
import com.google.cloud.dns.v1.CreatePolicyHttpRequest;
import com.google.cloud.dns.v1.DeletePolicyHttpRequest;
import com.google.cloud.dns.v1.GetPolicyHttpRequest;
import com.google.cloud.dns.v1.ListPoliciesHttpRequest;
import com.google.cloud.dns.v1.PatchPolicyHttpRequest;
import com.google.cloud.dns.v1.PoliciesListResponse;
import com.google.cloud.dns.v1.PoliciesPatchResponse;
import com.google.cloud.dns.v1.PoliciesUpdateResponse;
import com.google.cloud.dns.v1.Policy;
import com.google.cloud.dns.v1.ProjectName;
import com.google.cloud.dns.v1.ProjectPolicyName;
import com.google.cloud.dns.v1.UpdatePolicyHttpRequest;
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
public class HttpJsonPolicyStub extends PolicyStub {
  @InternalApi
  public static final ApiMethodDescriptor<CreatePolicyHttpRequest, Policy>
      createPolicyMethodDescriptor =
          ApiMethodDescriptor.<CreatePolicyHttpRequest, Policy>newBuilder()
              .setFullMethodName("dns.policies.create")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<CreatePolicyHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/policies"))
                      .setQueryParams(Sets.<String>newHashSet("clientOperationId"))
                      .setResourceNameFactory(ProjectName.newFactory())
                      .setResourceNameField("project")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Policy>newBuilder()
                      .setResponseInstance(Policy.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<DeletePolicyHttpRequest, Void>
      deletePolicyMethodDescriptor =
          ApiMethodDescriptor.<DeletePolicyHttpRequest, Void>newBuilder()
              .setFullMethodName("dns.policies.delete")
              .setHttpMethod(HttpMethods.DELETE)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<DeletePolicyHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/policies/{policy}"))
                      .setQueryParams(Sets.<String>newHashSet("clientOperationId"))
                      .setResourceNameFactory(ProjectPolicyName.newFactory())
                      .setResourceNameField("policy")
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<GetPolicyHttpRequest, Policy> getPolicyMethodDescriptor =
      ApiMethodDescriptor.<GetPolicyHttpRequest, Policy>newBuilder()
          .setFullMethodName("dns.policies.get")
          .setHttpMethod(HttpMethods.GET)
          .setRequestFormatter(
              ApiMessageHttpRequestFormatter.<GetPolicyHttpRequest>newBuilder()
                  .setPathTemplate(PathTemplate.create("{project}/policies/{policy}"))
                  .setQueryParams(Sets.<String>newHashSet("clientOperationId"))
                  .setResourceNameFactory(ProjectPolicyName.newFactory())
                  .setResourceNameField("policy")
                  .build())
          .setResponseParser(
              ApiMessageHttpResponseParser.<Policy>newBuilder()
                  .setResponseInstance(Policy.getDefaultInstance())
                  .build())
          .build();

  @InternalApi
  public static final ApiMethodDescriptor<ListPoliciesHttpRequest, PoliciesListResponse>
      listPoliciesMethodDescriptor =
          ApiMethodDescriptor.<ListPoliciesHttpRequest, PoliciesListResponse>newBuilder()
              .setFullMethodName("dns.policies.list")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<ListPoliciesHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/policies"))
                      .setQueryParams(Sets.<String>newHashSet("maxResults", "pageToken"))
                      .setResourceNameFactory(ProjectName.newFactory())
                      .setResourceNameField("project")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<PoliciesListResponse>newBuilder()
                      .setResponseInstance(PoliciesListResponse.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<PatchPolicyHttpRequest, PoliciesPatchResponse>
      patchPolicyMethodDescriptor =
          ApiMethodDescriptor.<PatchPolicyHttpRequest, PoliciesPatchResponse>newBuilder()
              .setFullMethodName("dns.policies.patch")
              .setHttpMethod(HttpMethods.PATCH)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<PatchPolicyHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/policies/{policy}"))
                      .setQueryParams(Sets.<String>newHashSet("clientOperationId"))
                      .setResourceNameFactory(ProjectPolicyName.newFactory())
                      .setResourceNameField("policy")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<PoliciesPatchResponse>newBuilder()
                      .setResponseInstance(PoliciesPatchResponse.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<UpdatePolicyHttpRequest, PoliciesUpdateResponse>
      updatePolicyMethodDescriptor =
          ApiMethodDescriptor.<UpdatePolicyHttpRequest, PoliciesUpdateResponse>newBuilder()
              .setFullMethodName("dns.policies.update")
              .setHttpMethod(HttpMethods.PUT)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter.<UpdatePolicyHttpRequest>newBuilder()
                      .setPathTemplate(PathTemplate.create("{project}/policies/{policy}"))
                      .setQueryParams(Sets.<String>newHashSet("clientOperationId"))
                      .setResourceNameFactory(ProjectPolicyName.newFactory())
                      .setResourceNameField("policy")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<PoliciesUpdateResponse>newBuilder()
                      .setResponseInstance(PoliciesUpdateResponse.getDefaultInstance())
                      .build())
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<CreatePolicyHttpRequest, Policy> createPolicyCallable;
  private final UnaryCallable<DeletePolicyHttpRequest, Void> deletePolicyCallable;
  private final UnaryCallable<GetPolicyHttpRequest, Policy> getPolicyCallable;
  private final UnaryCallable<ListPoliciesHttpRequest, PoliciesListResponse> listPoliciesCallable;
  private final UnaryCallable<ListPoliciesHttpRequest, ListPoliciesPagedResponse>
      listPoliciesPagedCallable;
  private final UnaryCallable<PatchPolicyHttpRequest, PoliciesPatchResponse> patchPolicyCallable;
  private final UnaryCallable<UpdatePolicyHttpRequest, PoliciesUpdateResponse> updatePolicyCallable;

  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonPolicyStub create(PolicyStubSettings settings) throws IOException {
    return new HttpJsonPolicyStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonPolicyStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonPolicyStub(PolicyStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonPolicyStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonPolicyStub(
        PolicyStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonPolicyStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonPolicyStub(PolicyStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonPolicyCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonPolicyStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonPolicyStub(
      PolicyStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<CreatePolicyHttpRequest, Policy> createPolicyTransportSettings =
        HttpJsonCallSettings.<CreatePolicyHttpRequest, Policy>newBuilder()
            .setMethodDescriptor(createPolicyMethodDescriptor)
            .build();
    HttpJsonCallSettings<DeletePolicyHttpRequest, Void> deletePolicyTransportSettings =
        HttpJsonCallSettings.<DeletePolicyHttpRequest, Void>newBuilder()
            .setMethodDescriptor(deletePolicyMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetPolicyHttpRequest, Policy> getPolicyTransportSettings =
        HttpJsonCallSettings.<GetPolicyHttpRequest, Policy>newBuilder()
            .setMethodDescriptor(getPolicyMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListPoliciesHttpRequest, PoliciesListResponse>
        listPoliciesTransportSettings =
            HttpJsonCallSettings.<ListPoliciesHttpRequest, PoliciesListResponse>newBuilder()
                .setMethodDescriptor(listPoliciesMethodDescriptor)
                .build();
    HttpJsonCallSettings<PatchPolicyHttpRequest, PoliciesPatchResponse>
        patchPolicyTransportSettings =
            HttpJsonCallSettings.<PatchPolicyHttpRequest, PoliciesPatchResponse>newBuilder()
                .setMethodDescriptor(patchPolicyMethodDescriptor)
                .build();
    HttpJsonCallSettings<UpdatePolicyHttpRequest, PoliciesUpdateResponse>
        updatePolicyTransportSettings =
            HttpJsonCallSettings.<UpdatePolicyHttpRequest, PoliciesUpdateResponse>newBuilder()
                .setMethodDescriptor(updatePolicyMethodDescriptor)
                .build();

    this.createPolicyCallable =
        callableFactory.createUnaryCallable(
            createPolicyTransportSettings, settings.createPolicySettings(), clientContext);
    this.deletePolicyCallable =
        callableFactory.createUnaryCallable(
            deletePolicyTransportSettings, settings.deletePolicySettings(), clientContext);
    this.getPolicyCallable =
        callableFactory.createUnaryCallable(
            getPolicyTransportSettings, settings.getPolicySettings(), clientContext);
    this.listPoliciesCallable =
        callableFactory.createUnaryCallable(
            listPoliciesTransportSettings, settings.listPoliciesSettings(), clientContext);
    this.listPoliciesPagedCallable =
        callableFactory.createPagedCallable(
            listPoliciesTransportSettings, settings.listPoliciesSettings(), clientContext);
    this.patchPolicyCallable =
        callableFactory.createUnaryCallable(
            patchPolicyTransportSettings, settings.patchPolicySettings(), clientContext);
    this.updatePolicyCallable =
        callableFactory.createUnaryCallable(
            updatePolicyTransportSettings, settings.updatePolicySettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<CreatePolicyHttpRequest, Policy> createPolicyCallable() {
    return createPolicyCallable;
  }

  @BetaApi
  public UnaryCallable<DeletePolicyHttpRequest, Void> deletePolicyCallable() {
    return deletePolicyCallable;
  }

  @BetaApi
  public UnaryCallable<GetPolicyHttpRequest, Policy> getPolicyCallable() {
    return getPolicyCallable;
  }

  @BetaApi
  public UnaryCallable<ListPoliciesHttpRequest, ListPoliciesPagedResponse>
      listPoliciesPagedCallable() {
    return listPoliciesPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListPoliciesHttpRequest, PoliciesListResponse> listPoliciesCallable() {
    return listPoliciesCallable;
  }

  @BetaApi
  public UnaryCallable<PatchPolicyHttpRequest, PoliciesPatchResponse> patchPolicyCallable() {
    return patchPolicyCallable;
  }

  @BetaApi
  public UnaryCallable<UpdatePolicyHttpRequest, PoliciesUpdateResponse> updatePolicyCallable() {
    return updatePolicyCallable;
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
