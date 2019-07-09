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
            UserInvitation userinvitation1 = new UserInvitation("a5fdd8ccb79ecfcc089719469de69b9b",
                                                                new Date(1562663765389L), "30cc5.74fcd@2ab5f.fr",
                                                                new Date(1562663757467L),
                                                                "a5fdd8ccb79ecfcc089719469de69b9b", null,
                                                                new Date(1562663763398L),
                                                                "a5fdd8ccb79ecfcc089719469de69b9b");
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
            UserInvitation userinvitation1 = new UserInvitation("a5fdd8ccb79ecfcc089719469de69b9b",
                                                                new Date(1562663765496L), "d6558.02e8e@0eb57.fr",
                                                                new Date(1562663762756L),
                                                                "a5fdd8ccb79ecfcc089719469de69b9b", null,
                                                                new Date(1562663765384L),
                                                                "a5fdd8ccb79ecfcc089719469de69b9b");
            UserInvitation userinvitation2 = new UserInvitation("a5fdd8ccb79ecfcc089719469de69b9b",
                                                                new Date(1562663765496L), "d6558.02e8e@0eb57.fr",
                                                                new Date(1562663762756L),
                                                                "a5fdd8ccb79ecfcc089719469de69b9b", null,
                                                                new Date(1562663765384L),
                                                                "a5fdd8ccb79ecfcc089719469de69b9b");
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
        UserInvitation userinvitation = new UserInvitation("a5fdd8ccb79ecfcc089719469de69b9b", new Date(1562663757062L),
                                                           "96a13.666ea@57f0b.me", new Date(1562663759950L),
                                                           "a5fdd8ccb79ecfcc089719469de69b9b", null,
                                                           new Date(1562663759636L),
                                                           "a5fdd8ccb79ecfcc089719469de69b9b");
        assertTrue(userinvitation.isValid());
        UserInvitation userinvitationInvalid = new UserInvitation("\u0006O祉䩳L\u0007-\u0019$$Ꮌ<#2,%33᎟3U3\b㕧䪹S$$\u000e?3\u0016餋3\u0015GYꚃ3R\u0001᣼`2�?2\u000eਗ\u0012虰ᆊ]\u0016[?\u000f!3 @2V",
                                                                  new Date(1562663759493L), null,
                                                                  new Date(1562663762559L),
                                                                  "\u0006O祉䩳L\u0007-\u0019$$Ꮌ<#2,%33᎟3U3\b㕧䪹S$$\u000e?3\u0016餋3\u0015GYꚃ3R\u0001᣼`2�?2\u000eਗ\u0012虰ᆊ]\u0016[?\u000f!3 @2V",
                                                                  null, new Date(1562663759408L),
                                                                  "\u0006O祉䩳L\u0007-\u0019$$Ꮌ<#2,%33᎟3U3\b㕧䪹S$$\u000e?3\u0016餋3\u0015GYꚃ3R\u0001᣼`2�?2\u000eਗ\u0012虰ᆊ]\u0016[?\u000f!3 @2V");
        assertFalse(userinvitationInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            UserInvitation userinvitation1 = new UserInvitation("a5fdd8ccb79ecfcc089719469de69b9b",
                                                                new Date(1562663764185L), "f428d.3fa61@0852e.me",
                                                                new Date(1562663757766L),
                                                                "a5fdd8ccb79ecfcc089719469de69b9b", null,
                                                                new Date(1562663763986L),
                                                                "a5fdd8ccb79ecfcc089719469de69b9b");
            UserInvitation userinvitation2 = new UserInvitation("a5fdd8ccb79ecfcc089719469de69b9b",
                                                                new Date(1562663764185L), "f428d.3fa61@0852e.me",
                                                                new Date(1562663757766L),
                                                                "a5fdd8ccb79ecfcc089719469de69b9b", null,
                                                                new Date(1562663763986L),
                                                                "a5fdd8ccb79ecfcc089719469de69b9b");
            UserInvitation userinvitation3 = new UserInvitation("a5fdd8ccb79ecfcc089719469de69b9b",
                                                                new Date(1562663761069L), "10d99.fbf81@e664f.fr",
                                                                new Date(1562663756064L),
                                                                "a5fdd8ccb79ecfcc089719469de69b9b", null,
                                                                new Date(1562663765501L),
                                                                "a5fdd8ccb79ecfcc089719469de69b9b");
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
