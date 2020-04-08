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

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dns.v1.CreatePolicyHttpRequest;
import com.google.cloud.dns.v1.DeletePolicyHttpRequest;
import com.google.cloud.dns.v1.GetPolicyHttpRequest;
import com.google.cloud.dns.v1.ListPoliciesHttpRequest;
import com.google.cloud.dns.v1.PatchPolicyHttpRequest;
import com.google.cloud.dns.v1.PoliciesListResponse;
import com.google.cloud.dns.v1.PoliciesPatchResponse;
import com.google.cloud.dns.v1.PoliciesUpdateResponse;
import com.google.cloud.dns.v1.Policy;
import com.google.cloud.dns.v1.UpdatePolicyHttpRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link PolicyStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (https://dns.googleapis.com/dns/v1/projects/) and default port
 *       (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of createPolicy to 30 seconds:
 *
 * <pre>
 * <code>
 * PolicyStubSettings.Builder policySettingsBuilder =
 *     PolicyStubSettings.newBuilder();
 * policySettingsBuilder
 *     .createPolicySettings()
 *     .setRetrySettings(
 *         policySettingsBuilder.createPolicySettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * PolicyStubSettings policySettings = policySettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class PolicyStubSettings extends StubSettings<PolicyStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/cloud-platform.read-only")
          .add("https://www.googleapis.com/auth/ndev.clouddns.readonly")
          .add("https://www.googleapis.com/auth/ndev.clouddns.readwrite")
          .build();

  private final UnaryCallSettings<CreatePolicyHttpRequest, Policy> createPolicySettings;
  private final UnaryCallSettings<DeletePolicyHttpRequest, Void> deletePolicySettings;
  private final UnaryCallSettings<GetPolicyHttpRequest, Policy> getPolicySettings;
  private final PagedCallSettings<
          ListPoliciesHttpRequest, PoliciesListResponse, ListPoliciesPagedResponse>
      listPoliciesSettings;
  private final UnaryCallSettings<PatchPolicyHttpRequest, PoliciesPatchResponse>
      patchPolicySettings;
  private final UnaryCallSettings<UpdatePolicyHttpRequest, PoliciesUpdateResponse>
      updatePolicySettings;

  /** Returns the object with the settings used for calls to createPolicy. */
  public UnaryCallSettings<CreatePolicyHttpRequest, Policy> createPolicySettings() {
    return createPolicySettings;
  }

  /** Returns the object with the settings used for calls to deletePolicy. */
  public UnaryCallSettings<DeletePolicyHttpRequest, Void> deletePolicySettings() {
    return deletePolicySettings;
  }

  /** Returns the object with the settings used for calls to getPolicy. */
  public UnaryCallSettings<GetPolicyHttpRequest, Policy> getPolicySettings() {
    return getPolicySettings;
  }

  /** Returns the object with the settings used for calls to listPolicies. */
  public PagedCallSettings<ListPoliciesHttpRequest, PoliciesListResponse, ListPoliciesPagedResponse>
      listPoliciesSettings() {
    return listPoliciesSettings;
  }

  /** Returns the object with the settings used for calls to patchPolicy. */
  public UnaryCallSettings<PatchPolicyHttpRequest, PoliciesPatchResponse> patchPolicySettings() {
    return patchPolicySettings;
  }

  /** Returns the object with the settings used for calls to updatePolicy. */
  public UnaryCallSettings<UpdatePolicyHttpRequest, PoliciesUpdateResponse> updatePolicySettings() {
    return updatePolicySettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public PolicyStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonPolicyStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "https://dns.googleapis.com/dns/v1/projects/";
  }

  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return 443;
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultHttpJsonTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(PolicyStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected PolicyStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createPolicySettings = settingsBuilder.createPolicySettings().build();
    deletePolicySettings = settingsBuilder.deletePolicySettings().build();
    getPolicySettings = settingsBuilder.getPolicySettings().build();
    listPoliciesSettings = settingsBuilder.listPoliciesSettings().build();
    patchPolicySettings = settingsBuilder.patchPolicySettings().build();
    updatePolicySettings = settingsBuilder.updatePolicySettings().build();
  }

  private static final PagedListDescriptor<ListPoliciesHttpRequest, PoliciesListResponse, Policy>
      LIST_POLICIES_PAGE_STR_DESC =
          new PagedListDescriptor<ListPoliciesHttpRequest, PoliciesListResponse, Policy>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListPoliciesHttpRequest injectToken(
                ListPoliciesHttpRequest payload, String token) {
              return ListPoliciesHttpRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListPoliciesHttpRequest injectPageSize(
                ListPoliciesHttpRequest payload, int pageSize) {
              return ListPoliciesHttpRequest.newBuilder(payload).setMaxResults(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListPoliciesHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(PoliciesListResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Policy> extractResources(PoliciesListResponse payload) {
              return payload.getPoliciesList() != null
                  ? payload.getPoliciesList()
                  : ImmutableList.<Policy>of();
            }
          };

  private static final PagedListResponseFactory<
          ListPoliciesHttpRequest, PoliciesListResponse, ListPoliciesPagedResponse>
      LIST_POLICIES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListPoliciesHttpRequest, PoliciesListResponse, ListPoliciesPagedResponse>() {
            @Override
            public ApiFuture<ListPoliciesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListPoliciesHttpRequest, PoliciesListResponse> callable,
                ListPoliciesHttpRequest request,
                ApiCallContext context,
                ApiFuture<PoliciesListResponse> futureResponse) {
              PageContext<ListPoliciesHttpRequest, PoliciesListResponse, Policy> pageContext =
                  PageContext.create(callable, LIST_POLICIES_PAGE_STR_DESC, request, context);
              return ListPoliciesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for PolicyStubSettings. */
  public static class Builder extends StubSettings.Builder<PolicyStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<CreatePolicyHttpRequest, Policy> createPolicySettings;
    private final UnaryCallSettings.Builder<DeletePolicyHttpRequest, Void> deletePolicySettings;
    private final UnaryCallSettings.Builder<GetPolicyHttpRequest, Policy> getPolicySettings;
    private final PagedCallSettings.Builder<
            ListPoliciesHttpRequest, PoliciesListResponse, ListPoliciesPagedResponse>
        listPoliciesSettings;
    private final UnaryCallSettings.Builder<PatchPolicyHttpRequest, PoliciesPatchResponse>
        patchPolicySettings;
    private final UnaryCallSettings.Builder<UpdatePolicyHttpRequest, PoliciesUpdateResponse>
        updatePolicySettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deletePolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listPoliciesSettings = PagedCallSettings.newBuilder(LIST_POLICIES_PAGE_STR_FACT);

      patchPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      updatePolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createPolicySettings,
              deletePolicySettings,
              getPolicySettings,
              listPoliciesSettings,
              patchPolicySettings,
              updatePolicySettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .createPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deletePolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listPoliciesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .patchPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updatePolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(PolicyStubSettings settings) {
      super(settings);

      createPolicySettings = settings.createPolicySettings.toBuilder();
      deletePolicySettings = settings.deletePolicySettings.toBuilder();
      getPolicySettings = settings.getPolicySettings.toBuilder();
      listPoliciesSettings = settings.listPoliciesSettings.toBuilder();
      patchPolicySettings = settings.patchPolicySettings.toBuilder();
      updatePolicySettings = settings.updatePolicySettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createPolicySettings,
              deletePolicySettings,
              getPolicySettings,
              listPoliciesSettings,
              patchPolicySettings,
              updatePolicySettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to createPolicy. */
    public UnaryCallSettings.Builder<CreatePolicyHttpRequest, Policy> createPolicySettings() {
      return createPolicySettings;
    }

    /** Returns the builder for the settings used for calls to deletePolicy. */
    public UnaryCallSettings.Builder<DeletePolicyHttpRequest, Void> deletePolicySettings() {
      return deletePolicySettings;
    }

    /** Returns the builder for the settings used for calls to getPolicy. */
    public UnaryCallSettings.Builder<GetPolicyHttpRequest, Policy> getPolicySettings() {
      return getPolicySettings;
    }

    /** Returns the builder for the settings used for calls to listPolicies. */
    public PagedCallSettings.Builder<
            ListPoliciesHttpRequest, PoliciesListResponse, ListPoliciesPagedResponse>
        listPoliciesSettings() {
      return listPoliciesSettings;
    }

    /** Returns the builder for the settings used for calls to patchPolicy. */
    public UnaryCallSettings.Builder<PatchPolicyHttpRequest, PoliciesPatchResponse>
        patchPolicySettings() {
      return patchPolicySettings;
    }

    /** Returns the builder for the settings used for calls to updatePolicy. */
    public UnaryCallSettings.Builder<UpdatePolicyHttpRequest, PoliciesUpdateResponse>
        updatePolicySettings() {
      return updatePolicySettings;
    }

    @Override
    public PolicyStubSettings build() throws IOException {
      return new PolicyStubSettings(this);
    }
  }
}
