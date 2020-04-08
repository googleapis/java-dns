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
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
/**
 * A zone is a subtree of the DNS namespace under one administrative responsibility. A ManagedZone
 * is a resource that represents a DNS zone hosted by the Cloud DNS service.
 */
public final class ManagedZone implements ApiMessage {
  private final String creationTime;
  private final String description;
  private final String dnsName;
  private final ManagedZoneDnsSecConfig dnssecConfig;
  private final ManagedZoneForwardingConfig forwardingConfig;
  private final String id;
  private final String kind;
  private final Map<String, String> labels;
  private final String name;
  private final String nameServerSet;
  private final List<String> nameServers;
  private final ManagedZonePeeringConfig peeringConfig;
  private final ManagedZonePrivateVisibilityConfig privateVisibilityConfig;
  private final String visibility;

  private ManagedZone() {
    this.creationTime = null;
    this.description = null;
    this.dnsName = null;
    this.dnssecConfig = null;
    this.forwardingConfig = null;
    this.id = null;
    this.kind = null;
    this.labels = null;
    this.name = null;
    this.nameServerSet = null;
    this.nameServers = null;
    this.peeringConfig = null;
    this.privateVisibilityConfig = null;
    this.visibility = null;
  }

  private ManagedZone(
      String creationTime,
      String description,
      String dnsName,
      ManagedZoneDnsSecConfig dnssecConfig,
      ManagedZoneForwardingConfig forwardingConfig,
      String id,
      String kind,
      Map<String, String> labels,
      String name,
      String nameServerSet,
      List<String> nameServers,
      ManagedZonePeeringConfig peeringConfig,
      ManagedZonePrivateVisibilityConfig privateVisibilityConfig,
      String visibility) {
    this.creationTime = creationTime;
    this.description = description;
    this.dnsName = dnsName;
    this.dnssecConfig = dnssecConfig;
    this.forwardingConfig = forwardingConfig;
    this.id = id;
    this.kind = kind;
    this.labels = labels;
    this.name = name;
    this.nameServerSet = nameServerSet;
    this.nameServers = nameServers;
    this.peeringConfig = peeringConfig;
    this.privateVisibilityConfig = privateVisibilityConfig;
    this.visibility = visibility;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("creationTime".equals(fieldName)) {
      return creationTime;
    }
    if ("description".equals(fieldName)) {
      return description;
    }
    if ("dnsName".equals(fieldName)) {
      return dnsName;
    }
    if ("dnssecConfig".equals(fieldName)) {
      return dnssecConfig;
    }
    if ("forwardingConfig".equals(fieldName)) {
      return forwardingConfig;
    }
    if ("id".equals(fieldName)) {
      return id;
    }
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("labels".equals(fieldName)) {
      return labels;
    }
    if ("name".equals(fieldName)) {
      return name;
    }
    if ("nameServerSet".equals(fieldName)) {
      return nameServerSet;
    }
    if ("nameServers".equals(fieldName)) {
      return nameServers;
    }
    if ("peeringConfig".equals(fieldName)) {
      return peeringConfig;
    }
    if ("privateVisibilityConfig".equals(fieldName)) {
      return privateVisibilityConfig;
    }
    if ("visibility".equals(fieldName)) {
      return visibility;
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

  /**
   * The time that this resource was created on the server. This is in RFC3339 text format. Output
   * only.
   */
  public String getCreationTime() {
    return creationTime;
  }

  /**
   * A mutable string of at most 1024 characters associated with this resource for the user's
   * convenience. Has no effect on the managed zone's function.
   */
  public String getDescription() {
    return description;
  }

  /** The DNS name of this managed zone, for instance "example.com.". */
  public String getDnsName() {
    return dnsName;
  }

  /** DNSSEC configuration. */
  public ManagedZoneDnsSecConfig getDnssecConfig() {
    return dnssecConfig;
  }

  /**
   * The presence for this field indicates that outbound forwarding is enabled for this zone. The
   * value of this field contains the set of destinations to forward to.
   */
  public ManagedZoneForwardingConfig getForwardingConfig() {
    return forwardingConfig;
  }

  /** Unique identifier for the resource; defined by the server (output only) */
  public String getId() {
    return id;
  }

  /** Identifies what kind of resource this is. Value: the fixed string "dns#managedZone". */
  public String getKind() {
    return kind;
  }

  /** User labels. */
  public Map<String, String> getLabelsMap() {
    return labels;
  }

  /**
   * User assigned name for this resource. Must be unique within the project. The name must be 1-63
   * characters long, must begin with a letter, end with a letter or digit, and only contain
   * lowercase letters, digits or dashes.
   */
  public String getName() {
    return name;
  }

  /**
   * Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS
   * name servers that all host the same ManagedZones. Most users will leave this field unset.
   */
  public String getNameServerSet() {
    return nameServerSet;
  }

  /**
   * Delegate your managed_zone to these virtual name servers; defined by the server (output only)
   */
  public List<String> getNameServersList() {
    return nameServers;
  }

  /**
   * The presence of this field indicates that DNS Peering is enabled for this zone. The value of
   * this field contains the network to peer with.
   */
  public ManagedZonePeeringConfig getPeeringConfig() {
    return peeringConfig;
  }

  /**
   * For privately visible zones, the set of Virtual Private Cloud resources that the zone is
   * visible from.
   */
  public ManagedZonePrivateVisibilityConfig getPrivateVisibilityConfig() {
    return privateVisibilityConfig;
  }

  /**
   * The zone's visibility: public zones are exposed to the Internet, while private zones are
   * visible only to Virtual Private Cloud resources.
   */
  public String getVisibility() {
    return visibility;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(ManagedZone prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static ManagedZone getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final ManagedZone DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new ManagedZone();
  }

  public static class Builder {
    private String creationTime;
    private String description;
    private String dnsName;
    private ManagedZoneDnsSecConfig dnssecConfig;
    private ManagedZoneForwardingConfig forwardingConfig;
    private String id;
    private String kind;
    private Map<String, String> labels;
    private String name;
    private String nameServerSet;
    private List<String> nameServers;
    private ManagedZonePeeringConfig peeringConfig;
    private ManagedZonePrivateVisibilityConfig privateVisibilityConfig;
    private String visibility;

    Builder() {}

    public Builder mergeFrom(ManagedZone other) {
      if (other == ManagedZone.getDefaultInstance()) return this;
      if (other.getCreationTime() != null) {
        this.creationTime = other.creationTime;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getDnsName() != null) {
        this.dnsName = other.dnsName;
      }
      if (other.getDnssecConfig() != null) {
        this.dnssecConfig = other.dnssecConfig;
      }
      if (other.getForwardingConfig() != null) {
        this.forwardingConfig = other.forwardingConfig;
      }
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getLabelsMap() != null) {
        this.labels = other.labels;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getNameServerSet() != null) {
        this.nameServerSet = other.nameServerSet;
      }
      if (other.getNameServersList() != null) {
        this.nameServers = other.nameServers;
      }
      if (other.getPeeringConfig() != null) {
        this.peeringConfig = other.peeringConfig;
      }
      if (other.getPrivateVisibilityConfig() != null) {
        this.privateVisibilityConfig = other.privateVisibilityConfig;
      }
      if (other.getVisibility() != null) {
        this.visibility = other.visibility;
      }
      return this;
    }

    Builder(ManagedZone source) {
      this.creationTime = source.creationTime;
      this.description = source.description;
      this.dnsName = source.dnsName;
      this.dnssecConfig = source.dnssecConfig;
      this.forwardingConfig = source.forwardingConfig;
      this.id = source.id;
      this.kind = source.kind;
      this.labels = source.labels;
      this.name = source.name;
      this.nameServerSet = source.nameServerSet;
      this.nameServers = source.nameServers;
      this.peeringConfig = source.peeringConfig;
      this.privateVisibilityConfig = source.privateVisibilityConfig;
      this.visibility = source.visibility;
    }

    /**
     * The time that this resource was created on the server. This is in RFC3339 text format. Output
     * only.
     */
    public String getCreationTime() {
      return creationTime;
    }

    /**
     * The time that this resource was created on the server. This is in RFC3339 text format. Output
     * only.
     */
    public Builder setCreationTime(String creationTime) {
      this.creationTime = creationTime;
      return this;
    }

    /**
     * A mutable string of at most 1024 characters associated with this resource for the user's
     * convenience. Has no effect on the managed zone's function.
     */
    public String getDescription() {
      return description;
    }

    /**
     * A mutable string of at most 1024 characters associated with this resource for the user's
     * convenience. Has no effect on the managed zone's function.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /** The DNS name of this managed zone, for instance "example.com.". */
    public String getDnsName() {
      return dnsName;
    }

    /** The DNS name of this managed zone, for instance "example.com.". */
    public Builder setDnsName(String dnsName) {
      this.dnsName = dnsName;
      return this;
    }

    /** DNSSEC configuration. */
    public ManagedZoneDnsSecConfig getDnssecConfig() {
      return dnssecConfig;
    }

    /** DNSSEC configuration. */
    public Builder setDnssecConfig(ManagedZoneDnsSecConfig dnssecConfig) {
      this.dnssecConfig = dnssecConfig;
      return this;
    }

    /**
     * The presence for this field indicates that outbound forwarding is enabled for this zone. The
     * value of this field contains the set of destinations to forward to.
     */
    public ManagedZoneForwardingConfig getForwardingConfig() {
      return forwardingConfig;
    }

    /**
     * The presence for this field indicates that outbound forwarding is enabled for this zone. The
     * value of this field contains the set of destinations to forward to.
     */
    public Builder setForwardingConfig(ManagedZoneForwardingConfig forwardingConfig) {
      this.forwardingConfig = forwardingConfig;
      return this;
    }

    /** Unique identifier for the resource; defined by the server (output only) */
    public String getId() {
      return id;
    }

    /** Unique identifier for the resource; defined by the server (output only) */
    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    /** Identifies what kind of resource this is. Value: the fixed string "dns#managedZone". */
    public String getKind() {
      return kind;
    }

    /** Identifies what kind of resource this is. Value: the fixed string "dns#managedZone". */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /** User labels. */
    public Map<String, String> getLabelsMap() {
      return labels;
    }

    /** User labels. */
    public Builder putAllLabels(Map<String, String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * User assigned name for this resource. Must be unique within the project. The name must be
     * 1-63 characters long, must begin with a letter, end with a letter or digit, and only contain
     * lowercase letters, digits or dashes.
     */
    public String getName() {
      return name;
    }

    /**
     * User assigned name for this resource. Must be unique within the project. The name must be
     * 1-63 characters long, must begin with a letter, end with a letter or digit, and only contain
     * lowercase letters, digits or dashes.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS
     * name servers that all host the same ManagedZones. Most users will leave this field unset.
     */
    public String getNameServerSet() {
      return nameServerSet;
    }

    /**
     * Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS
     * name servers that all host the same ManagedZones. Most users will leave this field unset.
     */
    public Builder setNameServerSet(String nameServerSet) {
      this.nameServerSet = nameServerSet;
      return this;
    }

    /**
     * Delegate your managed_zone to these virtual name servers; defined by the server (output only)
     */
    public List<String> getNameServersList() {
      return nameServers;
    }

    /**
     * Delegate your managed_zone to these virtual name servers; defined by the server (output only)
     */
    public Builder addAllNameServers(List<String> nameServers) {
      if (this.nameServers == null) {
        this.nameServers = new LinkedList<>();
      }
      this.nameServers.addAll(nameServers);
      return this;
    }

    /**
     * Delegate your managed_zone to these virtual name servers; defined by the server (output only)
     */
    public Builder addNameServers(String nameServers) {
      if (this.nameServers == null) {
        this.nameServers = new LinkedList<>();
      }
      this.nameServers.add(nameServers);
      return this;
    }

    /**
     * The presence of this field indicates that DNS Peering is enabled for this zone. The value of
     * this field contains the network to peer with.
     */
    public ManagedZonePeeringConfig getPeeringConfig() {
      return peeringConfig;
    }

    /**
     * The presence of this field indicates that DNS Peering is enabled for this zone. The value of
     * this field contains the network to peer with.
     */
    public Builder setPeeringConfig(ManagedZonePeeringConfig peeringConfig) {
      this.peeringConfig = peeringConfig;
      return this;
    }

    /**
     * For privately visible zones, the set of Virtual Private Cloud resources that the zone is
     * visible from.
     */
    public ManagedZonePrivateVisibilityConfig getPrivateVisibilityConfig() {
      return privateVisibilityConfig;
    }

    /**
     * For privately visible zones, the set of Virtual Private Cloud resources that the zone is
     * visible from.
     */
    public Builder setPrivateVisibilityConfig(
        ManagedZonePrivateVisibilityConfig privateVisibilityConfig) {
      this.privateVisibilityConfig = privateVisibilityConfig;
      return this;
    }

    /**
     * The zone's visibility: public zones are exposed to the Internet, while private zones are
     * visible only to Virtual Private Cloud resources.
     */
    public String getVisibility() {
      return visibility;
    }

    /**
     * The zone's visibility: public zones are exposed to the Internet, while private zones are
     * visible only to Virtual Private Cloud resources.
     */
    public Builder setVisibility(String visibility) {
      this.visibility = visibility;
      return this;
    }

    public ManagedZone build() {

      return new ManagedZone(
          creationTime,
          description,
          dnsName,
          dnssecConfig,
          forwardingConfig,
          id,
          kind,
          labels,
          name,
          nameServerSet,
          nameServers,
          peeringConfig,
          privateVisibilityConfig,
          visibility);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setCreationTime(this.creationTime);
      newBuilder.setDescription(this.description);
      newBuilder.setDnsName(this.dnsName);
      newBuilder.setDnssecConfig(this.dnssecConfig);
      newBuilder.setForwardingConfig(this.forwardingConfig);
      newBuilder.setId(this.id);
      newBuilder.setKind(this.kind);
      newBuilder.putAllLabels(this.labels);
      newBuilder.setName(this.name);
      newBuilder.setNameServerSet(this.nameServerSet);
      newBuilder.addAllNameServers(this.nameServers);
      newBuilder.setPeeringConfig(this.peeringConfig);
      newBuilder.setPrivateVisibilityConfig(this.privateVisibilityConfig);
      newBuilder.setVisibility(this.visibility);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "ManagedZone{"
        + "creationTime="
        + creationTime
        + ", "
        + "description="
        + description
        + ", "
        + "dnsName="
        + dnsName
        + ", "
        + "dnssecConfig="
        + dnssecConfig
        + ", "
        + "forwardingConfig="
        + forwardingConfig
        + ", "
        + "id="
        + id
        + ", "
        + "kind="
        + kind
        + ", "
        + "labels="
        + labels
        + ", "
        + "name="
        + name
        + ", "
        + "nameServerSet="
        + nameServerSet
        + ", "
        + "nameServers="
        + nameServers
        + ", "
        + "peeringConfig="
        + peeringConfig
        + ", "
        + "privateVisibilityConfig="
        + privateVisibilityConfig
        + ", "
        + "visibility="
        + visibility
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ManagedZone) {
      ManagedZone that = (ManagedZone) o;
      return Objects.equals(this.creationTime, that.getCreationTime())
          && Objects.equals(this.description, that.getDescription())
          && Objects.equals(this.dnsName, that.getDnsName())
          && Objects.equals(this.dnssecConfig, that.getDnssecConfig())
          && Objects.equals(this.forwardingConfig, that.getForwardingConfig())
          && Objects.equals(this.id, that.getId())
          && Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.labels, that.getLabelsMap())
          && Objects.equals(this.name, that.getName())
          && Objects.equals(this.nameServerSet, that.getNameServerSet())
          && Objects.equals(this.nameServers, that.getNameServersList())
          && Objects.equals(this.peeringConfig, that.getPeeringConfig())
          && Objects.equals(this.privateVisibilityConfig, that.getPrivateVisibilityConfig())
          && Objects.equals(this.visibility, that.getVisibility());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creationTime,
        description,
        dnsName,
        dnssecConfig,
        forwardingConfig,
        id,
        kind,
        labels,
        name,
        nameServerSet,
        nameServers,
        peeringConfig,
        privateVisibilityConfig,
        visibility);
  }
}
