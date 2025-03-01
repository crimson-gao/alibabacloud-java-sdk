// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntElementVerifyRequest extends TeaModel {
    @NameInMap("EntName")
    public String entName;

    /**
     * <strong>example:</strong>
     * <p>ENT_2META</p>
     */
    @NameInMap("InfoVerifyType")
    public String infoVerifyType;

    /**
     * <strong>example:</strong>
     * <p>370105*****3892</p>
     */
    @NameInMap("LegalPersonCertNo")
    public String legalPersonCertNo;

    @NameInMap("LegalPersonName")
    public String legalPersonName;

    /**
     * <strong>example:</strong>
     * <p>32132***328932</p>
     */
    @NameInMap("LicenseNo")
    public String licenseNo;

    /**
     * <strong>example:</strong>
     * <p>32198****193000</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <strong>example:</strong>
     * <p>432***421</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <strong>example:</strong>
     * <p>withdraw</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserAuthorization")
    public String userAuthorization;

    public static EntElementVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        EntElementVerifyRequest self = new EntElementVerifyRequest();
        return TeaModel.build(map, self);
    }

    public EntElementVerifyRequest setEntName(String entName) {
        this.entName = entName;
        return this;
    }
    public String getEntName() {
        return this.entName;
    }

    public EntElementVerifyRequest setInfoVerifyType(String infoVerifyType) {
        this.infoVerifyType = infoVerifyType;
        return this;
    }
    public String getInfoVerifyType() {
        return this.infoVerifyType;
    }

    public EntElementVerifyRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public EntElementVerifyRequest setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public EntElementVerifyRequest setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

    public EntElementVerifyRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public EntElementVerifyRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public EntElementVerifyRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public EntElementVerifyRequest setUserAuthorization(String userAuthorization) {
        this.userAuthorization = userAuthorization;
        return this;
    }
    public String getUserAuthorization() {
        return this.userAuthorization;
    }

}
