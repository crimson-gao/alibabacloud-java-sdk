// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ValidateTaobaoAccountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20******001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>42******681</p>
     */
    @NameInMap("BizUid")
    public String bizUid;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtJson")
    public String extJson;

    /**
     * <strong>example:</strong>
     * <p>181****0115</p>
     */
    @NameInMap("MobileNo")
    public String mobileNo;

    @NameInMap("TbUserNick")
    public String tbUserNick;

    public static ValidateTaobaoAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateTaobaoAccountRequest self = new ValidateTaobaoAccountRequest();
        return TeaModel.build(map, self);
    }

    public ValidateTaobaoAccountRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ValidateTaobaoAccountRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public ValidateTaobaoAccountRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

    public ValidateTaobaoAccountRequest setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }

    public ValidateTaobaoAccountRequest setTbUserNick(String tbUserNick) {
        this.tbUserNick = tbUserNick;
        return this;
    }
    public String getTbUserNick() {
        return this.tbUserNick;
    }

}
