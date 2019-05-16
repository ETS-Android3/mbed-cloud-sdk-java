// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model ActiveSession.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestActiveSession {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            ActiveSession activesession1 = new ActiveSession("61c6923c18efbbacbd7af9d6fa2e336c",
                                                             "b87b7399-4fac-4666-b1c4-96b274a3b183",
                                                             new Date(1558018688255L),
                                                             "0049f4cb-7b5c-4d14-9761-dc9fc8ada67e",
                                                             "69a78aca-bf5e-403b-a1c0-12e762fb8433");
            ActiveSession activesession2 = activesession1.clone();
            assertNotNull(activesession1);
            assertNotNull(activesession2);
            assertNotSame(activesession2, activesession1);
            assertEquals(activesession2, activesession1);
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
            ActiveSession activesession1 = new ActiveSession("61c6923c18efbbacbd7af9d6fa2e336c",
                                                             "788216af-ceeb-4a83-a0e7-acdfc085c42e",
                                                             new Date(1558018684700L),
                                                             "ead7c588-8af4-4271-83d1-5b2d32d55e39",
                                                             "c6d54197-b053-4bd5-91a4-10432a5c25de");
            ActiveSession activesession2 = new ActiveSession("61c6923c18efbbacbd7af9d6fa2e336c",
                                                             "788216af-ceeb-4a83-a0e7-acdfc085c42e",
                                                             new Date(1558018684700L),
                                                             "ead7c588-8af4-4271-83d1-5b2d32d55e39",
                                                             "c6d54197-b053-4bd5-91a4-10432a5c25de");
            assertNotNull(activesession1);
            assertNotNull(activesession2);
            assertNotSame(activesession2, activesession1);
            assertEquals(activesession2, activesession1);
            assertEquals(activesession2.hashCode(), activesession1.hashCode());
            int hashCode = activesession1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, activesession1.hashCode());
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
        ActiveSession activesession = new ActiveSession("61c6923c18efbbacbd7af9d6fa2e336c",
                                                        "12d75f0b-e91d-4f9f-bc24-65d1c49b771b",
                                                        new Date(1558018691042L),
                                                        "963ca7fc-cd01-4a7e-8397-b1152008f91e",
                                                        "ae4e8bf7-bfc0-4899-a0a0-4f2771b69613");
        assertTrue(activesession.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            ActiveSession activesession1 = new ActiveSession("61c6923c18efbbacbd7af9d6fa2e336c",
                                                             "e62a770d-776b-49a3-a8b2-0b3051a3b16b",
                                                             new Date(1558018688338L),
                                                             "ff6665ee-ef2f-4d13-b3f6-ac806f478fd8",
                                                             "e5f2c82e-af34-4aa6-96d6-af0a71fbecc3");
            ActiveSession activesession2 = new ActiveSession("61c6923c18efbbacbd7af9d6fa2e336c",
                                                             "e62a770d-776b-49a3-a8b2-0b3051a3b16b",
                                                             new Date(1558018688338L),
                                                             "ff6665ee-ef2f-4d13-b3f6-ac806f478fd8",
                                                             "e5f2c82e-af34-4aa6-96d6-af0a71fbecc3");
            ActiveSession activesession3 = new ActiveSession("61c6923c18efbbacbd7af9d6fa2e336c",
                                                             "1b89088b-b26b-49f5-bdf0-2001837ad1f8",
                                                             new Date(1558018689345L),
                                                             "27bd5ce0-758d-4fa0-9f4f-95ca7187334c",
                                                             "81ba787c-902d-471d-a7dd-bcb2997ce3aa");
            assertNotNull(activesession1);
            assertNotNull(activesession2);
            assertNotNull(activesession3);
            assertNotSame(activesession2, activesession1);
            assertNotSame(activesession3, activesession1);
            assertEquals(activesession2, activesession1);
            assertEquals(activesession2, activesession1);
            assertEquals(activesession1, activesession2);
            assertEquals(activesession1, activesession1);
            assertFalse(activesession1.equals(null));
            assertNotEquals(activesession3, activesession1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
