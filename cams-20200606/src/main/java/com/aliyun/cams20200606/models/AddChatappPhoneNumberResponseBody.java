// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddChatappPhoneNumberResponseBody extends TeaModel {
    /**
     * <p>com.alicom.access.oxs.client.channel.aliyun.flow.AyFlowExecuteService</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://pop_access_slb_sgvpc/#vpc">http://pop_access_slb_sgvpc/#vpc</a></p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>com.alicom.access.oxs.client.channel.aliyun.flow.dto.AyCommonApiRequest</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>formData</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>13800000000</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddChatappPhoneNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddChatappPhoneNumberResponseBody self = new AddChatappPhoneNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public AddChatappPhoneNumberResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AddChatappPhoneNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddChatappPhoneNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddChatappPhoneNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddChatappPhoneNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
