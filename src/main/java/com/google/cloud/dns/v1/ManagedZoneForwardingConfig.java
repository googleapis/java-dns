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
public final class ManagedZoneForwardingConfig implements ApiMessage {
  private final String kind;
  private final List<ManagedZoneForwardingConfigNameServerTarget> targetNameServers;

  private ManagedZoneForwardingConfig() {
    this.kind = null;
    this.targetNameServers = null;
  }

  private ManagedZoneForwardingConfig(
      String kind, List<ManagedZoneForwardingConfigNameServerTarget> targetNameServers) {
    this.kind = kind;
    this.targetNameServers = targetNameServers;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("targetNameServers".equals(fieldName)) {
      return targetNameServers;
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
   * "dns#managedZoneForwardingConfig".
   */
  public String getKind() {
    return kind;
  }

  /**
   * List of target name servers to forward to. Cloud DNS will select the best available name server
   * if more than one target is given.
   */
  public List<ManagedZoneForwardingConfigNameServerTarget> getTargetNameServersList() {
    return targetNameServers;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(ManagedZoneForwardingConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static ManagedZoneForwardingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final ManagedZoneForwardingConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new ManagedZoneForwardingConfig();
  }

  public static class Builder {
    private String kind;
    private List<ManagedZoneForwardingConfigNameServerTarget> targetNameServers;

    Builder() {}

    public Builder mergeFrom(ManagedZoneForwardingConfig other) {
      if (other == ManagedZoneForwardingConfig.getDefaultInstance()) return this;
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getTargetNameServersList() != null) {
        this.targetNameServers = other.targetNameServers;
      }
      return this;
    }

    Builder(ManagedZoneForwardingConfig source) {
      this.kind = source.kind;
      this.targetNameServers = source.targetNameServers;
    }

    /**
     * Identifies what kind of resource this is. Value: the fixed string
     * "dns#managedZoneForwardingConfig".
     */
    public String getKind() {
      return kind;
    }

    /**
     * Identifies what kind of resource this is. Value: the fixed string
     * "dns#managedZoneForwardingConfig".
     */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * List of target name servers to forward to. Cloud DNS will select the best available name
     * server if more than one target is given.
     */
    public List<ManagedZoneForwardingConfigNameServerTarget> getTargetNameServersList() {
      return targetNameServers;
    }

    /**
     * List of target name servers to forward to. Cloud DNS will select the best available name
     * server if more than one target is given.
     */
    public Builder addAllTargetNameServers(
        List<ManagedZoneForwardingConfigNameServerTarget> targetNameServers) {
      if (this.targetNameServers == null) {
        this.targetNameServers = new LinkedList<>();
      }
      this.targetNameServers.addAll(targetNameServers);
      return this;
    }

    /**
     * List of target name servers to forward to. Cloud DNS will select the best available name
     * server if more than one target is given.
     */
    public Builder addTargetNameServers(
        ManagedZoneForwardingConfigNameServerTarget targetNameServers) {
      if (this.targetNameServers == null) {
        this.targetNameServers = new LinkedList<>();
      }
      this.targetNameServers.add(targetNameServers);
      return this;
    }

    public ManagedZoneForwardingConfig build() {

      return new ManagedZoneForwardingConfig(kind, targetNameServers);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setKind(this.kind);
      newBuilder.addAllTargetNameServers(this.targetNameServers);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "ManagedZoneForwardingConfig{"
        + "kind="
        + kind
        + ", "
        + "targetNameServers="
        + targetNameServers
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ManagedZoneForwardingConfig) {
      ManagedZoneForwardingConfig that = (ManagedZoneForwardingConfig) o;
      return Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.targetNameServers, that.getTargetNameServersList());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, targetNameServers);
  }
}
