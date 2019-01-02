// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.security.model;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.SdkModel;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Date;
import java.util.Objects;

/**
 * Model for a trusted certificate. */
@Preamble(
    description = "Model for a trusted certificate."
)
@SuppressWarnings("PMD.CyclomaticComplexity")
public class TrustedCertificate implements SdkModel {
  /**
   * Serialisation Id. */
  private static final long serialVersionUID = 1727697502201821L;

  /**
   * The ID of the account. */
  private String accountId;

  /**
   * X509.v3 trusted certificate in PEM format. */
  private String certificate;

  /**
   * A SHA-256 fingerprint of the certificate. */
  private String certificateFingerprint;

  /**
   * Creation UTC time RFC3339. */
  private Date createdAt;

  /**
   * Human readable description of this certificate. */
  private String description;

  /**
   * Device execution mode where 1 means a developer certificate. */
  private int deviceExecutionMode;

  /**
   * If true, signature is not required. Default value false. */
  private boolean enrollmentMode;

  /**
   * Entity ID. */
  private String id;

  /**
   * Whether or not this certificate is a developer certificate. */
  private boolean isDeveloperCertificate;

  /**
   * Issuer of the certificate. */
  private String issuer;

  /**
   * Certificate name. */
  private String name;

  /**
   * The ID of the owner. */
  private String ownerId;

  /**
   * Service name where the certificate is to be used. */
  private TrustedCertificateService service;

  /**
   * Status of the certificate. */
  private TrustedCertificateStatus status;

  /**
   * Subject of the certificate. */
  private String subject;

  /**
   * Last update UTC time RFC3339. */
  private Date updatedAt;

  /**
   * Expiration time in UTC formatted as RFC3339. */
  private Date validity;

  /**
   * Internal constructor.
   * <p>
   * Note: Should not be used. Use {@link #TrustedCertificate()} instead.
   * @param accountId The ID of the account.
   * @param certificate X509.v3 trusted certificate in PEM format.
   * @param certificateFingerprint A SHA-256 fingerprint of the certificate.
   * @param createdAt Creation UTC time RFC3339.
   * @param description Human readable description of this certificate.
   * @param deviceExecutionMode Device execution mode where 1 means a developer certificate.
   * @param enrollmentMode If true, signature is not required. Default value false.
   * @param id Entity ID.
   * @param isDeveloperCertificate Whether or not this certificate is a developer certificate.
   * @param issuer Issuer of the certificate.
   * @param name Certificate name.
   * @param ownerId The ID of the owner.
   * @param service Service name where the certificate is to be used.
   * @param status Status of the certificate.
   * @param subject Subject of the certificate.
   * @param updatedAt Last update UTC time RFC3339.
   * @param validity Expiration time in UTC formatted as RFC3339.
   */
  @Internal
  @SuppressWarnings("PMD.CyclomaticComplexity")
  public TrustedCertificate(String accountId, String certificate, String certificateFingerprint,
      Date createdAt, String description, int deviceExecutionMode, boolean enrollmentMode,
      String id, boolean isDeveloperCertificate, String issuer, String name, String ownerId,
      TrustedCertificateService service, TrustedCertificateStatus status, String subject,
      Date updatedAt, Date validity) {
    super();
    setAccountId(accountId);
    setCertificate(certificate);
    setCertificateFingerprint(certificateFingerprint);
    setCreatedAt(createdAt);
    setDescription(description);
    setDeviceExecutionMode(deviceExecutionMode);
    setEnrollmentMode(enrollmentMode);
    setId(id);
    setIsDeveloperCertificate(isDeveloperCertificate);
    setIssuer(issuer);
    setName(name);
    setOwnerId(ownerId);
    setService(service);
    setStatus(status);
    setSubject(subject);
    setUpdatedAt(updatedAt);
    setValidity(validity);
  }

