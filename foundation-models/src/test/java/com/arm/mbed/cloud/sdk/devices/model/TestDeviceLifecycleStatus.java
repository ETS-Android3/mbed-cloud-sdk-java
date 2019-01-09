// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DeviceLifecycleStatus.
 */
public class TestDeviceLifecycleStatus {
    /**
     * Tests the getValue method.
     */
    @Test
    public void testGetValue() {
        try {
            DeviceLifecycleStatus devicelifecyclestatus = DeviceLifecycleStatus.getValue(null);
            assertNotNull(devicelifecyclestatus);
            assertTrue(devicelifecyclestatus.isDefault());
            devicelifecyclestatus = DeviceLifecycleStatus.getValue(DeviceLifecycleStatus.getDefault().getString());
            assertNotNull(devicelifecyclestatus);
            assertTrue(devicelifecyclestatus.isDefault());
            devicelifecyclestatus = DeviceLifecycleStatus.getValue("BLOCKED");
            assertNotNull(devicelifecyclestatus);
            assertTrue(devicelifecyclestatus.isDefault());
            devicelifecyclestatus = DeviceLifecycleStatus.getValue("enabled");
            assertNotNull(devicelifecyclestatus);
            assertFalse(devicelifecyclestatus.isDefault());
            devicelifecyclestatus = DeviceLifecycleStatus.getValue("2dff03a1-eade-4e9c-88c9-5d2574202a40");
            assertNotNull(devicelifecyclestatus);
            assertTrue(devicelifecyclestatus.isDefault());
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
