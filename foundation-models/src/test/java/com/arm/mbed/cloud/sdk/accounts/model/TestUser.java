// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model User.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestUser {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            User user1 = new User("5aac302d4dc51de8d52d8348d01b06c5", null, "59a45217-2d40-4f80-8cdc-7373eefd4c50",
                                  new Date(1567417601458L), 64, null, "d5986.6de0f@c9601.fr", false,
                                  "e8b68845-6847-4838-ab6b-301a4bf49d12", null, "5aac302d4dc51de8d52d8348d01b06c5",
                                  false, true, false, -44, null, null, "731c7042-2245-466a-af38-e4ab0733bbf2", -33,
                                  "2b940f98-15dd-4c17-84dc-52129f07e655", UserStatus.getDefault(), null,
                                  new Date(1567417602331L), "R,_Bz_=a._8");
            User user2 = user1.clone();
            assertNotNull(user1);
            assertNotNull(user2);
            assertNotSame(user2, user1);
            assertEquals(user2, user1);
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
            User user1 = new User("5aac302d4dc51de8d52d8348d01b06c5", null, "2960c21b-4a1b-4985-92a1-1a79ad81abcf",
                                  new Date(1567417606634L), 122, null, "0af5e.e313f@fc3aa.me", true,
                                  "39843a3e-199c-475b-8f85-e087ff819bf2", null, "5aac302d4dc51de8d52d8348d01b06c5",
                                  false, false, true, -4, null, null, "88df16fd-8abd-438d-832f-118334c7d37a", 31,
                                  "5c6a1e83-0896-420a-8c22-ea555767777d", UserStatus.getDefault(), null,
                                  new Date(1567417607047L), "R,_Bz_=a._8");
            User user2 = new User("5aac302d4dc51de8d52d8348d01b06c5", null, "2960c21b-4a1b-4985-92a1-1a79ad81abcf",
                                  new Date(1567417606634L), 122, null, "0af5e.e313f@fc3aa.me", true,
                                  "39843a3e-199c-475b-8f85-e087ff819bf2", null, "5aac302d4dc51de8d52d8348d01b06c5",
                                  false, false, true, -4, null, null, "88df16fd-8abd-438d-832f-118334c7d37a", 31,
                                  "5c6a1e83-0896-420a-8c22-ea555767777d", UserStatus.getDefault(), null,
                                  new Date(1567417607047L), "R,_Bz_=a._8");
            assertNotNull(user1);
            assertNotNull(user2);
            assertNotSame(user2, user1);
            assertEquals(user2, user1);
            assertEquals(user2.hashCode(), user1.hashCode());
            int hashCode = user1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, user1.hashCode());
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
        User user = new User("5aac302d4dc51de8d52d8348d01b06c5", null, "92fcd1ae-36b4-471e-b90a-65b226539778",
                             new Date(1567417609039L), -13, null, "e0af9.b0b8a@b89a2.me", true,
                             "0d609183-89c0-49d8-88e9-9b322cfe48e1", null, "5aac302d4dc51de8d52d8348d01b06c5", false,
                             true, true, -83, null, null, "bb569dd3-317d-47bb-8818-b0eaaf484bb2", 34,
                             "17f77dee-91bb-464e-9f0e-3556651c17f9", UserStatus.getDefault(), null,
                             new Date(1567417607492L), "R,_Bz_=a._8");
        assertTrue(user.isValid());
        User userInvalid = new User("@77_7\u0015�?�\u00037\u0002A⚻7\u000e_Z7LT7-;\u000377!<\u0004+Fﭸ7?\u000f_9B\u001b拨\u0011\u0014\u0014ᬾV\b7]>:7㚧졎\f\u0001\u0011`R)7滹\u0019",
                                    null, "3b12040f-e5cf-40cd-8a1a-14df072e578f", new Date(1567417602250L), -72, null,
                                    null, false,
                                    "404166cc-8a59-4d09-939a-a7502cd02a99f342ca7c-e791-4564-a199-4b79d560939e6f6ef37b-d18c-499a-8c04-c25bec8722f9",
                                    null,
                                    "@77_7\u0015�?�\u00037\u0002A⚻7\u000e_Z7LT7-;\u000377!<\u0004+Fﭸ7?\u000f_9B\u001b拨\u0011\u0014\u0014ᬾV\b7]>:7㚧졎\f\u0001\u0011`R)7滹\u0019",
                                    false, true, true, 9, null, null, "55fa5291-2853-48f0-b059-03c9927ebb00", -9,
                                    "62461da5-28cb-4210-9ff6-da56d05077a0e2a679a7-5ce6-4efe-b3ff-9a159c274c38e1bbaef5-36c1-4829-a2e5-f22a41a25bac",
                                    UserStatus.getDefault(), null, new Date(1567417609128L),
                                    "N:-\u000b2?I6鋻`7`ﰵ?Zbᰨ;鯽\b%ﮢ`9Uﾓf䥘D<2-?�?䘴-`5IJ>/AC`>-A-25\u001eSLO㋴SP<Q+忪];");
        assertFalse(userInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            User user1 = new User("5aac302d4dc51de8d52d8348d01b06c5", null, "bbce7223-8b04-46cb-8ca3-3f79be6b9cbd",
                                  new Date(1567417601216L), -5, null, "d861c.b0781@75157.me", true,
                                  "757c99ab-12d5-460a-a587-affb5421d018", null, "5aac302d4dc51de8d52d8348d01b06c5",
                                  false, false, false, 82, null, null, "5fd71935-77ec-4c3c-a08f-28cae1aaba96", -90,
                                  "51b7194f-16b5-4e76-b64c-842d09560cdb", UserStatus.getDefault(), null,
                                  new Date(1567417603576L), "R,_Bz_=a._8");
            User user2 = new User("5aac302d4dc51de8d52d8348d01b06c5", null, "bbce7223-8b04-46cb-8ca3-3f79be6b9cbd",
                                  new Date(1567417601216L), -5, null, "d861c.b0781@75157.me", true,
                                  "757c99ab-12d5-460a-a587-affb5421d018", null, "5aac302d4dc51de8d52d8348d01b06c5",
                                  false, false, false, 82, null, null, "5fd71935-77ec-4c3c-a08f-28cae1aaba96", -90,
                                  "51b7194f-16b5-4e76-b64c-842d09560cdb", UserStatus.getDefault(), null,
                                  new Date(1567417603576L), "R,_Bz_=a._8");
            User user3 = new User("5aac302d4dc51de8d52d8348d01b06c5", null, "e4da55aa-5471-4c7e-a53a-746c514eb792",
                                  new Date(1567417601722L), 100, null, "0245d.07c79@94933.me", true,
                                  "5c308894-0b40-41df-9f98-ebbca6f90654", null, "5aac302d4dc51de8d52d8348d01b06c5",
                                  false, false, false, 15, null, null, "06eb2050-846f-4049-a783-e06504a668cf", 19,
                                  "2f648210-2c9b-4c17-b734-8bd4367b51de", UserStatus.getDefault(), null,
                                  new Date(1567417602601L), "R,_Bz_=a._8");
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
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
