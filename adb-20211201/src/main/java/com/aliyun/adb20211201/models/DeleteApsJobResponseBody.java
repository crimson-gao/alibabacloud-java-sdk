// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteApsJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>aps-*****</p>
     */
    @NameInMap("ApsJobId")
    public String apsJobId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>-</strong></strong>-5D14-AC9F-*********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteApsJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApsJobResponseBody self = new DeleteApsJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApsJobResponseBody setApsJobId(String apsJobId) {
        this.apsJobId = apsJobId;
        return this;
    }
    public String getApsJobId() {
        return this.apsJobId;
    }

    public DeleteApsJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteApsJobResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DeleteApsJobResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DeleteApsJobResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteApsJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteApsJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteApsJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
