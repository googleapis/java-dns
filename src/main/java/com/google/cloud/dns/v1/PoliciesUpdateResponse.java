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
public final class PoliciesUpdateResponse implements ApiMessage {
  private final ResponseHeader header;
  private final Policy policy;

  private PoliciesUpdateResponse() {
    this.header = null;
    this.policy = null;
  }

  private PoliciesUpdateResponse(ResponseHeader header, Policy policy) {
    this.header = header;
    this.policy = policy;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("header".equals(fieldName)) {
      return header;
    }
    if ("policy".equals(fieldName)) {
      return policy;
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

  public ResponseHeader getHeader() {
    return header;
  }

  public Policy getPolicy() {
    return policy;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(PoliciesUpdateResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static PoliciesUpdateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final PoliciesUpdateResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new PoliciesUpdateResponse();
  }

  public static class Builder {
    private ResponseHeader header;
    private Policy policy;

    Builder() {}

    public Builder mergeFrom(PoliciesUpdateResponse other) {
      if (other == PoliciesUpdateResponse.getDefaultInstance()) return this;
      if (other.getHeader() != null) {
        this.header = other.header;
      }
      if (other.getPolicy() != null) {
        this.policy = other.policy;
      }
      return this;
    }

    Builder(PoliciesUpdateResponse source) {
      this.header = source.header;
      this.policy = source.policy;
    }

    public ResponseHeader getHeader() {
      return header;
    }

    public Builder setHeader(ResponseHeader header) {
      this.header = header;
      return this;
    }

    public Policy getPolicy() {
      return policy;
    }

    public Builder setPolicy(Policy policy) {
      this.policy = policy;
      return this;
    }

    public PoliciesUpdateResponse build() {

      return new PoliciesUpdateResponse(header, policy);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setHeader(this.header);
      newBuilder.setPolicy(this.policy);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "PoliciesUpdateResponse{" + "header=" + header + ", " + "policy=" + policy + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PoliciesUpdateResponse) {
      PoliciesUpdateResponse that = (PoliciesUpdateResponse) o;
      return Objects.equals(this.header, that.getHeader())
          && Objects.equals(this.policy, that.getPolicy());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, policy);
  }
}
