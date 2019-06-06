// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model LightThemeColorListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestLightThemeColorListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            LightThemeColorListOptions lightthemecolorlistoptions1 = new LightThemeColorListOptions(Integer.valueOf(31),
                                                                                                    Long.valueOf(-91),
                                                                                                    Order.getDefault(),
                                                                                                    "5aa96407-c82b-4de9-9570-5219153f6810",
                                                                                                    null, null);
            LightThemeColorListOptions lightthemecolorlistoptions2 = lightthemecolorlistoptions1.clone();
            assertNotNull(lightthemecolorlistoptions1);
            assertNotNull(lightthemecolorlistoptions2);
            assertNotSame(lightthemecolorlistoptions2, lightthemecolorlistoptions1);
            assertEquals(lightthemecolorlistoptions2, lightthemecolorlistoptions1);
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
            LightThemeColorListOptions lightthemecolorlistoptions1 = new LightThemeColorListOptions(Integer.valueOf(112),
                                                                                                    Long.valueOf(-95),
                                                                                                    Order.getDefault(),
                                                                                                    "13bbb8c4-ba17-48b4-8e35-c8f7dfc974b3",
                                                                                                    null, null);
            LightThemeColorListOptions lightthemecolorlistoptions2 = new LightThemeColorListOptions(Integer.valueOf(112),
                                                                                                    Long.valueOf(-95),
                                                                                                    Order.getDefault(),
                                                                                                    "13bbb8c4-ba17-48b4-8e35-c8f7dfc974b3",
                                                                                                    null, null);
            assertNotNull(lightthemecolorlistoptions1);
            assertNotNull(lightthemecolorlistoptions2);
            assertNotSame(lightthemecolorlistoptions2, lightthemecolorlistoptions1);
            assertEquals(lightthemecolorlistoptions2, lightthemecolorlistoptions1);
            assertEquals(lightthemecolorlistoptions2.hashCode(), lightthemecolorlistoptions1.hashCode());
            int hashCode = lightthemecolorlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, lightthemecolorlistoptions1.hashCode());
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
            LightThemeColorListOptions lightthemecolorlistoptions1 = new LightThemeColorListOptions(Integer.valueOf(-60),
                                                                                                    Long.valueOf(-59),
                                                                                                    Order.getDefault(),
                                                                                                    "262364c0-4112-4395-bd2a-79dd556ebc09",
                                                                                                    null, null);
            LightThemeColorListOptions lightthemecolorlistoptions2 = new LightThemeColorListOptions(Integer.valueOf(-60),
                                                                                                    Long.valueOf(-59),
                                                                                                    Order.getDefault(),
                                                                                                    "262364c0-4112-4395-bd2a-79dd556ebc09",
                                                                                                    null, null);
            LightThemeColorListOptions lightthemecolorlistoptions3 = new LightThemeColorListOptions(Integer.valueOf(100),
                                                                                                    Long.valueOf(-47),
                                                                                                    Order.getDefault(),
                                                                                                    "c9edbeb8-0906-4014-b128-7d606df63668",
                                                                                                    null, null);
            assertNotNull(lightthemecolorlistoptions1);
            assertNotNull(lightthemecolorlistoptions2);
            assertNotNull(lightthemecolorlistoptions3);
            assertNotSame(lightthemecolorlistoptions2, lightthemecolorlistoptions1);
            assertNotSame(lightthemecolorlistoptions3, lightthemecolorlistoptions1);
            assertEquals(lightthemecolorlistoptions2, lightthemecolorlistoptions1);
            assertEquals(lightthemecolorlistoptions2, lightthemecolorlistoptions1);
            assertEquals(lightthemecolorlistoptions1, lightthemecolorlistoptions2);
            assertEquals(lightthemecolorlistoptions1, lightthemecolorlistoptions1);
            assertFalse(lightthemecolorlistoptions1.equals(null));
            assertNotEquals(lightthemecolorlistoptions3, lightthemecolorlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
