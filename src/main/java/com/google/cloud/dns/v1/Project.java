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
 * A project resource. The project is a top level container for resources including Cloud DNS
 * ManagedZones. Projects can be created only in the APIs console.
 */
public final class Project implements ApiMessage {
  private final String id;
  private final String kind;
  private final String number;
  private final Quota quota;

  private Project() {
    this.id = null;
    this.kind = null;
    this.number = null;
    this.quota = null;
  }

  private Project(String id, String kind, String number, Quota quota) {
    this.id = id;
    this.kind = kind;
    this.number = number;
    this.quota = quota;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("id".equals(fieldName)) {
      return id;
    }
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("number".equals(fieldName)) {
      return number;
    }
    if ("quota".equals(fieldName)) {
      return quota;
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

  /** User assigned unique identifier for the resource (output only). */
  public String getId() {
    return id;
  }

  /** Identifies what kind of resource this is. Value: the fixed string "dns#project". */
  public String getKind() {
    return kind;
  }

  /** Unique numeric identifier for the resource; defined by the server (output only). */
  public String getNumber() {
    return number;
  }

  /** Quotas assigned to this project (output only). */
  public Quota getQuota() {
    return quota;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(Project prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Project getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final Project DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new Project();
  }

  public static class Builder {
    private String id;
    private String kind;
    private String number;
    private Quota quota;

    Builder() {}

    public Builder mergeFrom(Project other) {
      if (other == Project.getDefaultInstance()) return this;
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getNumber() != null) {
        this.number = other.number;
      }
      if (other.getQuota() != null) {
        this.quota = other.quota;
      }
      return this;
    }

    Builder(Project source) {
      this.id = source.id;
      this.kind = source.kind;
      this.number = source.number;
      this.quota = source.quota;
    }

    /** User assigned unique identifier for the resource (output only). */
    public String getId() {
      return id;
    }

    /** User assigned unique identifier for the resource (output only). */
    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    /** Identifies what kind of resource this is. Value: the fixed string "dns#project". */
    public String getKind() {
      return kind;
    }

    /** Identifies what kind of resource this is. Value: the fixed string "dns#project". */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /** Unique numeric identifier for the resource; defined by the server (output only). */
    public String getNumber() {
      return number;
    }

    /** Unique numeric identifier for the resource; defined by the server (output only). */
    public Builder setNumber(String number) {
      this.number = number;
      return this;
    }

    /** Quotas assigned to this project (output only). */
    public Quota getQuota() {
      return quota;
    }

    /** Quotas assigned to this project (output only). */
    public Builder setQuota(Quota quota) {
      this.quota = quota;
      return this;
    }

    public Project build() {

      return new Project(id, kind, number, quota);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setId(this.id);
      newBuilder.setKind(this.kind);
      newBuilder.setNumber(this.number);
      newBuilder.setQuota(this.quota);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Project{"
        + "id="
        + id
        + ", "
        + "kind="
        + kind
        + ", "
        + "number="
        + number
        + ", "
        + "quota="
        + quota
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Project) {
      Project that = (Project) o;
      return Objects.equals(this.id, that.getId())
          && Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.number, that.getNumber())
          && Objects.equals(this.quota, that.getQuota());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, number, quota);
  }
}
