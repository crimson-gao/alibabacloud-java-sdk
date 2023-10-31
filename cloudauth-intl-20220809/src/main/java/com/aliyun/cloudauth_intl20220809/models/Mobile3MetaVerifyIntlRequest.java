// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Mobile3MetaVerifyIntlRequest extends TeaModel {
    @NameInMap("IdentifyNum")
    public String identifyNum;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("ParamType")
    public String paramType;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("UserName")
    public String userName;

    public static Mobile3MetaVerifyIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaVerifyIntlRequest self = new Mobile3MetaVerifyIntlRequest();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaVerifyIntlRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public Mobile3MetaVerifyIntlRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public Mobile3MetaVerifyIntlRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Mobile3MetaVerifyIntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public Mobile3MetaVerifyIntlRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