  /**
   * Internal constructor.
   * <p>
   * Note: Should not be used. Use {@link #TrustedCertificate()} instead.
   * @param trustedCertificate a trusted certificate.
   */
  @Internal
  public TrustedCertificate(TrustedCertificate trustedCertificate) {
    this(trustedCertificate == null ? (String) null : trustedCertificate.accountId,
        trustedCertificate == null ? (String) null : trustedCertificate.certificate,
        trustedCertificate == null ? (String) null : trustedCertificate.certificateFingerprint,
        trustedCertificate == null ? new java.util.Date() : trustedCertificate.createdAt,
        trustedCertificate == null ? (String) null : trustedCertificate.description,
        trustedCertificate == null ? 0 : trustedCertificate.deviceExecutionMode,
        trustedCertificate != null && trustedCertificate.enrollmentMode,
        trustedCertificate == null ? (String) null : trustedCertificate.id,
        trustedCertificate != null && trustedCertificate.isDeveloperCertificate,
        trustedCertificate == null ? (String) null : trustedCertificate.issuer,
        trustedCertificate == null ? (String) null : trustedCertificate.name,
        trustedCertificate == null ? (String) null : trustedCertificate.ownerId,
        trustedCertificate == null ? TrustedCertificateService.getDefault() : trustedCertificate.service,
        trustedCertificate == null ? TrustedCertificateStatus.getDefault() : trustedCertificate.status,
        trustedCertificate == null ? (String) null : trustedCertificate.subject,
        trustedCertificate == null ? new java.util.Date() : trustedCertificate.updatedAt,
        trustedCertificate == null ? new java.util.Date() : trustedCertificate.validity);
  }

  /**
   * Constructor.
   */
  public TrustedCertificate() {
    this((String) null,
        (String) null,
        (String) null,
        new java.util.Date(),
        (String) null,
        0,
        false,
        (String) null,
        false,
        (String) null,
        (String) null,
        (String) null,
        TrustedCertificateService.getDefault(),
        TrustedCertificateStatus.getDefault(),
        (String) null,
        new java.util.Date(),
        new java.util.Date());
  }

  /**
   * Constructor.
   * @param id Entity ID.
   */
  public TrustedCertificate(String id) {
    this();
    setId(id);
  }

  /**
   * Gets the id of the account.
   * @return accountId
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * Sets the id of the account.
   * @param accountId The ID of the account.
   */
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * Gets x509.v3 trusted certificate in pem format.
   * @return certificate
   */
  public String getCertificate() {
    return certificate;
  }

  /**
   * Sets x509.v3 trusted certificate in pem format.
   * @param certificate X509.v3 trusted certificate in PEM format.
   */
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  /**
   * Gets a sha-256 fingerprint of the certificate.
   * @return certificateFingerprint
   */
  public String getCertificateFingerprint() {
    return certificateFingerprint;
  }

  /**
   * Sets a sha-256 fingerprint of the certificate.
   * @param certificateFingerprint A SHA-256 fingerprint of the certificate.
   */
  public void setCertificateFingerprint(String certificateFingerprint) {
    this.certificateFingerprint = certificateFingerprint;
  }

  /**
   * Gets creation utc time rfc3339.
   * @return createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets creation utc time rfc3339.
   * @param createdAt Creation UTC time RFC3339.
   */
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Gets human readable description of this certificate.
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets human readable description of this certificate.
   * @param description Human readable description of this certificate.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Gets device execution mode where 1 means a developer certificate.
   * @return deviceExecutionMode
   */
  public int getDeviceExecutionMode() {
    return deviceExecutionMode;
  }

  /**
   * Sets device execution mode where 1 means a developer certificate.
   * @param deviceExecutionMode Device execution mode where 1 means a developer certificate.
   */
  public void setDeviceExecutionMode(int deviceExecutionMode) {
    this.deviceExecutionMode = deviceExecutionMode;
  }

  /**
   * Gets if true, signature is not required. default value false.
   * @return enrollmentMode
   */
  public boolean isEnrollmentMode() {
    return enrollmentMode;
  }

  /**
   * Sets if true, signature is not required. default value false.
   * @param enrollmentMode If true, signature is not required. Default value false.
   */
  public void setEnrollmentMode(boolean enrollmentMode) {
    this.enrollmentMode = enrollmentMode;
  }

  /**
   * Gets entity id.
   * @return id
   */
  @Override
  public String getId() {
    return id;
  }

