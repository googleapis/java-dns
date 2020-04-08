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

import static com.google.cloud.dns.v1.ManagedZoneClient.ListManagedZonesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dns.v1.CreateManagedZoneHttpRequest;
import com.google.cloud.dns.v1.DeleteManagedZoneHttpRequest;
import com.google.cloud.dns.v1.GetManagedZoneHttpRequest;
import com.google.cloud.dns.v1.ListManagedZonesHttpRequest;
import com.google.cloud.dns.v1.ManagedZone;
import com.google.cloud.dns.v1.ManagedZonesListResponse;
import com.google.cloud.dns.v1.Operation;
import com.google.cloud.dns.v1.PatchManagedZoneHttpRequest;
import com.google.cloud.dns.v1.UpdateManagedZoneHttpRequest;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for dns.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class ManagedZoneStub implements BackgroundResource {

  @BetaApi
  public UnaryCallable<CreateManagedZoneHttpRequest, ManagedZone> createManagedZoneCallable() {
    throw new UnsupportedOperationException("Not implemented: createManagedZoneCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteManagedZoneHttpRequest, Void> deleteManagedZoneCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteManagedZoneCallable()");
  }

  @BetaApi
  public UnaryCallable<GetManagedZoneHttpRequest, ManagedZone> getManagedZoneCallable() {
    throw new UnsupportedOperationException("Not implemented: getManagedZoneCallable()");
  }

  @BetaApi
  public UnaryCallable<ListManagedZonesHttpRequest, ListManagedZonesPagedResponse>
      listManagedZonesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listManagedZonesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListManagedZonesHttpRequest, ManagedZonesListResponse>
      listManagedZonesCallable() {
    throw new UnsupportedOperationException("Not implemented: listManagedZonesCallable()");
  }

  @BetaApi
  public UnaryCallable<PatchManagedZoneHttpRequest, Operation> patchManagedZoneCallable() {
    throw new UnsupportedOperationException("Not implemented: patchManagedZoneCallable()");
  }

  @BetaApi
  public UnaryCallable<UpdateManagedZoneHttpRequest, Operation> updateManagedZoneCallable() {
    throw new UnsupportedOperationException("Not implemented: updateManagedZoneCallable()");
  }

  @Override
  public abstract void close();
}
