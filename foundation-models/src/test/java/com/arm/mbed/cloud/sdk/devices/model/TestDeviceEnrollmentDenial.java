// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentDenial.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEnrollmentDenial {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEnrollmentDenial deviceenrollmentdenial1 = new DeviceEnrollmentDenial("a5fdd8ccb79ecfcc089719469de69b9b",
                                                                                        new Date(1562663760476L),
                                                                                        "b75c8809-ab51-4e7d-aa92-c99700d686ba",
                                                                                        "a5fdd8ccb79ecfcc089719469de69b9b",
                                                                                        "a5fdd8ccb79ecfcc089719469de69b9b");
            DeviceEnrollmentDenial deviceenrollmentdenial2 = deviceenrollmentdenial1.clone();
            assertNotNull(deviceenrollmentdenial1);
            assertNotNull(deviceenrollmentdenial2);
            assertNotSame(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial2, deviceenrollmentdenial1);
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
            DeviceEnrollmentDenial deviceenrollmentdenial1 = new DeviceEnrollmentDenial("a5fdd8ccb79ecfcc089719469de69b9b",
                                                                                        new Date(1562663761694L),
                                                                                        "26ef13fb-abe2-4df5-81fa-62483b7398b0",
                                                                                        "a5fdd8ccb79ecfcc089719469de69b9b",
                                                                                        "a5fdd8ccb79ecfcc089719469de69b9b");
            DeviceEnrollmentDenial deviceenrollmentdenial2 = new DeviceEnrollmentDenial("a5fdd8ccb79ecfcc089719469de69b9b",
                                                                                        new Date(1562663761694L),
                                                                                        "26ef13fb-abe2-4df5-81fa-62483b7398b0",
                                                                                        "a5fdd8ccb79ecfcc089719469de69b9b",
                                                                                        "a5fdd8ccb79ecfcc089719469de69b9b");
            assertNotNull(deviceenrollmentdenial1);
            assertNotNull(deviceenrollmentdenial2);
            assertNotSame(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial2.hashCode(), deviceenrollmentdenial1.hashCode());
            int hashCode = deviceenrollmentdenial1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollmentdenial1.hashCode());
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the isValid method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testIsValid() {
        DeviceEnrollmentDenial deviceenrollmentdenial = new DeviceEnrollmentDenial("a5fdd8ccb79ecfcc089719469de69b9b",
                                                                                   new Date(1562663756195L),
                                                                                   "73540bcf-b4b9-4b74-9129-372972d5a0b9",
                                                                                   "a5fdd8ccb79ecfcc089719469de69b9b",
                                                                                   "a5fdd8ccb79ecfcc089719469de69b9b");
        assertTrue(deviceenrollmentdenial.isValid());
        DeviceEnrollmentDenial deviceenrollmentdenialInvalid = new DeviceEnrollmentDenial("\u0006O祉䩳L\u0007-\u0019$$Ꮌ<#2,%33᎟3U3\b㕧䪹S$$\u000e?3\u0016餋3\u0015GYꚃ3R\u0001᣼`2�?2\u000eਗ\u0012虰ᆊ]\u0016[?\u000f!3 @2V",
                                                                                          new Date(1562663765512L),
                                                                                          "a6f6bcf2-fa88-411c-8174-9539ed00c867",
                                                                                          "\u0006O祉䩳L\u0007-\u0019$$Ꮌ<#2,%33᎟3U3\b㕧䪹S$$\u000e?3\u0016餋3\u0015GYꚃ3R\u0001᣼`2�?2\u000eਗ\u0012虰ᆊ]\u0016[?\u000f!3 @2V",
                                                                                          "\u0006O祉䩳L\u0007-\u0019$$Ꮌ<#2,%33᎟3U3\b㕧䪹S$$\u000e?3\u0016餋3\u0015GYꚃ3R\u0001᣼`2�?2\u000eਗ\u0012虰ᆊ]\u0016[?\u000f!3 @2V");
        assertFalse(deviceenrollmentdenialInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEnrollmentDenial deviceenrollmentdenial1 = new DeviceEnrollmentDenial("a5fdd8ccb79ecfcc089719469de69b9b",
                                                                                        new Date(1562663759884L),
                                                                                        "f737b984-e66d-404b-8b26-96e5a491abda",
                                                                                        "a5fdd8ccb79ecfcc089719469de69b9b",
                                                                                        "a5fdd8ccb79ecfcc089719469de69b9b");
            DeviceEnrollmentDenial deviceenrollmentdenial2 = new DeviceEnrollmentDenial("a5fdd8ccb79ecfcc089719469de69b9b",
                                                                                        new Date(1562663759884L),
                                                                                        "f737b984-e66d-404b-8b26-96e5a491abda",
                                                                                        "a5fdd8ccb79ecfcc089719469de69b9b",
                                                                                        "a5fdd8ccb79ecfcc089719469de69b9b");
            DeviceEnrollmentDenial deviceenrollmentdenial3 = new DeviceEnrollmentDenial("a5fdd8ccb79ecfcc089719469de69b9b",
                                                                                        new Date(1562663760724L),
                                                                                        "61ab88d6-69c0-4cff-ae6a-dce8a715c713",
                                                                                        "a5fdd8ccb79ecfcc089719469de69b9b",
                                                                                        "a5fdd8ccb79ecfcc089719469de69b9b");
            assertNotNull(deviceenrollmentdenial1);
            assertNotNull(deviceenrollmentdenial2);
            assertNotNull(deviceenrollmentdenial3);
            assertNotSame(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertNotSame(deviceenrollmentdenial3, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial2, deviceenrollmentdenial1);
            assertEquals(deviceenrollmentdenial1, deviceenrollmentdenial2);
            assertEquals(deviceenrollmentdenial1, deviceenrollmentdenial1);
            assertFalse(deviceenrollmentdenial1.equals(null));
            assertNotEquals(deviceenrollmentdenial3, deviceenrollmentdenial1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
