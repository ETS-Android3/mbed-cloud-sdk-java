// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CampaignStatisticsEvents.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCampaignStatisticsEvents {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CampaignStatisticsEvents campaignstatisticsevents1 = new CampaignStatisticsEvents("def8039d-2c49-46a6-be30-5f37ae743209",
                                                                                              -46,
                                                                                              new Date(1559833511816L),
                                                                                              "3f88e928-d0ba-4fef-9754-2eb3193108eb",
                                                                                              "c84f11ef-3399-42c1-afc4-6095f86cd627",
                                                                                              "2d2d7c42-ca36-44b1-9e82-b3a96573d229",
                                                                                              "fba90360-bd92-4af3-a310-660862d81d50",
                                                                                              "e94f0c95-c25f-437b-872d-e61db23170a7");
            CampaignStatisticsEvents campaignstatisticsevents2 = campaignstatisticsevents1.clone();
            assertNotNull(campaignstatisticsevents1);
            assertNotNull(campaignstatisticsevents2);
            assertNotSame(campaignstatisticsevents2, campaignstatisticsevents1);
            assertEquals(campaignstatisticsevents2, campaignstatisticsevents1);
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
            CampaignStatisticsEvents campaignstatisticsevents1 = new CampaignStatisticsEvents("d7260c5a-4ed8-4067-9b44-fb2d245a2aea",
                                                                                              -30,
                                                                                              new Date(1559833509581L),
                                                                                              "52169a58-515e-419b-8a1e-c572b777218a",
                                                                                              "dbab791a-abf5-43f6-bd83-8d06f43d880b",
                                                                                              "411f84fd-a772-4919-8e8a-bc0c4340a0be",
                                                                                              "035d867a-57ff-465c-85b3-305ef40d2931",
                                                                                              "240efe2f-e6b1-437b-9352-56882478aebf");
            CampaignStatisticsEvents campaignstatisticsevents2 = new CampaignStatisticsEvents("d7260c5a-4ed8-4067-9b44-fb2d245a2aea",
                                                                                              -30,
                                                                                              new Date(1559833509581L),
                                                                                              "52169a58-515e-419b-8a1e-c572b777218a",
                                                                                              "dbab791a-abf5-43f6-bd83-8d06f43d880b",
                                                                                              "411f84fd-a772-4919-8e8a-bc0c4340a0be",
                                                                                              "035d867a-57ff-465c-85b3-305ef40d2931",
                                                                                              "240efe2f-e6b1-437b-9352-56882478aebf");
            assertNotNull(campaignstatisticsevents1);
            assertNotNull(campaignstatisticsevents2);
            assertNotSame(campaignstatisticsevents2, campaignstatisticsevents1);
            assertEquals(campaignstatisticsevents2, campaignstatisticsevents1);
            assertEquals(campaignstatisticsevents2.hashCode(), campaignstatisticsevents1.hashCode());
            int hashCode = campaignstatisticsevents1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, campaignstatisticsevents1.hashCode());
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
        CampaignStatisticsEvents campaignstatisticsevents = new CampaignStatisticsEvents("e140ddfc-a2b5-4a99-9ccf-cc45db8a207c",
                                                                                         74, new Date(1559833515136L),
                                                                                         "da1c0b36-c1e9-4de0-81b8-eae617bb7866",
                                                                                         "5dc58d65-b418-44aa-b9f0-bd08853506b4",
                                                                                         "a1ecbd8e-8e62-44f5-adeb-c812faa15643",
                                                                                         "78deefdf-60f0-4e74-9674-8a87d6d0345a",
                                                                                         "179dd60c-d801-4b99-97ac-17605145c5ad");
        assertTrue(campaignstatisticsevents.isValid());
        CampaignStatisticsEvents campaignstatisticseventsInvalid = new CampaignStatisticsEvents(null, 103,
                                                                                                new Date(1559833507777L),
                                                                                                "0f26ce55-b3c5-4d10-9781-3ebc42e2c50c",
                                                                                                "10c0e458-f6b5-48df-a3ac-bd5ce6b9661f",
                                                                                                "0f7b0ed4-498b-4f8e-b0aa-ecf26422abc9",
                                                                                                "89033c8b-385c-4b84-be37-f489648d7987",
                                                                                                null);
        assertFalse(campaignstatisticseventsInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CampaignStatisticsEvents campaignstatisticsevents1 = new CampaignStatisticsEvents("185df050-e76e-4e7f-85db-27e78bfd657a",
                                                                                              -73,
                                                                                              new Date(1559833510555L),
                                                                                              "eb6cb721-1293-4619-b473-6fe3e182b414",
                                                                                              "307781d0-58ac-44bf-9b35-cbd4d1e5de3a",
                                                                                              "b570e652-5bc3-4c6d-95fe-72d8db0efe3b",
                                                                                              "68f31b73-3b2d-4db5-a837-78d77544ab42",
                                                                                              "6db0b733-5c0a-4e04-980a-e9bdf831af21");
            CampaignStatisticsEvents campaignstatisticsevents2 = new CampaignStatisticsEvents("185df050-e76e-4e7f-85db-27e78bfd657a",
                                                                                              -73,
                                                                                              new Date(1559833510555L),
                                                                                              "eb6cb721-1293-4619-b473-6fe3e182b414",
                                                                                              "307781d0-58ac-44bf-9b35-cbd4d1e5de3a",
                                                                                              "b570e652-5bc3-4c6d-95fe-72d8db0efe3b",
                                                                                              "68f31b73-3b2d-4db5-a837-78d77544ab42",
                                                                                              "6db0b733-5c0a-4e04-980a-e9bdf831af21");
            CampaignStatisticsEvents campaignstatisticsevents3 = new CampaignStatisticsEvents("0b0212da-1718-4b02-a0b1-f74d03825c55",
                                                                                              86,
                                                                                              new Date(1559833512728L),
                                                                                              "5d8c3697-baad-4c04-90d6-cb94385e069e",
                                                                                              "0f45a513-5fe4-4d70-81b0-06e8af27e8f2",
                                                                                              "a3f8613a-af06-483d-a9f4-d3379de43573",
                                                                                              "0b4c2b93-cf62-4434-a155-375248135721",
                                                                                              "472201e5-8478-430f-806b-3968a1aa7cec");
            assertNotNull(campaignstatisticsevents1);
            assertNotNull(campaignstatisticsevents2);
            assertNotNull(campaignstatisticsevents3);
            assertNotSame(campaignstatisticsevents2, campaignstatisticsevents1);
            assertNotSame(campaignstatisticsevents3, campaignstatisticsevents1);
            assertEquals(campaignstatisticsevents2, campaignstatisticsevents1);
            assertEquals(campaignstatisticsevents2, campaignstatisticsevents1);
            assertEquals(campaignstatisticsevents1, campaignstatisticsevents2);
            assertEquals(campaignstatisticsevents1, campaignstatisticsevents1);
            assertFalse(campaignstatisticsevents1.equals(null));
            assertNotEquals(campaignstatisticsevents3, campaignstatisticsevents1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
