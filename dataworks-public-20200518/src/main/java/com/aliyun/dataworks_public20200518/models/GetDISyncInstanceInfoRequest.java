// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDISyncInstanceInfoRequest extends TeaModel {
    /**
     * <p>*   If you set the TaskType parameter to DI_REALTIME, set the FileId parameter to the ID of the real-time synchronization node that you want to query.</p>
     * <p>*   If you set the TaskType parameter to DI_SOLUTION, set the FileId parameter to the ID of the data synchronization solution that you want to query.</p>
     * <br>
     * <p>You can call the [ListFiles](~~173942~~) operation to obtain the ID of the real-time synchronization node or data synchronization solution.</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.</p>
     * <br>
     * <p>This parameter specifies the DataWorks workspace to which the operation is applied.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the object that you want to query. Valid values:</p>
     * <br>
     * <p>*   DI_REALTIME: real-time synchronization node</p>
     * <p>*   DI_SOLUTION: data synchronization solution</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetDISyncInstanceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncInstanceInfoRequest self = new GetDISyncInstanceInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDISyncInstanceInfoRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public GetDISyncInstanceInfoRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetDISyncInstanceInfoRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
