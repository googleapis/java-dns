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
/** Limits associated with a Project. */
public final class Quota implements ApiMessage {
  private final Integer dnsKeysPerManagedZone;
  private final String kind;
  private final Integer managedZones;
  private final Integer managedZonesPerNetwork;
  private final Integer networksPerManagedZone;
  private final Integer networksPerPolicy;
  private final Integer policies;
  private final Integer resourceRecordsPerRrset;
  private final Integer rrsetAdditionsPerChange;
  private final Integer rrsetDeletionsPerChange;
  private final Integer rrsetsPerManagedZone;
  private final Integer targetNameServersPerManagedZone;
  private final Integer targetNameServersPerPolicy;
  private final Integer totalRrdataSizePerChange;
  private final List<DnsKeySpec> whitelistedKeySpecs;

  private Quota() {
    this.dnsKeysPerManagedZone = null;
    this.kind = null;
    this.managedZones = null;
    this.managedZonesPerNetwork = null;
    this.networksPerManagedZone = null;
    this.networksPerPolicy = null;
    this.policies = null;
    this.resourceRecordsPerRrset = null;
    this.rrsetAdditionsPerChange = null;
    this.rrsetDeletionsPerChange = null;
    this.rrsetsPerManagedZone = null;
    this.targetNameServersPerManagedZone = null;
    this.targetNameServersPerPolicy = null;
    this.totalRrdataSizePerChange = null;
    this.whitelistedKeySpecs = null;
  }

