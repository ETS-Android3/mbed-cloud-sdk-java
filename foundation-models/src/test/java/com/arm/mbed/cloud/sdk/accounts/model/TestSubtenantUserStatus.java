// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model SubtenantUserStatus.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantUserStatus {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            SubtenantUserStatus subtenantuserstatus = SubtenantUserStatus.getValue(null);
            assertNotNull(subtenantuserstatus);
            assertTrue(subtenantuserstatus.isDefault());
            subtenantuserstatus = SubtenantUserStatus.getValue(SubtenantUserStatus.getDefault().getString());
            assertNotNull(subtenantuserstatus);
            assertTrue(subtenantuserstatus.isDefault());
            subtenantuserstatus = SubtenantUserStatus.getValue("ACTIVE");
            assertNotNull(subtenantuserstatus);
            assertTrue(subtenantuserstatus.isDefault());
            subtenantuserstatus = SubtenantUserStatus.getValue("ENROLLING");
            assertNotNull(subtenantuserstatus);
            assertFalse(subtenantuserstatus.isDefault());
            subtenantuserstatus = SubtenantUserStatus.getValue("671309df-b19f-42cc-96ac-91c494295479");
            assertNotNull(subtenantuserstatus);
            assertTrue(subtenantuserstatus.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
