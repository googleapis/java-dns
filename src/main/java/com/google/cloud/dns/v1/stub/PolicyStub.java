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
package com.google.cloud.dns.v1.stub;

import static com.google.cloud.dns.v1.PolicyClient.ListPoliciesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dns.v1.CreatePolicyHttpRequest;
import com.google.cloud.dns.v1.DeletePolicyHttpRequest;
import com.google.cloud.dns.v1.GetPolicyHttpRequest;
import com.google.cloud.dns.v1.ListPoliciesHttpRequest;
import com.google.cloud.dns.v1.PatchPolicyHttpRequest;
import com.google.cloud.dns.v1.PoliciesListResponse;
import com.google.cloud.dns.v1.PoliciesPatchResponse;
import com.google.cloud.dns.v1.PoliciesUpdateResponse;
import com.google.cloud.dns.v1.Policy;
import com.google.cloud.dns.v1.UpdatePolicyHttpRequest;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for dns.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class PolicyStub implements BackgroundResource {

  @BetaApi
  public UnaryCallable<CreatePolicyHttpRequest, Policy> createPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: createPolicyCallable()");
  }

  @BetaApi
  public UnaryCallable<DeletePolicyHttpRequest, Void> deletePolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: deletePolicyCallable()");
  }

  @BetaApi
  public UnaryCallable<GetPolicyHttpRequest, Policy> getPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: getPolicyCallable()");
  }

  @BetaApi
  public UnaryCallable<ListPoliciesHttpRequest, ListPoliciesPagedResponse>
      listPoliciesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listPoliciesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListPoliciesHttpRequest, PoliciesListResponse> listPoliciesCallable() {
    throw new UnsupportedOperationException("Not implemented: listPoliciesCallable()");
  }

  @BetaApi
  public UnaryCallable<PatchPolicyHttpRequest, PoliciesPatchResponse> patchPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: patchPolicyCallable()");
  }

  @BetaApi
  public UnaryCallable<UpdatePolicyHttpRequest, PoliciesUpdateResponse> updatePolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: updatePolicyCallable()");
  }

  @Override
  public abstract void close();
}
