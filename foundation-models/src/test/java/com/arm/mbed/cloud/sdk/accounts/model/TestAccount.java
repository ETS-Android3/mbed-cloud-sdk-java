// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model Account. */
public class TestAccount {
  /**
   * Tests the clone method.
   */
  @Test
  public void testClone() {
    try {
      Account account1 = new Account("0fe94f71-a249-4d3e-946a-cbe8ef53d676",
          "9a0bb656-768b-4edb-9673-47bbdb919463",
          "4e6a4b22-7cc1-41a5-ab42-8a31d0f8c7c0",
          "2fc11ab8-7b20-4bcd-b34d-836c6a11fa99",
          "7bd81f44-33da-4b6f-9de9-36cae440ee9c",
          "a299b86f-9967-4bc6-abd6-b18a7ed4d40f",
          "d46ef44d-d9ba-4476-88ae-93b77ba81fb5",
          "2a2468aa-079f-4082-a8c9-c9857e77e26e",
          null,
          "97db4a53-2b19-4f95-bacc-9c7c24c58318",
          "b1d08e38-0066-446b-b26b-635fdc321354",
          "60e264a6-2859-4550-84db-b854173730ec",
          "dd9ae6b4-2cfd-45f9-9912-6759d08467fb",
          "32d1a827-7c74-47a6-b2b4-d3ae1a047c49",
          new java.util.Date(1546452531562L),
          null,
          "dd019df9-49a3-48f7-8a30-d1df5112dac6",
          "d61a76ff-21ae-48f9-9bcc-49fb1540e2ef",
          "fbd2d53d-ebf4-4c4b-8212-fffe00f8a56c",
          "5c4a829d-464a-4823-ac55-7a83402a6a4d",
          "d9c0221d-2f9f-4bcc-9dc8-860f90cb804a",
          "36eec341-f2ae-4cb2-a354-5eacb137ec2b",
          "6492f1e0-74ef-4642-984e-8df5ae5d38d3",
          null,
          com.arm.mbed.cloud.sdk.accounts.model.AccountMfaStatus.getDefault(),
          null,
          null,
          "9641edb8-6b4d-4c52-9d0b-38876cb7b1c2",
          null,
          "e9e0dce5-9faf-4c8e-adb7-5fbe2cc41436",
          null,
          "b1a0286f-09d1-44f2-8f53-bbf78c297df4",
          "b61e3e9c-c9ab-4ac3-a846-a4f0196c5127",
          "7015c602-1b69-4772-9bed-ce0342feb72f",
          "a9afe616-5a6e-4bb4-8290-495b9f0f8dfe",
          "979994cc-5978-4db8-a7a3-2508950edabc",
          com.arm.mbed.cloud.sdk.accounts.model.AccountStatus.getDefault(),
          "943d9117-685f-4675-9c6e-5d2af53fade2",
          "f2d6ebcf-937c-43ee-83aa-e1e27a19d896",
          new java.util.Date(1546452535644L),
          new java.util.Date(1546452533807L));
      Account account2 = account1.clone();
      assertNotNull(account1);
      assertNotNull(account2);
      assertNotSame(account2, account1);
      assertEquals(account2, account1);
    }
    catch(Exception exception) {
      fail(exception.getMessage());
    }
  }

