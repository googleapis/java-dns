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

import static com.google.cloud.dns.v1.ManagedZoneClient.ListManagedZonesPagedResponse;

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
import com.google.cloud.dns.v1.stub.ManagedZoneStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link ManagedZoneClient}.
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
 * <p>For example, to set the total timeout of createManagedZone to 30 seconds:
 *
 * <pre>
 * <code>
 * ManagedZoneSettings.Builder managedZoneSettingsBuilder =
 *     ManagedZoneSettings.newBuilder();
 * managedZoneSettingsBuilder
 *     .createManagedZoneSettings()
 *     .setRetrySettings(
 *         managedZoneSettingsBuilder.createManagedZoneSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ManagedZoneSettings managedZoneSettings = managedZoneSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ManagedZoneSettings extends ClientSettings<ManagedZoneSettings> {
  /** Returns the object with the settings used for calls to createManagedZone. */
  public UnaryCallSettings<CreateManagedZoneHttpRequest, ManagedZone> createManagedZoneSettings() {
    return ((ManagedZoneStubSettings) getStubSettings()).createManagedZoneSettings();
  }

  /** Returns the object with the settings used for calls to deleteManagedZone. */
  public UnaryCallSettings<DeleteManagedZoneHttpRequest, Void> deleteManagedZoneSettings() {
    return ((ManagedZoneStubSettings) getStubSettings()).deleteManagedZoneSettings();
  }

  /** Returns the object with the settings used for calls to getManagedZone. */
  public UnaryCallSettings<GetManagedZoneHttpRequest, ManagedZone> getManagedZoneSettings() {
    return ((ManagedZoneStubSettings) getStubSettings()).getManagedZoneSettings();
  }

  /** Returns the object with the settings used for calls to listManagedZones. */
  public PagedCallSettings<
          ListManagedZonesHttpRequest, ManagedZonesListResponse, ListManagedZonesPagedResponse>
      listManagedZonesSettings() {
    return ((ManagedZoneStubSettings) getStubSettings()).listManagedZonesSettings();
  }

  /** Returns the object with the settings used for calls to patchManagedZone. */
  public UnaryCallSettings<PatchManagedZoneHttpRequest, Operation> patchManagedZoneSettings() {
    return ((ManagedZoneStubSettings) getStubSettings()).patchManagedZoneSettings();
  }

  /** Returns the object with the settings used for calls to updateManagedZone. */
  public UnaryCallSettings<UpdateManagedZoneHttpRequest, Operation> updateManagedZoneSettings() {
    return ((ManagedZoneStubSettings) getStubSettings()).updateManagedZoneSettings();
  }

  public static final ManagedZoneSettings create(ManagedZoneStubSettings stub) throws IOException {
    return new ManagedZoneSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return ManagedZoneStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return ManagedZoneStubSettings.getDefaultEndpoint();
  }
  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return ManagedZoneStubSettings.getDefaultServicePort();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return ManagedZoneStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return ManagedZoneStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return ManagedZoneStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return ManagedZoneStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ManagedZoneStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected ManagedZoneSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for ManagedZoneSettings. */
  public static class Builder extends ClientSettings.Builder<ManagedZoneSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(ManagedZoneStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(ManagedZoneStubSettings.newBuilder());
    }

    protected Builder(ManagedZoneSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(ManagedZoneStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public ManagedZoneStubSettings.Builder getStubSettingsBuilder() {
      return ((ManagedZoneStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to createManagedZone. */
    public UnaryCallSettings.Builder<CreateManagedZoneHttpRequest, ManagedZone>
        createManagedZoneSettings() {
      return getStubSettingsBuilder().createManagedZoneSettings();
    }

    /** Returns the builder for the settings used for calls to deleteManagedZone. */
    public UnaryCallSettings.Builder<DeleteManagedZoneHttpRequest, Void>
        deleteManagedZoneSettings() {
      return getStubSettingsBuilder().deleteManagedZoneSettings();
    }

    /** Returns the builder for the settings used for calls to getManagedZone. */
    public UnaryCallSettings.Builder<GetManagedZoneHttpRequest, ManagedZone>
        getManagedZoneSettings() {
      return getStubSettingsBuilder().getManagedZoneSettings();
    }

    /** Returns the builder for the settings used for calls to listManagedZones. */
    public PagedCallSettings.Builder<
            ListManagedZonesHttpRequest, ManagedZonesListResponse, ListManagedZonesPagedResponse>
        listManagedZonesSettings() {
      return getStubSettingsBuilder().listManagedZonesSettings();
    }

    /** Returns the builder for the settings used for calls to patchManagedZone. */
    public UnaryCallSettings.Builder<PatchManagedZoneHttpRequest, Operation>
        patchManagedZoneSettings() {
      return getStubSettingsBuilder().patchManagedZoneSettings();
    }

    /** Returns the builder for the settings used for calls to updateManagedZone. */
    public UnaryCallSettings.Builder<UpdateManagedZoneHttpRequest, Operation>
        updateManagedZoneSettings() {
      return getStubSettingsBuilder().updateManagedZoneSettings();
    }

    @Override
    public ManagedZoneSettings build() throws IOException {
      return new ManagedZoneSettings(this);
    }
  }
}
