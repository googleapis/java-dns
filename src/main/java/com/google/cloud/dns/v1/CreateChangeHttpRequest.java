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
 * Request object for method dns.changes.create. Atomically update the ResourceRecordSet collection.
 */
public final class CreateChangeHttpRequest implements ApiMessage {
  private final String access_token;
  private final String callback;
  private final Change changeResource;
  private final String clientOperationId;
  private final String fields;
  private final String key;
  private final String managedZone;
  private final String prettyPrint;
  private final String quotaUser;
  private final String userIp;

  private CreateChangeHttpRequest() {
    this.access_token = null;
    this.callback = null;
    this.changeResource = null;
    this.clientOperationId = null;
    this.fields = null;
    this.key = null;
    this.managedZone = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.userIp = null;
  }

  private CreateChangeHttpRequest(
      String access_token,
      String callback,
      Change changeResource,
      String clientOperationId,
      String fields,
      String key,
      String managedZone,
      String prettyPrint,
      String quotaUser,
      String userIp) {
    this.access_token = access_token;
    this.callback = callback;
    this.changeResource = changeResource;
    this.clientOperationId = clientOperationId;
    this.fields = fields;
    this.key = key;
    this.managedZone = managedZone;
    this.prettyPrint = prettyPrint;
    this.quotaUser = quotaUser;
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
    if ("changeResource".equals(fieldName)) {
      return changeResource;
    }
    if ("clientOperationId".equals(fieldName)) {
      return clientOperationId;
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
    if ("prettyPrint".equals(fieldName)) {
      return prettyPrint;
    }
    if ("quotaUser".equals(fieldName)) {
      return quotaUser;
    }
    if ("userIp".equals(fieldName)) {
      return userIp;
    }
    return null;
  }

  @Nullable
  @Override
  public Change getApiMessageRequestBody() {
    return changeResource;
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

  /**
   * A Change represents a set of ResourceRecordSet additions and deletions applied atomically to a
   * ManagedZone. ResourceRecordSets within a ManagedZone are modified by creating a new Change
   * element in the Changes collection. In turn the Changes collection also records the past
   * modifications to the ResourceRecordSets in a ManagedZone. The current state of the ManagedZone
   * is the sum effect of applying all Change elements in the Changes collection in sequence.
   */
  public Change getChangeResource() {
    return changeResource;
  }

  /**
   * For mutating operation requests only. An optional identifier specified by the client. Must be
   * unique for operation resources in the Operations collection.
   */
  public String getClientOperationId() {
    return clientOperationId;
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
   * must have the format `{project}/managedZones/{managedZone}/changes`. \`{managedZone}\` must
   * start with a letter, and contain only letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes
   * (\`-\`), &#42; underscores (\`_\`), periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent
   * &#42; signs (\`%\`). It must be between 3 and 255 characters in length, and it &#42; must not
   * start with \`"goog"\`.
   */
  public String getManagedZone() {
    return managedZone;
  }

  /** Returns response with indentations and line breaks. */
  public String getPrettyPrint() {
    return prettyPrint;
  }

  /** Alternative to userIp. */
  public String getQuotaUser() {
    return quotaUser;
  }

  /** IP address of the end user for whom the API call is being made. */
  public String getUserIp() {
    return userIp;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(CreateChangeHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static CreateChangeHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final CreateChangeHttpRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new CreateChangeHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private String callback;
    private Change changeResource;
    private String clientOperationId;
    private String fields;
    private String key;
    private String managedZone;
    private String prettyPrint;
    private String quotaUser;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(CreateChangeHttpRequest other) {
      if (other == CreateChangeHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
      }
      if (other.getChangeResource() != null) {
        this.changeResource = other.changeResource;
      }
      if (other.getClientOperationId() != null) {
        this.clientOperationId = other.clientOperationId;
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
      if (other.getPrettyPrint() != null) {
        this.prettyPrint = other.prettyPrint;
      }
      if (other.getQuotaUser() != null) {
        this.quotaUser = other.quotaUser;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      return this;
    }

    Builder(CreateChangeHttpRequest source) {
      this.access_token = source.access_token;
      this.callback = source.callback;
      this.changeResource = source.changeResource;
      this.clientOperationId = source.clientOperationId;
      this.fields = source.fields;
      this.key = source.key;
      this.managedZone = source.managedZone;
      this.prettyPrint = source.prettyPrint;
      this.quotaUser = source.quotaUser;
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

    /**
     * A Change represents a set of ResourceRecordSet additions and deletions applied atomically to
     * a ManagedZone. ResourceRecordSets within a ManagedZone are modified by creating a new Change
     * element in the Changes collection. In turn the Changes collection also records the past
     * modifications to the ResourceRecordSets in a ManagedZone. The current state of the
     * ManagedZone is the sum effect of applying all Change elements in the Changes collection in
     * sequence.
     */
    public Change getChangeResource() {
      return changeResource;
    }

    /**
     * A Change represents a set of ResourceRecordSet additions and deletions applied atomically to
     * a ManagedZone. ResourceRecordSets within a ManagedZone are modified by creating a new Change
     * element in the Changes collection. In turn the Changes collection also records the past
     * modifications to the ResourceRecordSets in a ManagedZone. The current state of the
     * ManagedZone is the sum effect of applying all Change elements in the Changes collection in
     * sequence.
     */
    public Builder setChangeResource(Change changeResource) {
      this.changeResource = changeResource;
      return this;
    }

    /**
     * For mutating operation requests only. An optional identifier specified by the client. Must be
     * unique for operation resources in the Operations collection.
     */
    public String getClientOperationId() {
      return clientOperationId;
    }

    /**
     * For mutating operation requests only. An optional identifier specified by the client. Must be
     * unique for operation resources in the Operations collection.
     */
    public Builder setClientOperationId(String clientOperationId) {
      this.clientOperationId = clientOperationId;
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
     * must have the format `{project}/managedZones/{managedZone}/changes`. \`{managedZone}\` must
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
     * must have the format `{project}/managedZones/{managedZone}/changes`. \`{managedZone}\` must
     * start with a letter, and contain only letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes
     * (\`-\`), &#42; underscores (\`_\`), periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent
     * &#42; signs (\`%\`). It must be between 3 and 255 characters in length, and it &#42; must not
     * start with \`"goog"\`.
     */
    public Builder setManagedZone(String managedZone) {
      this.managedZone = managedZone;
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

    /** IP address of the end user for whom the API call is being made. */
    public String getUserIp() {
      return userIp;
    }

    /** IP address of the end user for whom the API call is being made. */
    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }

    public CreateChangeHttpRequest build() {
      String missing = "";

      if (managedZone == null) {
        missing += " managedZone";
      }

      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new CreateChangeHttpRequest(
          access_token,
          callback,
          changeResource,
          clientOperationId,
          fields,
          key,
          managedZone,
          prettyPrint,
          quotaUser,
          userIp);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setCallback(this.callback);
      newBuilder.setChangeResource(this.changeResource);
      newBuilder.setClientOperationId(this.clientOperationId);
      newBuilder.setFields(this.fields);
      newBuilder.setKey(this.key);
      newBuilder.setManagedZone(this.managedZone);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "CreateChangeHttpRequest{"
        + "access_token="
        + access_token
        + ", "
        + "callback="
        + callback
        + ", "
        + "changeResource="
        + changeResource
        + ", "
        + "clientOperationId="
        + clientOperationId
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
        + "prettyPrint="
        + prettyPrint
        + ", "
        + "quotaUser="
        + quotaUser
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
    if (o instanceof CreateChangeHttpRequest) {
      CreateChangeHttpRequest that = (CreateChangeHttpRequest) o;
      return Objects.equals(this.access_token, that.getAccessToken())
          && Objects.equals(this.callback, that.getCallback())
          && Objects.equals(this.changeResource, that.getChangeResource())
          && Objects.equals(this.clientOperationId, that.getClientOperationId())
          && Objects.equals(this.fields, that.getFields())
          && Objects.equals(this.key, that.getKey())
          && Objects.equals(this.managedZone, that.getManagedZone())
          && Objects.equals(this.prettyPrint, that.getPrettyPrint())
          && Objects.equals(this.quotaUser, that.getQuotaUser())
          && Objects.equals(this.userIp, that.getUserIp());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        access_token,
        callback,
        changeResource,
        clientOperationId,
        fields,
        key,
        managedZone,
        prettyPrint,
        quotaUser,
        userIp);
  }
}
