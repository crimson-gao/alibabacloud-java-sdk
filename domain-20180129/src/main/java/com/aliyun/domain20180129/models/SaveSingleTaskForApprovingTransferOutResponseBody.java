// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForApprovingTransferOutResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>40F46D3D-F4F3-4CCB-AC30-2DD20E32E528</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3cb1adc3-20e8-44ae-9e76-e812fa6fc9d8</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveSingleTaskForApprovingTransferOutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForApprovingTransferOutResponseBody self = new SaveSingleTaskForApprovingTransferOutResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForApprovingTransferOutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveSingleTaskForApprovingTransferOutResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
