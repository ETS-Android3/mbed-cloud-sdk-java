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
            User user1 = new User("a5fdd8ccb79ecfcc089719469de69b9b", null, "da6e6590-3f2f-46fb-9d6a-51b5c2877db1",
                                  new Date(1562663758110L), 30, null, "933f2.b963d@dd53c.fr", true,
                                  "b7b386ce-c8eb-4d9b-a946-04e41bb427c6", "a5fdd8ccb79ecfcc089719469de69b9b", false,
                                  false, false, 2, null, null, "aa0fa50b-df27-4c36-a449-e62dbe02a983", 116,
                                  "513dd93d-21f5-4e11-9627-493da3a1c58a", UserStatus.getDefault(), null,
                                  new Date(1562663765454L), "A_9=2");
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
            User user1 = new User("a5fdd8ccb79ecfcc089719469de69b9b", null, "25baa56f-ea33-4614-8867-ac7596ee4d7f",
                                  new Date(1562663758756L), 66, null, "3e8d1.f7c86@758b4.fr", true,
                                  "dbd8bcc9-c633-4092-9245-bf4f8225507f", "a5fdd8ccb79ecfcc089719469de69b9b", false,
                                  true, false, 34, null, null, "c47b1a17-f3c3-4ce1-814b-4b9198741e8d", 59,
                                  "33d402fb-ddab-4076-b6b8-3df9b45c6294", UserStatus.getDefault(), null,
                                  new Date(1562663764453L), "A_9=2");
            User user2 = new User("a5fdd8ccb79ecfcc089719469de69b9b", null, "25baa56f-ea33-4614-8867-ac7596ee4d7f",
                                  new Date(1562663758756L), 66, null, "3e8d1.f7c86@758b4.fr", true,
                                  "dbd8bcc9-c633-4092-9245-bf4f8225507f", "a5fdd8ccb79ecfcc089719469de69b9b", false,
                                  true, false, 34, null, null, "c47b1a17-f3c3-4ce1-814b-4b9198741e8d", 59,
                                  "33d402fb-ddab-4076-b6b8-3df9b45c6294", UserStatus.getDefault(), null,
                                  new Date(1562663764453L), "A_9=2");
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
        User user = new User("a5fdd8ccb79ecfcc089719469de69b9b", null, "e170b867-e201-488b-90f7-71b5e04c0573",
                             new Date(1562663758127L), 63, null, "e5569.2d7b6@19f44.fr", true,
                             "d209307d-8270-4509-b9d4-11465071c31f", "a5fdd8ccb79ecfcc089719469de69b9b", true, true,
                             false, 27, null, null, "8d2c4a83-b809-4ba6-a571-d8ee19b653a1", -29,
                             "1a7acd8e-e421-4692-98ad-f0606a56781d", UserStatus.getDefault(), null,
                             new Date(1562663764828L), "A_9=2");
        assertTrue(user.isValid());
        User userInvalid = new User("\u0006O祉䩳L\u0007-\u0019$$Ꮌ<#2,%33᎟3U3\b㕧䪹S$$\u000e?3\u0016餋3\u0015GYꚃ3R\u0001᣼`2�?2\u000eਗ\u0012虰ᆊ]\u0016[?\u000f!3 @2V",
                                    null, "d4734b7c-863d-4f12-b63e-1d132f26cdfd", new Date(1562663763961L), 98, null,
                                    null, true,
                                    "86d42f19-121c-471f-bbe8-30f23f11e3cc8c82c564-5412-4b1d-8671-53fd6424e81521c78f25-9521-4917-9ce3-02ebaaf15772",
                                    "\u0006O祉䩳L\u0007-\u0019$$Ꮌ<#2,%33᎟3U3\b㕧䪹S$$\u000e?3\u0016餋3\u0015GYꚃ3R\u0001᣼`2�?2\u000eਗ\u0012虰ᆊ]\u0016[?\u000f!3 @2V",
                                    true, false, false, 126, null, null, "4bf5b117-5cdc-4f31-bea3-bae84dd018f1", 94,
                                    "29aecab2-e9fe-412a-a6c6-9601ad5dcffe1503f321-1c01-4414-a373-4135f7716ced4835a4a9-8aa8-4f0c-a6c1-9443df810b55",
                                    UserStatus.getDefault(), null, new Date(1562663758870L),
                                    "[;L?/?8\u0011<\u001d*胴&;5E4K4\u001e1<䋧;凇@GY;C6;\\\\V65<C\u0007>P4&<%5:呲>8\u0002Y:!(䮆>JⒾT*");
        assertFalse(userInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            User user1 = new User("a5fdd8ccb79ecfcc089719469de69b9b", null, "40efcb07-f905-41f2-926f-6f51dadb3662",
                                  new Date(1562663761282L), 11, null, "9d7cc.135e0@375a7.fr", false,
                                  "df25e6b3-d9d9-49a1-a553-35a06ed2f8c9", "a5fdd8ccb79ecfcc089719469de69b9b", false,
                                  true, false, -73, null, null, "12327bb4-c232-4ff8-b070-075a6956ec31", -68,
                                  "de484358-79c2-4f90-abaf-dbfda37631eb", UserStatus.getDefault(), null,
                                  new Date(1562663759227L), "A_9=2");
            User user2 = new User("a5fdd8ccb79ecfcc089719469de69b9b", null, "40efcb07-f905-41f2-926f-6f51dadb3662",
                                  new Date(1562663761282L), 11, null, "9d7cc.135e0@375a7.fr", false,
                                  "df25e6b3-d9d9-49a1-a553-35a06ed2f8c9", "a5fdd8ccb79ecfcc089719469de69b9b", false,
                                  true, false, -73, null, null, "12327bb4-c232-4ff8-b070-075a6956ec31", -68,
                                  "de484358-79c2-4f90-abaf-dbfda37631eb", UserStatus.getDefault(), null,
                                  new Date(1562663759227L), "A_9=2");
            User user3 = new User("a5fdd8ccb79ecfcc089719469de69b9b", null, "15451572-0bd5-4d3b-8ac0-66d87dfc6fa5",
                                  new Date(1562663762084L), -99, null, "84cdb.4053a@21a5e.fr", false,
                                  "cc5305d4-e76e-4cc1-a754-c9f6bfed252e", "a5fdd8ccb79ecfcc089719469de69b9b", false,
                                  true, false, -88, null, null, "9b0b657f-7947-4927-8352-5e3e186c46ec", -1,
                                  "b2c38954-975b-4a7b-8826-4e86ded52563", UserStatus.getDefault(), null,
                                  new Date(1562663762639L), "A_9=2");
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
