// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CampaignStatistics.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCampaignStatistics {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CampaignStatistics campaignstatistics1 = new CampaignStatistics("e0b24a4d-7bef-4288-ab59-0a1396b17c30", 21,
                                                                            new Date(1559833513795L),
                                                                            CampaignStatisticsId.getDefault(),
                                                                            CampaignStatisticsSummaryStatus.getDefault());
            CampaignStatistics campaignstatistics2 = campaignstatistics1.clone();
            assertNotNull(campaignstatistics1);
            assertNotNull(campaignstatistics2);
            assertNotSame(campaignstatistics2, campaignstatistics1);
            assertEquals(campaignstatistics2, campaignstatistics1);
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
            CampaignStatistics campaignstatistics1 = new CampaignStatistics("9465c1b5-8498-47fc-8a77-a155488ff16d", 9,
                                                                            new Date(1559833505504L),
                                                                            CampaignStatisticsId.getDefault(),
                                                                            CampaignStatisticsSummaryStatus.getDefault());
            CampaignStatistics campaignstatistics2 = new CampaignStatistics("9465c1b5-8498-47fc-8a77-a155488ff16d", 9,
                                                                            new Date(1559833505504L),
                                                                            CampaignStatisticsId.getDefault(),
                                                                            CampaignStatisticsSummaryStatus.getDefault());
            assertNotNull(campaignstatistics1);
            assertNotNull(campaignstatistics2);
            assertNotSame(campaignstatistics2, campaignstatistics1);
            assertEquals(campaignstatistics2, campaignstatistics1);
            assertEquals(campaignstatistics2.hashCode(), campaignstatistics1.hashCode());
            int hashCode = campaignstatistics1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, campaignstatistics1.hashCode());
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
        CampaignStatistics campaignstatistics = new CampaignStatistics("8d7e6ca4-016d-4c7f-a8ca-655e175ce6ca", 73,
                                                                       new Date(1559833510110L),
                                                                       CampaignStatisticsId.getDefault(),
                                                                       CampaignStatisticsSummaryStatus.getDefault());
        assertTrue(campaignstatistics.isValid());
        CampaignStatistics campaignstatisticsInvalid = new CampaignStatistics(null, 98, new Date(1559833513533L),
                                                                              CampaignStatisticsId.getDefault(),
                                                                              CampaignStatisticsSummaryStatus.getDefault());
        assertFalse(campaignstatisticsInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CampaignStatistics campaignstatistics1 = new CampaignStatistics("1d1d3ff4-686e-4611-a60b-2b447f5011aa",
                                                                            -113, new Date(1559833508402L),
                                                                            CampaignStatisticsId.getDefault(),
                                                                            CampaignStatisticsSummaryStatus.getDefault());
            CampaignStatistics campaignstatistics2 = new CampaignStatistics("1d1d3ff4-686e-4611-a60b-2b447f5011aa",
                                                                            -113, new Date(1559833508402L),
                                                                            CampaignStatisticsId.getDefault(),
                                                                            CampaignStatisticsSummaryStatus.getDefault());
            CampaignStatistics campaignstatistics3 = new CampaignStatistics("0a05606d-d7ba-4b12-8610-1b79e0bd2d4b", -93,
                                                                            new Date(1559833509885L),
                                                                            CampaignStatisticsId.getDefault(),
                                                                            CampaignStatisticsSummaryStatus.getDefault());
            assertNotNull(campaignstatistics1);
            assertNotNull(campaignstatistics2);
            assertNotNull(campaignstatistics3);
            assertNotSame(campaignstatistics2, campaignstatistics1);
            assertNotSame(campaignstatistics3, campaignstatistics1);
            assertEquals(campaignstatistics2, campaignstatistics1);
            assertEquals(campaignstatistics2, campaignstatistics1);
            assertEquals(campaignstatistics1, campaignstatistics2);
            assertEquals(campaignstatistics1, campaignstatistics1);
            assertFalse(campaignstatistics1.equals(null));
            assertNotEquals(campaignstatistics3, campaignstatistics1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
