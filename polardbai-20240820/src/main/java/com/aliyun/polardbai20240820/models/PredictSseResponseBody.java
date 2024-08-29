// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20240820.models;

import com.aliyun.tea.*;

public class PredictSseResponseBody extends TeaModel {
    @NameInMap("data")
    public Object data;

    /**
     * <strong>example:</strong>
     * <p>ER_ILLEGAL_MODEL_CLASS</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Illegal model class.</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>983863E2-****-1D15-A4AE-3468CD75383D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static PredictSseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PredictSseResponseBody self = new PredictSseResponseBody();
        return TeaModel.build(map, self);
    }

    public PredictSseResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public PredictSseResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public PredictSseResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public PredictSseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PredictSseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
