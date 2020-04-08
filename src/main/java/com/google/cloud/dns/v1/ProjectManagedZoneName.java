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
public final class ProjectManagedZoneName implements ResourceName {
  private final String managedZone;
  private final String project;
  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("{project}/managedZones/{managedZone}");

  public static final String SERVICE_ADDRESS = "https://dns.googleapis.com/dns/v1/projects/";

  private volatile Map<String, String> fieldValuesMap;

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ProjectManagedZoneName(Builder builder) {
    managedZone = Preconditions.checkNotNull(builder.getManagedZone());
    project = Preconditions.checkNotNull(builder.getProject());
  }

  public static ProjectManagedZoneName of(String managedZone, String project) {
    return newBuilder().setManagedZone(managedZone).setProject(project).build();
  }

  public static String format(String managedZone, String project) {
    return of(managedZone, project).toString();
  }

  public String getManagedZone() {
    return managedZone;
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

  public static ResourceNameFactory<ProjectManagedZoneName> newFactory() {
    return new ResourceNameFactory<ProjectManagedZoneName>() {
      public ProjectManagedZoneName parse(String formattedString) {
        return ProjectManagedZoneName.parse(formattedString);
      }
    };
  }

  public static ProjectManagedZoneName parse(String formattedString) {
    String resourcePath = formattedString;
    if (formattedString.startsWith(SERVICE_ADDRESS)) {
      resourcePath = formattedString.substring(SERVICE_ADDRESS.length());
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            resourcePath, "ProjectManagedZoneName.parse: formattedString not in valid format");
    return of(matchMap.get("managedZone"), matchMap.get("project"));
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
    private String project;

    public String getManagedZone() {
      return managedZone;
    }

    public String getProject() {
      return project;
    }

    public Builder setManagedZone(String managedZone) {
      this.managedZone = managedZone;
      return this;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    private Builder() {}

    public Builder(ProjectManagedZoneName projectManagedZoneName) {
      managedZone = projectManagedZoneName.managedZone;
      project = projectManagedZoneName.project;
    }

    public ProjectManagedZoneName build() {
      return new ProjectManagedZoneName(this);
    }
  }

  @Override
  public String toString() {
    return SERVICE_ADDRESS
        + PATH_TEMPLATE.instantiate(
            "managedZone", managedZone,
            "project", project);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProjectManagedZoneName) {
      ProjectManagedZoneName that = (ProjectManagedZoneName) o;
      return Objects.equals(this.managedZone, that.getManagedZone())
          && Objects.equals(this.project, that.getProject());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedZone, project);
  }
}
