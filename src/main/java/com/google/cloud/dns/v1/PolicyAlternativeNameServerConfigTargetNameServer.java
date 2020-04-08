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
public final class PolicyAlternativeNameServerConfigTargetNameServer implements ApiMessage {
  private final String ipv4Address;
  private final String kind;

  private PolicyAlternativeNameServerConfigTargetNameServer() {
    this.ipv4Address = null;
    this.kind = null;
  }

  private PolicyAlternativeNameServerConfigTargetNameServer(String ipv4Address, String kind) {
    this.ipv4Address = ipv4Address;
    this.kind = kind;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("ipv4Address".equals(fieldName)) {
      return ipv4Address;
    }
    if ("kind".equals(fieldName)) {
      return kind;
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

  /** IPv4 address to forward to. */
  public String getIpv4Address() {
    return ipv4Address;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dns#policyAlternativeNameServerConfigTargetNameServer".
   */
  public String getKind() {
    return kind;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(PolicyAlternativeNameServerConfigTargetNameServer prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static PolicyAlternativeNameServerConfigTargetNameServer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final PolicyAlternativeNameServerConfigTargetNameServer DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new PolicyAlternativeNameServerConfigTargetNameServer();
  }

  public static class Builder {
    private String ipv4Address;
    private String kind;

    Builder() {}

    public Builder mergeFrom(PolicyAlternativeNameServerConfigTargetNameServer other) {
      if (other == PolicyAlternativeNameServerConfigTargetNameServer.getDefaultInstance())
        return this;
      if (other.getIpv4Address() != null) {
        this.ipv4Address = other.ipv4Address;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      return this;
    }

    Builder(PolicyAlternativeNameServerConfigTargetNameServer source) {
      this.ipv4Address = source.ipv4Address;
      this.kind = source.kind;
    }

    /** IPv4 address to forward to. */
    public String getIpv4Address() {
      return ipv4Address;
    }

    /** IPv4 address to forward to. */
    public Builder setIpv4Address(String ipv4Address) {
      this.ipv4Address = ipv4Address;
      return this;
    }

    /**
     * Identifies what kind of resource this is. Value: the fixed string
     * "dns#policyAlternativeNameServerConfigTargetNameServer".
     */
    public String getKind() {
      return kind;
    }

    /**
     * Identifies what kind of resource this is. Value: the fixed string
     * "dns#policyAlternativeNameServerConfigTargetNameServer".
     */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    public PolicyAlternativeNameServerConfigTargetNameServer build() {

      return new PolicyAlternativeNameServerConfigTargetNameServer(ipv4Address, kind);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setIpv4Address(this.ipv4Address);
      newBuilder.setKind(this.kind);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "PolicyAlternativeNameServerConfigTargetNameServer{"
        + "ipv4Address="
        + ipv4Address
        + ", "
        + "kind="
        + kind
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PolicyAlternativeNameServerConfigTargetNameServer) {
      PolicyAlternativeNameServerConfigTargetNameServer that =
          (PolicyAlternativeNameServerConfigTargetNameServer) o;
      return Objects.equals(this.ipv4Address, that.getIpv4Address())
          && Objects.equals(this.kind, that.getKind());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4Address, kind);
  }
}
