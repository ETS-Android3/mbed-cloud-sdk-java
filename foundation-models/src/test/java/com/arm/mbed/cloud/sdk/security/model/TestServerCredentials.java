// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model ServerCredentials.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestServerCredentials {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            ServerCredentials servercredentials1 = new ServerCredentials(new Date(1562663764124L),
                                                                         "6c22a9c0-481e-432b-b6ec-a740754789fc",
                                                                         "1b7c9a41-1fbc-4c74-99e0-921314eff847",
                                                                         "de1235f9-8222-407e-9219-dded1360e01f");
            ServerCredentials servercredentials2 = servercredentials1.clone();
            assertNotNull(servercredentials1);
            assertNotNull(servercredentials2);
            assertNotSame(servercredentials2, servercredentials1);
            assertEquals(servercredentials2, servercredentials1);
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
            ServerCredentials servercredentials1 = new ServerCredentials(new Date(1562663764415L),
                                                                         "80009c4e-ebd9-4ab8-8499-dc644144418a",
                                                                         "06786f93-6f4e-4548-9104-192e75efde54",
                                                                         "4daeb830-8e9a-456a-8df1-caaaf97396e2");
            ServerCredentials servercredentials2 = new ServerCredentials(new Date(1562663764415L),
                                                                         "80009c4e-ebd9-4ab8-8499-dc644144418a",
                                                                         "06786f93-6f4e-4548-9104-192e75efde54",
                                                                         "4daeb830-8e9a-456a-8df1-caaaf97396e2");
            assertNotNull(servercredentials1);
            assertNotNull(servercredentials2);
            assertNotSame(servercredentials2, servercredentials1);
            assertEquals(servercredentials2, servercredentials1);
            assertEquals(servercredentials2.hashCode(), servercredentials1.hashCode());
            int hashCode = servercredentials1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, servercredentials1.hashCode());
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
        ServerCredentials servercredentials = new ServerCredentials(new Date(1562663765994L),
                                                                    "52499503-2726-47b3-8d90-7b3dab05bdfb",
                                                                    "4aeee294-ee98-4791-9145-474ccd9dc625",
                                                                    "93035368-caaf-47b0-9f3d-3a525e70fa5e");
        assertTrue(servercredentials.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            ServerCredentials servercredentials1 = new ServerCredentials(new Date(1562663757562L),
                                                                         "d2c55d69-dcbe-4d16-a8a1-94cf9cd4cc0e",
                                                                         "6554e163-607d-43fd-9ba2-6d216b5602e2",
                                                                         "fd8960bb-7fe1-49bc-b0bc-99ef63e0adbe");
            ServerCredentials servercredentials2 = new ServerCredentials(new Date(1562663757562L),
                                                                         "d2c55d69-dcbe-4d16-a8a1-94cf9cd4cc0e",
                                                                         "6554e163-607d-43fd-9ba2-6d216b5602e2",
                                                                         "fd8960bb-7fe1-49bc-b0bc-99ef63e0adbe");
            ServerCredentials servercredentials3 = new ServerCredentials(new Date(1562663762664L),
                                                                         "9c3d9bba-aca4-49f2-9cd6-9e0ace7eae17",
                                                                         "a0172cf1-3105-4a11-92e9-d104652c662f",
                                                                         "3d6b5ee1-d88c-44c3-b055-8b31206b5e91");
            assertNotNull(servercredentials1);
            assertNotNull(servercredentials2);
            assertNotNull(servercredentials3);
            assertNotSame(servercredentials2, servercredentials1);
            assertNotSame(servercredentials3, servercredentials1);
            assertEquals(servercredentials2, servercredentials1);
            assertEquals(servercredentials2, servercredentials1);
            assertEquals(servercredentials1, servercredentials2);
            assertEquals(servercredentials1, servercredentials1);
            assertFalse(servercredentials1.equals(null));
            assertNotEquals(servercredentials3, servercredentials1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