  /**
   * Tests the isValid method.
   */
  @Test
  public void testIsvalid() {
    Account account = new Account("857dfa61-1cfa-4c23-8802-7aff858f4cb0",
        "56cb0bcd-a85e-497b-b601-0bf36799c821",
        "2c74df24-ce0a-4749-b94e-adeb18de67e3",
        "ea3dc221-3a67-4cf3-9558-edc8fbeac72f",
        "4f662fa5-d54e-43f7-b6c1-4da219ba9232",
        "cc92c745-eaf9-4a61-b570-873a6e12b5d5",
        "071abc63-bb29-496b-9285-b38ee9e84575",
        "7e4feac5-318d-4fd4-ab7b-da74f5f5669a",
        null,
        "2b73e787-d353-48e6-9ffe-884aae45190e",
        "a2432ff1-96eb-4db2-acf6-837e0fc3e692",
        "b2b986a1-f762-47d9-9572-ba318687f301",
        "c7123fcf-3881-4956-9be6-6b7b2d647674",
        "0b8030ce-8fe4-415f-9327-0c413627b961",
        new java.util.Date(1546452535001L),
        null,
        "d1f307a2-e63c-4f74-bc92-4c093969dcd3",
        "ac8e3934-9b95-406d-8dee-96ebe205de7a",
        "cace3af4-e5c1-4ccb-a6e0-975d59c309a8",
        "897e627f-a193-4684-86e2-f3b565554826",
        "fa81b408-6c54-4aa1-b368-e917a2fbda69",
        "308f4d4d-f81c-4f1c-8c0c-892127c7381a",
        "b821b054-70b4-429c-8fab-28d61e798989",
        null,
        com.arm.mbed.cloud.sdk.accounts.model.AccountMfaStatus.getDefault(),
        null,
        null,
        "5bd030d7-56f8-449b-b66a-f987939c5327",
        null,
        "23db6c3a-dd52-4290-815b-6ca01f0c736e",
        null,
        "66f5255d-8311-4f81-9e42-5855b147c4f9",
        "b2d55aff-e4af-4d17-a8b3-cfd7a164b2e7",
        "87b49d4a-73aa-46a2-bada-fc953456155d",
        "a1b1d10b-9c8c-4dfa-b862-e2b0a697b2a7",
        "f4928614-306e-4836-9f23-a4bbdcffbeff",
        com.arm.mbed.cloud.sdk.accounts.model.AccountStatus.getDefault(),
        "b7b0e603-44b8-4092-b169-9843802e176f",
        "7b0aa822-9132-439a-aacc-c57daac559e3",
        new java.util.Date(1546452531638L),
        new java.util.Date(1546452536983L));
    assertTrue(account.isValid());
  }

