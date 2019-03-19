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
            TrustedCertificateListOptions trustedcertificatelistoptions1 = new TrustedCertificateListOptions(Integer.valueOf(-75),
                                                                                                             Long.valueOf(90),
                                                                                                             Order.getDefault(),
                                                                                                             "43b8d6fe-3eb2-4486-8807-c597841bfd65",
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
    @SuppressWarnings("resource")
    @Test
    public void testFilters() {
        try {
            TrustedCertificateListOptions option = new TrustedCertificateListOptions().equalToValid(Boolean.FALSE)
                                                                                      .equalToName("44a7cafe-5aeb-4865-96b3-d3f229a07c2f")
                                                                                      .equalToStatus(TrustedCertificateStatus.getDefault())
                                                                                      .equalToDeviceExecutionMode(Integer.valueOf(47))
                                                                                      .notEqualToDeviceExecutionMode(Integer.valueOf(32))
                                                                                      .likeIssuer("d112bb35-8143-4c8c-989a-311544f6c020")
                                                                                      .equalToService(TrustedCertificateService.getDefault())
                                                                                      .likeSubject("56404eb2-43fb-43fa-8f21-da80f3c955b4")
                                                                                      .equalToEnrollmentMode(Boolean.TRUE);
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_VALID));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_VALID, FilterOperator.EQUAL));
            assertNotNull(option.getValidFilters());
            assertEquals(Boolean.FALSE,
                         ListOptionsEncoder.encodeSingleEqualFilter(TrustedCertificateListOptions.TAG_FILTER_BY_VALID,
                                                                    Boolean.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_NAME));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_NAME, FilterOperator.EQUAL));
            assertNotNull(option.getNameFilters());
            assertEquals("44a7cafe-5aeb-4865-96b3-d3f229a07c2f",
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
            assertEquals(Integer.valueOf(47),
                         ListOptionsEncoder.encodeSingleEqualFilter(TrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                                                    Integer.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                        FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDeviceExecutionModeFilters());
            assertEquals(Integer.valueOf(32),
                         ListOptionsEncoder.encodeSingleNotEqualFilter(TrustedCertificateListOptions.TAG_FILTER_BY_DEVICE_EXECUTION_MODE,
                                                                       Integer.class, option));
            assertTrue(option.hasFilters(TrustedCertificateListOptions.TAG_FILTER_BY_ISSUER));
            assertTrue(option.hasFilter(TrustedCertificateListOptions.TAG_FILTER_BY_ISSUER, FilterOperator.LIKE));
            assertNotNull(option.getIssuerFilters());
            assertEquals("d112bb35-8143-4c8c-989a-311544f6c020",
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
            assertEquals("56404eb2-43fb-43fa-8f21-da80f3c955b4",
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
            TrustedCertificateListOptions trustedcertificatelistoptions1 = new TrustedCertificateListOptions(Integer.valueOf(-111),
                                                                                                             Long.valueOf(121),
                                                                                                             Order.getDefault(),
                                                                                                             "76fee61c-5139-4a53-a02e-19aef7395203",
                                                                                                             null,
                                                                                                             null);
            TrustedCertificateListOptions trustedcertificatelistoptions2 = new TrustedCertificateListOptions(Integer.valueOf(-111),
                                                                                                             Long.valueOf(121),
                                                                                                             Order.getDefault(),
                                                                                                             "76fee61c-5139-4a53-a02e-19aef7395203",
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
            TrustedCertificateListOptions trustedcertificatelistoptions1 = new TrustedCertificateListOptions(Integer.valueOf(71),
                                                                                                             Long.valueOf(-81),
                                                                                                             Order.getDefault(),
                                                                                                             "bc750801-37d6-4f5b-afa0-b2fda682d5aa",
                                                                                                             null,
                                                                                                             null);
            TrustedCertificateListOptions trustedcertificatelistoptions2 = new TrustedCertificateListOptions(Integer.valueOf(71),
                                                                                                             Long.valueOf(-81),
                                                                                                             Order.getDefault(),
                                                                                                             "bc750801-37d6-4f5b-afa0-b2fda682d5aa",
                                                                                                             null,
                                                                                                             null);
            TrustedCertificateListOptions trustedcertificatelistoptions3 = new TrustedCertificateListOptions(Integer.valueOf(-99),
                                                                                                             Long.valueOf(80),
                                                                                                             Order.getDefault(),
                                                                                                             "0ea1d42b-0b6e-4b3f-874f-fb2fa416c310",
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
