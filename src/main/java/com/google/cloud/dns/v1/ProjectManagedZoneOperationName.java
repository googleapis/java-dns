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
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameFactory;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

@Generated("by GAPIC")
@BetaApi
public final class ProjectManagedZoneOperationName implements ResourceName {
  private final String managedZone;
  private final String operation;
  private final String project;
  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "{project}/managedZones/{managedZone}/operations/{operation}");

  public static final String SERVICE_ADDRESS = "https://dns.googleapis.com/dns/v1/projects/";

  private volatile Map<String, String> fieldValuesMap;

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ProjectManagedZoneOperationName(Builder builder) {
    managedZone = Preconditions.checkNotNull(builder.getManagedZone());
    operation = Preconditions.checkNotNull(builder.getOperation());
    project = Preconditions.checkNotNull(builder.getProject());
  }

  public static ProjectManagedZoneOperationName of(
      String managedZone, String operation, String project) {
    return newBuilder()
        .setManagedZone(managedZone)
        .setOperation(operation)
        .setProject(project)
        .build();
  }

  public static String format(String managedZone, String operation, String project) {
    return of(managedZone, operation, project).toString();
  }

  public String getManagedZone() {
    return managedZone;
  }

  public String getOperation() {
    return operation;
  }

  public String getProject() {
    return project;
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("managedZone", managedZone);
          fieldMapBuilder.put("operation", operation);
          fieldMapBuilder.put("project", project);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  public static ResourceNameFactory<ProjectManagedZoneOperationName> newFactory() {
    return new ResourceNameFactory<ProjectManagedZoneOperationName>() {
      public ProjectManagedZoneOperationName parse(String formattedString) {
        return ProjectManagedZoneOperationName.parse(formattedString);
      }
    };
  }

  public static ProjectManagedZoneOperationName parse(String formattedString) {
    String resourcePath = formattedString;
    if (formattedString.startsWith(SERVICE_ADDRESS)) {
      resourcePath = formattedString.substring(SERVICE_ADDRESS.length());
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            resourcePath,
            "ProjectManagedZoneOperationName.parse: formattedString not in valid format");
    return of(matchMap.get("managedZone"), matchMap.get("operation"), matchMap.get("project"));
  }

  public static boolean isParsableFrom(String formattedString) {
    String resourcePath = formattedString;
    if (formattedString.startsWith(SERVICE_ADDRESS)) {
      resourcePath = formattedString.substring(SERVICE_ADDRESS.length());
    }
    return PATH_TEMPLATE.matches(resourcePath);
  }

  public static class Builder {
    private String managedZone;
    private String operation;
    private String project;

    public String getManagedZone() {
      return managedZone;
    }

    public String getOperation() {
      return operation;
    }

    public String getProject() {
      return project;
    }

    public Builder setManagedZone(String managedZone) {
      this.managedZone = managedZone;
      return this;
    }

    public Builder setOperation(String operation) {
      this.operation = operation;
      return this;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    private Builder() {}

    public Builder(ProjectManagedZoneOperationName projectManagedZoneOperationName) {
      managedZone = projectManagedZoneOperationName.managedZone;
      operation = projectManagedZoneOperationName.operation;
      project = projectManagedZoneOperationName.project;
    }

    public ProjectManagedZoneOperationName build() {
      return new ProjectManagedZoneOperationName(this);
    }
  }

  @Override
  public String toString() {
    return SERVICE_ADDRESS
        + PATH_TEMPLATE.instantiate(
            "managedZone", managedZone,
            "operation", operation,
            "project", project);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProjectManagedZoneOperationName) {
      ProjectManagedZoneOperationName that = (ProjectManagedZoneOperationName) o;
      return Objects.equals(this.managedZone, that.getManagedZone())
          && Objects.equals(this.operation, that.getOperation())
          && Objects.equals(this.project, that.getProject());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedZone, operation, project);
  }
}
