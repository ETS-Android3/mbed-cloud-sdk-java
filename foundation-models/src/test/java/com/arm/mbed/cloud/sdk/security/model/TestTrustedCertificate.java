// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model TrustedCertificate.
 */
public class TestTrustedCertificate {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            TrustedCertificate trustedcertificate1 = new TrustedCertificate("61d2a6a9-f042-4765-b4ce-7af72ed6ce1c",
                                                                            "f2873ad6-d092-453c-a776-f5d003589aa7",
                                                                            "3464cbd6-d782-4bf6-8203-6c9ebd5a3cee",
                                                                            new java.util.Date(1546448712241L),
                                                                            "6ce01e73-a1ac-44d9-92d1-607c642517a2", -88,
                                                                            true,
                                                                            "6aa26fab-91fc-4df0-af8c-726d8d39d192",
                                                                            true,
                                                                            "6ee5af2a-3931-42c2-93e9-512e26909afc",
                                                                            "c9e44cec-fc11-4847-b0f6-c4c6f66b6083",
                                                                            "4f861ff9-a43b-41cf-a604-634be7101678",
                                                                            com.arm.mbed.cloud.sdk.security.model.TrustedCertificateService.getDefault(),
                                                                            com.arm.mbed.cloud.sdk.security.model.TrustedCertificateStatus.getDefault(),
                                                                            "e53d8bd4-56a5-46fd-a61a-ea402aabf7f8",
                                                                            new java.util.Date(1546448718462L),
                                                                            new java.util.Date(1546448711877L));
            TrustedCertificate trustedcertificate2 = trustedcertificate1.clone();
            assertNotNull(trustedcertificate1);
            assertNotNull(trustedcertificate2);
            assertNotSame(trustedcertificate2, trustedcertificate1);
            assertEquals(trustedcertificate2, trustedcertificate1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsvalid() {
        TrustedCertificate trustedcertificate = new TrustedCertificate("1131b80c-f836-4c80-8997-159e2a21570e",
                                                                       "6f9b6653-2ca9-4c22-8bd0-4a408b4d99de",
                                                                       "d701e58f-86c6-4b04-807a-26002723c6f5",
                                                                       new java.util.Date(1546448719073L),
                                                                       "34dd8328-bcb5-410f-9413-afe3c5387b27", -47,
                                                                       true, "28c759fc-b37c-47b0-83ff-7e0006f6700d",
                                                                       false, "31a4e6cd-8f55-4b6f-9969-0a3071149617",
                                                                       "3740ca3c-e6a0-4f03-9c06-bae1d61e7d80",
                                                                       "10f67922-cfd5-4995-aa77-f6b9da6e5801",
                                                                       com.arm.mbed.cloud.sdk.security.model.TrustedCertificateService.getDefault(),
                                                                       com.arm.mbed.cloud.sdk.security.model.TrustedCertificateStatus.getDefault(),
                                                                       "850d1b68-45f8-4ee8-ad89-b80f6cbccfa5",
                                                                       new java.util.Date(1546448712866L),
                                                                       new java.util.Date(1546448712167L));
        assertTrue(trustedcertificate.isValid());
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashcode() {
        try {
            TrustedCertificate trustedcertificate1 = new TrustedCertificate("72dcad81-c8cd-4fb2-8453-e6ffaa4fde66",
                                                                            "2d690f1f-c653-462f-8791-a8bd73e812f0",
                                                                            "50217424-bb8a-4e61-be0d-90e6f9506836",
                                                                            new java.util.Date(1546448713563L),
                                                                            "526831ba-06c9-4271-9363-cbba336f27c2", 77,
                                                                            false,
                                                                            "d0293bc4-d87e-4d0b-909c-00be2975b923",
                                                                            false,
                                                                            "a11c3693-f0c7-4214-a3f5-ee23743f9465",
                                                                            "1e00709e-f65c-4eb4-89e1-b9c2bd2236e7",
                                                                            "31343260-eb53-4aeb-b891-c48bb129b875",
                                                                            com.arm.mbed.cloud.sdk.security.model.TrustedCertificateService.getDefault(),
                                                                            com.arm.mbed.cloud.sdk.security.model.TrustedCertificateStatus.getDefault(),
                                                                            "b5d07e67-6f80-46dd-b5fe-df0cc57dcf74",
                                                                            new java.util.Date(1546448719088L),
                                                                            new java.util.Date(1546448716909L));
            TrustedCertificate trustedcertificate2 = new TrustedCertificate("72dcad81-c8cd-4fb2-8453-e6ffaa4fde66",
                                                                            "2d690f1f-c653-462f-8791-a8bd73e812f0",
                                                                            "50217424-bb8a-4e61-be0d-90e6f9506836",
                                                                            new java.util.Date(1546448713563L),
                                                                            "526831ba-06c9-4271-9363-cbba336f27c2", 77,
                                                                            false,
                                                                            "d0293bc4-d87e-4d0b-909c-00be2975b923",
                                                                            false,
                                                                            "a11c3693-f0c7-4214-a3f5-ee23743f9465",
                                                                            "1e00709e-f65c-4eb4-89e1-b9c2bd2236e7",
                                                                            "31343260-eb53-4aeb-b891-c48bb129b875",
                                                                            com.arm.mbed.cloud.sdk.security.model.TrustedCertificateService.getDefault(),
                                                                            com.arm.mbed.cloud.sdk.security.model.TrustedCertificateStatus.getDefault(),
                                                                            "b5d07e67-6f80-46dd-b5fe-df0cc57dcf74",
                                                                            new java.util.Date(1546448719088L),
                                                                            new java.util.Date(1546448716909L));
            assertNotNull(trustedcertificate1);
            assertNotNull(trustedcertificate2);
            assertNotSame(trustedcertificate2, trustedcertificate1);
            assertEquals(trustedcertificate2, trustedcertificate1);
            assertEquals(trustedcertificate2.hashCode(), trustedcertificate1.hashCode());
            int hashCode = trustedcertificate1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, trustedcertificate1.hashCode());
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
            TrustedCertificate trustedcertificate1 = new TrustedCertificate("5dae5cdc-092e-4a08-858d-2740fec092e6",
                                                                            "93259cd2-f13f-4731-a355-5b739e2a191b",
                                                                            "6a1ecc9f-6177-4f15-9fa9-f3848c53e027",
                                                                            new java.util.Date(1546448715102L),
                                                                            "07e0cfea-a3c6-42aa-947c-048588504c2d", 56,
                                                                            true,
                                                                            "65770ada-b49c-4285-9b4b-77e9847e1894",
                                                                            false,
                                                                            "af7fdb52-d21d-4c85-a00a-a5b003ac8367",
                                                                            "f8b02703-9d0f-431c-bfaa-f36b8f511045",
                                                                            "da381fb2-2059-4cf1-9259-7b9d1d821693",
                                                                            com.arm.mbed.cloud.sdk.security.model.TrustedCertificateService.getDefault(),
                                                                            com.arm.mbed.cloud.sdk.security.model.TrustedCertificateStatus.getDefault(),
                                                                            "b1829435-e4da-4db3-86a3-039f26e8ce72",
                                                                            new java.util.Date(1546448714324L),
                                                                            new java.util.Date(1546448719561L));
            TrustedCertificate trustedcertificate2 = new TrustedCertificate("5dae5cdc-092e-4a08-858d-2740fec092e6",
                                                                            "93259cd2-f13f-4731-a355-5b739e2a191b",
                                                                            "6a1ecc9f-6177-4f15-9fa9-f3848c53e027",
                                                                            new java.util.Date(1546448715102L),
                                                                            "07e0cfea-a3c6-42aa-947c-048588504c2d", 56,
                                                                            true,
                                                                            "65770ada-b49c-4285-9b4b-77e9847e1894",
                                                                            false,
                                                                            "af7fdb52-d21d-4c85-a00a-a5b003ac8367",
                                                                            "f8b02703-9d0f-431c-bfaa-f36b8f511045",
                                                                            "da381fb2-2059-4cf1-9259-7b9d1d821693",
                                                                            com.arm.mbed.cloud.sdk.security.model.TrustedCertificateService.getDefault(),
                                                                            com.arm.mbed.cloud.sdk.security.model.TrustedCertificateStatus.getDefault(),
                                                                            "b1829435-e4da-4db3-86a3-039f26e8ce72",
                                                                            new java.util.Date(1546448714324L),
                                                                            new java.util.Date(1546448719561L));
            TrustedCertificate trustedcertificate3 = new TrustedCertificate("f0dcfb1c-5615-4ddc-abd3-44cf20a425b1",
                                                                            "5f9ed9b9-1e15-4a7d-bf14-909a0c12caea",
                                                                            "64838c23-f21c-4f05-b3ab-1dc378069c4c",
                                                                            new java.util.Date(1546448716037L),
                                                                            "892e057f-7bef-4236-a073-9b65e9341b7c", -34,
                                                                            false,
                                                                            "25b4da3f-1ccb-40de-8a6e-0b75eea5699d",
                                                                            true,
                                                                            "63fbf135-2d3a-49da-ad20-71b69de6f53b",
                                                                            "61740ecd-2be1-4759-a987-523d869dfa76",
                                                                            "395d1d69-7b22-4059-9d53-143a0a03a512",
                                                                            com.arm.mbed.cloud.sdk.security.model.TrustedCertificateService.getDefault(),
                                                                            com.arm.mbed.cloud.sdk.security.model.TrustedCertificateStatus.getDefault(),
                                                                            "1aaaf081-b46e-4166-9ffb-3f63596e1e99",
                                                                            new java.util.Date(1546448716611L),
                                                                            new java.util.Date(1546448712665L));
            assertNotNull(trustedcertificate1);
            assertNotNull(trustedcertificate2);
            assertNotNull(trustedcertificate3);
            assertNotSame(trustedcertificate2, trustedcertificate1);
            assertNotSame(trustedcertificate3, trustedcertificate1);
            assertEquals(trustedcertificate2, trustedcertificate1);
            assertEquals(trustedcertificate2, trustedcertificate1);
            assertEquals(trustedcertificate1, trustedcertificate2);
            assertEquals(trustedcertificate1, trustedcertificate1);
            assertFalse(trustedcertificate1.equals(null));
            assertNotEquals(trustedcertificate3, trustedcertificate1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
