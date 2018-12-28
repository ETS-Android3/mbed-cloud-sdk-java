// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentBulkCreate.
 */
public class TestDeviceEnrollmentBulkCreate {
    /**
     * Tests the clone method.
     */
    @Test
    public void testClone() {
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("dd1ffec5-8d60-452a-8c78-342585f85649",
                                                                                                new java.util.Date(1546031372516L),
                                                                                                new java.util.Date(1546031373959L),
                                                                                                88,
                                                                                                "cf2067a1-000d-492c-a678-62e1f88c3a6b",
                                                                                                "8d2fafc4-bc69-479b-adc3-6a6e884b001e",
                                                                                                "K3S9E5b6a6Bbt3O016f2Kt86jmnm00b9",
                                                                                                -60,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                -69);
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = deviceenrollmentbulkcreate1.clone();
        assertNotNull(deviceenrollmentbulkcreate1);
        assertNotNull(deviceenrollmentbulkcreate2);
        assertNotSame(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
        assertEquals(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
    }

    /**
     * Tests the isValid method.
     */
    @Test
    public void testIsvalid() {
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate = new DeviceEnrollmentBulkCreate("3808d185-71bc-48de-90b2-f6cba1f0a72d",
                                                                                               new java.util.Date(1546031364933L),
                                                                                               new java.util.Date(1546031373755L),
                                                                                               87,
                                                                                               "890251a0-4033-47b5-9f11-b108aeab6fcd",
                                                                                               "16b7f191-9ff4-467c-8f4c-579b11064a87",
                                                                                               "7bNlsFWhvPU9GybOQptq4Pj8is9ehrTw",
                                                                                               74,
                                                                                               com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                               -39);
        assertTrue(deviceenrollmentbulkcreate.isValid());
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreateInvalid = new DeviceEnrollmentBulkCreate("429132d8-4aab-46d1-aa2e-7bdb8a40ee03",
                                                                                                      new java.util.Date(1546031372222L),
                                                                                                      new java.util.Date(1546031366175L),
                                                                                                      -3,
                                                                                                      "80d76641-8d7a-4665-812a-7c87924bbc2b",
                                                                                                      "a5b2795a-4bfd-4bff-b3c7-589076e19154",
                                                                                                      "`c`ehetGqmqhT`hP眬1BcWWcavqc4l]c48>thhhqltQ8晽1WBh1jxc�?WQYTj",
                                                                                                      -22,
                                                                                                      com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                      -102);
        assertFalse(deviceenrollmentbulkcreateInvalid.isValid());
    }

    /**
     * Tests the hashCode method.
     */
    @Test
    public void testHashcode() {
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("75019daa-b43d-4379-a250-3d447ee6df84",
                                                                                                new java.util.Date(1546031365527L),
                                                                                                new java.util.Date(1546031367646L),
                                                                                                -107,
                                                                                                "15a92576-e2a2-4737-a422-ed68d5a08107",
                                                                                                "03c28990-e5f0-4d7a-bbb9-a8aa62ad28d1",
                                                                                                "VstB5HW36ACKzm9FPAoLc4HQmDDn5W9o",
                                                                                                -2,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                39);
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = new DeviceEnrollmentBulkCreate("75019daa-b43d-4379-a250-3d447ee6df84",
                                                                                                new java.util.Date(1546031365527L),
                                                                                                new java.util.Date(1546031367646L),
                                                                                                -107,
                                                                                                "15a92576-e2a2-4737-a422-ed68d5a08107",
                                                                                                "03c28990-e5f0-4d7a-bbb9-a8aa62ad28d1",
                                                                                                "VstB5HW36ACKzm9FPAoLc4HQmDDn5W9o",
                                                                                                -2,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                39);
        assertNotNull(deviceenrollmentbulkcreate1);
        assertNotNull(deviceenrollmentbulkcreate2);
        assertNotSame(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
        assertEquals(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
        assertEquals(deviceenrollmentbulkcreate2.hashCode(), deviceenrollmentbulkcreate1.hashCode());
        int hashCode = deviceenrollmentbulkcreate1.hashCode();
        for (int i = 0; i < 5; i++) {
            assertEquals(hashCode, deviceenrollmentbulkcreate1.hashCode());
        }
    }

    /**
     * Tests the equals method.
     */
    @Test
    public void testEquals() {
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("258fde4e-f0e7-437a-97ac-60f020e65060",
                                                                                                new java.util.Date(1546031374026L),
                                                                                                new java.util.Date(1546031370406L),
                                                                                                -34,
                                                                                                "ea7120ab-182f-41fe-bd60-69413651ee6a",
                                                                                                "89e573f1-17fb-4ae7-9d89-7b1530b393da",
                                                                                                "F3T5Zf0uyWtQ4j3LW2byJ2Y9Vr4J0IB1",
                                                                                                9,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                -39);
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = new DeviceEnrollmentBulkCreate("258fde4e-f0e7-437a-97ac-60f020e65060",
                                                                                                new java.util.Date(1546031374026L),
                                                                                                new java.util.Date(1546031370406L),
                                                                                                -34,
                                                                                                "ea7120ab-182f-41fe-bd60-69413651ee6a",
                                                                                                "89e573f1-17fb-4ae7-9d89-7b1530b393da",
                                                                                                "F3T5Zf0uyWtQ4j3LW2byJ2Y9Vr4J0IB1",
                                                                                                9,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                -39);
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate3 = new DeviceEnrollmentBulkCreate("f3de70d9-8560-42e0-a03d-65deacedf7ee",
                                                                                                new java.util.Date(1546031373582L),
                                                                                                new java.util.Date(1546031366779L),
                                                                                                -79,
                                                                                                "11e9313a-e105-4f01-8b79-85719236845d",
                                                                                                "ac192d79-9062-4b54-b8c0-01eb9cbce4ad",
                                                                                                "NkDu48gVhzjn3Yx9yXTzMCoV9ti22Y92",
                                                                                                41,
                                                                                                com.arm.mbed.cloud.sdk.devices.model.DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                111);
        assertNotNull(deviceenrollmentbulkcreate1);
        assertNotNull(deviceenrollmentbulkcreate2);
        assertNotNull(deviceenrollmentbulkcreate3);
        assertNotSame(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
        assertNotSame(deviceenrollmentbulkcreate3, deviceenrollmentbulkcreate1);
        assertEquals(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
        assertEquals(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
        assertEquals(deviceenrollmentbulkcreate1, deviceenrollmentbulkcreate2);
        assertEquals(deviceenrollmentbulkcreate1, deviceenrollmentbulkcreate1);
        assertFalse(deviceenrollmentbulkcreate1.equals(null));
        assertNotEquals(deviceenrollmentbulkcreate3, deviceenrollmentbulkcreate1);
    }
}
