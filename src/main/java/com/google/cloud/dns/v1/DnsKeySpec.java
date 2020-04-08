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
/**
 * Parameters for DnsKey key generation. Used for generating initial keys for a new ManagedZone and
 * as default when adding a new DnsKey.
 */
public final class DnsKeySpec implements ApiMessage {
  private final String algorithm;
  private final Integer keyLength;
  private final String keyType;
  private final String kind;

  private DnsKeySpec() {
    this.algorithm = null;
    this.keyLength = null;
    this.keyType = null;
    this.kind = null;
  }

  private DnsKeySpec(String algorithm, Integer keyLength, String keyType, String kind) {
    this.algorithm = algorithm;
    this.keyLength = keyLength;
    this.keyType = keyType;
    this.kind = kind;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("algorithm".equals(fieldName)) {
      return algorithm;
    }
    if ("keyLength".equals(fieldName)) {
      return keyLength;
    }
    if ("keyType".equals(fieldName)) {
      return keyType;
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

  /** String mnemonic specifying the DNSSEC algorithm of this key. */
  public String getAlgorithm() {
    return algorithm;
  }

  /** Length of the keys in bits. */
  public Integer getKeyLength() {
    return keyLength;
  }

  /**
   * Specifies whether this is a key signing key (KSK) or a zone signing key (ZSK). Key signing keys
   * have the Secure Entry Point flag set and, when active, will only be used to sign resource
   * record sets of type DNSKEY. Zone signing keys do not have the Secure Entry Point flag set and
   * will be used to sign all other types of resource record sets.
   */
  public String getKeyType() {
    return keyType;
  }

  /** Identifies what kind of resource this is. Value: the fixed string "dns#dnsKeySpec". */
  public String getKind() {
    return kind;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(DnsKeySpec prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static DnsKeySpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final DnsKeySpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new DnsKeySpec();
  }

  public static class Builder {
    private String algorithm;
    private Integer keyLength;
    private String keyType;
    private String kind;

    Builder() {}

    public Builder mergeFrom(DnsKeySpec other) {
      if (other == DnsKeySpec.getDefaultInstance()) return this;
      if (other.getAlgorithm() != null) {
        this.algorithm = other.algorithm;
      }
      if (other.getKeyLength() != null) {
        this.keyLength = other.keyLength;
      }
      if (other.getKeyType() != null) {
        this.keyType = other.keyType;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      return this;
    }

    Builder(DnsKeySpec source) {
      this.algorithm = source.algorithm;
      this.keyLength = source.keyLength;
      this.keyType = source.keyType;
      this.kind = source.kind;
    }

    /** String mnemonic specifying the DNSSEC algorithm of this key. */
    public String getAlgorithm() {
      return algorithm;
    }

    /** String mnemonic specifying the DNSSEC algorithm of this key. */
    public Builder setAlgorithm(String algorithm) {
      this.algorithm = algorithm;
      return this;
    }

    /** Length of the keys in bits. */
    public Integer getKeyLength() {
      return keyLength;
    }

    /** Length of the keys in bits. */
    public Builder setKeyLength(Integer keyLength) {
      this.keyLength = keyLength;
      return this;
    }

    /**
     * Specifies whether this is a key signing key (KSK) or a zone signing key (ZSK). Key signing
     * keys have the Secure Entry Point flag set and, when active, will only be used to sign
     * resource record sets of type DNSKEY. Zone signing keys do not have the Secure Entry Point
     * flag set and will be used to sign all other types of resource record sets.
     */
    public String getKeyType() {
      return keyType;
    }

    /**
     * Specifies whether this is a key signing key (KSK) or a zone signing key (ZSK). Key signing
     * keys have the Secure Entry Point flag set and, when active, will only be used to sign
     * resource record sets of type DNSKEY. Zone signing keys do not have the Secure Entry Point
     * flag set and will be used to sign all other types of resource record sets.
     */
    public Builder setKeyType(String keyType) {
      this.keyType = keyType;
      return this;
    }

    /** Identifies what kind of resource this is. Value: the fixed string "dns#dnsKeySpec". */
    public String getKind() {
      return kind;
    }

    /** Identifies what kind of resource this is. Value: the fixed string "dns#dnsKeySpec". */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    public DnsKeySpec build() {

      return new DnsKeySpec(algorithm, keyLength, keyType, kind);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAlgorithm(this.algorithm);
      newBuilder.setKeyLength(this.keyLength);
      newBuilder.setKeyType(this.keyType);
      newBuilder.setKind(this.kind);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "DnsKeySpec{"
        + "algorithm="
        + algorithm
        + ", "
        + "keyLength="
        + keyLength
        + ", "
        + "keyType="
        + keyType
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
    if (o instanceof DnsKeySpec) {
      DnsKeySpec that = (DnsKeySpec) o;
      return Objects.equals(this.algorithm, that.getAlgorithm())
          && Objects.equals(this.keyLength, that.getKeyLength())
          && Objects.equals(this.keyType, that.getKeyType())
          && Objects.equals(this.kind, that.getKind());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, keyLength, keyType, kind);
  }
}
