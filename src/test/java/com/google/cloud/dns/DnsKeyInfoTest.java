/*
 * Copyright 2020 Google LLC
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

import com.google.common.collect.ImmutableList;
import org.junit.Test;

public class DnsKeyInfoTest {

  private static final String ALGORITHM = "rsasha256";
  private static final String CREATION_TIME = "2020-03-30T08: 17: 54.238Z";
  private static final String DESCRIPTION = "DESCRIPTION";
  private static final String DIGEST =
      "79E78E89063C3E93E46A1980ACCEFAA4D6CEBB3A64E1D8861D07AB11B9C2114E";
  private static final String DIGEST_TYPE = "sha256";
  private static final String ID = "0";
  private static final Boolean IS_ACTIVE = true;
  private static final Long KEY_LENGTH = 2048L;
  private static final Integer KEY_TAG = 42469;
  private static final String KIND = "dns#dnsKey";
  private static final String PUBLIC_KEY =
      "AwEAAY0YBNl1ImXLMd8FiSGLkR/1WwFXsZne7id96Be+76HFEP2zsoiy9oSd2Pjlfk2QDUeg1+MKc2JQFbvYOANejCpVHq1Z+qck7KeeLdA6qeg6fbRwlgIFE+9mC94PncghLzA/i8kSWlT9YP58qe/ACR/lgSVc35qDyYWrAOOI4+F50wrwhi8j/YentIxlQjYI5Jrj7HExhk7NXH9WWDtQdooBZrgrC1uSWvan4b2rOQxujJ/CWpXv4p5iyrtFD/u6q5nmCW8BjxCq9NJW4vJTtrN7plngd0jrbfAFUE+pzOSgsD0fOc+vIB++Ksuni5qME1zBEnUIbVueFmun2HNPWI0=";
  private static final String TYPE = "keySigning";
  private static final DnsKeyInfo.DnsKeyDigestInfo DNS_KEY_DIGEST =
      DnsKeyInfo.DnsKeyDigestInfo.newBuilder().setDigest(DIGEST).setType(DIGEST_TYPE).build();
  private static final DnsKeyInfo DNS_KEY_INFO =
      DnsKeyInfo.newBuilder()
          .setAlgorithm(ALGORITHM)
          .setCreationTime(CREATION_TIME)
          .setDescription(DESCRIPTION)
          .setDigests(ImmutableList.of(DNS_KEY_DIGEST))
          .setId(ID)
          .setIsActive(IS_ACTIVE)
          .setKeyLength(KEY_LENGTH)
          .setKeyTag(KEY_TAG)
          .setKind(KIND)
          .setPublicKey(PUBLIC_KEY)
          .setType(TYPE)
          .build();

  @Test
  public void testBuilder() {
    assertEquals(ALGORITHM, DNS_KEY_INFO.getAlgorithm());
    assertEquals(CREATION_TIME, DNS_KEY_INFO.getCreationTime());
    assertEquals(DESCRIPTION, DNS_KEY_INFO.getDescription());
    assertEquals(ImmutableList.of(DNS_KEY_DIGEST), DNS_KEY_INFO.getDigests());
    assertEquals(ID, DNS_KEY_INFO.getId());
    assertEquals(IS_ACTIVE, DNS_KEY_INFO.getIsActive());
    assertEquals(KEY_LENGTH, DNS_KEY_INFO.getKeyLength());
    assertEquals(KEY_TAG, DNS_KEY_INFO.getKeyTag());
    assertEquals(KIND, DNS_KEY_INFO.getKind());
    assertEquals(PUBLIC_KEY, DNS_KEY_INFO.getPublicKey());
    assertEquals(TYPE, DNS_KEY_INFO.getType());
  }

  @Test
  public void testToProtobufAndFromProtobuf() {
    DnsKeyInfo info = DnsKeyInfo.fromProtobuf(DNS_KEY_INFO.toProtobuf());
    compareDnsKey(DNS_KEY_INFO, info);
  }

  private static void compareDnsKey(DnsKeyInfo expected, DnsKeyInfo actual) {
    assertEquals(expected, actual);
    assertEquals(expected.getAlgorithm(), actual.getAlgorithm());
    assertEquals(expected.getCreationTime(), actual.getCreationTime());
    assertEquals(expected.getDescription(), actual.getDescription());
    assertEquals(expected.getDigests(), actual.getDigests());
    assertEquals(expected.getId(), actual.getId());
    assertEquals(expected.getIsActive(), actual.getIsActive());
    assertEquals(expected.getKeyLength(), actual.getKeyLength());
    assertEquals(expected.getKeyTag(), actual.getKeyTag());
    assertEquals(expected.getKind(), actual.getKind());
    assertEquals(expected.getPublicKey(), actual.getPublicKey());
    assertEquals(expected.getType(), actual.getType());
    assertEquals(expected.hashCode(), actual.hashCode());
    assertEquals(expected.toString(), actual.toString());
  }
}
