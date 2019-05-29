// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model User.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestUser {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            User user1 = new User("e51a609dbd6e0d1c3d5bbabcaedbd2eb", null, "c995d3c7-ee10-43c2-b12f-2a6a44230e2c",
                                  new Date(1559150278853L), -57, null, "d5786.40387@ae4d5.fr", true,
                                  "c83be677-347f-45b6-b62f-4e51bb7b8f27", "e51a609dbd6e0d1c3d5bbabcaedbd2eb", true,
                                  true, false, -80, null, null, "46c76042-4789-4941-a69f-c7ad48b42f5b", -65,
                                  "0d3c24ea-9a00-438f-a61c-38e2e0e743b8", UserStatus.getDefault(), null,
                                  new Date(1559150272987L), "4b+_+p");
            User user2 = user1.clone();
            assertNotNull(user1);
            assertNotNull(user2);
            assertNotSame(user2, user1);
            assertEquals(user2, user1);
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
            User user1 = new User("e51a609dbd6e0d1c3d5bbabcaedbd2eb", null, "d9252ca6-4d85-41e7-93e2-747fa87ecad0",
                                  new Date(1559150271386L), -31, null, "dc667.032a8@3e261.fr", false,
                                  "23dc109e-3e1a-4757-8229-ec3bacf3e278", "e51a609dbd6e0d1c3d5bbabcaedbd2eb", false,
                                  false, false, 16, null, null, "44a37b71-497c-41c2-91fe-8b2f7fe0965b", -6,
                                  "8e36456c-9f97-4f33-9717-1466b40a6f05", UserStatus.getDefault(), null,
                                  new Date(1559150273162L), "4b+_+p");
            User user2 = new User("e51a609dbd6e0d1c3d5bbabcaedbd2eb", null, "d9252ca6-4d85-41e7-93e2-747fa87ecad0",
                                  new Date(1559150271386L), -31, null, "dc667.032a8@3e261.fr", false,
                                  "23dc109e-3e1a-4757-8229-ec3bacf3e278", "e51a609dbd6e0d1c3d5bbabcaedbd2eb", false,
                                  false, false, 16, null, null, "44a37b71-497c-41c2-91fe-8b2f7fe0965b", -6,
                                  "8e36456c-9f97-4f33-9717-1466b40a6f05", UserStatus.getDefault(), null,
                                  new Date(1559150273162L), "4b+_+p");
            assertNotNull(user1);
            assertNotNull(user2);
            assertNotSame(user2, user1);
            assertEquals(user2, user1);
            assertEquals(user2.hashCode(), user1.hashCode());
            int hashCode = user1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, user1.hashCode());
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
        User user = new User("e51a609dbd6e0d1c3d5bbabcaedbd2eb", null, "3cbadf6d-1bbf-47d5-9ac7-9ddd2eb6dc79",
                             new Date(1559150269662L), 94, null, "257bc.8d626@c1024.fr", false,
                             "19c184b9-4d26-4077-998d-9247399d46e2", "e51a609dbd6e0d1c3d5bbabcaedbd2eb", false, true,
                             false, 112, null, null, "5113a662-297c-4d25-8738-ce2baca4ffdd", 93,
                             "c190fb2b-dab9-473e-9972-a3083ee34dac", UserStatus.getDefault(), null,
                             new Date(1559150276974L), "4b+_+p");
        assertTrue(user.isValid());
        User userInvalid = new User("�?�44\t48)87\u000578檶Y8ज⭃\\\\8;M4[4Y7U7@7祓?ᅼ? 788?44E쎯臿?㉟`7㋑㘞7縦!8J744朷㦫48",
                                    null, "7edc878e-a677-468d-af3f-3adf102caf05", new Date(1559150276750L), -23, null,
                                    null, true,
                                    "00982320-5675-4046-923c-2e85b3b7e95c3d837a75-9b38-464c-83aa-503b06de43c9c3f16f6b-2971-4451-9edc-3809bf7aed11",
                                    "�?�44\t48)87\u000578檶Y8ज⭃\\\\8;M4[4Y7U7@7祓?ᅼ? 788?44E쎯臿?㉟`7㋑㘞7縦!8J744朷㦫48",
                                    true, true, true, 72, null, null, "1c29507f-c7f0-4de1-ad78-ee53778abda6", -7,
                                    "e28b1a9b-1fb1-48e1-8e1a-7b2d5bbc61065f6a6038-ee69-49fe-9f30-ae71b804cb1f09ba6186-ccb1-43c4-b5a7-1844dd58baff",
                                    UserStatus.getDefault(), null, new Date(1559150276794L),
                                    "5P\u0017-jo!鼸A.T�?�,B⪼m` 6䕂\u0001若\u0006c`8`プaaa㲲e#'3\u0000-薒臠`\tag1逺\u0015/1Rdog\u000b\u0007 e).I0j0�?");
        assertFalse(userInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            User user1 = new User("e51a609dbd6e0d1c3d5bbabcaedbd2eb", null, "c5c14da1-99e8-46f4-88d9-067cf15b2bd4",
                                  new Date(1559150275419L), -56, null, "f1aa6.486cc@f9c13.fr", false,
                                  "642f61d9-1720-47af-8ac9-b1a42a19bc84", "e51a609dbd6e0d1c3d5bbabcaedbd2eb", false,
                                  true, false, -4, null, null, "05cf68b6-d421-459d-bbfb-24343916ee43", -1,
                                  "969b6c64-0276-4cd0-a761-341c83d7d531", UserStatus.getDefault(), null,
                                  new Date(1559150274460L), "4b+_+p");
            User user2 = new User("e51a609dbd6e0d1c3d5bbabcaedbd2eb", null, "c5c14da1-99e8-46f4-88d9-067cf15b2bd4",
                                  new Date(1559150275419L), -56, null, "f1aa6.486cc@f9c13.fr", false,
                                  "642f61d9-1720-47af-8ac9-b1a42a19bc84", "e51a609dbd6e0d1c3d5bbabcaedbd2eb", false,
                                  true, false, -4, null, null, "05cf68b6-d421-459d-bbfb-24343916ee43", -1,
                                  "969b6c64-0276-4cd0-a761-341c83d7d531", UserStatus.getDefault(), null,
                                  new Date(1559150274460L), "4b+_+p");
            User user3 = new User("e51a609dbd6e0d1c3d5bbabcaedbd2eb", null, "b188c660-983d-45e3-a9fb-a8244d78901d",
                                  new Date(1559150273844L), -53, null, "910f9.83fa9@b8a8a.me", false,
                                  "faf11649-755b-4ff5-a0cd-1040c81d4822", "e51a609dbd6e0d1c3d5bbabcaedbd2eb", false,
                                  true, false, -36, null, null, "1254bdb4-673c-44ea-b246-8c45d572decf", 15,
                                  "5332042f-2d3d-418d-b70e-70d58b40a65e", UserStatus.getDefault(), null,
                                  new Date(1559150274289L), "4b+_+p");
            assertNotNull(user1);
            assertNotNull(user2);
            assertNotNull(user3);
            assertNotSame(user2, user1);
            assertNotSame(user3, user1);
            assertEquals(user2, user1);
            assertEquals(user2, user1);
            assertEquals(user1, user2);
            assertEquals(user1, user1);
            assertFalse(user1.equals(null));
            assertNotEquals(user3, user1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
