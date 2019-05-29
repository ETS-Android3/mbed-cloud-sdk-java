// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model LoginHistory.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestLoginHistory {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            LoginHistory loginhistory1 = new LoginHistory(new Date(1559150278294L),
                                                          "7294d557-b6fe-42f2-bfad-6f6de4ab8cb0", true,
                                                          "accace05-8854-4c9e-a302-d1a9819287bf");
            LoginHistory loginhistory2 = loginhistory1.clone();
            assertNotNull(loginhistory1);
            assertNotNull(loginhistory2);
            assertNotSame(loginhistory2, loginhistory1);
            assertEquals(loginhistory2, loginhistory1);
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
            LoginHistory loginhistory1 = new LoginHistory(new Date(1559150273395L),
                                                          "392477a8-7bd8-43e7-ad2d-77ea191efc48", true,
                                                          "ceeb4722-6fcf-456b-a1de-e765c65e2b4a");
            LoginHistory loginhistory2 = new LoginHistory(new Date(1559150273395L),
                                                          "392477a8-7bd8-43e7-ad2d-77ea191efc48", true,
                                                          "ceeb4722-6fcf-456b-a1de-e765c65e2b4a");
            assertNotNull(loginhistory1);
            assertNotNull(loginhistory2);
            assertNotSame(loginhistory2, loginhistory1);
            assertEquals(loginhistory2, loginhistory1);
            assertEquals(loginhistory2.hashCode(), loginhistory1.hashCode());
            int hashCode = loginhistory1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, loginhistory1.hashCode());
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
        LoginHistory loginhistory = new LoginHistory(new Date(1559150276904L), "a3b80a4d-1927-481a-83eb-7cbc226c82ed",
                                                     false, "e9a32175-05bd-4aac-bea1-661f3d33a31b");
        assertTrue(loginhistory.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            LoginHistory loginhistory1 = new LoginHistory(new Date(1559150277942L),
                                                          "c3e757d5-9b1f-48d7-a6d7-16fafdfdb8b0", true,
                                                          "c80a3b1f-fccc-4de4-a34a-67d57d8adcd5");
            LoginHistory loginhistory2 = new LoginHistory(new Date(1559150277942L),
                                                          "c3e757d5-9b1f-48d7-a6d7-16fafdfdb8b0", true,
                                                          "c80a3b1f-fccc-4de4-a34a-67d57d8adcd5");
            LoginHistory loginhistory3 = new LoginHistory(new Date(1559150272598L),
                                                          "91a640f7-d51b-4f78-9e19-1fe8903faf7c", true,
                                                          "4ae55cc7-72bb-4fc7-b575-2272c5a76d31");
            assertNotNull(loginhistory1);
            assertNotNull(loginhistory2);
            assertNotNull(loginhistory3);
            assertNotSame(loginhistory2, loginhistory1);
            assertNotSame(loginhistory3, loginhistory1);
            assertEquals(loginhistory2, loginhistory1);
            assertEquals(loginhistory2, loginhistory1);
            assertEquals(loginhistory1, loginhistory2);
            assertEquals(loginhistory1, loginhistory1);
            assertFalse(loginhistory1.equals(null));
            assertNotEquals(loginhistory3, loginhistory1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
