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
public final class OperationDnsKeyContext implements ApiMessage {
  private final DnsKey newValue;
  private final DnsKey oldValue;

  private OperationDnsKeyContext() {
    this.newValue = null;
    this.oldValue = null;
  }

  private OperationDnsKeyContext(DnsKey newValue, DnsKey oldValue) {
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

  /** The post-operation DnsKey resource. */
  public DnsKey getNewValue() {
    return newValue;
  }

  /** The pre-operation DnsKey resource. */
  public DnsKey getOldValue() {
    return oldValue;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(OperationDnsKeyContext prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static OperationDnsKeyContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final OperationDnsKeyContext DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new OperationDnsKeyContext();
  }

  public static class Builder {
    private DnsKey newValue;
    private DnsKey oldValue;

    Builder() {}

    public Builder mergeFrom(OperationDnsKeyContext other) {
      if (other == OperationDnsKeyContext.getDefaultInstance()) return this;
      if (other.getNewValue() != null) {
        this.newValue = other.newValue;
      }
      if (other.getOldValue() != null) {
        this.oldValue = other.oldValue;
      }
      return this;
    }

    Builder(OperationDnsKeyContext source) {
      this.newValue = source.newValue;
      this.oldValue = source.oldValue;
    }

    /** The post-operation DnsKey resource. */
    public DnsKey getNewValue() {
      return newValue;
    }

    /** The post-operation DnsKey resource. */
    public Builder setNewValue(DnsKey newValue) {
      this.newValue = newValue;
      return this;
    }

    /** The pre-operation DnsKey resource. */
    public DnsKey getOldValue() {
      return oldValue;
    }

    /** The pre-operation DnsKey resource. */
    public Builder setOldValue(DnsKey oldValue) {
      this.oldValue = oldValue;
      return this;
    }

    public OperationDnsKeyContext build() {

      return new OperationDnsKeyContext(newValue, oldValue);
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
    return "OperationDnsKeyContext{" + "newValue=" + newValue + ", " + "oldValue=" + oldValue + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof OperationDnsKeyContext) {
      OperationDnsKeyContext that = (OperationDnsKeyContext) o;
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
