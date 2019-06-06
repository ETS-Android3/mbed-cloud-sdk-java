// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model FirmwareManifest.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestFirmwareManifest {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            FirmwareManifest firmwaremanifest1 = new FirmwareManifest(new Date(1559833512048L), 81,
                                                                      "e14d8cdd-d396-450c-8347-0f6aec882e36",
                                                                      "cafcad3b-4834-4174-8a6c-10fa65abc3f4",
                                                                      "540b4076-4d3b-47ee-9297-de850008b6ca",
                                                                      "2337aa35-5910-420c-bc83-79107c14c0b1",
                                                                      "7e30f179-ecbc-439b-8176-b8138a64335d",
                                                                      "23fabd90-29a1-4c54-b156-02a3a39bd479",
                                                                      new Date(1559833513450L),
                                                                      new Date(1559833512930L));
            FirmwareManifest firmwaremanifest2 = firmwaremanifest1.clone();
            assertNotNull(firmwaremanifest1);
            assertNotNull(firmwaremanifest2);
            assertNotSame(firmwaremanifest2, firmwaremanifest1);
            assertEquals(firmwaremanifest2, firmwaremanifest1);
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
            FirmwareManifest firmwaremanifest1 = new FirmwareManifest(new Date(1559833508290L), 80,
                                                                      "71a60e0e-7a99-4b90-a458-21b0c2010492",
                                                                      "1a925561-32fe-47fe-a45e-8c12200c2f57",
                                                                      "9e735c4c-986e-4d57-9a02-b8127b1e0602",
                                                                      "033b2118-66f6-4f14-8e16-d4acf331b548",
                                                                      "cc155c72-ab9d-4ddc-bb43-e6663a14c464",
                                                                      "b30a9db0-b965-4bef-bf64-944af8df176e",
                                                                      new Date(1559833507583L),
                                                                      new Date(1559833509650L));
            FirmwareManifest firmwaremanifest2 = new FirmwareManifest(new Date(1559833508290L), 80,
                                                                      "71a60e0e-7a99-4b90-a458-21b0c2010492",
                                                                      "1a925561-32fe-47fe-a45e-8c12200c2f57",
                                                                      "9e735c4c-986e-4d57-9a02-b8127b1e0602",
                                                                      "033b2118-66f6-4f14-8e16-d4acf331b548",
                                                                      "cc155c72-ab9d-4ddc-bb43-e6663a14c464",
                                                                      "b30a9db0-b965-4bef-bf64-944af8df176e",
                                                                      new Date(1559833507583L),
                                                                      new Date(1559833509650L));
            assertNotNull(firmwaremanifest1);
            assertNotNull(firmwaremanifest2);
            assertNotSame(firmwaremanifest2, firmwaremanifest1);
            assertEquals(firmwaremanifest2, firmwaremanifest1);
            assertEquals(firmwaremanifest2.hashCode(), firmwaremanifest1.hashCode());
            int hashCode = firmwaremanifest1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, firmwaremanifest1.hashCode());
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
        FirmwareManifest firmwaremanifest = new FirmwareManifest(new Date(1559833510676L), -89,
                                                                 "7d04fbd6-88d2-4afc-a525-aaf6161b6030",
                                                                 "88f1074f-7c7a-498f-9815-4c6ec1dd996a",
                                                                 "832aab48-37c0-4bef-a840-0ac15f9ee6a0",
                                                                 "db7c34d8-6d1e-4f60-a31b-78a45d148d8f",
                                                                 "6b0161bf-6593-49d1-b52b-fdef03ecf6d2",
                                                                 "441a6df6-1a55-4128-a8cf-eb62a73e6926",
                                                                 new Date(1559833513382L), new Date(1559833509789L));
        assertTrue(firmwaremanifest.isValid());
        FirmwareManifest firmwaremanifestInvalid = new FirmwareManifest(new Date(1559833510842L), 19,
                                                                        "84e0b799-291f-4134-8b7c-3f17b00e7abf",
                                                                        "1dc13948-141f-4df3-9d27-2c9f49e09cc4ebfddf55-3da3-4333-ae51-0b84f82373fc041c4bef-a330-436f-b3df-6f611be0f4b5605088cc-3b11-4961-9bd0-c370404a5c712ecd9460-2381-41f4-880c-ff984796d2ba1150dec9-8cef-4222-a75b-363829427874dfc4e08d-84c1-4b09-9040-dfae9e796cbceb2155e9-d794-453d-8dc5-39da342a852998ed92dd-1afc-47dc-b992-6489986823aaf778fd1c-d9e5-4dbc-b343-b025b247010b75cbf858-71be-4b0b-9357-5ae2d8aa9b6ff9525950-247b-4e26-a011-6e0407081717cf5a7e8f-797c-4193-a1b2-908d9c7d6aa5c6364f06-a647-4e6e-95e3-42500c41c2cd0e3ee19f-df33-4266-bf08-09f50713eaecaf37e34c-0833-4af4-90ac-eb7a7e4323bca0f9f21f-9297-42d7-a01f-1a65de20640947d4049a-d04f-4db5-a436-768fde0282e845a6740b-f96c-4413-9034-1cbbef8f2482d097132e-866a-493d-bf36-9ad60cdfa7cf3f9c6d6b-670d-4fd2-af94-90861e5b1feacf33f27d-d011-4410-beca-834839730268adde8e43-caef-4b48-9fbe-05cdaf433ae6680f842d-3732-469f-bd47-146f3f45015c5854a170-f001-42d5-8c3a-31615ce2f4bfa98e8e66-c90d-4ce2-9ef8-f175826b8f1e5be38f6d-9116-45e1-8eff-6db839d9f4c5ef3b3c07-f7fc-4250-97de-bc5e8639ed8710b5e645-f1f6-4092-b3c8-9a81f7b502853e8c544b-1ed7-4522-be14-35eadc0df61c52660344-d8d4-46e2-955e-72be28152f61f313b952-65e8-4460-8586-707d3e63eab164e22a3c-911b-471a-aaad-93333cc4cea9be6f0652-c523-4913-98d5-dbf0e78b5feb6971b6f8-d1d5-46bc-83ce-e4ac821ad1d361ae8460-ad54-4ac0-902b-48666a1ec48d808312dd-02f0-48fb-9930-7031e0612a2ed7008473-728b-4ee5-a03b-72df2e389d12859042fe-24ec-4473-aef7-516078b733067a1e87dc-5de0-42f5-9bc1-191cf48da27b2bbe6a81-f0e3-4241-ab82-e686e6b56aeea8e7632f-3250-4e85-9e92-70a3f9bc66616d19a279-ab13-4fd3-9a0b-be0ad42586991ba3d716-4d18-489a-bfd9-e02f045068bb32dc1e92-6bdc-494f-8a7a-52ab279e7081c16e5c4c-d325-4637-adea-a736cbfae13c35e7cb36-49d6-4e0d-9e90-4efbd825ad54f67bd8a7-1a0d-44b1-9b6d-b0aa3e57822a030e2dbc-e6be-48a8-8209-712e73494f29da722293-c174-4541-bc30-e6973fe1722bab796166-29b9-4926-b1c2-5488a1e4dd30c9de1694-d21e-4208-97f0-28ff2b638e5ec81d2512-8642-471a-835f-023d0982bea08c75786d-ffb2-4b06-a670-eb679154c0856a9bddf4-fa1b-4e14-85e3-32adfe09bb3fba689a9f-5a8f-4ba5-bef5-f06fdc1ea6ce",
                                                                        "452c0909-ed3a-417b-bc76-af0e682ea6a2",
                                                                        "a1c62348-77fb-4033-9d6e-8f5d87f7594d",
                                                                        "2dae74ba-9524-4018-b72e-23cc111f05d5",
                                                                        "416173c0-690a-4cf2-af01-03899dcac32daa8df29d-0f27-44d1-b278-330738736c76aa57d41c-54d0-4cca-a5f4-ecd794ccbb3c911df67f-428b-4c82-945f-9ff83441d228",
                                                                        new Date(1559833510535L),
                                                                        new Date(1559833506602L));
        assertFalse(firmwaremanifestInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            FirmwareManifest firmwaremanifest1 = new FirmwareManifest(new Date(1559833505787L), -89,
                                                                      "5e7cad0a-6ebe-4103-9faa-605f4a444b21",
                                                                      "abd8f073-49fe-4118-b04f-939093dc676d",
                                                                      "a1706637-c142-4767-9ba2-c5f4b520cc9b",
                                                                      "4f42776c-aff2-4da9-8453-a26351e2eeb4",
                                                                      "3ff9baf6-984b-4c04-a7c0-a3a0683898e7",
                                                                      "6fec5394-8b8c-49ba-a4c2-08b239c72b60",
                                                                      new Date(1559833510886L),
                                                                      new Date(1559833510640L));
            FirmwareManifest firmwaremanifest2 = new FirmwareManifest(new Date(1559833505787L), -89,
                                                                      "5e7cad0a-6ebe-4103-9faa-605f4a444b21",
                                                                      "abd8f073-49fe-4118-b04f-939093dc676d",
                                                                      "a1706637-c142-4767-9ba2-c5f4b520cc9b",
                                                                      "4f42776c-aff2-4da9-8453-a26351e2eeb4",
                                                                      "3ff9baf6-984b-4c04-a7c0-a3a0683898e7",
                                                                      "6fec5394-8b8c-49ba-a4c2-08b239c72b60",
                                                                      new Date(1559833510886L),
                                                                      new Date(1559833510640L));
            FirmwareManifest firmwaremanifest3 = new FirmwareManifest(new Date(1559833508691L), 126,
                                                                      "72c413a9-c46c-43ff-b446-53c91cec2e6a",
                                                                      "ab0d35a3-58f5-498f-83b3-c6592d3f0a47",
                                                                      "c76ed88e-5a32-4700-8cf7-3410e5175c06",
                                                                      "e1ce8bdd-b3c2-43cd-b6e9-52215b3525a8",
                                                                      "3322cbf9-1677-48d8-9d44-19793806d20c",
                                                                      "2837e4b2-83e5-4533-8f7a-b04ba65db3e1",
                                                                      new Date(1559833508260L),
                                                                      new Date(1559833512495L));
            assertNotNull(firmwaremanifest1);
            assertNotNull(firmwaremanifest2);
            assertNotNull(firmwaremanifest3);
            assertNotSame(firmwaremanifest2, firmwaremanifest1);
            assertNotSame(firmwaremanifest3, firmwaremanifest1);
            assertEquals(firmwaremanifest2, firmwaremanifest1);
            assertEquals(firmwaremanifest2, firmwaremanifest1);
            assertEquals(firmwaremanifest1, firmwaremanifest2);
            assertEquals(firmwaremanifest1, firmwaremanifest1);
            assertFalse(firmwaremanifest1.equals(null));
            assertNotEquals(firmwaremanifest3, firmwaremanifest1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
