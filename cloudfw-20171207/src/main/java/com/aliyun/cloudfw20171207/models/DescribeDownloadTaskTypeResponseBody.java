// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDownloadTaskTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskTypeArray")
    public java.util.List<DescribeDownloadTaskTypeResponseBodyTaskTypeArray> taskTypeArray;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDownloadTaskTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadTaskTypeResponseBody self = new DescribeDownloadTaskTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadTaskTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDownloadTaskTypeResponseBody setTaskTypeArray(java.util.List<DescribeDownloadTaskTypeResponseBodyTaskTypeArray> taskTypeArray) {
        this.taskTypeArray = taskTypeArray;
        return this;
    }
    public java.util.List<DescribeDownloadTaskTypeResponseBodyTaskTypeArray> getTaskTypeArray() {
        return this.taskTypeArray;
    }

    public DescribeDownloadTaskTypeResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDownloadTaskTypeResponseBodyTaskTypeArray extends TeaModel {
        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskType")
        public String taskType;

        public static DescribeDownloadTaskTypeResponseBodyTaskTypeArray build(java.util.Map<String, ?> map) throws Exception {
            DescribeDownloadTaskTypeResponseBodyTaskTypeArray self = new DescribeDownloadTaskTypeResponseBodyTaskTypeArray();
            return TeaModel.build(map, self);
        }

        public DescribeDownloadTaskTypeResponseBodyTaskTypeArray setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeDownloadTaskTypeResponseBodyTaskTypeArray setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
