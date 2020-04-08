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

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
/** A policy is a collection of DNS rules applied to one or more Virtual Private Cloud resources. */
public final class Policy implements ApiMessage {
  private final PolicyAlternativeNameServerConfig alternativeNameServerConfig;
  private final String description;
  private final Boolean enableInboundForwarding;
  private final Boolean enableLogging;
  private final String id;
  private final String kind;
  private final String name;
  private final List<PolicyNetwork> networks;

  private Policy() {
    this.alternativeNameServerConfig = null;
    this.description = null;
    this.enableInboundForwarding = null;
    this.enableLogging = null;
    this.id = null;
    this.kind = null;
    this.name = null;
    this.networks = null;
  }

  private Policy(
      PolicyAlternativeNameServerConfig alternativeNameServerConfig,
      String description,
      Boolean enableInboundForwarding,
      Boolean enableLogging,
      String id,
      String kind,
      String name,
      List<PolicyNetwork> networks) {
    this.alternativeNameServerConfig = alternativeNameServerConfig;
    this.description = description;
    this.enableInboundForwarding = enableInboundForwarding;
    this.enableLogging = enableLogging;
    this.id = id;
    this.kind = kind;
    this.name = name;
    this.networks = networks;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("alternativeNameServerConfig".equals(fieldName)) {
      return alternativeNameServerConfig;
    }
    if ("description".equals(fieldName)) {
      return description;
    }
    if ("enableInboundForwarding".equals(fieldName)) {
      return enableInboundForwarding;
    }
    if ("enableLogging".equals(fieldName)) {
      return enableLogging;
    }
    if ("id".equals(fieldName)) {
      return id;
    }
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("name".equals(fieldName)) {
      return name;
    }
    if ("networks".equals(fieldName)) {
      return networks;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  /**
   * The fields that should be serialized (even if they have empty values). If the containing
   * message object has a non-null fieldmask, then all the fields in the field mask (and only those
   * fields in the field mask) will be serialized. If the containing object does not have a
   * fieldmask, then only non-empty fields will be serialized.
   */
  public List<String> getFieldMask() {
    return null;
  }

  /**
   * Sets an alternative name server for the associated networks. When specified, all DNS queries
   * are forwarded to a name server that you choose. Names such as .internal are not available when
   * an alternative name server is specified.
   */
  public PolicyAlternativeNameServerConfig getAlternativeNameServerConfig() {
    return alternativeNameServerConfig;
  }

  /**
   * A mutable string of at most 1024 characters associated with this resource for the user's
   * convenience. Has no effect on the policy's function.
   */
  public String getDescription() {
    return description;
  }

  /**
   * Allows networks bound to this policy to receive DNS queries sent by VMs or applications over
   * VPN connections. When enabled, a virtual IP address will be allocated from each of the
   * sub-networks that are bound to this policy.
   */
  public Boolean getEnableInboundForwarding() {
    return enableInboundForwarding;
  }

  /**
   * Controls whether logging is enabled for the networks bound to this policy. Defaults to no
   * logging if not set.
   */
  public Boolean getEnableLogging() {
    return enableLogging;
  }

  /** Unique identifier for the resource; defined by the server (output only). */
  public String getId() {
    return id;
  }

  /** Identifies what kind of resource this is. Value: the fixed string "dns#policy". */
  public String getKind() {
    return kind;
  }

  /** User assigned name for this policy. */
  public String getName() {
    return name;
  }

  /** List of network names specifying networks to which this policy is applied. */
  public List<PolicyNetwork> getNetworksList() {
    return networks;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(Policy prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Policy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final Policy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new Policy();
  }

  public static class Builder {
    private PolicyAlternativeNameServerConfig alternativeNameServerConfig;
    private String description;
    private Boolean enableInboundForwarding;
    private Boolean enableLogging;
    private String id;
    private String kind;
    private String name;
    private List<PolicyNetwork> networks;

    Builder() {}

    public Builder mergeFrom(Policy other) {
      if (other == Policy.getDefaultInstance()) return this;
      if (other.getAlternativeNameServerConfig() != null) {
        this.alternativeNameServerConfig = other.alternativeNameServerConfig;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getEnableInboundForwarding() != null) {
        this.enableInboundForwarding = other.enableInboundForwarding;
      }
      if (other.getEnableLogging() != null) {
        this.enableLogging = other.enableLogging;
      }
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getNetworksList() != null) {
        this.networks = other.networks;
      }
      return this;
    }

    Builder(Policy source) {
      this.alternativeNameServerConfig = source.alternativeNameServerConfig;
      this.description = source.description;
      this.enableInboundForwarding = source.enableInboundForwarding;
      this.enableLogging = source.enableLogging;
      this.id = source.id;
      this.kind = source.kind;
      this.name = source.name;
      this.networks = source.networks;
    }

    /**
     * Sets an alternative name server for the associated networks. When specified, all DNS queries
     * are forwarded to a name server that you choose. Names such as .internal are not available
     * when an alternative name server is specified.
     */
    public PolicyAlternativeNameServerConfig getAlternativeNameServerConfig() {
      return alternativeNameServerConfig;
    }

    /**
     * Sets an alternative name server for the associated networks. When specified, all DNS queries
     * are forwarded to a name server that you choose. Names such as .internal are not available
     * when an alternative name server is specified.
     */
    public Builder setAlternativeNameServerConfig(
        PolicyAlternativeNameServerConfig alternativeNameServerConfig) {
      this.alternativeNameServerConfig = alternativeNameServerConfig;
      return this;
    }

    /**
     * A mutable string of at most 1024 characters associated with this resource for the user's
     * convenience. Has no effect on the policy's function.
     */
    public String getDescription() {
      return description;
    }

    /**
     * A mutable string of at most 1024 characters associated with this resource for the user's
     * convenience. Has no effect on the policy's function.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Allows networks bound to this policy to receive DNS queries sent by VMs or applications over
     * VPN connections. When enabled, a virtual IP address will be allocated from each of the
     * sub-networks that are bound to this policy.
     */
    public Boolean getEnableInboundForwarding() {
      return enableInboundForwarding;
    }

    /**
     * Allows networks bound to this policy to receive DNS queries sent by VMs or applications over
     * VPN connections. When enabled, a virtual IP address will be allocated from each of the
     * sub-networks that are bound to this policy.
     */
    public Builder setEnableInboundForwarding(Boolean enableInboundForwarding) {
      this.enableInboundForwarding = enableInboundForwarding;
      return this;
    }

    /**
     * Controls whether logging is enabled for the networks bound to this policy. Defaults to no
     * logging if not set.
     */
    public Boolean getEnableLogging() {
      return enableLogging;
    }

    /**
     * Controls whether logging is enabled for the networks bound to this policy. Defaults to no
     * logging if not set.
     */
    public Builder setEnableLogging(Boolean enableLogging) {
      this.enableLogging = enableLogging;
      return this;
    }

    /** Unique identifier for the resource; defined by the server (output only). */
    public String getId() {
      return id;
    }

    /** Unique identifier for the resource; defined by the server (output only). */
    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    /** Identifies what kind of resource this is. Value: the fixed string "dns#policy". */
    public String getKind() {
      return kind;
    }

    /** Identifies what kind of resource this is. Value: the fixed string "dns#policy". */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /** User assigned name for this policy. */
    public String getName() {
      return name;
    }

    /** User assigned name for this policy. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** List of network names specifying networks to which this policy is applied. */
    public List<PolicyNetwork> getNetworksList() {
      return networks;
    }

    /** List of network names specifying networks to which this policy is applied. */
    public Builder addAllNetworks(List<PolicyNetwork> networks) {
      if (this.networks == null) {
        this.networks = new LinkedList<>();
      }
      this.networks.addAll(networks);
      return this;
    }

    /** List of network names specifying networks to which this policy is applied. */
    public Builder addNetworks(PolicyNetwork networks) {
      if (this.networks == null) {
        this.networks = new LinkedList<>();
      }
      this.networks.add(networks);
      return this;
    }

    public Policy build() {

      return new Policy(
          alternativeNameServerConfig,
          description,
          enableInboundForwarding,
          enableLogging,
          id,
          kind,
          name,
          networks);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAlternativeNameServerConfig(this.alternativeNameServerConfig);
      newBuilder.setDescription(this.description);
      newBuilder.setEnableInboundForwarding(this.enableInboundForwarding);
      newBuilder.setEnableLogging(this.enableLogging);
      newBuilder.setId(this.id);
      newBuilder.setKind(this.kind);
      newBuilder.setName(this.name);
      newBuilder.addAllNetworks(this.networks);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Policy{"
        + "alternativeNameServerConfig="
        + alternativeNameServerConfig
        + ", "
        + "description="
        + description
        + ", "
        + "enableInboundForwarding="
        + enableInboundForwarding
        + ", "
        + "enableLogging="
        + enableLogging
        + ", "
        + "id="
        + id
        + ", "
        + "kind="
        + kind
        + ", "
        + "name="
        + name
        + ", "
        + "networks="
        + networks
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Policy) {
      Policy that = (Policy) o;
      return Objects.equals(this.alternativeNameServerConfig, that.getAlternativeNameServerConfig())
          && Objects.equals(this.description, that.getDescription())
          && Objects.equals(this.enableInboundForwarding, that.getEnableInboundForwarding())
          && Objects.equals(this.enableLogging, that.getEnableLogging())
          && Objects.equals(this.id, that.getId())
          && Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.name, that.getName())
          && Objects.equals(this.networks, that.getNetworksList());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        alternativeNameServerConfig,
        description,
        enableInboundForwarding,
        enableLogging,
        id,
        kind,
        name,
        networks);
  }
}