  /**
   * Tests the hashCode method.
   */
  @Test
  public void testHashcode() {
    try {
      Account account1 = new Account("c5b1ab62-bb73-46a7-9f54-43d8dba63268",
          "e37d1c8b-3078-426b-be31-a64a22e7cdc8",
          "738b9664-9f2a-4ec6-a2c3-06143a4f1fc5",
          "84128213-a19a-4d36-a1f0-9156c5e9ae6a",
          "b30e3717-0f20-4491-849e-cc50eec5b740",
          "51ad580e-14ca-4c7e-b1d1-a5eb15f04bfc",
          "296ad0f8-6cb2-4302-9f2b-4d88fee71d1d",
          "dfcd2bd4-5531-485c-83c9-74f66f6afe6a",
          null,
          "84a9861b-2150-4c0b-8e24-278b5cb1872d",
          "0b279ac6-37c9-431f-9bb1-cba6113f3823",
          "537e0886-886e-48ed-bac8-ea2e153b351a",
          "2f1d7d17-ff73-4866-b7e2-359a682096c0",
          "bd1b64ea-103b-4cae-80d0-8eb17b49c2c4",
          new java.util.Date(1546452539882L),
          null,
          "f4a08d9e-5ec6-41d4-873e-16ff3b49cb42",
          "6bbe66a7-250e-425a-86e1-01a655fd058a",
          "dff2aabd-119f-4763-a620-76a0df6d91ba",
          "7c8aa900-317a-4600-ba01-6048c08810f6",
          "47412286-2b1c-4419-a989-6070c7ad5a47",
          "10d61ffe-bd15-473c-b278-9a8990f42aa6",
          "c6323242-6db6-45bb-863a-ee3bc6c014a3",
          null,
          com.arm.mbed.cloud.sdk.accounts.model.AccountMfaStatus.getDefault(),
          null,
          null,
          "a8652fe0-25e5-4a30-88b9-1f3e95e6b42f",
          null,
          "c888482d-3d44-4eea-8d64-3269a7848305",
          null,
          "ce59f877-e625-420b-af0a-a7fa43a98dfa",
          "bbf5a9a7-48d1-41a7-a5ea-1b79e76f9cd2",
          "2ded3e0b-e292-46b5-a905-c5aa440740d2",
          "d4d0f7bc-f213-46c4-92ce-40074d0c38a8",
          "7842f3b5-5ef2-4a09-884b-d4bb5998ff21",
          com.arm.mbed.cloud.sdk.accounts.model.AccountStatus.getDefault(),
          "0c688627-3c5c-40e5-9fc4-42a4b36af0f9",
          "91e80c4e-6ba6-4905-8694-6d3526945774",
          new java.util.Date(1546452538548L),
          new java.util.Date(1546452537017L));
      Account account2 = new Account("c5b1ab62-bb73-46a7-9f54-43d8dba63268",
          "e37d1c8b-3078-426b-be31-a64a22e7cdc8",
          "738b9664-9f2a-4ec6-a2c3-06143a4f1fc5",
          "84128213-a19a-4d36-a1f0-9156c5e9ae6a",
          "b30e3717-0f20-4491-849e-cc50eec5b740",
          "51ad580e-14ca-4c7e-b1d1-a5eb15f04bfc",
          "296ad0f8-6cb2-4302-9f2b-4d88fee71d1d",
          "dfcd2bd4-5531-485c-83c9-74f66f6afe6a",
          null,
          "84a9861b-2150-4c0b-8e24-278b5cb1872d",
          "0b279ac6-37c9-431f-9bb1-cba6113f3823",
          "537e0886-886e-48ed-bac8-ea2e153b351a",
          "2f1d7d17-ff73-4866-b7e2-359a682096c0",
          "bd1b64ea-103b-4cae-80d0-8eb17b49c2c4",
          new java.util.Date(1546452539882L),
          null,
          "f4a08d9e-5ec6-41d4-873e-16ff3b49cb42",
          "6bbe66a7-250e-425a-86e1-01a655fd058a",
          "dff2aabd-119f-4763-a620-76a0df6d91ba",
          "7c8aa900-317a-4600-ba01-6048c08810f6",
          "47412286-2b1c-4419-a989-6070c7ad5a47",
          "10d61ffe-bd15-473c-b278-9a8990f42aa6",
          "c6323242-6db6-45bb-863a-ee3bc6c014a3",
          null,
          com.arm.mbed.cloud.sdk.accounts.model.AccountMfaStatus.getDefault(),
          null,
          null,
          "a8652fe0-25e5-4a30-88b9-1f3e95e6b42f",
          null,
          "c888482d-3d44-4eea-8d64-3269a7848305",
          null,
          "ce59f877-e625-420b-af0a-a7fa43a98dfa",
          "bbf5a9a7-48d1-41a7-a5ea-1b79e76f9cd2",
          "2ded3e0b-e292-46b5-a905-c5aa440740d2",
          "d4d0f7bc-f213-46c4-92ce-40074d0c38a8",
          "7842f3b5-5ef2-4a09-884b-d4bb5998ff21",
          com.arm.mbed.cloud.sdk.accounts.model.AccountStatus.getDefault(),
          "0c688627-3c5c-40e5-9fc4-42a4b36af0f9",
          "91e80c4e-6ba6-4905-8694-6d3526945774",
          new java.util.Date(1546452538548L),
          new java.util.Date(1546452537017L));
      assertNotNull(account1);
      assertNotNull(account2);
      assertNotSame(account2, account1);
      assertEquals(account2, account1);
      assertEquals(account2.hashCode(), account1.hashCode());
      int hashCode = account1.hashCode();
      for (int i = 0; i < 5 ; i++) {
        assertEquals(hashCode, account1.hashCode());
      }
    }
    catch(Exception exception) {
      fail(exception.getMessage());
    }
  }

