// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class StopInstanceResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    // http状态码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 实例Id
    @NameInMap("InstanceId")
    public String instanceId;

    // 说明
    @NameInMap("Message")
    public String message;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 成功标志
    @NameInMap("Success")
    public Boolean success;

    public static StopInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceResponseBody self = new StopInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public StopInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StopInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
