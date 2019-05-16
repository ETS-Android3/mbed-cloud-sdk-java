// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model SubtenantTrustedCertificateStatus.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantTrustedCertificateStatus {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            SubtenantTrustedCertificateStatus subtenanttrustedcertificatestatus = SubtenantTrustedCertificateStatus.getValue(null);
            assertNotNull(subtenanttrustedcertificatestatus);
            assertTrue(subtenanttrustedcertificatestatus.isDefault());
            subtenanttrustedcertificatestatus = SubtenantTrustedCertificateStatus.getValue(SubtenantTrustedCertificateStatus.getDefault()
                                                                                                                            .getString());
            assertNotNull(subtenanttrustedcertificatestatus);
            assertTrue(subtenanttrustedcertificatestatus.isDefault());
            subtenanttrustedcertificatestatus = SubtenantTrustedCertificateStatus.getValue("ACTIVE");
            assertNotNull(subtenanttrustedcertificatestatus);
            assertTrue(subtenanttrustedcertificatestatus.isDefault());
            subtenanttrustedcertificatestatus = SubtenantTrustedCertificateStatus.getValue("INACTIVE");
            assertNotNull(subtenanttrustedcertificatestatus);
            assertFalse(subtenanttrustedcertificatestatus.isDefault());
            subtenanttrustedcertificatestatus = SubtenantTrustedCertificateStatus.getValue("4d93ab6b-cedf-46c9-96b6-391c62a9f41a");
            assertNotNull(subtenanttrustedcertificatestatus);
            assertTrue(subtenanttrustedcertificatestatus.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
