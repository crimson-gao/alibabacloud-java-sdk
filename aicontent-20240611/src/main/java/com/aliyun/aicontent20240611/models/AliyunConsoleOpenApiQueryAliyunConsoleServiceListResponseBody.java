// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.List<AliyunConsoleServiceInfoDTO> data;

    /**
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponseBody self = new AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponseBody();
        return TeaModel.build(map, self);
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponseBody setData(java.util.List<AliyunConsoleServiceInfoDTO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AliyunConsoleServiceInfoDTO> getData() {
        return this.data;
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
