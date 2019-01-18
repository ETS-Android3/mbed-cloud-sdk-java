// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.adapters;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.TrustedCertificateReq;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.TrustedCertificateResp;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.TrustedCertificateRespList;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.TrustedCertificateUpdateReq;
import com.arm.mbed.cloud.sdk.security.model.TrustedCertificate;
import com.arm.mbed.cloud.sdk.security.model.TrustedCertificateService;
import com.arm.mbed.cloud.sdk.security.model.TrustedCertificateStatus;
import java.util.List;

/**
 * Adapter for trusted certificates.
 */
@Preamble(description = "Adapter for trusted certificates.")
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class TrustedCertificateAdapter {
    /**
     * Constructor.
     */
    private TrustedCertificateAdapter() {
        super();
        // Nothing to do;
    }

    /**
     * Maps a trusted certificate resp into a trusted certificate.
     * 
     * @param toBeMapped
     *            a trusted certificate resp.
     * @return mapped a trusted certificate
     */
    @Internal
    public static TrustedCertificate map(TrustedCertificateResp toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final TrustedCertificate trustedCertificate = new TrustedCertificate(toBeMapped.getAccountId(),
                                                                             toBeMapped.getCertificateFingerprint(),
                                                                             TranslationUtils.toDate(toBeMapped.getCreatedAt()),
                                                                             toBeMapped.getIssuer(),
                                                                             toBeMapped.getOwnerId(),
                                                                             toBeMapped.getSubject(),
                                                                             TranslationUtils.toDate(toBeMapped.getUpdatedAt()),
                                                                             TranslationUtils.toDate(toBeMapped.getValidity()));
        trustedCertificate.setCertificate(toBeMapped.getCertificate());
        trustedCertificate.setDescription(toBeMapped.getDescription());
        trustedCertificate.setDeviceExecutionMode(TranslationUtils.toInt(toBeMapped.getDeviceExecutionMode()));
        trustedCertificate.setEnrollmentMode(TranslationUtils.toBool(toBeMapped.isEnrollmentMode()));
        trustedCertificate.setId(toBeMapped.getId());
        // No field equivalent to isDeveloperCertificate in TrustedCertificate was found in TrustedCertificateResp
        trustedCertificate.setName(toBeMapped.getName());
        trustedCertificate.setService(translateToTrustedCertificateService(toBeMapped.getService()));
        trustedCertificate.setStatus(translateToTrustedCertificateStatus(toBeMapped.getStatus()));
        return trustedCertificate;
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<TrustedCertificateResp, TrustedCertificate> getMapper() {
        return new GenericAdapter.Mapper<TrustedCertificateResp, TrustedCertificate>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public TrustedCertificate map(TrustedCertificateResp toBeMapped) {
                return TrustedCertificateAdapter.map(toBeMapped);
            }
        };
    }

    /**
     * Maps a trusted certificate into a trusted certificate req.
     * 
     * @param toBeMapped
     *            a trusted certificate.
     * @return mapped a trusted certificate req
     */
    @Internal
    public static TrustedCertificateReq reverseMapAddRequest(TrustedCertificate toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final TrustedCertificateReq trustedCertificateReq = new TrustedCertificateReq();
        trustedCertificateReq.setCertificate(toBeMapped.getCertificate());
        trustedCertificateReq.setDescription(toBeMapped.getDescription());
        trustedCertificateReq.setEnrollmentMode(toBeMapped.isEnrollmentMode());
        trustedCertificateReq.setName(toBeMapped.getName());
        trustedCertificateReq.setService(translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelTrustedcertificatereqServiceenum(toBeMapped.getService()));
        // No field equivalent to signature in TrustedCertificateReq was found in TrustedCertificate
        trustedCertificateReq.setStatus(translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelTrustedcertificatereqStatusenum(toBeMapped.getStatus()));
        return trustedCertificateReq;
    }

    /**
     * Maps a trusted certificate resp list into a trusted certificate.
     * 
     * @param toBeMapped
     *            a trusted certificate resp list.
     * @return mapped list response
     */
    @Internal
    public static ListResponse<TrustedCertificate> mapList(TrustedCertificateRespList toBeMapped) {
        final TrustedCertificateRespList finalList = toBeMapped;
        final GenericAdapter.RespList<TrustedCertificateResp> respList = new GenericAdapter.RespList<TrustedCertificateResp>() {
            /**
             * Executes getAfter.
             * 
             * @return something
             */
            @Override
            public String getAfter() {
                return (finalList == null) ? null : finalList.getAfter();
            }

            /**
             * Executes getContinuationMarker.
             * 
             * @return something
             */
            @Override
            public String getContinuationMarker() {
                return null;
            }

            /**
             * Executes getData.
             * 
             * @return something
             */
            @Override
            public List<TrustedCertificateResp> getData() {
                return (finalList == null) ? null : finalList.getData();
            }

            /**
             * Executes getHasMore.
             * 
             * @return something
             */
            @Override
            public Boolean getHasMore() {
                return (finalList == null) ? null : finalList.isHasMore();
            }

            /**
             * Executes getLimit.
             * 
             * @return something
             */
            @Override
            public Integer getLimit() {
                return (finalList == null) ? null : finalList.getLimit();
            }

            /**
             * Executes getOrder.
             * 
             * @return something
             */
            @Override
            public String getOrder() {
                return (finalList == null) ? null : finalList.getOrder().toString();
            }

            /**
             * Executes getTotalCount.
             * 
             * @return something
             */
            @Override
            public Integer getTotalCount() {
                return (finalList == null) ? null : finalList.getTotalCount();
            }
        };
        return GenericAdapter.mapList(respList, TrustedCertificateAdapter.getMapper());
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<TrustedCertificateRespList, ListResponse<TrustedCertificate>> getListMapper() {
        return new GenericAdapter.Mapper<TrustedCertificateRespList, ListResponse<TrustedCertificate>>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public ListResponse<TrustedCertificate> map(TrustedCertificateRespList toBeMapped) {
                return TrustedCertificateAdapter.mapList(toBeMapped);
            }
        };
    }

    /**
     * Maps a trusted certificate into a trusted certificate update req.
     * 
     * @param toBeMapped
     *            a trusted certificate.
     * @return mapped a trusted certificate update req
     */
    @Internal
    public static TrustedCertificateUpdateReq reverseMapUpdateRequest(TrustedCertificate toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final TrustedCertificateUpdateReq trustedCertificateUpdateReq = new TrustedCertificateUpdateReq();
        trustedCertificateUpdateReq.setCertificate(toBeMapped.getCertificate());
        trustedCertificateUpdateReq.setDescription(toBeMapped.getDescription());
        trustedCertificateUpdateReq.setEnrollmentMode(toBeMapped.isEnrollmentMode());
        trustedCertificateUpdateReq.setName(toBeMapped.getName());
        trustedCertificateUpdateReq.setService(translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelTrustedcertificateupdatereqServiceenum(toBeMapped.getService()));
        // No field equivalent to signature in TrustedCertificateUpdateReq was found in TrustedCertificate
        trustedCertificateUpdateReq.setStatus(translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelTrustedcertificateupdatereqStatusenum(toBeMapped.getStatus()));
        return trustedCertificateUpdateReq;
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            a service enum.
     * @return mapped enum value
     */
    @Internal
    protected static TrustedCertificateService
              translateToTrustedCertificateService(TrustedCertificateResp.ServiceEnum toBeMapped) {
        if (toBeMapped == null) {
            return TrustedCertificateService.getUnknownEnum();
        }
        switch (toBeMapped) {
            case LWM2M:
                return TrustedCertificateService.LWM2M;
            case BOOTSTRAP:
                return TrustedCertificateService.BOOTSTRAP;
            default:
                return TrustedCertificateService.getUnknownEnum();
        }
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            a status enum.
     * @return mapped enum value
     */
    @Internal
    protected static TrustedCertificateStatus
              translateToTrustedCertificateStatus(TrustedCertificateResp.StatusEnum toBeMapped) {
        if (toBeMapped == null) {
            return TrustedCertificateStatus.getUnknownEnum();
        }
        switch (toBeMapped) {
            case ACTIVE:
                return TrustedCertificateStatus.ACTIVE;
            case INACTIVE:
                return TrustedCertificateStatus.INACTIVE;
            default:
                return TrustedCertificateStatus.getUnknownEnum();
        }
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            a trusted certificate service.
     * @return mapped enum value
     */
    @Internal
    protected static TrustedCertificateReq.ServiceEnum
              translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelTrustedcertificatereqServiceenum(TrustedCertificateService toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        switch (toBeMapped) {
            case LWM2M:
                return TrustedCertificateReq.ServiceEnum.LWM2M;
            case BOOTSTRAP:
                return TrustedCertificateReq.ServiceEnum.BOOTSTRAP;
            default:
                return null;
        }
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            a trusted certificate status.
     * @return mapped enum value
     */
    @Internal
    protected static TrustedCertificateReq.StatusEnum
              translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelTrustedcertificatereqStatusenum(TrustedCertificateStatus toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        switch (toBeMapped) {
            case ACTIVE:
                return TrustedCertificateReq.StatusEnum.ACTIVE;
            case INACTIVE:
                return TrustedCertificateReq.StatusEnum.INACTIVE;
            default:
                return null;
        }
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            a trusted certificate service.
     * @return mapped enum value
     */
    @Internal
    protected static TrustedCertificateUpdateReq.ServiceEnum
              translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelTrustedcertificateupdatereqServiceenum(TrustedCertificateService toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        switch (toBeMapped) {
            case LWM2M:
                return TrustedCertificateUpdateReq.ServiceEnum.LWM2M;
            case BOOTSTRAP:
                return TrustedCertificateUpdateReq.ServiceEnum.BOOTSTRAP;
            default:
                return null;
        }
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            a trusted certificate status.
     * @return mapped enum value
     */
    @Internal
    protected static TrustedCertificateUpdateReq.StatusEnum
              translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelTrustedcertificateupdatereqStatusenum(TrustedCertificateStatus toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        switch (toBeMapped) {
            case ACTIVE:
                return TrustedCertificateUpdateReq.StatusEnum.ACTIVE;
            case INACTIVE:
                return TrustedCertificateUpdateReq.StatusEnum.INACTIVE;
            default:
                return null;
        }
    }
}
