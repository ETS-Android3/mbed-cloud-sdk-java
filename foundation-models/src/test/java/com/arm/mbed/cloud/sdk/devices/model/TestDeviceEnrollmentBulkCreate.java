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
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("e75b7587-cd6c-4b94-b19f-10ae5903f2c3",
                                                                                                    new Date(1553713212058L),
                                                                                                    new Date(1553713215464L),
                                                                                                    80,
                                                                                                    "0086b71f-4dbd-46d0-9d06-d3c9079b2797",
                                                                                                    "31b12e63-d397-4dff-9ad2-a120f7c89587",
                                                                                                    "K5Gq7pILOw0NCGyjNcvv0em8513Cl4Cu",
                                                                                                    63,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    -62);
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
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("309b3171-8367-4819-9a62-a77148710b80",
                                                                                                    new Date(1553713211740L),
                                                                                                    new Date(1553713216317L),
                                                                                                    87,
                                                                                                    "33b00e50-5ad2-4e9e-ac04-c3bb81075515",
                                                                                                    "5b808f80-b660-44d4-9757-4ce0a1a544cf",
                                                                                                    "W37VnE6y47a6Fdgj0ec98WDC9jw4URNl",
                                                                                                    -34,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    -121);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = new DeviceEnrollmentBulkCreate("309b3171-8367-4819-9a62-a77148710b80",
                                                                                                    new Date(1553713211740L),
                                                                                                    new Date(1553713216317L),
                                                                                                    87,
                                                                                                    "33b00e50-5ad2-4e9e-ac04-c3bb81075515",
                                                                                                    "5b808f80-b660-44d4-9757-4ce0a1a544cf",
                                                                                                    "W37VnE6y47a6Fdgj0ec98WDC9jw4URNl",
                                                                                                    -34,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    -121);
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
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate = new DeviceEnrollmentBulkCreate("ebe7dff5-e051-4450-86dc-0f108dc773a3",
                                                                                               new Date(1553713216814L),
                                                                                               new Date(1553713210730L),
                                                                                               -73,
                                                                                               "6e1ca442-44a3-433a-90dc-6eed79b478a4",
                                                                                               "9db34b94-900e-4f1c-9f41-1d28bed74361",
                                                                                               "7tH5WcWgp1qhL7pcp35036LBVgRp81Yi",
                                                                                               -91,
                                                                                               DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                               -77);
        assertTrue(deviceenrollmentbulkcreate.isValid());
        DeviceEnrollmentBulkCreate deviceenrollmentbulkcreateInvalid = new DeviceEnrollmentBulkCreate("5e4adfcb-780f-48dc-9cc2-902333c04499",
                                                                                                      new Date(1553713217575L),
                                                                                                      new Date(1553713210959L),
                                                                                                      45,
                                                                                                      "69d81394-22ca-44c9-a631-6c89856d0073",
                                                                                                      "19ba912d-cae6-4d42-9322-70c55d3f8013",
                                                                                                      "_HiQ=Y\t1䯬iFOnRbZ=꤮1R4M\\\\O㞕bmTRK<g1ƻ1h@O1LGM\u0017gQ1oGmԫmB;K\u0006T\u0001M3Vb1M",
                                                                                                      -66,
                                                                                                      DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                      53);
        assertFalse(deviceenrollmentbulkcreateInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate1 = new DeviceEnrollmentBulkCreate("703b287d-2ab3-4525-9f20-b86e3cf3255a",
                                                                                                    new Date(1553713209459L),
                                                                                                    new Date(1553713216821L),
                                                                                                    104,
                                                                                                    "0a55d11a-b572-491a-a904-7307687d4279",
                                                                                                    "e5bfdb90-127f-4f8a-9012-ae715bf72903",
                                                                                                    "etP7qZ192fwd2wqDIUf5q9u9o3Vn5I6T",
                                                                                                    -97,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    -49);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate2 = new DeviceEnrollmentBulkCreate("703b287d-2ab3-4525-9f20-b86e3cf3255a",
                                                                                                    new Date(1553713209459L),
                                                                                                    new Date(1553713216821L),
                                                                                                    104,
                                                                                                    "0a55d11a-b572-491a-a904-7307687d4279",
                                                                                                    "e5bfdb90-127f-4f8a-9012-ae715bf72903",
                                                                                                    "etP7qZ192fwd2wqDIUf5q9u9o3Vn5I6T",
                                                                                                    -97,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    -49);
            DeviceEnrollmentBulkCreate deviceenrollmentbulkcreate3 = new DeviceEnrollmentBulkCreate("c27d1c0b-dffd-48a6-bdc0-c6ab17a43101",
                                                                                                    new Date(1553713214525L),
                                                                                                    new Date(1553713210819L),
                                                                                                    -69,
                                                                                                    "382a27c8-6c7e-42f3-824b-a9d7c5c01b72",
                                                                                                    "8095c67b-3942-4fbb-beb5-31ee0acd8b76",
                                                                                                    "FMWfJ56p11XrXx8hvICx86HQ26BxUtnA",
                                                                                                    116,
                                                                                                    DeviceEnrollmentBulkCreateStatus.getDefault(),
                                                                                                    -62);
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
