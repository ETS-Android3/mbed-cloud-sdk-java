// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model UserInvitationListOptions.
 */
public class TestUserInvitationListOptions {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        try {
            UserInvitationListOptions userinvitationlistoptions1 = new UserInvitationListOptions(Integer.valueOf(72),
                                                                                                 Long.valueOf(96),
                                                                                                 Order.getDefault(),
                                                                                                 "b8e35540-da1a-44c6-8ef3-a8f2ab2bf9b0",
                                                                                                 null, null);
            UserInvitationListOptions userinvitationlistoptions2 = userinvitationlistoptions1.clone();
            assertNotNull(userinvitationlistoptions1);
            assertNotNull(userinvitationlistoptions2);
            assertNotSame(userinvitationlistoptions2, userinvitationlistoptions1);
            assertEquals(userinvitationlistoptions2, userinvitationlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashCode() {
        try {
            UserInvitationListOptions userinvitationlistoptions1 = new UserInvitationListOptions(Integer.valueOf(-103),
                                                                                                 Long.valueOf(36),
                                                                                                 Order.getDefault(),
                                                                                                 "0fd9e069-b49a-476f-bf7a-18fa43c37d24",
                                                                                                 null, null);
            UserInvitationListOptions userinvitationlistoptions2 = new UserInvitationListOptions(Integer.valueOf(-103),
                                                                                                 Long.valueOf(36),
                                                                                                 Order.getDefault(),
                                                                                                 "0fd9e069-b49a-476f-bf7a-18fa43c37d24",
                                                                                                 null, null);
            assertNotNull(userinvitationlistoptions1);
            assertNotNull(userinvitationlistoptions2);
            assertNotSame(userinvitationlistoptions2, userinvitationlistoptions1);
            assertEquals(userinvitationlistoptions2, userinvitationlistoptions1);
            assertEquals(userinvitationlistoptions2.hashCode(), userinvitationlistoptions1.hashCode());
            int hashCode = userinvitationlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, userinvitationlistoptions1.hashCode());
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
            UserInvitationListOptions userinvitationlistoptions1 = new UserInvitationListOptions(Integer.valueOf(-12),
                                                                                                 Long.valueOf(42),
                                                                                                 Order.getDefault(),
                                                                                                 "ce6dd13a-4c86-4858-865f-d7da8be54b82",
                                                                                                 null, null);
            UserInvitationListOptions userinvitationlistoptions2 = new UserInvitationListOptions(Integer.valueOf(-12),
                                                                                                 Long.valueOf(42),
                                                                                                 Order.getDefault(),
                                                                                                 "ce6dd13a-4c86-4858-865f-d7da8be54b82",
                                                                                                 null, null);
            UserInvitationListOptions userinvitationlistoptions3 = new UserInvitationListOptions(Integer.valueOf(-43),
                                                                                                 Long.valueOf(-33),
                                                                                                 Order.getDefault(),
                                                                                                 "b647bf08-16b0-49f3-b614-83c7aa9da651",
                                                                                                 null, null);
            assertNotNull(userinvitationlistoptions1);
            assertNotNull(userinvitationlistoptions2);
            assertNotNull(userinvitationlistoptions3);
            assertNotSame(userinvitationlistoptions2, userinvitationlistoptions1);
            assertNotSame(userinvitationlistoptions3, userinvitationlistoptions1);
            assertEquals(userinvitationlistoptions2, userinvitationlistoptions1);
            assertEquals(userinvitationlistoptions2, userinvitationlistoptions1);
            assertEquals(userinvitationlistoptions1, userinvitationlistoptions2);
            assertEquals(userinvitationlistoptions1, userinvitationlistoptions1);
            assertFalse(userinvitationlistoptions1.equals(null));
            assertNotEquals(userinvitationlistoptions3, userinvitationlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
