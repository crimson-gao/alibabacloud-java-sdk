// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class GetTaskResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20240905-********-93E9-5D45-B4EF-045743A34071</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResultRequest self = new GetTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
