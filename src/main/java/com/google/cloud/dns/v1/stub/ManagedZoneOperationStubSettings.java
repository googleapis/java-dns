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
import com.google.cloud.dns.v1.GetManagedZoneOperationHttpRequest;
import com.google.cloud.dns.v1.ListManagedZoneOperationsHttpRequest;
import com.google.cloud.dns.v1.ManagedZoneOperationsListResponse;
import com.google.cloud.dns.v1.Operation;
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
 * Settings class to configure an instance of {@link ManagedZoneOperationStub}.
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
 * <p>For example, to set the total timeout of getManagedZoneOperation to 30 seconds:
 *
 * <pre>
 * <code>
 * ManagedZoneOperationStubSettings.Builder managedZoneOperationSettingsBuilder =
 *     ManagedZoneOperationStubSettings.newBuilder();
 * managedZoneOperationSettingsBuilder
 *     .getManagedZoneOperationSettings()
 *     .setRetrySettings(
 *         managedZoneOperationSettingsBuilder.getManagedZoneOperationSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ManagedZoneOperationStubSettings managedZoneOperationSettings = managedZoneOperationSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ManagedZoneOperationStubSettings
    extends StubSettings<ManagedZoneOperationStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/cloud-platform.read-only")
          .add("https://www.googleapis.com/auth/ndev.clouddns.readonly")
          .add("https://www.googleapis.com/auth/ndev.clouddns.readwrite")
          .build();

  private final UnaryCallSettings<GetManagedZoneOperationHttpRequest, Operation>
      getManagedZoneOperationSettings;
  private final PagedCallSettings<
          ListManagedZoneOperationsHttpRequest,
          ManagedZoneOperationsListResponse,
          ListManagedZoneOperationsPagedResponse>
      listManagedZoneOperationsSettings;

  /** Returns the object with the settings used for calls to getManagedZoneOperation. */
  public UnaryCallSettings<GetManagedZoneOperationHttpRequest, Operation>
      getManagedZoneOperationSettings() {
    return getManagedZoneOperationSettings;
  }

  /** Returns the object with the settings used for calls to listManagedZoneOperations. */
  public PagedCallSettings<
          ListManagedZoneOperationsHttpRequest,
          ManagedZoneOperationsListResponse,
          ListManagedZoneOperationsPagedResponse>
      listManagedZoneOperationsSettings() {
    return listManagedZoneOperationsSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ManagedZoneOperationStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonManagedZoneOperationStub.create(this);
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
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(ManagedZoneOperationStubSettings.class))
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

  protected ManagedZoneOperationStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    getManagedZoneOperationSettings = settingsBuilder.getManagedZoneOperationSettings().build();
    listManagedZoneOperationsSettings = settingsBuilder.listManagedZoneOperationsSettings().build();
  }

  private static final PagedListDescriptor<
          ListManagedZoneOperationsHttpRequest, ManagedZoneOperationsListResponse, Operation>
      LIST_MANAGED_ZONE_OPERATIONS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListManagedZoneOperationsHttpRequest,
              ManagedZoneOperationsListResponse,
              Operation>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListManagedZoneOperationsHttpRequest injectToken(
                ListManagedZoneOperationsHttpRequest payload, String token) {
              return ListManagedZoneOperationsHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListManagedZoneOperationsHttpRequest injectPageSize(
                ListManagedZoneOperationsHttpRequest payload, int pageSize) {
              return ListManagedZoneOperationsHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListManagedZoneOperationsHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(ManagedZoneOperationsListResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Operation> extractResources(ManagedZoneOperationsListResponse payload) {
              return payload.getOperationsList() != null
                  ? payload.getOperationsList()
                  : ImmutableList.<Operation>of();
            }
          };

  private static final PagedListResponseFactory<
          ListManagedZoneOperationsHttpRequest,
          ManagedZoneOperationsListResponse,
          ListManagedZoneOperationsPagedResponse>
      LIST_MANAGED_ZONE_OPERATIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListManagedZoneOperationsHttpRequest,
              ManagedZoneOperationsListResponse,
              ListManagedZoneOperationsPagedResponse>() {
            @Override
            public ApiFuture<ListManagedZoneOperationsPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListManagedZoneOperationsHttpRequest, ManagedZoneOperationsListResponse>
                    callable,
                ListManagedZoneOperationsHttpRequest request,
                ApiCallContext context,
                ApiFuture<ManagedZoneOperationsListResponse> futureResponse) {
              PageContext<
                      ListManagedZoneOperationsHttpRequest,
                      ManagedZoneOperationsListResponse,
                      Operation>
                  pageContext =
                      PageContext.create(
                          callable, LIST_MANAGED_ZONE_OPERATIONS_PAGE_STR_DESC, request, context);
              return ListManagedZoneOperationsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  /** Builder for ManagedZoneOperationStubSettings. */
  public static class Builder
      extends StubSettings.Builder<ManagedZoneOperationStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<GetManagedZoneOperationHttpRequest, Operation>
        getManagedZoneOperationSettings;
    private final PagedCallSettings.Builder<
            ListManagedZoneOperationsHttpRequest,
            ManagedZoneOperationsListResponse,
            ListManagedZoneOperationsPagedResponse>
        listManagedZoneOperationsSettings;

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

      getManagedZoneOperationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listManagedZoneOperationsSettings =
          PagedCallSettings.newBuilder(LIST_MANAGED_ZONE_OPERATIONS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getManagedZoneOperationSettings, listManagedZoneOperationsSettings);

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
          .getManagedZoneOperationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listManagedZoneOperationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(ManagedZoneOperationStubSettings settings) {
      super(settings);

      getManagedZoneOperationSettings = settings.getManagedZoneOperationSettings.toBuilder();
      listManagedZoneOperationsSettings = settings.listManagedZoneOperationsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getManagedZoneOperationSettings, listManagedZoneOperationsSettings);
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

    /** Returns the builder for the settings used for calls to getManagedZoneOperation. */
    public UnaryCallSettings.Builder<GetManagedZoneOperationHttpRequest, Operation>
        getManagedZoneOperationSettings() {
      return getManagedZoneOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listManagedZoneOperations. */
    public PagedCallSettings.Builder<
            ListManagedZoneOperationsHttpRequest,
            ManagedZoneOperationsListResponse,
            ListManagedZoneOperationsPagedResponse>
        listManagedZoneOperationsSettings() {
      return listManagedZoneOperationsSettings;
    }

    @Override
    public ManagedZoneOperationStubSettings build() throws IOException {
      return new ManagedZoneOperationStubSettings(this);
    }
  }
}
