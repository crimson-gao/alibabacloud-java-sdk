// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFigureClustersMergingTaskResponseBody extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static CreateFigureClustersMergingTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFigureClustersMergingTaskResponseBody self = new CreateFigureClustersMergingTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFigureClustersMergingTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateFigureClustersMergingTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFigureClustersMergingTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
