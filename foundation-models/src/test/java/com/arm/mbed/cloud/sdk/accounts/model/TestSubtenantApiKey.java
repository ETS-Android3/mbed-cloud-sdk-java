// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantApiKey.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantApiKey {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantApiKey subtenantapikey1 = new SubtenantApiKey("fc91ece4c663c84ce50ea8058379fe26",
                                                                   new Date(1561477838569L), 12,
                                                                   "fc91ece4c663c84ce50ea8058379fe26",
                                                                   "c09040b2-3d55-494d-bced-1a43c3820a6a", -29,
                                                                   "f9748833-78fc-44f4-bf4d-95c7d21857f5",
                                                                   "fc91ece4c663c84ce50ea8058379fe26",
                                                                   SubtenantApiKeyStatus.getDefault(),
                                                                   new Date(1561477840054L));
            SubtenantApiKey subtenantapikey2 = subtenantapikey1.clone();
            assertNotNull(subtenantapikey1);
            assertNotNull(subtenantapikey2);
            assertNotSame(subtenantapikey2, subtenantapikey1);
            assertEquals(subtenantapikey2, subtenantapikey1);
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
            SubtenantApiKey subtenantapikey1 = new SubtenantApiKey("fc91ece4c663c84ce50ea8058379fe26",
                                                                   new Date(1561477837906L), -101,
                                                                   "fc91ece4c663c84ce50ea8058379fe26",
                                                                   "ba0ac262-5576-4c86-8cbe-d34468302a8e", -109,
                                                                   "e21ebafe-f993-4f3b-a96d-2095782010a4",
                                                                   "fc91ece4c663c84ce50ea8058379fe26",
                                                                   SubtenantApiKeyStatus.getDefault(),
                                                                   new Date(1561477840314L));
            SubtenantApiKey subtenantapikey2 = new SubtenantApiKey("fc91ece4c663c84ce50ea8058379fe26",
                                                                   new Date(1561477837906L), -101,
                                                                   "fc91ece4c663c84ce50ea8058379fe26",
                                                                   "ba0ac262-5576-4c86-8cbe-d34468302a8e", -109,
                                                                   "e21ebafe-f993-4f3b-a96d-2095782010a4",
                                                                   "fc91ece4c663c84ce50ea8058379fe26",
                                                                   SubtenantApiKeyStatus.getDefault(),
                                                                   new Date(1561477840314L));
            assertNotNull(subtenantapikey1);
            assertNotNull(subtenantapikey2);
            assertNotSame(subtenantapikey2, subtenantapikey1);
            assertEquals(subtenantapikey2, subtenantapikey1);
            assertEquals(subtenantapikey2.hashCode(), subtenantapikey1.hashCode());
            int hashCode = subtenantapikey1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantapikey1.hashCode());
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
        SubtenantApiKey subtenantapikey = new SubtenantApiKey("fc91ece4c663c84ce50ea8058379fe26",
                                                              new Date(1561477833558L), 75,
                                                              "fc91ece4c663c84ce50ea8058379fe26",
                                                              "29bcaaa4-ffac-4486-9335-3ae0282e8bd3", -126,
                                                              "3cb18c57-9a70-4126-9c4f-4f25faec8aa2",
                                                              "fc91ece4c663c84ce50ea8058379fe26",
                                                              SubtenantApiKeyStatus.getDefault(),
                                                              new Date(1561477840937L));
        assertTrue(subtenantapikey.isValid());
        SubtenantApiKey subtenantapikeyInvalid = new SubtenantApiKey(null, new Date(1561477833201L), -105,
                                                                     "\u001ed玿Z쒤㸃▦&'d\\\\d=/\u0001b]b冑쟄ddbbb@\u0019dd_:bd\u0014G,dd+\\\\dbbbE`涮b\u0013粔AUbbbK襊\bO>db",
                                                                     "cd1bdbe1-98cd-4873-ab5c-2b14aa86c6f2", -6, null,
                                                                     "\u001ed玿Z쒤㸃▦&'d\\\\d=/\u0001b]b冑쟄ddbbb@\u0019dd_:bd\u0014G,dd+\\\\dbbbE`涮b\u0013粔AUbbbK襊\bO>db",
                                                                     SubtenantApiKeyStatus.getDefault(),
                                                                     new Date(1561477835262L));
        assertFalse(subtenantapikeyInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            SubtenantApiKey subtenantapikey1 = new SubtenantApiKey("fc91ece4c663c84ce50ea8058379fe26",
                                                                   new Date(1561477841245L), 30,
                                                                   "fc91ece4c663c84ce50ea8058379fe26",
                                                                   "498379bb-7b77-4fd1-a40a-bf0fa0ff34db", 43,
                                                                   "6f919532-4cf9-4dfe-ae31-5a0d6da7080a",
                                                                   "fc91ece4c663c84ce50ea8058379fe26",
                                                                   SubtenantApiKeyStatus.getDefault(),
                                                                   new Date(1561477833470L));
            SubtenantApiKey subtenantapikey2 = new SubtenantApiKey("fc91ece4c663c84ce50ea8058379fe26",
                                                                   new Date(1561477841245L), 30,
                                                                   "fc91ece4c663c84ce50ea8058379fe26",
                                                                   "498379bb-7b77-4fd1-a40a-bf0fa0ff34db", 43,
                                                                   "6f919532-4cf9-4dfe-ae31-5a0d6da7080a",
                                                                   "fc91ece4c663c84ce50ea8058379fe26",
                                                                   SubtenantApiKeyStatus.getDefault(),
                                                                   new Date(1561477833470L));
            SubtenantApiKey subtenantapikey3 = new SubtenantApiKey("fc91ece4c663c84ce50ea8058379fe26",
                                                                   new Date(1561477840977L), -105,
                                                                   "fc91ece4c663c84ce50ea8058379fe26",
                                                                   "bf7ca7f8-00a0-4566-a721-d2a152332d47", -104,
                                                                   "22968649-9d12-48e6-be73-c3302ede95b0",
                                                                   "fc91ece4c663c84ce50ea8058379fe26",
                                                                   SubtenantApiKeyStatus.getDefault(),
                                                                   new Date(1561477833783L));
            assertNotNull(subtenantapikey1);
            assertNotNull(subtenantapikey2);
            assertNotNull(subtenantapikey3);
            assertNotSame(subtenantapikey2, subtenantapikey1);
            assertNotSame(subtenantapikey3, subtenantapikey1);
            assertEquals(subtenantapikey2, subtenantapikey1);
            assertEquals(subtenantapikey2, subtenantapikey1);
            assertEquals(subtenantapikey1, subtenantapikey2);
            assertEquals(subtenantapikey1, subtenantapikey1);
            assertFalse(subtenantapikey1.equals(null));
            assertNotEquals(subtenantapikey3, subtenantapikey1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
