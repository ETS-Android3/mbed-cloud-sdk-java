// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantUserInvitation.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantUserInvitation {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantUserInvitation subtenantuserinvitation1 = new SubtenantUserInvitation("e2829cf2-79b2-49e0-bad5-15e782a8a496",
                                                                                           new Date(1553013210416L),
                                                                                           "5bfd1dc3-d522-40db-937c-10f0444d7404",
                                                                                           new Date(1553013214016L),
                                                                                           "e34d05e0-19bf-46a4-b228-abd778f821ee",
                                                                                           null,
                                                                                           new Date(1553013211460L),
                                                                                           "7409939d-f5ca-4a7d-9f88-ea71c9d58498");
            SubtenantUserInvitation subtenantuserinvitation2 = subtenantuserinvitation1.clone();
            assertNotNull(subtenantuserinvitation1);
            assertNotNull(subtenantuserinvitation2);
            assertNotSame(subtenantuserinvitation2, subtenantuserinvitation1);
            assertEquals(subtenantuserinvitation2, subtenantuserinvitation1);
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
            SubtenantUserInvitation subtenantuserinvitation1 = new SubtenantUserInvitation("c07656b4-bb4c-4d64-9c77-44bd4525e3ca",
                                                                                           new Date(1553013208307L),
                                                                                           "9fd1f437-67a5-4b10-b4a3-9b5e5cc44537",
                                                                                           new Date(1553013211204L),
                                                                                           "a70a9ca7-4540-43fe-aae9-bd5c6f991180",
                                                                                           null,
                                                                                           new Date(1553013210881L),
                                                                                           "0ccf481c-8b6a-4d3c-a305-8cd50ebc3c41");
            SubtenantUserInvitation subtenantuserinvitation2 = new SubtenantUserInvitation("c07656b4-bb4c-4d64-9c77-44bd4525e3ca",
                                                                                           new Date(1553013208307L),
                                                                                           "9fd1f437-67a5-4b10-b4a3-9b5e5cc44537",
                                                                                           new Date(1553013211204L),
                                                                                           "a70a9ca7-4540-43fe-aae9-bd5c6f991180",
                                                                                           null,
                                                                                           new Date(1553013210881L),
                                                                                           "0ccf481c-8b6a-4d3c-a305-8cd50ebc3c41");
            assertNotNull(subtenantuserinvitation1);
            assertNotNull(subtenantuserinvitation2);
            assertNotSame(subtenantuserinvitation2, subtenantuserinvitation1);
            assertEquals(subtenantuserinvitation2, subtenantuserinvitation1);
            assertEquals(subtenantuserinvitation2.hashCode(), subtenantuserinvitation1.hashCode());
            int hashCode = subtenantuserinvitation1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantuserinvitation1.hashCode());
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
        SubtenantUserInvitation subtenantuserinvitation = new SubtenantUserInvitation("a079b865-6a74-497e-89a6-9c331d8e7691",
                                                                                      new Date(1553013213503L),
                                                                                      "9b91783c-61fe-42db-abad-97f84b412488",
                                                                                      new Date(1553013209723L),
                                                                                      "3abba019-b339-4fce-8db7-86c9c06c3867",
                                                                                      null, new Date(1553013213120L),
                                                                                      "a3d1e321-0053-4626-965d-f915e8506a30");
        assertTrue(subtenantuserinvitation.isValid());
        SubtenantUserInvitation subtenantuserinvitationInvalid = new SubtenantUserInvitation(null,
                                                                                             new Date(1553013207617L),
                                                                                             null,
                                                                                             new Date(1553013211822L),
                                                                                             "15089edf-aed3-42b4-a355-5971e761fda8",
                                                                                             null,
                                                                                             new Date(1553013215080L),
                                                                                             "ebf814bf-82db-4d08-8cd9-33a6efb375b4");
        assertFalse(subtenantuserinvitationInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            SubtenantUserInvitation subtenantuserinvitation1 = new SubtenantUserInvitation("d5194225-dbdd-4f18-9079-84cf970d77d1",
                                                                                           new Date(1553013215509L),
                                                                                           "60d863cd-24c3-4fcc-b7c2-325daf63194d",
                                                                                           new Date(1553013211063L),
                                                                                           "1774e733-97bb-445c-a5cf-18ebe7184d74",
                                                                                           null,
                                                                                           new Date(1553013208119L),
                                                                                           "d6a11fd6-5654-40fa-87e6-9d1125b98c78");
            SubtenantUserInvitation subtenantuserinvitation2 = new SubtenantUserInvitation("d5194225-dbdd-4f18-9079-84cf970d77d1",
                                                                                           new Date(1553013215509L),
                                                                                           "60d863cd-24c3-4fcc-b7c2-325daf63194d",
                                                                                           new Date(1553013211063L),
                                                                                           "1774e733-97bb-445c-a5cf-18ebe7184d74",
                                                                                           null,
                                                                                           new Date(1553013208119L),
                                                                                           "d6a11fd6-5654-40fa-87e6-9d1125b98c78");
            SubtenantUserInvitation subtenantuserinvitation3 = new SubtenantUserInvitation("46e2f8b8-4297-49d4-9921-28005ff4e858",
                                                                                           new Date(1553013212149L),
                                                                                           "e8c9327f-17c7-4b70-b6b7-de8cc54753a5",
                                                                                           new Date(1553013215634L),
                                                                                           "a950fd1b-91b2-4fd6-a150-eef194d92806",
                                                                                           null,
                                                                                           new Date(1553013214098L),
                                                                                           "581befe1-7998-463c-a84b-cab6a1735180");
            assertNotNull(subtenantuserinvitation1);
            assertNotNull(subtenantuserinvitation2);
            assertNotNull(subtenantuserinvitation3);
            assertNotSame(subtenantuserinvitation2, subtenantuserinvitation1);
            assertNotSame(subtenantuserinvitation3, subtenantuserinvitation1);
            assertEquals(subtenantuserinvitation2, subtenantuserinvitation1);
            assertEquals(subtenantuserinvitation2, subtenantuserinvitation1);
            assertEquals(subtenantuserinvitation1, subtenantuserinvitation2);
            assertEquals(subtenantuserinvitation1, subtenantuserinvitation1);
            assertFalse(subtenantuserinvitation1.equals(null));
            assertNotEquals(subtenantuserinvitation3, subtenantuserinvitation1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
