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
        try {
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new java.util.Date(1546448711055L),
                                                                         "e3820c9d-ea80-4678-89f3-24d02397158a",
                                                                         "87464527-0dd6-4546-968a-6675d9f7d188", null,
                                                                         com.arm.mbed.cloud.sdk.security.model.CertificateIssuerIssuerType.getDefault(),
                                                                         "11bc1da5-bdcd-4f26-95b8-7800ee34bb78");
            CertificateIssuer certificateissuer2 = certificateissuer1.clone();
            assertNotNull(certificateissuer1);
            assertNotNull(certificateissuer2);
            assertNotSame(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer2, certificateissuer1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsvalid() {
        CertificateIssuer certificateissuer = new CertificateIssuer(new java.util.Date(1546448712384L),
                                                                    "ea8f8fdc-1eed-47bf-9d67-bd0fb0f11326",
                                                                    "2ceef67c-d677-4e73-ac75-c95673fa8147", null,
                                                                    com.arm.mbed.cloud.sdk.security.model.CertificateIssuerIssuerType.getDefault(),
                                                                    "9a5199b7-959e-4e7a-af43-ba00dce4a541");
        assertTrue(certificateissuer.isValid());
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashcode() {
        try {
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new java.util.Date(1546448715447L),
                                                                         "c87e6e31-8bf4-4be7-9730-a35ea2bb2a5e",
                                                                         "38058497-d487-4e9f-95e2-3db880132c30", null,
                                                                         com.arm.mbed.cloud.sdk.security.model.CertificateIssuerIssuerType.getDefault(),
                                                                         "a3a19222-d2ec-42e6-bde1-03b70fc414a9");
            CertificateIssuer certificateissuer2 = new CertificateIssuer(new java.util.Date(1546448715447L),
                                                                         "c87e6e31-8bf4-4be7-9730-a35ea2bb2a5e",
                                                                         "38058497-d487-4e9f-95e2-3db880132c30", null,
                                                                         com.arm.mbed.cloud.sdk.security.model.CertificateIssuerIssuerType.getDefault(),
                                                                         "a3a19222-d2ec-42e6-bde1-03b70fc414a9");
            assertNotNull(certificateissuer1);
            assertNotNull(certificateissuer2);
            assertNotSame(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer2, certificateissuer1);
            assertEquals(certificateissuer2.hashCode(), certificateissuer1.hashCode());
            int hashCode = certificateissuer1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, certificateissuer1.hashCode());
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
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new java.util.Date(1546448713134L),
                                                                         "f7508c7d-751d-4756-a31a-6ec219edcd46",
                                                                         "e7bea831-2d6e-45b4-a4f9-9501798548e0", null,
                                                                         com.arm.mbed.cloud.sdk.security.model.CertificateIssuerIssuerType.getDefault(),
                                                                         "3d469190-7521-4295-aa24-906a20cfa0af");
            CertificateIssuer certificateissuer2 = new CertificateIssuer(new java.util.Date(1546448713134L),
                                                                         "f7508c7d-751d-4756-a31a-6ec219edcd46",
                                                                         "e7bea831-2d6e-45b4-a4f9-9501798548e0", null,
                                                                         com.arm.mbed.cloud.sdk.security.model.CertificateIssuerIssuerType.getDefault(),
                                                                         "3d469190-7521-4295-aa24-906a20cfa0af");
            CertificateIssuer certificateissuer3 = new CertificateIssuer(new java.util.Date(1546448713246L),
                                                                         "58f9049a-d014-400f-99ca-968defdd93f9",
                                                                         "2afd4911-faf7-4285-999f-eaaf944c786a", null,
                                                                         com.arm.mbed.cloud.sdk.security.model.CertificateIssuerIssuerType.getDefault(),
                                                                         "5c24bf63-7e6e-48cd-9dcc-20c8b2e9e44e");
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
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
