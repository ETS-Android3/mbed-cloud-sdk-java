// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import static org.junit.Assert.*;

import com.arm.mbed.cloud.sdk.common.Order;
import org.junit.Test;

/**
 * Unit tests for Model PreSharedKeyListOptions.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestPreSharedKeyListOptions {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            PreSharedKeyListOptions presharedkeylistoptions1 = new PreSharedKeyListOptions(Integer.valueOf(-120),
                                                                                           Long.valueOf(-113),
                                                                                           Order.getDefault(),
                                                                                           "31928d2a-8cde-465e-a706-f54ed178b51a",
                                                                                           null, null);
            PreSharedKeyListOptions presharedkeylistoptions2 = presharedkeylistoptions1.clone();
            assertNotNull(presharedkeylistoptions1);
            assertNotNull(presharedkeylistoptions2);
            assertNotSame(presharedkeylistoptions2, presharedkeylistoptions1);
            assertEquals(presharedkeylistoptions2, presharedkeylistoptions1);
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
            PreSharedKeyListOptions presharedkeylistoptions1 = new PreSharedKeyListOptions(Integer.valueOf(-15),
                                                                                           Long.valueOf(58),
                                                                                           Order.getDefault(),
                                                                                           "cf68d029-7a0c-451f-b55e-bf3f9512df43",
                                                                                           null, null);
            PreSharedKeyListOptions presharedkeylistoptions2 = new PreSharedKeyListOptions(Integer.valueOf(-15),
                                                                                           Long.valueOf(58),
                                                                                           Order.getDefault(),
                                                                                           "cf68d029-7a0c-451f-b55e-bf3f9512df43",
                                                                                           null, null);
            assertNotNull(presharedkeylistoptions1);
            assertNotNull(presharedkeylistoptions2);
            assertNotSame(presharedkeylistoptions2, presharedkeylistoptions1);
            assertEquals(presharedkeylistoptions2, presharedkeylistoptions1);
            assertEquals(presharedkeylistoptions2.hashCode(), presharedkeylistoptions1.hashCode());
            int hashCode = presharedkeylistoptions1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, presharedkeylistoptions1.hashCode());
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
            PreSharedKeyListOptions presharedkeylistoptions1 = new PreSharedKeyListOptions(Integer.valueOf(25),
                                                                                           Long.valueOf(15),
                                                                                           Order.getDefault(),
                                                                                           "b88304a5-6153-4191-9ef5-c883e6c9832b",
                                                                                           null, null);
            PreSharedKeyListOptions presharedkeylistoptions2 = new PreSharedKeyListOptions(Integer.valueOf(25),
                                                                                           Long.valueOf(15),
                                                                                           Order.getDefault(),
                                                                                           "b88304a5-6153-4191-9ef5-c883e6c9832b",
                                                                                           null, null);
            PreSharedKeyListOptions presharedkeylistoptions3 = new PreSharedKeyListOptions(Integer.valueOf(-63),
                                                                                           Long.valueOf(104),
                                                                                           Order.getDefault(),
                                                                                           "1c06bdc4-0d78-4669-ae7a-9087b773989a",
                                                                                           null, null);
            assertNotNull(presharedkeylistoptions1);
            assertNotNull(presharedkeylistoptions2);
            assertNotNull(presharedkeylistoptions3);
            assertNotSame(presharedkeylistoptions2, presharedkeylistoptions1);
            assertNotSame(presharedkeylistoptions3, presharedkeylistoptions1);
            assertEquals(presharedkeylistoptions2, presharedkeylistoptions1);
            assertEquals(presharedkeylistoptions2, presharedkeylistoptions1);
            assertEquals(presharedkeylistoptions1, presharedkeylistoptions2);
            assertEquals(presharedkeylistoptions1, presharedkeylistoptions1);
            assertFalse(presharedkeylistoptions1.equals(null));
            assertNotEquals(presharedkeylistoptions3, presharedkeylistoptions1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
