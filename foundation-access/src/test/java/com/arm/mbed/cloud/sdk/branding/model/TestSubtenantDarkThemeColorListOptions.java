// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantDarkThemeColorListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantDarkThemeColorListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantDarkThemeColorListOptions subtenantdarkthemecolorlistoptions1 = new SubtenantDarkThemeColorListOptions(Integer.valueOf(-84),
                                                                                                                            Long.valueOf(65),
                                                                                                                            Order.getDefault(),
                                                                                                                            "3159eb33-d430-42ac-b5aa-e049b3aa6e20",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantDarkThemeColorListOptions subtenantdarkthemecolorlistoptions2 = subtenantdarkthemecolorlistoptions1.clone();
            assertNotNull(subtenantdarkthemecolorlistoptions1);
            assertNotNull(subtenantdarkthemecolorlistoptions2);
            assertNotSame(subtenantdarkthemecolorlistoptions2, subtenantdarkthemecolorlistoptions1);
            assertEquals(subtenantdarkthemecolorlistoptions2, subtenantdarkthemecolorlistoptions1);
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
            SubtenantDarkThemeColorListOptions subtenantdarkthemecolorlistoptions1 = new SubtenantDarkThemeColorListOptions(Integer.valueOf(66),
                                                                                                                            Long.valueOf(-80),
                                                                                                                            Order.getDefault(),
                                                                                                                            "332e6d87-a6a4-4265-883e-358d594eb53a",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantDarkThemeColorListOptions subtenantdarkthemecolorlistoptions2 = new SubtenantDarkThemeColorListOptions(Integer.valueOf(66),
                                                                                                                            Long.valueOf(-80),
                                                                                                                            Order.getDefault(),
                                                                                                                            "332e6d87-a6a4-4265-883e-358d594eb53a",
                                                                                                                            null,
                                                                                                                            null);
            assertNotNull(subtenantdarkthemecolorlistoptions1);
            assertNotNull(subtenantdarkthemecolorlistoptions2);
            assertNotSame(subtenantdarkthemecolorlistoptions2, subtenantdarkthemecolorlistoptions1);
            assertEquals(subtenantdarkthemecolorlistoptions2, subtenantdarkthemecolorlistoptions1);
            assertEquals(subtenantdarkthemecolorlistoptions2.hashCode(),
                         subtenantdarkthemecolorlistoptions1.hashCode());
            int hashCode = subtenantdarkthemecolorlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenantdarkthemecolorlistoptions1.hashCode());
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
            SubtenantDarkThemeColorListOptions subtenantdarkthemecolorlistoptions1 = new SubtenantDarkThemeColorListOptions(Integer.valueOf(-46),
                                                                                                                            Long.valueOf(71),
                                                                                                                            Order.getDefault(),
                                                                                                                            "0020b863-5de3-490d-af3f-1d97e5cdc0a2",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantDarkThemeColorListOptions subtenantdarkthemecolorlistoptions2 = new SubtenantDarkThemeColorListOptions(Integer.valueOf(-46),
                                                                                                                            Long.valueOf(71),
                                                                                                                            Order.getDefault(),
                                                                                                                            "0020b863-5de3-490d-af3f-1d97e5cdc0a2",
                                                                                                                            null,
                                                                                                                            null);
            SubtenantDarkThemeColorListOptions subtenantdarkthemecolorlistoptions3 = new SubtenantDarkThemeColorListOptions(Integer.valueOf(68),
                                                                                                                            Long.valueOf(-45),
                                                                                                                            Order.getDefault(),
                                                                                                                            "3a072b93-3204-4dfd-af14-395d78039249",
                                                                                                                            null,
                                                                                                                            null);
            assertNotNull(subtenantdarkthemecolorlistoptions1);
            assertNotNull(subtenantdarkthemecolorlistoptions2);
            assertNotNull(subtenantdarkthemecolorlistoptions3);
            assertNotSame(subtenantdarkthemecolorlistoptions2, subtenantdarkthemecolorlistoptions1);
            assertNotSame(subtenantdarkthemecolorlistoptions3, subtenantdarkthemecolorlistoptions1);
            assertEquals(subtenantdarkthemecolorlistoptions2, subtenantdarkthemecolorlistoptions1);
            assertEquals(subtenantdarkthemecolorlistoptions2, subtenantdarkthemecolorlistoptions1);
            assertEquals(subtenantdarkthemecolorlistoptions1, subtenantdarkthemecolorlistoptions2);
            assertEquals(subtenantdarkthemecolorlistoptions1, subtenantdarkthemecolorlistoptions1);
            assertFalse(subtenantdarkthemecolorlistoptions1.equals(null));
            assertNotEquals(subtenantdarkthemecolorlistoptions3, subtenantdarkthemecolorlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
