// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model LoginProfile.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestLoginProfile {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            LoginProfile loginprofile1 = new LoginProfile("3ee60ecf-440e-4e21-816f-7642a22e44f2",
                                                          "bb0d3e39-ca67-4250-a226-76c87972c7ce");
            LoginProfile loginprofile2 = loginprofile1.clone();
            assertNotNull(loginprofile1);
            assertNotNull(loginprofile2);
            assertNotSame(loginprofile2, loginprofile1);
            assertEquals(loginprofile2, loginprofile1);
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
            LoginProfile loginprofile1 = new LoginProfile("f2e89745-c5c1-49d0-a02e-aa635758532a",
                                                          "52ec8413-57f5-4a7b-a3f2-a4d49585b97d");
            LoginProfile loginprofile2 = new LoginProfile("f2e89745-c5c1-49d0-a02e-aa635758532a",
                                                          "52ec8413-57f5-4a7b-a3f2-a4d49585b97d");
            assertNotNull(loginprofile1);
            assertNotNull(loginprofile2);
            assertNotSame(loginprofile2, loginprofile1);
            assertEquals(loginprofile2, loginprofile1);
            assertEquals(loginprofile2.hashCode(), loginprofile1.hashCode());
            int hashCode = loginprofile1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, loginprofile1.hashCode());
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
        LoginProfile loginprofile = new LoginProfile("ebadd42d-9cc3-44f0-abc4-35a09b4734af",
                                                     "8b6ae7ec-78f4-4849-8856-986bce0bfdb6");
        assertTrue(loginprofile.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            LoginProfile loginprofile1 = new LoginProfile("82a71415-2c7a-40e7-84d5-00bf5670f6de",
                                                          "504556d6-1595-456b-ac04-afcf8a4860d4");
            LoginProfile loginprofile2 = new LoginProfile("82a71415-2c7a-40e7-84d5-00bf5670f6de",
                                                          "504556d6-1595-456b-ac04-afcf8a4860d4");
            LoginProfile loginprofile3 = new LoginProfile("159ae651-b82e-4346-a675-c58134379912",
                                                          "3586e7e5-7ebb-43d8-8d7d-39fe20811b89");
            assertNotNull(loginprofile1);
            assertNotNull(loginprofile2);
            assertNotNull(loginprofile3);
            assertNotSame(loginprofile2, loginprofile1);
            assertNotSame(loginprofile3, loginprofile1);
            assertEquals(loginprofile2, loginprofile1);
            assertEquals(loginprofile2, loginprofile1);
            assertEquals(loginprofile1, loginprofile2);
            assertEquals(loginprofile1, loginprofile1);
            assertFalse(loginprofile1.equals(null));
            assertNotEquals(loginprofile3, loginprofile1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
