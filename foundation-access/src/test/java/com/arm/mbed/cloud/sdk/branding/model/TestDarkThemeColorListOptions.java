// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model DarkThemeColorListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDarkThemeColorListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DarkThemeColorListOptions darkthemecolorlistoptions1 = new DarkThemeColorListOptions(Integer.valueOf(12),
                                                                                                 Long.valueOf(-120),
                                                                                                 Order.getDefault(),
                                                                                                 "7f780cb5-5433-4dd7-8d51-deb56aa410fe",
                                                                                                 null, null);
            DarkThemeColorListOptions darkthemecolorlistoptions2 = darkthemecolorlistoptions1.clone();
            assertNotNull(darkthemecolorlistoptions1);
            assertNotNull(darkthemecolorlistoptions2);
            assertNotSame(darkthemecolorlistoptions2, darkthemecolorlistoptions1);
            assertEquals(darkthemecolorlistoptions2, darkthemecolorlistoptions1);
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
            DarkThemeColorListOptions darkthemecolorlistoptions1 = new DarkThemeColorListOptions(Integer.valueOf(-113),
                                                                                                 Long.valueOf(-113),
                                                                                                 Order.getDefault(),
                                                                                                 "9605c6d5-dd78-414d-a567-4fb2501f11ef",
                                                                                                 null, null);
            DarkThemeColorListOptions darkthemecolorlistoptions2 = new DarkThemeColorListOptions(Integer.valueOf(-113),
                                                                                                 Long.valueOf(-113),
                                                                                                 Order.getDefault(),
                                                                                                 "9605c6d5-dd78-414d-a567-4fb2501f11ef",
                                                                                                 null, null);
            assertNotNull(darkthemecolorlistoptions1);
            assertNotNull(darkthemecolorlistoptions2);
            assertNotSame(darkthemecolorlistoptions2, darkthemecolorlistoptions1);
            assertEquals(darkthemecolorlistoptions2, darkthemecolorlistoptions1);
            assertEquals(darkthemecolorlistoptions2.hashCode(), darkthemecolorlistoptions1.hashCode());
            int hashCode = darkthemecolorlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, darkthemecolorlistoptions1.hashCode());
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
            DarkThemeColorListOptions darkthemecolorlistoptions1 = new DarkThemeColorListOptions(Integer.valueOf(-83),
                                                                                                 Long.valueOf(-1),
                                                                                                 Order.getDefault(),
                                                                                                 "00c6464a-92ac-4eb7-846e-bc8cf9bf2a54",
                                                                                                 null, null);
            DarkThemeColorListOptions darkthemecolorlistoptions2 = new DarkThemeColorListOptions(Integer.valueOf(-83),
                                                                                                 Long.valueOf(-1),
                                                                                                 Order.getDefault(),
                                                                                                 "00c6464a-92ac-4eb7-846e-bc8cf9bf2a54",
                                                                                                 null, null);
            DarkThemeColorListOptions darkthemecolorlistoptions3 = new DarkThemeColorListOptions(Integer.valueOf(62),
                                                                                                 Long.valueOf(-82),
                                                                                                 Order.getDefault(),
                                                                                                 "ecbab490-044a-420b-b7c6-825483d8c1ea",
                                                                                                 null, null);
            assertNotNull(darkthemecolorlistoptions1);
            assertNotNull(darkthemecolorlistoptions2);
            assertNotNull(darkthemecolorlistoptions3);
            assertNotSame(darkthemecolorlistoptions2, darkthemecolorlistoptions1);
            assertNotSame(darkthemecolorlistoptions3, darkthemecolorlistoptions1);
            assertEquals(darkthemecolorlistoptions2, darkthemecolorlistoptions1);
            assertEquals(darkthemecolorlistoptions2, darkthemecolorlistoptions1);
            assertEquals(darkthemecolorlistoptions1, darkthemecolorlistoptions2);
            assertEquals(darkthemecolorlistoptions1, darkthemecolorlistoptions1);
            assertFalse(darkthemecolorlistoptions1.equals(null));
            assertNotEquals(darkthemecolorlistoptions3, darkthemecolorlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
