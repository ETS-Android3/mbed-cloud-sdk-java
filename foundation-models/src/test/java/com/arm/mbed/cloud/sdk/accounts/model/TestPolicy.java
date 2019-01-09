// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model Policy.
 */
public class TestPolicy {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            Policy policy1 = new Policy("47a2c695-5de4-49de-b024-4aa0fcf702ab", false,
                                        "54608490-ef94-4453-bda8-9e6cc8eb9023", true,
                                        "e209f307-6b7b-4a8a-98bd-df8c2a08c43c");
            Policy policy2 = policy1.clone();
            assertNotNull(policy1);
            assertNotNull(policy2);
            assertNotSame(policy2, policy1);
            assertEquals(policy2, policy1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashCode() {
        try {
            Policy policy1 = new Policy("ad05b9a8-15c2-4188-b656-368941e6e840", true,
                                        "bd325fca-9e0e-4831-829f-c6c5712b398c", false,
                                        "8504bf1e-102a-4cc9-bec8-7fb38f71505a");
            Policy policy2 = new Policy("ad05b9a8-15c2-4188-b656-368941e6e840", true,
                                        "bd325fca-9e0e-4831-829f-c6c5712b398c", false,
                                        "8504bf1e-102a-4cc9-bec8-7fb38f71505a");
            assertNotNull(policy1);
            assertNotNull(policy2);
            assertNotSame(policy2, policy1);
            assertEquals(policy2, policy1);
            assertEquals(policy2.hashCode(), policy1.hashCode());
            int hashCode = policy1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, policy1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsValid() {
        Policy policy = new Policy("bdab2b5b-9449-494d-b448-ea52ff25201b", true, "abb5c927-01ed-4d28-9b98-404759460e4a",
                                   true, "b8b3cf7a-bf26-4fda-be25-a066062dbba4");
        assertTrue(policy.isValid());
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            Policy policy1 = new Policy("8ca27ace-3881-4c70-baca-51132d21c3e3", true,
                                        "9a0bb52b-89b1-427a-a8e1-7f51f44813f9", false,
                                        "1171c444-cd1b-425a-8d18-30212094369b");
            Policy policy2 = new Policy("8ca27ace-3881-4c70-baca-51132d21c3e3", true,
                                        "9a0bb52b-89b1-427a-a8e1-7f51f44813f9", false,
                                        "1171c444-cd1b-425a-8d18-30212094369b");
            Policy policy3 = new Policy("7482c295-94d8-4b6c-8dc5-6db466cfd0ef", true,
                                        "51e78932-87b8-4c51-ad4e-4b5bba7adb9f", true,
                                        "72cbd20b-824c-4d63-9de1-c013fb954dd0");
            assertNotNull(policy1);
            assertNotNull(policy2);
            assertNotNull(policy3);
            assertNotSame(policy2, policy1);
            assertNotSame(policy3, policy1);
            assertEquals(policy2, policy1);
            assertEquals(policy2, policy1);
            assertEquals(policy1, policy2);
            assertEquals(policy1, policy1);
            assertFalse(policy1.equals(null));
            assertNotEquals(policy3, policy1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
