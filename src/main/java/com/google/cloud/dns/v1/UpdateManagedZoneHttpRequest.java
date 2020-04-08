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
/** Request object for method dns.managedZones.update. Update an existing ManagedZone. */
public final class UpdateManagedZoneHttpRequest implements ApiMessage {
  private final String access_token;
  private final String callback;
  private final String clientOperationId;
  private final List<String> fieldMask;
  private final String fields;
  private final String key;
  private final String managedZone;
  private final ManagedZone managedZoneResource;
  private final String prettyPrint;
  private final String quotaUser;
  private final String userIp;

  private UpdateManagedZoneHttpRequest() {
    this.access_token = null;
    this.callback = null;
    this.clientOperationId = null;
    this.fieldMask = null;
    this.fields = null;
    this.key = null;
    this.managedZone = null;
    this.managedZoneResource = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.userIp = null;
  }

  private UpdateManagedZoneHttpRequest(
      String access_token,
      String callback,
      String clientOperationId,
      List<String> fieldMask,
      String fields,
      String key,
      String managedZone,
      ManagedZone managedZoneResource,
      String prettyPrint,
      String quotaUser,
      String userIp) {
    this.access_token = access_token;
    this.callback = callback;
    this.clientOperationId = clientOperationId;
    this.fieldMask = fieldMask;
    this.fields = fields;
    this.key = key;
    this.managedZone = managedZone;
    this.managedZoneResource = managedZoneResource;
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
    if ("clientOperationId".equals(fieldName)) {
      return clientOperationId;
    }
    if ("fieldMask".equals(fieldName)) {
      return fieldMask;
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
    if ("managedZoneResource".equals(fieldName)) {
      return managedZoneResource;
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
  public ManagedZone getApiMessageRequestBody() {
    return managedZoneResource;
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
   * For mutating operation requests only. An optional identifier specified by the client. Must be
   * unique for operation resources in the Operations collection.
   */
  public String getClientOperationId() {
    return clientOperationId;
  }

  /**
   * The fields that should be serialized (even if they have empty values). If the containing
   * message object has a non-null fieldmask, then all the fields in the field mask (and only those
   * fields in the field mask) will be serialized. If the containing object does not have a
   * fieldmask, then only non-empty fields will be serialized.
   */
  public List<String> getFieldMask() {
    return fieldMask;
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
   * must have the format `{project}/managedZones/{managedZone}`. \`{managedZone}\` must start with
   * a letter, and contain only letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes (\`-\`), &#42;
   * underscores (\`_\`), periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent &#42; signs
   * (\`%\`). It must be between 3 and 255 characters in length, and it &#42; must not start with
   * \`"goog"\`.
   */
  public String getManagedZone() {
    return managedZone;
  }

  /**
   * A zone is a subtree of the DNS namespace under one administrative responsibility. A ManagedZone
   * is a resource that represents a DNS zone hosted by the Cloud DNS service.
   */
  public ManagedZone getManagedZoneResource() {
    return managedZoneResource;
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

  public static Builder newBuilder(UpdateManagedZoneHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static UpdateManagedZoneHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final UpdateManagedZoneHttpRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new UpdateManagedZoneHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private String callback;
    private String clientOperationId;
    private List<String> fieldMask;
    private String fields;
    private String key;
    private String managedZone;
    private ManagedZone managedZoneResource;
    private String prettyPrint;
    private String quotaUser;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(UpdateManagedZoneHttpRequest other) {
      if (other == UpdateManagedZoneHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
      }
      if (other.getClientOperationId() != null) {
        this.clientOperationId = other.clientOperationId;
      }
      if (other.getFieldMask() != null) {
        this.fieldMask = other.fieldMask;
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
      if (other.getManagedZoneResource() != null) {
        this.managedZoneResource = other.managedZoneResource;
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

    Builder(UpdateManagedZoneHttpRequest source) {
      this.access_token = source.access_token;
      this.callback = source.callback;
      this.clientOperationId = source.clientOperationId;
      this.fieldMask = source.fieldMask;
      this.fields = source.fields;
      this.key = source.key;
      this.managedZone = source.managedZone;
      this.managedZoneResource = source.managedZoneResource;
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

    /**
     * The fields that should be serialized (even if they have empty values). If the containing
     * message object has a non-null fieldmask, then all the fields in the field mask (and only
     * those fields in the field mask) will be serialized. If the containing object does not have a
     * fieldmask, then only non-empty fields will be serialized.
     */
    public List<String> getFieldMask() {
      return fieldMask;
    }

    /**
     * The fields that should be serialized (even if they have empty values). If the containing
     * message object has a non-null fieldmask, then all the fields in the field mask (and only
     * those fields in the field mask) will be serialized. If the containing object does not have a
     * fieldmask, then only non-empty fields will be serialized.
     */
    public Builder addAllFieldMask(List<String> fieldMask) {
      if (this.fieldMask == null) {
        this.fieldMask = new LinkedList<>();
      }
      this.fieldMask.addAll(fieldMask);
      return this;
    }

    /**
     * The fields that should be serialized (even if they have empty values). If the containing
     * message object has a non-null fieldmask, then all the fields in the field mask (and only
     * those fields in the field mask) will be serialized. If the containing object does not have a
     * fieldmask, then only non-empty fields will be serialized.
     */
    public Builder addFieldMask(String fieldMask) {
      if (this.fieldMask == null) {
        this.fieldMask = new LinkedList<>();
      }
      this.fieldMask.add(fieldMask);
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
     * must have the format `{project}/managedZones/{managedZone}`. \`{managedZone}\` must start
     * with a letter, and contain only letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes (\`-\`),
     * &#42; underscores (\`_\`), periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent &#42;
     * signs (\`%\`). It must be between 3 and 255 characters in length, and it &#42; must not start
     * with \`"goog"\`.
     */
    public String getManagedZone() {
      return managedZone;
    }

    /**
     * Identifies the managed zone addressed by this request. Can be the managed zone name or id. It
     * must have the format `{project}/managedZones/{managedZone}`. \`{managedZone}\` must start
     * with a letter, and contain only letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes (\`-\`),
     * &#42; underscores (\`_\`), periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent &#42;
     * signs (\`%\`). It must be between 3 and 255 characters in length, and it &#42; must not start
     * with \`"goog"\`.
     */
    public Builder setManagedZone(String managedZone) {
      this.managedZone = managedZone;
      return this;
    }

    /**
     * A zone is a subtree of the DNS namespace under one administrative responsibility. A
     * ManagedZone is a resource that represents a DNS zone hosted by the Cloud DNS service.
     */
    public ManagedZone getManagedZoneResource() {
      return managedZoneResource;
    }

    /**
     * A zone is a subtree of the DNS namespace under one administrative responsibility. A
     * ManagedZone is a resource that represents a DNS zone hosted by the Cloud DNS service.
     */
    public Builder setManagedZoneResource(ManagedZone managedZoneResource) {
      this.managedZoneResource = managedZoneResource;
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

    public UpdateManagedZoneHttpRequest build() {
      String missing = "";

      if (fieldMask == null) {
        missing += " fieldMask";
      }

      if (managedZone == null) {
        missing += " managedZone";
      }

      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new UpdateManagedZoneHttpRequest(
          access_token,
          callback,
          clientOperationId,
          fieldMask,
          fields,
          key,
          managedZone,
          managedZoneResource,
          prettyPrint,
          quotaUser,
          userIp);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setCallback(this.callback);
      newBuilder.setClientOperationId(this.clientOperationId);
      newBuilder.addAllFieldMask(this.fieldMask);
      newBuilder.setFields(this.fields);
      newBuilder.setKey(this.key);
      newBuilder.setManagedZone(this.managedZone);
      newBuilder.setManagedZoneResource(this.managedZoneResource);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "UpdateManagedZoneHttpRequest{"
        + "access_token="
        + access_token
        + ", "
        + "callback="
        + callback
        + ", "
        + "clientOperationId="
        + clientOperationId
        + ", "
        + "fieldMask="
        + fieldMask
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
        + "managedZoneResource="
        + managedZoneResource
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
    if (o instanceof UpdateManagedZoneHttpRequest) {
      UpdateManagedZoneHttpRequest that = (UpdateManagedZoneHttpRequest) o;
      return Objects.equals(this.access_token, that.getAccessToken())
          && Objects.equals(this.callback, that.getCallback())
          && Objects.equals(this.clientOperationId, that.getClientOperationId())
          && Objects.equals(this.fieldMask, that.getFieldMask())
          && Objects.equals(this.fields, that.getFields())
          && Objects.equals(this.key, that.getKey())
          && Objects.equals(this.managedZone, that.getManagedZone())
          && Objects.equals(this.managedZoneResource, that.getManagedZoneResource())
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
        clientOperationId,
        fieldMask,
        fields,
        key,
        managedZone,
        managedZoneResource,
        prettyPrint,
        quotaUser,
        userIp);
  }
}
