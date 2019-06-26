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
            DeviceEnrollmentDenial deviceenrollmentdenial1 = new DeviceEnrollmentDenial("fc91ece4c663c84ce50ea8058379fe26",
                                                                                        new Date(1561477839246L),
                                                                                        "6a680364-001a-42b0-9635-77e3ec1b620c",
                                                                                        "fc91ece4c663c84ce50ea8058379fe26",
                                                                                        "fc91ece4c663c84ce50ea8058379fe26");
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
            DeviceEnrollmentDenial deviceenrollmentdenial1 = new DeviceEnrollmentDenial("fc91ece4c663c84ce50ea8058379fe26",
                                                                                        new Date(1561477834061L),
                                                                                        "2517a8ca-0fe2-45c5-b52a-522cb48876af",
                                                                                        "fc91ece4c663c84ce50ea8058379fe26",
                                                                                        "fc91ece4c663c84ce50ea8058379fe26");
            DeviceEnrollmentDenial deviceenrollmentdenial2 = new DeviceEnrollmentDenial("fc91ece4c663c84ce50ea8058379fe26",
                                                                                        new Date(1561477834061L),
                                                                                        "2517a8ca-0fe2-45c5-b52a-522cb48876af",
                                                                                        "fc91ece4c663c84ce50ea8058379fe26",
                                                                                        "fc91ece4c663c84ce50ea8058379fe26");
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
        DeviceEnrollmentDenial deviceenrollmentdenial = new DeviceEnrollmentDenial("fc91ece4c663c84ce50ea8058379fe26",
                                                                                   new Date(1561477836724L),
                                                                                   "a0700661-c9d2-46c9-8855-6c8cbbd3fa23",
                                                                                   "fc91ece4c663c84ce50ea8058379fe26",
                                                                                   "fc91ece4c663c84ce50ea8058379fe26");
        assertTrue(deviceenrollmentdenial.isValid());
        DeviceEnrollmentDenial deviceenrollmentdenialInvalid = new DeviceEnrollmentDenial("\u001ed玿Z쒤㸃▦&'d\\\\d=/\u0001b]b冑쟄ddbbb@\u0019dd_:bd\u0014G,dd+\\\\dbbbE`涮b\u0013粔AUbbbK襊\bO>db",
                                                                                          new Date(1561477832621L),
                                                                                          "ce6b9f47-a3eb-45dd-9be1-3cf4489ebff8",
                                                                                          "\u001ed玿Z쒤㸃▦&'d\\\\d=/\u0001b]b冑쟄ddbbb@\u0019dd_:bd\u0014G,dd+\\\\dbbbE`涮b\u0013粔AUbbbK襊\bO>db",
                                                                                          "\u001ed玿Z쒤㸃▦&'d\\\\d=/\u0001b]b冑쟄ddbbb@\u0019dd_:bd\u0014G,dd+\\\\dbbbE`涮b\u0013粔AUbbbK襊\bO>db");
        assertFalse(deviceenrollmentdenialInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEnrollmentDenial deviceenrollmentdenial1 = new DeviceEnrollmentDenial("fc91ece4c663c84ce50ea8058379fe26",
                                                                                        new Date(1561477839100L),
                                                                                        "3e504ffd-07c4-4bb0-98b2-1a0e93b6ace0",
                                                                                        "fc91ece4c663c84ce50ea8058379fe26",
                                                                                        "fc91ece4c663c84ce50ea8058379fe26");
            DeviceEnrollmentDenial deviceenrollmentdenial2 = new DeviceEnrollmentDenial("fc91ece4c663c84ce50ea8058379fe26",
                                                                                        new Date(1561477839100L),
                                                                                        "3e504ffd-07c4-4bb0-98b2-1a0e93b6ace0",
                                                                                        "fc91ece4c663c84ce50ea8058379fe26",
                                                                                        "fc91ece4c663c84ce50ea8058379fe26");
            DeviceEnrollmentDenial deviceenrollmentdenial3 = new DeviceEnrollmentDenial("fc91ece4c663c84ce50ea8058379fe26",
                                                                                        new Date(1561477834373L),
                                                                                        "bbf0bfcd-c17d-4fac-8ff8-9520dbc7914d",
                                                                                        "fc91ece4c663c84ce50ea8058379fe26",
                                                                                        "fc91ece4c663c84ce50ea8058379fe26");
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
