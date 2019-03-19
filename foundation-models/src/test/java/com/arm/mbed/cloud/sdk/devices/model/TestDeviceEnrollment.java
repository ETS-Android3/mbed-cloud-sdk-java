// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollment.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEnrollment {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("aea3ef2b-fd69-438f-8f14-1d979df2c6aa",
                                                                      new Date(1553013208698L),
                                                                      new Date(1553013207643L),
                                                                      "d9SgRLsI81xII0T0e272aSzHlK91K6it",
                                                                      "A-KR60Z3joUBpfUc8aBCXHeSWn2pfu7N3XS4ZnhoTqTL155WqnmIeevSkgg5ST1i:rv5uIpiKbs21lr51:RE8NWZVx7j7yAk2",
                                                                      new Date(1553013212584L),
                                                                      "TsLB80h2p4FeJiV578wn5IlfMLGlHSy4");
            DeviceEnrollment deviceenrollment2 = deviceenrollment1.clone();
            assertNotNull(deviceenrollment1);
            assertNotNull(deviceenrollment2);
            assertNotSame(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
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
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("f681a7c3-9277-434c-aa4f-20c0a1651d1b",
                                                                      new Date(1553013213148L),
                                                                      new Date(1553013210026L),
                                                                      "j322rgI8tT6zx3436glJ7VRPRnwZ5tWb",
                                                                      "A-Tat6zyTy08t1hbWzYn0m2B3:3vkbKHwsm3stHjtYga25U:Mtqf2:fM6:5Y7CWgg1c6aReUevxvVc0t:d9:Pb3601:2uQwKl",
                                                                      new Date(1553013213637L),
                                                                      "JdyH7DCC7WlZvo23qpj87O4186G3tpwX");
            DeviceEnrollment deviceenrollment2 = new DeviceEnrollment("f681a7c3-9277-434c-aa4f-20c0a1651d1b",
                                                                      new Date(1553013213148L),
                                                                      new Date(1553013210026L),
                                                                      "j322rgI8tT6zx3436glJ7VRPRnwZ5tWb",
                                                                      "A-Tat6zyTy08t1hbWzYn0m2B3:3vkbKHwsm3stHjtYga25U:Mtqf2:fM6:5Y7CWgg1c6aReUevxvVc0t:d9:Pb3601:2uQwKl",
                                                                      new Date(1553013213637L),
                                                                      "JdyH7DCC7WlZvo23qpj87O4186G3tpwX");
            assertNotNull(deviceenrollment1);
            assertNotNull(deviceenrollment2);
            assertNotSame(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2.hashCode(), deviceenrollment1.hashCode());
            int hashCode = deviceenrollment1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollment1.hashCode());
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
        DeviceEnrollment deviceenrollment = new DeviceEnrollment("d88b73fa-64a6-4984-a6cd-a0165d2106d6",
                                                                 new Date(1553013209138L), new Date(1553013215186L),
                                                                 "k882v4h3qzVI1uWSga0Vvy9W9C8xLK5s",
                                                                 "A-H4r7j4v3DbcjN964r7T17P8fztsmK0GioiDk65BA2Fh8o9R0bj8Wq3:T9G04:f7gECx41ZK1IfGqmoZPuD9xIaQ6EMjy357",
                                                                 new Date(1553013205875L),
                                                                 "GfUJ4y3Af852Rv588reBod9al3WuwUQo");
        assertTrue(deviceenrollment.isValid());
        DeviceEnrollment deviceenrollmentInvalid = new DeviceEnrollment("f749c929-c76d-485a-8078-819d4bb417b0",
                                                                        new Date(1553013210022L),
                                                                        new Date(1553013210293L),
                                                                        "\\\\LgaqthV<禒\u0005tWFPk\u0002\\\\\u00077tK3[Ugf3m?rEl糫鈧HoHh_L赮FK詪^[ﮩKn\u0016�?�trV73?Uhfg",
                                                                        null, new Date(1553013210624L),
                                                                        "L\u0015\u0004\u0007sgH2g_2)wMHX<Imq1?XLuMLB1iǺi1fsVQL[얔hmQMA\fQa]kMQCYMq2Qhw\u0011罢qW");
        assertFalse(deviceenrollmentInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("738617f9-23fe-4532-b4a4-a52186a709c7",
                                                                      new Date(1553013211198L),
                                                                      new Date(1553013212020L),
                                                                      "9cVpJYPDu4c4S9Ie3j3X061ablbV6RKE",
                                                                      "A-L8bHLRCESig53j56X5aOU8Mw0r5ob0x0c7m4GT2:F5A8c:evkByBISjL1641TPwi4uZB:Bfkj0oViwgln3S3649ttQsCBD1",
                                                                      new Date(1553013207121L),
                                                                      "oW0QUKb1iKXt1enXWngAZQ3943RsK7rr");
            DeviceEnrollment deviceenrollment2 = new DeviceEnrollment("738617f9-23fe-4532-b4a4-a52186a709c7",
                                                                      new Date(1553013211198L),
                                                                      new Date(1553013212020L),
                                                                      "9cVpJYPDu4c4S9Ie3j3X061ablbV6RKE",
                                                                      "A-L8bHLRCESig53j56X5aOU8Mw0r5ob0x0c7m4GT2:F5A8c:evkByBISjL1641TPwi4uZB:Bfkj0oViwgln3S3649ttQsCBD1",
                                                                      new Date(1553013207121L),
                                                                      "oW0QUKb1iKXt1enXWngAZQ3943RsK7rr");
            DeviceEnrollment deviceenrollment3 = new DeviceEnrollment("0dee1632-bfc1-4d69-ab0a-61f1fa69ac7d",
                                                                      new Date(1553013210514L),
                                                                      new Date(1553013205560L),
                                                                      "xd0Ys37jdLZ9WDB602fYCgNDRwstqn22",
                                                                      "A-6cNc8yAW3eto8p7fMUkwnX0596PiB6J3AIr5BzW:N5cooS3nem244u7UyN:1R7oVsj05d9dKA101W5GQ36rr0XPu4dh6093",
                                                                      new Date(1553013208493L),
                                                                      "A6ynaTFj7JXbK4e763ZY65WUx6nq026U");
            assertNotNull(deviceenrollment1);
            assertNotNull(deviceenrollment2);
            assertNotNull(deviceenrollment3);
            assertNotSame(deviceenrollment2, deviceenrollment1);
            assertNotSame(deviceenrollment3, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment1, deviceenrollment2);
            assertEquals(deviceenrollment1, deviceenrollment1);
            assertFalse(deviceenrollment1.equals(null));
            assertNotEquals(deviceenrollment3, deviceenrollment1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
