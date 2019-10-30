/*
 * Copyright 2016 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.dns;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.api.services.dns.model.ManagedZone;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

public class ZoneInfoTest {

  private static final String NAME = "mz-example.com";
  private static final String GENERATED_ID = "123456";
  private static final Long CREATION_TIME_MILLIS = 1123468321321L;
  private static final String DNS_NAME = "example.com.";
  private static final String DESCRIPTION = "description for the zone";
  private static final String NAME_SERVER_SET = "some set";
  private static final String NS1 = "name server 1";
  private static final String NS2 = "name server 2";
  private static final String NS3 = "name server 3";
  private static final List<String> NAME_SERVERS = ImmutableList.of(NS1, NS2, NS3);
  private static final ZoneInfo INFO =
      ZoneInfo.of(NAME, DNS_NAME, DESCRIPTION)
          .toBuilder()
          .setCreationTimeMillis(CREATION_TIME_MILLIS)
          .setGeneratedId(GENERATED_ID)
          .setNameServerSet(NAME_SERVER_SET)
          .setNameServers(NAME_SERVERS)
          .build();

  @Test
  public void testOf() {
    ZoneInfo partial = ZoneInfo.of(NAME, DNS_NAME, DESCRIPTION);
    assertTrue(partial.getNameServers().isEmpty());
    assertEquals(NAME, partial.getName());
    assertNull(partial.getGeneratedId());
    assertNull(partial.getCreationTimeMillis());
    assertNull(partial.getNameServerSet());
    assertEquals(DESCRIPTION, partial.getDescription());
    assertEquals(DNS_NAME, partial.getDnsName());
  }

  @Test
  public void testBuilder() {
    assertEquals(3, INFO.getNameServers().size());
    assertEquals(NS1, INFO.getNameServers().get(0));
    assertEquals(NS2, INFO.getNameServers().get(1));
    assertEquals(NS3, INFO.getNameServers().get(2));
    assertEquals(NAME, INFO.getName());
    assertEquals(GENERATED_ID, INFO.getGeneratedId());
    assertEquals(CREATION_TIME_MILLIS, INFO.getCreationTimeMillis());
    assertEquals(NAME_SERVER_SET, INFO.getNameServerSet());
    assertEquals(DESCRIPTION, INFO.getDescription());
    assertEquals(DNS_NAME, INFO.getDnsName());
  }

  @Test
  public void testEqualsAndNotEquals() {
    ZoneInfo clone = INFO.toBuilder().build();
    assertEquals(INFO, clone);
    List<String> moreServers = Lists.newLinkedList(NAME_SERVERS);
    moreServers.add(NS1);
    clone = INFO.toBuilder().setNameServers(moreServers).build();
    assertNotEquals(INFO, clone);
    String differentName = "totally different name";
    clone = INFO.toBuilder().setName(differentName).build();
    assertNotEquals(INFO, clone);
    clone = INFO.toBuilder().setCreationTimeMillis(INFO.getCreationTimeMillis() + 1).build();
    assertNotEquals(INFO, clone);
    clone = INFO.toBuilder().setDescription(INFO.getDescription() + "aaaa").build();
    assertNotEquals(INFO, clone);
    clone = INFO.toBuilder().setDnsName(differentName).build();
    assertNotEquals(INFO, clone);
    clone = INFO.toBuilder().setGeneratedId(INFO.getGeneratedId() + "1111").build();
    assertNotEquals(INFO, clone);
    clone = INFO.toBuilder().setNameServerSet(INFO.getNameServerSet() + "salt").build();
    assertNotEquals(INFO, clone);
  }

  @Test
  public void testSameHashCodeOnEquals() {
    int hash = INFO.hashCode();
    ZoneInfo clone = INFO.toBuilder().build();
    assertEquals(clone.hashCode(), hash);
  }

  @Test
  public void testToBuilder() {
    assertEquals(INFO, INFO.toBuilder().build());
    ZoneInfo partial = ZoneInfo.of(NAME, DNS_NAME, DESCRIPTION);
    assertEquals(partial, partial.toBuilder().build());
    partial =
        ZoneInfo.of(NAME, DNS_NAME, DESCRIPTION).toBuilder().setGeneratedId(GENERATED_ID).build();
    assertEquals(partial, partial.toBuilder().build());
    partial =
        ZoneInfo.of(NAME, DNS_NAME, DESCRIPTION)
            .toBuilder()
            .setCreationTimeMillis(CREATION_TIME_MILLIS)
            .build();
    assertEquals(partial, partial.toBuilder().build());
    List<String> nameServers = new LinkedList<>();
    nameServers.add(NS1);
    partial =
        ZoneInfo.of(NAME, DNS_NAME, DESCRIPTION).toBuilder().setNameServers(nameServers).build();
    assertEquals(partial, partial.toBuilder().build());
    partial =
        ZoneInfo.of(NAME, DNS_NAME, DESCRIPTION)
            .toBuilder()
            .setNameServerSet(NAME_SERVER_SET)
            .build();
    assertEquals(partial, partial.toBuilder().build());
  }

  @Test
  public void testToAndFromPb() {
    assertEquals(INFO, ZoneInfo.fromPb(INFO.toPb()));
    ZoneInfo partial = ZoneInfo.of(NAME, DNS_NAME, DESCRIPTION);
    assertEquals(partial, ZoneInfo.fromPb(partial.toPb()));
    partial =
        ZoneInfo.of(NAME, DNS_NAME, DESCRIPTION).toBuilder().setGeneratedId(GENERATED_ID).build();
    assertEquals(partial, ZoneInfo.fromPb(partial.toPb()));
    partial =
        ZoneInfo.of(NAME, DNS_NAME, DESCRIPTION)
            .toBuilder()
            .setCreationTimeMillis(CREATION_TIME_MILLIS)
            .build();
    assertEquals(partial, ZoneInfo.fromPb(partial.toPb()));
    List<String> nameServers = new LinkedList<>();
    nameServers.add(NS1);
    partial =
        ZoneInfo.of(NAME, DNS_NAME, DESCRIPTION).toBuilder().setNameServers(nameServers).build();
    assertEquals(partial, ZoneInfo.fromPb(partial.toPb()));
    partial =
        ZoneInfo.of(NAME, DNS_NAME, DESCRIPTION)
            .toBuilder()
            .setNameServerSet(NAME_SERVER_SET)
            .build();
    assertEquals(partial, ZoneInfo.fromPb(partial.toPb()));
  }

  @Test
  public void testEmptyNameServers() {
    ZoneInfo clone = INFO.toBuilder().setNameServers(new LinkedList<String>()).build();
    assertTrue(clone.getNameServers().isEmpty());
    clone.toPb(); // test that this is allowed
  }

  @Test
  public void testDateParsing() {
    ManagedZone pb = INFO.toPb();
    pb.setCreationTime("2016-01-19T18:00:12.854Z"); // a real value obtained from Google Cloud DNS
    ZoneInfo mz = ZoneInfo.fromPb(pb); // parses the string timestamp to millis
    ManagedZone pbClone = mz.toPb(); // converts it back to string
    assertEquals(pb, pbClone);
    assertEquals(pb.getCreationTime(), pbClone.getCreationTime());
  }
}
