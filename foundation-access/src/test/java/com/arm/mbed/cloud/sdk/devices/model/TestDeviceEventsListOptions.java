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
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(58),
                                                                                           Long.valueOf(-26),
                                                                                           Order.getDefault(),
                                                                                           "1e93f62e-80c2-43b2-ac43-a2816437fdbb",
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
            DeviceEventsListOptions option = new DeviceEventsListOptions().equalToDeviceId("8d323dbe-f6d9-4715-a45c-66e6487d9e3a")
                                                                          .notEqualToDeviceId("a3f917c1-d0ef-4271-8274-beca46556f13")
                                                                          .inDeviceIds(Arrays.asList("51c58b1f-ff85-4e9b-9d5f-03d361d61ec7",
                                                                                                     "09bda532-2bcf-477d-957a-549f0750c774",
                                                                                                     "0a026e43-880c-46b1-bf42-8c14ac724091",
                                                                                                     "6acf4951-a9a9-4124-94de-305d3461bf5b",
                                                                                                     "8b158cb1-79bc-4651-a31f-8216d15c071a",
                                                                                                     "23cdf43a-25f3-4903-894c-fb16d7a357e1",
                                                                                                     "a71fd0cf-7d6c-43c6-ad7a-43a2d90b2eac",
                                                                                                     "915f40b2-a035-41ce-9a60-90eb8041bdce"))
                                                                          .notInDeviceIds(Arrays.asList("215a2cc8-4d96-4480-bc99-ddad4acfd498",
                                                                                                        "10150434-79f0-4a85-8d84-1bdf396af21b",
                                                                                                        "8054ccc3-dc0c-4a62-a0db-eee4e409ccb5"))
                                                                          .equalToDescription("d72aeab1-0124-4be4-9dcd-59872fca8577")
                                                                          .notEqualToDescription("b1895fe1-a4c7-4560-aca3-918e05a1b7f4")
                                                                          .inDescriptions(Arrays.asList("2f9f1257-f05c-490a-957f-5a06a361ed1d"))
                                                                          .notInDescriptions(Arrays.asList("982cdd15-eabc-458e-966b-7302eb0ead21",
                                                                                                           "1566342a-75a5-4c0d-a0c3-14e07befdd6b",
                                                                                                           "aae9cf66-f70b-423d-83cf-209d4e617134",
                                                                                                           "e9830e59-8b41-4ee0-88d3-fa4d92ffc955",
                                                                                                           "e50ba06e-236a-416c-b49c-7dd7be29102a",
                                                                                                           "e1bcdf0d-6b8a-49f4-8c40-80cbd124ac88",
                                                                                                           "fd882d3a-0343-40c4-8822-c2066ca8ed6c",
                                                                                                           "950bfb11-3a95-48e2-94b7-facf14cf2ab0"))
                                                                          .inDateTimes(Arrays.asList(new Date(1559833513560L),
                                                                                                     new Date(1559833517217L),
                                                                                                     new Date(1559833516355L),
                                                                                                     new Date(1559833516926L),
                                                                                                     new Date(1559833516688L),
                                                                                                     new Date(1559833516545L),
                                                                                                     new Date(1559833519503L),
                                                                                                     new Date(1559833510269L)))
                                                                          .notInDateTimes(Arrays.asList(new Date(1559833517867L),
                                                                                                        new Date(1559833514982L),
                                                                                                        new Date(1559833518896L),
                                                                                                        new Date(1559833518710L),
                                                                                                        new Date(1559833512176L),
                                                                                                        new Date(1559833511941L),
                                                                                                        new Date(1559833511924L),
                                                                                                        new Date(1559833515731L),
                                                                                                        new Date(1559833519830L)))
                                                                          .lessThanDateTime(new Date(1559833514456L))
                                                                          .greaterThanDateTime(new Date(1559833509980L))
                                                                          .equalToStateChange(Boolean.FALSE)
                                                                          .notEqualToStateChange(Boolean.FALSE)
                                                                          .equalToId("34428fb5-6cff-4510-88b0-3c4852507295")
                                                                          .notEqualToId("6d575cb8-a1cd-4725-8dc1-3a9439a2356b")
                                                                          .inIds(Arrays.asList("91656a1a-647c-49e3-8c7f-1f5b8f1db3cf",
                                                                                               "c395bc0d-7ee2-4e5e-befe-6da7d031e67b",
                                                                                               "eb988503-8e02-477b-9c27-0269b47b4868",
                                                                                               "0e53b5e2-37ab-4631-8f63-81e8e7f0a5cb"))
                                                                          .notInIds(Arrays.asList("bf5259dc-4687-4c9b-923c-62346a0a3e6e",
                                                                                                  "8678295b-9b10-46f7-acf3-20d8f85e7d20",
                                                                                                  "73af332c-2a22-44bc-9206-96ff599c41f4",
                                                                                                  "54638d81-1dc1-417a-837a-a85415989e40"))
                                                                          .equalToEventType("53912266-e7e5-44b5-9433-d60cdb4a054c")
                                                                          .notEqualToEventType("ae1bd9c6-021c-4c51-9716-1ae7e23894c6")
                                                                          .inEventTypes(Arrays.asList("84f2c2ec-693f-489d-95f8-c10c6c723dc6",
                                                                                                      "9dd9323a-0c9d-430f-ab8e-7eb053c3b3ca",
                                                                                                      "d713fa5c-e214-4432-bdd9-e5664c5ce6f8",
                                                                                                      "069eff14-c3f9-4b39-9291-0649b007aee6",
                                                                                                      "b0321f4e-f209-46a1-b5c4-26925bea67b1",
                                                                                                      "ea02eda6-21d4-4452-8dcf-6c5d85d0ce75",
                                                                                                      "995db020-5927-4753-80bb-b45f0bd3eb31",
                                                                                                      "1e09a7ff-e8d8-495d-974c-33152a2584c3"))
                                                                          .notInEventTypes(Arrays.asList("a34ecd52-0a7a-4a82-9162-c5a1a54e4673",
                                                                                                         "94c9f237-3cd4-4bbe-8966-b3f5228d5de7",
                                                                                                         "3bd9a350-2b2e-4a15-8a73-3bd80ccd0393",
                                                                                                         "5cf006a0-9812-4a6c-94ec-e4188e365b42",
                                                                                                         "47531546-13c2-4b72-83af-12985747bc32",
                                                                                                         "a517c376-08f5-43b8-b303-cba4aa3762f5",
                                                                                                         "16638d8b-7b9a-418f-a13a-5e23fbf55391",
                                                                                                         "0e052789-cf44-4165-9514-2682c2e62224",
                                                                                                         "aa55659d-6626-48d2-9798-056eddbe0b11"));
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.EQUAL));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals("8d323dbe-f6d9-4715-a45c-66e6487d9e3a",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals("a3f917c1-d0ef-4271-8274-beca46556f13",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.IN));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals(Arrays.asList("51c58b1f-ff85-4e9b-9d5f-03d361d61ec7", "09bda532-2bcf-477d-957a-549f0750c774",
                                       "0a026e43-880c-46b1-bf42-8c14ac724091", "6acf4951-a9a9-4124-94de-305d3461bf5b",
                                       "8b158cb1-79bc-4651-a31f-8216d15c071a", "23cdf43a-25f3-4903-894c-fb16d7a357e1",
                                       "a71fd0cf-7d6c-43c6-ad7a-43a2d90b2eac", "915f40b2-a035-41ce-9a60-90eb8041bdce"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID, FilterOperator.NOT_IN));
            assertNotNull(option.getDeviceIdFilters());
            assertEquals(Arrays.asList("215a2cc8-4d96-4480-bc99-ddad4acfd498", "10150434-79f0-4a85-8d84-1bdf396af21b",
                                       "8054ccc3-dc0c-4a62-a0db-eee4e409ccb5"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DEVICE_ID,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.EQUAL));
            assertNotNull(option.getDescriptionFilters());
            assertEquals("d72aeab1-0124-4be4-9dcd-59872fca8577",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDescriptionFilters());
            assertEquals("b1895fe1-a4c7-4560-aca3-918e05a1b7f4",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.IN));
            assertNotNull(option.getDescriptionFilters());
            assertEquals(Arrays.asList("2f9f1257-f05c-490a-957f-5a06a361ed1d"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION, FilterOperator.NOT_IN));
            assertNotNull(option.getDescriptionFilters());
            assertEquals(Arrays.asList("982cdd15-eabc-458e-966b-7302eb0ead21", "1566342a-75a5-4c0d-a0c3-14e07befdd6b",
                                       "aae9cf66-f70b-423d-83cf-209d4e617134", "e9830e59-8b41-4ee0-88d3-fa4d92ffc955",
                                       "e50ba06e-236a-416c-b49c-7dd7be29102a", "e1bcdf0d-6b8a-49f4-8c40-80cbd124ac88",
                                       "fd882d3a-0343-40c4-8822-c2066ca8ed6c", "950bfb11-3a95-48e2-94b7-facf14cf2ab0"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DESCRIPTION,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.IN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(Arrays.asList(new Date(1559833513560L), new Date(1559833517217L), new Date(1559833516355L),
                                       new Date(1559833516926L), new Date(1559833516688L), new Date(1559833516545L),
                                       new Date(1559833519503L), new Date(1559833510269L)),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.NOT_IN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(Arrays.asList(new Date(1559833517867L), new Date(1559833514982L), new Date(1559833518896L),
                                       new Date(1559833518710L), new Date(1559833512176L), new Date(1559833511941L),
                                       new Date(1559833511924L), new Date(1559833515731L), new Date(1559833519830L)),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.LESS_THAN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(new Date(1559833514456L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_DATE_TIME, FilterOperator.GREATER_THAN));
            assertNotNull(option.getDateTimeFilters());
            assertEquals(new Date(1559833509980L),
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
            assertEquals("34428fb5-6cff-4510-88b0-3c4852507295",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getIdFilters());
            assertEquals("6d575cb8-a1cd-4725-8dc1-3a9439a2356b",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.IN));
            assertNotNull(option.getIdFilters());
            assertEquals(Arrays.asList("91656a1a-647c-49e3-8c7f-1f5b8f1db3cf", "c395bc0d-7ee2-4e5e-befe-6da7d031e67b",
                                       "eb988503-8e02-477b-9c27-0269b47b4868", "0e53b5e2-37ab-4631-8f63-81e8e7f0a5cb"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, List.class,
                                                                 option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID, FilterOperator.NOT_IN));
            assertNotNull(option.getIdFilters());
            assertEquals(Arrays.asList("bf5259dc-4687-4c9b-923c-62346a0a3e6e", "8678295b-9b10-46f7-acf3-20d8f85e7d20",
                                       "73af332c-2a22-44bc-9206-96ff599c41f4", "54638d81-1dc1-417a-837a-a85415989e40"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceEventsListOptions.TAG_FILTER_BY_ID,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.EQUAL));
            assertNotNull(option.getEventTypeFilters());
            assertEquals("53912266-e7e5-44b5-9433-d60cdb4a054c",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getEventTypeFilters());
            assertEquals("ae1bd9c6-021c-4c51-9716-1ae7e23894c6",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.IN));
            assertNotNull(option.getEventTypeFilters());
            assertEquals(Arrays.asList("84f2c2ec-693f-489d-95f8-c10c6c723dc6", "9dd9323a-0c9d-430f-ab8e-7eb053c3b3ca",
                                       "d713fa5c-e214-4432-bdd9-e5664c5ce6f8", "069eff14-c3f9-4b39-9291-0649b007aee6",
                                       "b0321f4e-f209-46a1-b5c4-26925bea67b1", "ea02eda6-21d4-4452-8dcf-6c5d85d0ce75",
                                       "995db020-5927-4753-80bb-b45f0bd3eb31", "1e09a7ff-e8d8-495d-974c-33152a2584c3"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE));
            assertTrue(option.hasFilter(DeviceEventsListOptions.TAG_FILTER_BY_EVENT_TYPE, FilterOperator.NOT_IN));
            assertNotNull(option.getEventTypeFilters());
            assertEquals(Arrays.asList("a34ecd52-0a7a-4a82-9162-c5a1a54e4673", "94c9f237-3cd4-4bbe-8966-b3f5228d5de7",
                                       "3bd9a350-2b2e-4a15-8a73-3bd80ccd0393", "5cf006a0-9812-4a6c-94ec-e4188e365b42",
                                       "47531546-13c2-4b72-83af-12985747bc32", "a517c376-08f5-43b8-b303-cba4aa3762f5",
                                       "16638d8b-7b9a-418f-a13a-5e23fbf55391", "0e052789-cf44-4165-9514-2682c2e62224",
                                       "aa55659d-6626-48d2-9798-056eddbe0b11"),
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
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(2),
                                                                                           Long.valueOf(0),
                                                                                           Order.getDefault(),
                                                                                           "fc3480f7-d7a7-44c9-9d8d-06732fa0e23f",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions2 = new DeviceEventsListOptions(Integer.valueOf(2),
                                                                                           Long.valueOf(0),
                                                                                           Order.getDefault(),
                                                                                           "fc3480f7-d7a7-44c9-9d8d-06732fa0e23f",
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
            DeviceEventsListOptions deviceeventslistoptions1 = new DeviceEventsListOptions(Integer.valueOf(89),
                                                                                           Long.valueOf(45),
                                                                                           Order.getDefault(),
                                                                                           "a656e61e-4f17-4456-9907-019ac1f8b024",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions2 = new DeviceEventsListOptions(Integer.valueOf(89),
                                                                                           Long.valueOf(45),
                                                                                           Order.getDefault(),
                                                                                           "a656e61e-4f17-4456-9907-019ac1f8b024",
                                                                                           null, null);
            DeviceEventsListOptions deviceeventslistoptions3 = new DeviceEventsListOptions(Integer.valueOf(-15),
                                                                                           Long.valueOf(79),
                                                                                           Order.getDefault(),
                                                                                           "fe2217a4-109a-47f2-a5ef-2c9bbdc24a51",
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
