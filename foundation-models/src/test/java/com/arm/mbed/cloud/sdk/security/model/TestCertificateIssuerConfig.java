// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuerConfig.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateIssuerConfig {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("ed1bd464-dacc-4a89-ba31-e6638bfc73ce",
                                                                                           new Date(1562663760101L),
                                                                                           "8983365a-bf3e-4ccc-bcb3-cdb3d50b4028",
                                                                                           "6fb9c754-3fc6-45b5-a8b2-607f51eb8e42",
                                                                                           new Date(1562663757401L));
            CertificateIssuerConfig certificateissuerconfig2 = certificateissuerconfig1.clone();
            assertNotNull(certificateissuerconfig1);
            assertNotNull(certificateissuerconfig2);
            assertNotSame(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2, certificateissuerconfig1);
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
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("1e20869e-9e55-46f2-be6a-d3a74f1b2ddf",
                                                                                           new Date(1562663759017L),
                                                                                           "6210577a-85bc-41d4-a77c-7b27252d10a5",
                                                                                           "1d7e81c4-ad50-46f4-bcab-cdb4d1cf276b",
                                                                                           new Date(1562663757229L));
            CertificateIssuerConfig certificateissuerconfig2 = new CertificateIssuerConfig("1e20869e-9e55-46f2-be6a-d3a74f1b2ddf",
                                                                                           new Date(1562663759017L),
                                                                                           "6210577a-85bc-41d4-a77c-7b27252d10a5",
                                                                                           "1d7e81c4-ad50-46f4-bcab-cdb4d1cf276b",
                                                                                           new Date(1562663757229L));
            assertNotNull(certificateissuerconfig1);
            assertNotNull(certificateissuerconfig2);
            assertNotSame(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2.hashCode(), certificateissuerconfig1.hashCode());
            int hashCode = certificateissuerconfig1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, certificateissuerconfig1.hashCode());
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
        CertificateIssuerConfig certificateissuerconfig = new CertificateIssuerConfig("8292a9db-b696-4bcc-927b-071f204dc5a1",
                                                                                      new Date(1562663761265L),
                                                                                      "0a01b32c-747e-4400-8843-d66032fe0ffc",
                                                                                      "7df19620-c5ee-4abd-ad8f-250faac77bad",
                                                                                      new Date(1562663764961L));
        assertTrue(certificateissuerconfig.isValid());
        CertificateIssuerConfig certificateissuerconfigInvalid = new CertificateIssuerConfig(null,
                                                                                             new Date(1562663762154L),
                                                                                             "13c55f4b-08e9-4fc2-b3fa-8cd741ae6d05",
                                                                                             null,
                                                                                             new Date(1562663759209L));
        assertFalse(certificateissuerconfigInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateIssuerConfig certificateissuerconfig1 = new CertificateIssuerConfig("00c9dd52-959c-41c8-947b-74f0aca9a283",
                                                                                           new Date(1562663760616L),
                                                                                           "4bb720dc-c98b-4d97-9595-3d4ee6d94813",
                                                                                           "370537a4-6808-4f7b-91b4-62dcabd21616",
                                                                                           new Date(1562663757434L));
            CertificateIssuerConfig certificateissuerconfig2 = new CertificateIssuerConfig("00c9dd52-959c-41c8-947b-74f0aca9a283",
                                                                                           new Date(1562663760616L),
                                                                                           "4bb720dc-c98b-4d97-9595-3d4ee6d94813",
                                                                                           "370537a4-6808-4f7b-91b4-62dcabd21616",
                                                                                           new Date(1562663757434L));
            CertificateIssuerConfig certificateissuerconfig3 = new CertificateIssuerConfig("8726caf8-dd2e-4249-be50-aefadb5ecad0",
                                                                                           new Date(1562663758320L),
                                                                                           "4f74a70e-36bc-4b84-87be-b57387ca0e45",
                                                                                           "b298587d-4bfe-4c9e-917e-25f703576ecb",
                                                                                           new Date(1562663762348L));
            assertNotNull(certificateissuerconfig1);
            assertNotNull(certificateissuerconfig2);
            assertNotNull(certificateissuerconfig3);
            assertNotSame(certificateissuerconfig2, certificateissuerconfig1);
            assertNotSame(certificateissuerconfig3, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig2, certificateissuerconfig1);
            assertEquals(certificateissuerconfig1, certificateissuerconfig2);
            assertEquals(certificateissuerconfig1, certificateissuerconfig1);
            assertFalse(certificateissuerconfig1.equals(null));
            assertNotEquals(certificateissuerconfig3, certificateissuerconfig1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
