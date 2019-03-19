// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model Account.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestAccount {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            Account account1 = new Account("37b2d00a-7e79-405a-8908-1427086b461c",
                                           "35d12fe0-586e-430f-9592-91f2f3c9080e",
                                           "6d8d5107-ae09-49ea-ad81-4eafd0df27c1",
                                           "b6826bc0-2863-4e1a-8066-20c7c4f9829e",
                                           "9a5343d7-fc50-4664-8b37-e5c2d1233d93",
                                           "8b730bdc-7d2b-4fee-9828-fb3b513072c7",
                                           "b0e3890f-5d9a-49fe-9c41-faf9cb4117a2",
                                           "b872eb94-6a58-4aad-a8e1-2d30ba007166", null,
                                           "93d206bc-b6c4-48c1-8739-226fae28a8d9",
                                           "a71f6f89-4dad-4a67-8db6-faa7a38eccde",
                                           "956c7de9-036f-4a17-9077-f77af4ead745",
                                           "f7b877c7-638a-4065-86a3-0d5e87fbb9ef",
                                           "32a74dd0-a60a-4759-9a61-b985a7fde4c6", new Date(1553013208660L), null,
                                           "454db5d1-4279-44ab-9084-81e1aff03e58",
                                           "92d29e3d-1e63-4116-9115-66b55ca95f61",
                                           "c04f328a-ae76-4780-8a6c-7735465f1f55",
                                           "ba7e9c53-6921-494f-96f1-cdc7bf94f6a0", new Date(1553013210937L),
                                           "fb6ed7da-29d5-4331-ae9c-3a9b60f1d798",
                                           "5c81213b-50f7-4ee8-a3df-fb4667a499c2",
                                           "031f51c2-2d09-4533-aa60-d8859ec65443", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "b60f6928-84b4-42d1-a1c5-92a2a524b341",
                                           new PasswordPolicy(), -61, "68cbaaa9-7c5b-4b73-af87-5d727df24fd2", null,
                                           "bb4d073d-574f-4452-a3e7-a66d7fe94ae4",
                                           "20eebe17-b9ef-4aeb-9de9-59b21ae12bb2",
                                           "9557db70-eb9f-4287-bbd1-6cab03073411",
                                           "dfeb5046-d2e5-4d2e-a1c3-3c842d537cbb",
                                           "846f7aaf-fc83-425e-beb0-8cf671c77cfb", AccountStatus.getDefault(),
                                           "233883e9-e061-44bd-a232-1a144610d998",
                                           "5c8b33f4-9d3b-4876-b131-d287f918d137", new Date(1553013204951L),
                                           new Date(1553013211752L));
            Account account2 = account1.clone();
            assertNotNull(account1);
            assertNotNull(account2);
            assertNotSame(account2, account1);
            assertEquals(account2, account1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the hashCode method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testHashCode() {
        try {
            Account account1 = new Account("06c41cbd-ce84-4b67-bd76-9e66f1bb8aa1",
                                           "e485c4c2-5bcf-4501-9ecd-9d2bae777a45",
                                           "20640683-5c30-4d42-8ea4-db42ff5a0206",
                                           "5632084b-2d83-4d59-88e7-63ce0de3272b",
                                           "490a6488-9074-4bb0-972c-cde1fda90c08",
                                           "68585495-f4e6-49e9-bd54-84efe211f20e",
                                           "07efabcd-f55c-4f61-bdc0-7ab6f14a40d9",
                                           "265bd8b5-65d4-433c-9dc2-b8e09a5b8dd2", null,
                                           "c557c4b8-0454-4764-b59c-946cb4ebcb80",
                                           "2ecc86e2-821d-4264-98a8-cf97ea8f138d",
                                           "a05f555a-26b7-4bd8-b55a-1547b131a844",
                                           "25b72684-d64e-42d6-93ad-1cbd43296c09",
                                           "c6dcbbf7-fbd6-40b4-b690-c33b8da6c791", new Date(1553013212892L), null,
                                           "b8505fb9-f4a3-4f35-b0ec-386e078c9229",
                                           "8ed83c16-3c4b-4366-a5fe-8ed1eb256ec7",
                                           "b6a90df2-9f46-4380-b705-cc40b6379b3f",
                                           "a38a013f-ccf5-4a60-a051-8ac74e4ff20b", new Date(1553013205836L),
                                           "043bd473-2226-4394-a2e8-130032086ce4",
                                           "44b8a299-3277-4823-b348-659d05cafeb2",
                                           "b1fb28ed-c7be-4d71-8b80-3a2b477285a2", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "ac0165b3-4450-4993-89d2-eff3b83b550d",
                                           new PasswordPolicy(), -43, "99fcacec-3520-42ec-a4d1-0a72ff944e8f", null,
                                           "c5028c28-d6b5-40e4-b973-2eef64ab180f",
                                           "e3e72e93-4a23-4433-8d9b-9dac11de0c0c",
                                           "273e6867-c615-4fcc-b62a-eee9d697c5fe",
                                           "b696acf2-f1e7-4701-8d24-782429a129d5",
                                           "44c2da0a-7f17-4266-88de-124e2e60a68b", AccountStatus.getDefault(),
                                           "6ed7935d-e6e1-4379-8335-e120127f507f",
                                           "0a82eec7-54a7-4663-ac47-3f39a5e679a3", new Date(1553013211003L),
                                           new Date(1553013211069L));
            Account account2 = new Account("06c41cbd-ce84-4b67-bd76-9e66f1bb8aa1",
                                           "e485c4c2-5bcf-4501-9ecd-9d2bae777a45",
                                           "20640683-5c30-4d42-8ea4-db42ff5a0206",
                                           "5632084b-2d83-4d59-88e7-63ce0de3272b",
                                           "490a6488-9074-4bb0-972c-cde1fda90c08",
                                           "68585495-f4e6-49e9-bd54-84efe211f20e",
                                           "07efabcd-f55c-4f61-bdc0-7ab6f14a40d9",
                                           "265bd8b5-65d4-433c-9dc2-b8e09a5b8dd2", null,
                                           "c557c4b8-0454-4764-b59c-946cb4ebcb80",
                                           "2ecc86e2-821d-4264-98a8-cf97ea8f138d",
                                           "a05f555a-26b7-4bd8-b55a-1547b131a844",
                                           "25b72684-d64e-42d6-93ad-1cbd43296c09",
                                           "c6dcbbf7-fbd6-40b4-b690-c33b8da6c791", new Date(1553013212892L), null,
                                           "b8505fb9-f4a3-4f35-b0ec-386e078c9229",
                                           "8ed83c16-3c4b-4366-a5fe-8ed1eb256ec7",
                                           "b6a90df2-9f46-4380-b705-cc40b6379b3f",
                                           "a38a013f-ccf5-4a60-a051-8ac74e4ff20b", new Date(1553013205836L),
                                           "043bd473-2226-4394-a2e8-130032086ce4",
                                           "44b8a299-3277-4823-b348-659d05cafeb2",
                                           "b1fb28ed-c7be-4d71-8b80-3a2b477285a2", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "ac0165b3-4450-4993-89d2-eff3b83b550d",
                                           new PasswordPolicy(), -43, "99fcacec-3520-42ec-a4d1-0a72ff944e8f", null,
                                           "c5028c28-d6b5-40e4-b973-2eef64ab180f",
                                           "e3e72e93-4a23-4433-8d9b-9dac11de0c0c",
                                           "273e6867-c615-4fcc-b62a-eee9d697c5fe",
                                           "b696acf2-f1e7-4701-8d24-782429a129d5",
                                           "44c2da0a-7f17-4266-88de-124e2e60a68b", AccountStatus.getDefault(),
                                           "6ed7935d-e6e1-4379-8335-e120127f507f",
                                           "0a82eec7-54a7-4663-ac47-3f39a5e679a3", new Date(1553013211003L),
                                           new Date(1553013211069L));
            assertNotNull(account1);
            assertNotNull(account2);
            assertNotSame(account2, account1);
            assertEquals(account2, account1);
            assertEquals(account2.hashCode(), account1.hashCode());
            int hashCode = account1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, account1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testIsValid() {
        Account account = new Account("df06a58d-c90f-4f38-adcb-201b4247ef3c", "2416055f-ffed-436b-a650-4ecdfb0db41b",
                                      "21404a4c-ac4e-4522-b65b-a460bacba10b", "36a38853-58a0-4cda-9733-dfb7115e8dab",
                                      "98e62b89-d9d8-4907-a0e1-14f90be17029", "821434aa-51ca-474e-be33-764e61810be8",
                                      "6193351a-4088-4bfe-acb3-bc49634ef1ab", "17902e12-c028-4040-9f0d-1651cbe391cf",
                                      null, "fdf12eb4-34ac-4e44-9093-4ea334e5590c",
                                      "aabab012-28c0-47e7-8250-0df3c854b972", "300aa2a1-c04a-41d8-8a51-80014619ff58",
                                      "496b4f9f-a36f-461d-9fa2-9498b65aa84a", "b4ca46bb-8b8a-491e-8172-d2ddc9c22adf",
                                      new Date(1553013212047L), null, "6eca4055-d09e-456e-b0aa-ea965f59789f",
                                      "66ab8540-7375-4c5e-a1b6-66bea88792b4", "91656815-2eba-4970-83ff-64940d5a66e3",
                                      "48c1024f-a042-46ad-8901-4886bebae6ee", new Date(1553013208120L),
                                      "d2f864ab-a55e-4a63-8e11-cd7b2818747e", "246c838d-56fe-418b-b08d-968f432b98e2",
                                      "df5f797e-94a4-47c3-958a-c7665757dedc", null, AccountMfaStatus.getDefault(), null,
                                      new ParentAccount(), "8d93c324-086f-4180-b753-7fc23ede16b2", new PasswordPolicy(),
                                      69, "a1b424f3-d6d0-4617-8d1e-ce33d10c9c7a", null,
                                      "8123d21f-9e90-4444-8260-7056f77c7f42", "23a0d264-c506-4be8-97d5-d85d6a680902",
                                      "6df7c87b-8847-4aa6-97dd-8c6c52bbbf2e", "85cba24b-b9ac-4bf2-a52f-66a127e6feb3",
                                      "fbde0635-368e-4096-98e0-b351893081a8", AccountStatus.getDefault(),
                                      "8d3fdc89-e685-43bc-b0b0-20fef2015e11", "84e13d5e-e4b8-4943-83a1-a6d69ca91377",
                                      new Date(1553013208262L), new Date(1553013205395L));
        assertTrue(account.isValid());
        Account accountInvalid = new Account("e97d876e-80fb-4adc-a1d5-4e3d8f0a7ef4",
                                             "e47e2d8d-10b6-4d45-a961-1f9f67df3022",
                                             "bfc5f136-4958-48fc-8d98-5f53ac466225",
                                             "0a6998b5-0330-4701-b250-f9a6d93af1ad",
                                             "a8a739c4-335f-4004-ada0-126f27e1fe3c",
                                             "add9ac3d-8963-4932-b2d6-38f3a7152332",
                                             "0b25ae82-ed6e-4506-bf04-711805b6d153",
                                             "136c011c-3929-4338-8764-729b796e2e01", null,
                                             "72f64c93-fef4-4617-b6ad-66e8b7e9559e",
                                             "3a5b69d9-bdec-4638-a991-2770875a17e5",
                                             "ed4ae573-69a5-4791-8376-187f40e559a6",
                                             "6bd082ab-44d3-4c4e-9a98-2b625385127e",
                                             "58280f24-7a63-4d99-a90a-1981ec9ab4fe", new Date(1553013209528L), null,
                                             "90dc626b-4448-43ff-a3ae-5f1dda8d9aad",
                                             "2aada541-83e3-483d-afc1-09ee5d078e70",
                                             "3b521a44-922e-479d-904c-70ede6ed8b1d", null, new Date(1553013205470L),
                                             "512915e9-fdad-48ed-b8c5-a8c2e20f7aa3",
                                             "b59694be-aba9-4d4e-883c-87b1d99fc8d6",
                                             "75e60009-ecb2-494e-adb5-2079260cd6fe", null,
                                             AccountMfaStatus.getDefault(), null, new ParentAccount(),
                                             "ec2a8b24-66d7-488f-858f-732d4dc18910", new PasswordPolicy(), -2,
                                             "5ae0d966-b994-461b-b704-009b657ed733", null,
                                             "e33bda66-5271-4cb9-a0bb-a0927a6fd3be",
                                             "5078b012-ee5f-41fa-8cc7-5f18843f5303",
                                             "27d589bc-6ea6-47ca-a6bb-6b6642ab49be",
                                             "582d97c9-9adf-4a90-99c4-1d70bd28282f",
                                             "80e2bc12-72af-4c10-9788-3b9e30e25772", AccountStatus.getDefault(),
                                             "d2ec5e86-ffda-407a-8e1f-d1b5769d8ee4",
                                             "aac2ff31-d5d0-4e51-93cf-25fa2622b31c", new Date(1553013206024L),
                                             new Date(1553013205603L));
        assertFalse(accountInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Account account1 = new Account("2600231b-0fee-4d89-a996-f35e00d2a7a5",
                                           "ea530bf1-8d1d-4c8e-a1b5-3fbc5046c9f4",
                                           "1e14df36-dd71-4841-80fc-ee62dc265fed",
                                           "31820260-3787-4d74-9ee0-822892a26a2f",
                                           "dc3c1ba2-a3ec-4b72-9d52-3e8a8f0dd482",
                                           "786f7881-8b43-42a7-813d-0fe3cdbdd214",
                                           "75664efe-4742-418e-9332-adfe70eb13ad",
                                           "873c0f58-f367-42ac-8b2c-f2d98095102c", null,
                                           "d31ba131-a6e1-4053-8875-4d51146d67ab",
                                           "3e51e2ff-54dc-4a53-8436-14003a954b81",
                                           "b7703781-b02c-45df-8958-47ca2a015698",
                                           "4d7b7e5a-3cd3-453c-b064-63102d3a1978",
                                           "9dc459ac-07ef-40d3-a19b-8f89e1e446fa", new Date(1553013210837L), null,
                                           "26a659f8-437a-4991-8575-2c38a9b1a341",
                                           "2a045529-349d-40b4-b969-15e67a8ba9e9",
                                           "590af003-fc9c-4f0f-817f-4695382289e7",
                                           "a232be80-a6dc-4a4b-958b-d4d37c6deef2", new Date(1553013214246L),
                                           "343f7956-d5f9-429f-bc3b-72339bb3c4ae",
                                           "bddfb97b-fe56-4748-918f-d94337d31fa1",
                                           "55142164-8742-4e22-ad9f-139238752ba6", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "5a44d79a-880b-41aa-8aa0-8744fd459fa6",
                                           new PasswordPolicy(), 93, "5e938791-c459-47ff-a885-000492d754c9", null,
                                           "c746fb6e-05c2-47b0-af62-d0090a373a90",
                                           "7d0006bd-fb17-4ea2-a8ca-6f0bc1414a75",
                                           "d14f8f7a-294f-4e09-9b89-8af8390b18f1",
                                           "785c80ff-6801-42e4-9908-d4561cfd7986",
                                           "44883b3c-3d7d-4f2e-a142-6afb4b15595a", AccountStatus.getDefault(),
                                           "ebbdf8ca-ea88-4c35-8546-c291e94061c7",
                                           "7da0bfef-0019-4c27-b3f3-08fbe16151a3", new Date(1553013207085L),
                                           new Date(1553013210362L));
            Account account2 = new Account("2600231b-0fee-4d89-a996-f35e00d2a7a5",
                                           "ea530bf1-8d1d-4c8e-a1b5-3fbc5046c9f4",
                                           "1e14df36-dd71-4841-80fc-ee62dc265fed",
                                           "31820260-3787-4d74-9ee0-822892a26a2f",
                                           "dc3c1ba2-a3ec-4b72-9d52-3e8a8f0dd482",
                                           "786f7881-8b43-42a7-813d-0fe3cdbdd214",
                                           "75664efe-4742-418e-9332-adfe70eb13ad",
                                           "873c0f58-f367-42ac-8b2c-f2d98095102c", null,
                                           "d31ba131-a6e1-4053-8875-4d51146d67ab",
                                           "3e51e2ff-54dc-4a53-8436-14003a954b81",
                                           "b7703781-b02c-45df-8958-47ca2a015698",
                                           "4d7b7e5a-3cd3-453c-b064-63102d3a1978",
                                           "9dc459ac-07ef-40d3-a19b-8f89e1e446fa", new Date(1553013210837L), null,
                                           "26a659f8-437a-4991-8575-2c38a9b1a341",
                                           "2a045529-349d-40b4-b969-15e67a8ba9e9",
                                           "590af003-fc9c-4f0f-817f-4695382289e7",
                                           "a232be80-a6dc-4a4b-958b-d4d37c6deef2", new Date(1553013214246L),
                                           "343f7956-d5f9-429f-bc3b-72339bb3c4ae",
                                           "bddfb97b-fe56-4748-918f-d94337d31fa1",
                                           "55142164-8742-4e22-ad9f-139238752ba6", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "5a44d79a-880b-41aa-8aa0-8744fd459fa6",
                                           new PasswordPolicy(), 93, "5e938791-c459-47ff-a885-000492d754c9", null,
                                           "c746fb6e-05c2-47b0-af62-d0090a373a90",
                                           "7d0006bd-fb17-4ea2-a8ca-6f0bc1414a75",
                                           "d14f8f7a-294f-4e09-9b89-8af8390b18f1",
                                           "785c80ff-6801-42e4-9908-d4561cfd7986",
                                           "44883b3c-3d7d-4f2e-a142-6afb4b15595a", AccountStatus.getDefault(),
                                           "ebbdf8ca-ea88-4c35-8546-c291e94061c7",
                                           "7da0bfef-0019-4c27-b3f3-08fbe16151a3", new Date(1553013207085L),
                                           new Date(1553013210362L));
            Account account3 = new Account("a0ea4853-3258-4566-9b74-48a05be030ba",
                                           "07b2c990-c99b-4dca-9a32-877e3824ea17",
                                           "4934aaa2-0e0a-4d8e-a3e7-4da7875f70d5",
                                           "05cae4d8-f5a4-4f34-aa78-c27c7986d22c",
                                           "8b8d296b-d719-4dd3-b798-d2be227b8c94",
                                           "c5a83eeb-b45c-455c-b63e-b31a5d6b0e09",
                                           "56776c19-b1ca-46d3-961b-4e793e95809a",
                                           "4fb25578-d421-42da-beba-bd4d4405389f", null,
                                           "ead2e29b-5edd-48a6-90b6-f3f5d9feb849",
                                           "de323c7e-7da8-4539-a2d0-9cd01551794b",
                                           "fa48123f-72ec-4bdd-86bd-3055b5c72bc8",
                                           "26df86ab-7739-4f02-9195-77e6c3ada838",
                                           "1ea8a7bc-e59a-43cd-97b7-c81a404e1ea9", new Date(1553013209131L), null,
                                           "c912a7d0-e5ef-4a63-977c-df093aac9aab",
                                           "f68e2a6a-dfc3-47e0-80fa-7894d5a3104e",
                                           "8dac10e5-a16d-454a-8c70-a03180a6d419",
                                           "90bbd03a-8f7a-4269-bba5-4486941b6bd7", new Date(1553013211051L),
                                           "8ccbc713-174c-4a5b-a69b-8dbc03f11f4b",
                                           "69404622-a52f-4c39-a42e-17b5a780a984",
                                           "776b2479-2630-49db-a711-9d10a94b0aef", null, AccountMfaStatus.getDefault(),
                                           null, new ParentAccount(), "d1952c8d-79b2-48be-acd3-896f60079ac6",
                                           new PasswordPolicy(), 116, "50acfafd-3ab1-41dd-b9df-5af4526636c0", null,
                                           "c0ac8440-7461-4bfe-b818-8ae2daf1070a",
                                           "4ec033a9-2297-41d4-8e31-e875be249171",
                                           "0a9d9ded-6eea-4bb9-a178-67603da6748f",
                                           "0e163fc9-49fd-467c-9870-74765575ff21",
                                           "77e0edae-2740-41da-961e-173e4898e713", AccountStatus.getDefault(),
                                           "60d73efb-2b04-4ed5-8f7c-7a25c2a347cf",
                                           "071c41ad-6714-4973-95b1-53a662a5a2b5", new Date(1553013212378L),
                                           new Date(1553013214445L));
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
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
