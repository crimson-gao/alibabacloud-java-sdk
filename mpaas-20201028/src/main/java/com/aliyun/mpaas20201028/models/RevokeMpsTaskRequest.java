// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class RevokeMpsTaskRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RevokeMpsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeMpsTaskRequest self = new RevokeMpsTaskRequest();
        return TeaModel.build(map, self);
    }

    public RevokeMpsTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RevokeMpsTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RevokeMpsTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
