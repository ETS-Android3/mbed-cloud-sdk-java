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
            AccountListOptions accountlistoptions1 = new AccountListOptions(Integer.valueOf(16), Long.valueOf(126),
                                                                            Order.getDefault(),
                                                                            "f688a8e7-67a4-4542-83f7-492e146b19f7",
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
            AccountListOptions option = new AccountListOptions().equalToTier("d3def68e-e74d-4b80-85e9-ca386de1c2df")
                                                                .equalToStatus(AccountStatus.getDefault())
                                                                .inStatuses(Arrays.asList(AccountStatus.getDefault(),
                                                                                          AccountStatus.getDefault(),
                                                                                          AccountStatus.getDefault(),
                                                                                          AccountStatus.getDefault()))
                                                                .notInStatuses(Arrays.asList(AccountStatus.getDefault(),
                                                                                             AccountStatus.getDefault(),
                                                                                             AccountStatus.getDefault()))
                                                                .equalToEndMarket("8141a823-0367-4df4-887a-0ae3e419ae0e")
                                                                .likeCountry("3551b877-4022-43ec-8b76-4a748c94d3a8");
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(AccountListOptions.TAG_FILTER_BY_TIER));
            assertTrue(option.hasFilter(AccountListOptions.TAG_FILTER_BY_TIER, FilterOperator.EQUAL));
            assertNotNull(option.getTierFilters());
            assertEquals("d3def68e-e74d-4b80-85e9-ca386de1c2df",
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
            assertEquals(Arrays.asList(AccountStatus.getDefault(), AccountStatus.getDefault(),
                                       AccountStatus.getDefault(), AccountStatus.getDefault()),
                         ListOptionsEncoder.encodeSingleInFilter(AccountListOptions.TAG_FILTER_BY_STATUS, List.class,
                                                                 option));
            assertTrue(option.hasFilters(AccountListOptions.TAG_FILTER_BY_STATUS));
            assertTrue(option.hasFilter(AccountListOptions.TAG_FILTER_BY_STATUS, FilterOperator.NOT_IN));
            assertNotNull(option.getStatusFilters());
            assertEquals(Arrays.asList(AccountStatus.getDefault(), AccountStatus.getDefault(),
                                       AccountStatus.getDefault()),
                         ListOptionsEncoder.encodeSingleNotInFilter(AccountListOptions.TAG_FILTER_BY_STATUS, List.class,
                                                                    option));
            assertTrue(option.hasFilters(AccountListOptions.TAG_FILTER_BY_END_MARKET));
            assertTrue(option.hasFilter(AccountListOptions.TAG_FILTER_BY_END_MARKET, FilterOperator.EQUAL));
            assertNotNull(option.getEndMarketFilters());
            assertEquals("8141a823-0367-4df4-887a-0ae3e419ae0e",
                         ListOptionsEncoder.encodeSingleEqualFilter(AccountListOptions.TAG_FILTER_BY_END_MARKET,
                                                                    String.class, option));
            assertTrue(option.hasFilters(AccountListOptions.TAG_FILTER_BY_COUNTRY));
            assertTrue(option.hasFilter(AccountListOptions.TAG_FILTER_BY_COUNTRY, FilterOperator.LIKE));
            assertNotNull(option.getCountryFilters());
            assertEquals("3551b877-4022-43ec-8b76-4a748c94d3a8",
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
            AccountListOptions accountlistoptions1 = new AccountListOptions(Integer.valueOf(88), Long.valueOf(68),
                                                                            Order.getDefault(),
                                                                            "662e3cb2-3c3f-4cd3-8b28-a0dcd0a4f80f",
                                                                            null, null);
            AccountListOptions accountlistoptions2 = new AccountListOptions(Integer.valueOf(88), Long.valueOf(68),
                                                                            Order.getDefault(),
                                                                            "662e3cb2-3c3f-4cd3-8b28-a0dcd0a4f80f",
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
            AccountListOptions accountlistoptions1 = new AccountListOptions(Integer.valueOf(-22), Long.valueOf(56),
                                                                            Order.getDefault(),
                                                                            "fe73232c-db16-439b-a85d-84a2be7156c5",
                                                                            null, null);
            AccountListOptions accountlistoptions2 = new AccountListOptions(Integer.valueOf(-22), Long.valueOf(56),
                                                                            Order.getDefault(),
                                                                            "fe73232c-db16-439b-a85d-84a2be7156c5",
                                                                            null, null);
            AccountListOptions accountlistoptions3 = new AccountListOptions(Integer.valueOf(-26), Long.valueOf(-65),
                                                                            Order.getDefault(),
                                                                            "9bc30763-fd8f-46a4-8951-301907d852bb",
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
