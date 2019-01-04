// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model CertificateEnrollmentEnrollResult.
 */
public class TestCertificateEnrollmentEnrollResult {
    /**
     * Tests the getValue method.
     */
    @Test
    public void testGetValue() {
        try {
            CertificateEnrollmentEnrollResult certificateenrollmentenrollresult = CertificateEnrollmentEnrollResult.getValue(null);
            assertNotNull(certificateenrollmentenrollresult);
            assertTrue(certificateenrollmentenrollresult.isDefault());
            certificateenrollmentenrollresult = CertificateEnrollmentEnrollResult.getValue(CertificateEnrollmentEnrollResult.getDefault()
                                                                                                                            .getString());
            assertNotNull(certificateenrollmentenrollresult);
            assertTrue(certificateenrollmentenrollresult.isDefault());
            certificateenrollmentenrollresult = CertificateEnrollmentEnrollResult.getValue("FAILURE");
            assertNotNull(certificateenrollmentenrollresult);
            assertTrue(certificateenrollmentenrollresult.isDefault());
            certificateenrollmentenrollresult = CertificateEnrollmentEnrollResult.getValue("forbidden");
            assertNotNull(certificateenrollmentenrollresult);
            assertFalse(certificateenrollmentenrollresult.isDefault());
            certificateenrollmentenrollresult = CertificateEnrollmentEnrollResult.getValue("09f895b0-ece0-43a8-b61c-e400caeae0f5");
            assertNotNull(certificateenrollmentenrollresult);
            assertTrue(certificateenrollmentenrollresult.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
