// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.deviceupdate.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model CampaignDeviceMetadata.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestCampaignDeviceMetadata {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            CampaignDeviceMetadata campaigndevicemetadata1 = new CampaignDeviceMetadata("1bb7946b-4da9-4209-94f1-42078b21015d",
                                                                                        new Date(1561572703238L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "692038fc-1832-4267-bd32-35c8cc5dd3f0",
                                                                                        "d342024a-81b7-43fe-b21b-5ba84a76eb7f",
                                                                                        "e6869e88-e459-4b75-97c1-3b8d3313c2fa",
                                                                                        "812c4d5b-3688-4299-a2e3-83128a2c62e3",
                                                                                        "70b3f3a0-d5eb-43f0-8da3-31071e62a5f3",
                                                                                        "ac09024a-5953-4812-a1a0-5be8007cfe99",
                                                                                        new Date(1561572709313L));
            CampaignDeviceMetadata campaigndevicemetadata2 = campaigndevicemetadata1.clone();
            assertNotNull(campaigndevicemetadata1);
            assertNotNull(campaigndevicemetadata2);
            assertNotSame(campaigndevicemetadata2, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata2, campaigndevicemetadata1);
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
            CampaignDeviceMetadata campaigndevicemetadata1 = new CampaignDeviceMetadata("d95b2ea1-cbe5-448f-9b4c-4f82ea3582ea",
                                                                                        new Date(1561572705962L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "10ff4e37-cd8b-435f-b6a5-f78e4347cbeb",
                                                                                        "e1e05dbd-0301-4c11-b4ae-fade18cbe69c",
                                                                                        "1bb180dd-ff4f-4fe6-a57d-fbb6739a1067",
                                                                                        "337ba1db-e85a-4a22-b138-c41b889f7258",
                                                                                        "f28bee4a-d5aa-4247-af34-821f81bbc4e5",
                                                                                        "16129367-fccb-4100-9589-88e9c2929859",
                                                                                        new Date(1561572702682L));
            CampaignDeviceMetadata campaigndevicemetadata2 = new CampaignDeviceMetadata("d95b2ea1-cbe5-448f-9b4c-4f82ea3582ea",
                                                                                        new Date(1561572705962L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "10ff4e37-cd8b-435f-b6a5-f78e4347cbeb",
                                                                                        "e1e05dbd-0301-4c11-b4ae-fade18cbe69c",
                                                                                        "1bb180dd-ff4f-4fe6-a57d-fbb6739a1067",
                                                                                        "337ba1db-e85a-4a22-b138-c41b889f7258",
                                                                                        "f28bee4a-d5aa-4247-af34-821f81bbc4e5",
                                                                                        "16129367-fccb-4100-9589-88e9c2929859",
                                                                                        new Date(1561572702682L));
            assertNotNull(campaigndevicemetadata1);
            assertNotNull(campaigndevicemetadata2);
            assertNotSame(campaigndevicemetadata2, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata2, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata2.hashCode(), campaigndevicemetadata1.hashCode());
            int hashCode = campaigndevicemetadata1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, campaigndevicemetadata1.hashCode());
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
        CampaignDeviceMetadata campaigndevicemetadata = new CampaignDeviceMetadata("aaa33435-1a54-47a3-b04c-012df2dd3ff1",
                                                                                   new Date(1561572703358L),
                                                                                   CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                   "d23df9b0-ed01-4a45-a164-401f6dfe358b",
                                                                                   "fbcdcd67-1761-4c23-9005-a9cb036d23d4",
                                                                                   "eec7a498-587d-4851-bb6b-030433f4e665",
                                                                                   "5d45d8cb-9932-4abf-a78c-b66bba719dee",
                                                                                   "b91d6990-b599-4e1a-a7f4-0c7dc7bfbe72",
                                                                                   "e22178a9-136d-4a9f-9d97-98c89557f6ec",
                                                                                   new Date(1561572702011L));
        assertTrue(campaigndevicemetadata.isValid());
        CampaignDeviceMetadata campaigndevicemetadataInvalid = new CampaignDeviceMetadata(null,
                                                                                          new Date(1561572702124L),
                                                                                          CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                          "4462344f-5e04-4421-b395-685f43b645cea1f0fe98-6156-4c30-a032-662dff175dbbf79038b9-966b-47aa-8f40-9419bbbfd34db9b7e7da-b567-4402-a3ab-a62f2dd675de73ad2cce-3495-4040-b6fc-27e23dda2ba29d3042cf-0a72-4027-82ec-65139bd4173453c91df1-b0cc-47a3-a21d-f96f291dda2557f857a4-3033-4071-93a6-376cab1ee04ea3cae7ad-6635-48f4-a516-c4688c531ccb9528ac12-be76-4c22-8cbc-16d6b7bc9260edddf600-614c-4dd5-baf9-f8ae3370fc78447a0ed9-d92f-4be5-8227-422ead3457b6e1199b5b-f92b-4fc7-9d24-6fb5bf72aad892b5260b-1ddb-47b5-9194-d5b3657461aef12cffc0-1476-4014-8d03-5d04c452d424c850241c-a35d-4934-a4b5-30ace0e535e04c72ded5-28f5-4cce-877a-45beebc03222975a8522-72ea-4a2e-b5bb-1055131e2172c708b38e-ce00-49e5-aad9-647e39fdb0b3edc67bc8-b489-4851-971a-8ea901633b8afd3c1fe6-0f18-41ce-914f-89b6ab6fe7ee62bdad07-a679-47e4-82ca-7e2398522bd22918a027-1808-4584-ab2e-85d38e3a5b26a6c1e71d-22e9-4b84-b6fd-3b6318084315de386f16-788b-40a9-8c07-4ef6b999e79d525de30d-9324-4962-a330-62d4fe85944356be70c0-872d-40db-820d-2bb1ba2a54ba6faeecc8-0efa-4729-b6c5-e517316e502511c99f53-76c4-4243-84bc-3eba249dcdeb5a9f754a-9bdb-414a-975f-e856118c516f1a0e026d-e004-450d-a0cf-dae7a8537d78d82e40cf-93d5-4b9d-b9a0-199ed5d653f75d1f9c68-c6e0-4b68-b319-23465e90f2262ff1d2ab-10b3-4668-ad54-549aaccb2427797805f1-a9ce-4298-b64a-262d5c022aef552df428-1dd2-414c-96bc-93637b83e15035d82184-4c2f-418c-9dcd-e44a29e265e5d3138971-cada-4c5f-8d5e-a0f26f29b3e6e2ccbb28-f769-4aad-9466-0318dbf78c05504003ff-6c33-40c7-9345-2b43c7d57bdc0b7ca624-a847-4d4b-abf9-fed796fdb5711e0e109a-89fd-4c62-b204-5e94ee6a183a8294f484-bafd-412c-9144-36d449890bfdc8a001f2-7056-45f3-97bc-41ef3f445cb13e6642c8-d0fb-466b-b312-e76aa9fcaea7c11b163a-76b0-492c-bc25-f200a5d5d80ed141aadb-cb28-4f5e-ba34-ded0fcb6967031661e4f-1de0-42e0-a20c-b93127ec80d4e3514b88-b0f4-49dc-a743-4a11c4ae879c213abdbe-9e90-44a4-b1e3-72ba2ad35a77ca3322d6-9104-47c3-8683-c938512692d40582e499-4bd1-4a6f-af3c-99118798936430271f41-174c-496d-b3ca-9d11213170c811449a31-6419-4274-818d-816f731068a3c9c8d89d-0f53-4923-8a90-8d68952940c77afa718f-731d-49df-9b4d-f1f6ba5d6a7a",
                                                                                          "f2ff0eee-5e36-4989-a691-091cdd317c67",
                                                                                          "c5a6f83c-b4b8-4e94-8099-33a0116cec7c",
                                                                                          "dc4f04d3-9e28-4e21-9480-f03e6f44a722",
                                                                                          "bcaf1fd6-aaf6-443b-8ada-efd20b86ae30",
                                                                                          "cab2f4fc-d665-4102-ae7d-0685a29fd585ba63396f-a777-4779-8d3c-0594c48ea8a4a354b18c-2419-4308-8f5e-7c8d3e57b1d7d2ff6c18-4779-4365-8569-d0c31f044e13",
                                                                                          new Date(1561572705125L));
        assertFalse(campaigndevicemetadataInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            CampaignDeviceMetadata campaigndevicemetadata1 = new CampaignDeviceMetadata("74efea6a-6a80-48fb-9d75-2d978b59d6e4",
                                                                                        new Date(1561572706607L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "88d568b7-e03b-4c9e-ba34-6941ea305769",
                                                                                        "4eac09b1-34ae-48f6-a010-7b414b77c117",
                                                                                        "b4d1ba2a-56e2-4348-9f40-0803b08375d3",
                                                                                        "b7cea2cf-7786-4d90-979c-543ac30b2ab8",
                                                                                        "34250d9c-5617-4822-8d4e-78a908d606e3",
                                                                                        "4ab11186-8cba-4300-a285-57ce204b7872",
                                                                                        new Date(1561572709370L));
            CampaignDeviceMetadata campaigndevicemetadata2 = new CampaignDeviceMetadata("74efea6a-6a80-48fb-9d75-2d978b59d6e4",
                                                                                        new Date(1561572706607L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "88d568b7-e03b-4c9e-ba34-6941ea305769",
                                                                                        "4eac09b1-34ae-48f6-a010-7b414b77c117",
                                                                                        "b4d1ba2a-56e2-4348-9f40-0803b08375d3",
                                                                                        "b7cea2cf-7786-4d90-979c-543ac30b2ab8",
                                                                                        "34250d9c-5617-4822-8d4e-78a908d606e3",
                                                                                        "4ab11186-8cba-4300-a285-57ce204b7872",
                                                                                        new Date(1561572709370L));
            CampaignDeviceMetadata campaigndevicemetadata3 = new CampaignDeviceMetadata("358bd6a4-e7fa-4428-8c17-2ff320a54887",
                                                                                        new Date(1561572703061L),
                                                                                        CampaignDeviceMetadataDeploymentState.getDefault(),
                                                                                        "d158bc7c-2438-4d23-9581-f4b35178120b",
                                                                                        "373c41f9-9ad7-41c4-ad46-a6898cab5ae6",
                                                                                        "18ba3ab1-0b56-4415-b967-fca9869b80da",
                                                                                        "1fc5b950-d2ec-4e69-85b4-06b66abf7473",
                                                                                        "05b98974-8662-4d48-9fb1-8b9981085bb0",
                                                                                        "dd5f2a27-e900-4db8-b52e-df58398b931e",
                                                                                        new Date(1561572703033L));
            assertNotNull(campaigndevicemetadata1);
            assertNotNull(campaigndevicemetadata2);
            assertNotNull(campaigndevicemetadata3);
            assertNotSame(campaigndevicemetadata2, campaigndevicemetadata1);
            assertNotSame(campaigndevicemetadata3, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata2, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata2, campaigndevicemetadata1);
            assertEquals(campaigndevicemetadata1, campaigndevicemetadata2);
            assertEquals(campaigndevicemetadata1, campaigndevicemetadata1);
            assertFalse(campaigndevicemetadata1.equals(null));
            assertNotEquals(campaigndevicemetadata3, campaigndevicemetadata1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
