// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappVerifyAndRegisterRequest extends TeaModel {
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("VerifyCode")
    public String verifyCode;

    public static ChatappVerifyAndRegisterRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatappVerifyAndRegisterRequest self = new ChatappVerifyAndRegisterRequest();
        return TeaModel.build(map, self);
    }

    public ChatappVerifyAndRegisterRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ChatappVerifyAndRegisterRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ChatappVerifyAndRegisterRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}