// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model TrustedCertificateListOptions.
 */
public class TestTrustedCertificateListOptions {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            TrustedCertificateListOptions trustedcertificatelistoptions1 = new TrustedCertificateListOptions(Integer.valueOf(-34),
                                                                                                             Long.valueOf(92),
                                                                                                             Order.getDefault(),
                                                                                                             "58cf8d67-5725-4885-939b-ff22135457e5",
                                                                                                             null,
                                                                                                             null);
            TrustedCertificateListOptions trustedcertificatelistoptions2 = trustedcertificatelistoptions1.clone();
            assertNotNull(trustedcertificatelistoptions1);
            assertNotNull(trustedcertificatelistoptions2);
            assertNotSame(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
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
            TrustedCertificateListOptions trustedcertificatelistoptions1 = new TrustedCertificateListOptions(Integer.valueOf(92),
                                                                                                             Long.valueOf(125),
                                                                                                             Order.getDefault(),
                                                                                                             "7727bfd3-2ca7-41c2-8b2a-9058c92290f0",
                                                                                                             null,
                                                                                                             null);
            TrustedCertificateListOptions trustedcertificatelistoptions2 = new TrustedCertificateListOptions(Integer.valueOf(92),
                                                                                                             Long.valueOf(125),
                                                                                                             Order.getDefault(),
                                                                                                             "7727bfd3-2ca7-41c2-8b2a-9058c92290f0",
                                                                                                             null,
                                                                                                             null);
            assertNotNull(trustedcertificatelistoptions1);
            assertNotNull(trustedcertificatelistoptions2);
            assertNotSame(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions2.hashCode(), trustedcertificatelistoptions1.hashCode());
            int hashCode = trustedcertificatelistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, trustedcertificatelistoptions1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        try {
            TrustedCertificateListOptions trustedcertificatelistoptions1 = new TrustedCertificateListOptions(Integer.valueOf(14),
                                                                                                             Long.valueOf(118),
                                                                                                             Order.getDefault(),
                                                                                                             "45b1a4ba-cf27-49bd-9638-2ea73398c4a2",
                                                                                                             null,
                                                                                                             null);
            TrustedCertificateListOptions trustedcertificatelistoptions2 = new TrustedCertificateListOptions(Integer.valueOf(14),
                                                                                                             Long.valueOf(118),
                                                                                                             Order.getDefault(),
                                                                                                             "45b1a4ba-cf27-49bd-9638-2ea73398c4a2",
                                                                                                             null,
                                                                                                             null);
            TrustedCertificateListOptions trustedcertificatelistoptions3 = new TrustedCertificateListOptions(Integer.valueOf(71),
                                                                                                             Long.valueOf(-119),
                                                                                                             Order.getDefault(),
                                                                                                             "b696d1e9-04ea-4bbe-b4ce-99c38a063e09",
                                                                                                             null,
                                                                                                             null);
            assertNotNull(trustedcertificatelistoptions1);
            assertNotNull(trustedcertificatelistoptions2);
            assertNotNull(trustedcertificatelistoptions3);
            assertNotSame(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertNotSame(trustedcertificatelistoptions3, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions1, trustedcertificatelistoptions2);
            assertEquals(trustedcertificatelistoptions1, trustedcertificatelistoptions1);
            assertFalse(trustedcertificatelistoptions1.equals(null));
            assertNotEquals(trustedcertificatelistoptions3, trustedcertificatelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
