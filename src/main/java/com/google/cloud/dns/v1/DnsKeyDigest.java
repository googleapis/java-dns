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
public final class DnsKeyDigest implements ApiMessage {
  private final String digest;
  private final String type;

  private DnsKeyDigest() {
    this.digest = null;
    this.type = null;
  }

  private DnsKeyDigest(String digest, String type) {
    this.digest = digest;
    this.type = type;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("digest".equals(fieldName)) {
      return digest;
    }
    if ("type".equals(fieldName)) {
      return type;
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

  /** The base-16 encoded bytes of this digest. Suitable for use in a DS resource record. */
  public String getDigest() {
    return digest;
  }

  /** Specifies the algorithm used to calculate this digest. */
  public String getType() {
    return type;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(DnsKeyDigest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static DnsKeyDigest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final DnsKeyDigest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new DnsKeyDigest();
  }

  public static class Builder {
    private String digest;
    private String type;

    Builder() {}

    public Builder mergeFrom(DnsKeyDigest other) {
      if (other == DnsKeyDigest.getDefaultInstance()) return this;
      if (other.getDigest() != null) {
        this.digest = other.digest;
      }
      if (other.getType() != null) {
        this.type = other.type;
      }
      return this;
    }

    Builder(DnsKeyDigest source) {
      this.digest = source.digest;
      this.type = source.type;
    }

    /** The base-16 encoded bytes of this digest. Suitable for use in a DS resource record. */
    public String getDigest() {
      return digest;
    }

    /** The base-16 encoded bytes of this digest. Suitable for use in a DS resource record. */
    public Builder setDigest(String digest) {
      this.digest = digest;
      return this;
    }

    /** Specifies the algorithm used to calculate this digest. */
    public String getType() {
      return type;
    }

    /** Specifies the algorithm used to calculate this digest. */
    public Builder setType(String type) {
      this.type = type;
      return this;
    }

    public DnsKeyDigest build() {

      return new DnsKeyDigest(digest, type);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setDigest(this.digest);
      newBuilder.setType(this.type);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "DnsKeyDigest{" + "digest=" + digest + ", " + "type=" + type + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DnsKeyDigest) {
      DnsKeyDigest that = (DnsKeyDigest) o;
      return Objects.equals(this.digest, that.getDigest())
          && Objects.equals(this.type, that.getType());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(digest, type);
  }
}
