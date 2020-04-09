/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.dns;

import com.google.api.services.dns.model.DnsKey;
import com.google.api.services.dns.model.DnsKeyDigest;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class DnsKeyInfo implements Serializable {

  static Function<DnsKey, DnsKeyInfo> FROM_PROTOBUF_FUNCTION =
      new Function<DnsKey, DnsKeyInfo>() {
        @Override
        public DnsKeyInfo apply(DnsKey dnsKey) {
          return DnsKeyInfo.fromProtobuf(dnsKey);
        }
      };

  private final String algorithm;
  private final String creationTime;
  private final String description;
  private final List<DnsKeyDigestInfo> digests;
  private final String id;
  private final Boolean isActive;
  private final Long keyLength;
  private final Integer keyTag;
  private final String kind;
  private final String publicKey;
  private final String type;

  static class DnsKeyDigestInfo implements Serializable {

    static Function<DnsKeyDigest, DnsKeyDigestInfo> FROM_PROTOBUF_FUNCTION =
        new Function<DnsKeyDigest, DnsKeyDigestInfo>() {
          @Override
          public DnsKeyDigestInfo apply(DnsKeyDigest dnsKeyDigest) {
            return DnsKeyDigestInfo.fromProtobuf(dnsKeyDigest);
          }
        };

    static Function<DnsKeyDigestInfo, DnsKeyDigest> TO_PROTOBUF_FUNCTION =
        new Function<DnsKeyDigestInfo, DnsKeyDigest>() {
          @Override
          public DnsKeyDigest apply(DnsKeyDigestInfo dnsKeyDigestInfo) {
            return dnsKeyDigestInfo.toProtobuf();
          }
        };

    private final String digest;
    private final String type;

    static class Builder {

      private String digest;
      private String type;

      /**
       * Sets the hexadecimal encoded bytes of this digest. Suitable for use in a DNS resource
       * record.
       */
      Builder setDigest(String digest) {
        this.digest = digest;
        return this;
      }

      /** Specifies the algorithm used to calculate this digest. */
      Builder setType(String type) {
        this.type = type;
        return this;
      }

      DnsKeyDigestInfo build() {
        return new DnsKeyDigestInfo(this);
      }
    }

    private DnsKeyDigestInfo(Builder builder) {
      this.digest = builder.digest;
      this.type = builder.type;
    }

    /** Returns the base-16 encoded bytes of this digest. */
    public String getDigest() {
      return digest;
    }

    /** Returns the algorithm type of this digest. */
    public String getType() {
      return type;
    }

    static Builder newBuilder() {
      return new Builder();
    }

    DnsKeyDigest toProtobuf() {
      DnsKeyDigest dnsKeyDigest = new DnsKeyDigest();
      dnsKeyDigest.setDigest(digest);
      dnsKeyDigest.setType(type);
      return dnsKeyDigest;
    }

    static DnsKeyDigestInfo fromProtobuf(DnsKeyDigest dnsKeyDigest) {
      Builder builder = newBuilder();
      builder.setDigest(dnsKeyDigest.getDigest());
      builder.setType(dnsKeyDigest.getType());
      return builder.build();
    }

    @Override
    public boolean equals(Object other) {
      return (other instanceof DnsKeyDigestInfo)
          && this.toProtobuf().equals(((DnsKeyDigestInfo) other).toProtobuf());
    }

    @Override
    public int hashCode() {
      return Objects.hash(digest, type);
    }

    @Override
    public String toString() {
      return MoreObjects.toStringHelper(this).add("digest", digest).add("type", type).toString();
    }
  }

  static class Builder {
    private String algorithm;
    private String creationTime;
    private String description;
    private List<DnsKeyDigestInfo> digests;
    private String id;
    private Boolean isActive;
    private Long keyLength;
    private Integer keyTag;
    private String kind;
    private String publicKey;
    private String type;

    Builder setAlgorithm(String algorithm) {
      this.algorithm = algorithm;
      return this;
    }

    Builder setCreationTime(String creationTime) {
      this.creationTime = creationTime;
      return this;
    }

    Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    Builder setDigests(List<DnsKeyDigestInfo> digests) {
      this.digests = ImmutableList.copyOf(digests);
      return this;
    }

    Builder setId(String id) {
      this.id = id;
      return this;
    }

    Builder setIsActive(Boolean isActive) {
      this.isActive = isActive;
      return this;
    }

    Builder setKeyLength(Long keyLength) {
      this.keyLength = keyLength;
      return this;
    }

    Builder setKeyTag(Integer keyTag) {
      this.keyTag = keyTag;
      return this;
    }

    Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    Builder setPublicKey(String publicKey) {
      this.publicKey = publicKey;
      return this;
    }

    Builder setType(String type) {
      this.type = type;
      return this;
    }

    DnsKeyInfo build() {
      return new DnsKeyInfo(this);
    }
  }

  private DnsKeyInfo(Builder builder) {
    this.algorithm = builder.algorithm;
    this.creationTime = builder.creationTime;
    this.description = builder.description;
    this.digests = builder.digests;
    this.id = builder.id;
    this.isActive = builder.isActive;
    this.keyLength = builder.keyLength;
    this.keyTag = builder.keyTag;
    this.kind = builder.kind;
    this.publicKey = builder.publicKey;
    this.type = builder.type;
  }

  static Builder newBuilder() {
    return new Builder();
  }

  public String getAlgorithm() {
    return algorithm;
  }

  public String getCreationTime() {
    return creationTime;
  }

  public String getDescription() {
    return description;
  }

  public List<DnsKeyDigestInfo> getDigests() {
    return digests;
  }

  public String getId() {
    return id;
  }

  public Boolean getIsActive() {
    return isActive;
  }

  public Long getKeyLength() {
    return keyLength;
  }

  public Integer getKeyTag() {
    return keyTag;
  }

  public String getKind() {
    return kind;
  }

  public String getPublicKey() {
    return publicKey;
  }

  public String getType() {
    return type;
  }

  @Override
  public boolean equals(Object obj) {
    return obj == this
        || obj != null
            && obj.getClass().equals(DnsKeyInfo.class)
            && toProtobuf().equals(((DnsKeyInfo) obj).toProtobuf());
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

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("algorithm", algorithm)
        .add("creationTime", creationTime)
        .add("description", description)
        .add("digests", digests)
        .add("id", id)
        .add("isActive", isActive)
        .add("keyLength", keyLength)
        .add("keyTag", keyTag)
        .add("kind", kind)
        .add("publicKey", publicKey)
        .add("type", type)
        .toString();
  }

  DnsKey toProtobuf() {
    DnsKey dnsKey = new DnsKey();
    dnsKey.setAlgorithm(algorithm);
    dnsKey.setCreationTime(creationTime);
    dnsKey.setDescription(description);
    if (digests != null) {
      dnsKey.setDigests(Lists.transform(digests, DnsKeyDigestInfo.TO_PROTOBUF_FUNCTION));
    }
    dnsKey.setId(id);
    dnsKey.setIsActive(isActive);
    dnsKey.setKeyLength(keyLength);
    dnsKey.setKeyTag(keyTag);
    dnsKey.setKind(kind);
    dnsKey.setPublicKey(publicKey);
    dnsKey.setType(type);
    return dnsKey;
  }

  static DnsKeyInfo fromProtobuf(DnsKey dnsKey) {
    Builder builder = newBuilder();
    builder.setAlgorithm(dnsKey.getAlgorithm());
    builder.setCreationTime(dnsKey.getCreationTime());
    builder.setDescription(dnsKey.getDescription());
    if (dnsKey.getDigests() != null) {
      builder.setDigests(
          Lists.transform(dnsKey.getDigests(), DnsKeyDigestInfo.FROM_PROTOBUF_FUNCTION));
    }
    builder.setId(dnsKey.getId());
    builder.setIsActive(dnsKey.getIsActive());
    builder.setKeyLength(dnsKey.getKeyLength());
    builder.setKeyTag(dnsKey.getKeyTag());
    builder.setKind(dnsKey.getKind());
    builder.setPublicKey(dnsKey.getPublicKey());
    builder.setType(dnsKey.getType());
    return builder.build();
  }
}
