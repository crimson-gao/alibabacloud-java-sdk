// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class SendOutboundCommandResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SendOutboundCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendOutboundCommandResponseBody self = new SendOutboundCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public SendOutboundCommandResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendOutboundCommandResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendOutboundCommandResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SendOutboundCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendOutboundCommandResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
