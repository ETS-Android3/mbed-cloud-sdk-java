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
        Policy policy1 = new Policy("e4bca9e7-dce5-461d-a860-1766797cfc9b", false,
                                    "e0369cf6-3bae-4fea-a8d7-ec85ce753606", true,
                                    "5b28d1a0-82d0-43df-9892-8ea3f8a41cae");
        Policy policy2 = policy1.clone();
        assertNotNull(policy1);
        assertNotNull(policy2);
        assertNotSame(policy2, policy1);
        assertEquals(policy2, policy1);
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsvalid() {
        Policy policy = new Policy("7ab52df7-c6b9-40c4-b4ca-7b82a49f85d1", true, "9c895af3-f28c-4f07-8f91-cd8d4b0dc5a4",
                                   false, "ff33f3c7-7766-4e92-8923-ff8da80e8cf6");
        assertTrue(policy.isValid());
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashcode() {
        Policy policy1 = new Policy("f71cb843-4b80-41f2-a9b1-24f9dca9ce96", false,
                                    "942b7b3f-7a24-4fab-8f5f-ace28e140999", true,
                                    "779e624e-b60b-4a43-a2e7-2456cfda4959");
        Policy policy2 = new Policy("f71cb843-4b80-41f2-a9b1-24f9dca9ce96", false,
                                    "942b7b3f-7a24-4fab-8f5f-ace28e140999", true,
                                    "779e624e-b60b-4a43-a2e7-2456cfda4959");
        assertNotNull(policy1);
        assertNotNull(policy2);
        assertNotSame(policy2, policy1);
        assertEquals(policy2, policy1);
        assertEquals(policy2.hashCode(), policy1.hashCode());
        int hashCode = policy1.hashCode();
        for (int i = 0; i < 5; i++) {
            assertEquals(hashCode, policy1.hashCode());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        Policy policy1 = new Policy("814f11f7-43bb-493c-a874-912af52c2b71", true,
                                    "cdb3ba4e-134d-4487-aba4-c64f05326ce5", false,
                                    "093843af-9003-4b0c-87eb-7b86cc15ead0");
        Policy policy2 = new Policy("814f11f7-43bb-493c-a874-912af52c2b71", true,
                                    "cdb3ba4e-134d-4487-aba4-c64f05326ce5", false,
                                    "093843af-9003-4b0c-87eb-7b86cc15ead0");
        Policy policy3 = new Policy("7e4d36e8-3dce-4093-b4d4-249c82164c04", false,
                                    "8f30e6da-7285-45ce-82ec-96cad665b28b", false,
                                    "8e6e8040-a1c5-4ed9-a8fb-439156cb4ca5");
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
    }
}
