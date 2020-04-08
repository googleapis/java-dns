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
public final class ManagedZonePrivateVisibilityConfigNetwork implements ApiMessage {
  private final String kind;
  private final String networkUrl;

  private ManagedZonePrivateVisibilityConfigNetwork() {
    this.kind = null;
    this.networkUrl = null;
  }

  private ManagedZonePrivateVisibilityConfigNetwork(String kind, String networkUrl) {
    this.kind = kind;
    this.networkUrl = networkUrl;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("networkUrl".equals(fieldName)) {
      return networkUrl;
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
   * "dns#managedZonePrivateVisibilityConfigNetwork".
   */
  public String getKind() {
    return kind;
  }

  /**
   * The fully qualified URL of the VPC network to bind to. This should be formatted like
   * https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
   */
  public String getNetworkUrl() {
    return networkUrl;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(ManagedZonePrivateVisibilityConfigNetwork prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static ManagedZonePrivateVisibilityConfigNetwork getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final ManagedZonePrivateVisibilityConfigNetwork DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new ManagedZonePrivateVisibilityConfigNetwork();
  }

  public static class Builder {
    private String kind;
    private String networkUrl;

    Builder() {}

    public Builder mergeFrom(ManagedZonePrivateVisibilityConfigNetwork other) {
      if (other == ManagedZonePrivateVisibilityConfigNetwork.getDefaultInstance()) return this;
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getNetworkUrl() != null) {
        this.networkUrl = other.networkUrl;
      }
      return this;
    }

    Builder(ManagedZonePrivateVisibilityConfigNetwork source) {
      this.kind = source.kind;
      this.networkUrl = source.networkUrl;
    }

    /**
     * Identifies what kind of resource this is. Value: the fixed string
     * "dns#managedZonePrivateVisibilityConfigNetwork".
     */
    public String getKind() {
      return kind;
    }

    /**
     * Identifies what kind of resource this is. Value: the fixed string
     * "dns#managedZonePrivateVisibilityConfigNetwork".
     */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * The fully qualified URL of the VPC network to bind to. This should be formatted like
     * https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     */
    public String getNetworkUrl() {
      return networkUrl;
    }

    /**
     * The fully qualified URL of the VPC network to bind to. This should be formatted like
     * https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     */
    public Builder setNetworkUrl(String networkUrl) {
      this.networkUrl = networkUrl;
      return this;
    }

    public ManagedZonePrivateVisibilityConfigNetwork build() {

      return new ManagedZonePrivateVisibilityConfigNetwork(kind, networkUrl);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setKind(this.kind);
      newBuilder.setNetworkUrl(this.networkUrl);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "ManagedZonePrivateVisibilityConfigNetwork{"
        + "kind="
        + kind
        + ", "
        + "networkUrl="
        + networkUrl
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ManagedZonePrivateVisibilityConfigNetwork) {
      ManagedZonePrivateVisibilityConfigNetwork that =
          (ManagedZonePrivateVisibilityConfigNetwork) o;
      return Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.networkUrl, that.getNetworkUrl());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, networkUrl);
  }
}
