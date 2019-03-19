// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model DeviceListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceListOptions devicelistoptions1 = new DeviceListOptions(Integer.valueOf(-68), Long.valueOf(17),
                                                                         Order.getDefault(),
                                                                         "7d2da4f3-c4a2-4ce9-bece-abc266bbe44a", null,
                                                                         null);
            DeviceListOptions devicelistoptions2 = devicelistoptions1.clone();
            assertNotNull(devicelistoptions1);
            assertNotNull(devicelistoptions2);
            assertNotSame(devicelistoptions2, devicelistoptions1);
            assertEquals(devicelistoptions2, devicelistoptions1);
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
            DeviceListOptions devicelistoptions1 = new DeviceListOptions(Integer.valueOf(120), Long.valueOf(-77),
                                                                         Order.getDefault(),
                                                                         "5525c596-cdc5-42ee-bab2-f658bcde091c", null,
                                                                         null);
            DeviceListOptions devicelistoptions2 = new DeviceListOptions(Integer.valueOf(120), Long.valueOf(-77),
                                                                         Order.getDefault(),
                                                                         "5525c596-cdc5-42ee-bab2-f658bcde091c", null,
                                                                         null);
            assertNotNull(devicelistoptions1);
            assertNotNull(devicelistoptions2);
            assertNotSame(devicelistoptions2, devicelistoptions1);
            assertEquals(devicelistoptions2, devicelistoptions1);
            assertEquals(devicelistoptions2.hashCode(), devicelistoptions1.hashCode());
            int hashCode = devicelistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, devicelistoptions1.hashCode());
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
            DeviceListOptions devicelistoptions1 = new DeviceListOptions(Integer.valueOf(-82), Long.valueOf(22),
                                                                         Order.getDefault(),
                                                                         "dbaf5a7a-8e73-444c-84fe-ac1ff5ad62d6", null,
                                                                         null);
            DeviceListOptions devicelistoptions2 = new DeviceListOptions(Integer.valueOf(-82), Long.valueOf(22),
                                                                         Order.getDefault(),
                                                                         "dbaf5a7a-8e73-444c-84fe-ac1ff5ad62d6", null,
                                                                         null);
            DeviceListOptions devicelistoptions3 = new DeviceListOptions(Integer.valueOf(-94), Long.valueOf(37),
                                                                         Order.getDefault(),
                                                                         "f8338ceb-5cbb-4a7a-80d0-1f132f487b09", null,
                                                                         null);
            assertNotNull(devicelistoptions1);
            assertNotNull(devicelistoptions2);
            assertNotNull(devicelistoptions3);
            assertNotSame(devicelistoptions2, devicelistoptions1);
            assertNotSame(devicelistoptions3, devicelistoptions1);
            assertEquals(devicelistoptions2, devicelistoptions1);
            assertEquals(devicelistoptions2, devicelistoptions1);
            assertEquals(devicelistoptions1, devicelistoptions2);
            assertEquals(devicelistoptions1, devicelistoptions1);
            assertFalse(devicelistoptions1.equals(null));
            assertNotEquals(devicelistoptions3, devicelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
