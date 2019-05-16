// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model ParentAccount.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestParentAccount {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            ParentAccount parentaccount1 = new ParentAccount("d7a54.93741@15bf6.fr",
                                                             "2ee94e6e-8022-42e6-9423-9ff144d26e9e",
                                                             "61c6923c18efbbacbd7af9d6fa2e336c");
            ParentAccount parentaccount2 = parentaccount1.clone();
            assertNotNull(parentaccount1);
            assertNotNull(parentaccount2);
            assertNotSame(parentaccount2, parentaccount1);
            assertEquals(parentaccount2, parentaccount1);
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
            ParentAccount parentaccount1 = new ParentAccount("8aeac.1c290@fcb29.fr",
                                                             "5f43fffc-ecc9-4255-8c28-b4abb3b4439d",
                                                             "61c6923c18efbbacbd7af9d6fa2e336c");
            ParentAccount parentaccount2 = new ParentAccount("8aeac.1c290@fcb29.fr",
                                                             "5f43fffc-ecc9-4255-8c28-b4abb3b4439d",
                                                             "61c6923c18efbbacbd7af9d6fa2e336c");
            assertNotNull(parentaccount1);
            assertNotNull(parentaccount2);
            assertNotSame(parentaccount2, parentaccount1);
            assertEquals(parentaccount2, parentaccount1);
            assertEquals(parentaccount2.hashCode(), parentaccount1.hashCode());
            int hashCode = parentaccount1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, parentaccount1.hashCode());
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
        ParentAccount parentaccount = new ParentAccount("95017.609a0@db274.me", "a9a82d48-01d0-4415-8590-369cda74722e",
                                                        "61c6923c18efbbacbd7af9d6fa2e336c");
        assertTrue(parentaccount.isValid());
        ParentAccount parentaccountInvalid = new ParentAccount("ෑ显ڧ�?�\u00074麋鷄ﮋ袷觧䥽鉼 砚膖쾧飿衂�?贅諟#鑉⮆룆逸>შჹ\u0014�?鱺%Ƿի৕>�?�&⽎顲熎\u000e髡郅쉚�?�岫வ'缴�?�6̊ᆔ\u0002-",
                                                               "abf6a13b-be1f-4760-bab1-209ecc0b4a5f289846ee-d31b-42f8-afb4-fbb69d1aa83a724b025b-fa5a-4fa8-bf4a-1ddfbd27de4c",
                                                               "\u0016\f,₟$$\u001f䂊*4L445544]뇜䲭4\tJY'\u001d%䰢4魩C;\u0002(B>\u000f쯫忴?\u0016/绳55穔�?�4L5?諳\u0010뿿55?555@ :H");
        assertFalse(parentaccountInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            ParentAccount parentaccount1 = new ParentAccount("05592.25fc5@dc560.me",
                                                             "73eb34cf-9842-4524-beb2-bdfd0da0d384",
                                                             "61c6923c18efbbacbd7af9d6fa2e336c");
            ParentAccount parentaccount2 = new ParentAccount("05592.25fc5@dc560.me",
                                                             "73eb34cf-9842-4524-beb2-bdfd0da0d384",
                                                             "61c6923c18efbbacbd7af9d6fa2e336c");
            ParentAccount parentaccount3 = new ParentAccount("a7cf5.d7d6e@b2047.fr",
                                                             "df0b2708-2bfe-4520-8a0d-47577be751ce",
                                                             "61c6923c18efbbacbd7af9d6fa2e336c");
            assertNotNull(parentaccount1);
            assertNotNull(parentaccount2);
            assertNotNull(parentaccount3);
            assertNotSame(parentaccount2, parentaccount1);
            assertNotSame(parentaccount3, parentaccount1);
            assertEquals(parentaccount2, parentaccount1);
            assertEquals(parentaccount2, parentaccount1);
            assertEquals(parentaccount1, parentaccount2);
            assertEquals(parentaccount1, parentaccount1);
            assertFalse(parentaccount1.equals(null));
            assertNotEquals(parentaccount3, parentaccount1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
