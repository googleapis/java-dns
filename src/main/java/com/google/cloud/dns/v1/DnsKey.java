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
/** A DNSSEC key pair. */
public final class DnsKey implements ApiMessage {
  private final String algorithm;
  private final String creationTime;
  private final String description;
  private final List<DnsKeyDigest> digests;
  private final String id;
  private final Boolean isActive;
  private final Integer keyLength;
  private final Integer keyTag;
  private final String kind;
  private final String publicKey;
  private final String type;

  private DnsKey() {
    this.algorithm = null;
    this.creationTime = null;
    this.description = null;
    this.digests = null;
    this.id = null;
    this.isActive = null;
    this.keyLength = null;
    this.keyTag = null;
    this.kind = null;
    this.publicKey = null;
    this.type = null;
  }

  private DnsKey(
      String algorithm,
      String creationTime,
      String description,
      List<DnsKeyDigest> digests,
      String id,
      Boolean isActive,
      Integer keyLength,
      Integer keyTag,
      String kind,
      String publicKey,
      String type) {
    this.algorithm = algorithm;
    this.creationTime = creationTime;
    this.description = description;
    this.digests = digests;
    this.id = id;
    this.isActive = isActive;
    this.keyLength = keyLength;
    this.keyTag = keyTag;
    this.kind = kind;
    this.publicKey = publicKey;
    this.type = type;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("algorithm".equals(fieldName)) {
      return algorithm;
    }
    if ("creationTime".equals(fieldName)) {
      return creationTime;
    }
    if ("description".equals(fieldName)) {
      return description;
    }
    if ("digests".equals(fieldName)) {
      return digests;
    }
    if ("id".equals(fieldName)) {
      return id;
    }
    if ("isActive".equals(fieldName)) {
      return isActive;
    }
    if ("keyLength".equals(fieldName)) {
      return keyLength;
    }
    if ("keyTag".equals(fieldName)) {
      return keyTag;
    }
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("publicKey".equals(fieldName)) {
      return publicKey;
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

  /** String mnemonic specifying the DNSSEC algorithm of this key. Immutable after creation time. */
  public String getAlgorithm() {
    return algorithm;
  }

  /**
   * The time that this resource was created in the control plane. This is in RFC3339 text format.
   * Output only.
   */
  public String getCreationTime() {
    return creationTime;
  }

  /**
   * A mutable string of at most 1024 characters associated with this resource for the user's
   * convenience. Has no effect on the resource's function.
   */
  public String getDescription() {
    return description;
  }

  /**
   * Cryptographic hashes of the DNSKEY resource record associated with this DnsKey. These digests
   * are needed to construct a DS record that points at this DNS key. Output only.
   */
  public List<DnsKeyDigest> getDigestsList() {
    return digests;
  }

  /** Unique identifier for the resource; defined by the server (output only). */
  public String getId() {
    return id;
  }

  /**
   * Active keys will be used to sign subsequent changes to the ManagedZone. Inactive keys will
   * still be present as DNSKEY Resource Records for the use of resolvers validating existing
   * signatures.
   */
  public Boolean getIsActive() {
    return isActive;
  }

  /** Length of the key in bits. Specified at creation time then immutable. */
  public Integer getKeyLength() {
    return keyLength;
  }

  /**
   * The key tag is a non-cryptographic hash of the a DNSKEY resource record associated with this
   * DnsKey. The key tag can be used to identify a DNSKEY more quickly (but it is not a unique
   * identifier). In particular, the key tag is used in a parent zone's DS record to point at the
   * DNSKEY in this child ManagedZone. The key tag is a number in the range [0, 65535] and the
   * algorithm to calculate it is specified in RFC4034 Appendix B. Output only.
   */
  public Integer getKeyTag() {
    return keyTag;
  }

  /** Identifies what kind of resource this is. Value: the fixed string "dns#dnsKey". */
  public String getKind() {
    return kind;
  }

  /** Base64 encoded public half of this key. Output only. */
  public String getPublicKey() {
    return publicKey;
  }

  /**
   * One of "KEY_SIGNING" or "ZONE_SIGNING". Keys of type KEY_SIGNING have the Secure Entry Point
   * flag set and, when active, will be used to sign only resource record sets of type DNSKEY.
   * Otherwise, the Secure Entry Point flag will be cleared and this key will be used to sign only
   * resource record sets of other types. Immutable after creation time.
   */
  public String getType() {
    return type;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(DnsKey prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static DnsKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final DnsKey DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new DnsKey();
  }

  public static class Builder {
    private String algorithm;
    private String creationTime;
    private String description;
    private List<DnsKeyDigest> digests;
    private String id;
    private Boolean isActive;
    private Integer keyLength;
    private Integer keyTag;
    private String kind;
    private String publicKey;
    private String type;

    Builder() {}

    public Builder mergeFrom(DnsKey other) {
      if (other == DnsKey.getDefaultInstance()) return this;
      if (other.getAlgorithm() != null) {
        this.algorithm = other.algorithm;
      }
      if (other.getCreationTime() != null) {
        this.creationTime = other.creationTime;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getDigestsList() != null) {
        this.digests = other.digests;
      }
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getIsActive() != null) {
        this.isActive = other.isActive;
      }
      if (other.getKeyLength() != null) {
        this.keyLength = other.keyLength;
      }
      if (other.getKeyTag() != null) {
        this.keyTag = other.keyTag;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getPublicKey() != null) {
        this.publicKey = other.publicKey;
      }
      if (other.getType() != null) {
        this.type = other.type;
      }
      return this;
    }

    Builder(DnsKey source) {
      this.algorithm = source.algorithm;
      this.creationTime = source.creationTime;
      this.description = source.description;
      this.digests = source.digests;
      this.id = source.id;
      this.isActive = source.isActive;
      this.keyLength = source.keyLength;
      this.keyTag = source.keyTag;
      this.kind = source.kind;
      this.publicKey = source.publicKey;
      this.type = source.type;
    }

    /**
     * String mnemonic specifying the DNSSEC algorithm of this key. Immutable after creation time.
     */
    public String getAlgorithm() {
      return algorithm;
    }

    /**
     * String mnemonic specifying the DNSSEC algorithm of this key. Immutable after creation time.
     */
    public Builder setAlgorithm(String algorithm) {
      this.algorithm = algorithm;
      return this;
    }

    /**
     * The time that this resource was created in the control plane. This is in RFC3339 text format.
     * Output only.
     */
    public String getCreationTime() {
      return creationTime;
    }

    /**
     * The time that this resource was created in the control plane. This is in RFC3339 text format.
     * Output only.
     */
    public Builder setCreationTime(String creationTime) {
      this.creationTime = creationTime;
      return this;
    }

    /**
     * A mutable string of at most 1024 characters associated with this resource for the user's
     * convenience. Has no effect on the resource's function.
     */
    public String getDescription() {
      return description;
    }

    /**
     * A mutable string of at most 1024 characters associated with this resource for the user's
     * convenience. Has no effect on the resource's function.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Cryptographic hashes of the DNSKEY resource record associated with this DnsKey. These digests
     * are needed to construct a DS record that points at this DNS key. Output only.
     */
    public List<DnsKeyDigest> getDigestsList() {
      return digests;
    }

    /**
     * Cryptographic hashes of the DNSKEY resource record associated with this DnsKey. These digests
     * are needed to construct a DS record that points at this DNS key. Output only.
     */
    public Builder addAllDigests(List<DnsKeyDigest> digests) {
      if (this.digests == null) {
        this.digests = new LinkedList<>();
      }
      this.digests.addAll(digests);
      return this;
    }

    /**
     * Cryptographic hashes of the DNSKEY resource record associated with this DnsKey. These digests
     * are needed to construct a DS record that points at this DNS key. Output only.
     */
    public Builder addDigests(DnsKeyDigest digests) {
      if (this.digests == null) {
        this.digests = new LinkedList<>();
      }
      this.digests.add(digests);
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

    /**
     * Active keys will be used to sign subsequent changes to the ManagedZone. Inactive keys will
     * still be present as DNSKEY Resource Records for the use of resolvers validating existing
     * signatures.
     */
    public Boolean getIsActive() {
      return isActive;
    }

    /**
     * Active keys will be used to sign subsequent changes to the ManagedZone. Inactive keys will
     * still be present as DNSKEY Resource Records for the use of resolvers validating existing
     * signatures.
     */
    public Builder setIsActive(Boolean isActive) {
      this.isActive = isActive;
      return this;
    }

    /** Length of the key in bits. Specified at creation time then immutable. */
    public Integer getKeyLength() {
      return keyLength;
    }

    /** Length of the key in bits. Specified at creation time then immutable. */
    public Builder setKeyLength(Integer keyLength) {
      this.keyLength = keyLength;
      return this;
    }

    /**
     * The key tag is a non-cryptographic hash of the a DNSKEY resource record associated with this
     * DnsKey. The key tag can be used to identify a DNSKEY more quickly (but it is not a unique
     * identifier). In particular, the key tag is used in a parent zone's DS record to point at the
     * DNSKEY in this child ManagedZone. The key tag is a number in the range [0, 65535] and the
     * algorithm to calculate it is specified in RFC4034 Appendix B. Output only.
     */
    public Integer getKeyTag() {
      return keyTag;
    }

    /**
     * The key tag is a non-cryptographic hash of the a DNSKEY resource record associated with this
     * DnsKey. The key tag can be used to identify a DNSKEY more quickly (but it is not a unique
     * identifier). In particular, the key tag is used in a parent zone's DS record to point at the
     * DNSKEY in this child ManagedZone. The key tag is a number in the range [0, 65535] and the
     * algorithm to calculate it is specified in RFC4034 Appendix B. Output only.
     */
    public Builder setKeyTag(Integer keyTag) {
      this.keyTag = keyTag;
      return this;
    }

    /** Identifies what kind of resource this is. Value: the fixed string "dns#dnsKey". */
    public String getKind() {
      return kind;
    }

    /** Identifies what kind of resource this is. Value: the fixed string "dns#dnsKey". */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /** Base64 encoded public half of this key. Output only. */
    public String getPublicKey() {
      return publicKey;
    }

    /** Base64 encoded public half of this key. Output only. */
    public Builder setPublicKey(String publicKey) {
      this.publicKey = publicKey;
      return this;
    }

    /**
     * One of "KEY_SIGNING" or "ZONE_SIGNING". Keys of type KEY_SIGNING have the Secure Entry Point
     * flag set and, when active, will be used to sign only resource record sets of type DNSKEY.
     * Otherwise, the Secure Entry Point flag will be cleared and this key will be used to sign only
     * resource record sets of other types. Immutable after creation time.
     */
    public String getType() {
      return type;
    }

    /**
     * One of "KEY_SIGNING" or "ZONE_SIGNING". Keys of type KEY_SIGNING have the Secure Entry Point
     * flag set and, when active, will be used to sign only resource record sets of type DNSKEY.
     * Otherwise, the Secure Entry Point flag will be cleared and this key will be used to sign only
     * resource record sets of other types. Immutable after creation time.
     */
    public Builder setType(String type) {
      this.type = type;
      return this;
    }

    public DnsKey build() {

      return new DnsKey(
          algorithm,
          creationTime,
          description,
          digests,
          id,
          isActive,
          keyLength,
          keyTag,
          kind,
          publicKey,
          type);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAlgorithm(this.algorithm);
      newBuilder.setCreationTime(this.creationTime);
      newBuilder.setDescription(this.description);
      newBuilder.addAllDigests(this.digests);
      newBuilder.setId(this.id);
      newBuilder.setIsActive(this.isActive);
      newBuilder.setKeyLength(this.keyLength);
      newBuilder.setKeyTag(this.keyTag);
      newBuilder.setKind(this.kind);
      newBuilder.setPublicKey(this.publicKey);
      newBuilder.setType(this.type);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "DnsKey{"
        + "algorithm="
        + algorithm
        + ", "
        + "creationTime="
        + creationTime
        + ", "
        + "description="
        + description
        + ", "
        + "digests="
        + digests
        + ", "
        + "id="
        + id
        + ", "
        + "isActive="
        + isActive
        + ", "
        + "keyLength="
        + keyLength
        + ", "
        + "keyTag="
        + keyTag
        + ", "
        + "kind="
        + kind
        + ", "
        + "publicKey="
        + publicKey
        + ", "
        + "type="
        + type
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DnsKey) {
      DnsKey that = (DnsKey) o;
      return Objects.equals(this.algorithm, that.getAlgorithm())
          && Objects.equals(this.creationTime, that.getCreationTime())
          && Objects.equals(this.description, that.getDescription())
          && Objects.equals(this.digests, that.getDigestsList())
          && Objects.equals(this.id, that.getId())
          && Objects.equals(this.isActive, that.getIsActive())
          && Objects.equals(this.keyLength, that.getKeyLength())
          && Objects.equals(this.keyTag, that.getKeyTag())
          && Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.publicKey, that.getPublicKey())
          && Objects.equals(this.type, that.getType());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        algorithm,
        creationTime,
        description,
        digests,
        id,
        isActive,
        keyLength,
        keyTag,
        kind,
        publicKey,
        type);
  }
}
