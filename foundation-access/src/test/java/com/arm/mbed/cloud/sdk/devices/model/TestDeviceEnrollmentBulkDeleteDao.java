// This file was generated by the Pelion SDK foundation code generator.
// This unit test suite was autogenerated on Fri Jan 11 00:36:38 GMT 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentBulkDeleteDao.
 */
public class TestDeviceEnrollmentBulkDeleteDao {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEnrollmentBulkDeleteDao deviceenrollmentbulkdeletedao1 = new DeviceEnrollmentBulkDeleteDao();
            DeviceEnrollmentBulkDeleteDao deviceenrollmentbulkdeletedao2 = deviceenrollmentbulkdeletedao1.clone();
            assertNotNull(deviceenrollmentbulkdeletedao1);
            assertNotNull(deviceenrollmentbulkdeletedao2);
            assertNotSame(deviceenrollmentbulkdeletedao2, deviceenrollmentbulkdeletedao1);
            assertEquals(deviceenrollmentbulkdeletedao2, deviceenrollmentbulkdeletedao1);
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
            DeviceEnrollmentBulkDeleteDao deviceenrollmentbulkdeletedao1 = new DeviceEnrollmentBulkDeleteDao();
            DeviceEnrollmentBulkDeleteDao deviceenrollmentbulkdeletedao2 = new DeviceEnrollmentBulkDeleteDao();
            assertNotNull(deviceenrollmentbulkdeletedao1);
            assertNotNull(deviceenrollmentbulkdeletedao2);
            assertNotSame(deviceenrollmentbulkdeletedao2, deviceenrollmentbulkdeletedao1);
            assertEquals(deviceenrollmentbulkdeletedao2, deviceenrollmentbulkdeletedao1);
            assertEquals(deviceenrollmentbulkdeletedao2.hashCode(), deviceenrollmentbulkdeletedao1.hashCode());
            int hashCode = deviceenrollmentbulkdeletedao1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollmentbulkdeletedao1.hashCode());
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
            DeviceEnrollmentBulkDeleteDao deviceenrollmentbulkdeletedao1 = new DeviceEnrollmentBulkDeleteDao();
            DeviceEnrollmentBulkDeleteDao deviceenrollmentbulkdeletedao2 = new DeviceEnrollmentBulkDeleteDao();
            assertNotNull(deviceenrollmentbulkdeletedao1);
            assertNotNull(deviceenrollmentbulkdeletedao2);
            assertNotSame(deviceenrollmentbulkdeletedao2, deviceenrollmentbulkdeletedao1);
            assertEquals(deviceenrollmentbulkdeletedao2, deviceenrollmentbulkdeletedao1);
            assertEquals(deviceenrollmentbulkdeletedao2, deviceenrollmentbulkdeletedao1);
            assertEquals(deviceenrollmentbulkdeletedao1, deviceenrollmentbulkdeletedao2);
            assertEquals(deviceenrollmentbulkdeletedao1, deviceenrollmentbulkdeletedao1);
            assertFalse(deviceenrollmentbulkdeletedao1.equals(null));
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
