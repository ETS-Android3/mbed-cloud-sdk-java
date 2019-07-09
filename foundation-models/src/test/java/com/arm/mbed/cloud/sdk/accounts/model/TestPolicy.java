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
            Policy policy1 = new Policy("ab274957-3936-48fe-8b27-02848bb41841", false,
                                        "6b6feaa4-e75e-4a68-b08f-fee426c5a733", true,
                                        "a5fdd8ccb79ecfcc089719469de69b9b", PolicyInheritedType.getDefault(),
                                        "11aef675-3c0c-4bb7-8b67-6c40bf27245e");
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
            Policy policy1 = new Policy("c2975dcc-bb0e-461a-ac01-db2dc65f187e", true,
                                        "f38ad834-926c-4909-857a-7b1790872464", true,
                                        "a5fdd8ccb79ecfcc089719469de69b9b", PolicyInheritedType.getDefault(),
                                        "dd608a5c-6d24-4ed4-ba97-1fc5d9eaf9a3");
            Policy policy2 = new Policy("c2975dcc-bb0e-461a-ac01-db2dc65f187e", true,
                                        "f38ad834-926c-4909-857a-7b1790872464", true,
                                        "a5fdd8ccb79ecfcc089719469de69b9b", PolicyInheritedType.getDefault(),
                                        "dd608a5c-6d24-4ed4-ba97-1fc5d9eaf9a3");
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
        Policy policy = new Policy("e3d5b9c2-8c3e-4235-ad36-0abccb2a74e7", true, "0880d5d1-dc3a-4909-b25b-440820b58f1e",
                                   false, "a5fdd8ccb79ecfcc089719469de69b9b", PolicyInheritedType.getDefault(),
                                   "845f5f8c-dff5-4c7e-970e-41695fffa8ca");
        assertTrue(policy.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Policy policy1 = new Policy("a9fe7e66-46d6-4f62-8abf-a798f580601e", true,
                                        "9bfdf705-47f2-44bc-9f3a-2ba3292309c1", false,
                                        "a5fdd8ccb79ecfcc089719469de69b9b", PolicyInheritedType.getDefault(),
                                        "f2216a07-7b28-4a62-a632-c159338d2599");
            Policy policy2 = new Policy("a9fe7e66-46d6-4f62-8abf-a798f580601e", true,
                                        "9bfdf705-47f2-44bc-9f3a-2ba3292309c1", false,
                                        "a5fdd8ccb79ecfcc089719469de69b9b", PolicyInheritedType.getDefault(),
                                        "f2216a07-7b28-4a62-a632-c159338d2599");
            Policy policy3 = new Policy("10315427-6841-477b-b80d-0be7500576d7", true,
                                        "0dfdb106-78b0-4247-bb19-2ad5bc327b2b", false,
                                        "a5fdd8ccb79ecfcc089719469de69b9b", PolicyInheritedType.getDefault(),
                                        "8694dd23-edfe-4f51-912f-c0e96aa37daf");
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
