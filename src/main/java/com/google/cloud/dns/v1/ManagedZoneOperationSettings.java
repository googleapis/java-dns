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

import static com.google.cloud.dns.v1.ManagedZoneOperationClient.ListManagedZoneOperationsPagedResponse;

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
import com.google.cloud.dns.v1.stub.ManagedZoneOperationStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link ManagedZoneOperationClient}.
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
 * ManagedZoneOperationSettings.Builder managedZoneOperationSettingsBuilder =
 *     ManagedZoneOperationSettings.newBuilder();
 * managedZoneOperationSettingsBuilder
 *     .getManagedZoneOperationSettings()
 *     .setRetrySettings(
 *         managedZoneOperationSettingsBuilder.getManagedZoneOperationSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ManagedZoneOperationSettings managedZoneOperationSettings = managedZoneOperationSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ManagedZoneOperationSettings extends ClientSettings<ManagedZoneOperationSettings> {
  /** Returns the object with the settings used for calls to getManagedZoneOperation. */
  public UnaryCallSettings<GetManagedZoneOperationHttpRequest, Operation>
      getManagedZoneOperationSettings() {
    return ((ManagedZoneOperationStubSettings) getStubSettings()).getManagedZoneOperationSettings();
  }

  /** Returns the object with the settings used for calls to listManagedZoneOperations. */
  public PagedCallSettings<
          ListManagedZoneOperationsHttpRequest,
          ManagedZoneOperationsListResponse,
          ListManagedZoneOperationsPagedResponse>
      listManagedZoneOperationsSettings() {
    return ((ManagedZoneOperationStubSettings) getStubSettings())
        .listManagedZoneOperationsSettings();
  }

  public static final ManagedZoneOperationSettings create(ManagedZoneOperationStubSettings stub)
      throws IOException {
    return new ManagedZoneOperationSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return ManagedZoneOperationStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return ManagedZoneOperationStubSettings.getDefaultEndpoint();
  }
  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return ManagedZoneOperationStubSettings.getDefaultServicePort();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return ManagedZoneOperationStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return ManagedZoneOperationStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return ManagedZoneOperationStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return ManagedZoneOperationStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ManagedZoneOperationStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected ManagedZoneOperationSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for ManagedZoneOperationSettings. */
  public static class Builder
      extends ClientSettings.Builder<ManagedZoneOperationSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(ManagedZoneOperationStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(ManagedZoneOperationStubSettings.newBuilder());
    }

    protected Builder(ManagedZoneOperationSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(ManagedZoneOperationStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public ManagedZoneOperationStubSettings.Builder getStubSettingsBuilder() {
      return ((ManagedZoneOperationStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to getManagedZoneOperation. */
    public UnaryCallSettings.Builder<GetManagedZoneOperationHttpRequest, Operation>
        getManagedZoneOperationSettings() {
      return getStubSettingsBuilder().getManagedZoneOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listManagedZoneOperations. */
    public PagedCallSettings.Builder<
            ListManagedZoneOperationsHttpRequest,
            ManagedZoneOperationsListResponse,
            ListManagedZoneOperationsPagedResponse>
        listManagedZoneOperationsSettings() {
      return getStubSettingsBuilder().listManagedZoneOperationsSettings();
    }

    @Override
    public ManagedZoneOperationSettings build() throws IOException {
      return new ManagedZoneOperationSettings(this);
    }
  }
}