  private Quota(
      Integer dnsKeysPerManagedZone,
      String kind,
      Integer managedZones,
      Integer managedZonesPerNetwork,
      Integer networksPerManagedZone,
      Integer networksPerPolicy,
      Integer policies,
      Integer resourceRecordsPerRrset,
      Integer rrsetAdditionsPerChange,
      Integer rrsetDeletionsPerChange,
      Integer rrsetsPerManagedZone,
      Integer targetNameServersPerManagedZone,
      Integer targetNameServersPerPolicy,
      Integer totalRrdataSizePerChange,
      List<DnsKeySpec> whitelistedKeySpecs) {
    this.dnsKeysPerManagedZone = dnsKeysPerManagedZone;
    this.kind = kind;
    this.managedZones = managedZones;
    this.managedZonesPerNetwork = managedZonesPerNetwork;
    this.networksPerManagedZone = networksPerManagedZone;
    this.networksPerPolicy = networksPerPolicy;
    this.policies = policies;
    this.resourceRecordsPerRrset = resourceRecordsPerRrset;
    this.rrsetAdditionsPerChange = rrsetAdditionsPerChange;
    this.rrsetDeletionsPerChange = rrsetDeletionsPerChange;
    this.rrsetsPerManagedZone = rrsetsPerManagedZone;
    this.targetNameServersPerManagedZone = targetNameServersPerManagedZone;
    this.targetNameServersPerPolicy = targetNameServersPerPolicy;
    this.totalRrdataSizePerChange = totalRrdataSizePerChange;
    this.whitelistedKeySpecs = whitelistedKeySpecs;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("dnsKeysPerManagedZone".equals(fieldName)) {
      return dnsKeysPerManagedZone;
    }
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("managedZones".equals(fieldName)) {
      return managedZones;
    }
    if ("managedZonesPerNetwork".equals(fieldName)) {
      return managedZonesPerNetwork;
    }
    if ("networksPerManagedZone".equals(fieldName)) {
      return networksPerManagedZone;
    }
    if ("networksPerPolicy".equals(fieldName)) {
      return networksPerPolicy;
    }
    if ("policies".equals(fieldName)) {
      return policies;
    }
    if ("resourceRecordsPerRrset".equals(fieldName)) {
      return resourceRecordsPerRrset;
    }
    if ("rrsetAdditionsPerChange".equals(fieldName)) {
      return rrsetAdditionsPerChange;
    }
    if ("rrsetDeletionsPerChange".equals(fieldName)) {
      return rrsetDeletionsPerChange;
    }
    if ("rrsetsPerManagedZone".equals(fieldName)) {
      return rrsetsPerManagedZone;
    }
    if ("targetNameServersPerManagedZone".equals(fieldName)) {
      return targetNameServersPerManagedZone;
    }
    if ("targetNameServersPerPolicy".equals(fieldName)) {
      return targetNameServersPerPolicy;
    }
    if ("totalRrdataSizePerChange".equals(fieldName)) {
      return totalRrdataSizePerChange;
    }
    if ("whitelistedKeySpecs".equals(fieldName)) {
      return whitelistedKeySpecs;
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

  /** Maximum allowed number of DnsKeys per ManagedZone. */
  public Integer getDnsKeysPerManagedZone() {
    return dnsKeysPerManagedZone;
  }

  /** Identifies what kind of resource this is. Value: the fixed string "dns#quota". */
  public String getKind() {
    return kind;
  }

  /** Maximum allowed number of managed zones in the project. */
  public Integer getManagedZones() {
    return managedZones;
  }

  /** Maximum allowed number of managed zones which can be attached to a network. */
  public Integer getManagedZonesPerNetwork() {
    return managedZonesPerNetwork;
  }

  /** Maximum allowed number of networks to which a privately scoped zone can be attached. */
  public Integer getNetworksPerManagedZone() {
    return networksPerManagedZone;
  }

  /** Maximum allowed number of networks per policy. */
  public Integer getNetworksPerPolicy() {
    return networksPerPolicy;
  }

  /** Maximum allowed number of policies per project. */
  public Integer getPolicies() {
    return policies;
  }

  /** Maximum allowed number of ResourceRecords per ResourceRecordSet. */
  public Integer getResourceRecordsPerRrset() {
    return resourceRecordsPerRrset;
  }

  /** Maximum allowed number of ResourceRecordSets to add per ChangesCreateRequest. */
  public Integer getRrsetAdditionsPerChange() {
    return rrsetAdditionsPerChange;
  }

  /** Maximum allowed number of ResourceRecordSets to delete per ChangesCreateRequest. */
  public Integer getRrsetDeletionsPerChange() {
    return rrsetDeletionsPerChange;
  }

  /** Maximum allowed number of ResourceRecordSets per zone in the project. */
  public Integer getRrsetsPerManagedZone() {
    return rrsetsPerManagedZone;
  }

  /** Maximum allowed number of target name servers per managed forwarding zone. */
  public Integer getTargetNameServersPerManagedZone() {
    return targetNameServersPerManagedZone;
  }

  /** Maximum allowed number of alternative target name servers per policy. */
  public Integer getTargetNameServersPerPolicy() {
    return targetNameServersPerPolicy;
  }

  /** Maximum allowed size for total rrdata in one ChangesCreateRequest in bytes. */
  public Integer getTotalRrdataSizePerChange() {
    return totalRrdataSizePerChange;
  }

  /** DNSSEC algorithm and key length types that can be used for DnsKeys. */
  public List<DnsKeySpec> getWhitelistedKeySpecsList() {
    return whitelistedKeySpecs;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(Quota prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Quota getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final Quota DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new Quota();
  }

  public static class Builder {
    private Integer dnsKeysPerManagedZone;
    private String kind;
    private Integer managedZones;
    private Integer managedZonesPerNetwork;
    private Integer networksPerManagedZone;
    private Integer networksPerPolicy;
    private Integer policies;
    private Integer resourceRecordsPerRrset;
    private Integer rrsetAdditionsPerChange;
    private Integer rrsetDeletionsPerChange;
    private Integer rrsetsPerManagedZone;
    private Integer targetNameServersPerManagedZone;
    private Integer targetNameServersPerPolicy;
    private Integer totalRrdataSizePerChange;
    private List<DnsKeySpec> whitelistedKeySpecs;

    Builder() {}

    public Builder mergeFrom(Quota other) {
      if (other == Quota.getDefaultInstance()) return this;
      if (other.getDnsKeysPerManagedZone() != null) {
        this.dnsKeysPerManagedZone = other.dnsKeysPerManagedZone;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getManagedZones() != null) {
        this.managedZones = other.managedZones;
      }
      if (other.getManagedZonesPerNetwork() != null) {
        this.managedZonesPerNetwork = other.managedZonesPerNetwork;
      }
      if (other.getNetworksPerManagedZone() != null) {
        this.networksPerManagedZone = other.networksPerManagedZone;
      }
      if (other.getNetworksPerPolicy() != null) {
        this.networksPerPolicy = other.networksPerPolicy;
      }
      if (other.getPolicies() != null) {
        this.policies = other.policies;
      }
      if (other.getResourceRecordsPerRrset() != null) {
        this.resourceRecordsPerRrset = other.resourceRecordsPerRrset;
      }
      if (other.getRrsetAdditionsPerChange() != null) {
        this.rrsetAdditionsPerChange = other.rrsetAdditionsPerChange;
      }
      if (other.getRrsetDeletionsPerChange() != null) {
        this.rrsetDeletionsPerChange = other.rrsetDeletionsPerChange;
      }
      if (other.getRrsetsPerManagedZone() != null) {
        this.rrsetsPerManagedZone = other.rrsetsPerManagedZone;
      }
      if (other.getTargetNameServersPerManagedZone() != null) {
        this.targetNameServersPerManagedZone = other.targetNameServersPerManagedZone;
      }
      if (other.getTargetNameServersPerPolicy() != null) {
        this.targetNameServersPerPolicy = other.targetNameServersPerPolicy;
      }
      if (other.getTotalRrdataSizePerChange() != null) {
        this.totalRrdataSizePerChange = other.totalRrdataSizePerChange;
      }
      if (other.getWhitelistedKeySpecsList() != null) {
        this.whitelistedKeySpecs = other.whitelistedKeySpecs;
      }
      return this;
    }

    Builder(Quota source) {
      this.dnsKeysPerManagedZone = source.dnsKeysPerManagedZone;
      this.kind = source.kind;
      this.managedZones = source.managedZones;
      this.managedZonesPerNetwork = source.managedZonesPerNetwork;
      this.networksPerManagedZone = source.networksPerManagedZone;
      this.networksPerPolicy = source.networksPerPolicy;
      this.policies = source.policies;
      this.resourceRecordsPerRrset = source.resourceRecordsPerRrset;
      this.rrsetAdditionsPerChange = source.rrsetAdditionsPerChange;
      this.rrsetDeletionsPerChange = source.rrsetDeletionsPerChange;
      this.rrsetsPerManagedZone = source.rrsetsPerManagedZone;
      this.targetNameServersPerManagedZone = source.targetNameServersPerManagedZone;
      this.targetNameServersPerPolicy = source.targetNameServersPerPolicy;
      this.totalRrdataSizePerChange = source.totalRrdataSizePerChange;
      this.whitelistedKeySpecs = source.whitelistedKeySpecs;
    }

    /** Maximum allowed number of DnsKeys per ManagedZone. */
    public Integer getDnsKeysPerManagedZone() {
      return dnsKeysPerManagedZone;
    }

    /** Maximum allowed number of DnsKeys per ManagedZone. */
    public Builder setDnsKeysPerManagedZone(Integer dnsKeysPerManagedZone) {
      this.dnsKeysPerManagedZone = dnsKeysPerManagedZone;
      return this;
    }

    /** Identifies what kind of resource this is. Value: the fixed string "dns#quota". */
    public String getKind() {
      return kind;
    }

    /** Identifies what kind of resource this is. Value: the fixed string "dns#quota". */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /** Maximum allowed number of managed zones in the project. */
    public Integer getManagedZones() {
      return managedZones;
    }

    /** Maximum allowed number of managed zones in the project. */
    public Builder setManagedZones(Integer managedZones) {
      this.managedZones = managedZones;
      return this;
    }

    /** Maximum allowed number of managed zones which can be attached to a network. */
    public Integer getManagedZonesPerNetwork() {
      return managedZonesPerNetwork;
    }

    /** Maximum allowed number of managed zones which can be attached to a network. */
    public Builder setManagedZonesPerNetwork(Integer managedZonesPerNetwork) {
      this.managedZonesPerNetwork = managedZonesPerNetwork;
      return this;
    }

    /** Maximum allowed number of networks to which a privately scoped zone can be attached. */
    public Integer getNetworksPerManagedZone() {
      return networksPerManagedZone;
    }

    /** Maximum allowed number of networks to which a privately scoped zone can be attached. */
    public Builder setNetworksPerManagedZone(Integer networksPerManagedZone) {
      this.networksPerManagedZone = networksPerManagedZone;
      return this;
    }

    /** Maximum allowed number of networks per policy. */
    public Integer getNetworksPerPolicy() {
      return networksPerPolicy;
    }

    /** Maximum allowed number of networks per policy. */
    public Builder setNetworksPerPolicy(Integer networksPerPolicy) {
      this.networksPerPolicy = networksPerPolicy;
      return this;
    }

    /** Maximum allowed number of policies per project. */
    public Integer getPolicies() {
      return policies;
    }

    /** Maximum allowed number of policies per project. */
    public Builder setPolicies(Integer policies) {
      this.policies = policies;
      return this;
    }

    /** Maximum allowed number of ResourceRecords per ResourceRecordSet. */
    public Integer getResourceRecordsPerRrset() {
      return resourceRecordsPerRrset;
    }

    /** Maximum allowed number of ResourceRecords per ResourceRecordSet. */
    public Builder setResourceRecordsPerRrset(Integer resourceRecordsPerRrset) {
      this.resourceRecordsPerRrset = resourceRecordsPerRrset;
      return this;
    }

    /** Maximum allowed number of ResourceRecordSets to add per ChangesCreateRequest. */
    public Integer getRrsetAdditionsPerChange() {
      return rrsetAdditionsPerChange;
    }

    /** Maximum allowed number of ResourceRecordSets to add per ChangesCreateRequest. */
    public Builder setRrsetAdditionsPerChange(Integer rrsetAdditionsPerChange) {
      this.rrsetAdditionsPerChange = rrsetAdditionsPerChange;
      return this;
    }

    /** Maximum allowed number of ResourceRecordSets to delete per ChangesCreateRequest. */
    public Integer getRrsetDeletionsPerChange() {
      return rrsetDeletionsPerChange;
    }

    /** Maximum allowed number of ResourceRecordSets to delete per ChangesCreateRequest. */
    public Builder setRrsetDeletionsPerChange(Integer rrsetDeletionsPerChange) {
      this.rrsetDeletionsPerChange = rrsetDeletionsPerChange;
      return this;
    }

    /** Maximum allowed number of ResourceRecordSets per zone in the project. */
    public Integer getRrsetsPerManagedZone() {
      return rrsetsPerManagedZone;
    }

    /** Maximum allowed number of ResourceRecordSets per zone in the project. */
    public Builder setRrsetsPerManagedZone(Integer rrsetsPerManagedZone) {
      this.rrsetsPerManagedZone = rrsetsPerManagedZone;
      return this;
    }

    /** Maximum allowed number of target name servers per managed forwarding zone. */
    public Integer getTargetNameServersPerManagedZone() {
      return targetNameServersPerManagedZone;
    }

    /** Maximum allowed number of target name servers per managed forwarding zone. */
    public Builder setTargetNameServersPerManagedZone(Integer targetNameServersPerManagedZone) {
      this.targetNameServersPerManagedZone = targetNameServersPerManagedZone;
      return this;
    }

    /** Maximum allowed number of alternative target name servers per policy. */
    public Integer getTargetNameServersPerPolicy() {
      return targetNameServersPerPolicy;
    }

    /** Maximum allowed number of alternative target name servers per policy. */
    public Builder setTargetNameServersPerPolicy(Integer targetNameServersPerPolicy) {
      this.targetNameServersPerPolicy = targetNameServersPerPolicy;
      return this;
    }

    /** Maximum allowed size for total rrdata in one ChangesCreateRequest in bytes. */
    public Integer getTotalRrdataSizePerChange() {
      return totalRrdataSizePerChange;
    }

    /** Maximum allowed size for total rrdata in one ChangesCreateRequest in bytes. */
    public Builder setTotalRrdataSizePerChange(Integer totalRrdataSizePerChange) {
      this.totalRrdataSizePerChange = totalRrdataSizePerChange;
      return this;
    }

    /** DNSSEC algorithm and key length types that can be used for DnsKeys. */
    public List<DnsKeySpec> getWhitelistedKeySpecsList() {
      return whitelistedKeySpecs;
    }

    /** DNSSEC algorithm and key length types that can be used for DnsKeys. */
    public Builder addAllWhitelistedKeySpecs(List<DnsKeySpec> whitelistedKeySpecs) {
      if (this.whitelistedKeySpecs == null) {
        this.whitelistedKeySpecs = new LinkedList<>();
      }
      this.whitelistedKeySpecs.addAll(whitelistedKeySpecs);
      return this;
    }

    /** DNSSEC algorithm and key length types that can be used for DnsKeys. */
    public Builder addWhitelistedKeySpecs(DnsKeySpec whitelistedKeySpecs) {
      if (this.whitelistedKeySpecs == null) {
        this.whitelistedKeySpecs = new LinkedList<>();
      }
      this.whitelistedKeySpecs.add(whitelistedKeySpecs);
      return this;
    }

    public Quota build() {

      return new Quota(
          dnsKeysPerManagedZone,
          kind,
          managedZones,
          managedZonesPerNetwork,
          networksPerManagedZone,
          networksPerPolicy,
          policies,
          resourceRecordsPerRrset,
          rrsetAdditionsPerChange,
          rrsetDeletionsPerChange,
          rrsetsPerManagedZone,
          targetNameServersPerManagedZone,
          targetNameServersPerPolicy,
          totalRrdataSizePerChange,
          whitelistedKeySpecs);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setDnsKeysPerManagedZone(this.dnsKeysPerManagedZone);
      newBuilder.setKind(this.kind);
      newBuilder.setManagedZones(this.managedZones);
      newBuilder.setManagedZonesPerNetwork(this.managedZonesPerNetwork);
      newBuilder.setNetworksPerManagedZone(this.networksPerManagedZone);
      newBuilder.setNetworksPerPolicy(this.networksPerPolicy);
      newBuilder.setPolicies(this.policies);
      newBuilder.setResourceRecordsPerRrset(this.resourceRecordsPerRrset);
      newBuilder.setRrsetAdditionsPerChange(this.rrsetAdditionsPerChange);
      newBuilder.setRrsetDeletionsPerChange(this.rrsetDeletionsPerChange);
      newBuilder.setRrsetsPerManagedZone(this.rrsetsPerManagedZone);
      newBuilder.setTargetNameServersPerManagedZone(this.targetNameServersPerManagedZone);
      newBuilder.setTargetNameServersPerPolicy(this.targetNameServersPerPolicy);
      newBuilder.setTotalRrdataSizePerChange(this.totalRrdataSizePerChange);
      newBuilder.addAllWhitelistedKeySpecs(this.whitelistedKeySpecs);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Quota{"
        + "dnsKeysPerManagedZone="
        + dnsKeysPerManagedZone
        + ", "
        + "kind="
        + kind
        + ", "
        + "managedZones="
        + managedZones
        + ", "
        + "managedZonesPerNetwork="
        + managedZonesPerNetwork
        + ", "
        + "networksPerManagedZone="
        + networksPerManagedZone
        + ", "
        + "networksPerPolicy="
        + networksPerPolicy
        + ", "
        + "policies="
        + policies
        + ", "
        + "resourceRecordsPerRrset="
        + resourceRecordsPerRrset
        + ", "
        + "rrsetAdditionsPerChange="
        + rrsetAdditionsPerChange
        + ", "
        + "rrsetDeletionsPerChange="
        + rrsetDeletionsPerChange
        + ", "
        + "rrsetsPerManagedZone="
        + rrsetsPerManagedZone
        + ", "
        + "targetNameServersPerManagedZone="
        + targetNameServersPerManagedZone
        + ", "
        + "targetNameServersPerPolicy="
        + targetNameServersPerPolicy
        + ", "
        + "totalRrdataSizePerChange="
        + totalRrdataSizePerChange
        + ", "
        + "whitelistedKeySpecs="
        + whitelistedKeySpecs
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Quota) {
      Quota that = (Quota) o;
      return Objects.equals(this.dnsKeysPerManagedZone, that.getDnsKeysPerManagedZone())
          && Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.managedZones, that.getManagedZones())
          && Objects.equals(this.managedZonesPerNetwork, that.getManagedZonesPerNetwork())
          && Objects.equals(this.networksPerManagedZone, that.getNetworksPerManagedZone())
          && Objects.equals(this.networksPerPolicy, that.getNetworksPerPolicy())
          && Objects.equals(this.policies, that.getPolicies())
          && Objects.equals(this.resourceRecordsPerRrset, that.getResourceRecordsPerRrset())
          && Objects.equals(this.rrsetAdditionsPerChange, that.getRrsetAdditionsPerChange())
          && Objects.equals(this.rrsetDeletionsPerChange, that.getRrsetDeletionsPerChange())
          && Objects.equals(this.rrsetsPerManagedZone, that.getRrsetsPerManagedZone())
          && Objects.equals(
              this.targetNameServersPerManagedZone, that.getTargetNameServersPerManagedZone())
          && Objects.equals(this.targetNameServersPerPolicy, that.getTargetNameServersPerPolicy())
          && Objects.equals(this.totalRrdataSizePerChange, that.getTotalRrdataSizePerChange())
          && Objects.equals(this.whitelistedKeySpecs, that.getWhitelistedKeySpecsList());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dnsKeysPerManagedZone,
        kind,
        managedZones,
        managedZonesPerNetwork,
        networksPerManagedZone,
        networksPerPolicy,
        policies,
        resourceRecordsPerRrset,
        rrsetAdditionsPerChange,
        rrsetDeletionsPerChange,
        rrsetsPerManagedZone,
        targetNameServersPerManagedZone,
        targetNameServersPerPolicy,
        totalRrdataSizePerChange,
        whitelistedKeySpecs);
  }
}
