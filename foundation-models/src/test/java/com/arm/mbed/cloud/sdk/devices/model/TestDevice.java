// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.devices.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model Device.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestDevice {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            Device device1 = new Device("418fe851-96b2-41c6-bca3-eb81f5190779", true, new Date(1559833514490L),
                                        new Date(1559833506466L), "03d05e17-cc98-40ad-ae62-039fa5dd07da",
                                        new Date(1559833513390L), new Date(1559833512278L), null,
                                        DeviceDeployedState.getDefault(), "ae64e6cc-ce43-49e3-b838-6e7e56479725",
                                        "9b1b970d-4522-43cc-8ef1-7ffd909adb44", "1d8f11ee-c52a-4475-a6ad-416e08a", 30,
                                        "6291ac47-f46f-4421-b55d-e255b652da9b", "6b8978dd-faa1-4fe9-a30a-a6a29a6352bc",
                                        "3305396b-a956-43b4-8cee-b85593ea3f40", new Date(1559833510015L),
                                        "43fc0e38-541b-4ec0-b0dc-14911fb1eb7c", "d147b4cf-5f63-4b9e-96b5-f9de862f74b1",
                                        "7eaea679-57b5-4249-85f9-2b86edf75a2c",
                                        "6ccDA63ca8F5CD02E1FcAfc63ba2cf9Dc5ccfbc1Bc53dfAAebCa3CD1AC0EBd0b",
                                        "dab0d1ee-b1ed-4886-9f04-c21a39e0258a", new Date(1559833513800L),
                                        DeviceMechanism.getDefault(), "178b4c58-5f97-4bd1-b312-cadce5891a7e",
                                        "9ef10c5a-b805-4397-a109-0ebb62a9ac6e", "8a911d96-afbc-48ec-bfaa-b294ef6fab4e",
                                        DeviceState.getDefault(), new Date(1559833512315L),
                                        "df87b9a2-ac97-47eb-9773-17354f6f5e83");
            Device device2 = device1.clone();
            assertNotNull(device1);
            assertNotNull(device2);
            assertNotSame(device2, device1);
            assertEquals(device2, device1);
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
            Device device1 = new Device("cde7ab28-84d3-4bbc-be42-9cf3d1aec7b9", false, new Date(1559833505588L),
                                        new Date(1559833506426L), "79b5fd92-6ff2-4b45-8c21-ede19f22351f",
                                        new Date(1559833507638L), new Date(1559833512652L), null,
                                        DeviceDeployedState.getDefault(), "66b1833e-a141-4a5e-9684-57b46028f45e",
                                        "dadc1ca9-17c2-467c-b7c2-527bc8cd8b9a", "f58c0d4e-d0bb-472c-a31d-0829236", 118,
                                        "f1de5406-726e-4d02-b1a5-9d0615f9016e", "a797351e-131a-4f1c-93a1-ee00b8871e68",
                                        "81b7941a-6cf1-4475-a402-1d9751c6a68a", new Date(1559833511193L),
                                        "7911a2a6-fee7-486d-ac8c-69ebccd89faf", "7bff559d-01f4-4227-be6a-c4cfcb3dfdb2",
                                        "cf919e8b-7fa0-4331-bb77-e46923b0d896",
                                        "6ccDA63ca8F5CD02E1FcAfc63ba2cf9Dc5ccfbc1Bc53dfAAebCa3CD1AC0EBd0b",
                                        "81402f6d-8ba7-4a33-bf83-6588412bf999", new Date(1559833515096L),
                                        DeviceMechanism.getDefault(), "ecb8a923-5fe8-4a4a-8600-a77f8604b32b",
                                        "791c07a9-5f10-4fc9-baac-85de927417b4", "8e3c0720-f08f-4341-b1f6-8b5eeb4814bd",
                                        DeviceState.getDefault(), new Date(1559833507965L),
                                        "cc601fd0-074e-43f8-889d-ee44d9469849");
            Device device2 = new Device("cde7ab28-84d3-4bbc-be42-9cf3d1aec7b9", false, new Date(1559833505588L),
                                        new Date(1559833506426L), "79b5fd92-6ff2-4b45-8c21-ede19f22351f",
                                        new Date(1559833507638L), new Date(1559833512652L), null,
                                        DeviceDeployedState.getDefault(), "66b1833e-a141-4a5e-9684-57b46028f45e",
                                        "dadc1ca9-17c2-467c-b7c2-527bc8cd8b9a", "f58c0d4e-d0bb-472c-a31d-0829236", 118,
                                        "f1de5406-726e-4d02-b1a5-9d0615f9016e", "a797351e-131a-4f1c-93a1-ee00b8871e68",
                                        "81b7941a-6cf1-4475-a402-1d9751c6a68a", new Date(1559833511193L),
                                        "7911a2a6-fee7-486d-ac8c-69ebccd89faf", "7bff559d-01f4-4227-be6a-c4cfcb3dfdb2",
                                        "cf919e8b-7fa0-4331-bb77-e46923b0d896",
                                        "6ccDA63ca8F5CD02E1FcAfc63ba2cf9Dc5ccfbc1Bc53dfAAebCa3CD1AC0EBd0b",
                                        "81402f6d-8ba7-4a33-bf83-6588412bf999", new Date(1559833515096L),
                                        DeviceMechanism.getDefault(), "ecb8a923-5fe8-4a4a-8600-a77f8604b32b",
                                        "791c07a9-5f10-4fc9-baac-85de927417b4", "8e3c0720-f08f-4341-b1f6-8b5eeb4814bd",
                                        DeviceState.getDefault(), new Date(1559833507965L),
                                        "cc601fd0-074e-43f8-889d-ee44d9469849");
            assertNotNull(device1);
            assertNotNull(device2);
            assertNotSame(device2, device1);
            assertEquals(device2, device1);
            assertEquals(device2.hashCode(), device1.hashCode());
            int hashCode = device1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, device1.hashCode());
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
        Device device = new Device("72c9257b-4316-4896-a9da-0250324013e5", true, new Date(1559833508115L),
                                   new Date(1559833512898L), "ddb43e24-7161-41fb-8634-5fb0fa6e8ee0",
                                   new Date(1559833507445L), new Date(1559833514424L), null,
                                   DeviceDeployedState.getDefault(), "40e46328-db70-438c-909a-cb140acbc6aa",
                                   "5ca8480e-df08-4fd9-9dd0-8cdbe20327f8", "9c9853d4-d83b-4a4c-b1af-107006c", 98,
                                   "06cd328b-a152-478c-908a-d71516c27a7c", "d7c0ee21-e0d4-458a-8d29-23f7428d2df8",
                                   "926052bc-049b-4b5a-a56a-c075a0bf9acd", new Date(1559833514165L),
                                   "3b1f0e5c-7601-41af-a927-726137b753ad", "73e407ff-1b06-4d99-9319-f8bdd7dd0f2e",
                                   "7f92e1d7-266d-43dc-8c23-a699d4077522",
                                   "6ccDA63ca8F5CD02E1FcAfc63ba2cf9Dc5ccfbc1Bc53dfAAebCa3CD1AC0EBd0b",
                                   "de4de65c-cf97-46d2-90f5-840f4834f086", new Date(1559833510371L),
                                   DeviceMechanism.getDefault(), "4d35c069-132a-42cb-902c-7ca7338a0f63",
                                   "7c573d5c-82f4-4852-84c8-4af73e89d0b9", "926d9078-7075-4ccd-bd49-f276df27458d",
                                   DeviceState.getDefault(), new Date(1559833506741L),
                                   "0a99b619-4aeb-4899-8faa-42ac36e5eb44");
        assertTrue(device.isValid());
        Device deviceInvalid = new Device("43d81269-c94b-47d7-8553-2013fa9a2d7e", true, new Date(1559833512856L),
                                          new Date(1559833512232L),
                                          "22779304-e16b-49e8-9822-186ff0346a4f567f5659-1a9e-4c58-bc88-860bf13aa59e4d97d4f3-2928-482c-8cfa-a5e2cbb51064a22b4576-e3de-4386-a744-5bf23fda92f6d346fc64-b375-43b0-bdd4-1e150d4378777f36355b-8c78-4333-8c38-835d1d331443e70369ac-f617-4dd4-bb46-e3f4cdd35e3a038fc512-39e8-48e6-b2e8-c77f47a942752f757603-c0c3-4609-bb2c-217118ca2b9e3460f851-a201-4ff1-be17-8390d26f23bdb9398304-ca98-4fe7-8cd7-3f9964520579c6e4eb3c-f31b-46e1-b2b1-20c6d3015bb90505ea35-d222-4263-93e6-61feaf489d73f27851a3-feae-405e-9b17-2dbd7308cfc3",
                                          new Date(1559833511476L), new Date(1559833513884L), null,
                                          DeviceDeployedState.getDefault(), "e21bd6cd-addc-46ce-8850-389cc3acd28b",
                                          "6de02e48-56ae-4dec-90e7-89273d8aabcdf51aea9b-b6ce-436b-bff6-f1bb0696d10971113959-e8eb-4d64-abcf-ce08eda20e3208743037-96b8-4fff-b1d2-9081edc5d0bee34f7302-35d7-408a-a786-8849513a0ca9be4e35be-2e73-49d9-8568-dca4526f081504c3ef15-8f03-4418-a67c-1ac63d411977e54db8cf-71a2-49ae-96a9-ee0d046ca10c4528edb6-4721-4ad6-9c6f-bb5abc0b5a5d96f29fcf-c0b5-4f6c-8dc0-b5e2381b2f3788760b90-faa4-4aaa-ad8a-32d463ce042ece7796ee-2963-4c63-85b2-d9225225089aed25d482-a614-4cde-81af-db9d29de8649f779c2c6-8f14-4acf-94e7-546eadd4158145396d26-a764-470f-8b8c-d6244ccb5a66e5144a0f-4ff8-48d6-9fc4-8601c63f296dcdd30c74-21f0-407d-840c-2b9945258b831fc2fe76-6fa5-4bac-bbdc-ff46f4c3ace1cfb065e7-b39d-43e4-934e-b6c6240307a9221bf4fd-b545-4cd6-a0f0-4467cc416caa86bd7aed-fede-474e-b42b-c30e1d8c488f13787c7c-1d37-4623-96e7-edbd0d076eb296661aa4-42ee-4832-a6cb-7e74a1a3bceb0c5844ec-3c44-45ca-a1a7-a67b060d15959938760e-90c9-40cc-932a-f0c48e726f63295380a1-7107-45f9-a9f5-5aeff6e8db85d460cfa9-58ab-45ae-810a-96b260cda8ef480969a9-5a69-499f-9f4c-f2310aa4ab1dbc6cefae-8581-4a71-bed5-1f31072ee5d56a18c0d8-c367-47f1-a9f1-e22e7e35f49de3a44e55-a7c6-46cc-b8ba-6bec4eb3d62aa8e147f8-12df-48df-ae7a-5f41f22d6bae06ead67c-9d48-435a-b278-6645246c54e7a74f347e-4cb0-457c-905c-93b1e66f7015e921979d-5d49-40c3-81e5-ae784eb86f547abd673f-2d40-4b81-a553-957393757cb72edc8ccb-fe8d-4f02-9b30-2af6059be10dcc834924-2cba-4bc4-85a2-c512cb673b504146fd76-23d8-4717-ba96-79411a9c9037f1e45735-bd3e-47f5-8175-764de40e13adf3ed2e2c-e338-4270-9907-bebaff20e7af61560e3b-ee84-4642-8880-bdf892d13ac931414413-0a18-4ddb-988b-3b2b7ab527b1e3fa6d59-1d55-4040-8b52-fa9d56d5eb71e9579e9b-d609-4f26-b847-4510f0b5b58fac766734-bcda-41e9-bec2-d39018d1637ef16408c5-f581-4558-84cf-4b575eddc6e202032e01-bad2-4e53-abf1-383fabbf477c385af0c7-e0ba-4a79-8c44-193071afc5d1d1ede7f8-814e-474e-9e64-e7fddbbdb4a131584867-ae7e-4c43-b659-6d5d9fd0ddb92daf67f5-15f3-442b-b91a-09d95a20ed11a08b619d-9e85-47af-b47c-614f3ff2c53070c6c72e-0b79-43be-8d51-1724846398af7163e460-b79e-403c-aafe-4878f0215aaa1b5f0033-de03-4da4-abeb-abe599710dd7",
                                          "562eac8d-a257-4577-9324-0cc7693302fd", -21,
                                          "901a7cea-1291-49e8-a4dd-343cc117fed40180ef49-b672-46f9-b931-e57b12d02d13140fd5aa-ad4b-4713-8dc2-a189fce00f0c1ff473e2-c2ea-4437-8681-800bf1fe45ce260bd1cf-3baa-4393-bf38-242c25361d270350ccd0-38df-4200-88e5-5b4bbf05715eb90c6ad5-1c61-40ee-afc2-f21c6860c2f108922bff-3f2d-48de-8abd-99185d974e9aff4bfefd-4167-48d6-912f-9192462cd7e1a634c7cd-f8cd-4006-967d-5f58f83221ba05218514-e28c-44ad-a7d8-97186152f26c8d492f7c-7a3c-4d0d-af47-54788b8ec05832a12008-c007-4870-868d-5d9f62ee8099b855a010-d62d-475f-85ef-731869c0a71d8497969f-f5b6-409f-ad9c-47718a8cc5ac",
                                          "b9afb7b0-46b8-4e20-8298-672fcf8bf6b5",
                                          "90bc32fd-a945-435a-b9fe-db6dc62ce48ae4881c5d-f403-4b01-9bd5-14779b670c48",
                                          new Date(1559833511422L), "908623d2-2086-4842-88bc-b746f1c066be",
                                          "431ed886-b5f3-4550-88bd-6b1584558ebf",
                                          "c07d3685-938c-4d60-a4c2-d37ae41df574",
                                          ";747(P<$$<*W(&<-Q븓477\u0015P?\u0002;Y\u0006N.4>빊4\u000e44੶(_4?^Q᪟\u001cJ\u001d\u0002H-++77V74㢼낭H妮4@J",
                                          "941be62e-18ac-4390-be27-374ea8536f21", new Date(1559833509545L),
                                          DeviceMechanism.getDefault(), "ad10e9e5-195f-4988-b482-fad7603ab6eb",
                                          "fdbea385-ad9d-4fc1-aaa3-b3ceb94bd33b160139c1-3610-4138-8f47-d0b6598787f0feb85347-c40e-40f5-afa4-c922b2ba1e4b7e4114fc-ce7d-412c-a6a0-bcde64847a9e",
                                          "48636c9e-4db9-4f44-a373-9989d2e140ad", DeviceState.getDefault(),
                                          new Date(1559833505569L), "c5cc23d1-a421-498a-acdf-6adc18e38f79");
        assertFalse(deviceInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Device device1 = new Device("8b87b1ef-e2a4-445f-a04d-21fab6e6e0cd", true, new Date(1559833507219L),
                                        new Date(1559833512087L), "2c54708d-5f71-4fff-ba6e-ae956ba7e787",
                                        new Date(1559833512514L), new Date(1559833510797L), null,
                                        DeviceDeployedState.getDefault(), "59276940-6d11-489a-8864-3081b660232f",
                                        "fe8cc3d4-e549-4106-a6fb-c275ad834fa6", "f4823619-8e9a-4217-a768-74996df", -30,
                                        "da814e96-d881-42a1-a11d-9f91af2ddd63", "7eae30aa-a9ea-4e4b-9089-cf5b5d15e855",
                                        "23f460cd-3d28-4691-b9be-68831046b7fc", new Date(1559833510198L),
                                        "410149d7-5678-42e4-8ae8-d55b1e17bfb8", "234705b8-166f-4771-ac1a-74f1d42cbb07",
                                        "a7be2f40-183f-4f4d-9bd7-d132c131fadb",
                                        "6ccDA63ca8F5CD02E1FcAfc63ba2cf9Dc5ccfbc1Bc53dfAAebCa3CD1AC0EBd0b",
                                        "8f4668b6-3fcd-48c8-b9ab-c1acfea1e751", new Date(1559833506177L),
                                        DeviceMechanism.getDefault(), "7fd219c8-cbfd-49eb-a5c2-4caa9c20eafe",
                                        "376ed8ed-b529-46c1-a9a2-836dcdf0bab4", "779acad9-ef18-4e07-8f59-00df15667ac6",
                                        DeviceState.getDefault(), new Date(1559833512685L),
                                        "0ee1cca1-b43f-4900-a791-c55fb89962f9");
            Device device2 = new Device("8b87b1ef-e2a4-445f-a04d-21fab6e6e0cd", true, new Date(1559833507219L),
                                        new Date(1559833512087L), "2c54708d-5f71-4fff-ba6e-ae956ba7e787",
                                        new Date(1559833512514L), new Date(1559833510797L), null,
                                        DeviceDeployedState.getDefault(), "59276940-6d11-489a-8864-3081b660232f",
                                        "fe8cc3d4-e549-4106-a6fb-c275ad834fa6", "f4823619-8e9a-4217-a768-74996df", -30,
                                        "da814e96-d881-42a1-a11d-9f91af2ddd63", "7eae30aa-a9ea-4e4b-9089-cf5b5d15e855",
                                        "23f460cd-3d28-4691-b9be-68831046b7fc", new Date(1559833510198L),
                                        "410149d7-5678-42e4-8ae8-d55b1e17bfb8", "234705b8-166f-4771-ac1a-74f1d42cbb07",
                                        "a7be2f40-183f-4f4d-9bd7-d132c131fadb",
                                        "6ccDA63ca8F5CD02E1FcAfc63ba2cf9Dc5ccfbc1Bc53dfAAebCa3CD1AC0EBd0b",
                                        "8f4668b6-3fcd-48c8-b9ab-c1acfea1e751", new Date(1559833506177L),
                                        DeviceMechanism.getDefault(), "7fd219c8-cbfd-49eb-a5c2-4caa9c20eafe",
                                        "376ed8ed-b529-46c1-a9a2-836dcdf0bab4", "779acad9-ef18-4e07-8f59-00df15667ac6",
                                        DeviceState.getDefault(), new Date(1559833512685L),
                                        "0ee1cca1-b43f-4900-a791-c55fb89962f9");
            Device device3 = new Device("4b142ad6-9aad-4fe0-b09d-678e5a1cc047", true, new Date(1559833509083L),
                                        new Date(1559833508477L), "b1ea3e28-15d1-458b-9443-30e601ca07a8",
                                        new Date(1559833514724L), new Date(1559833513125L), null,
                                        DeviceDeployedState.getDefault(), "5e349901-70a0-493f-8237-5e14df28efde",
                                        "407fa49b-5481-4406-a21f-bba7e6da307e", "2abdaecc-e6c8-4923-b74d-f52248c", 93,
                                        "7134921b-8feb-41d6-a2ab-8c38cb0dc678", "f18a920f-8cee-44f3-b3cd-43b99a3ee9a4",
                                        "76c4d366-16f0-41c1-b8d7-5abebfb993a2", new Date(1559833505813L),
                                        "850e39f2-4170-4163-a85a-2987f83fb443", "977d1f30-03c3-4ef6-a323-689188a70471",
                                        "7472ee0c-cb51-4c2d-aed9-f292f7623a3a",
                                        "6ccDA63ca8F5CD02E1FcAfc63ba2cf9Dc5ccfbc1Bc53dfAAebCa3CD1AC0EBd0b",
                                        "5473c968-f992-412d-a67e-1728752b85dc", new Date(1559833506756L),
                                        DeviceMechanism.getDefault(), "785de097-4496-4322-9e29-f4dc63707ba8",
                                        "2a890cbc-5f8e-4767-8a81-528c7d40f164", "8c2d02e5-87b7-4a50-8bb9-e5b11c412c08",
                                        DeviceState.getDefault(), new Date(1559833510878L),
                                        "cf8b2c69-e084-4f2a-bcd8-ea45c2d3488f");
            assertNotNull(device1);
            assertNotNull(device2);
            assertNotNull(device3);
            assertNotSame(device2, device1);
            assertNotSame(device3, device1);
            assertEquals(device2, device1);
            assertEquals(device2, device1);
            assertEquals(device1, device2);
            assertEquals(device1, device1);
            assertFalse(device1.equals(null));
            assertNotEquals(device3, device1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
