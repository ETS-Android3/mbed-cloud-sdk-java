// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model SubtenantLightThemeColorReference.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantLightThemeColorReference {
    /**
     * Tests the getValue method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testGetValue() {
        try {
            SubtenantLightThemeColorReference subtenantlightthemecolorreference = SubtenantLightThemeColorReference.getValue(null);
            assertNotNull(subtenantlightthemecolorreference);
            assertTrue(subtenantlightthemecolorreference.isDefault());
            subtenantlightthemecolorreference = SubtenantLightThemeColorReference.getValue(SubtenantLightThemeColorReference.getDefault()
                                                                                                                            .getString());
            assertNotNull(subtenantlightthemecolorreference);
            assertTrue(subtenantlightthemecolorreference.isDefault());
            subtenantlightthemecolorreference = SubtenantLightThemeColorReference.getValue("CANVAS_BACKGROUND");
            assertNotNull(subtenantlightthemecolorreference);
            assertTrue(subtenantlightthemecolorreference.isDefault());
            subtenantlightthemecolorreference = SubtenantLightThemeColorReference.getValue("canvas_background_font_color");
            assertNotNull(subtenantlightthemecolorreference);
            assertFalse(subtenantlightthemecolorreference.isDefault());
            subtenantlightthemecolorreference = SubtenantLightThemeColorReference.getValue("4efb94e1-0280-4256-b98d-36807486c660");
            assertNotNull(subtenantlightthemecolorreference);
            assertTrue(subtenantlightthemecolorreference.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
