// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model UserInvitation.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestUserInvitation {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            UserInvitation userinvitation1 = new UserInvitation("e51a609dbd6e0d1c3d5bbabcaedbd2eb",
                                                                new Date(1559150278848L), "9aba7.1f753@18e1e.fr",
                                                                new Date(1559150275388L),
                                                                "e51a609dbd6e0d1c3d5bbabcaedbd2eb", null,
                                                                new Date(1559150278467L),
                                                                "e51a609dbd6e0d1c3d5bbabcaedbd2eb");
            UserInvitation userinvitation2 = userinvitation1.clone();
            assertNotNull(userinvitation1);
            assertNotNull(userinvitation2);
            assertNotSame(userinvitation2, userinvitation1);
            assertEquals(userinvitation2, userinvitation1);
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
            UserInvitation userinvitation1 = new UserInvitation("e51a609dbd6e0d1c3d5bbabcaedbd2eb",
                                                                new Date(1559150278921L), "0d849.00fbd@05d86.fr",
                                                                new Date(1559150272443L),
                                                                "e51a609dbd6e0d1c3d5bbabcaedbd2eb", null,
                                                                new Date(1559150272054L),
                                                                "e51a609dbd6e0d1c3d5bbabcaedbd2eb");
            UserInvitation userinvitation2 = new UserInvitation("e51a609dbd6e0d1c3d5bbabcaedbd2eb",
                                                                new Date(1559150278921L), "0d849.00fbd@05d86.fr",
                                                                new Date(1559150272443L),
                                                                "e51a609dbd6e0d1c3d5bbabcaedbd2eb", null,
                                                                new Date(1559150272054L),
                                                                "e51a609dbd6e0d1c3d5bbabcaedbd2eb");
            assertNotNull(userinvitation1);
            assertNotNull(userinvitation2);
            assertNotSame(userinvitation2, userinvitation1);
            assertEquals(userinvitation2, userinvitation1);
            assertEquals(userinvitation2.hashCode(), userinvitation1.hashCode());
            int hashCode = userinvitation1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, userinvitation1.hashCode());
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
        UserInvitation userinvitation = new UserInvitation("e51a609dbd6e0d1c3d5bbabcaedbd2eb", new Date(1559150276930L),
                                                           "acf40.a22ff@0a890.me", new Date(1559150279119L),
                                                           "e51a609dbd6e0d1c3d5bbabcaedbd2eb", null,
                                                           new Date(1559150270624L),
                                                           "e51a609dbd6e0d1c3d5bbabcaedbd2eb");
        assertTrue(userinvitation.isValid());
        UserInvitation userinvitationInvalid = new UserInvitation("�?�44\t48)87\u000578檶Y8ज⭃\\\\8;M4[4Y7U7@7祓?ᅼ? 788?44E쎯臿?㉟`7㋑㘞7縦!8J744朷㦫48",
                                                                  new Date(1559150272069L), null,
                                                                  new Date(1559150278597L),
                                                                  "�?�44\t48)87\u000578檶Y8ज⭃\\\\8;M4[4Y7U7@7祓?ᅼ? 788?44E쎯臿?㉟`7㋑㘞7縦!8J744朷㦫48",
                                                                  null, new Date(1559150273138L),
                                                                  "�?�44\t48)87\u000578檶Y8ज⭃\\\\8;M4[4Y7U7@7祓?ᅼ? 788?44E쎯臿?㉟`7㋑㘞7縦!8J744朷㦫48");
        assertFalse(userinvitationInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            UserInvitation userinvitation1 = new UserInvitation("e51a609dbd6e0d1c3d5bbabcaedbd2eb",
                                                                new Date(1559150274610L), "4cf3e.b5238@5232a.me",
                                                                new Date(1559150272239L),
                                                                "e51a609dbd6e0d1c3d5bbabcaedbd2eb", null,
                                                                new Date(1559150272089L),
                                                                "e51a609dbd6e0d1c3d5bbabcaedbd2eb");
            UserInvitation userinvitation2 = new UserInvitation("e51a609dbd6e0d1c3d5bbabcaedbd2eb",
                                                                new Date(1559150274610L), "4cf3e.b5238@5232a.me",
                                                                new Date(1559150272239L),
                                                                "e51a609dbd6e0d1c3d5bbabcaedbd2eb", null,
                                                                new Date(1559150272089L),
                                                                "e51a609dbd6e0d1c3d5bbabcaedbd2eb");
            UserInvitation userinvitation3 = new UserInvitation("e51a609dbd6e0d1c3d5bbabcaedbd2eb",
                                                                new Date(1559150273749L), "59927.8b21c@a983f.me",
                                                                new Date(1559150271606L),
                                                                "e51a609dbd6e0d1c3d5bbabcaedbd2eb", null,
                                                                new Date(1559150278774L),
                                                                "e51a609dbd6e0d1c3d5bbabcaedbd2eb");
            assertNotNull(userinvitation1);
            assertNotNull(userinvitation2);
            assertNotNull(userinvitation3);
            assertNotSame(userinvitation2, userinvitation1);
            assertNotSame(userinvitation3, userinvitation1);
            assertEquals(userinvitation2, userinvitation1);
            assertEquals(userinvitation2, userinvitation1);
            assertEquals(userinvitation1, userinvitation2);
            assertEquals(userinvitation1, userinvitation1);
            assertFalse(userinvitation1.equals(null));
            assertNotEquals(userinvitation3, userinvitation1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
