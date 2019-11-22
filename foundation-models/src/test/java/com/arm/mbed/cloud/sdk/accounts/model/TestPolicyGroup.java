// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model PolicyGroup.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestPolicyGroup {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            PolicyGroup policygroup1 = new PolicyGroup("5aac302d4dc51de8d52d8348d01b06c5", -62,
                                                       new Date(1567417606896L), "5aac302d4dc51de8d52d8348d01b06c5",
                                                       "9371a23a-0979-4f8c-b5ce-d2263ca36147", new Date(1567417604986L),
                                                       -109);
            PolicyGroup policygroup2 = policygroup1.clone();
            assertNotNull(policygroup1);
            assertNotNull(policygroup2);
            assertNotSame(policygroup2, policygroup1);
            assertEquals(policygroup2, policygroup1);
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
            PolicyGroup policygroup1 = new PolicyGroup("5aac302d4dc51de8d52d8348d01b06c5", -98,
                                                       new Date(1567417607917L), "5aac302d4dc51de8d52d8348d01b06c5",
                                                       "9da854de-5316-4caa-92df-a86143ca4f82", new Date(1567417600767L),
                                                       71);
            PolicyGroup policygroup2 = new PolicyGroup("5aac302d4dc51de8d52d8348d01b06c5", -98,
                                                       new Date(1567417607917L), "5aac302d4dc51de8d52d8348d01b06c5",
                                                       "9da854de-5316-4caa-92df-a86143ca4f82", new Date(1567417600767L),
                                                       71);
            assertNotNull(policygroup1);
            assertNotNull(policygroup2);
            assertNotSame(policygroup2, policygroup1);
            assertEquals(policygroup2, policygroup1);
            assertEquals(policygroup2.hashCode(), policygroup1.hashCode());
            int hashCode = policygroup1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, policygroup1.hashCode());
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
        PolicyGroup policygroup = new PolicyGroup("5aac302d4dc51de8d52d8348d01b06c5", -74, new Date(1567417602640L),
                                                  "5aac302d4dc51de8d52d8348d01b06c5",
                                                  "e5aa277e-6283-42a8-89e8-322063b47375", new Date(1567417606031L),
                                                  -79);
        assertTrue(policygroup.isValid());
        PolicyGroup policygroupInvalid = new PolicyGroup("@77_7\u0015�?�\u00037\u0002A⚻7\u000e_Z7LT7-;\u000377!<\u0004+Fﭸ7?\u000f_9B\u001b拨\u0011\u0014\u0014ᬾV\b7]>:7㚧졎\f\u0001\u0011`R)7滹\u0019",
                                                         121, new Date(1567417603195L),
                                                         "@77_7\u0015�?�\u00037\u0002A⚻7\u000e_Z7LT7-;\u000377!<\u0004+Fﭸ7?\u000f_9B\u001b拨\u0011\u0014\u0014ᬾV\b7]>:7㚧졎\f\u0001\u0011`R)7滹\u0019",
                                                         "c842b183-680f-4f84-a9f5-1b81d55df969cad3bdff-4862-49da-a515-2d508640812678b12276-af3e-4c97-8e77-72b9a3ae2a75",
                                                         new Date(1567417606781L), -118);
        assertFalse(policygroupInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            PolicyGroup policygroup1 = new PolicyGroup("5aac302d4dc51de8d52d8348d01b06c5", -83,
                                                       new Date(1567417609473L), "5aac302d4dc51de8d52d8348d01b06c5",
                                                       "207767a8-8364-457d-9bcc-38133be0368c", new Date(1567417609975L),
                                                       94);
            PolicyGroup policygroup2 = new PolicyGroup("5aac302d4dc51de8d52d8348d01b06c5", -83,
                                                       new Date(1567417609473L), "5aac302d4dc51de8d52d8348d01b06c5",
                                                       "207767a8-8364-457d-9bcc-38133be0368c", new Date(1567417609975L),
                                                       94);
            PolicyGroup policygroup3 = new PolicyGroup("5aac302d4dc51de8d52d8348d01b06c5", 18, new Date(1567417603642L),
                                                       "5aac302d4dc51de8d52d8348d01b06c5",
                                                       "6b11252a-1817-483c-9441-e4f27f1560fb", new Date(1567417609587L),
                                                       -17);
            assertNotNull(policygroup1);
            assertNotNull(policygroup2);
            assertNotNull(policygroup3);
            assertNotSame(policygroup2, policygroup1);
            assertNotSame(policygroup3, policygroup1);
            assertEquals(policygroup2, policygroup1);
            assertEquals(policygroup2, policygroup1);
            assertEquals(policygroup1, policygroup2);
            assertEquals(policygroup1, policygroup1);
            assertFalse(policygroup1.equals(null));
            assertNotEquals(policygroup3, policygroup1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
