// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollmentDenialListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEnrollmentDenialListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEnrollmentDenialListOptions deviceenrollmentdeniallistoptions1 = new DeviceEnrollmentDenialListOptions(Integer.valueOf(-79),
                                                                                                                         Long.valueOf(126),
                                                                                                                         Order.getDefault(),
                                                                                                                         "248ddd76-acc9-4271-88a6-6657b6eb4a2d",
                                                                                                                         null,
                                                                                                                         null);
            DeviceEnrollmentDenialListOptions deviceenrollmentdeniallistoptions2 = deviceenrollmentdeniallistoptions1.clone();
            assertNotNull(deviceenrollmentdeniallistoptions1);
            assertNotNull(deviceenrollmentdeniallistoptions2);
            assertNotSame(deviceenrollmentdeniallistoptions2, deviceenrollmentdeniallistoptions1);
            assertEquals(deviceenrollmentdeniallistoptions2, deviceenrollmentdeniallistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the filters method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testFilters() {
        try {
            DeviceEnrollmentDenialListOptions option = new DeviceEnrollmentDenialListOptions().equalToEndpointName("eaee2447-50d6-4bae-a994-94b299eb277b")
                                                                                              .equalToTrustedCertificateId("d455ffaf-5dcd-433d-b5b8-1b86f347c01c");
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(DeviceEnrollmentDenialListOptions.TAG_FILTER_BY_ENDPOINT_NAME));
            assertTrue(option.hasFilter(DeviceEnrollmentDenialListOptions.TAG_FILTER_BY_ENDPOINT_NAME,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getEndpointNameFilters());
            assertEquals("eaee2447-50d6-4bae-a994-94b299eb277b",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEnrollmentDenialListOptions.TAG_FILTER_BY_ENDPOINT_NAME,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEnrollmentDenialListOptions.TAG_FILTER_BY_TRUSTED_CERTIFICATE_ID));
            assertTrue(option.hasFilter(DeviceEnrollmentDenialListOptions.TAG_FILTER_BY_TRUSTED_CERTIFICATE_ID,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getTrustedCertificateIdFilters());
            assertEquals("d455ffaf-5dcd-433d-b5b8-1b86f347c01c",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEnrollmentDenialListOptions.TAG_FILTER_BY_TRUSTED_CERTIFICATE_ID,
                                                                    String.class, option));
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
            DeviceEnrollmentDenialListOptions deviceenrollmentdeniallistoptions1 = new DeviceEnrollmentDenialListOptions(Integer.valueOf(-77),
                                                                                                                         Long.valueOf(-71),
                                                                                                                         Order.getDefault(),
                                                                                                                         "80331758-f3db-4ff3-bf4f-cfdf181c9c1d",
                                                                                                                         null,
                                                                                                                         null);
            DeviceEnrollmentDenialListOptions deviceenrollmentdeniallistoptions2 = new DeviceEnrollmentDenialListOptions(Integer.valueOf(-77),
                                                                                                                         Long.valueOf(-71),
                                                                                                                         Order.getDefault(),
                                                                                                                         "80331758-f3db-4ff3-bf4f-cfdf181c9c1d",
                                                                                                                         null,
                                                                                                                         null);
            assertNotNull(deviceenrollmentdeniallistoptions1);
            assertNotNull(deviceenrollmentdeniallistoptions2);
            assertNotSame(deviceenrollmentdeniallistoptions2, deviceenrollmentdeniallistoptions1);
            assertEquals(deviceenrollmentdeniallistoptions2, deviceenrollmentdeniallistoptions1);
            assertEquals(deviceenrollmentdeniallistoptions2.hashCode(), deviceenrollmentdeniallistoptions1.hashCode());
            int hashCode = deviceenrollmentdeniallistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollmentdeniallistoptions1.hashCode());
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
            DeviceEnrollmentDenialListOptions deviceenrollmentdeniallistoptions1 = new DeviceEnrollmentDenialListOptions(Integer.valueOf(-112),
                                                                                                                         Long.valueOf(22),
                                                                                                                         Order.getDefault(),
                                                                                                                         "7a88b69b-65db-45dc-b450-6341d33d052d",
                                                                                                                         null,
                                                                                                                         null);
            DeviceEnrollmentDenialListOptions deviceenrollmentdeniallistoptions2 = new DeviceEnrollmentDenialListOptions(Integer.valueOf(-112),
                                                                                                                         Long.valueOf(22),
                                                                                                                         Order.getDefault(),
                                                                                                                         "7a88b69b-65db-45dc-b450-6341d33d052d",
                                                                                                                         null,
                                                                                                                         null);
            DeviceEnrollmentDenialListOptions deviceenrollmentdeniallistoptions3 = new DeviceEnrollmentDenialListOptions(Integer.valueOf(-75),
                                                                                                                         Long.valueOf(-22),
                                                                                                                         Order.getDefault(),
                                                                                                                         "a3cf408a-9152-46cd-ba5e-09184ce77656",
                                                                                                                         null,
                                                                                                                         null);
            assertNotNull(deviceenrollmentdeniallistoptions1);
            assertNotNull(deviceenrollmentdeniallistoptions2);
            assertNotNull(deviceenrollmentdeniallistoptions3);
            assertNotSame(deviceenrollmentdeniallistoptions2, deviceenrollmentdeniallistoptions1);
            assertNotSame(deviceenrollmentdeniallistoptions3, deviceenrollmentdeniallistoptions1);
            assertEquals(deviceenrollmentdeniallistoptions2, deviceenrollmentdeniallistoptions1);
            assertEquals(deviceenrollmentdeniallistoptions2, deviceenrollmentdeniallistoptions1);
            assertEquals(deviceenrollmentdeniallistoptions1, deviceenrollmentdeniallistoptions2);
            assertEquals(deviceenrollmentdeniallistoptions1, deviceenrollmentdeniallistoptions1);
            assertFalse(deviceenrollmentdeniallistoptions1.equals(null));
            assertNotEquals(deviceenrollmentdeniallistoptions3, deviceenrollmentdeniallistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
