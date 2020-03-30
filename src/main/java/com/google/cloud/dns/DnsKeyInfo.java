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
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class DnsKeyInfo implements Serializable {

  static Function<DnsKey, DnsKeyInfo> FROM_PB_FUNCTION =
      new Function<DnsKey, DnsKeyInfo>() {
        @Override
        public DnsKeyInfo apply(DnsKey dnsKey) {
          return DnsKeyInfo.fromPb(dnsKey);
        }
      };

  private final String algorithm;
  private final String creationTime;
  private final String description;
  private final List<DnsKeyDigest> digests;
  private final String id;
  private final Boolean isActive;
  private final Long keyLength;
  private final Integer keyTag;
  private final String kind;
  private final String publicKey;
  private final String type;

  static class DnsKeyDigest implements Serializable {

    static Function<com.google.api.services.dns.model.DnsKeyDigest, DnsKeyDigest> FROM_PB_FUNCTION =
        new Function<com.google.api.services.dns.model.DnsKeyDigest, DnsKeyDigest>() {
          @Override
          public DnsKeyDigest apply(com.google.api.services.dns.model.DnsKeyDigest dnsKeyDigest) {
            return DnsKeyDigest.fromPb(dnsKeyDigest);
          }
        };

    static Function<DnsKeyDigest, com.google.api.services.dns.model.DnsKeyDigest> TO_PB_FUNCTION =
        new Function<DnsKeyDigest, com.google.api.services.dns.model.DnsKeyDigest>() {
          @Override
          public com.google.api.services.dns.model.DnsKeyDigest apply(DnsKeyDigest dnsKeyDigest) {
            return dnsKeyDigest.toPb();
          }
        };

    private final String digest;
    private final String type;

    static class Builder {

      private String digest;
      private String type;

      /**
       * sets the base-16 encoded bytes of this digest. Suitable for use in a DS resource record.
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

      DnsKeyDigest build() {
        return new DnsKeyDigest(this);
      }
    }

    private DnsKeyDigest(Builder builder) {
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

    com.google.api.services.dns.model.DnsKeyDigest toPb() {
      com.google.api.services.dns.model.DnsKeyDigest dnsKeyDigest =
          new com.google.api.services.dns.model.DnsKeyDigest();
      dnsKeyDigest.setDigest(digest);
      dnsKeyDigest.setType(type);
      return dnsKeyDigest;
    }

    static DnsKeyDigest fromPb(com.google.api.services.dns.model.DnsKeyDigest dnsKeyDigest) {
      Builder builder = newBuilder();
      if (dnsKeyDigest.getDigest() != null) {
        builder.setDigest(dnsKeyDigest.getDigest());
      }
      if (dnsKeyDigest.getType() != null) {
        builder.setType(dnsKeyDigest.getType());
      }
      return builder.build();
    }

    @Override
    public boolean equals(Object other) {
      return (other instanceof DnsKeyDigest) && this.toPb().equals(((DnsKeyDigest) other).toPb());
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
    private List<DnsKeyDigest> digests;
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

    Builder setDigests(List<DnsKeyDigest> digests) {
      this.digests = digests;
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

  public List<DnsKeyDigest> getDigests() {
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
            && toPb().equals(((DnsKeyInfo) obj).toPb());
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

  DnsKey toPb() {
    DnsKey dnsKey = new DnsKey();
    dnsKey.setAlgorithm(algorithm);
    dnsKey.setCreationTime(creationTime);
    dnsKey.setDescription(description);
    dnsKey.setDigests(Lists.transform(digests, DnsKeyDigest.TO_PB_FUNCTION));
    dnsKey.setId(id);
    dnsKey.setIsActive(isActive);
    dnsKey.setKeyLength(keyLength);
    dnsKey.setKeyTag(keyTag);
    dnsKey.setKind(kind);
    dnsKey.setPublicKey(publicKey);
    dnsKey.setType(type);
    return dnsKey;
  }

  static DnsKeyInfo fromPb(DnsKey dnsKey) {
    Builder builder = newBuilder();
    if (dnsKey.getAlgorithm() != null) {
      builder.setAlgorithm(dnsKey.getAlgorithm());
    }
    if (dnsKey.getCreationTime() != null) {
      builder.setCreationTime(dnsKey.getCreationTime());
    }
    if (dnsKey.getDescription() != null) {
      builder.setDescription(dnsKey.getDescription());
    }
    if (dnsKey.getDigests() != null) {
      builder.setDigests(Lists.transform(dnsKey.getDigests(), DnsKeyDigest.FROM_PB_FUNCTION));
    }
    if (dnsKey.getId() != null) {
      builder.setId(dnsKey.getId());
    }
    if (dnsKey.getIsActive() != null) {
      builder.setIsActive(dnsKey.getIsActive());
    }
    if (dnsKey.getKeyLength() != null) {
      builder.setKeyLength(dnsKey.getKeyLength());
    }
    if (dnsKey.getKeyTag() != null) {
      builder.setKeyTag(dnsKey.getKeyTag());
    }
    if (dnsKey.getKind() != null) {
      builder.setKind(dnsKey.getKind());
    }
    if (dnsKey.getPublicKey() != null) {
      builder.setPublicKey(dnsKey.getPublicKey());
    }
    if (dnsKey.getType() != null) {
      builder.setType(dnsKey.getType());
    }
    return builder.build();
  }
}
