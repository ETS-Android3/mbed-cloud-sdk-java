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
            Policy policy1 = new Policy("3f84d805-1d7e-43b0-b73d-209fc6fde94e", false,
                                        "508628c7-fbfc-4473-9d3f-b74be4e028df", false,
                                        "42a08dfb-4b7b-45a7-9815-60078dc157f9");
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
            Policy policy1 = new Policy("44c7274f-7aab-4590-aeed-dd5abb36d10a", true,
                                        "39d25e80-ffbf-43d4-b2c3-b444d3cfa119", true,
                                        "19214628-815e-420d-84a8-a620f73bb1dd");
            Policy policy2 = new Policy("44c7274f-7aab-4590-aeed-dd5abb36d10a", true,
                                        "39d25e80-ffbf-43d4-b2c3-b444d3cfa119", true,
                                        "19214628-815e-420d-84a8-a620f73bb1dd");
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
        Policy policy = new Policy("bd1bae89-f371-4a97-aab6-1dfd3bb9cb30", true, "765c3e3f-53c1-4545-beae-40611d0511c7",
                                   false, "4c66e794-a8a6-4d5a-862a-9a523b268109");
        assertTrue(policy.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Policy policy1 = new Policy("0a5649c1-cc94-4b33-87f5-8ceff3539c48", true,
                                        "ab0c7286-26ff-47e0-b7e0-cc5c2cb3025c", false,
                                        "b6d0d09e-05a6-48c8-8cf4-19eb12e5a728");
            Policy policy2 = new Policy("0a5649c1-cc94-4b33-87f5-8ceff3539c48", true,
                                        "ab0c7286-26ff-47e0-b7e0-cc5c2cb3025c", false,
                                        "b6d0d09e-05a6-48c8-8cf4-19eb12e5a728");
            Policy policy3 = new Policy("95b23a40-6957-441f-bfd0-f7c56981a858", true,
                                        "c47ee038-f0e5-405d-994d-90bfdbb7ae07", false,
                                        "c9f67d15-2462-4563-bd5b-f08d8e237c87");
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
