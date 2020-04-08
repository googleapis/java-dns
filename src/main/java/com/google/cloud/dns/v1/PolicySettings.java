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

import static com.google.cloud.dns.v1.PolicyClient.ListPoliciesPagedResponse;

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
import com.google.cloud.dns.v1.stub.PolicyStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link PolicyClient}.
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
 * PolicySettings.Builder policySettingsBuilder =
 *     PolicySettings.newBuilder();
 * policySettingsBuilder
 *     .createPolicySettings()
 *     .setRetrySettings(
 *         policySettingsBuilder.createPolicySettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * PolicySettings policySettings = policySettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class PolicySettings extends ClientSettings<PolicySettings> {
  /** Returns the object with the settings used for calls to createPolicy. */
  public UnaryCallSettings<CreatePolicyHttpRequest, Policy> createPolicySettings() {
    return ((PolicyStubSettings) getStubSettings()).createPolicySettings();
  }

  /** Returns the object with the settings used for calls to deletePolicy. */
  public UnaryCallSettings<DeletePolicyHttpRequest, Void> deletePolicySettings() {
    return ((PolicyStubSettings) getStubSettings()).deletePolicySettings();
  }

  /** Returns the object with the settings used for calls to getPolicy. */
  public UnaryCallSettings<GetPolicyHttpRequest, Policy> getPolicySettings() {
    return ((PolicyStubSettings) getStubSettings()).getPolicySettings();
  }

  /** Returns the object with the settings used for calls to listPolicies. */
  public PagedCallSettings<ListPoliciesHttpRequest, PoliciesListResponse, ListPoliciesPagedResponse>
      listPoliciesSettings() {
    return ((PolicyStubSettings) getStubSettings()).listPoliciesSettings();
  }

  /** Returns the object with the settings used for calls to patchPolicy. */
  public UnaryCallSettings<PatchPolicyHttpRequest, PoliciesPatchResponse> patchPolicySettings() {
    return ((PolicyStubSettings) getStubSettings()).patchPolicySettings();
  }

  /** Returns the object with the settings used for calls to updatePolicy. */
  public UnaryCallSettings<UpdatePolicyHttpRequest, PoliciesUpdateResponse> updatePolicySettings() {
    return ((PolicyStubSettings) getStubSettings()).updatePolicySettings();
  }

  public static final PolicySettings create(PolicyStubSettings stub) throws IOException {
    return new PolicySettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return PolicyStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return PolicyStubSettings.getDefaultEndpoint();
  }
  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return PolicyStubSettings.getDefaultServicePort();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return PolicyStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return PolicyStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return PolicyStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return PolicyStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return PolicyStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected PolicySettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for PolicySettings. */
  public static class Builder extends ClientSettings.Builder<PolicySettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(PolicyStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(PolicyStubSettings.newBuilder());
    }

    protected Builder(PolicySettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(PolicyStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public PolicyStubSettings.Builder getStubSettingsBuilder() {
      return ((PolicyStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to createPolicy. */
    public UnaryCallSettings.Builder<CreatePolicyHttpRequest, Policy> createPolicySettings() {
      return getStubSettingsBuilder().createPolicySettings();
    }

    /** Returns the builder for the settings used for calls to deletePolicy. */
    public UnaryCallSettings.Builder<DeletePolicyHttpRequest, Void> deletePolicySettings() {
      return getStubSettingsBuilder().deletePolicySettings();
    }

    /** Returns the builder for the settings used for calls to getPolicy. */
    public UnaryCallSettings.Builder<GetPolicyHttpRequest, Policy> getPolicySettings() {
      return getStubSettingsBuilder().getPolicySettings();
    }

    /** Returns the builder for the settings used for calls to listPolicies. */
    public PagedCallSettings.Builder<
            ListPoliciesHttpRequest, PoliciesListResponse, ListPoliciesPagedResponse>
        listPoliciesSettings() {
      return getStubSettingsBuilder().listPoliciesSettings();
    }

    /** Returns the builder for the settings used for calls to patchPolicy. */
    public UnaryCallSettings.Builder<PatchPolicyHttpRequest, PoliciesPatchResponse>
        patchPolicySettings() {
      return getStubSettingsBuilder().patchPolicySettings();
    }

    /** Returns the builder for the settings used for calls to updatePolicy. */
    public UnaryCallSettings.Builder<UpdatePolicyHttpRequest, PoliciesUpdateResponse>
        updatePolicySettings() {
      return getStubSettingsBuilder().updatePolicySettings();
    }

    @Override
    public PolicySettings build() throws IOException {
      return new PolicySettings(this);
    }
  }
}
