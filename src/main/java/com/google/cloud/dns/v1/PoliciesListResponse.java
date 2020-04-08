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
public final class PoliciesListResponse implements ApiMessage {
  private final ResponseHeader header;
  private final String kind;
  private final String nextPageToken;
  private final List<Policy> policies;

  private PoliciesListResponse() {
    this.header = null;
    this.kind = null;
    this.nextPageToken = null;
    this.policies = null;
  }

  private PoliciesListResponse(
      ResponseHeader header, String kind, String nextPageToken, List<Policy> policies) {
    this.header = header;
    this.kind = kind;
    this.nextPageToken = nextPageToken;
    this.policies = policies;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("header".equals(fieldName)) {
      return header;
    }
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("nextPageToken".equals(fieldName)) {
      return nextPageToken;
    }
    if ("policies".equals(fieldName)) {
      return policies;
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

  /** Type of resource. */
  public String getKind() {
    return kind;
  }

  /**
   * The presence of this field indicates that there exist more results following your last page of
   * results in pagination order. To fetch them, make another list request using this value as your
   * page token.
   *
   * <p>In this way you can retrieve the complete contents of even very large collections one page
   * at a time. However, if the contents of the collection change between the first and last
   * paginated list request, the set of all elements returned will be an inconsistent view of the
   * collection. There is no way to retrieve a consistent snapshot of a collection larger than the
   * maximum page size.
   */
  public String getNextPageToken() {
    return nextPageToken;
  }

  /** The policy resources. */
  public List<Policy> getPoliciesList() {
    return policies;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(PoliciesListResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static PoliciesListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final PoliciesListResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new PoliciesListResponse();
  }

  public static class Builder {
    private ResponseHeader header;
    private String kind;
    private String nextPageToken;
    private List<Policy> policies;

    Builder() {}

    public Builder mergeFrom(PoliciesListResponse other) {
      if (other == PoliciesListResponse.getDefaultInstance()) return this;
      if (other.getHeader() != null) {
        this.header = other.header;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getNextPageToken() != null) {
        this.nextPageToken = other.nextPageToken;
      }
      if (other.getPoliciesList() != null) {
        this.policies = other.policies;
      }
      return this;
    }

    Builder(PoliciesListResponse source) {
      this.header = source.header;
      this.kind = source.kind;
      this.nextPageToken = source.nextPageToken;
      this.policies = source.policies;
    }

    public ResponseHeader getHeader() {
      return header;
    }

    public Builder setHeader(ResponseHeader header) {
      this.header = header;
      return this;
    }

    /** Type of resource. */
    public String getKind() {
      return kind;
    }

    /** Type of resource. */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * The presence of this field indicates that there exist more results following your last page
     * of results in pagination order. To fetch them, make another list request using this value as
     * your page token.
     *
     * <p>In this way you can retrieve the complete contents of even very large collections one page
     * at a time. However, if the contents of the collection change between the first and last
     * paginated list request, the set of all elements returned will be an inconsistent view of the
     * collection. There is no way to retrieve a consistent snapshot of a collection larger than the
     * maximum page size.
     */
    public String getNextPageToken() {
      return nextPageToken;
    }

    /**
     * The presence of this field indicates that there exist more results following your last page
     * of results in pagination order. To fetch them, make another list request using this value as
     * your page token.
     *
     * <p>In this way you can retrieve the complete contents of even very large collections one page
     * at a time. However, if the contents of the collection change between the first and last
     * paginated list request, the set of all elements returned will be an inconsistent view of the
     * collection. There is no way to retrieve a consistent snapshot of a collection larger than the
     * maximum page size.
     */
    public Builder setNextPageToken(String nextPageToken) {
      this.nextPageToken = nextPageToken;
      return this;
    }

    /** The policy resources. */
    public List<Policy> getPoliciesList() {
      return policies;
    }

    /** The policy resources. */
    public Builder addAllPolicies(List<Policy> policies) {
      if (this.policies == null) {
        this.policies = new LinkedList<>();
      }
      this.policies.addAll(policies);
      return this;
    }

    /** The policy resources. */
    public Builder addPolicies(Policy policies) {
      if (this.policies == null) {
        this.policies = new LinkedList<>();
      }
      this.policies.add(policies);
      return this;
    }

    public PoliciesListResponse build() {

      return new PoliciesListResponse(header, kind, nextPageToken, policies);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setHeader(this.header);
      newBuilder.setKind(this.kind);
      newBuilder.setNextPageToken(this.nextPageToken);
      newBuilder.addAllPolicies(this.policies);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "PoliciesListResponse{"
        + "header="
        + header
        + ", "
        + "kind="
        + kind
        + ", "
        + "nextPageToken="
        + nextPageToken
        + ", "
        + "policies="
        + policies
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PoliciesListResponse) {
      PoliciesListResponse that = (PoliciesListResponse) o;
      return Objects.equals(this.header, that.getHeader())
          && Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.nextPageToken, that.getNextPageToken())
          && Objects.equals(this.policies, that.getPoliciesList());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, kind, nextPageToken, policies);
  }
}