  /**
   * Tests the equals method.
   */
  @Test
  public void testEquals() {
    try {
      Account account1 = new Account("069b2b0f-2ad5-43a2-b3ad-3def1f6fa126",
          "34368b3a-db76-4ef3-a79c-822bb98a28f9",
          "cc64d964-b5ee-4f5e-ab05-ad496eae488a",
          "f0c0edcd-470f-4f7c-ad98-805f6ea216bf",
          "44372b72-5761-4640-8583-7e88ee7dd398",
          "5b1ef0d5-2ead-44dc-b6e5-a421b4482438",
          "58b654a1-9120-47df-9106-c67e037666be",
          "d7a14ded-ac48-4e0d-ae48-38f0018fcc6c",
          null,
          "ccdd098d-c44c-4fe0-b570-4b519e5bdf79",
          "fa621a2f-83a8-4ef0-a623-e742e2e079f5",
          "feccfc3f-cdee-4835-8be2-2e9964559744",
          "7cfa3119-8428-4c60-8df3-6d234e3901d7",
          "78864b6a-0a2c-4435-8c1d-78856b400cfc",
          new java.util.Date(1546452533359L),
          null,
          "09eede5c-d419-4206-a5e4-daae572ad951",
          "773fe652-4892-46f5-9163-81cd9fc47fff",
          "370b7b08-3e64-4788-a62d-f045adb1436c",
          "4d15216f-8bf2-4d62-93d7-80ed0cc5975f",
          "e7f4008e-cc5e-408f-b80a-4c88a647f9f3",
          "dc7ff10d-8c4c-49e7-8ad1-278a967ea378",
          "ea59d239-da37-44a4-918e-07e404199c8c",
          null,
          com.arm.mbed.cloud.sdk.accounts.model.AccountMfaStatus.getDefault(),
          null,
          null,
          "a1c7311e-69b4-47ff-9e7f-cde2a8268f84",
          null,
          "30a1400b-8035-4507-a3ad-23a9cae068a8",
          null,
          "876b61a7-41d3-4017-8476-42fe5f370b40",
          "c4e6c3f9-cc0b-47aa-9e3c-56aba5129dad",
          "0472d91d-45ee-4dd5-b659-4cddd756104f",
          "9b201a81-8009-47c8-9a3b-c27a9d692580",
          "fb18c454-cbf5-4229-808b-a455ab440d95",
          com.arm.mbed.cloud.sdk.accounts.model.AccountStatus.getDefault(),
          "26c420b3-bce6-4627-a62e-fde992977539",
          "346cf3ce-90a6-4480-8ec2-56f77ed0a5dd",
          new java.util.Date(1546452532988L),
          new java.util.Date(1546452538241L));
      Account account2 = new Account("069b2b0f-2ad5-43a2-b3ad-3def1f6fa126",
          "34368b3a-db76-4ef3-a79c-822bb98a28f9",
          "cc64d964-b5ee-4f5e-ab05-ad496eae488a",
          "f0c0edcd-470f-4f7c-ad98-805f6ea216bf",
          "44372b72-5761-4640-8583-7e88ee7dd398",
          "5b1ef0d5-2ead-44dc-b6e5-a421b4482438",
          "58b654a1-9120-47df-9106-c67e037666be",
          "d7a14ded-ac48-4e0d-ae48-38f0018fcc6c",
          null,
          "ccdd098d-c44c-4fe0-b570-4b519e5bdf79",
          "fa621a2f-83a8-4ef0-a623-e742e2e079f5",
          "feccfc3f-cdee-4835-8be2-2e9964559744",
          "7cfa3119-8428-4c60-8df3-6d234e3901d7",
          "78864b6a-0a2c-4435-8c1d-78856b400cfc",
          new java.util.Date(1546452533359L),
          null,
          "09eede5c-d419-4206-a5e4-daae572ad951",
          "773fe652-4892-46f5-9163-81cd9fc47fff",
          "370b7b08-3e64-4788-a62d-f045adb1436c",
          "4d15216f-8bf2-4d62-93d7-80ed0cc5975f",
          "e7f4008e-cc5e-408f-b80a-4c88a647f9f3",
          "dc7ff10d-8c4c-49e7-8ad1-278a967ea378",
          "ea59d239-da37-44a4-918e-07e404199c8c",
          null,
          com.arm.mbed.cloud.sdk.accounts.model.AccountMfaStatus.getDefault(),
          null,
          null,
          "a1c7311e-69b4-47ff-9e7f-cde2a8268f84",
          null,
          "30a1400b-8035-4507-a3ad-23a9cae068a8",
          null,
          "876b61a7-41d3-4017-8476-42fe5f370b40",
          "c4e6c3f9-cc0b-47aa-9e3c-56aba5129dad",
          "0472d91d-45ee-4dd5-b659-4cddd756104f",
          "9b201a81-8009-47c8-9a3b-c27a9d692580",
          "fb18c454-cbf5-4229-808b-a455ab440d95",
          com.arm.mbed.cloud.sdk.accounts.model.AccountStatus.getDefault(),
          "26c420b3-bce6-4627-a62e-fde992977539",
          "346cf3ce-90a6-4480-8ec2-56f77ed0a5dd",
          new java.util.Date(1546452532988L),
          new java.util.Date(1546452538241L));
      Account account3 = new Account("f320ac03-1d2a-44ce-a45b-78e79afeb3eb",
          "05d6d514-8e09-4f6a-9cb7-c69ef8bbb82b",
          "970df50e-bff8-48be-b1e7-0fbddc2f7f83",
          "e9f96de2-d6bd-40c6-9b7e-0f9e13db8499",
          "8f001cd8-c579-4048-990c-5003fb3bbc61",
          "85499804-6d81-45ff-8a25-e6a2851f3495",
          "2c3fe222-bd12-4f85-80f4-b366810d3fb4",
          "cb3e4925-f9da-4423-83b9-84843a6308e9",
          null,
          "906769a7-7a6e-4101-bb3c-beb6f67096e5",
          "c8a99193-41a6-4a66-a8d6-b3148a0fb936",
          "bb2246e5-63a7-4dd2-94cb-c0c70960bcd1",
          "12c5caaf-c882-4de8-957b-32cfcf3f7e76",
          "e473ac4d-288f-4542-9998-7bfe746063d7",
          new java.util.Date(1546452531677L),
          null,
          "fa16408a-0f45-4996-a738-5b9097fd914e",
          "1c488a8b-e0c7-40cc-a897-a522b970176e",
          "b6a29368-326c-461a-8de8-978f268a5332",
          "d5f23723-773e-4cd8-bde2-25e44ae43f4d",
          "4c53cbfb-65de-4ff0-a844-c7911048cce1",
          "e84240b5-0d48-4769-9451-6d79b068906d",
          "e63f93ba-fc70-460a-9575-5e19baa5a27f",
          null,
          com.arm.mbed.cloud.sdk.accounts.model.AccountMfaStatus.getDefault(),
          null,
          null,
          "4a5b0a6f-1dad-4bd7-a6fc-a94a4af5b88b",
          null,
          "2fa3a4d2-6772-4d58-a8c3-997e00428f25",
          null,
          "d4202128-2bc6-402f-bc4b-4e6d24b94dba",
          "02aaa3b2-ef17-4ed2-b502-6d943dd33420",
          "61dfa15a-dc04-4cd4-aa52-dd660132c193",
          "cce12b7c-7ad7-4fc4-88da-98bdf8392fe2",
          "49c0ec35-781b-41d3-9d1a-7732821074f8",
          com.arm.mbed.cloud.sdk.accounts.model.AccountStatus.getDefault(),
          "828076a0-33ac-4a54-bb5b-9811602aeb54",
          "e2900c8a-fc4f-4140-9bfa-82dbfe72dd36",
          new java.util.Date(1546452535921L),
          new java.util.Date(1546452538396L));
      assertNotNull(account1);
      assertNotNull(account2);
      assertNotNull(account3);
      assertNotSame(account2, account1);
      assertNotSame(account3, account1);
      assertEquals(account2, account1);
      assertEquals(account2, account1);
      assertEquals(account1, account2);
      assertEquals(account1, account1);
      assertFalse(account1.equals(null));
      assertNotEquals(account3, account1);
    }
    catch(Exception exception) {
      fail(exception.getMessage());
    }
  }
}
