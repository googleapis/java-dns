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
public final class ManagedZonePrivateVisibilityConfig implements ApiMessage {
  private final String kind;
  private final List<ManagedZonePrivateVisibilityConfigNetwork> networks;

  private ManagedZonePrivateVisibilityConfig() {
    this.kind = null;
    this.networks = null;
  }

  private ManagedZonePrivateVisibilityConfig(
      String kind, List<ManagedZonePrivateVisibilityConfigNetwork> networks) {
    this.kind = kind;
    this.networks = networks;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("kind".equals(fieldName)) {
      return kind;
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
   * Identifies what kind of resource this is. Value: the fixed string
   * "dns#managedZonePrivateVisibilityConfig".
   */
  public String getKind() {
    return kind;
  }

  /** The list of VPC networks that can see this zone. */
  public List<ManagedZonePrivateVisibilityConfigNetwork> getNetworksList() {
    return networks;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(ManagedZonePrivateVisibilityConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static ManagedZonePrivateVisibilityConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final ManagedZonePrivateVisibilityConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new ManagedZonePrivateVisibilityConfig();
  }

  public static class Builder {
    private String kind;
    private List<ManagedZonePrivateVisibilityConfigNetwork> networks;

    Builder() {}

    public Builder mergeFrom(ManagedZonePrivateVisibilityConfig other) {
      if (other == ManagedZonePrivateVisibilityConfig.getDefaultInstance()) return this;
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getNetworksList() != null) {
        this.networks = other.networks;
      }
      return this;
    }

    Builder(ManagedZonePrivateVisibilityConfig source) {
      this.kind = source.kind;
      this.networks = source.networks;
    }

    /**
     * Identifies what kind of resource this is. Value: the fixed string
     * "dns#managedZonePrivateVisibilityConfig".
     */
    public String getKind() {
      return kind;
    }

    /**
     * Identifies what kind of resource this is. Value: the fixed string
     * "dns#managedZonePrivateVisibilityConfig".
     */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /** The list of VPC networks that can see this zone. */
    public List<ManagedZonePrivateVisibilityConfigNetwork> getNetworksList() {
      return networks;
    }

    /** The list of VPC networks that can see this zone. */
    public Builder addAllNetworks(List<ManagedZonePrivateVisibilityConfigNetwork> networks) {
      if (this.networks == null) {
        this.networks = new LinkedList<>();
      }
      this.networks.addAll(networks);
      return this;
    }

    /** The list of VPC networks that can see this zone. */
    public Builder addNetworks(ManagedZonePrivateVisibilityConfigNetwork networks) {
      if (this.networks == null) {
        this.networks = new LinkedList<>();
      }
      this.networks.add(networks);
      return this;
    }

    public ManagedZonePrivateVisibilityConfig build() {

      return new ManagedZonePrivateVisibilityConfig(kind, networks);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setKind(this.kind);
      newBuilder.addAllNetworks(this.networks);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "ManagedZonePrivateVisibilityConfig{"
        + "kind="
        + kind
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
    if (o instanceof ManagedZonePrivateVisibilityConfig) {
      ManagedZonePrivateVisibilityConfig that = (ManagedZonePrivateVisibilityConfig) o;
      return Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.networks, that.getNetworksList());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, networks);
  }
}
