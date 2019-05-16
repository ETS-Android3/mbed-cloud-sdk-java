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
            CampaignStatisticsEvents campaignstatisticsevents1 = new CampaignStatisticsEvents("9dcf0f8b-2f9c-4b4c-8783-87e430e2aff3",
                                                                                              -64,
                                                                                              new Date(1558018690975L),
                                                                                              "3372ffef-3a5c-4769-82f3-3ba7378a2b5c",
                                                                                              "84cc8a16-cb6d-44b7-b565-357b9861818f",
                                                                                              "04927422-3a86-4511-8780-3eeed8cae546",
                                                                                              "fb51de10-5126-4af1-ace0-2dded16a71a6",
                                                                                              "4817e590-70d2-45db-88c8-157c6fa5d15e");
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
            CampaignStatisticsEvents campaignstatisticsevents1 = new CampaignStatisticsEvents("a2be1577-52ea-497e-bfb0-ee130f8c90f2",
                                                                                              -103,
                                                                                              new Date(1558018683460L),
                                                                                              "2fd31c68-cdaf-42a3-8f88-6f176a5c78b3",
                                                                                              "a7b67d6c-e835-42fe-a1f5-fbd655196959",
                                                                                              "abac8783-db05-4753-8224-54aaa41aee55",
                                                                                              "39f014cf-0f99-49d0-9f29-650f705baa1c",
                                                                                              "7dc29e63-5c40-48c0-b750-514ccfb6504b");
            CampaignStatisticsEvents campaignstatisticsevents2 = new CampaignStatisticsEvents("a2be1577-52ea-497e-bfb0-ee130f8c90f2",
                                                                                              -103,
                                                                                              new Date(1558018683460L),
                                                                                              "2fd31c68-cdaf-42a3-8f88-6f176a5c78b3",
                                                                                              "a7b67d6c-e835-42fe-a1f5-fbd655196959",
                                                                                              "abac8783-db05-4753-8224-54aaa41aee55",
                                                                                              "39f014cf-0f99-49d0-9f29-650f705baa1c",
                                                                                              "7dc29e63-5c40-48c0-b750-514ccfb6504b");
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
        CampaignStatisticsEvents campaignstatisticsevents = new CampaignStatisticsEvents("1181b463-d1c8-4169-be70-2c15a6b653c4",
                                                                                         -25, new Date(1558018688848L),
                                                                                         "4449344e-d679-4168-9087-bce3aabc9a4b",
                                                                                         "67767d78-611d-47c4-83be-36571636933e",
                                                                                         "e17fdd4f-8367-4291-a429-471cbc222233",
                                                                                         "79067ad7-220b-4337-a77f-587c73e11631",
                                                                                         "1cbac37e-b632-46f1-bb3c-fa0a54238f48");
        assertTrue(campaignstatisticsevents.isValid());
        CampaignStatisticsEvents campaignstatisticseventsInvalid = new CampaignStatisticsEvents(null, 39,
                                                                                                new Date(1558018686036L),
                                                                                                "d52731b8-fee3-4ddd-9d40-e651634a2fc2",
                                                                                                "eb122b3e-f5e8-4f6a-8c6f-8f7bfa169d81",
                                                                                                "fc8e2472-f48c-417b-bf4a-21ec6850a84c",
                                                                                                "cbf32279-e8f0-40e5-920c-bdf7248ceb62",
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
            CampaignStatisticsEvents campaignstatisticsevents1 = new CampaignStatisticsEvents("492f191d-92ad-4ab9-9759-5254be650bbd",
                                                                                              115,
                                                                                              new Date(1558018686806L),
                                                                                              "7d888362-50e8-4f14-b33e-2bf0e8e01cd9",
                                                                                              "e7996e8e-53a0-4aff-a9dd-ccab17b65379",
                                                                                              "833f9d26-bcad-4472-8cda-2f9f89b3bcc3",
                                                                                              "a7ba6043-f6de-46e4-9bb2-130a3ccbc7b8",
                                                                                              "475c9d03-45b5-4f81-a001-018af61a1ff3");
            CampaignStatisticsEvents campaignstatisticsevents2 = new CampaignStatisticsEvents("492f191d-92ad-4ab9-9759-5254be650bbd",
                                                                                              115,
                                                                                              new Date(1558018686806L),
                                                                                              "7d888362-50e8-4f14-b33e-2bf0e8e01cd9",
                                                                                              "e7996e8e-53a0-4aff-a9dd-ccab17b65379",
                                                                                              "833f9d26-bcad-4472-8cda-2f9f89b3bcc3",
                                                                                              "a7ba6043-f6de-46e4-9bb2-130a3ccbc7b8",
                                                                                              "475c9d03-45b5-4f81-a001-018af61a1ff3");
            CampaignStatisticsEvents campaignstatisticsevents3 = new CampaignStatisticsEvents("50073160-f080-424d-94c0-e36c521aa7ac",
                                                                                              38,
                                                                                              new Date(1558018686740L),
                                                                                              "ffd82408-a567-4914-8843-37c6ae95233e",
                                                                                              "fbfbcb4d-9c20-4c8d-866a-04f223d404c4",
                                                                                              "aeb5a0f3-68c6-4ed8-bb88-3d30c5ea033a",
                                                                                              "ac452136-1514-40ae-be81-bc3b280e49f7",
                                                                                              "f7affb43-80ef-4da2-a91c-ab22f840de5c");
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
