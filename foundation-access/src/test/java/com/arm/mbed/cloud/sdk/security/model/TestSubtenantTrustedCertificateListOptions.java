// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import org.junit.Test;

/**
 * Unit tests for Model SubtenantTrustedCertificateListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestSubtenantTrustedCertificateListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions1 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(112),
                                                                                                                                        Long.valueOf(18),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "33270566-e95d-4491-9a63-413d9b6d667c",
                                                                                                                                        null,
                                                                                                                                        null);
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions2 = subtenanttrustedcertificatelistoptions1.clone();
            assertNotNull(subtenanttrustedcertificatelistoptions1);
            assertNotNull(subtenanttrustedcertificatelistoptions2);
            assertNotSame(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }

    /**
     * Tests the filters method.
     */
    @SuppressWarnings({ "boxing", "resource" })
    @Test
    public void testFilters() {
        try {
            SubtenantTrustedCertificateListOptions option = new SubtenantTrustedCertificateListOptions().equalToValid(Boolean.TRUE)
                                                                                                        .equalToName("3700ad92-ae86-4227-984f-870aa2fd030f")
                                                                                                        .equalToStatus(SubtenantTrustedCertificateStatus.getDefault())
                                                                                                        .equalToDeviceExecutionMode(Integer.valueOf(-63))
                                                                                                        .notEqualToDeviceExecutionMode(Integer.valueOf(19))
                                                                                                        .likeIssuer("91522013-f378-4b82-bf2b-9f6aa1cf2595")
                                                                                                        .equalToService(SubtenantTrustedCertificateService.getDefault())
                                                                                                        .likeSubject("5bbcc52a-75ab-4681-b058-b0ad2c0b2bf9")
                                                                                                        .equalToEnrollmentMode(Boolean.TRUE);
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_VALID));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_VALID,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getValidFilters());
            assertEquals(Boolean.TRUE,
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_VALID,
                                                                    Boolean.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_NAME));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_NAME,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getNameFilters());
            assertEquals("3700ad92-ae86-4227-984f-870aa2fd030f",
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_NAME,
                                                                    String.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_STATUS,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getStatusFilters());
            assertEquals(SubtenantTrustedCertificateStatus.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_STATUS,
                                                                    SubtenantTrustedCertificateStatus.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getDeviceExecutionModeFilters());
            assertEquals(Integer.valueOf(-63),
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                                                    Integer.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                        FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDeviceExecutionModeFilters());
            assertEquals(Integer.valueOf(19),
                         ListOptionsEncoder.encodeSingleNotEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                                                       Integer.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ISSUER));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ISSUER,
                                        FilterOperator.LIKE));
            assertNotNull(option.getIssuerFilters());
            assertEquals("91522013-f378-4b82-bf2b-9f6aa1cf2595",
                         ListOptionsEncoder.encodeSingleLikeFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ISSUER,
                                                                   String.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SERVICE));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SERVICE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getServiceFilters());
            assertEquals(SubtenantTrustedCertificateService.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SERVICE,
                                                                    SubtenantTrustedCertificateService.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SUBJECT));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SUBJECT,
                                        FilterOperator.LIKE));
            assertNotNull(option.getSubjectFilters());
            assertEquals("5bbcc52a-75ab-4681-b058-b0ad2c0b2bf9",
                         ListOptionsEncoder.encodeSingleLikeFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_SUBJECT,
                                                                   String.class, option));
            assertTrue(option.hasFilters(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ENROLLMENT_MODE));
            assertTrue(option.hasFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ENROLLMENT_MODE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getEnrollmentModeFilters());
            assertEquals(Boolean.TRUE,
                         ListOptionsEncoder.encodeSingleEqualFilter(SubtenantTrustedCertificateListOptions.TAG_FILTER_BY_ENROLLMENT_MODE,
                                                                    Boolean.class, option));
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
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions1 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(111),
                                                                                                                                        Long.valueOf(41),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "1dc504b5-bdf6-4df0-b329-ae940e8b746d",
                                                                                                                                        null,
                                                                                                                                        null);
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions2 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(111),
                                                                                                                                        Long.valueOf(41),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "1dc504b5-bdf6-4df0-b329-ae940e8b746d",
                                                                                                                                        null,
                                                                                                                                        null);
            assertNotNull(subtenanttrustedcertificatelistoptions1);
            assertNotNull(subtenanttrustedcertificatelistoptions2);
            assertNotSame(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions2.hashCode(),
                         subtenanttrustedcertificatelistoptions1.hashCode());
            int hashCode = subtenanttrustedcertificatelistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, subtenanttrustedcertificatelistoptions1.hashCode());
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
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions1 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(39),
                                                                                                                                        Long.valueOf(-116),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "07dc9c16-1a3d-4a8d-8297-1ff8e908d1f2",
                                                                                                                                        null,
                                                                                                                                        null);
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions2 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(39),
                                                                                                                                        Long.valueOf(-116),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "07dc9c16-1a3d-4a8d-8297-1ff8e908d1f2",
                                                                                                                                        null,
                                                                                                                                        null);
            SubtenantTrustedCertificateListOptions subtenanttrustedcertificatelistoptions3 = new SubtenantTrustedCertificateListOptions(Integer.valueOf(24),
                                                                                                                                        Long.valueOf(124),
                                                                                                                                        Order.getDefault(),
                                                                                                                                        "0c494d87-7a1e-4449-b0f1-08c5ed3de113",
                                                                                                                                        null,
                                                                                                                                        null);
            assertNotNull(subtenanttrustedcertificatelistoptions1);
            assertNotNull(subtenanttrustedcertificatelistoptions2);
            assertNotNull(subtenanttrustedcertificatelistoptions3);
            assertNotSame(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertNotSame(subtenanttrustedcertificatelistoptions3, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions2, subtenanttrustedcertificatelistoptions1);
            assertEquals(subtenanttrustedcertificatelistoptions1, subtenanttrustedcertificatelistoptions2);
            assertEquals(subtenanttrustedcertificatelistoptions1, subtenanttrustedcertificatelistoptions1);
            assertFalse(subtenanttrustedcertificatelistoptions1.equals(null));
            assertNotEquals(subtenanttrustedcertificatelistoptions3, subtenanttrustedcertificatelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
