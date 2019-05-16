// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.filtering.FilterOperator;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEventsListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEventsListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(112),
                                                                                           Long.valueOf(-15),
                                                                                           Order.getDefault(),
                                                                                           "8c042d0f-6081-4ca8-942a-8cebbcc0291a",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions2 = deviceeventslistoptions1.clone();
            assertNotNull(deviceeventslistoptions1);
            assertNotNull(deviceeventslistoptions2);
            assertNotSame(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2, deviceeventslistoptions1);
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
            DeviceEventsListOptions option = new DeviceEventsListOptions().equalToDeviceId("753fc9bf-7b34-462c-84b1-a889f6fa5865")
                                                                          .notEqualToDeviceId("e0a4c08f-fdce-4d65-a54d-1e422a96708a")
                                                                          .inDeviceIds(Arrays.asList("7c15a484-6501-4834-91e3-535ba21e15c8",
                                                                                                     "82b2aa83-268f-4018-a50c-9a81bf825020"))
                                                                          .notInDeviceIds(Arrays.asList("92d5eefe-4b74-4437-ae1b-33e23414eadc",
                                                                                                        "d7257c8a-53d0-40ff-a2d4-202702f22f2c",
                                                                                                        "6cf63420-83f7-4c55-b1db-d077609460ea",
                                                                                                        "503dc0e9-d3fa-4e99-8b25-3b895c1dd04b",
                                                                                                        "2caf6fc6-f838-4c09-9476-274645b3afa4"))
                                                                          .equalToDescription("57de5cab-04bb-401e-b01e-ac4571e84fd3")
                                                                          .notEqualToDescription("a26e35c0-e25b-4de4-ae41-f86370c7c77a")
                                                                          .inDescriptions(Arrays.asList("2c5c034b-1251-44c7-84bd-e39fabc9ee5e",
                                                                                                        "91c617b1-bcb6-44b8-b2d8-5eed23e286b8",
                                                                                                        "d4dc9156-c69e-47f9-8aa5-a276dd428387",
                                                                                                        "cda0fd6a-cfa6-4efc-a472-0d7f257cf732",
                                                                                                        "2d48db8e-fce7-4051-9858-426237990802",
                                                                                                        "2a9b9851-21a5-4648-a3a0-4ba6c26bcd0a",
                                                                                                        "725cda24-1524-4c2d-9d70-afa03bacd2a3",
                                                                                                        "f235d4ab-391d-4c08-8eab-409a26044d46",
                                                                                                        "e260cbfb-c7fd-45e3-af6f-f6251ba8a4ac"))
                                                                          .notInDescriptions(Arrays.asList("218c382f-57cb-4a5d-b8f4-0365a48592a5",
                                                                                                           "c4f12f6b-98fb-412a-93dd-01cc3814cd99",
                                                                                                           "cac45d44-e685-4f3c-ae2a-6e539d36f92d",
                                                                                                           "00eff918-77b1-49cb-b4e6-51cc9850cc15",
                                                                                                           "5f50da2c-53ea-48df-815e-1e792875a3df"))
                                                                          .inDateTimes(Arrays.asList(new Date(1558000757333L),
                                                                                                     new Date(1558000753832L),
                                                                                                     new Date(1558000756463L)))
                                                                          .notInDateTimes(Arrays.asList(new Date(1558000749723L),
                                                                                                        new Date(1558000753812L),
                                                                                                        new Date(1558000754579L),
                                                                                                        new Date(1558000756330L),
                                                                                                        new Date(1558000749224L),
                                                                                                        new Date(1558000755641L),
                                                                                                        new Date(1558000749069L),
                                                                                                        new Date(1558000751961L),
                                                                                                        new Date(1558000752519L)))
                                                                          .lessThanDateTime(new Date(1558000757066L))
                                                                          .greaterThanDateTime(new Date(1558000754644L))
                                                                          .equalToStateChange(Boolean.FALSE)
                                                                          .notEqualToStateChange(Boolean.FALSE)
                                                                          .equalToId("80c46db5-1e80-4373-8eda-58b2fed3a791")
                                                                          .notEqualToId("d3c4ddd7-d700-4e0d-9f42-52c0df7d97a5")
                                                                          .inIds(Arrays.asList("1d7cbca1-ba64-4f10-840f-0ca9ad51344f",
                                                                                               "2a6ab25d-ed27-4097-90e9-4167b8560915",
                                                                                               "d251591b-7c41-4988-a8a4-ffacee45d441",
                                                                                               "c168a512-36c7-46fd-84a8-2f3357467cd5"))
                                                                          .notInIds(Arrays.asList("b44d84bf-6ee1-40f1-ae33-907577ab80f5",
                                                                                                  "9c899336-22a2-4995-a7e8-e8ccbbf40d46",
                                                                                                  "5fbe5a0c-06ab-40bd-adbf-b8b493e3da22",
                                                                                                  "d1fe32b0-1dc4-4785-8d9d-2e02e179f135",
                                                                                                  "bfd2a78e-168e-4508-87d1-20ce5e195298",
                                                                                                  "86199c09-8980-4cba-a620-ba1fd82086ba",
                                                                                                  "d1f9a895-367d-479d-8965-e6843901cc73",
                                                                                                  "b8359a0e-5b7e-4458-b87d-7d91426490c3",
                                                                                                  "627fecfa-9a9d-4810-ba27-47d8d3cfdf28"))
                                                                          .equalToEventType("f806b68a-8082-44ff-8ad6-f8980d4c4b3b")
                                                                          .notEqualToEventType("e4262eff-74ff-4f31-989d-1aded5b2a043")
                                                                          .inEventTypes(Arrays.asList("147a3ac4-18fc-4a42-81e9-3f00a03466f4",
                                                                                                      "fd73864d-fbd6-44a1-b95c-693a6c4f0f4f",
                                                                                                      "ee06d142-14c1-4c82-8472-828be522d96d",
                                                                                                      "6d74d7cb-1267-4869-8a97-5e26cb8b7684",
                                                                                                      "911ef99a-b86c-4ccd-b16f-dc28b7d6ae8f",
                                                                                                      "130757ae-524e-4a4b-b612-61b4d3173843",
                                                                                                      "ff5b5983-967f-4d11-aded-bb59eb212c8d"))
                                                                          .notInEventTypes(Arrays.asList("149ae2ef-ea64-46db-8a25-0a218551fda6",
                                                                                                         "7db2e876-188b-495d-a4a9-b000105f643b",
                                                                                                         "8c2cea40-0830-406a-a393-dac08dc6835d",
                                                                                                         "eac9820e-ac06-476b-8731-dca87e304dc5",
                                                                                                         "fe6fc7ee-92ce-4547-bfe9-708d4f261c00",
                                                                                                         "53607a50-f4a6-4ea4-8e07-258a67590b23",
                                                                                                         "5b74f5a8-412e-475a-9d83-b7bfbe37227b",
                                                                                                         "651d717d-b74f-4e11-aff7-3893a83a1639"));
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.EQUAL));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals("753fc9bf-7b34-462c-84b1-a889f6fa5865",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals("e0a4c08f-fdce-4d65-a54d-1e422a96708a",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.IN));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals(Arrays.asList("7c15a484-6501-4834-91e3-535ba21e15c8", "82b2aa83-268f-4018-a50c-9a81bf825020"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.NOT_IN));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals(Arrays.asList("92d5eefe-4b74-4437-ae1b-33e23414eadc", "d7257c8a-53d0-40ff-a2d4-202702f22f2c",
                                       "6cf63420-83f7-4c55-b1db-d077609460ea", "503dc0e9-d3fa-4e99-8b25-3b895c1dd04b",
                                       "2caf6fc6-f838-4c09-9476-274645b3afa4"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.EQUAL));
            assertNotNull(option.getDescriptionFilters());
            assertEquals("57de5cab-04bb-401e-b01e-ac4571e84fd3",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDescriptionFilters());
            assertEquals("a26e35c0-e25b-4de4-ae41-f86370c7c77a",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.IN));
            assertNotNull(option.getDescriptionFilters());
            assertEquals(Arrays.asList("2c5c034b-1251-44c7-84bd-e39fabc9ee5e", "91c617b1-bcb6-44b8-b2d8-5eed23e286b8",
                                       "d4dc9156-c69e-47f9-8aa5-a276dd428387", "cda0fd6a-cfa6-4efc-a472-0d7f257cf732",
                                       "2d48db8e-fce7-4051-9858-426237990802", "2a9b9851-21a5-4648-a3a0-4ba6c26bcd0a",
                                       "725cda24-1524-4c2d-9d70-afa03bacd2a3", "f235d4ab-391d-4c08-8eab-409a26044d46",
                                       "e260cbfb-c7fd-45e3-af6f-f6251ba8a4ac"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.NOT_IN));
            assertNotNull(option.getDescriptionFilters());
            assertEquals(Arrays.asList("218c382f-57cb-4a5d-b8f4-0365a48592a5", "c4f12f6b-98fb-412a-93dd-01cc3814cd99",
                                       "cac45d44-e685-4f3c-ae2a-6e539d36f92d", "00eff918-77b1-49cb-b4e6-51cc9850cc15",
                                       "5f50da2c-53ea-48df-815e-1e792875a3df"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.IN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(Arrays.asList(new Date(1558000757333L), new Date(1558000753832L), new Date(1558000756463L)),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.NOT_IN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(Arrays.asList(new Date(1558000749723L), new Date(1558000753812L), new Date(1558000754579L),
                                       new Date(1558000756330L), new Date(1558000749224L), new Date(1558000755641L),
                                       new Date(1558000749069L), new Date(1558000751961L), new Date(1558000752519L)),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.LESS_THAN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(new Date(1558000757066L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.GREATER_THAN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(new Date(1558000754644L),
                         ListOptionsEncoder.encodeSingleGreaterThanFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                          Date.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE, FilterOperator.EQUAL));
            assertNotNull(option.getStateChangeFilters());
            assertEquals(Boolean.FALSE,
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE,
                                                                    Boolean.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getStateChangeFilters());
            assertEquals(Boolean.FALSE,
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_STATE_CHANGE,
                                                                       Boolean.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.EQUAL));
            assertNotNull(option.getIdFilters());
            assertEquals("80c46db5-1e80-4373-8eda-58b2fed3a791",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getIdFilters());
            assertEquals("d3c4ddd7-d700-4e0d-9f42-52c0df7d97a5",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.IN));
            assertNotNull(option.getIdFilters());
            assertEquals(Arrays.asList("1d7cbca1-ba64-4f10-840f-0ca9ad51344f", "2a6ab25d-ed27-4097-90e9-4167b8560915",
                                       "d251591b-7c41-4988-a8a4-ffacee45d441", "c168a512-36c7-46fd-84a8-2f3357467cd5"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, List.class,
                                                                 option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.NOT_IN));
            assertNotNull(option.getIdFilters());
            assertEquals(Arrays.asList("b44d84bf-6ee1-40f1-ae33-907577ab80f5", "9c899336-22a2-4995-a7e8-e8ccbbf40d46",
                                       "5fbe5a0c-06ab-40bd-adbf-b8b493e3da22", "d1fe32b0-1dc4-4785-8d9d-2e02e179f135",
                                       "bfd2a78e-168e-4508-87d1-20ce5e195298", "86199c09-8980-4cba-a620-ba1fd82086ba",
                                       "d1f9a895-367d-479d-8965-e6843901cc73", "b8359a0e-5b7e-4458-b87d-7d91426490c3",
                                       "627fecfa-9a9d-4810-ba27-47d8d3cfdf28"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.EQUAL));
            assertNotNull(option.getEventTypeFilters());
            assertEquals("f806b68a-8082-44ff-8ad6-f8980d4c4b3b",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getEventTypeFilters());
            assertEquals("e4262eff-74ff-4f31-989d-1aded5b2a043",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.IN));
            assertNotNull(option.getEventTypeFilters());
            assertEquals(Arrays.asList("147a3ac4-18fc-4a42-81e9-3f00a03466f4", "fd73864d-fbd6-44a1-b95c-693a6c4f0f4f",
                                       "ee06d142-14c1-4c82-8472-828be522d96d", "6d74d7cb-1267-4869-8a97-5e26cb8b7684",
                                       "911ef99a-b86c-4ccd-b16f-dc28b7d6ae8f", "130757ae-524e-4a4b-b612-61b4d3173843",
                                       "ff5b5983-967f-4d11-aded-bb59eb212c8d"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.NOT_IN));
            assertNotNull(option.getEventTypeFilters());
            assertEquals(Arrays.asList("149ae2ef-ea64-46db-8a25-0a218551fda6", "7db2e876-188b-495d-a4a9-b000105f643b",
                                       "8c2cea40-0830-406a-a393-dac08dc6835d", "eac9820e-ac06-476b-8731-dca87e304dc5",
                                       "fe6fc7ee-92ce-4547-bfe9-708d4f261c00", "53607a50-f4a6-4ea4-8e07-258a67590b23",
                                       "5b74f5a8-412e-475a-9d83-b7bfbe37227b", "651d717d-b74f-4e11-aff7-3893a83a1639"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                    List.class, option));
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
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(-60),
                                                                                           Long.valueOf(-94),
                                                                                           Order.getDefault(),
                                                                                           "ebde7a7e-753d-485e-8648-1e0fe2594ebf",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions2 = new DeviceEventsListOptions(Integer.valueOf(-60),
                                                                                           Long.valueOf(-94),
                                                                                           Order.getDefault(),
                                                                                           "ebde7a7e-753d-485e-8648-1e0fe2594ebf",
                                                                                           null, null);
            assertNotNull(deviceeventslistoptions1);
            assertNotNull(deviceeventslistoptions2);
            assertNotSame(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2.hashCode(), deviceeventslistoptions1.hashCode());
            int hashCode = deviceeventslistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceeventslistoptions1.hashCode());
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
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(30),
                                                                                           Long.valueOf(-107),
                                                                                           Order.getDefault(),
                                                                                           "af6b57e0-3d22-4582-ac97-d44081807838",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions2 = new DeviceEventsListOptions(Integer.valueOf(30),
                                                                                           Long.valueOf(-107),
                                                                                           Order.getDefault(),
                                                                                           "af6b57e0-3d22-4582-ac97-d44081807838",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions3 = new DeviceEventsListOptions(Integer.valueOf(61),
                                                                                           Long.valueOf(-102),
                                                                                           Order.getDefault(),
                                                                                           "011f05ea-9434-4165-99e8-862755174bff",
                                                                                           null, null);
            assertNotNull(deviceeventslistoptions1);
            assertNotNull(deviceeventslistoptions2);
            assertNotNull(deviceeventslistoptions3);
            assertNotSame(deviceeventslistoptions2, deviceeventslistoptions1);
            assertNotSame(deviceeventslistoptions3, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions2, deviceeventslistoptions1);
            assertEquals(deviceeventslistoptions1, deviceeventslistoptions2);
            assertEquals(deviceeventslistoptions1, deviceeventslistoptions1);
            assertFalse(deviceeventslistoptions1.equals(null));
            assertNotEquals(deviceeventslistoptions3, deviceeventslistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
