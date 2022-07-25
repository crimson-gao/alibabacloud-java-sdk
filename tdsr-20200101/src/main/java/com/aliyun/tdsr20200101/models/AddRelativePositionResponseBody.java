// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddRelativePositionResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddRelativePositionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddRelativePositionResponseBody self = new AddRelativePositionResponseBody();
        return TeaModel.build(map, self);
    }

    public AddRelativePositionResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AddRelativePositionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddRelativePositionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddRelativePositionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
