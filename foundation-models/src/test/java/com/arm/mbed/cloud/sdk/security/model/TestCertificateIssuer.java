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
        CertificateIssuer certificateissuer1 = new CertificateIssuer(new java.util.Date(1545943216950L),
                                                                     "159e95f5-6cf5-4cd0-a87e-4c70632eb683",
                                                                     "f9e03e02-de8e-41e5-a5f6-ac34e1bdd6cf", null,
                                                                     com.arm.mbed.cloud.sdk.security.model.CertificateIssuerIssuerType.getDefault(),
                                                                     "cae4a4bc-3149-4693-9444-1ff80b22f774", false);
        CertificateIssuer certificateissuer2 = certificateissuer1.clone();
        assertNotNull(certificateissuer1);
        assertNotNull(certificateissuer2);
        assertNotSame(certificateissuer2, certificateissuer1);
        assertEquals(certificateissuer2, certificateissuer1);
    }

    /**
     * Tests the isvalid method.
     */
    @Test
    public void testIsvalid() {
        CertificateIssuer certificateissuer = new CertificateIssuer(new java.util.Date(1545943217369L),
                                                                    "09a7e83e-8203-4231-a8b6-db2da424fd56",
                                                                    "845eaaa9-4f1d-4d1e-8833-4c3198bc4a3c", null,
                                                                    com.arm.mbed.cloud.sdk.security.model.CertificateIssuerIssuerType.getDefault(),
                                                                    "278b2928-f91f-436c-b223-c87a8507dc98", false);
        assertTrue(certificateissuer.isValid());
    }

    /**
     * Tests the hashcode method.
     */
    @Test
    public void testHashcode() {
        CertificateIssuer certificateissuer1 = new CertificateIssuer(new java.util.Date(1545943218996L),
                                                                     "7c4ff28f-baf3-428b-85f0-bd1514c63d81",
                                                                     "1039480d-8cfe-4590-9f90-3beb1560e929", null,
                                                                     com.arm.mbed.cloud.sdk.security.model.CertificateIssuerIssuerType.getDefault(),
                                                                     "aae915b7-86ee-4ebd-a093-9ad38993052b", true);
        CertificateIssuer certificateissuer2 = new CertificateIssuer(new java.util.Date(1545943218996L),
                                                                     "7c4ff28f-baf3-428b-85f0-bd1514c63d81",
                                                                     "1039480d-8cfe-4590-9f90-3beb1560e929", null,
                                                                     com.arm.mbed.cloud.sdk.security.model.CertificateIssuerIssuerType.getDefault(),
                                                                     "aae915b7-86ee-4ebd-a093-9ad38993052b", true);
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
        CertificateIssuer certificateissuer1 = new CertificateIssuer(new java.util.Date(1545943213436L),
                                                                     "91664bf4-88bf-4e75-af94-b14ead25f7b7",
                                                                     "14d8afa3-9d13-4316-a9f8-d7580491465c", null,
                                                                     com.arm.mbed.cloud.sdk.security.model.CertificateIssuerIssuerType.getDefault(),
                                                                     "7e57f1ad-f8cc-4cb1-bf0b-c8d8166ec4ac", true);
        CertificateIssuer certificateissuer2 = new CertificateIssuer(new java.util.Date(1545943213436L),
                                                                     "91664bf4-88bf-4e75-af94-b14ead25f7b7",
                                                                     "14d8afa3-9d13-4316-a9f8-d7580491465c", null,
                                                                     com.arm.mbed.cloud.sdk.security.model.CertificateIssuerIssuerType.getDefault(),
                                                                     "7e57f1ad-f8cc-4cb1-bf0b-c8d8166ec4ac", true);
        CertificateIssuer certificateissuer3 = new CertificateIssuer(new java.util.Date(1545943217719L),
                                                                     "c3db43e8-f6e2-4174-9fd6-475135ef2423",
                                                                     "d5668fa9-6bbf-4d37-9531-54876ceed7e3", null,
                                                                     com.arm.mbed.cloud.sdk.security.model.CertificateIssuerIssuerType.getDefault(),
                                                                     "61e04723-0f0c-45c8-917c-e740929f79e7", false);
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
