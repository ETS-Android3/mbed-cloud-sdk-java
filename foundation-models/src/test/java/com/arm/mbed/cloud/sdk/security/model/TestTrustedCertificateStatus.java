// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model TrustedCertificateStatus.
 */
public class TestTrustedCertificateStatus {
    /**
     * Tests the getValue method.
     */
    @Test
    public void testGetvalue() {
        TrustedCertificateStatus trustedcertificatestatus = TrustedCertificateStatus.getValue(null);
        assertNotNull(trustedcertificatestatus);
        assertTrue(trustedcertificatestatus.isDefault());
        trustedcertificatestatus = TrustedCertificateStatus.getValue(TrustedCertificateStatus.getDefault().getString());
        assertNotNull(trustedcertificatestatus);
        assertTrue(trustedcertificatestatus.isDefault());
        trustedcertificatestatus = TrustedCertificateStatus.getValue("ACTIVE");
        assertNotNull(trustedcertificatestatus);
        assertTrue(trustedcertificatestatus.isDefault());
        trustedcertificatestatus = TrustedCertificateStatus.getValue("INACTIVE");
        assertNotNull(trustedcertificatestatus);
        assertFalse(trustedcertificatestatus.isDefault());
        trustedcertificatestatus = TrustedCertificateStatus.getValue("0661eef0-18af-4b35-85ef-36fde6fba51d");
        assertNotNull(trustedcertificatestatus);
        assertTrue(trustedcertificatestatus.isDefault());
    }
}
