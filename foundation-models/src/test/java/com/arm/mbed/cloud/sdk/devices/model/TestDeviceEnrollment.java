// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model DeviceEnrollment.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDeviceEnrollment {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("1d2a33f8-b4ad-403a-a533-14f555ff61f3",
                                                                      new Date(1558093226855L),
                                                                      new Date(1558093226924L),
                                                                      "33X1sCW1DBe517nhjtV0VS1hIF8d6DF2",
                                                                      "A-dwbzznM111Ym9j6SD1O9XLR4dp9Qmffdcry3U7bqonW57x253On6WJFaTsy3py5Z18T4C0B:TkUdpOvz8T8PJBNpAEz7H8L",
                                                                      new Date(1558093219516L),
                                                                      "33X1sCW1DBe517nhjtV0VS1hIF8d6DF2");
            DeviceEnrollment deviceenrollment2 = deviceenrollment1.clone();
            assertNotNull(deviceenrollment1);
            assertNotNull(deviceenrollment2);
            assertNotSame(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
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
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("8fc2950d-2498-4372-b474-81500d61b2d4",
                                                                      new Date(1558093226279L),
                                                                      new Date(1558093224532L),
                                                                      "33X1sCW1DBe517nhjtV0VS1hIF8d6DF2",
                                                                      "A-dwbzznM111Ym9j6SD1O9XLR4dp9Qmffdcry3U7bqonW57x253On6WJFaTsy3py5Z18T4C0B:TkUdpOvz8T8PJBNpAEz7H8L",
                                                                      new Date(1558093221314L),
                                                                      "33X1sCW1DBe517nhjtV0VS1hIF8d6DF2");
            DeviceEnrollment deviceenrollment2 = new DeviceEnrollment("8fc2950d-2498-4372-b474-81500d61b2d4",
                                                                      new Date(1558093226279L),
                                                                      new Date(1558093224532L),
                                                                      "33X1sCW1DBe517nhjtV0VS1hIF8d6DF2",
                                                                      "A-dwbzznM111Ym9j6SD1O9XLR4dp9Qmffdcry3U7bqonW57x253On6WJFaTsy3py5Z18T4C0B:TkUdpOvz8T8PJBNpAEz7H8L",
                                                                      new Date(1558093221314L),
                                                                      "33X1sCW1DBe517nhjtV0VS1hIF8d6DF2");
            assertNotNull(deviceenrollment1);
            assertNotNull(deviceenrollment2);
            assertNotSame(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2.hashCode(), deviceenrollment1.hashCode());
            int hashCode = deviceenrollment1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, deviceenrollment1.hashCode());
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
        DeviceEnrollment deviceenrollment = new DeviceEnrollment("50084e2d-faa7-4b68-a366-b12d906f7d3a",
                                                                 new Date(1558093223403L), new Date(1558093227875L),
                                                                 "33X1sCW1DBe517nhjtV0VS1hIF8d6DF2",
                                                                 "A-dwbzznM111Ym9j6SD1O9XLR4dp9Qmffdcry3U7bqonW57x253On6WJFaTsy3py5Z18T4C0B:TkUdpOvz8T8PJBNpAEz7H8L",
                                                                 new Date(1558093219624L),
                                                                 "33X1sCW1DBe517nhjtV0VS1hIF8d6DF2");
        assertTrue(deviceenrollment.isValid());
        DeviceEnrollment deviceenrollmentInvalid = new DeviceEnrollment("6097d294-8da8-4422-96c0-ebbf10503c9f",
                                                                        new Date(1558093226614L),
                                                                        new Date(1558093224780L),
                                                                        "Gi4kGiH4iM\u0003軴lgUk乎4PZE@m\u00179�?��?GlgKc\u0013\\\\騮\\\\El\\\\頳苞Pp\u0000]@;Y\u0015p4!HEO\u0014qEGE4Nif",
                                                                        null, new Date(1558093226520L),
                                                                        "Gi4kGiH4iM\u0003軴lgUk乎4PZE@m\u00179�?��?GlgKc\u0013\\\\騮\\\\El\\\\頳苞Pp\u0000]@;Y\u0015p4!HEO\u0014qEGE4Nif");
        assertFalse(deviceenrollmentInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            DeviceEnrollment deviceenrollment1 = new DeviceEnrollment("b3706a0e-9e44-43fc-81a2-869b33b2936e",
                                                                      new Date(1558093228188L),
                                                                      new Date(1558093222669L),
                                                                      "33X1sCW1DBe517nhjtV0VS1hIF8d6DF2",
                                                                      "A-dwbzznM111Ym9j6SD1O9XLR4dp9Qmffdcry3U7bqonW57x253On6WJFaTsy3py5Z18T4C0B:TkUdpOvz8T8PJBNpAEz7H8L",
                                                                      new Date(1558093227405L),
                                                                      "33X1sCW1DBe517nhjtV0VS1hIF8d6DF2");
            DeviceEnrollment deviceenrollment2 = new DeviceEnrollment("b3706a0e-9e44-43fc-81a2-869b33b2936e",
                                                                      new Date(1558093228188L),
                                                                      new Date(1558093222669L),
                                                                      "33X1sCW1DBe517nhjtV0VS1hIF8d6DF2",
                                                                      "A-dwbzznM111Ym9j6SD1O9XLR4dp9Qmffdcry3U7bqonW57x253On6WJFaTsy3py5Z18T4C0B:TkUdpOvz8T8PJBNpAEz7H8L",
                                                                      new Date(1558093227405L),
                                                                      "33X1sCW1DBe517nhjtV0VS1hIF8d6DF2");
            DeviceEnrollment deviceenrollment3 = new DeviceEnrollment("f361b0b7-7458-44c1-9370-bfa82c5057ec",
                                                                      new Date(1558093221675L),
                                                                      new Date(1558093225543L),
                                                                      "33X1sCW1DBe517nhjtV0VS1hIF8d6DF2",
                                                                      "A-dwbzznM111Ym9j6SD1O9XLR4dp9Qmffdcry3U7bqonW57x253On6WJFaTsy3py5Z18T4C0B:TkUdpOvz8T8PJBNpAEz7H8L",
                                                                      new Date(1558093226141L),
                                                                      "33X1sCW1DBe517nhjtV0VS1hIF8d6DF2");
            assertNotNull(deviceenrollment1);
            assertNotNull(deviceenrollment2);
            assertNotNull(deviceenrollment3);
            assertNotSame(deviceenrollment2, deviceenrollment1);
            assertNotSame(deviceenrollment3, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment2, deviceenrollment1);
            assertEquals(deviceenrollment1, deviceenrollment2);
            assertEquals(deviceenrollment1, deviceenrollment1);
            assertFalse(deviceenrollment1.equals(null));
            assertNotEquals(deviceenrollment3, deviceenrollment1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
