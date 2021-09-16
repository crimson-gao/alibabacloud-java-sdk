// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SuspendSynchronizationJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Success")
    public String success;

    @NameInMap("ErrMessage")
    public String errMessage;

    public static SuspendSynchronizationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SuspendSynchronizationJobResponseBody self = new SuspendSynchronizationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SuspendSynchronizationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SuspendSynchronizationJobResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public SuspendSynchronizationJobResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public SuspendSynchronizationJobResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

}
