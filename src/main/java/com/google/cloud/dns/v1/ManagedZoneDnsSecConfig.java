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
public final class ManagedZoneDnsSecConfig implements ApiMessage {
  private final List<DnsKeySpec> defaultKeySpecs;
  private final String kind;
  private final String nonExistence;
  private final String state;

  private ManagedZoneDnsSecConfig() {
    this.defaultKeySpecs = null;
    this.kind = null;
    this.nonExistence = null;
    this.state = null;
  }

  private ManagedZoneDnsSecConfig(
      List<DnsKeySpec> defaultKeySpecs, String kind, String nonExistence, String state) {
    this.defaultKeySpecs = defaultKeySpecs;
    this.kind = kind;
    this.nonExistence = nonExistence;
    this.state = state;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("defaultKeySpecs".equals(fieldName)) {
      return defaultKeySpecs;
    }
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("nonExistence".equals(fieldName)) {
      return nonExistence;
    }
    if ("state".equals(fieldName)) {
      return state;
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
   * Specifies parameters for generating initial DnsKeys for this ManagedZone. Can only be changed
   * while the state is OFF.
   */
  public List<DnsKeySpec> getDefaultKeySpecsList() {
    return defaultKeySpecs;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dns#managedZoneDnsSecConfig".
   */
  public String getKind() {
    return kind;
  }

  /**
   * Specifies the mechanism for authenticated denial-of-existence responses. Can only be changed
   * while the state is OFF.
   */
  public String getNonExistence() {
    return nonExistence;
  }

  /** Specifies whether DNSSEC is enabled, and what mode it is in. */
  public String getState() {
    return state;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(ManagedZoneDnsSecConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static ManagedZoneDnsSecConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final ManagedZoneDnsSecConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new ManagedZoneDnsSecConfig();
  }

  public static class Builder {
    private List<DnsKeySpec> defaultKeySpecs;
    private String kind;
    private String nonExistence;
    private String state;

    Builder() {}

    public Builder mergeFrom(ManagedZoneDnsSecConfig other) {
      if (other == ManagedZoneDnsSecConfig.getDefaultInstance()) return this;
      if (other.getDefaultKeySpecsList() != null) {
        this.defaultKeySpecs = other.defaultKeySpecs;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getNonExistence() != null) {
        this.nonExistence = other.nonExistence;
      }
      if (other.getState() != null) {
        this.state = other.state;
      }
      return this;
    }

    Builder(ManagedZoneDnsSecConfig source) {
      this.defaultKeySpecs = source.defaultKeySpecs;
      this.kind = source.kind;
      this.nonExistence = source.nonExistence;
      this.state = source.state;
    }

    /**
     * Specifies parameters for generating initial DnsKeys for this ManagedZone. Can only be changed
     * while the state is OFF.
     */
    public List<DnsKeySpec> getDefaultKeySpecsList() {
      return defaultKeySpecs;
    }

    /**
     * Specifies parameters for generating initial DnsKeys for this ManagedZone. Can only be changed
     * while the state is OFF.
     */
    public Builder addAllDefaultKeySpecs(List<DnsKeySpec> defaultKeySpecs) {
      if (this.defaultKeySpecs == null) {
        this.defaultKeySpecs = new LinkedList<>();
      }
      this.defaultKeySpecs.addAll(defaultKeySpecs);
      return this;
    }

    /**
     * Specifies parameters for generating initial DnsKeys for this ManagedZone. Can only be changed
     * while the state is OFF.
     */
    public Builder addDefaultKeySpecs(DnsKeySpec defaultKeySpecs) {
      if (this.defaultKeySpecs == null) {
        this.defaultKeySpecs = new LinkedList<>();
      }
      this.defaultKeySpecs.add(defaultKeySpecs);
      return this;
    }

    /**
     * Identifies what kind of resource this is. Value: the fixed string
     * "dns#managedZoneDnsSecConfig".
     */
    public String getKind() {
      return kind;
    }

    /**
     * Identifies what kind of resource this is. Value: the fixed string
     * "dns#managedZoneDnsSecConfig".
     */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * Specifies the mechanism for authenticated denial-of-existence responses. Can only be changed
     * while the state is OFF.
     */
    public String getNonExistence() {
      return nonExistence;
    }

    /**
     * Specifies the mechanism for authenticated denial-of-existence responses. Can only be changed
     * while the state is OFF.
     */
    public Builder setNonExistence(String nonExistence) {
      this.nonExistence = nonExistence;
      return this;
    }

    /** Specifies whether DNSSEC is enabled, and what mode it is in. */
    public String getState() {
      return state;
    }

    /** Specifies whether DNSSEC is enabled, and what mode it is in. */
    public Builder setState(String state) {
      this.state = state;
      return this;
    }

    public ManagedZoneDnsSecConfig build() {

      return new ManagedZoneDnsSecConfig(defaultKeySpecs, kind, nonExistence, state);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllDefaultKeySpecs(this.defaultKeySpecs);
      newBuilder.setKind(this.kind);
      newBuilder.setNonExistence(this.nonExistence);
      newBuilder.setState(this.state);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "ManagedZoneDnsSecConfig{"
        + "defaultKeySpecs="
        + defaultKeySpecs
        + ", "
        + "kind="
        + kind
        + ", "
        + "nonExistence="
        + nonExistence
        + ", "
        + "state="
        + state
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ManagedZoneDnsSecConfig) {
      ManagedZoneDnsSecConfig that = (ManagedZoneDnsSecConfig) o;
      return Objects.equals(this.defaultKeySpecs, that.getDefaultKeySpecsList())
          && Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.nonExistence, that.getNonExistence())
          && Objects.equals(this.state, that.getState());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultKeySpecs, kind, nonExistence, state);
  }
}
