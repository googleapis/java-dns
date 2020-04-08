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
 * Request object for method dns.resourceRecordSets.list. Enumerate ResourceRecordSets that have
 * been created but not yet deleted.
 */
public final class ListResourceRecordSetsHttpRequest implements ApiMessage {
  private final String access_token;
  private final String callback;
  private final String fields;
  private final String key;
  private final String managedZone;
  private final Integer maxResults;
  private final String name;
  private final String pageToken;
  private final String prettyPrint;
  private final String quotaUser;
  private final String type;
  private final String userIp;

  private ListResourceRecordSetsHttpRequest() {
    this.access_token = null;
    this.callback = null;
    this.fields = null;
    this.key = null;
    this.managedZone = null;
    this.maxResults = null;
    this.name = null;
    this.pageToken = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.type = null;
    this.userIp = null;
  }

  private ListResourceRecordSetsHttpRequest(
      String access_token,
      String callback,
      String fields,
      String key,
      String managedZone,
      Integer maxResults,
      String name,
      String pageToken,
      String prettyPrint,
      String quotaUser,
      String type,
      String userIp) {
    this.access_token = access_token;
    this.callback = callback;
    this.fields = fields;
    this.key = key;
    this.managedZone = managedZone;
    this.maxResults = maxResults;
    this.name = name;
    this.pageToken = pageToken;
    this.prettyPrint = prettyPrint;
    this.quotaUser = quotaUser;
    this.type = type;
    this.userIp = userIp;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("access_token".equals(fieldName)) {
      return access_token;
    }
    if ("callback".equals(fieldName)) {
      return callback;
    }
    if ("fields".equals(fieldName)) {
      return fields;
    }
    if ("key".equals(fieldName)) {
      return key;
    }
    if ("managedZone".equals(fieldName)) {
      return managedZone;
    }
    if ("maxResults".equals(fieldName)) {
      return maxResults;
    }
    if ("name".equals(fieldName)) {
      return name;
    }
    if ("pageToken".equals(fieldName)) {
      return pageToken;
    }
    if ("prettyPrint".equals(fieldName)) {
      return prettyPrint;
    }
    if ("quotaUser".equals(fieldName)) {
      return quotaUser;
    }
    if ("type".equals(fieldName)) {
      return type;
    }
    if ("userIp".equals(fieldName)) {
      return userIp;
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

  /** OAuth 2.0 token for the current user. */
  public String getAccessToken() {
    return access_token;
  }

  /** Name of the JavaScript callback function that handles the response. */
  public String getCallback() {
    return callback;
  }

  /** Selector specifying a subset of fields to include in the response. */
  public String getFields() {
    return fields;
  }

  /** API key. Required unless you provide an OAuth 2.0 token. */
  public String getKey() {
    return key;
  }

  /**
   * Identifies the managed zone addressed by this request. Can be the managed zone name or id. It
   * must have the format `{project}/managedZones/{managedZone}/rrsets`. \`{managedZone}\` must
   * start with a letter, and contain only letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes
   * (\`-\`), &#42; underscores (\`_\`), periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent
   * &#42; signs (\`%\`). It must be between 3 and 255 characters in length, and it &#42; must not
   * start with \`"goog"\`.
   */
  public String getManagedZone() {
    return managedZone;
  }

  /**
   * Optional. Maximum number of results to be returned. If unspecified, the server will decide how
   * many results to return.
   */
  public Integer getMaxResults() {
    return maxResults;
  }

  /** Restricts the list to return only records with this fully qualified domain name. */
  public String getName() {
    return name;
  }

  /**
   * Optional. A tag returned by a previous list request that was truncated. Use this parameter to
   * continue a previous list request.
   */
  public String getPageToken() {
    return pageToken;
  }

  /** Returns response with indentations and line breaks. */
  public String getPrettyPrint() {
    return prettyPrint;
  }

  /** Alternative to userIp. */
  public String getQuotaUser() {
    return quotaUser;
  }

  /**
   * Restricts the list to return only records of this type. If present, the "name" parameter must
   * also be present.
   */
  public String getType() {
    return type;
  }

  /** IP address of the end user for whom the API call is being made. */
  public String getUserIp() {
    return userIp;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(ListResourceRecordSetsHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static ListResourceRecordSetsHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final ListResourceRecordSetsHttpRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new ListResourceRecordSetsHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private String callback;
    private String fields;
    private String key;
    private String managedZone;
    private Integer maxResults;
    private String name;
    private String pageToken;
    private String prettyPrint;
    private String quotaUser;
    private String type;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(ListResourceRecordSetsHttpRequest other) {
      if (other == ListResourceRecordSetsHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
      }
      if (other.getFields() != null) {
        this.fields = other.fields;
      }
      if (other.getKey() != null) {
        this.key = other.key;
      }
      if (other.getManagedZone() != null) {
        this.managedZone = other.managedZone;
      }
      if (other.getMaxResults() != null) {
        this.maxResults = other.maxResults;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getPageToken() != null) {
        this.pageToken = other.pageToken;
      }
      if (other.getPrettyPrint() != null) {
        this.prettyPrint = other.prettyPrint;
      }
      if (other.getQuotaUser() != null) {
        this.quotaUser = other.quotaUser;
      }
      if (other.getType() != null) {
        this.type = other.type;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      return this;
    }

    Builder(ListResourceRecordSetsHttpRequest source) {
      this.access_token = source.access_token;
      this.callback = source.callback;
      this.fields = source.fields;
      this.key = source.key;
      this.managedZone = source.managedZone;
      this.maxResults = source.maxResults;
      this.name = source.name;
      this.pageToken = source.pageToken;
      this.prettyPrint = source.prettyPrint;
      this.quotaUser = source.quotaUser;
      this.type = source.type;
      this.userIp = source.userIp;
    }

    /** OAuth 2.0 token for the current user. */
    public String getAccessToken() {
      return access_token;
    }

    /** OAuth 2.0 token for the current user. */
    public Builder setAccessToken(String access_token) {
      this.access_token = access_token;
      return this;
    }

    /** Name of the JavaScript callback function that handles the response. */
    public String getCallback() {
      return callback;
    }

    /** Name of the JavaScript callback function that handles the response. */
    public Builder setCallback(String callback) {
      this.callback = callback;
      return this;
    }

    /** Selector specifying a subset of fields to include in the response. */
    public String getFields() {
      return fields;
    }

    /** Selector specifying a subset of fields to include in the response. */
    public Builder setFields(String fields) {
      this.fields = fields;
      return this;
    }

    /** API key. Required unless you provide an OAuth 2.0 token. */
    public String getKey() {
      return key;
    }

    /** API key. Required unless you provide an OAuth 2.0 token. */
    public Builder setKey(String key) {
      this.key = key;
      return this;
    }

    /**
     * Identifies the managed zone addressed by this request. Can be the managed zone name or id. It
     * must have the format `{project}/managedZones/{managedZone}/rrsets`. \`{managedZone}\` must
     * start with a letter, and contain only letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes
     * (\`-\`), &#42; underscores (\`_\`), periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent
     * &#42; signs (\`%\`). It must be between 3 and 255 characters in length, and it &#42; must not
     * start with \`"goog"\`.
     */
    public String getManagedZone() {
      return managedZone;
    }

    /**
     * Identifies the managed zone addressed by this request. Can be the managed zone name or id. It
     * must have the format `{project}/managedZones/{managedZone}/rrsets`. \`{managedZone}\` must
     * start with a letter, and contain only letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes
     * (\`-\`), &#42; underscores (\`_\`), periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent
     * &#42; signs (\`%\`). It must be between 3 and 255 characters in length, and it &#42; must not
     * start with \`"goog"\`.
     */
    public Builder setManagedZone(String managedZone) {
      this.managedZone = managedZone;
      return this;
    }

    /**
     * Optional. Maximum number of results to be returned. If unspecified, the server will decide
     * how many results to return.
     */
    public Integer getMaxResults() {
      return maxResults;
    }

    /**
     * Optional. Maximum number of results to be returned. If unspecified, the server will decide
     * how many results to return.
     */
    public Builder setMaxResults(Integer maxResults) {
      this.maxResults = maxResults;
      return this;
    }

    /** Restricts the list to return only records with this fully qualified domain name. */
    public String getName() {
      return name;
    }

    /** Restricts the list to return only records with this fully qualified domain name. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * Optional. A tag returned by a previous list request that was truncated. Use this parameter to
     * continue a previous list request.
     */
    public String getPageToken() {
      return pageToken;
    }

    /**
     * Optional. A tag returned by a previous list request that was truncated. Use this parameter to
     * continue a previous list request.
     */
    public Builder setPageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }

    /** Returns response with indentations and line breaks. */
    public String getPrettyPrint() {
      return prettyPrint;
    }

    /** Returns response with indentations and line breaks. */
    public Builder setPrettyPrint(String prettyPrint) {
      this.prettyPrint = prettyPrint;
      return this;
    }

    /** Alternative to userIp. */
    public String getQuotaUser() {
      return quotaUser;
    }

    /** Alternative to userIp. */
    public Builder setQuotaUser(String quotaUser) {
      this.quotaUser = quotaUser;
      return this;
    }

    /**
     * Restricts the list to return only records of this type. If present, the "name" parameter must
     * also be present.
     */
    public String getType() {
      return type;
    }

    /**
     * Restricts the list to return only records of this type. If present, the "name" parameter must
     * also be present.
     */
    public Builder setType(String type) {
      this.type = type;
      return this;
    }

    /** IP address of the end user for whom the API call is being made. */
    public String getUserIp() {
      return userIp;
    }

    /** IP address of the end user for whom the API call is being made. */
    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }

    public ListResourceRecordSetsHttpRequest build() {
      String missing = "";

      if (managedZone == null) {
        missing += " managedZone";
      }

      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new ListResourceRecordSetsHttpRequest(
          access_token,
          callback,
          fields,
          key,
          managedZone,
          maxResults,
          name,
          pageToken,
          prettyPrint,
          quotaUser,
          type,
          userIp);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setCallback(this.callback);
      newBuilder.setFields(this.fields);
      newBuilder.setKey(this.key);
      newBuilder.setManagedZone(this.managedZone);
      newBuilder.setMaxResults(this.maxResults);
      newBuilder.setName(this.name);
      newBuilder.setPageToken(this.pageToken);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setType(this.type);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "ListResourceRecordSetsHttpRequest{"
        + "access_token="
        + access_token
        + ", "
        + "callback="
        + callback
        + ", "
        + "fields="
        + fields
        + ", "
        + "key="
        + key
        + ", "
        + "managedZone="
        + managedZone
        + ", "
        + "maxResults="
        + maxResults
        + ", "
        + "name="
        + name
        + ", "
        + "pageToken="
        + pageToken
        + ", "
        + "prettyPrint="
        + prettyPrint
        + ", "
        + "quotaUser="
        + quotaUser
        + ", "
        + "type="
        + type
        + ", "
        + "userIp="
        + userIp
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ListResourceRecordSetsHttpRequest) {
      ListResourceRecordSetsHttpRequest that = (ListResourceRecordSetsHttpRequest) o;
      return Objects.equals(this.access_token, that.getAccessToken())
          && Objects.equals(this.callback, that.getCallback())
          && Objects.equals(this.fields, that.getFields())
          && Objects.equals(this.key, that.getKey())
          && Objects.equals(this.managedZone, that.getManagedZone())
          && Objects.equals(this.maxResults, that.getMaxResults())
          && Objects.equals(this.name, that.getName())
          && Objects.equals(this.pageToken, that.getPageToken())
          && Objects.equals(this.prettyPrint, that.getPrettyPrint())
          && Objects.equals(this.quotaUser, that.getQuotaUser())
          && Objects.equals(this.type, that.getType())
          && Objects.equals(this.userIp, that.getUserIp());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        access_token,
        callback,
        fields,
        key,
        managedZone,
        maxResults,
        name,
        pageToken,
        prettyPrint,
        quotaUser,
        type,
        userIp);
  }
}
