// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model User.
 */
public class TestUser {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        User user1 = new User("f2bf9931-1a2b-4e6e-9e1b-03d78bfca182", "56d26be2-96bb-4d53-bdc8-f01e0c39724c",
                              new java.util.Date(1546031368417L), 93, "44a1aea9-b771-427e-971b-fe7ebb727d14", true,
                              "67a31871-e171-4fce-b9da-6197cd7262ea", "33345c4c-5302-4cdc-975d-33f79ca43796", 56, null,
                              null, true, "955bc1fc-48bd-42f0-9921-c13749faef54", -68,
                              "0c9b65f9-04fd-47e5-9afc-016405b0ecb3",
                              com.arm.mbed.cloud.sdk.accounts.model.UserStatus.getDefault(), true, true,
                              new java.util.Date(1546031365575L), "b7fcfbbb-5332-4a54-8a46-0679ab0e74e7");
        User user2 = user1.clone();
        assertNotNull(user1);
        assertNotNull(user2);
        assertNotSame(user2, user1);
        assertEquals(user2, user1);
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsvalid() {
        User user = new User("68789319-a1e8-4dbc-b426-3864ecce04b3", "6a0a18d1-641a-4d51-98f2-0055c06ad843",
                             new java.util.Date(1546031373876L), -62, "4a46aca9-3e1e-47eb-b920-01cf25cd42cc", false,
                             "182c8050-aa12-4579-835a-f17456922136", "ebec8ebe-c8dc-40ad-ac24-818c62b397e3", -126, null,
                             null, false, "0bf0f02e-e401-4e8d-b845-5b07f3947d94", 50,
                             "8e53c94e-79f0-4fa9-99dd-1c8e78190cda",
                             com.arm.mbed.cloud.sdk.accounts.model.UserStatus.getDefault(), true, false,
                             new java.util.Date(1546031371900L), "2c87d49a-a26f-48f0-8fbb-02d925ad0702");
        assertTrue(user.isValid());
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashcode() {
        User user1 = new User("947894e7-6b53-4809-9dc5-7df546ee43e1", "6b38dd56-6ebe-434a-8685-b92685343c18",
                              new java.util.Date(1546031369578L), -53, "93b931aa-8567-4d98-add6-da17977a602b", true,
                              "0a019abd-41c8-435d-a75f-8fcb9953e3ba", "5afc1014-d36a-4d86-9160-0aedbd054be0", 87, null,
                              null, true, "b0508708-a6c8-46f9-a2a2-4979b3dbf8cc", 116,
                              "4c4c254f-e8b2-43d2-8b95-15c9e6d4203c",
                              com.arm.mbed.cloud.sdk.accounts.model.UserStatus.getDefault(), true, false,
                              new java.util.Date(1546031374635L), "545f4ae6-4d90-44ee-b2e0-aad2294e2b56");
        User user2 = new User("947894e7-6b53-4809-9dc5-7df546ee43e1", "6b38dd56-6ebe-434a-8685-b92685343c18",
                              new java.util.Date(1546031369578L), -53, "93b931aa-8567-4d98-add6-da17977a602b", true,
                              "0a019abd-41c8-435d-a75f-8fcb9953e3ba", "5afc1014-d36a-4d86-9160-0aedbd054be0", 87, null,
                              null, true, "b0508708-a6c8-46f9-a2a2-4979b3dbf8cc", 116,
                              "4c4c254f-e8b2-43d2-8b95-15c9e6d4203c",
                              com.arm.mbed.cloud.sdk.accounts.model.UserStatus.getDefault(), true, false,
                              new java.util.Date(1546031374635L), "545f4ae6-4d90-44ee-b2e0-aad2294e2b56");
        assertNotNull(user1);
        assertNotNull(user2);
        assertNotSame(user2, user1);
        assertEquals(user2, user1);
        assertEquals(user2.hashCode(), user1.hashCode());
        int hashCode = user1.hashCode();
        for (int i = 0; i < 5; i++) {
            assertEquals(hashCode, user1.hashCode());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        User user1 = new User("6468472d-527c-4568-83ba-ac4101ce24ac", "801aa3ec-c88f-48e9-b26f-d81b9479bc0e",
                              new java.util.Date(1546031367489L), -67, "1a984876-4a7d-4339-8178-cb136383815f", false,
                              "34788c6f-790f-4d82-9d03-c44864f02412", "2f8978a9-2ae6-4719-b26f-90d74f796f2f", 38, null,
                              null, false, "7e566048-d4a3-479e-a14b-7415d90b695b", -80,
                              "9b557a80-bc6e-4b53-8866-1e67412f3a9a",
                              com.arm.mbed.cloud.sdk.accounts.model.UserStatus.getDefault(), false, true,
                              new java.util.Date(1546031367918L), "781df197-2dab-42ec-b652-fc13d9ef5b52");
        User user2 = new User("6468472d-527c-4568-83ba-ac4101ce24ac", "801aa3ec-c88f-48e9-b26f-d81b9479bc0e",
                              new java.util.Date(1546031367489L), -67, "1a984876-4a7d-4339-8178-cb136383815f", false,
                              "34788c6f-790f-4d82-9d03-c44864f02412", "2f8978a9-2ae6-4719-b26f-90d74f796f2f", 38, null,
                              null, false, "7e566048-d4a3-479e-a14b-7415d90b695b", -80,
                              "9b557a80-bc6e-4b53-8866-1e67412f3a9a",
                              com.arm.mbed.cloud.sdk.accounts.model.UserStatus.getDefault(), false, true,
                              new java.util.Date(1546031367918L), "781df197-2dab-42ec-b652-fc13d9ef5b52");
        User user3 = new User("9728d8e3-c227-4222-bbdb-4ac2117e5633", "4d72dfc1-c129-4353-bec0-ac1fe4b96f16",
                              new java.util.Date(1546031374608L), -44, "1a1deeef-6484-44d9-b67c-1dc59e22cbdc", true,
                              "7ed1def1-91f1-455b-8a03-2df415bf6e90", "d34e368f-c982-49a1-b20f-382837ce8868", 67, null,
                              null, false, "7b2521df-76f7-4a27-a29a-17cd5844ee6a", 53,
                              "7a4990e8-fadb-46bf-87cc-61e0beb879e5",
                              com.arm.mbed.cloud.sdk.accounts.model.UserStatus.getDefault(), false, true,
                              new java.util.Date(1546031373936L), "bccfd87a-39d1-4e63-9536-38300b579530");
        assertNotNull(user1);
        assertNotNull(user2);
        assertNotNull(user3);
        assertNotSame(user2, user1);
        assertNotSame(user3, user1);
        assertEquals(user2, user1);
        assertEquals(user2, user1);
        assertEquals(user1, user2);
        assertEquals(user1, user1);
        assertFalse(user1.equals(null));
        assertNotEquals(user3, user1);
    }
}
