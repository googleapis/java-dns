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
/** A unit of data that will be returned by the DNS servers. */
public final class ResourceRecordSet implements ApiMessage {
  private final String kind;
  private final String name;
  private final List<String> rrdatas;
  private final List<String> signatureRrdatas;
  private final Integer ttl;
  private final String type;

  private ResourceRecordSet() {
    this.kind = null;
    this.name = null;
    this.rrdatas = null;
    this.signatureRrdatas = null;
    this.ttl = null;
    this.type = null;
  }

  private ResourceRecordSet(
      String kind,
      String name,
      List<String> rrdatas,
      List<String> signatureRrdatas,
      Integer ttl,
      String type) {
    this.kind = kind;
    this.name = name;
    this.rrdatas = rrdatas;
    this.signatureRrdatas = signatureRrdatas;
    this.ttl = ttl;
    this.type = type;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("name".equals(fieldName)) {
      return name;
    }
    if ("rrdatas".equals(fieldName)) {
      return rrdatas;
    }
    if ("signatureRrdatas".equals(fieldName)) {
      return signatureRrdatas;
    }
    if ("ttl".equals(fieldName)) {
      return ttl;
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

  /** Identifies what kind of resource this is. Value: the fixed string "dns#resourceRecordSet". */
  public String getKind() {
    return kind;
  }

  /** For example, www.example.com. */
  public String getName() {
    return name;
  }

  /** As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples. */
  public List<String> getRrdatasList() {
    return rrdatas;
  }

  /** As defined in RFC 4034 (section 3.2). */
  public List<String> getSignatureRrdatasList() {
    return signatureRrdatas;
  }

  /** Number of seconds that this ResourceRecordSet can be cached by resolvers. */
  public Integer getTtl() {
    return ttl;
  }

  /** The identifier of a supported record type. See the list of Supported DNS record types. */
  public String getType() {
    return type;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(ResourceRecordSet prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static ResourceRecordSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final ResourceRecordSet DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new ResourceRecordSet();
  }

  public static class Builder {
    private String kind;
    private String name;
    private List<String> rrdatas;
    private List<String> signatureRrdatas;
    private Integer ttl;
    private String type;

    Builder() {}

    public Builder mergeFrom(ResourceRecordSet other) {
      if (other == ResourceRecordSet.getDefaultInstance()) return this;
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getRrdatasList() != null) {
        this.rrdatas = other.rrdatas;
      }
      if (other.getSignatureRrdatasList() != null) {
        this.signatureRrdatas = other.signatureRrdatas;
      }
      if (other.getTtl() != null) {
        this.ttl = other.ttl;
      }
      if (other.getType() != null) {
        this.type = other.type;
      }
      return this;
    }

    Builder(ResourceRecordSet source) {
      this.kind = source.kind;
      this.name = source.name;
      this.rrdatas = source.rrdatas;
      this.signatureRrdatas = source.signatureRrdatas;
      this.ttl = source.ttl;
      this.type = source.type;
    }

    /**
     * Identifies what kind of resource this is. Value: the fixed string "dns#resourceRecordSet".
     */
    public String getKind() {
      return kind;
    }

    /**
     * Identifies what kind of resource this is. Value: the fixed string "dns#resourceRecordSet".
     */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /** For example, www.example.com. */
    public String getName() {
      return name;
    }

    /** For example, www.example.com. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples. */
    public List<String> getRrdatasList() {
      return rrdatas;
    }

    /** As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples. */
    public Builder addAllRrdatas(List<String> rrdatas) {
      if (this.rrdatas == null) {
        this.rrdatas = new LinkedList<>();
      }
      this.rrdatas.addAll(rrdatas);
      return this;
    }

    /** As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples. */
    public Builder addRrdatas(String rrdatas) {
      if (this.rrdatas == null) {
        this.rrdatas = new LinkedList<>();
      }
      this.rrdatas.add(rrdatas);
      return this;
    }

    /** As defined in RFC 4034 (section 3.2). */
    public List<String> getSignatureRrdatasList() {
      return signatureRrdatas;
    }

    /** As defined in RFC 4034 (section 3.2). */
    public Builder addAllSignatureRrdatas(List<String> signatureRrdatas) {
      if (this.signatureRrdatas == null) {
        this.signatureRrdatas = new LinkedList<>();
      }
      this.signatureRrdatas.addAll(signatureRrdatas);
      return this;
    }

    /** As defined in RFC 4034 (section 3.2). */
    public Builder addSignatureRrdatas(String signatureRrdatas) {
      if (this.signatureRrdatas == null) {
        this.signatureRrdatas = new LinkedList<>();
      }
      this.signatureRrdatas.add(signatureRrdatas);
      return this;
    }

    /** Number of seconds that this ResourceRecordSet can be cached by resolvers. */
    public Integer getTtl() {
      return ttl;
    }

    /** Number of seconds that this ResourceRecordSet can be cached by resolvers. */
    public Builder setTtl(Integer ttl) {
      this.ttl = ttl;
      return this;
    }

    /** The identifier of a supported record type. See the list of Supported DNS record types. */
    public String getType() {
      return type;
    }

    /** The identifier of a supported record type. See the list of Supported DNS record types. */
    public Builder setType(String type) {
      this.type = type;
      return this;
    }

    public ResourceRecordSet build() {

      return new ResourceRecordSet(kind, name, rrdatas, signatureRrdatas, ttl, type);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setKind(this.kind);
      newBuilder.setName(this.name);
      newBuilder.addAllRrdatas(this.rrdatas);
      newBuilder.addAllSignatureRrdatas(this.signatureRrdatas);
      newBuilder.setTtl(this.ttl);
      newBuilder.setType(this.type);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "ResourceRecordSet{"
        + "kind="
        + kind
        + ", "
        + "name="
        + name
        + ", "
        + "rrdatas="
        + rrdatas
        + ", "
        + "signatureRrdatas="
        + signatureRrdatas
        + ", "
        + "ttl="
        + ttl
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
    if (o instanceof ResourceRecordSet) {
      ResourceRecordSet that = (ResourceRecordSet) o;
      return Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.name, that.getName())
          && Objects.equals(this.rrdatas, that.getRrdatasList())
          && Objects.equals(this.signatureRrdatas, that.getSignatureRrdatasList())
          && Objects.equals(this.ttl, that.getTtl())
          && Objects.equals(this.type, that.getType());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, name, rrdatas, signatureRrdatas, ttl, type);
  }
}
