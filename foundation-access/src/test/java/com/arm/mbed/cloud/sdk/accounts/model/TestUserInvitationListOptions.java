// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model UserInvitationListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestUserInvitationListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            UserInvitationListOptions userinvitationlistoptions1 = new UserInvitationListOptions(Integer.valueOf(-12),
                                                                                                 Long.valueOf(45),
                                                                                                 Order.getDefault(),
                                                                                                 "f71b4261-f4f6-41a1-84ad-2d067203e23d",
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
     * Tests the filters method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testFilters() {
        try {
            // Cannot test Filter [field=loginProfiles, spec field=loginProfiles, tag=TAG_FILTER_BY_LOGIN_PROFILES,
            // operator=equal to, type=List<LoginProfile>, isVerified=true] because the field is a list and the filter
            // only accepts single values
            UserInvitationListOptions option = new UserInvitationListOptions();
            assertFalse(option.hasFilters());
            // Cannot test Filter [field=loginProfiles, spec field=loginProfiles, tag=TAG_FILTER_BY_LOGIN_PROFILES,
            // operator=equal to, type=List<LoginProfile>, isVerified=true] because the field is a list and the filter
            // only accepts single values
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
            UserInvitationListOptions userinvitationlistoptions1 = new UserInvitationListOptions(Integer.valueOf(91),
                                                                                                 Long.valueOf(-22),
                                                                                                 Order.getDefault(),
                                                                                                 "cfe0befc-f619-41e7-9434-161095ca84f0",
                                                                                                 null, null);
            UserInvitationListOptions userinvitationlistoptions2 = new UserInvitationListOptions(Integer.valueOf(91),
                                                                                                 Long.valueOf(-22),
                                                                                                 Order.getDefault(),
                                                                                                 "cfe0befc-f619-41e7-9434-161095ca84f0",
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
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            UserInvitationListOptions userinvitationlistoptions1 = new UserInvitationListOptions(Integer.valueOf(-82),
                                                                                                 Long.valueOf(76),
                                                                                                 Order.getDefault(),
                                                                                                 "fc794cec-78ad-4464-9c55-0910a0959b9d",
                                                                                                 null, null);
            UserInvitationListOptions userinvitationlistoptions2 = new UserInvitationListOptions(Integer.valueOf(-82),
                                                                                                 Long.valueOf(76),
                                                                                                 Order.getDefault(),
                                                                                                 "fc794cec-78ad-4464-9c55-0910a0959b9d",
                                                                                                 null, null);
            UserInvitationListOptions userinvitationlistoptions3 = new UserInvitationListOptions(Integer.valueOf(43),
                                                                                                 Long.valueOf(21),
                                                                                                 Order.getDefault(),
                                                                                                 "670f89e4-9d48-4cda-a574-705bb07e6f23",
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
