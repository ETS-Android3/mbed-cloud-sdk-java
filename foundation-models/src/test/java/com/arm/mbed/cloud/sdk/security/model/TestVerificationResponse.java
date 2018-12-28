// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model VerificationResponse.
 */
public class TestVerificationResponse {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        VerificationResponse verificationresponse1 = new VerificationResponse("a3c0d5d6-4c5e-429b-b9ec-4b9d413ea756",
                                                                              true);
        VerificationResponse verificationresponse2 = verificationresponse1.clone();
        assertNotNull(verificationresponse1);
        assertNotNull(verificationresponse2);
        assertNotSame(verificationresponse2, verificationresponse1);
        assertEquals(verificationresponse2, verificationresponse1);
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsvalid() {
        VerificationResponse verificationresponse = new VerificationResponse("3d9e35da-4a61-4ce6-9a80-e06f7d9234a2",
                                                                             true);
        assertTrue(verificationresponse.isValid());
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashcode() {
        VerificationResponse verificationresponse1 = new VerificationResponse("2bd8429b-9da2-419b-9ed7-25d8d12a31c8",
                                                                              false);
        VerificationResponse verificationresponse2 = new VerificationResponse("2bd8429b-9da2-419b-9ed7-25d8d12a31c8",
                                                                              false);
        assertNotNull(verificationresponse1);
        assertNotNull(verificationresponse2);
        assertNotSame(verificationresponse2, verificationresponse1);
        assertEquals(verificationresponse2, verificationresponse1);
        assertEquals(verificationresponse2.hashCode(), verificationresponse1.hashCode());
        int hashCode = verificationresponse1.hashCode();
        for (int i = 0; i < 5; i++) {
            assertEquals(hashCode, verificationresponse1.hashCode());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        VerificationResponse verificationresponse1 = new VerificationResponse("02f46747-7dab-4d69-927c-53366cef2fc4",
                                                                              true);
        VerificationResponse verificationresponse2 = new VerificationResponse("02f46747-7dab-4d69-927c-53366cef2fc4",
                                                                              true);
        VerificationResponse verificationresponse3 = new VerificationResponse("a96a9cba-2fbf-4929-ade1-bcdbb3a0137e",
                                                                              false);
        assertNotNull(verificationresponse1);
        assertNotNull(verificationresponse2);
        assertNotNull(verificationresponse3);
        assertNotSame(verificationresponse2, verificationresponse1);
        assertNotSame(verificationresponse3, verificationresponse1);
        assertEquals(verificationresponse2, verificationresponse1);
        assertEquals(verificationresponse2, verificationresponse1);
        assertEquals(verificationresponse1, verificationresponse2);
        assertEquals(verificationresponse1, verificationresponse1);
        assertFalse(verificationresponse1.equals(null));
        assertNotEquals(verificationresponse3, verificationresponse1);
    }
}
