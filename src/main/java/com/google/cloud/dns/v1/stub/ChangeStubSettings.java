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
import com.google.cloud.dns.v1.Change;
import com.google.cloud.dns.v1.ChangesListResponse;
import com.google.cloud.dns.v1.CreateChangeHttpRequest;
import com.google.cloud.dns.v1.GetChangeHttpRequest;
import com.google.cloud.dns.v1.ListChangesHttpRequest;
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
 * Settings class to configure an instance of {@link ChangeStub}.
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
 * <p>For example, to set the total timeout of createChange to 30 seconds:
 *
 * <pre>
 * <code>
 * ChangeStubSettings.Builder changeSettingsBuilder =
 *     ChangeStubSettings.newBuilder();
 * changeSettingsBuilder
 *     .createChangeSettings()
 *     .setRetrySettings(
 *         changeSettingsBuilder.createChangeSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ChangeStubSettings changeSettings = changeSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ChangeStubSettings extends StubSettings<ChangeStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/cloud-platform.read-only")
          .add("https://www.googleapis.com/auth/ndev.clouddns.readonly")
          .add("https://www.googleapis.com/auth/ndev.clouddns.readwrite")
          .build();

  private final UnaryCallSettings<CreateChangeHttpRequest, Change> createChangeSettings;
  private final UnaryCallSettings<GetChangeHttpRequest, Change> getChangeSettings;
  private final PagedCallSettings<
          ListChangesHttpRequest, ChangesListResponse, ListChangesPagedResponse>
      listChangesSettings;

  /** Returns the object with the settings used for calls to createChange. */
  public UnaryCallSettings<CreateChangeHttpRequest, Change> createChangeSettings() {
    return createChangeSettings;
  }

  /** Returns the object with the settings used for calls to getChange. */
  public UnaryCallSettings<GetChangeHttpRequest, Change> getChangeSettings() {
    return getChangeSettings;
  }

  /** Returns the object with the settings used for calls to listChanges. */
  public PagedCallSettings<ListChangesHttpRequest, ChangesListResponse, ListChangesPagedResponse>
      listChangesSettings() {
    return listChangesSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ChangeStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonChangeStub.create(this);
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
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(ChangeStubSettings.class))
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

  protected ChangeStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createChangeSettings = settingsBuilder.createChangeSettings().build();
    getChangeSettings = settingsBuilder.getChangeSettings().build();
    listChangesSettings = settingsBuilder.listChangesSettings().build();
  }

  private static final PagedListDescriptor<ListChangesHttpRequest, ChangesListResponse, Change>
      LIST_CHANGES_PAGE_STR_DESC =
          new PagedListDescriptor<ListChangesHttpRequest, ChangesListResponse, Change>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListChangesHttpRequest injectToken(
                ListChangesHttpRequest payload, String token) {
              return ListChangesHttpRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListChangesHttpRequest injectPageSize(
                ListChangesHttpRequest payload, int pageSize) {
              return ListChangesHttpRequest.newBuilder(payload).setMaxResults(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListChangesHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(ChangesListResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Change> extractResources(ChangesListResponse payload) {
              return payload.getChangesList() != null
                  ? payload.getChangesList()
                  : ImmutableList.<Change>of();
            }
          };

  private static final PagedListResponseFactory<
          ListChangesHttpRequest, ChangesListResponse, ListChangesPagedResponse>
      LIST_CHANGES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListChangesHttpRequest, ChangesListResponse, ListChangesPagedResponse>() {
            @Override
            public ApiFuture<ListChangesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListChangesHttpRequest, ChangesListResponse> callable,
                ListChangesHttpRequest request,
                ApiCallContext context,
                ApiFuture<ChangesListResponse> futureResponse) {
              PageContext<ListChangesHttpRequest, ChangesListResponse, Change> pageContext =
                  PageContext.create(callable, LIST_CHANGES_PAGE_STR_DESC, request, context);
              return ListChangesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for ChangeStubSettings. */
  public static class Builder extends StubSettings.Builder<ChangeStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<CreateChangeHttpRequest, Change> createChangeSettings;
    private final UnaryCallSettings.Builder<GetChangeHttpRequest, Change> getChangeSettings;
    private final PagedCallSettings.Builder<
            ListChangesHttpRequest, ChangesListResponse, ListChangesPagedResponse>
        listChangesSettings;

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

      createChangeSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getChangeSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listChangesSettings = PagedCallSettings.newBuilder(LIST_CHANGES_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createChangeSettings, getChangeSettings, listChangesSettings);

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
          .createChangeSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getChangeSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listChangesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(ChangeStubSettings settings) {
      super(settings);

      createChangeSettings = settings.createChangeSettings.toBuilder();
      getChangeSettings = settings.getChangeSettings.toBuilder();
      listChangesSettings = settings.listChangesSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createChangeSettings, getChangeSettings, listChangesSettings);
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

    /** Returns the builder for the settings used for calls to createChange. */
    public UnaryCallSettings.Builder<CreateChangeHttpRequest, Change> createChangeSettings() {
      return createChangeSettings;
    }

    /** Returns the builder for the settings used for calls to getChange. */
    public UnaryCallSettings.Builder<GetChangeHttpRequest, Change> getChangeSettings() {
      return getChangeSettings;
    }

    /** Returns the builder for the settings used for calls to listChanges. */
    public PagedCallSettings.Builder<
            ListChangesHttpRequest, ChangesListResponse, ListChangesPagedResponse>
        listChangesSettings() {
      return listChangesSettings;
    }

    @Override
    public ChangeStubSettings build() throws IOException {
      return new ChangeStubSettings(this);
    }
  }
}
