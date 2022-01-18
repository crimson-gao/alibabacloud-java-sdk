// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosClusterResponseBody extends TeaModel {
    // 响应码
    @NameInMap("Code")
    public Integer code;

    // 修改结果
    @NameInMap("Data")
    public String data;

    // http状态码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 响应信息
    @NameInMap("Message")
    public String message;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 成功标志
    @NameInMap("Success")
    public Boolean success;

    public static UpdateNacosClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosClusterResponseBody self = new UpdateNacosClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNacosClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateNacosClusterResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateNacosClusterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateNacosClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateNacosClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateNacosClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
