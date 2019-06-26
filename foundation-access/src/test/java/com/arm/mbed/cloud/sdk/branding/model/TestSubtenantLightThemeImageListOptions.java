// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantLightThemeImageListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantLightThemeImageListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions1 = new SubtenantLightThemeImageListOptions(Integer.valueOf(-79),
                                                                                                                               Long.valueOf(-122),
                                                                                                                               Order.getDefault(),
                                                                                                                               "1f54265a-86db-49d9-aa75-989cb8c251f0",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions2 = subtenantlightthemeimagelistoptions1.clone();
            assertNotNull(subtenantlightthemeimagelistoptions1);
            assertNotNull(subtenantlightthemeimagelistoptions2);
            assertNotSame(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
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
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions1 = new SubtenantLightThemeImageListOptions(Integer.valueOf(-10),
                                                                                                                               Long.valueOf(-74),
                                                                                                                               Order.getDefault(),
                                                                                                                               "ab7b73ba-b4a5-46ef-8ef8-78460ac3ddc2",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions2 = new SubtenantLightThemeImageListOptions(Integer.valueOf(-10),
                                                                                                                               Long.valueOf(-74),
                                                                                                                               Order.getDefault(),
                                                                                                                               "ab7b73ba-b4a5-46ef-8ef8-78460ac3ddc2",
                                                                                                                               null,
                                                                                                                               null);
            assertNotNull(subtenantlightthemeimagelistoptions1);
            assertNotNull(subtenantlightthemeimagelistoptions2);
            assertNotSame(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions2.hashCode(),
                         subtenantlightthemeimagelistoptions1.hashCode());
            int hashCode = subtenantlightthemeimagelistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantlightthemeimagelistoptions1.hashCode());
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
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions1 = new SubtenantLightThemeImageListOptions(Integer.valueOf(78),
                                                                                                                               Long.valueOf(-74),
                                                                                                                               Order.getDefault(),
                                                                                                                               "b3b5722e-e307-4b3b-a8b9-cff3c6577a0a",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions2 = new SubtenantLightThemeImageListOptions(Integer.valueOf(78),
                                                                                                                               Long.valueOf(-74),
                                                                                                                               Order.getDefault(),
                                                                                                                               "b3b5722e-e307-4b3b-a8b9-cff3c6577a0a",
                                                                                                                               null,
                                                                                                                               null);
            SubtenantLightThemeImageListOptions subtenantlightthemeimagelistoptions3 = new SubtenantLightThemeImageListOptions(Integer.valueOf(-23),
                                                                                                                               Long.valueOf(125),
                                                                                                                               Order.getDefault(),
                                                                                                                               "eeabf6a6-50fb-4646-b82c-905f4805a36d",
                                                                                                                               null,
                                                                                                                               null);
            assertNotNull(subtenantlightthemeimagelistoptions1);
            assertNotNull(subtenantlightthemeimagelistoptions2);
            assertNotNull(subtenantlightthemeimagelistoptions3);
            assertNotSame(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertNotSame(subtenantlightthemeimagelistoptions3, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions2, subtenantlightthemeimagelistoptions1);
            assertEquals(subtenantlightthemeimagelistoptions1, subtenantlightthemeimagelistoptions2);
            assertEquals(subtenantlightthemeimagelistoptions1, subtenantlightthemeimagelistoptions1);
            assertFalse(subtenantlightthemeimagelistoptions1.equals(null));
            assertNotEquals(subtenantlightthemeimagelistoptions3, subtenantlightthemeimagelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
