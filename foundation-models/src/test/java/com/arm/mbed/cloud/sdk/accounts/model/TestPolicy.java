// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model Policy.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestPolicy {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            Policy policy1 = new Policy("a5fd997c-c66e-4f9a-a5f6-7242b193e0a3", false,
                                        "d229d2d8-05cb-4a9a-99f7-bc62b785a9bd", true,
                                        "84b924c9-04d5-41f8-b8b9-cdb8ff8ff77a");
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
    @SuppressWarnings("resource")
    @Test
    public void testHashCode() {
        try {
            Policy policy1 = new Policy("b6006ee5-e6e0-4818-87c0-657203ed97f0", false,
                                        "8080f25b-eace-40d9-bcd3-f64ed27164fc", false,
                                        "4565baf5-d6cc-466a-b5dd-e42dd628e734");
            Policy policy2 = new Policy("b6006ee5-e6e0-4818-87c0-657203ed97f0", false,
                                        "8080f25b-eace-40d9-bcd3-f64ed27164fc", false,
                                        "4565baf5-d6cc-466a-b5dd-e42dd628e734");
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
    @SuppressWarnings("resource")
    @Test
    public void testIsValid() {
        Policy policy = new Policy("72cefd36-0a2c-431d-8be9-bec650fb109c", true, "229a7eac-b513-4472-aa79-59c0bf6a0a50",
                                   false, "c2456fbf-decc-410c-95a8-dfcb5789aaac");
        assertTrue(policy.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Policy policy1 = new Policy("c0fbcc14-e749-41e0-b87f-3300f030cb48", false,
                                        "0d8d59b4-3b26-477d-9f0f-a143b12ab0d1", true,
                                        "4386c6c0-f113-4127-a011-3859e27dde56");
            Policy policy2 = new Policy("c0fbcc14-e749-41e0-b87f-3300f030cb48", false,
                                        "0d8d59b4-3b26-477d-9f0f-a143b12ab0d1", true,
                                        "4386c6c0-f113-4127-a011-3859e27dde56");
            Policy policy3 = new Policy("696e64a1-ff37-4614-b061-b1af8b1a3b74", false,
                                        "942a521e-77e5-4c46-99c1-94144a1cc220", true,
                                        "8cce1b5b-6cff-4891-bc51-79c9ad2bb4b5");
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
