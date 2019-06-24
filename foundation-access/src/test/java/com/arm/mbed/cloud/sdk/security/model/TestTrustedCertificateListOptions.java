// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import org.junit.Test;

/**
 * Unit tests for Model TrustedCertificateListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestTrustedCertificateListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            TrustedCertificateListOptions trustedcertificatelistoptions1 = new TrustedCertificateListOptions(Integer.valueOf(-84),
                                                                                                             Long.valueOf(122),
                                                                                                             Order.getDefault(),
                                                                                                             "a028dc8e-bf1b-4fd2-97c0-7a3067244e6b",
                                                                                                             null,
                                                                                                             null);
            TrustedCertificateListOptions trustedcertificatelistoptions2 = trustedcertificatelistoptions1.clone();
            assertNotNull(trustedcertificatelistoptions1);
            assertNotNull(trustedcertificatelistoptions2);
            assertNotSame(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
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
            TrustedCertificateListOptions option = new TrustedCertificateListOptions().equalToValid(Boolean.TRUE)
                                                                                      .equalToName("0434666f-8be4-4096-932a-901c50a0ac37")
                                                                                      .equalToStatus(TrustedCertificateStatus.getDefault())
                                                                                      .equalToDeviceExecutionMode(Integer.valueOf(-68))
                                                                                      .notEqualToDeviceExecutionMode(Integer.valueOf(95))
                                                                                      .likeIssuer("effbeab3-12d7-48bc-ba4a-c7e074e22b1c")
                                                                                      .equalToService(TrustedCertificateService.getDefault())
                                                                                      .likeSubject("97b29422-28da-4c0b-a4ac-e9335477e446")
                                                                                      .equalToEnrollmentMode(Boolean.TRUE);
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_VALID));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_VALID, FilterOperator.EQUAL));
            assertNotNull(option.getValidFilters());
            assertEquals(Boolean.TRUE,
                         ListOptionsEncoder.encodeSingleEqualFilter(TrustedCertificateListOptions.TAG_FILTER_BY_VALID,
                                                                    Boolean.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_NAME));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_NAME, FilterOperator.EQUAL));
            assertNotNull(option.getNameFilters());
            assertEquals("0434666f-8be4-4096-932a-901c50a0ac37",
                         ListOptionsEncoder.encodeSingleEqualFilter(TrustedCertificateListOptions.TAG_FILTER_BY_NAME,
                                                                    String.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_STATUS, FilterOperator.EQUAL));
            assertNotNull(option.getStatusFilters());
            assertEquals(TrustedCertificateStatus.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(TrustedCertificateListOptions.TAG_FILTER_BY_STATUS,
                                                                    TrustedCertificateStatus.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getDeviceExecutionModeFilters());
            assertEquals(Integer.valueOf(-68),
                         ListOptionsEncoder.encodeSingleEqualFilter(TrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                                                    Integer.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                        FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDeviceExecutionModeFilters());
            assertEquals(Integer.valueOf(95),
                         ListOptionsEncoder.encodeSingleNotEqualFilter(TrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                                                       Integer.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_ISSUER));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_ISSUER, FilterOperator.LIKE));
            assertNotNull(option.getIssuerFilters());
            assertEquals("effbeab3-12d7-48bc-ba4a-c7e074e22b1c",
                         ListOptionsEncoder.encodeSingleLikeFilter(TrustedCertificateListOptions.TAG_FILTER_BY_ISSUER,
                                                                   String.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_SERVICE));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_SERVICE, FilterOperator.EQUAL));
            assertNotNull(option.getServiceFilters());
            assertEquals(TrustedCertificateService.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(TrustedCertificateListOptions.TAG_FILTER_BY_SERVICE,
                                                                    TrustedCertificateService.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_SUBJECT));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_SUBJECT, FilterOperator.LIKE));
            assertNotNull(option.getSubjectFilters());
            assertEquals("97b29422-28da-4c0b-a4ac-e9335477e446",
                         ListOptionsEncoder.encodeSingleLikeFilter(TrustedCertificateListOptions.TAG_FILTER_BY_SUBJECT,
                                                                   String.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_ENROLLMENT_MODE));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_ENROLLMENT_MODE,
                                        FilterOperator.EQUAL));
            assertNotNull(option.getEnrollmentModeFilters());
            assertEquals(Boolean.TRUE,
                         ListOptionsEncoder.encodeSingleEqualFilter(TrustedCertificateListOptions.TAG_FILTER_BY_ENROLLMENT_MODE,
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
            TrustedCertificateListOptions trustedcertificatelistoptions1 = new TrustedCertificateListOptions(Integer.valueOf(9),
                                                                                                             Long.valueOf(-32),
                                                                                                             Order.getDefault(),
                                                                                                             "20060b07-13b7-4800-8560-453982ca2725",
                                                                                                             null,
                                                                                                             null);
            TrustedCertificateListOptions trustedcertificatelistoptions2 = new TrustedCertificateListOptions(Integer.valueOf(9),
                                                                                                             Long.valueOf(-32),
                                                                                                             Order.getDefault(),
                                                                                                             "20060b07-13b7-4800-8560-453982ca2725",
                                                                                                             null,
                                                                                                             null);
            assertNotNull(trustedcertificatelistoptions1);
            assertNotNull(trustedcertificatelistoptions2);
            assertNotSame(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions2.hashCode(), trustedcertificatelistoptions1.hashCode());
            int hashCode = trustedcertificatelistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, trustedcertificatelistoptions1.hashCode());
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
            TrustedCertificateListOptions trustedcertificatelistoptions1 = new TrustedCertificateListOptions(Integer.valueOf(-112),
                                                                                                             Long.valueOf(-34),
                                                                                                             Order.getDefault(),
                                                                                                             "ceefbc0e-dbbb-47da-a7bc-a550696f1f37",
                                                                                                             null,
                                                                                                             null);
            TrustedCertificateListOptions trustedcertificatelistoptions2 = new TrustedCertificateListOptions(Integer.valueOf(-112),
                                                                                                             Long.valueOf(-34),
                                                                                                             Order.getDefault(),
                                                                                                             "ceefbc0e-dbbb-47da-a7bc-a550696f1f37",
                                                                                                             null,
                                                                                                             null);
            TrustedCertificateListOptions trustedcertificatelistoptions3 = new TrustedCertificateListOptions(Integer.valueOf(25),
                                                                                                             Long.valueOf(-96),
                                                                                                             Order.getDefault(),
                                                                                                             "4dd6352d-1108-41fe-bcc5-74d24a05c610",
                                                                                                             null,
                                                                                                             null);
            assertNotNull(trustedcertificatelistoptions1);
            assertNotNull(trustedcertificatelistoptions2);
            assertNotNull(trustedcertificatelistoptions3);
            assertNotSame(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertNotSame(trustedcertificatelistoptions3, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions2, trustedcertificatelistoptions1);
            assertEquals(trustedcertificatelistoptions1, trustedcertificatelistoptions2);
            assertEquals(trustedcertificatelistoptions1, trustedcertificatelistoptions1);
            assertFalse(trustedcertificatelistoptions1.equals(null));
            assertNotEquals(trustedcertificatelistoptions3, trustedcertificatelistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
