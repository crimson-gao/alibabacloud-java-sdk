// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static ModifyClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterResponseBody self = new ModifyClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyClusterResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
