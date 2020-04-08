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
public final class PolicyAlternativeNameServerConfig implements ApiMessage {
  private final String kind;
  private final List<PolicyAlternativeNameServerConfigTargetNameServer> targetNameServers;

  private PolicyAlternativeNameServerConfig() {
    this.kind = null;
    this.targetNameServers = null;
  }

  private PolicyAlternativeNameServerConfig(
      String kind, List<PolicyAlternativeNameServerConfigTargetNameServer> targetNameServers) {
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
   * "dns#policyAlternativeNameServerConfig".
   */
  public String getKind() {
    return kind;
  }

  /**
   * Sets an alternative name server for the associated networks. When specified, all DNS queries
   * are forwarded to a name server that you choose. Names such as .internal are not available when
   * an alternative name server is specified.
   */
  public List<PolicyAlternativeNameServerConfigTargetNameServer> getTargetNameServersList() {
    return targetNameServers;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(PolicyAlternativeNameServerConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static PolicyAlternativeNameServerConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final PolicyAlternativeNameServerConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new PolicyAlternativeNameServerConfig();
  }

  public static class Builder {
    private String kind;
    private List<PolicyAlternativeNameServerConfigTargetNameServer> targetNameServers;

    Builder() {}

    public Builder mergeFrom(PolicyAlternativeNameServerConfig other) {
      if (other == PolicyAlternativeNameServerConfig.getDefaultInstance()) return this;
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getTargetNameServersList() != null) {
        this.targetNameServers = other.targetNameServers;
      }
      return this;
    }

    Builder(PolicyAlternativeNameServerConfig source) {
      this.kind = source.kind;
      this.targetNameServers = source.targetNameServers;
    }

    /**
     * Identifies what kind of resource this is. Value: the fixed string
     * "dns#policyAlternativeNameServerConfig".
     */
    public String getKind() {
      return kind;
    }

    /**
     * Identifies what kind of resource this is. Value: the fixed string
     * "dns#policyAlternativeNameServerConfig".
     */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * Sets an alternative name server for the associated networks. When specified, all DNS queries
     * are forwarded to a name server that you choose. Names such as .internal are not available
     * when an alternative name server is specified.
     */
    public List<PolicyAlternativeNameServerConfigTargetNameServer> getTargetNameServersList() {
      return targetNameServers;
    }

    /**
     * Sets an alternative name server for the associated networks. When specified, all DNS queries
     * are forwarded to a name server that you choose. Names such as .internal are not available
     * when an alternative name server is specified.
     */
    public Builder addAllTargetNameServers(
        List<PolicyAlternativeNameServerConfigTargetNameServer> targetNameServers) {
      if (this.targetNameServers == null) {
        this.targetNameServers = new LinkedList<>();
      }
      this.targetNameServers.addAll(targetNameServers);
      return this;
    }

    /**
     * Sets an alternative name server for the associated networks. When specified, all DNS queries
     * are forwarded to a name server that you choose. Names such as .internal are not available
     * when an alternative name server is specified.
     */
    public Builder addTargetNameServers(
        PolicyAlternativeNameServerConfigTargetNameServer targetNameServers) {
      if (this.targetNameServers == null) {
        this.targetNameServers = new LinkedList<>();
      }
      this.targetNameServers.add(targetNameServers);
      return this;
    }

    public PolicyAlternativeNameServerConfig build() {

      return new PolicyAlternativeNameServerConfig(kind, targetNameServers);
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
    return "PolicyAlternativeNameServerConfig{"
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
    if (o instanceof PolicyAlternativeNameServerConfig) {
      PolicyAlternativeNameServerConfig that = (PolicyAlternativeNameServerConfig) o;
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
