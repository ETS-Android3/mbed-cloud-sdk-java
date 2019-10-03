// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * Unit tests for Model AccountListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestAccountListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            AccountListOptions accountlistoptions1 = new AccountListOptions(Integer.valueOf(-22), Long.valueOf(-8),
                                                                            Order.getDefault(),
                                                                            "a6eee972-2f19-44af-a830-341122b90b57",
                                                                            null, null);
            AccountListOptions accountlistoptions2 = accountlistoptions1.clone();
            assertNotNull(accountlistoptions1);
            assertNotNull(accountlistoptions2);
            assertNotSame(accountlistoptions2, accountlistoptions1);
            assertEquals(accountlistoptions2, accountlistoptions1);
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
            AccountListOptions option = new AccountListOptions().equalToTier("b9ce14db-b442-4066-8384-5a7c59dab512")
                                                                .equalToStatus(AccountStatus.getDefault())
                                                                .inStatuses(Arrays.asList(AccountStatus.getDefault()))
                                                                .notInStatuses(Arrays.asList(AccountStatus.getDefault(),
                                                                                             AccountStatus.getDefault(),
                                                                                             AccountStatus.getDefault(),
                                                                                             AccountStatus.getDefault(),
                                                                                             AccountStatus.getDefault(),
                                                                                             AccountStatus.getDefault(),
                                                                                             AccountStatus.getDefault()))
                                                                .equalToEndMarket("c0a46156-64a7-43f2-89c0-1242dc989ebe")
                                                                .likeCountry("731bae98-c760-4029-8e17-9356880515ec");
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(AccountListOptions.TAG_FILTER_BY_TIER));
            assertTrue(option.hasFilter(AccountListOptions.TAG_FILTER_BY_TIER, FilterOperator.EQUAL));
            assertNotNull(option.getTierFilters());
            assertEquals("b9ce14db-b442-4066-8384-5a7c59dab512",
                         ListOptionsEncoder.encodeSingleEqualFilter(AccountListOptions.TAG_FILTER_BY_TIER, String.class,
                                                                    option));
            assertTrue(option.hasFilters(AccountListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(AccountListOptions.TAG_FILTER_BY_STATUS, FilterOperator.EQUAL));
            assertNotNull(option.getStatusFilters());
            assertEquals(AccountStatus.getDefault(),
                         ListOptionsEncoder.encodeSingleEqualFilter(AccountListOptions.TAG_FILTER_BY_STATUS,
                                                                    AccountStatus.class, option));
            assertTrue(option.hasFilters(AccountListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(AccountListOptions.TAG_FILTER_BY_STATUS, FilterOperator.IN));
            assertNotNull(option.getStatusFilters());
            assertEquals(Arrays.asList(AccountStatus.getDefault()),
                         ListOptionsEncoder.encodeSingleInFilter(AccountListOptions.TAG_FILTER_BY_STATUS, List.class,
                                                                 option));
            assertTrue(option.hasFilters(AccountListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(AccountListOptions.TAG_FILTER_BY_STATUS, FilterOperator.NOT_IN));
            assertNotNull(option.getStatusFilters());
            assertEquals(Arrays.asList(AccountStatus.getDefault(), AccountStatus.getDefault(),
                                       AccountStatus.getDefault(), AccountStatus.getDefault(),
                                       AccountStatus.getDefault(), AccountStatus.getDefault(),
                                       AccountStatus.getDefault()),
                         ListOptionsEncoder.encodeSingleNotInFilter(AccountListOptions.TAG_FILTER_BY_STATUS, List.class,
                                                                    option));
            assertTrue(option.hasFilters(AccountListOptions.TAG_FILTER_BY_END_MARKET));
            assertTrue(option.hasFilter(AccountListOptions.TAG_FILTER_BY_END_MARKET, FilterOperator.EQUAL));
            assertNotNull(option.getEndMarketFilters());
            assertEquals("c0a46156-64a7-43f2-89c0-1242dc989ebe",
                         ListOptionsEncoder.encodeSingleEqualFilter(AccountListOptions.TAG_FILTER_BY_END_MARKET,
                                                                    String.class, option));
            assertTrue(option.hasFilters(AccountListOptions.TAG_FILTER_BY_COUNTRY));
            assertTrue(option.hasFilter(AccountListOptions.TAG_FILTER_BY_COUNTRY, FilterOperator.LIKE));
            assertNotNull(option.getCountryFilters());
            assertEquals("731bae98-c760-4029-8e17-9356880515ec",
                         ListOptionsEncoder.encodeSingleLikeFilter(AccountListOptions.TAG_FILTER_BY_COUNTRY,
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
            AccountListOptions accountlistoptions1 = new AccountListOptions(Integer.valueOf(-40), Long.valueOf(90),
                                                                            Order.getDefault(),
                                                                            "342611e5-ceb8-4f3d-80ff-452fa6d51fd8",
                                                                            null, null);
            AccountListOptions accountlistoptions2 = new AccountListOptions(Integer.valueOf(-40), Long.valueOf(90),
                                                                            Order.getDefault(),
                                                                            "342611e5-ceb8-4f3d-80ff-452fa6d51fd8",
                                                                            null, null);
            assertNotNull(accountlistoptions1);
            assertNotNull(accountlistoptions2);
            assertNotSame(accountlistoptions2, accountlistoptions1);
            assertEquals(accountlistoptions2, accountlistoptions1);
            assertEquals(accountlistoptions2.hashCode(), accountlistoptions1.hashCode());
            int hashCode = accountlistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, accountlistoptions1.hashCode());
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
            AccountListOptions accountlistoptions1 = new AccountListOptions(Integer.valueOf(25), Long.valueOf(95),
                                                                            Order.getDefault(),
                                                                            "cc524ca9-60c3-4ba3-90b3-7ae5aba0aa04",
                                                                            null, null);
            AccountListOptions accountlistoptions2 = new AccountListOptions(Integer.valueOf(25), Long.valueOf(95),
                                                                            Order.getDefault(),
                                                                            "cc524ca9-60c3-4ba3-90b3-7ae5aba0aa04",
                                                                            null, null);
            AccountListOptions accountlistoptions3 = new AccountListOptions(Integer.valueOf(-96), Long.valueOf(-104),
                                                                            Order.getDefault(),
                                                                            "81b3e156-ab78-4772-bd19-83faedc61d10",
                                                                            null, null);
            assertNotNull(accountlistoptions1);
            assertNotNull(accountlistoptions2);
            assertNotNull(accountlistoptions3);
            assertNotSame(accountlistoptions2, accountlistoptions1);
            assertNotSame(accountlistoptions3, accountlistoptions1);
            assertEquals(accountlistoptions2, accountlistoptions1);
            assertEquals(accountlistoptions2, accountlistoptions1);
            assertEquals(accountlistoptions1, accountlistoptions2);
            assertEquals(accountlistoptions1, accountlistoptions1);
            assertFalse(accountlistoptions1.equals(null));
            assertNotEquals(accountlistoptions3, accountlistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
