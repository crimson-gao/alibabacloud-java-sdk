// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RestartDrdsInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the database creation failure records were removed from the PolarDB-X instance.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static RestartDrdsInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartDrdsInstanceResponseBody self = new RestartDrdsInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartDrdsInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestartDrdsInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RestartDrdsInstanceResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
