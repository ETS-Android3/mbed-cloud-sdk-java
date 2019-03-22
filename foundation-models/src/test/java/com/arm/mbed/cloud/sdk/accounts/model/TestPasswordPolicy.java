// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model PasswordPolicy.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestPasswordPolicy {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            PasswordPolicy passwordpolicy1 = new PasswordPolicy("1db21d53-5ac4-48ac-9fda-d204d48c2d61");
            PasswordPolicy passwordpolicy2 = passwordpolicy1.clone();
            assertNotNull(passwordpolicy1);
            assertNotNull(passwordpolicy2);
            assertNotSame(passwordpolicy2, passwordpolicy1);
            assertEquals(passwordpolicy2, passwordpolicy1);
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
            PasswordPolicy passwordpolicy1 = new PasswordPolicy("f554b466-6654-400d-939b-27725740dd64");
            PasswordPolicy passwordpolicy2 = new PasswordPolicy("f554b466-6654-400d-939b-27725740dd64");
            assertNotNull(passwordpolicy1);
            assertNotNull(passwordpolicy2);
            assertNotSame(passwordpolicy2, passwordpolicy1);
            assertEquals(passwordpolicy2, passwordpolicy1);
            assertEquals(passwordpolicy2.hashCode(), passwordpolicy1.hashCode());
            int hashCode = passwordpolicy1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, passwordpolicy1.hashCode());
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
        PasswordPolicy passwordpolicy = new PasswordPolicy("02c8c14b-65ca-4894-9d6b-cf0a56fa128c");
        assertTrue(passwordpolicy.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            PasswordPolicy passwordpolicy1 = new PasswordPolicy("27ae8958-eca2-4031-8b2e-af2baaadd796");
            PasswordPolicy passwordpolicy2 = new PasswordPolicy("27ae8958-eca2-4031-8b2e-af2baaadd796");
            PasswordPolicy passwordpolicy3 = new PasswordPolicy("5acd6f4b-447f-4735-a57a-797bfd335c3b");
            assertNotNull(passwordpolicy1);
            assertNotNull(passwordpolicy2);
            assertNotNull(passwordpolicy3);
            assertNotSame(passwordpolicy2, passwordpolicy1);
            assertNotSame(passwordpolicy3, passwordpolicy1);
            assertEquals(passwordpolicy2, passwordpolicy1);
            assertEquals(passwordpolicy2, passwordpolicy1);
            assertEquals(passwordpolicy1, passwordpolicy2);
            assertEquals(passwordpolicy1, passwordpolicy1);
            assertFalse(passwordpolicy1.equals(null));
            assertNotEquals(passwordpolicy3, passwordpolicy1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