  /**
   * Sets entity id.
   * @param id Entity ID.
   */
  @Override
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets entity id.
   * <p>
   * Similar to {@link #setId(String)}
   * @param trustedCertificateId Entity ID.
   */
  @Internal
  public void setTrustedCertificateId(String trustedCertificateId) {
    setId(trustedCertificateId);
  }

  /**
   * Gets whether or not this certificate is a developer certificate.
   * @return isDeveloperCertificate
   */
  public boolean isDeveloperCertificate() {
    return isDeveloperCertificate;
  }

  /**
   * Sets whether or not this certificate is a developer certificate.
   * @param isDeveloperCertificate Whether or not this certificate is a developer certificate.
   */
  public void setIsDeveloperCertificate(boolean isDeveloperCertificate) {
    this.isDeveloperCertificate = isDeveloperCertificate;
  }

  /**
   * Gets issuer of the certificate.
   * @return issuer
   */
  public String getIssuer() {
    return issuer;
  }

  /**
   * Sets issuer of the certificate.
   * @param issuer Issuer of the certificate.
   */
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  /**
   * Gets certificate name.
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets certificate name.
   * @param name Certificate name.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the id of the owner.
   * @return ownerId
   */
  public String getOwnerId() {
    return ownerId;
  }

  /**
   * Sets the id of the owner.
   * @param ownerId The ID of the owner.
   */
  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  /**
   * Gets service name where the certificate is to be used.
   * @return service
   */
  public TrustedCertificateService getService() {
    return service;
  }

  /**
   * Sets service name where the certificate is to be used.
   * @param service Service name where the certificate is to be used.
   */
  public void setService(TrustedCertificateService service) {
    this.service = service;
  }

  /**
   * Gets status of the certificate.
   * @return status
   */
  public TrustedCertificateStatus getStatus() {
    return status;
  }

  /**
   * Sets status of the certificate.
   * @param status Status of the certificate.
   */
  public void setStatus(TrustedCertificateStatus status) {
    this.status = status;
  }

  /**
   * Gets subject of the certificate.
   * @return subject
   */
  public String getSubject() {
    return subject;
  }

  /**
   * Sets subject of the certificate.
   * @param subject Subject of the certificate.
   */
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Gets last update utc time rfc3339.
   * @return updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Sets last update utc time rfc3339.
   * @param updatedAt Last update UTC time RFC3339.
   */
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Gets expiration time in utc formatted as rfc3339.
   * @return validity
   */
  public Date getValidity() {
    return validity;
  }

  /**
   * Sets expiration time in utc formatted as rfc3339.
   * @param validity Expiration time in UTC formatted as RFC3339.
   */
  public void setValidity(Date validity) {
    this.validity = validity;
  }

  /**
   * Calculates the hash code of this instance based on field values.
   * <p>
   * @see java.lang.Object#hashCode()
   * @return hash code
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
    result = prime * result + ((certificate == null) ? 0 : certificate.hashCode());
    result = prime * result + ((certificateFingerprint == null) ? 0 : certificateFingerprint.hashCode());
    result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
    result = prime * result + ((description == null) ? 0 : description.hashCode());
    result = prime * result +  Objects.hashCode(deviceExecutionMode);
    result = prime * result +  Objects.hashCode(enrollmentMode);
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result +  Objects.hashCode(isDeveloperCertificate);
    result = prime * result + ((issuer == null) ? 0 : issuer.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((ownerId == null) ? 0 : ownerId.hashCode());
    result = prime * result + ((service == null) ? 0 : service.hashCode());
    result = prime * result + ((status == null) ? 0 : status.hashCode());
    result = prime * result + ((subject == null) ? 0 : subject.hashCode());
    result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
    result = prime * result + ((validity == null) ? 0 : validity.hashCode());
    return result;
  }

  /**
   *  Method to ensure {@link #equals(Object)} is correct.
   * <p>
   *  Note: see this article: <a href="https://www.artima.com/lejava/articles/equality.html">canEqual()</a>
   * @param other another object.
   * @return true if the other object is an instance of the class in which canEqual is (re)defined, false otherwise.
   */
  protected boolean canEqual(Object other) {
    return other instanceof TrustedCertificate;
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   * <p>
   * @see java.lang.Object#equals(java.lang.Object)
   * @param obj an object to compare with this instance.
   * @return true if this object is the same as the obj argument; false otherwise.
   */
  @Override
  @SuppressWarnings({"PMD.ExcessiveMethodLength", "PMD.NcssMethodCount"})
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if( !(obj instanceof TrustedCertificate)) {
      return false;
    }
    final TrustedCertificate other = (TrustedCertificate) obj;
    if( !other.canEqual(this)) {
      return false;
    }
    if (accountId == null) {
      if (other.accountId != null) {
        return false;
      }
    } else if (!accountId.equals(other.accountId)) {
      return false;
    }
    if (certificate == null) {
      if (other.certificate != null) {
        return false;
      }
    } else if (!certificate.equals(other.certificate)) {
      return false;
    }
    if (certificateFingerprint == null) {
      if (other.certificateFingerprint != null) {
        return false;
      }
    } else if (!certificateFingerprint.equals(other.certificateFingerprint)) {
      return false;
    }
    if (createdAt == null) {
      if (other.createdAt != null) {
        return false;
      }
    } else if (!createdAt.equals(other.createdAt)) {
      return false;
    }
    if (description == null) {
      if (other.description != null) {
        return false;
      }
    } else if (!description.equals(other.description)) {
      return false;
    }
    if (deviceExecutionMode != other.deviceExecutionMode) {
      return false;
    }
    if (enrollmentMode != other.enrollmentMode) {
      return false;
    }
    if (id == null) {
      if (other.id != null) {
        return false;
      }
    } else if (!id.equals(other.id)) {
      return false;
    }
    if (isDeveloperCertificate != other.isDeveloperCertificate) {
      return false;
    }
    if (issuer == null) {
      if (other.issuer != null) {
        return false;
      }
    } else if (!issuer.equals(other.issuer)) {
      return false;
    }
    if (name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!name.equals(other.name)) {
      return false;
    }
    if (ownerId == null) {
      if (other.ownerId != null) {
        return false;
      }
    } else if (!ownerId.equals(other.ownerId)) {
      return false;
    }
    if (service != other.service) {
      return false;
    }
    if (status != other.status) {
      return false;
    }
    if (subject == null) {
      if (other.subject != null) {
        return false;
      }
    } else if (!subject.equals(other.subject)) {
      return false;
    }
    if (updatedAt == null) {
      if (other.updatedAt != null) {
        return false;
      }
    } else if (!updatedAt.equals(other.updatedAt)) {
      return false;
    }
    if (validity == null) {
      if (other.validity != null) {
        return false;
      }
    } else if (!validity.equals(other.validity)) {
      return false;
    }
    return true;
  }

  /**
   * Returns a string representation of the object.
   * <p>
   * @see java.lang.Object#toString()
   * @return the string representation
   */
  @Override
  public String toString() {
    return "TrustedCertificate [accountId=" + accountId
        + ", certificate=" + certificate
        + ", certificateFingerprint=" + certificateFingerprint
        + ", createdAt=" + createdAt
        + ", description=" + description
        + ", deviceExecutionMode=" + deviceExecutionMode
        + ", enrollmentMode=" + enrollmentMode
        + ", id=" + id
        + ", isDeveloperCertificate=" + isDeveloperCertificate
        + ", issuer=" + issuer
        + ", name=" + name
        + ", ownerId=" + ownerId
        + ", service=" + service
        + ", status=" + status
        + ", subject=" + subject
        + ", updatedAt=" + updatedAt
        + ", validity=" + validity + "]";
  }

  /**
   * Checks whether the model is valid or not.
   * <p>
   * @see SdkModel#isValid()
   * @return true if the model is valid; false otherwise.
   */
  @Override
  public boolean isValid() {
    return true;
  }

  /**
   * Clones this instance.
   * <p>
   * @see java.lang.Object#clone()
   * @return a cloned instance
   */
  @Override
  public TrustedCertificate clone() {
    return new TrustedCertificate(this);
  }
}
