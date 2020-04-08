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
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class ManagedZonePeeringConfig implements ApiMessage {
  private final String kind;
  private final ManagedZonePeeringConfigTargetNetwork targetNetwork;

  private ManagedZonePeeringConfig() {
    this.kind = null;
    this.targetNetwork = null;
  }

  private ManagedZonePeeringConfig(
      String kind, ManagedZonePeeringConfigTargetNetwork targetNetwork) {
    this.kind = kind;
    this.targetNetwork = targetNetwork;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("targetNetwork".equals(fieldName)) {
      return targetNetwork;
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
   * "dns#managedZonePeeringConfig".
   */
  public String getKind() {
    return kind;
  }

  /** The network with which to peer. */
  public ManagedZonePeeringConfigTargetNetwork getTargetNetwork() {
    return targetNetwork;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(ManagedZonePeeringConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static ManagedZonePeeringConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final ManagedZonePeeringConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new ManagedZonePeeringConfig();
  }

  public static class Builder {
    private String kind;
    private ManagedZonePeeringConfigTargetNetwork targetNetwork;

    Builder() {}

    public Builder mergeFrom(ManagedZonePeeringConfig other) {
      if (other == ManagedZonePeeringConfig.getDefaultInstance()) return this;
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getTargetNetwork() != null) {
        this.targetNetwork = other.targetNetwork;
      }
      return this;
    }

    Builder(ManagedZonePeeringConfig source) {
      this.kind = source.kind;
      this.targetNetwork = source.targetNetwork;
    }

    /**
     * Identifies what kind of resource this is. Value: the fixed string
     * "dns#managedZonePeeringConfig".
     */
    public String getKind() {
      return kind;
    }

    /**
     * Identifies what kind of resource this is. Value: the fixed string
     * "dns#managedZonePeeringConfig".
     */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /** The network with which to peer. */
    public ManagedZonePeeringConfigTargetNetwork getTargetNetwork() {
      return targetNetwork;
    }

    /** The network with which to peer. */
    public Builder setTargetNetwork(ManagedZonePeeringConfigTargetNetwork targetNetwork) {
      this.targetNetwork = targetNetwork;
      return this;
    }

    public ManagedZonePeeringConfig build() {

      return new ManagedZonePeeringConfig(kind, targetNetwork);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setKind(this.kind);
      newBuilder.setTargetNetwork(this.targetNetwork);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "ManagedZonePeeringConfig{"
        + "kind="
        + kind
        + ", "
        + "targetNetwork="
        + targetNetwork
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ManagedZonePeeringConfig) {
      ManagedZonePeeringConfig that = (ManagedZonePeeringConfig) o;
      return Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.targetNetwork, that.getTargetNetwork());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, targetNetwork);
  }
}
