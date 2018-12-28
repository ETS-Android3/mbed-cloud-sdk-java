// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuer.
 */
public class TestCertificateIssuer {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        CertificateIssuer certificateissuer1 = new CertificateIssuer(new java.util.Date(1546031368424L),
                                                                     "de89846c-deeb-4135-894d-3ed46f41327b",
                                                                     "5a9af2f3-8750-42c6-8e82-0193064c9c70", null,
                                                                     com.arm.mbed.cloud.sdk.security.model.CertificateIssuerType.getDefault(),
                                                                     "1a7fc77e-3800-421b-8c38-c0f78298cdd0");
        CertificateIssuer certificateissuer2 = certificateissuer1.clone();
        assertNotNull(certificateissuer1);
        assertNotNull(certificateissuer2);
        assertNotSame(certificateissuer2, certificateissuer1);
        assertEquals(certificateissuer2, certificateissuer1);
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsvalid() {
        CertificateIssuer certificateissuer = new CertificateIssuer(new java.util.Date(1546031366396L),
                                                                    "20969052-412f-4b83-8761-ed4f43637d1f",
                                                                    "9bc9906c-c704-4782-ab45-bcb3fc03a395", null,
                                                                    com.arm.mbed.cloud.sdk.security.model.CertificateIssuerType.getDefault(),
                                                                    "5ac93059-f56b-4619-b3eb-9203f58d1b35");
        assertTrue(certificateissuer.isValid());
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashcode() {
        CertificateIssuer certificateissuer1 = new CertificateIssuer(new java.util.Date(1546031364710L),
                                                                     "51d4eff3-9193-4b21-89e2-4d6d8aa646e4",
                                                                     "384249a4-249f-4cf8-ab46-12124ee71a95", null,
                                                                     com.arm.mbed.cloud.sdk.security.model.CertificateIssuerType.getDefault(),
                                                                     "dc3577e5-8266-44c7-a4dd-d31b2e2368c2");
        CertificateIssuer certificateissuer2 = new CertificateIssuer(new java.util.Date(1546031364710L),
                                                                     "51d4eff3-9193-4b21-89e2-4d6d8aa646e4",
                                                                     "384249a4-249f-4cf8-ab46-12124ee71a95", null,
                                                                     com.arm.mbed.cloud.sdk.security.model.CertificateIssuerType.getDefault(),
                                                                     "dc3577e5-8266-44c7-a4dd-d31b2e2368c2");
        assertNotNull(certificateissuer1);
        assertNotNull(certificateissuer2);
        assertNotSame(certificateissuer2, certificateissuer1);
        assertEquals(certificateissuer2, certificateissuer1);
        assertEquals(certificateissuer2.hashCode(), certificateissuer1.hashCode());
        int hashCode = certificateissuer1.hashCode();
        for (int i = 0; i < 5; i++) {
            assertEquals(hashCode, certificateissuer1.hashCode());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        CertificateIssuer certificateissuer1 = new CertificateIssuer(new java.util.Date(1546031364314L),
                                                                     "401f53f5-a5f5-444a-b1ba-6e719026351e",
                                                                     "a0364950-456b-40e8-a187-14aa1c784377", null,
                                                                     com.arm.mbed.cloud.sdk.security.model.CertificateIssuerType.getDefault(),
                                                                     "6f252859-7160-4f40-a0f4-5b6f845cf320");
        CertificateIssuer certificateissuer2 = new CertificateIssuer(new java.util.Date(1546031364314L),
                                                                     "401f53f5-a5f5-444a-b1ba-6e719026351e",
                                                                     "a0364950-456b-40e8-a187-14aa1c784377", null,
                                                                     com.arm.mbed.cloud.sdk.security.model.CertificateIssuerType.getDefault(),
                                                                     "6f252859-7160-4f40-a0f4-5b6f845cf320");
        CertificateIssuer certificateissuer3 = new CertificateIssuer(new java.util.Date(1546031367764L),
                                                                     "7190ab6c-ee58-40b0-8047-aead07de9d64",
                                                                     "47a7b34a-4bd5-411c-b0dc-70151e1f3733", null,
                                                                     com.arm.mbed.cloud.sdk.security.model.CertificateIssuerType.getDefault(),
                                                                     "0d9bb0d2-727a-4f72-b377-f89d526a9a94");
        assertNotNull(certificateissuer1);
        assertNotNull(certificateissuer2);
        assertNotNull(certificateissuer3);
        assertNotSame(certificateissuer2, certificateissuer1);
        assertNotSame(certificateissuer3, certificateissuer1);
        assertEquals(certificateissuer2, certificateissuer1);
        assertEquals(certificateissuer2, certificateissuer1);
        assertEquals(certificateissuer1, certificateissuer2);
        assertEquals(certificateissuer1, certificateissuer1);
        assertFalse(certificateissuer1.equals(null));
        assertNotEquals(certificateissuer3, certificateissuer1);
    }
}
