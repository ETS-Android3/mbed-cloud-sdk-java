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
            Device device1 = new Device("4963d411-8103-4742-b427-5a0ccd34b8f4", true, new Date(1570127619139L),
                                        new Date(1570127622137L), "0e80ee20-3836-425a-ae46-674b67e358cc",
                                        new Date(1570127621764L), new Date(1570127622852L), null,
                                        DeviceDeployedState.getDefault(), "22d2be5d-d447-4262-99c1-12250ceb9287",
                                        "bcc5169f-546e-42a3-acb2-e23c0dee9257", "3f0c8164-5ff8-4a6a-b754-0790238", -10,
                                        "ce48a314-2da9-423b-8160-05233509ab17", "f141f796-6286-470a-a07b-964263348377",
                                        "c26f392a-d945-439d-b98b-23a78cdb510d", new Date(1570127622350L),
                                        "878b7df2-9c6d-459c-bd92-2dcd2536b940", "29bcbdfe-b0a3-4030-a6af-d7da57d873c5",
                                        "dec08273-dbce-46ef-8d64-df527bd1b44c",
                                        "4CE6B0cCccfFfccaAd91F08bd3DDd917A9DeE4d9b8D00170af19A50c228dCcCB",
                                        "5874ae80-a0cf-42d9-b18c-499524f38093", new Date(1570127622782L),
                                        DeviceMechanism.getDefault(), "43d96eca-4150-469a-a3a9-38d9acd17af6",
                                        "5c5cde27-5836-4658-8099-038bcf27ac53", "252d567d-c578-4d8b-a25d-9ad9ee9adf86",
                                        DeviceState.getDefault(), new Date(1570127624762L),
                                        "5928bbb9-8495-4b38-8f5f-095ec361fa95");
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
            Device device1 = new Device("d96352fa-5b18-4b1f-9629-c7d76233aee1", false, new Date(1570127625149L),
                                        new Date(1570127623458L), "2e7c38ef-1a4c-48c0-9795-d20c4c7e2525",
                                        new Date(1570127626792L), new Date(1570127623154L), null,
                                        DeviceDeployedState.getDefault(), "e57e9132-ae09-495e-81d4-661d3acd9ecd",
                                        "97203097-5a53-4a08-80ed-3cd75e3c0cac", "2d3a50e8-2cdc-466f-8991-8cf3949", 67,
                                        "1a8d2eba-b83f-416e-b123-abe9802cf53c", "f64cc355-4ae1-4185-bfce-70fcd6d20416",
                                        "ea8dedca-c85d-4a7c-8879-823b8a968089", new Date(1570127622443L),
                                        "473c2039-b358-479a-8502-28b7d65f88a5", "1624daa2-a3cc-45da-92db-88dce7c1e17d",
                                        "9e09ef66-6e84-44a5-ac88-4310d671533a",
                                        "4CE6B0cCccfFfccaAd91F08bd3DDd917A9DeE4d9b8D00170af19A50c228dCcCB",
                                        "fd367e1e-3f64-48ef-a3d2-cda6408afed4", new Date(1570127618931L),
                                        DeviceMechanism.getDefault(), "b99c02f5-ddf8-4ea9-9fd1-9b80abbdee1a",
                                        "06c35faa-9cca-45b5-a4b5-a8e7e5bab5cf", "78c58335-78c7-4d9f-bf62-d1487f782d93",
                                        DeviceState.getDefault(), new Date(1570127623073L),
                                        "70eb6569-ea54-47b5-9cb9-406c4c0f07b1");
            Device device2 = new Device("d96352fa-5b18-4b1f-9629-c7d76233aee1", false, new Date(1570127625149L),
                                        new Date(1570127623458L), "2e7c38ef-1a4c-48c0-9795-d20c4c7e2525",
                                        new Date(1570127626792L), new Date(1570127623154L), null,
                                        DeviceDeployedState.getDefault(), "e57e9132-ae09-495e-81d4-661d3acd9ecd",
                                        "97203097-5a53-4a08-80ed-3cd75e3c0cac", "2d3a50e8-2cdc-466f-8991-8cf3949", 67,
                                        "1a8d2eba-b83f-416e-b123-abe9802cf53c", "f64cc355-4ae1-4185-bfce-70fcd6d20416",
                                        "ea8dedca-c85d-4a7c-8879-823b8a968089", new Date(1570127622443L),
                                        "473c2039-b358-479a-8502-28b7d65f88a5", "1624daa2-a3cc-45da-92db-88dce7c1e17d",
                                        "9e09ef66-6e84-44a5-ac88-4310d671533a",
                                        "4CE6B0cCccfFfccaAd91F08bd3DDd917A9DeE4d9b8D00170af19A50c228dCcCB",
                                        "fd367e1e-3f64-48ef-a3d2-cda6408afed4", new Date(1570127618931L),
                                        DeviceMechanism.getDefault(), "b99c02f5-ddf8-4ea9-9fd1-9b80abbdee1a",
                                        "06c35faa-9cca-45b5-a4b5-a8e7e5bab5cf", "78c58335-78c7-4d9f-bf62-d1487f782d93",
                                        DeviceState.getDefault(), new Date(1570127623073L),
                                        "70eb6569-ea54-47b5-9cb9-406c4c0f07b1");
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
        Device device = new Device("7d29ed03-bcaa-4569-88cd-764812885573", true, new Date(1570127626129L),
                                   new Date(1570127624150L), "f129851b-7dfa-4914-aefb-23c0d033b35f",
                                   new Date(1570127621531L), new Date(1570127617727L), null,
                                   DeviceDeployedState.getDefault(), "2c9e1dc9-d8b8-4ec3-a0e1-be0bf30dd711",
                                   "58c6c06e-3c62-4c4e-8867-bbeba52ca394", "02d60a5b-1698-42d3-b6f1-6fcab6d", -21,
                                   "306bbf5a-2f97-498d-81a5-dcbedc6004f6", "b295f57a-c44c-427a-98d7-d8faecc54675",
                                   "7cbe1234-3cac-4896-bf7c-02df3bd42f49", new Date(1570127617989L),
                                   "06916536-b8c8-4e3a-8b90-767edbba7ef0", "4efcd1cb-11a1-4bd2-a3c2-3c09b5a14542",
                                   "40e4aa20-d3a0-421b-82b7-4bf2e89c69fa",
                                   "4CE6B0cCccfFfccaAd91F08bd3DDd917A9DeE4d9b8D00170af19A50c228dCcCB",
                                   "ff8c4225-5251-4889-92ad-fdaee2099df2", new Date(1570127619123L),
                                   DeviceMechanism.getDefault(), "cd35da9d-c82e-4586-a082-2e40e1bee9c0",
                                   "32beb32a-8ad1-4d64-b111-87d385371a9f", "c8bb6379-59b2-4462-9f52-b1c4df76609f",
                                   DeviceState.getDefault(), new Date(1570127624891L),
                                   "54ec3d0e-1fd1-465d-ad31-e3618c50213a");
        assertTrue(device.isValid());
        Device deviceInvalid = new Device("349cba2c-095b-47d8-be80-b7924f57fa1b", true, new Date(1570127624284L),
                                          new Date(1570127622080L),
                                          "549aa42e-8242-4d29-993f-d4bf4a46c7b20913d823-9806-4e26-a507-08f141f9421e8f6683e3-749c-421c-acfb-8000a77fa0339b1a6cc5-cdd1-444d-b565-ed9fd8b2826a4997596d-0a62-49d0-b9da-1aab161607ef69caec2e-410a-4084-adbd-fb2330692f4f24117855-e173-4962-aaa6-4a50ab5b8b2700375be0-05bd-415b-82fa-959f9988fd8245813148-7ba6-4c93-8a18-cd81de264f12608a8adb-dd30-4311-8236-23c3f58a1124b7554021-78ef-4fc9-8584-9d19f46841a3db61a434-d1d2-4057-b50a-ec8c382266cc31eca972-386e-44e9-acbb-8f2e1006a52eed120d6c-c60e-46d6-8f9c-2acc4a312156",
                                          new Date(1570127625478L), new Date(1570127623545L), null,
                                          DeviceDeployedState.getDefault(), "df10d3b6-eb0c-467b-a5f7-8aaa11bba624",
                                          "fe11e989-0e25-4a9b-9704-4344a2361e54a29f5df6-9fc8-4510-8c05-163be476d9dc067214d0-5061-48c6-b0ca-91588cfa9bd6cc525149-3cd3-477d-b923-d7ae938dd18d1c24b9cd-d61b-4899-95b8-0ecb746509d1f1eb9418-e6fd-4703-81c9-6bbcac70fe722d0ae49c-d59f-4492-91a2-3f0bd3fe37f37645a9b9-959c-45d1-a43a-3babc9968d2b8e9b6c16-c9c4-4529-ab23-b5f324692a0db7412e42-449c-4cbf-bfac-9ea6494e968b6afc2d8c-d3f5-4145-8c63-8dd4ccca640a2df77fe5-d40b-492b-8acd-3a3daf043250979764a1-e587-4c98-990c-173c91f2687a8d7a57d2-439a-48fa-b3c6-586d1a0a89dd3f1a4b59-8d45-4fdd-a393-c3bb371472f9779862ad-6fd7-44aa-acd5-ab2011cb2701a8ba9b5b-a443-42a7-a32a-4cfd70d8dcab7dc43225-68a3-450d-8d14-5b4971eca049af1ad149-6cb4-4d95-a609-d2d75006bf4d42c61904-5c26-4a50-9218-cf8aab399027e732821b-a13a-49e1-891f-dafec537e40fca89cffe-6e81-46dd-8071-ae4f87034075a07ff339-9923-4740-8df0-6b243f551f12f9fa5488-4e3c-4c59-b279-a247672401b11191e45d-fc4f-4b45-9491-eeaa63e647263496be31-7faa-4422-bbd0-bce1d722c703611d30d8-93a8-4dce-bbf1-b3cededdc7e10037aab2-d5c5-488d-95dd-822179d20523ac4d2d9c-e7a8-4706-ac87-9d077bc88e2405b755ec-5bdc-4fe0-ae29-e9c738c251751cca4ea2-e1d7-46cb-b220-a1a182dac853e024580c-f31e-4736-84a3-e9f3b3c14dd16935d82b-2903-4cf1-846a-83932b9f67db8d51efdd-367c-41fe-b69f-1d6960367f0073c3dde8-5643-4485-a36f-bb4dc8624ece3b1847e8-3f00-4c36-a91e-b4e7155bb641242a5532-173a-4fd5-bafa-5a640626906d86f24f66-1aa7-4f34-94ad-7e6e53fd177e00562ecd-60e5-4a51-b538-27fb6f9fdb5afababc06-12b7-4551-9990-90423571e79684314dc2-ab4b-4f9d-99c1-19797391bed29dda26e8-281e-4e5f-a488-e67c64a0ddd1c6d8280f-5d03-4395-8084-098488e4f54dc1c6531e-8028-4938-bf0c-6e7b5ae04e3d8c4c4e73-148d-42fd-83c3-8e788654a0e0399afb1d-eec5-4f9e-8b50-108efd59ae6e87086d3c-2493-4efa-80bc-0358e1cfc2fb0bbe62a4-59bc-4c6b-9342-2f3336236d470b90c7fa-989a-4ae9-b518-58334fdd9cedb40b76c1-885b-4bc1-a7c6-f49a281cf93f5c1d5ba1-ded2-4c34-931c-d38dda99cf443fa4d2af-1888-4ae8-bea4-15a5447b6d070657508d-8d42-4a5c-b658-91f736efd1e5abca345a-c87b-4e96-9f4f-4ff3d4a459c69d600699-c33f-4ed3-ab93-e0f79c90b6fa3455230b-fff2-4e94-b4a2-1927d168788d",
                                          "236c0103-36ae-415a-8b69-efdf89f71565", -117,
                                          "a6c1e6d5-f7df-4809-98d3-5e3e3a1d3535a2f6af35-0021-4fdb-b9a3-578da61923bc1c0252df-cc8b-4474-a4fc-6a07be91a56fd87976a3-7c6c-4a7c-9587-170c0b0676e514398596-7ee6-4e81-875c-651b82826db4bda19cdf-bfa8-4256-9d95-873fc7f8974c79df8910-bf54-4bec-899e-daa682fac482a2f742c9-d602-46a2-8a50-5a4c95c56ef5bebd0bf9-ab5a-4289-a5c6-8b1694768abbe4c07d90-911d-4c3a-9749-0b62ba7c632b2609fb13-070a-4cf9-8fab-73f74626061e669ad375-8c44-44e4-8557-6e6997f9ace520fcb443-9711-473b-bf23-e2aae685812311a489ec-f4dd-4e16-bd4b-18324569b6212ab45ff7-5c11-4897-8b02-276136ff0e1f",
                                          "6c38aedd-e618-4c08-8609-770d66cce4bf",
                                          "a74e72a0-b2d8-4b23-b603-d40175fcb8d50090b912-9ff2-4ec5-aaa4-67c678927338",
                                          new Date(1570127620571L), "edb34d24-5d66-4653-a68c-8e00d99786a7",
                                          "1cc4f276-3bbd-4d6a-b200-e55a6c5df6bc",
                                          "ffa6dff0-da33-4706-81b8-b3f2c25f40ed",
                                          "�?쬆\u0016+;\u0007XW:S?;芢ꦴ;+V:@?R]<>;\u0006㭯\u001e:H`W=\u001f>ॵ:\b@TVS왤@&?≯�?�;�?��?N헜<V;�?H:^轫�?栩",
                                          "feb81e97-0458-4785-9707-79440c7435a5", new Date(1570127623146L),
                                          DeviceMechanism.getDefault(), "50cc3761-006a-4fe9-9cde-a76e4744ed79",
                                          "824a2aad-ae68-4b50-bede-81bdd39b1b4fd7aeb1ac-342c-4d6b-9fe7-2de2bbd480ed03d25bb0-40a3-4e27-9c8c-5a92d124db91b84d34f9-efff-466a-8bd3-47ae4425adb0",
                                          "5e049bb2-5920-4271-887a-99de309a6afe", DeviceState.getDefault(),
                                          new Date(1570127623461L), "d854bdc4-0818-421b-94ba-2b5698613c0e");
        assertFalse(deviceInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            Device device1 = new Device("56739623-6e5e-4930-bd60-a8fabf02b17f", false, new Date(1570127622370L),
                                        new Date(1570127625304L), "feb962c9-4f95-4044-b5cf-9d156eb493db",
                                        new Date(1570127625429L), new Date(1570127619986L), null,
                                        DeviceDeployedState.getDefault(), "3c32f548-8d49-465d-9b3e-dbf02d5a684e",
                                        "71f5ad5b-2d2b-4a26-ab9d-fe237c7c2a44", "2a86f3e3-115d-4207-a339-4644b47", -114,
                                        "b5baa894-063d-47c7-95b9-10a2df02e57d", "4a531518-76ac-4ca6-9858-6693a7584b2e",
                                        "79015368-85c0-4730-84f8-9965afdd54ba", new Date(1570127621185L),
                                        "a2e2bf52-aea0-400a-bce9-a5ec4be4b74f", "16f649a2-e4df-44c2-91ea-224947b93778",
                                        "50e6939f-54bd-4ace-84ab-ef1c938aef98",
                                        "4CE6B0cCccfFfccaAd91F08bd3DDd917A9DeE4d9b8D00170af19A50c228dCcCB",
                                        "fc833459-4a22-4ef3-a5c3-c21d07a5bafd", new Date(1570127620590L),
                                        DeviceMechanism.getDefault(), "53f25c51-2c38-406f-a23e-d828c56d0b44",
                                        "8bbafc55-a218-4734-8ccb-a80094e14e8b", "4ba947ae-e208-45f1-8e2f-6968c2c3ca2a",
                                        DeviceState.getDefault(), new Date(1570127622069L),
                                        "1705a717-256e-4c27-87c9-d95693b85ba2");
            Device device2 = new Device("56739623-6e5e-4930-bd60-a8fabf02b17f", false, new Date(1570127622370L),
                                        new Date(1570127625304L), "feb962c9-4f95-4044-b5cf-9d156eb493db",
                                        new Date(1570127625429L), new Date(1570127619986L), null,
                                        DeviceDeployedState.getDefault(), "3c32f548-8d49-465d-9b3e-dbf02d5a684e",
                                        "71f5ad5b-2d2b-4a26-ab9d-fe237c7c2a44", "2a86f3e3-115d-4207-a339-4644b47", -114,
                                        "b5baa894-063d-47c7-95b9-10a2df02e57d", "4a531518-76ac-4ca6-9858-6693a7584b2e",
                                        "79015368-85c0-4730-84f8-9965afdd54ba", new Date(1570127621185L),
                                        "a2e2bf52-aea0-400a-bce9-a5ec4be4b74f", "16f649a2-e4df-44c2-91ea-224947b93778",
                                        "50e6939f-54bd-4ace-84ab-ef1c938aef98",
                                        "4CE6B0cCccfFfccaAd91F08bd3DDd917A9DeE4d9b8D00170af19A50c228dCcCB",
                                        "fc833459-4a22-4ef3-a5c3-c21d07a5bafd", new Date(1570127620590L),
                                        DeviceMechanism.getDefault(), "53f25c51-2c38-406f-a23e-d828c56d0b44",
                                        "8bbafc55-a218-4734-8ccb-a80094e14e8b", "4ba947ae-e208-45f1-8e2f-6968c2c3ca2a",
                                        DeviceState.getDefault(), new Date(1570127622069L),
                                        "1705a717-256e-4c27-87c9-d95693b85ba2");
            Device device3 = new Device("ed21b5e0-dee6-4397-a12f-087f52227a3b", false, new Date(1570127619587L),
                                        new Date(1570127617906L), "5a07649d-0788-48f6-a504-90493ee20c3b",
                                        new Date(1570127618028L), new Date(1570127618809L), null,
                                        DeviceDeployedState.getDefault(), "f0b37672-8744-4425-bd28-892ab8a3670c",
                                        "1fd54810-43c2-45e9-8561-f674dfea58b2", "485d1b8c-e85d-4ae1-bf0e-ff0a30d", -11,
                                        "49520aad-6e0b-4fe5-8401-5e382bad1182", "80d9b65b-abb9-4cff-b604-498784cf382e",
                                        "e52aa715-fd6e-44dc-9c27-2cbbdc5c6930", new Date(1570127626330L),
                                        "4ed18d3b-0386-4a20-aeff-d4f492fd5b6c", "4acd2db5-89d0-4650-aaf3-faab6deae58c",
                                        "c11463dd-1d06-427e-9fbc-abce50b03688",
                                        "4CE6B0cCccfFfccaAd91F08bd3DDd917A9DeE4d9b8D00170af19A50c228dCcCB",
                                        "7673ddec-30a6-475b-8c2c-cc5fdce24cd3", new Date(1570127620195L),
                                        DeviceMechanism.getDefault(), "a0937488-c365-472f-9896-6de487629700",
                                        "0aa33a46-5d76-47ae-b897-3bc8056d7d20", "580bbf96-d4d4-4c31-b989-02bb7a57784e",
                                        DeviceState.getDefault(), new Date(1570127619825L),
                                        "083bf7ae-6fcc-4dd6-8f4d-b0fc10ca073b");
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
