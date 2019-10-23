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
            ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(Integer.valueOf(83), Long.valueOf(-75),
                                                                         Order.getDefault(),
                                                                         "7aab71c2-bf0e-4d3d-b254-16671f280f81", null,
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
            ApiKeyListOptions option = new ApiKeyListOptions().equalToOwner("f9b8167d-ca3c-4a40-91bc-4475316f9961")
                                                              .equalToKey("47cbe787-82d4-4422-b90b-a30125739aed");
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(ApiKeyListOptions.TAG_FILTER_BY_OWNER));
            assertTrue(option.hasFilter(ApiKeyListOptions.TAG_FILTER_BY_OWNER, FilterOperator.EQUAL));
            assertNotNull(option.getOwnerFilters());
            assertEquals("f9b8167d-ca3c-4a40-91bc-4475316f9961",
                         ListOptionsEncoder.encodeSingleEqualFilter(ApiKeyListOptions.TAG_FILTER_BY_OWNER, String.class,
                                                                    option));
            assertTrue(option.hasFilters(ApiKeyListOptions.TAG_FILTER_BY_KEY));
            assertTrue(option.hasFilter(ApiKeyListOptions.TAG_FILTER_BY_KEY, FilterOperator.EQUAL));
            assertNotNull(option.getKeyFilters());
            assertEquals("47cbe787-82d4-4422-b90b-a30125739aed",
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
            ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(Integer.valueOf(19), Long.valueOf(43),
                                                                         Order.getDefault(),
                                                                         "7bce56f4-9a62-4cae-a8b9-f16cd1c113ff", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions2 = new ApiKeyListOptions(Integer.valueOf(19), Long.valueOf(43),
                                                                         Order.getDefault(),
                                                                         "7bce56f4-9a62-4cae-a8b9-f16cd1c113ff", null,
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
            ApiKeyListOptions apikeylistoptions1 = new ApiKeyListOptions(Integer.valueOf(-3), Long.valueOf(101),
                                                                         Order.getDefault(),
                                                                         "06034a01-d2a0-4703-8c38-6bfad4b2e865", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions2 = new ApiKeyListOptions(Integer.valueOf(-3), Long.valueOf(101),
                                                                         Order.getDefault(),
                                                                         "06034a01-d2a0-4703-8c38-6bfad4b2e865", null,
                                                                         null);
            ApiKeyListOptions apikeylistoptions3 = new ApiKeyListOptions(Integer.valueOf(-109), Long.valueOf(12),
                                                                         Order.getDefault(),
                                                                         "68924617-0ae0-4b34-a1e2-7b8acdd885fb", null,
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
