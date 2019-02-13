// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model TrustedCertificateService.
 */
public class TestTrustedCertificateService {
    /**
     * Tests the getValue method.
     */
    @Test
    public void testGetValue() {
        try {
            TrustedCertificateService trustedcertificateservice = TrustedCertificateService.getValue(null);
            assertNotNull(trustedcertificateservice);
            assertTrue(trustedcertificateservice.isDefault());
            trustedcertificateservice = TrustedCertificateService.getValue(TrustedCertificateService.getDefault()
                                                                                                    .getString());
            assertNotNull(trustedcertificateservice);
            assertTrue(trustedcertificateservice.isDefault());
            trustedcertificateservice = TrustedCertificateService.getValue("BOOTSTRAP");
            assertNotNull(trustedcertificateservice);
            assertTrue(trustedcertificateservice.isDefault());
            trustedcertificateservice = TrustedCertificateService.getValue("lwm2m");
            assertNotNull(trustedcertificateservice);
            assertFalse(trustedcertificateservice.isDefault());
            trustedcertificateservice = TrustedCertificateService.getValue("9a5aa85c-f837-4e14-a221-8f9a748d03f4");
            assertNotNull(trustedcertificateservice);
            assertTrue(trustedcertificateservice.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
