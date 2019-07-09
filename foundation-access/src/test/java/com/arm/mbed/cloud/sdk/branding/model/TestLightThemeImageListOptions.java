// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model LightThemeImageListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestLightThemeImageListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            LightThemeImageListOptions lightthemeimagelistoptions1 = new LightThemeImageListOptions(Integer.valueOf(-128),
                                                                                                    Long.valueOf(14),
                                                                                                    Order.getDefault(),
                                                                                                    "d01dee4c-04cd-4c73-a8fa-a0a3a43853de",
                                                                                                    null, null);
            LightThemeImageListOptions lightthemeimagelistoptions2 = lightthemeimagelistoptions1.clone();
            assertNotNull(lightthemeimagelistoptions1);
            assertNotNull(lightthemeimagelistoptions2);
            assertNotSame(lightthemeimagelistoptions2, lightthemeimagelistoptions1);
            assertEquals(lightthemeimagelistoptions2, lightthemeimagelistoptions1);
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
            LightThemeImageListOptions lightthemeimagelistoptions1 = new LightThemeImageListOptions(Integer.valueOf(-49),
                                                                                                    Long.valueOf(-78),
                                                                                                    Order.getDefault(),
                                                                                                    "5b56c667-2652-4049-9d3d-71e7c23d4b1d",
                                                                                                    null, null);
            LightThemeImageListOptions lightthemeimagelistoptions2 = new LightThemeImageListOptions(Integer.valueOf(-49),
                                                                                                    Long.valueOf(-78),
                                                                                                    Order.getDefault(),
                                                                                                    "5b56c667-2652-4049-9d3d-71e7c23d4b1d",
                                                                                                    null, null);
            assertNotNull(lightthemeimagelistoptions1);
            assertNotNull(lightthemeimagelistoptions2);
            assertNotSame(lightthemeimagelistoptions2, lightthemeimagelistoptions1);
            assertEquals(lightthemeimagelistoptions2, lightthemeimagelistoptions1);
            assertEquals(lightthemeimagelistoptions2.hashCode(), lightthemeimagelistoptions1.hashCode());
            int hashCode = lightthemeimagelistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, lightthemeimagelistoptions1.hashCode());
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
            LightThemeImageListOptions lightthemeimagelistoptions1 = new LightThemeImageListOptions(Integer.valueOf(93),
                                                                                                    Long.valueOf(104),
                                                                                                    Order.getDefault(),
                                                                                                    "616b9be8-c5ef-48c3-a909-b9bb690e7ae0",
                                                                                                    null, null);
            LightThemeImageListOptions lightthemeimagelistoptions2 = new LightThemeImageListOptions(Integer.valueOf(93),
                                                                                                    Long.valueOf(104),
                                                                                                    Order.getDefault(),
                                                                                                    "616b9be8-c5ef-48c3-a909-b9bb690e7ae0",
                                                                                                    null, null);
            LightThemeImageListOptions lightthemeimagelistoptions3 = new LightThemeImageListOptions(Integer.valueOf(110),
                                                                                                    Long.valueOf(38),
                                                                                                    Order.getDefault(),
                                                                                                    "8e7c2963-9c6c-4025-b30e-7fe0bbea5609",
                                                                                                    null, null);
            assertNotNull(lightthemeimagelistoptions1);
            assertNotNull(lightthemeimagelistoptions2);
            assertNotNull(lightthemeimagelistoptions3);
            assertNotSame(lightthemeimagelistoptions2, lightthemeimagelistoptions1);
            assertNotSame(lightthemeimagelistoptions3, lightthemeimagelistoptions1);
            assertEquals(lightthemeimagelistoptions2, lightthemeimagelistoptions1);
            assertEquals(lightthemeimagelistoptions2, lightthemeimagelistoptions1);
            assertEquals(lightthemeimagelistoptions1, lightthemeimagelistoptions2);
            assertEquals(lightthemeimagelistoptions1, lightthemeimagelistoptions1);
            assertFalse(lightthemeimagelistoptions1.equals(null));
            assertNotEquals(lightthemeimagelistoptions3, lightthemeimagelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
