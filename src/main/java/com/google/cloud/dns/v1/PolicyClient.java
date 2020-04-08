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

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dns.v1.stub.PolicyStub;
import com.google.cloud.dns.v1.stub.PolicyStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Configures and serves authoritative DNS records.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
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
 * <p>Note: close() needs to be called on the policyClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of PolicySettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * PolicySettings policySettings =
 *     PolicySettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * PolicyClient policyClient =
 *     PolicyClient.create(policySettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * PolicySettings policySettings =
 *     PolicySettings.newBuilder().setEndpoint(myEndpoint).build();
 * PolicyClient policyClient =
 *     PolicyClient.create(policySettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class PolicyClient implements BackgroundResource {
  private final PolicySettings settings;
  private final PolicyStub stub;

  /** Constructs an instance of PolicyClient with default settings. */
  public static final PolicyClient create() throws IOException {
    return create(PolicySettings.newBuilder().build());
  }

  /**
   * Constructs an instance of PolicyClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final PolicyClient create(PolicySettings settings) throws IOException {
    return new PolicyClient(settings);
  }

  /**
   * Constructs an instance of PolicyClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use PolicySettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final PolicyClient create(PolicyStub stub) {
    return new PolicyClient(stub);
  }

  /**
   * Constructs an instance of PolicyClient, using the given settings. This is protected so that it
   * is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected PolicyClient(PolicySettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((PolicyStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected PolicyClient(PolicyStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final PolicySettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public PolicyStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a new Policy
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   Policy policyResource = Policy.newBuilder().build();
   *   Policy response = policyClient.createPolicy(project, policyResource);
   * }
   * </code></pre>
   *
   * @param project Identifies the project addressed by this request.
   * @param policyResource A policy is a collection of DNS rules applied to one or more Virtual
   *     Private Cloud resources.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Policy createPolicy(ProjectName project, Policy policyResource) {
    CreatePolicyHttpRequest request =
        CreatePolicyHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .setPolicyResource(policyResource)
            .build();
    return createPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a new Policy
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   Policy policyResource = Policy.newBuilder().build();
   *   Policy response = policyClient.createPolicy(project.toString(), policyResource);
   * }
   * </code></pre>
   *
   * @param project Identifies the project addressed by this request.
   * @param policyResource A policy is a collection of DNS rules applied to one or more Virtual
   *     Private Cloud resources.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Policy createPolicy(String project, Policy policyResource) {
    CreatePolicyHttpRequest request =
        CreatePolicyHttpRequest.newBuilder()
            .setProject(project)
            .setPolicyResource(policyResource)
            .build();
    return createPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a new Policy
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   Policy policyResource = Policy.newBuilder().build();
   *   CreatePolicyHttpRequest request = CreatePolicyHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setPolicyResource(policyResource)
   *     .build();
   *   Policy response = policyClient.createPolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Policy createPolicy(CreatePolicyHttpRequest request) {
    return createPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a new Policy
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   Policy policyResource = Policy.newBuilder().build();
   *   CreatePolicyHttpRequest request = CreatePolicyHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setPolicyResource(policyResource)
   *     .build();
   *   ApiFuture&lt;Policy&gt; future = policyClient.createPolicyCallable().futureCall(request);
   *   // Do something
   *   Policy response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<CreatePolicyHttpRequest, Policy> createPolicyCallable() {
    return stub.createPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Delete a previously created Policy. Will fail if the policy is still being referenced by a
   * network.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   ProjectPolicyName policy = ProjectPolicyName.of("[PROJECT]", "[POLICY]");
   *   policyClient.deletePolicy(policy);
   * }
   * </code></pre>
   *
   * @param policy User given friendly name of the policy addressed by this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final void deletePolicy(ProjectPolicyName policy) {
    DeletePolicyHttpRequest request =
        DeletePolicyHttpRequest.newBuilder()
            .setPolicy(policy == null ? null : policy.toString())
            .build();
    deletePolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Delete a previously created Policy. Will fail if the policy is still being referenced by a
   * network.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   ProjectPolicyName policy = ProjectPolicyName.of("[PROJECT]", "[POLICY]");
   *   policyClient.deletePolicy(policy.toString());
   * }
   * </code></pre>
   *
   * @param policy User given friendly name of the policy addressed by this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final void deletePolicy(String policy) {
    DeletePolicyHttpRequest request =
        DeletePolicyHttpRequest.newBuilder().setPolicy(policy).build();
    deletePolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Delete a previously created Policy. Will fail if the policy is still being referenced by a
   * network.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   String formattedPolicy = ProjectPolicyName.format("[PROJECT]", "[POLICY]");
   *   DeletePolicyHttpRequest request = DeletePolicyHttpRequest.newBuilder()
   *     .setPolicy(formattedPolicy)
   *     .build();
   *   policyClient.deletePolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final void deletePolicy(DeletePolicyHttpRequest request) {
    deletePolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Delete a previously created Policy. Will fail if the policy is still being referenced by a
   * network.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   String formattedPolicy = ProjectPolicyName.format("[PROJECT]", "[POLICY]");
   *   DeletePolicyHttpRequest request = DeletePolicyHttpRequest.newBuilder()
   *     .setPolicy(formattedPolicy)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = policyClient.deletePolicyCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeletePolicyHttpRequest, Void> deletePolicyCallable() {
    return stub.deletePolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing Policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   ProjectPolicyName policy = ProjectPolicyName.of("[PROJECT]", "[POLICY]");
   *   Policy response = policyClient.getPolicy(policy);
   * }
   * </code></pre>
   *
   * @param policy User given friendly name of the policy addressed by this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Policy getPolicy(ProjectPolicyName policy) {
    GetPolicyHttpRequest request =
        GetPolicyHttpRequest.newBuilder()
            .setPolicy(policy == null ? null : policy.toString())
            .build();
    return getPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing Policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   ProjectPolicyName policy = ProjectPolicyName.of("[PROJECT]", "[POLICY]");
   *   Policy response = policyClient.getPolicy(policy.toString());
   * }
   * </code></pre>
   *
   * @param policy User given friendly name of the policy addressed by this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Policy getPolicy(String policy) {
    GetPolicyHttpRequest request = GetPolicyHttpRequest.newBuilder().setPolicy(policy).build();
    return getPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing Policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   String formattedPolicy = ProjectPolicyName.format("[PROJECT]", "[POLICY]");
   *   GetPolicyHttpRequest request = GetPolicyHttpRequest.newBuilder()
   *     .setPolicy(formattedPolicy)
   *     .build();
   *   Policy response = policyClient.getPolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Policy getPolicy(GetPolicyHttpRequest request) {
    return getPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Fetch the representation of an existing Policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   String formattedPolicy = ProjectPolicyName.format("[PROJECT]", "[POLICY]");
   *   GetPolicyHttpRequest request = GetPolicyHttpRequest.newBuilder()
   *     .setPolicy(formattedPolicy)
   *     .build();
   *   ApiFuture&lt;Policy&gt; future = policyClient.getPolicyCallable().futureCall(request);
   *   // Do something
   *   Policy response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetPolicyHttpRequest, Policy> getPolicyCallable() {
    return stub.getPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate all Policies associated with a project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (Policy element : policyClient.listPolicies(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Identifies the project addressed by this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListPoliciesPagedResponse listPolicies(ProjectName project) {
    ListPoliciesHttpRequest request =
        ListPoliciesHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .build();
    return listPolicies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate all Policies associated with a project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (Policy element : policyClient.listPolicies(project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Identifies the project addressed by this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListPoliciesPagedResponse listPolicies(String project) {
    ListPoliciesHttpRequest request =
        ListPoliciesHttpRequest.newBuilder().setProject(project).build();
    return listPolicies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate all Policies associated with a project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   ListPoliciesHttpRequest request = ListPoliciesHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   for (Policy element : policyClient.listPolicies(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListPoliciesPagedResponse listPolicies(ListPoliciesHttpRequest request) {
    return listPoliciesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate all Policies associated with a project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   ListPoliciesHttpRequest request = ListPoliciesHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   ApiFuture&lt;ListPoliciesPagedResponse&gt; future = policyClient.listPoliciesPagedCallable().futureCall(request);
   *   // Do something
   *   for (Policy element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListPoliciesHttpRequest, ListPoliciesPagedResponse>
      listPoliciesPagedCallable() {
    return stub.listPoliciesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Enumerate all Policies associated with a project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   ListPoliciesHttpRequest request = ListPoliciesHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   while (true) {
   *     PoliciesListResponse response = policyClient.listPoliciesCallable().call(request);
   *     for (Policy element : response.getPoliciesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListPoliciesHttpRequest, PoliciesListResponse> listPoliciesCallable() {
    return stub.listPoliciesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Apply a partial update to an existing Policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   ProjectPolicyName policy = ProjectPolicyName.of("[PROJECT]", "[POLICY]");
   *   Policy policyResource = Policy.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PoliciesPatchResponse response = policyClient.patchPolicy(policy, policyResource, fieldMask);
   * }
   * </code></pre>
   *
   * @param policy User given friendly name of the policy addressed by this request.
   * @param policyResource A policy is a collection of DNS rules applied to one or more Virtual
   *     Private Cloud resources.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final PoliciesPatchResponse patchPolicy(
      ProjectPolicyName policy, Policy policyResource, List<String> fieldMask) {
    PatchPolicyHttpRequest request =
        PatchPolicyHttpRequest.newBuilder()
            .setPolicy(policy == null ? null : policy.toString())
            .setPolicyResource(policyResource)
            .addAllFieldMask(fieldMask)
            .build();
    return patchPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Apply a partial update to an existing Policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   ProjectPolicyName policy = ProjectPolicyName.of("[PROJECT]", "[POLICY]");
   *   Policy policyResource = Policy.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PoliciesPatchResponse response = policyClient.patchPolicy(policy.toString(), policyResource, fieldMask);
   * }
   * </code></pre>
   *
   * @param policy User given friendly name of the policy addressed by this request.
   * @param policyResource A policy is a collection of DNS rules applied to one or more Virtual
   *     Private Cloud resources.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final PoliciesPatchResponse patchPolicy(
      String policy, Policy policyResource, List<String> fieldMask) {
    PatchPolicyHttpRequest request =
        PatchPolicyHttpRequest.newBuilder()
            .setPolicy(policy)
            .setPolicyResource(policyResource)
            .addAllFieldMask(fieldMask)
            .build();
    return patchPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Apply a partial update to an existing Policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   String formattedPolicy = ProjectPolicyName.format("[PROJECT]", "[POLICY]");
   *   Policy policyResource = Policy.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PatchPolicyHttpRequest request = PatchPolicyHttpRequest.newBuilder()
   *     .setPolicy(formattedPolicy)
   *     .setPolicyResource(policyResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   PoliciesPatchResponse response = policyClient.patchPolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final PoliciesPatchResponse patchPolicy(PatchPolicyHttpRequest request) {
    return patchPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Apply a partial update to an existing Policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   String formattedPolicy = ProjectPolicyName.format("[PROJECT]", "[POLICY]");
   *   Policy policyResource = Policy.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PatchPolicyHttpRequest request = PatchPolicyHttpRequest.newBuilder()
   *     .setPolicy(formattedPolicy)
   *     .setPolicyResource(policyResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   ApiFuture&lt;PoliciesPatchResponse&gt; future = policyClient.patchPolicyCallable().futureCall(request);
   *   // Do something
   *   PoliciesPatchResponse response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchPolicyHttpRequest, PoliciesPatchResponse> patchPolicyCallable() {
    return stub.patchPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Update an existing Policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   ProjectPolicyName policy = ProjectPolicyName.of("[PROJECT]", "[POLICY]");
   *   Policy policyResource = Policy.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PoliciesUpdateResponse response = policyClient.updatePolicy(policy, policyResource, fieldMask);
   * }
   * </code></pre>
   *
   * @param policy User given friendly name of the policy addressed by this request.
   * @param policyResource A policy is a collection of DNS rules applied to one or more Virtual
   *     Private Cloud resources.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final PoliciesUpdateResponse updatePolicy(
      ProjectPolicyName policy, Policy policyResource, List<String> fieldMask) {
    UpdatePolicyHttpRequest request =
        UpdatePolicyHttpRequest.newBuilder()
            .setPolicy(policy == null ? null : policy.toString())
            .setPolicyResource(policyResource)
            .addAllFieldMask(fieldMask)
            .build();
    return updatePolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Update an existing Policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   ProjectPolicyName policy = ProjectPolicyName.of("[PROJECT]", "[POLICY]");
   *   Policy policyResource = Policy.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PoliciesUpdateResponse response = policyClient.updatePolicy(policy.toString(), policyResource, fieldMask);
   * }
   * </code></pre>
   *
   * @param policy User given friendly name of the policy addressed by this request.
   * @param policyResource A policy is a collection of DNS rules applied to one or more Virtual
   *     Private Cloud resources.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final PoliciesUpdateResponse updatePolicy(
      String policy, Policy policyResource, List<String> fieldMask) {
    UpdatePolicyHttpRequest request =
        UpdatePolicyHttpRequest.newBuilder()
            .setPolicy(policy)
            .setPolicyResource(policyResource)
            .addAllFieldMask(fieldMask)
            .build();
    return updatePolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Update an existing Policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   String formattedPolicy = ProjectPolicyName.format("[PROJECT]", "[POLICY]");
   *   Policy policyResource = Policy.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   UpdatePolicyHttpRequest request = UpdatePolicyHttpRequest.newBuilder()
   *     .setPolicy(formattedPolicy)
   *     .setPolicyResource(policyResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   PoliciesUpdateResponse response = policyClient.updatePolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final PoliciesUpdateResponse updatePolicy(UpdatePolicyHttpRequest request) {
    return updatePolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Update an existing Policy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (PolicyClient policyClient = PolicyClient.create()) {
   *   String formattedPolicy = ProjectPolicyName.format("[PROJECT]", "[POLICY]");
   *   Policy policyResource = Policy.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   UpdatePolicyHttpRequest request = UpdatePolicyHttpRequest.newBuilder()
   *     .setPolicy(formattedPolicy)
   *     .setPolicyResource(policyResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   ApiFuture&lt;PoliciesUpdateResponse&gt; future = policyClient.updatePolicyCallable().futureCall(request);
   *   // Do something
   *   PoliciesUpdateResponse response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdatePolicyHttpRequest, PoliciesUpdateResponse>
      updatePolicyCallable() {
    return stub.updatePolicyCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListPoliciesPagedResponse
      extends AbstractPagedListResponse<
          ListPoliciesHttpRequest,
          PoliciesListResponse,
          Policy,
          ListPoliciesPage,
          ListPoliciesFixedSizeCollection> {

    public static ApiFuture<ListPoliciesPagedResponse> createAsync(
        PageContext<ListPoliciesHttpRequest, PoliciesListResponse, Policy> context,
        ApiFuture<PoliciesListResponse> futureResponse) {
      ApiFuture<ListPoliciesPage> futurePage =
          ListPoliciesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListPoliciesPage, ListPoliciesPagedResponse>() {
            @Override
            public ListPoliciesPagedResponse apply(ListPoliciesPage input) {
              return new ListPoliciesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListPoliciesPagedResponse(ListPoliciesPage page) {
      super(page, ListPoliciesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListPoliciesPage
      extends AbstractPage<
          ListPoliciesHttpRequest, PoliciesListResponse, Policy, ListPoliciesPage> {

    private ListPoliciesPage(
        PageContext<ListPoliciesHttpRequest, PoliciesListResponse, Policy> context,
        PoliciesListResponse response) {
      super(context, response);
    }

    private static ListPoliciesPage createEmptyPage() {
      return new ListPoliciesPage(null, null);
    }

    @Override
    protected ListPoliciesPage createPage(
        PageContext<ListPoliciesHttpRequest, PoliciesListResponse, Policy> context,
        PoliciesListResponse response) {
      return new ListPoliciesPage(context, response);
    }

    @Override
    public ApiFuture<ListPoliciesPage> createPageAsync(
        PageContext<ListPoliciesHttpRequest, PoliciesListResponse, Policy> context,
        ApiFuture<PoliciesListResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListPoliciesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListPoliciesHttpRequest,
          PoliciesListResponse,
          Policy,
          ListPoliciesPage,
          ListPoliciesFixedSizeCollection> {

    private ListPoliciesFixedSizeCollection(List<ListPoliciesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListPoliciesFixedSizeCollection createEmptyCollection() {
      return new ListPoliciesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListPoliciesFixedSizeCollection createCollection(
        List<ListPoliciesPage> pages, int collectionSize) {
      return new ListPoliciesFixedSizeCollection(pages, collectionSize);
    }
  }
}
