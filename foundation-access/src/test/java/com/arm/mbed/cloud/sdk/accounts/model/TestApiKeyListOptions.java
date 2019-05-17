// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import org.junit.Test;

/**
 * Unit tests for Model ApiKeyListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestApiKeyListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(Integer.valueOf(-14), Long.valueOf(-64),
                                                                         Order.getDefault(),
                                                                         "2bbfbe65-2ca7-46de-b1fe-f03789b1ea41", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions2 = apikeylistoptions1.clone();
            assertNotNull(apikeylistoptions1);
            assertNotNull(apikeylistoptions2);
            assertNotSame(apikeylistoptions2, apikeylistoptions1);
            assertEquals(apikeylistoptions2, apikeylistoptions1);
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
            ApiKeyListOptions option = new ApiKeyListOptions().equalToOwner("f435954f-4866-4f36-a2cc-13c67b53ce11")
                                                              .equalToKey("2fe0746d-efae-41ec-b126-8f68ec91a076");
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(ApiKeyListOptions.TAG_FILTER_BY_OWNER));
            assertTrue(option.hasFilter(ApiKeyListOptions.TAG_FILTER_BY_OWNER, FilterOperator.EQUAL));
            assertNotNull(option.getOwnerFilters());
            assertEquals("f435954f-4866-4f36-a2cc-13c67b53ce11",
                         ListOptionsEncoder.encodeSingleEqualFilter(ApiKeyListOptions.TAG_FILTER_BY_OWNER, String.class,
                                                                    option));
            assertTrue(option.hasFilters(ApiKeyListOptions.TAG_FILTER_BY_KEY));
            assertTrue(option.hasFilter(ApiKeyListOptions.TAG_FILTER_BY_KEY, FilterOperator.EQUAL));
            assertNotNull(option.getKeyFilters());
            assertEquals("2fe0746d-efae-41ec-b126-8f68ec91a076",
                         ListOptionsEncoder.encodeSingleEqualFilter(ApiKeyListOptions.TAG_FILTER_BY_KEY, String.class,
                                                                    option));
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
            ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(Integer.valueOf(-74), Long.valueOf(81),
                                                                         Order.getDefault(),
                                                                         "9800c8b8-ca8e-4348-b4a1-7780ab339997", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions2 = new ApiKeyListOptions(Integer.valueOf(-74), Long.valueOf(81),
                                                                         Order.getDefault(),
                                                                         "9800c8b8-ca8e-4348-b4a1-7780ab339997", null,
                                                                         null);
            assertNotNull(apikeylistoptions1);
            assertNotNull(apikeylistoptions2);
            assertNotSame(apikeylistoptions2, apikeylistoptions1);
            assertEquals(apikeylistoptions2, apikeylistoptions1);
            assertEquals(apikeylistoptions2.hashCode(), apikeylistoptions1.hashCode());
            int hashCode = apikeylistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, apikeylistoptions1.hashCode());
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
            ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(Integer.valueOf(21), Long.valueOf(-82),
                                                                         Order.getDefault(),
                                                                         "ce17cf92-9ac4-4d83-87ff-c06424b35466", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions2 = new ApiKeyListOptions(Integer.valueOf(21), Long.valueOf(-82),
                                                                         Order.getDefault(),
                                                                         "ce17cf92-9ac4-4d83-87ff-c06424b35466", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions3 = new ApiKeyListOptions(Integer.valueOf(98), Long.valueOf(118),
                                                                         Order.getDefault(),
                                                                         "8fc9dcae-c49b-4bf6-9011-d79da8978b92", null,
                                                                         null);
            assertNotNull(apikeylistoptions1);
            assertNotNull(apikeylistoptions2);
            assertNotNull(apikeylistoptions3);
            assertNotSame(apikeylistoptions2, apikeylistoptions1);
            assertNotSame(apikeylistoptions3, apikeylistoptions1);
            assertEquals(apikeylistoptions2, apikeylistoptions1);
            assertEquals(apikeylistoptions2, apikeylistoptions1);
            assertEquals(apikeylistoptions1, apikeylistoptions2);
            assertEquals(apikeylistoptions1, apikeylistoptions1);
            assertFalse(apikeylistoptions1.equals(null));
            assertNotEquals(apikeylistoptions3, apikeylistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
