// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CertificateIssuer.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCertificateIssuer {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new Date(1559150272091L),
                                                                         "7cbc22f7-7c65-4ad5-918d-3f806487e691",
                                                                         "61be3b42-2671-4ad6-9025-f60bd0d79a57", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "8d29bb7d-d094-48c9-bf14-c524f333c5e7");
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
     * Tests the hashCode method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testHashCode() {
        try {
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new Date(1559150270187L),
                                                                         "b3f85327-6fa5-47fc-9964-cb9f19d86acf",
                                                                         "29a55658-67d2-4ce7-a1fc-b6bb84571ecd", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "d9772376-7406-4b8e-9597-5aedfe392125");
            CertificateIssuer certificateissuer2 = new CertificateIssuer(new Date(1559150270187L),
                                                                         "b3f85327-6fa5-47fc-9964-cb9f19d86acf",
                                                                         "29a55658-67d2-4ce7-a1fc-b6bb84571ecd", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "d9772376-7406-4b8e-9597-5aedfe392125");
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
     * Tests the isValid method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testIsValid() {
        CertificateIssuer certificateissuer = new CertificateIssuer(new Date(1559150274643L),
                                                                    "a03b37b0-516b-4956-8674-4550dcdc3f65",
                                                                    "358efcde-0a56-4c70-91aa-1c40846cbaad", null,
                                                                    CertificateIssuerType.getDefault(),
                                                                    "257fd0a5-bb0b-4910-bb21-4af14a660e95");
        assertTrue(certificateissuer.isValid());
        CertificateIssuer certificateissuerInvalid = new CertificateIssuer(new Date(1559150272203L),
                                                                           "99ce1879-0e0e-47ce-9818-5b644fcbaa1e6a4bb0b0-4092-45f6-b49e-46f6c1df372630f10144-c51a-442d-990c-f1622fbf71bb",
                                                                           "16b0351f-cc45-4782-a554-0f752f3ed1fd", null,
                                                                           CertificateIssuerType.getDefault(), null);
        assertFalse(certificateissuerInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CertificateIssuer certificateissuer1 = new CertificateIssuer(new Date(1559150278162L),
                                                                         "e39c5652-4a8d-4415-a138-956d21629352",
                                                                         "1a5b41d0-a501-4a07-9859-376005f2d60b", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "36cc2338-e36c-4475-adeb-49b5f84d31b7");
            CertificateIssuer certificateissuer2 = new CertificateIssuer(new Date(1559150278162L),
                                                                         "e39c5652-4a8d-4415-a138-956d21629352",
                                                                         "1a5b41d0-a501-4a07-9859-376005f2d60b", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "36cc2338-e36c-4475-adeb-49b5f84d31b7");
            CertificateIssuer certificateissuer3 = new CertificateIssuer(new Date(1559150269991L),
                                                                         "2dd58ec2-f899-4fc6-a0eb-460a269fad33",
                                                                         "0d1db895-358b-453b-92c2-a388202f0203", null,
                                                                         CertificateIssuerType.getDefault(),
                                                                         "53a92854-1e1d-4ad4-a025-beba8c7cbe3b");
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
