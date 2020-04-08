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
public final class OperationManagedZoneContext implements ApiMessage {
  private final ManagedZone newValue;
  private final ManagedZone oldValue;

  private OperationManagedZoneContext() {
    this.newValue = null;
    this.oldValue = null;
  }

  private OperationManagedZoneContext(ManagedZone newValue, ManagedZone oldValue) {
    this.newValue = newValue;
    this.oldValue = oldValue;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("newValue".equals(fieldName)) {
      return newValue;
    }
    if ("oldValue".equals(fieldName)) {
      return oldValue;
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

  /** The post-operation ManagedZone resource. */
  public ManagedZone getNewValue() {
    return newValue;
  }

  /** The pre-operation ManagedZone resource. */
  public ManagedZone getOldValue() {
    return oldValue;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(OperationManagedZoneContext prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static OperationManagedZoneContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final OperationManagedZoneContext DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new OperationManagedZoneContext();
  }

  public static class Builder {
    private ManagedZone newValue;
    private ManagedZone oldValue;

    Builder() {}

    public Builder mergeFrom(OperationManagedZoneContext other) {
      if (other == OperationManagedZoneContext.getDefaultInstance()) return this;
      if (other.getNewValue() != null) {
        this.newValue = other.newValue;
      }
      if (other.getOldValue() != null) {
        this.oldValue = other.oldValue;
      }
      return this;
    }

    Builder(OperationManagedZoneContext source) {
      this.newValue = source.newValue;
      this.oldValue = source.oldValue;
    }

    /** The post-operation ManagedZone resource. */
    public ManagedZone getNewValue() {
      return newValue;
    }

    /** The post-operation ManagedZone resource. */
    public Builder setNewValue(ManagedZone newValue) {
      this.newValue = newValue;
      return this;
    }

    /** The pre-operation ManagedZone resource. */
    public ManagedZone getOldValue() {
      return oldValue;
    }

    /** The pre-operation ManagedZone resource. */
    public Builder setOldValue(ManagedZone oldValue) {
      this.oldValue = oldValue;
      return this;
    }

    public OperationManagedZoneContext build() {

      return new OperationManagedZoneContext(newValue, oldValue);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setNewValue(this.newValue);
      newBuilder.setOldValue(this.oldValue);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "OperationManagedZoneContext{"
        + "newValue="
        + newValue
        + ", "
        + "oldValue="
        + oldValue
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OperationManagedZoneContext) {
      OperationManagedZoneContext that = (OperationManagedZoneContext) o;
      return Objects.equals(this.newValue, that.getNewValue())
          && Objects.equals(this.oldValue, that.getOldValue());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(newValue, oldValue);
  }
}
