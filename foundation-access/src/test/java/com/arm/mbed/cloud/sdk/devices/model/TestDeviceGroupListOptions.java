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
 * Unit tests for Model DeviceGroupListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceGroupListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceGroupListOptions devicegrouplistoptions1 = new DeviceGroupListOptions(Integer.valueOf(-125),
                                                                                        Long.valueOf(-14),
                                                                                        Order.getDefault(),
                                                                                        "f785aa1a-33da-4a90-ad07-e3041f758e3f",
                                                                                        null, null);
            DeviceGroupListOptions devicegrouplistoptions2 = devicegrouplistoptions1.clone();
            assertNotNull(devicegrouplistoptions1);
            assertNotNull(devicegrouplistoptions2);
            assertNotSame(devicegrouplistoptions2, devicegrouplistoptions1);
            assertEquals(devicegrouplistoptions2, devicegrouplistoptions1);
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
            DeviceGroupListOptions option = new DeviceGroupListOptions().inUpdatedAts(Arrays.asList(new Date(1559833515171L),
                                                                                                    new Date(1559833512449L),
                                                                                                    new Date(1559833511051L),
                                                                                                    new Date(1559833510425L),
                                                                                                    new Date(1559833511501L),
                                                                                                    new Date(1559833519586L)))
                                                                        .notInUpdatedAts(Arrays.asList(new Date(1559833518972L),
                                                                                                       new Date(1559833515374L),
                                                                                                       new Date(1559833515220L),
                                                                                                       new Date(1559833518522L),
                                                                                                       new Date(1559833518871L),
                                                                                                       new Date(1559833519576L)))
                                                                        .lessThanUpdatedAt(new Date(1559833515585L))
                                                                        .greaterThanUpdatedAt(new Date(1559833518205L))
                                                                        .equalToName("f9453e12-0d64-4024-916c-21185c38878f")
                                                                        .notEqualToName("b29f4513-1bbb-4508-95f2-161a7dcfcf50")
                                                                        .inNames(Arrays.asList("9e880efd-8be0-450f-b4a8-8b10417948b7"))
                                                                        .notInNames(Arrays.asList("138cca5f-fb98-4700-a95a-1d4d9b575c92"))
                                                                        .equalToDevicesCount(Integer.valueOf(99))
                                                                        .notEqualToDevicesCount(Integer.valueOf(111))
                                                                        .inDevicesCounts(Arrays.asList(Integer.valueOf(6),
                                                                                                       Integer.valueOf(-57)))
                                                                        .notInDevicesCounts(Arrays.asList(Integer.valueOf(-123),
                                                                                                          Integer.valueOf(126),
                                                                                                          Integer.valueOf(-110),
                                                                                                          Integer.valueOf(56),
                                                                                                          Integer.valueOf(-61),
                                                                                                          Integer.valueOf(-7),
                                                                                                          Integer.valueOf(30)))
                                                                        .lessThanDevicesCount(Integer.valueOf(107))
                                                                        .greaterThanDevicesCount(Integer.valueOf(-20))
                                                                        .inCreatedAts(Arrays.asList(new Date(1559833513479L)))
                                                                        .notInCreatedAts(Arrays.asList(new Date(1559833512142L),
                                                                                                       new Date(1559833519308L),
                                                                                                       new Date(1559833517993L),
                                                                                                       new Date(1559833519465L),
                                                                                                       new Date(1559833519479L),
                                                                                                       new Date(1559833516220L)))
                                                                        .lessThanCreatedAt(new Date(1559833512344L))
                                                                        .greaterThanCreatedAt(new Date(1559833516847L))
                                                                        .equalToId("fc491cb3-fb14-4e93-9818-7bc06d95dacb")
                                                                        .notEqualToId("23b3117b-0a94-429b-ada1-2a67d181ba35")
                                                                        .inIds(Arrays.asList("0bec9e76-8303-4a98-aa2c-024e27b77d23",
                                                                                             "b3b259b0-cd1f-4a3b-a5dd-6f202834fc4c",
                                                                                             "e348a9c3-636b-4650-9923-77e945b425c3",
                                                                                             "1c6422ff-8840-4e51-879f-86c06b6c63ac",
                                                                                             "aa65d62c-04c8-4d2f-9420-e6c6992ab9d4",
                                                                                             "33063fdf-09af-4436-be52-c7a4ec9fe609",
                                                                                             "2e185a4c-45ae-4f6a-8aa1-8f80075903ba"))
                                                                        .notInIds(Arrays.asList("0b1bb9a2-cb8d-4dff-b059-0defd88199a1",
                                                                                                "8872bb21-542b-46fd-89db-f07e594c1d00",
                                                                                                "29d3e0d6-fd43-4b8e-9921-f604fcc4aeac",
                                                                                                "2db1968e-4cb6-4af4-8079-a53266dbb7e6"));
            assertTrue(option.hasFilters());
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT, FilterOperator.IN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(Arrays.asList(new Date(1559833515171L), new Date(1559833512449L), new Date(1559833511051L),
                                       new Date(1559833510425L), new Date(1559833511501L), new Date(1559833519586L)),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT, FilterOperator.NOT_IN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(Arrays.asList(new Date(1559833518972L), new Date(1559833515374L), new Date(1559833515220L),
                                       new Date(1559833518522L), new Date(1559833518871L), new Date(1559833519576L)),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT, FilterOperator.LESS_THAN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(new Date(1559833515585L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT, FilterOperator.GREATER_THAN));
            assertNotNull(option.getUpdatedAtFilters());
            assertEquals(new Date(1559833518205L),
                         ListOptionsEncoder.encodeSingleGreaterThanFilter(DeviceGroupListOptions.TAG_FILTER_BY_UPDATED_AT,
                                                                          Date.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_NAME));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_NAME, FilterOperator.EQUAL));
            assertNotNull(option.getNameFilters());
            assertEquals("f9453e12-0d64-4024-916c-21185c38878f",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceGroupListOptions.TAG_FILTER_BY_NAME,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_NAME));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_NAME, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getNameFilters());
            assertEquals("b29f4513-1bbb-4508-95f2-161a7dcfcf50",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceGroupListOptions.TAG_FILTER_BY_NAME,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_NAME));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_NAME, FilterOperator.IN));
            assertNotNull(option.getNameFilters());
            assertEquals(Arrays.asList("9e880efd-8be0-450f-b4a8-8b10417948b7"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceGroupListOptions.TAG_FILTER_BY_NAME, List.class,
                                                                 option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_NAME));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_NAME, FilterOperator.NOT_IN));
            assertNotNull(option.getNameFilters());
            assertEquals(Arrays.asList("138cca5f-fb98-4700-a95a-1d4d9b575c92"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceGroupListOptions.TAG_FILTER_BY_NAME,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT, FilterOperator.EQUAL));
            assertNotNull(option.getDevicesCountFilters());
            assertEquals(Integer.valueOf(99),
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT,
                                                                    Integer.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getDevicesCountFilters());
            assertEquals(Integer.valueOf(111),
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT,
                                                                       Integer.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT, FilterOperator.IN));
            assertNotNull(option.getDevicesCountFilters());
            assertEquals(Arrays.asList(Integer.valueOf(6), Integer.valueOf(-57)),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT, FilterOperator.NOT_IN));
            assertNotNull(option.getDevicesCountFilters());
            assertEquals(Arrays.asList(Integer.valueOf(-123), Integer.valueOf(126), Integer.valueOf(-110),
                                       Integer.valueOf(56), Integer.valueOf(-61), Integer.valueOf(-7),
                                       Integer.valueOf(30)),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT, FilterOperator.LESS_THAN));
            assertNotNull(option.getDevicesCountFilters());
            assertEquals(Integer.valueOf(107),
                         ListOptionsEncoder.encodeSingleLessThanFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT,
                                                                       Integer.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT,
                                        FilterOperator.GREATER_THAN));
            assertNotNull(option.getDevicesCountFilters());
            assertEquals(Integer.valueOf(-20),
                         ListOptionsEncoder.encodeSingleGreaterThanFilter(DeviceGroupListOptions.TAG_FILTER_BY_DEVICES_COUNT,
                                                                          Integer.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT, FilterOperator.IN));
            assertNotNull(option.getCreatedAtFilters());
            assertEquals(Arrays.asList(new Date(1559833513479L)),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT,
                                                                 List.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT, FilterOperator.NOT_IN));
            assertNotNull(option.getCreatedAtFilters());
            assertEquals(Arrays.asList(new Date(1559833512142L), new Date(1559833519308L), new Date(1559833517993L),
                                       new Date(1559833519465L), new Date(1559833519479L), new Date(1559833516220L)),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT,
                                                                    List.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT, FilterOperator.LESS_THAN));
            assertNotNull(option.getCreatedAtFilters());
            assertEquals(new Date(1559833512344L),
                         ListOptionsEncoder.encodeSingleLessThanFilter(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT,
                                                                       Date.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT, FilterOperator.GREATER_THAN));
            assertNotNull(option.getCreatedAtFilters());
            assertEquals(new Date(1559833516847L),
                         ListOptionsEncoder.encodeSingleGreaterThanFilter(DeviceGroupListOptions.TAG_FILTER_BY_CREATED_AT,
                                                                          Date.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_ID, FilterOperator.EQUAL));
            assertNotNull(option.getIdFilters());
            assertEquals("fc491cb3-fb14-4e93-9818-7bc06d95dacb",
                         ListOptionsEncoder.encodeSingleEqualFilter(DeviceGroupListOptions.TAG_FILTER_BY_ID,
                                                                    String.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_ID, FilterOperator.NOT_EQUAL));
            assertNotNull(option.getIdFilters());
            assertEquals("23b3117b-0a94-429b-ada1-2a67d181ba35",
                         ListOptionsEncoder.encodeSingleNotEqualFilter(DeviceGroupListOptions.TAG_FILTER_BY_ID,
                                                                       String.class, option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_ID, FilterOperator.IN));
            assertNotNull(option.getIdFilters());
            assertEquals(Arrays.asList("0bec9e76-8303-4a98-aa2c-024e27b77d23", "b3b259b0-cd1f-4a3b-a5dd-6f202834fc4c",
                                       "e348a9c3-636b-4650-9923-77e945b425c3", "1c6422ff-8840-4e51-879f-86c06b6c63ac",
                                       "aa65d62c-04c8-4d2f-9420-e6c6992ab9d4", "33063fdf-09af-4436-be52-c7a4ec9fe609",
                                       "2e185a4c-45ae-4f6a-8aa1-8f80075903ba"),
                         ListOptionsEncoder.encodeSingleInFilter(DeviceGroupListOptions.TAG_FILTER_BY_ID, List.class,
                                                                 option));
            assertTrue(option.hasFilters(DeviceGroupListOptions.TAG_FILTER_BY_ID));
            assertTrue(option.hasFilter(DeviceGroupListOptions.TAG_FILTER_BY_ID, FilterOperator.NOT_IN));
            assertNotNull(option.getIdFilters());
            assertEquals(Arrays.asList("0b1bb9a2-cb8d-4dff-b059-0defd88199a1", "8872bb21-542b-46fd-89db-f07e594c1d00",
                                       "29d3e0d6-fd43-4b8e-9921-f604fcc4aeac", "2db1968e-4cb6-4af4-8079-a53266dbb7e6"),
                         ListOptionsEncoder.encodeSingleNotInFilter(DeviceGroupListOptions.TAG_FILTER_BY_ID, List.class,
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
            DeviceGroupListOptions devicegrouplistoptions1 = new DeviceGroupListOptions(Integer.valueOf(-18),
                                                                                        Long.valueOf(31),
                                                                                        Order.getDefault(),
                                                                                        "1ad275dc-3cf8-4fa9-a4bd-7cc9df409931",
                                                                                        null, null);
            DeviceGroupListOptions devicegrouplistoptions2 = new DeviceGroupListOptions(Integer.valueOf(-18),
                                                                                        Long.valueOf(31),
                                                                                        Order.getDefault(),
                                                                                        "1ad275dc-3cf8-4fa9-a4bd-7cc9df409931",
                                                                                        null, null);
            assertNotNull(devicegrouplistoptions1);
            assertNotNull(devicegrouplistoptions2);
            assertNotSame(devicegrouplistoptions2, devicegrouplistoptions1);
            assertEquals(devicegrouplistoptions2, devicegrouplistoptions1);
            assertEquals(devicegrouplistoptions2.hashCode(), devicegrouplistoptions1.hashCode());
            int hashCode = devicegrouplistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, devicegrouplistoptions1.hashCode());
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
            DeviceGroupListOptions devicegrouplistoptions1 = new DeviceGroupListOptions(Integer.valueOf(92),
                                                                                        Long.valueOf(-118),
                                                                                        Order.getDefault(),
                                                                                        "547cca5b-58d9-4ba3-9428-ff8116f0fb91",
                                                                                        null, null);
            DeviceGroupListOptions devicegrouplistoptions2 = new DeviceGroupListOptions(Integer.valueOf(92),
                                                                                        Long.valueOf(-118),
                                                                                        Order.getDefault(),
                                                                                        "547cca5b-58d9-4ba3-9428-ff8116f0fb91",
                                                                                        null, null);
            DeviceGroupListOptions devicegrouplistoptions3 = new DeviceGroupListOptions(Integer.valueOf(58),
                                                                                        Long.valueOf(-59),
                                                                                        Order.getDefault(),
                                                                                        "3e680731-2ea2-4eb4-b5ee-0865f072a85e",
                                                                                        null, null);
            assertNotNull(devicegrouplistoptions1);
            assertNotNull(devicegrouplistoptions2);
            assertNotNull(devicegrouplistoptions3);
            assertNotSame(devicegrouplistoptions2, devicegrouplistoptions1);
            assertNotSame(devicegrouplistoptions3, devicegrouplistoptions1);
            assertEquals(devicegrouplistoptions2, devicegrouplistoptions1);
            assertEquals(devicegrouplistoptions2, devicegrouplistoptions1);
            assertEquals(devicegrouplistoptions1, devicegrouplistoptions2);
            assertEquals(devicegrouplistoptions1, devicegrouplistoptions1);
            assertFalse(devicegrouplistoptions1.equals(null));
            assertNotEquals(devicegrouplistoptions3, devicegrouplistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
