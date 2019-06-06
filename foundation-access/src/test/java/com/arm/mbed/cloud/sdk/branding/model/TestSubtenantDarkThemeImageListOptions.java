// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantDarkThemeImageListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantDarkThemeImageListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantDarkThemeImageListOptions subtenantdarkthemeimagelistoptions1 = new SubtenantDarkThemeImageListOptions(Integer.valueOf(-50),
                                                                                                                            Long.valueOf(92),
                                                                                                                            Order.getDefault(),
                                                                                                                            "19b5e05a-c65e-4183-a38a-cc2930bedb12",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantDarkThemeImageListOptions subtenantdarkthemeimagelistoptions2 = subtenantdarkthemeimagelistoptions1.clone();
            assertNotNull(subtenantdarkthemeimagelistoptions1);
            assertNotNull(subtenantdarkthemeimagelistoptions2);
            assertNotSame(subtenantdarkthemeimagelistoptions2, subtenantdarkthemeimagelistoptions1);
            assertEquals(subtenantdarkthemeimagelistoptions2, subtenantdarkthemeimagelistoptions1);
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
            SubtenantDarkThemeImageListOptions subtenantdarkthemeimagelistoptions1 = new SubtenantDarkThemeImageListOptions(Integer.valueOf(-102),
                                                                                                                            Long.valueOf(4),
                                                                                                                            Order.getDefault(),
                                                                                                                            "c1d4baf9-30ee-424f-956c-f244152fc874",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantDarkThemeImageListOptions subtenantdarkthemeimagelistoptions2 = new SubtenantDarkThemeImageListOptions(Integer.valueOf(-102),
                                                                                                                            Long.valueOf(4),
                                                                                                                            Order.getDefault(),
                                                                                                                            "c1d4baf9-30ee-424f-956c-f244152fc874",
                                                                                                                            null,
                                                                                                                            null);
            assertNotNull(subtenantdarkthemeimagelistoptions1);
            assertNotNull(subtenantdarkthemeimagelistoptions2);
            assertNotSame(subtenantdarkthemeimagelistoptions2, subtenantdarkthemeimagelistoptions1);
            assertEquals(subtenantdarkthemeimagelistoptions2, subtenantdarkthemeimagelistoptions1);
            assertEquals(subtenantdarkthemeimagelistoptions2.hashCode(),
                         subtenantdarkthemeimagelistoptions1.hashCode());
            int hashCode = subtenantdarkthemeimagelistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantdarkthemeimagelistoptions1.hashCode());
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
            SubtenantDarkThemeImageListOptions subtenantdarkthemeimagelistoptions1 = new SubtenantDarkThemeImageListOptions(Integer.valueOf(66),
                                                                                                                            Long.valueOf(-2),
                                                                                                                            Order.getDefault(),
                                                                                                                            "5964a68d-f54c-4b6f-81a4-383e1a86eb7d",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantDarkThemeImageListOptions subtenantdarkthemeimagelistoptions2 = new SubtenantDarkThemeImageListOptions(Integer.valueOf(66),
                                                                                                                            Long.valueOf(-2),
                                                                                                                            Order.getDefault(),
                                                                                                                            "5964a68d-f54c-4b6f-81a4-383e1a86eb7d",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantDarkThemeImageListOptions subtenantdarkthemeimagelistoptions3 = new SubtenantDarkThemeImageListOptions(Integer.valueOf(-58),
                                                                                                                            Long.valueOf(-123),
                                                                                                                            Order.getDefault(),
                                                                                                                            "b27a3ec3-a4cd-4535-b133-3e8ae8ef223a",
                                                                                                                            null,
                                                                                                                            null);
            assertNotNull(subtenantdarkthemeimagelistoptions1);
            assertNotNull(subtenantdarkthemeimagelistoptions2);
            assertNotNull(subtenantdarkthemeimagelistoptions3);
            assertNotSame(subtenantdarkthemeimagelistoptions2, subtenantdarkthemeimagelistoptions1);
            assertNotSame(subtenantdarkthemeimagelistoptions3, subtenantdarkthemeimagelistoptions1);
            assertEquals(subtenantdarkthemeimagelistoptions2, subtenantdarkthemeimagelistoptions1);
            assertEquals(subtenantdarkthemeimagelistoptions2, subtenantdarkthemeimagelistoptions1);
            assertEquals(subtenantdarkthemeimagelistoptions1, subtenantdarkthemeimagelistoptions2);
            assertEquals(subtenantdarkthemeimagelistoptions1, subtenantdarkthemeimagelistoptions1);
            assertFalse(subtenantdarkthemeimagelistoptions1.equals(null));
            assertNotEquals(subtenantdarkthemeimagelistoptions3, subtenantdarkthemeimagelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
