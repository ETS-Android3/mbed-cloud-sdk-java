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
            UserInvitation userinvitation1 = new UserInvitation("61c6923c18efbbacbd7af9d6fa2e336c",
                                                                new Date(1558018689476L), "d720f.747f8@c4c7e.fr",
                                                                new Date(1558018689540L),
                                                                "61c6923c18efbbacbd7af9d6fa2e336c", null,
                                                                new Date(1558018690608L),
                                                                "61c6923c18efbbacbd7af9d6fa2e336c");
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
            UserInvitation userinvitation1 = new UserInvitation("61c6923c18efbbacbd7af9d6fa2e336c",
                                                                new Date(1558018688321L), "936c5.a20f8@7423e.me",
                                                                new Date(1558018686625L),
                                                                "61c6923c18efbbacbd7af9d6fa2e336c", null,
                                                                new Date(1558018687847L),
                                                                "61c6923c18efbbacbd7af9d6fa2e336c");
            UserInvitation userinvitation2 = new UserInvitation("61c6923c18efbbacbd7af9d6fa2e336c",
                                                                new Date(1558018688321L), "936c5.a20f8@7423e.me",
                                                                new Date(1558018686625L),
                                                                "61c6923c18efbbacbd7af9d6fa2e336c", null,
                                                                new Date(1558018687847L),
                                                                "61c6923c18efbbacbd7af9d6fa2e336c");
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
        UserInvitation userinvitation = new UserInvitation("61c6923c18efbbacbd7af9d6fa2e336c", new Date(1558018691094L),
                                                           "5cfa5.27fd7@eef22.fr", new Date(1558018690343L),
                                                           "61c6923c18efbbacbd7af9d6fa2e336c", null,
                                                           new Date(1558018686329L),
                                                           "61c6923c18efbbacbd7af9d6fa2e336c");
        assertTrue(userinvitation.isValid());
        UserInvitation userinvitationInvalid = new UserInvitation("\u0016\f,₟$$\u001f䂊*4L445544]뇜䲭4\tJY'\u001d%䰢4魩C;\u0002(B>\u000f쯫忴?\u0016/绳55穔�?�4L5?諳\u0010뿿55?555@ :H",
                                                                  new Date(1558018689896L), null,
                                                                  new Date(1558018685156L),
                                                                  "\u0016\f,₟$$\u001f䂊*4L445544]뇜䲭4\tJY'\u001d%䰢4魩C;\u0002(B>\u000f쯫忴?\u0016/绳55穔�?�4L5?諳\u0010뿿55?555@ :H",
                                                                  null, new Date(1558018692061L),
                                                                  "\u0016\f,₟$$\u001f䂊*4L445544]뇜䲭4\tJY'\u001d%䰢4魩C;\u0002(B>\u000f쯫忴?\u0016/绳55穔�?�4L5?諳\u0010뿿55?555@ :H");
        assertFalse(userinvitationInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            UserInvitation userinvitation1 = new UserInvitation("61c6923c18efbbacbd7af9d6fa2e336c",
                                                                new Date(1558018686231L), "40a44.66387@26745.me",
                                                                new Date(1558018688961L),
                                                                "61c6923c18efbbacbd7af9d6fa2e336c", null,
                                                                new Date(1558018692555L),
                                                                "61c6923c18efbbacbd7af9d6fa2e336c");
            UserInvitation userinvitation2 = new UserInvitation("61c6923c18efbbacbd7af9d6fa2e336c",
                                                                new Date(1558018686231L), "40a44.66387@26745.me",
                                                                new Date(1558018688961L),
                                                                "61c6923c18efbbacbd7af9d6fa2e336c", null,
                                                                new Date(1558018692555L),
                                                                "61c6923c18efbbacbd7af9d6fa2e336c");
            UserInvitation userinvitation3 = new UserInvitation("61c6923c18efbbacbd7af9d6fa2e336c",
                                                                new Date(1558018686451L), "eb0a4.80b2e@9daac.fr",
                                                                new Date(1558018690364L),
                                                                "61c6923c18efbbacbd7af9d6fa2e336c", null,
                                                                new Date(1558018688381L),
                                                                "61c6923c18efbbacbd7af9d6fa2e336c");
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
