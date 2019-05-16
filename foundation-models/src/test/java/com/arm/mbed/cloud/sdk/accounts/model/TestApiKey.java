// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

/**
 * Unit tests for Model ApiKey.
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class TestApiKey {
    /**
     * Tests the clone method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testClone() {
        try {
            ApiKey apikey1 = new ApiKey("61c6923c18efbbacbd7af9d6fa2e336c", new Date(1558018687561L), -9,
                                        "61c6923c18efbbacbd7af9d6fa2e336c", "dd255599-ca3b-47e8-ac34-b1c0f952f527",
                                        -123, "f25e8981-eaab-4be0-b67e-b3d31a27847d",
                                        "61c6923c18efbbacbd7af9d6fa2e336c", ApiKeyStatus.getDefault(),
                                        new Date(1558018688749L));
            ApiKey apikey2 = apikey1.clone();
            assertNotNull(apikey1);
            assertNotNull(apikey2);
            assertNotSame(apikey2, apikey1);
            assertEquals(apikey2, apikey1);
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
            ApiKey apikey1 = new ApiKey("61c6923c18efbbacbd7af9d6fa2e336c", new Date(1558018691505L), 126,
                                        "61c6923c18efbbacbd7af9d6fa2e336c", "4991c43b-52a7-4158-ad52-69c7028d0ee7", 26,
                                        "e2aff78e-32ad-4fbe-bc33-267c7c7da159", "61c6923c18efbbacbd7af9d6fa2e336c",
                                        ApiKeyStatus.getDefault(), new Date(1558018689801L));
            ApiKey apikey2 = new ApiKey("61c6923c18efbbacbd7af9d6fa2e336c", new Date(1558018691505L), 126,
                                        "61c6923c18efbbacbd7af9d6fa2e336c", "4991c43b-52a7-4158-ad52-69c7028d0ee7", 26,
                                        "e2aff78e-32ad-4fbe-bc33-267c7c7da159", "61c6923c18efbbacbd7af9d6fa2e336c",
                                        ApiKeyStatus.getDefault(), new Date(1558018689801L));
            assertNotNull(apikey1);
            assertNotNull(apikey2);
            assertNotSame(apikey2, apikey1);
            assertEquals(apikey2, apikey1);
            assertEquals(apikey2.hashCode(), apikey1.hashCode());
            int hashCode = apikey1.hashCode();
            for (int i = 0; i < 5; i++) {
                assertEquals(hashCode, apikey1.hashCode());
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
        ApiKey apikey = new ApiKey("61c6923c18efbbacbd7af9d6fa2e336c", new Date(1558018691939L), -4,
                                   "61c6923c18efbbacbd7af9d6fa2e336c", "ade6b640-9528-4dca-8c68-36fbe46123ca", 30,
                                   "c5788ab5-e95e-4131-8bd2-24201610c516", "61c6923c18efbbacbd7af9d6fa2e336c",
                                   ApiKeyStatus.getDefault(), new Date(1558018688733L));
        assertTrue(apikey.isValid());
        ApiKey apikeyInvalid = new ApiKey("\u0016\f,₟$$\u001f䂊*4L445544]뇜䲭4\tJY'\u001d%䰢4魩C;\u0002(B>\u000f쯫忴?\u0016/绳55穔�?�4L5?諳\u0010뿿55?555@ :H",
                                          new Date(1558018690479L), -7,
                                          "\u0016\f,₟$$\u001f䂊*4L445544]뇜䲭4\tJY'\u001d%䰢4魩C;\u0002(B>\u000f쯫忴?\u0016/绳55穔�?�4L5?諳\u0010뿿55?555@ :H",
                                          "1d7e7652-2c6a-47d0-a681-801210b89344", 29, null,
                                          "\u0016\f,₟$$\u001f䂊*4L445544]뇜䲭4\tJY'\u001d%䰢4魩C;\u0002(B>\u000f쯫忴?\u0016/绳55穔�?�4L5?諳\u0010뿿55?555@ :H",
                                          ApiKeyStatus.getDefault(), new Date(1558018685080L));
        assertFalse(apikeyInvalid.isValid());
    }

    /**
     * Tests the equals method.
     */
    @SuppressWarnings("resource")
    @Test
    public void testEquals() {
        try {
            ApiKey apikey1 = new ApiKey("61c6923c18efbbacbd7af9d6fa2e336c", new Date(1558018690268L), 30,
                                        "61c6923c18efbbacbd7af9d6fa2e336c", "6df613d3-8784-4071-9d1a-171da41588c9", 12,
                                        "bf2b1c46-1994-48f9-a001-6182ca554000", "61c6923c18efbbacbd7af9d6fa2e336c",
                                        ApiKeyStatus.getDefault(), new Date(1558018692332L));
            ApiKey apikey2 = new ApiKey("61c6923c18efbbacbd7af9d6fa2e336c", new Date(1558018690268L), 30,
                                        "61c6923c18efbbacbd7af9d6fa2e336c", "6df613d3-8784-4071-9d1a-171da41588c9", 12,
                                        "bf2b1c46-1994-48f9-a001-6182ca554000", "61c6923c18efbbacbd7af9d6fa2e336c",
                                        ApiKeyStatus.getDefault(), new Date(1558018692332L));
            ApiKey apikey3 = new ApiKey("61c6923c18efbbacbd7af9d6fa2e336c", new Date(1558018689581L), -31,
                                        "61c6923c18efbbacbd7af9d6fa2e336c", "b1c2da0b-d5ad-4ffb-8463-b2acfd85c1ec", 47,
                                        "1af13fc2-fbd6-4db6-8ed1-e2bfc58eab5c", "61c6923c18efbbacbd7af9d6fa2e336c",
                                        ApiKeyStatus.getDefault(), new Date(1558018685968L));
            assertNotNull(apikey1);
            assertNotNull(apikey2);
            assertNotNull(apikey3);
            assertNotSame(apikey2, apikey1);
            assertNotSame(apikey3, apikey1);
            assertEquals(apikey2, apikey1);
            assertEquals(apikey2, apikey1);
            assertEquals(apikey1, apikey2);
            assertEquals(apikey1, apikey1);
            assertFalse(apikey1.equals(null));
            assertNotEquals(apikey3, apikey1);
        } catch (Exception exception) {
            fail(exception.getMessage());
        }
    }
}
