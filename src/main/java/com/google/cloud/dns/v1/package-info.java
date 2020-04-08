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

/**
 * A client to Google Cloud DNS API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>============ ChangeClient ============
 *
 * <p>Service Description: Configures and serves authoritative DNS records.
 *
 * <p>Sample for ChangeClient:
 *
 * <pre>
 * <code>
 * try (ChangeClient changeClient = ChangeClient.create()) {
 *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
 *   Change changeResource = Change.newBuilder().build();
 *   Change response = changeClient.createChange(managedZone, changeResource);
 * }
 * </code>
 * </pre>
 *
 * ============ DnsKeyClient ============
 *
 * <p>Service Description: Configures and serves authoritative DNS records.
 *
 * <p>Sample for DnsKeyClient:
 *
 * <pre>
 * <code>
 * try (DnsKeyClient dnsKeyClient = DnsKeyClient.create()) {
 *   ProjectManagedZoneDnsKeyDnsKeyIdName dnsKeyId = ProjectManagedZoneDnsKeyDnsKeyIdName.of("[PROJECT]", "[MANAGED_ZONE]", "[DNS_KEY_ID]");
 *   DnsKey response = dnsKeyClient.getDnsKey(dnsKeyId);
 * }
 * </code>
 * </pre>
 *
 * ========================== ManagedZoneOperationClient ==========================
 *
 * <p>Service Description: Configures and serves authoritative DNS records.
 *
 * <p>Sample for ManagedZoneOperationClient:
 *
 * <pre>
 * <code>
 * try (ManagedZoneOperationClient managedZoneOperationClient = ManagedZoneOperationClient.create()) {
 *   ProjectManagedZoneOperationName operation = ProjectManagedZoneOperationName.of("[PROJECT]", "[MANAGED_ZONE]", "[OPERATION]");
 *   Operation response = managedZoneOperationClient.getManagedZoneOperation(operation);
 * }
 * </code>
 * </pre>
 *
 * ================= ManagedZoneClient =================
 *
 * <p>Service Description: Configures and serves authoritative DNS records.
 *
 * <p>Sample for ManagedZoneClient:
 *
 * <pre>
 * <code>
 * try (ManagedZoneClient managedZoneClient = ManagedZoneClient.create()) {
 *   ProjectName project = ProjectName.of("[PROJECT]");
 *   ManagedZone managedZoneResource = ManagedZone.newBuilder().build();
 *   ManagedZone response = managedZoneClient.createManagedZone(project, managedZoneResource);
 * }
 * </code>
 * </pre>
 *
 * ============ PolicyClient ============
 *
 * <p>Service Description: Configures and serves authoritative DNS records.
 *
 * <p>Sample for PolicyClient:
 *
 * <pre>
 * <code>
 * try (PolicyClient policyClient = PolicyClient.create()) {
 *   ProjectName project = ProjectName.of("[PROJECT]");
 *   Policy policyResource = Policy.newBuilder().build();
 *   Policy response = policyClient.createPolicy(project, policyResource);
 * }
 * </code>
 * </pre>
 *
 * ============= ProjectClient =============
 *
 * <p>Service Description: Configures and serves authoritative DNS records.
 *
 * <p>Sample for ProjectClient:
 *
 * <pre>
 * <code>
 * try (ProjectClient projectClient = ProjectClient.create()) {
 *   ProjectName project = ProjectName.of("[PROJECT]");
 *   Project response = projectClient.getProject(project);
 * }
 * </code>
 * </pre>
 *
 * ======================= ResourceRecordSetClient =======================
 *
 * <p>Service Description: Configures and serves authoritative DNS records.
 *
 * <p>Sample for ResourceRecordSetClient:
 *
 * <pre>
 * <code>
 * try (ResourceRecordSetClient resourceRecordSetClient = ResourceRecordSetClient.create()) {
 *   String name = "";
 *   String type = "";
 *   ProjectManagedZoneName managedZone = ProjectManagedZoneName.of("[PROJECT]", "[MANAGED_ZONE]");
 *   ListResourceRecordSetsPagedResponse response = resourceRecordSetClient.listResourceRecordSets(name, type, managedZone);
 * }
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
package com.google.cloud.dns.v1;

import javax.annotation.Generated;
