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

import static com.google.cloud.dns.v1.ChangeClient.ListChangesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.dns.v1.stub.ChangeStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link ChangeClient}.
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
 * ChangeSettings.Builder changeSettingsBuilder =
 *     ChangeSettings.newBuilder();
 * changeSettingsBuilder
 *     .createChangeSettings()
 *     .setRetrySettings(
 *         changeSettingsBuilder.createChangeSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ChangeSettings changeSettings = changeSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ChangeSettings extends ClientSettings<ChangeSettings> {
  /** Returns the object with the settings used for calls to createChange. */
  public UnaryCallSettings<CreateChangeHttpRequest, Change> createChangeSettings() {
    return ((ChangeStubSettings) getStubSettings()).createChangeSettings();
  }

  /** Returns the object with the settings used for calls to getChange. */
  public UnaryCallSettings<GetChangeHttpRequest, Change> getChangeSettings() {
    return ((ChangeStubSettings) getStubSettings()).getChangeSettings();
  }

  /** Returns the object with the settings used for calls to listChanges. */
  public PagedCallSettings<ListChangesHttpRequest, ChangesListResponse, ListChangesPagedResponse>
      listChangesSettings() {
    return ((ChangeStubSettings) getStubSettings()).listChangesSettings();
  }

  public static final ChangeSettings create(ChangeStubSettings stub) throws IOException {
    return new ChangeSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return ChangeStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return ChangeStubSettings.getDefaultEndpoint();
  }
  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return ChangeStubSettings.getDefaultServicePort();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return ChangeStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return ChangeStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return ChangeStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return ChangeStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ChangeStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected ChangeSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for ChangeSettings. */
  public static class Builder extends ClientSettings.Builder<ChangeSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(ChangeStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(ChangeStubSettings.newBuilder());
    }

    protected Builder(ChangeSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(ChangeStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public ChangeStubSettings.Builder getStubSettingsBuilder() {
      return ((ChangeStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to createChange. */
    public UnaryCallSettings.Builder<CreateChangeHttpRequest, Change> createChangeSettings() {
      return getStubSettingsBuilder().createChangeSettings();
    }

    /** Returns the builder for the settings used for calls to getChange. */
    public UnaryCallSettings.Builder<GetChangeHttpRequest, Change> getChangeSettings() {
      return getStubSettingsBuilder().getChangeSettings();
    }

    /** Returns the builder for the settings used for calls to listChanges. */
    public PagedCallSettings.Builder<
            ListChangesHttpRequest, ChangesListResponse, ListChangesPagedResponse>
        listChangesSettings() {
      return getStubSettingsBuilder().listChangesSettings();
    }

    @Override
    public ChangeSettings build() throws IOException {
      return new ChangeSettings(this);
    }
  }
}
