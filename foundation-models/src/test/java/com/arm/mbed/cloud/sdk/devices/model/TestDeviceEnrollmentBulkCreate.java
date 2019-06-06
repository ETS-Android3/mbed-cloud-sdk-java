// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentBulkCreate.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEnrollmentBulkCreate {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("b9115d3e-b4b2-4023-b8ba-60eb0bfa69a8",
                                                                                                    new Date(1559833510715L),
                                                                                                    new Date(1559833506319L),
                                                                                                    -99,
                                                                                                    "e0d95346-0ca8-430c-af86-f738d5187b24",
                                                                                                    "e57ba095-4c4f-445f-a75f-7889af7c2db2",
                                                                                                    "1al4c2SBl9E1yPuf8fGIKfqhFKfJ1w6M",
                                                                                                    -107,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    119);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = deviceenrollmentbulkcreate1.clone();
            assertNotNull(deviceenrollmentbulkcreate1);
            assertNotNull(deviceenrollmentbulkcreate2);
            assertNotSame(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
            assertEquals(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
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
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("ad2f9b0c-8b84-4ee0-948e-d02fb2cf7617",
                                                                                                    new Date(1559833513229L),
                                                                                                    new Date(1559833510255L),
                                                                                                    -39,
                                                                                                    "78b6eafc-9da1-4dcc-be40-4115f0659b2c",
                                                                                                    "91e37109-612b-443d-aa65-b962b1b1b26c",
                                                                                                    "1al4c2SBl9E1yPuf8fGIKfqhFKfJ1w6M",
                                                                                                    76,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    58);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = new DeviceEnrollmentBulkCreate("ad2f9b0c-8b84-4ee0-948e-d02fb2cf7617",
                                                                                                    new Date(1559833513229L),
                                                                                                    new Date(1559833510255L),
                                                                                                    -39,
                                                                                                    "78b6eafc-9da1-4dcc-be40-4115f0659b2c",
                                                                                                    "91e37109-612b-443d-aa65-b962b1b1b26c",
                                                                                                    "1al4c2SBl9E1yPuf8fGIKfqhFKfJ1w6M",
                                                                                                    76,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    58);
            assertNotNull(deviceenrollmentbulkcreate1);
            assertNotNull(deviceenrollmentbulkcreate2);
            assertNotSame(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
            assertEquals(deviceenrollmentbulkcreate2, deviceenrollmentbulkcreate1);
            assertEquals(deviceenrollmentbulkcreate2.hashCode(), deviceenrollmentbulkcreate1.hashCode());
            int hashCode = deviceenrollmentbulkcreate1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollmentbulkcreate1.hashCode());
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
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate = new DeviceEnrollmentBulkCreate("b90598a7-5ff2-4045-9de9-deb9de89a37d",
                                                                                               new Date(1559833510742L),
                                                                                               new Date(1559833507340L),
                                                                                               -101,
                                                                                               "3eaf4d82-800b-4fe1-8ff2-3ae24268263a",
                                                                                               "0cb3b177-18fe-40fe-b19e-236c32b046cb",
                                                                                               "1al4c2SBl9E1yPuf8fGIKfqhFKfJ1w6M",
                                                                                               -50,
                                                                                               DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                               -94);
        assertTrue(deviceenrollmentbulkcreate.isValid());
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreateInvalid = new DeviceEnrollmentBulkCreate("1895eafd-5769-4d09-a07b-84e6b4bcb846",
                                                                                                      new Date(1559833514235L),
                                                                                                      new Date(1559833505775L),
                                                                                                      -114,
                                                                                                      "b74e37b3-70b7-4d09-aea1-bcfb78ac9d17",
                                                                                                      "db81c208-928b-4bd4-b370-8dd9accfa0a4",
                                                                                                      "H'7g3\u001aⳗi]LLjHo諰L3exmQH<75n;\u0017gOexჅ5Tg3ᄜkHbteCxHQ5\u001ebH3Lt5p\u001bxbO>HCC",
                                                                                                      62,
                                                                                                      DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                      -27);
        assertFalse(deviceenrollmentbulkcreateInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("7b661cc6-aceb-43d8-b8a0-0f6f408c7bc4",
                                                                                                    new Date(1559833515376L),
                                                                                                    new Date(1559833509143L),
                                                                                                    -114,
                                                                                                    "6f70748d-d60e-4209-ac85-9d51e5f8a668",
                                                                                                    "7e2e0e9f-6ac4-4877-8441-964edebba3a8",
                                                                                                    "1al4c2SBl9E1yPuf8fGIKfqhFKfJ1w6M",
                                                                                                    -85,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    99);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = new DeviceEnrollmentBulkCreate("7b661cc6-aceb-43d8-b8a0-0f6f408c7bc4",
                                                                                                    new Date(1559833515376L),
                                                                                                    new Date(1559833509143L),
                                                                                                    -114,
                                                                                                    "6f70748d-d60e-4209-ac85-9d51e5f8a668",
                                                                                                    "7e2e0e9f-6ac4-4877-8441-964edebba3a8",
                                                                                                    "1al4c2SBl9E1yPuf8fGIKfqhFKfJ1w6M",
                                                                                                    -85,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    99);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate3 = new DeviceEnrollmentBulkCreate("d6bbb07d-8abc-47eb-9449-c0378d2f5d32",
                                                                                                    new Date(1559833509711L),
                                                                                                    new Date(1559833514226L),
                                                                                                    7,
                                                                                                    "10e8aef6-d06e-49d7-b0d0-50d24ba46ee9",
                                                                                                    "00ab62f0-9a8f-4859-afca-f82e996d2130",
                                                                                                    "1al4c2SBl9E1yPuf8fGIKfqhFKfJ1w6M",
                                                                                                    25,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    -53);
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
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
