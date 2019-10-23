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
            LightThemeColorListOptions lightthemecolorlistoptions1 = new LightThemeColorListOptions(Integer.valueOf(75),
                                                                                                    Long.valueOf(92),
                                                                                                    Order.getDefault(),
                                                                                                    "2eae0921-3873-40e1-852c-15a1b6868880",
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
            LightThemeColorListOptions lightthemecolorlistoptions1 = new LightThemeColorListOptions(Integer.valueOf(-40),
                                                                                                    Long.valueOf(-24),
                                                                                                    Order.getDefault(),
                                                                                                    "29cb8c7b-9fde-4c0c-aaa6-b203b024919e",
                                                                                                    null, null);
            LightThemeColorListOptions lightthemecolorlistoptions2 = new LightThemeColorListOptions(Integer.valueOf(-40),
                                                                                                    Long.valueOf(-24),
                                                                                                    Order.getDefault(),
                                                                                                    "29cb8c7b-9fde-4c0c-aaa6-b203b024919e",
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
            LightThemeColorListOptions lightthemecolorlistoptions1 = new LightThemeColorListOptions(Integer.valueOf(95),
                                                                                                    Long.valueOf(-123),
                                                                                                    Order.getDefault(),
                                                                                                    "c4b142d5-c200-4681-9bb2-8032c0152f2d",
                                                                                                    null, null);
            LightThemeColorListOptions lightthemecolorlistoptions2 = new LightThemeColorListOptions(Integer.valueOf(95),
                                                                                                    Long.valueOf(-123),
                                                                                                    Order.getDefault(),
                                                                                                    "c4b142d5-c200-4681-9bb2-8032c0152f2d",
                                                                                                    null, null);
            LightThemeColorListOptions lightthemecolorlistoptions3 = new LightThemeColorListOptions(Integer.valueOf(-63),
                                                                                                    Long.valueOf(-112),
                                                                                                    Order.getDefault(),
                                                                                                    "198cd9a0-d75b-44ae-8c79-8d8474d9e66d",
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
