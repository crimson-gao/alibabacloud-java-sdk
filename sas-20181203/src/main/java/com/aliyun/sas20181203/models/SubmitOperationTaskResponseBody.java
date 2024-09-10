// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SubmitOperationTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AuthorizationExhaust</p>
     */
    @NameInMap("OperateCode")
    public String operateCode;

    /**
     * <strong>example:</strong>
     * <p>0C8487EF-50C2-54BB-8634-10F8C35D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>89f5d7813bd59dd237580a8664b3xxxx</p>
     */
    @NameInMap("RootTaskId")
    public String rootTaskId;

    public static SubmitOperationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitOperationTaskResponseBody self = new SubmitOperationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitOperationTaskResponseBody setOperateCode(String operateCode) {
        this.operateCode = operateCode;
        return this;
    }
    public String getOperateCode() {
        return this.operateCode;
    }

    public SubmitOperationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitOperationTaskResponseBody setRootTaskId(String rootTaskId) {
        this.rootTaskId = rootTaskId;
        return this;
    }
    public String getRootTaskId() {
        return this.rootTaskId;
    }

}
