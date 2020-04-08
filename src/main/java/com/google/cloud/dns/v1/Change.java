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
/**
 * A Change represents a set of ResourceRecordSet additions and deletions applied atomically to a
 * ManagedZone. ResourceRecordSets within a ManagedZone are modified by creating a new Change
 * element in the Changes collection. In turn the Changes collection also records the past
 * modifications to the ResourceRecordSets in a ManagedZone. The current state of the ManagedZone is
 * the sum effect of applying all Change elements in the Changes collection in sequence.
 */
public final class Change implements ApiMessage {
  private final List<ResourceRecordSet> additions;
  private final List<ResourceRecordSet> deletions;
  private final String id;
  private final Boolean isServing;
  private final String kind;
  private final String startTime;
  private final String status;

  private Change() {
    this.additions = null;
    this.deletions = null;
    this.id = null;
    this.isServing = null;
    this.kind = null;
    this.startTime = null;
    this.status = null;
  }

  private Change(
      List<ResourceRecordSet> additions,
      List<ResourceRecordSet> deletions,
      String id,
      Boolean isServing,
      String kind,
      String startTime,
      String status) {
    this.additions = additions;
    this.deletions = deletions;
    this.id = id;
    this.isServing = isServing;
    this.kind = kind;
    this.startTime = startTime;
    this.status = status;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("additions".equals(fieldName)) {
      return additions;
    }
    if ("deletions".equals(fieldName)) {
      return deletions;
    }
    if ("id".equals(fieldName)) {
      return id;
    }
    if ("isServing".equals(fieldName)) {
      return isServing;
    }
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("startTime".equals(fieldName)) {
      return startTime;
    }
    if ("status".equals(fieldName)) {
      return status;
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

  /** Which ResourceRecordSets to add? */
  public List<ResourceRecordSet> getAdditionsList() {
    return additions;
  }

  /** Which ResourceRecordSets to remove? Must match existing data exactly. */
  public List<ResourceRecordSet> getDeletionsList() {
    return deletions;
  }

  /** Unique identifier for the resource; defined by the server (output only). */
  public String getId() {
    return id;
  }

  /** If the DNS queries for the zone will be served. */
  public Boolean getIsServing() {
    return isServing;
  }

  /** Identifies what kind of resource this is. Value: the fixed string "dns#change". */
  public String getKind() {
    return kind;
  }

  /**
   * The time that this operation was started by the server (output only). This is in RFC3339 text
   * format.
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Status of the operation (output only). A status of "done" means that the request to update the
   * authoritative servers has been sent, but the servers might not be updated yet.
   */
  public String getStatus() {
    return status;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(Change prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Change getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final Change DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new Change();
  }

  public static class Builder {
    private List<ResourceRecordSet> additions;
    private List<ResourceRecordSet> deletions;
    private String id;
    private Boolean isServing;
    private String kind;
    private String startTime;
    private String status;

    Builder() {}

    public Builder mergeFrom(Change other) {
      if (other == Change.getDefaultInstance()) return this;
      if (other.getAdditionsList() != null) {
        this.additions = other.additions;
      }
      if (other.getDeletionsList() != null) {
        this.deletions = other.deletions;
      }
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getIsServing() != null) {
        this.isServing = other.isServing;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getStartTime() != null) {
        this.startTime = other.startTime;
      }
      if (other.getStatus() != null) {
        this.status = other.status;
      }
      return this;
    }

    Builder(Change source) {
      this.additions = source.additions;
      this.deletions = source.deletions;
      this.id = source.id;
      this.isServing = source.isServing;
      this.kind = source.kind;
      this.startTime = source.startTime;
      this.status = source.status;
    }

    /** Which ResourceRecordSets to add? */
    public List<ResourceRecordSet> getAdditionsList() {
      return additions;
    }

    /** Which ResourceRecordSets to add? */
    public Builder addAllAdditions(List<ResourceRecordSet> additions) {
      if (this.additions == null) {
        this.additions = new LinkedList<>();
      }
      this.additions.addAll(additions);
      return this;
    }

    /** Which ResourceRecordSets to add? */
    public Builder addAdditions(ResourceRecordSet additions) {
      if (this.additions == null) {
        this.additions = new LinkedList<>();
      }
      this.additions.add(additions);
      return this;
    }

    /** Which ResourceRecordSets to remove? Must match existing data exactly. */
    public List<ResourceRecordSet> getDeletionsList() {
      return deletions;
    }

    /** Which ResourceRecordSets to remove? Must match existing data exactly. */
    public Builder addAllDeletions(List<ResourceRecordSet> deletions) {
      if (this.deletions == null) {
        this.deletions = new LinkedList<>();
      }
      this.deletions.addAll(deletions);
      return this;
    }

    /** Which ResourceRecordSets to remove? Must match existing data exactly. */
    public Builder addDeletions(ResourceRecordSet deletions) {
      if (this.deletions == null) {
        this.deletions = new LinkedList<>();
      }
      this.deletions.add(deletions);
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

    /** If the DNS queries for the zone will be served. */
    public Boolean getIsServing() {
      return isServing;
    }

    /** If the DNS queries for the zone will be served. */
    public Builder setIsServing(Boolean isServing) {
      this.isServing = isServing;
      return this;
    }

    /** Identifies what kind of resource this is. Value: the fixed string "dns#change". */
    public String getKind() {
      return kind;
    }

    /** Identifies what kind of resource this is. Value: the fixed string "dns#change". */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * The time that this operation was started by the server (output only). This is in RFC3339 text
     * format.
     */
    public String getStartTime() {
      return startTime;
    }

    /**
     * The time that this operation was started by the server (output only). This is in RFC3339 text
     * format.
     */
    public Builder setStartTime(String startTime) {
      this.startTime = startTime;
      return this;
    }

    /**
     * Status of the operation (output only). A status of "done" means that the request to update
     * the authoritative servers has been sent, but the servers might not be updated yet.
     */
    public String getStatus() {
      return status;
    }

    /**
     * Status of the operation (output only). A status of "done" means that the request to update
     * the authoritative servers has been sent, but the servers might not be updated yet.
     */
    public Builder setStatus(String status) {
      this.status = status;
      return this;
    }

    public Change build() {

      return new Change(additions, deletions, id, isServing, kind, startTime, status);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllAdditions(this.additions);
      newBuilder.addAllDeletions(this.deletions);
      newBuilder.setId(this.id);
      newBuilder.setIsServing(this.isServing);
      newBuilder.setKind(this.kind);
      newBuilder.setStartTime(this.startTime);
      newBuilder.setStatus(this.status);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Change{"
        + "additions="
        + additions
        + ", "
        + "deletions="
        + deletions
        + ", "
        + "id="
        + id
        + ", "
        + "isServing="
        + isServing
        + ", "
        + "kind="
        + kind
        + ", "
        + "startTime="
        + startTime
        + ", "
        + "status="
        + status
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Change) {
      Change that = (Change) o;
      return Objects.equals(this.additions, that.getAdditionsList())
          && Objects.equals(this.deletions, that.getDeletionsList())
          && Objects.equals(this.id, that.getId())
          && Objects.equals(this.isServing, that.getIsServing())
          && Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.startTime, that.getStartTime())
          && Objects.equals(this.status, that.getStatus());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(additions, deletions, id, isServing, kind, startTime, status);
  }
}
