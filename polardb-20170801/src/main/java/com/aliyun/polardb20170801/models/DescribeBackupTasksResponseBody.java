// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Items")
    public DescribeBackupTasksResponseBodyItems items;

    public static DescribeBackupTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTasksResponseBody self = new DescribeBackupTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupTasksResponseBody setItems(DescribeBackupTasksResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeBackupTasksResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeBackupTasksResponseBodyItemsBackupJob extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Process")
        public String process;

        @NameInMap("BackupJobId")
        public String backupJobId;

        @NameInMap("JobMode")
        public String jobMode;

        @NameInMap("BackupProgressStatus")
        public String backupProgressStatus;

        @NameInMap("TaskAction")
        public String taskAction;

        public static DescribeBackupTasksResponseBodyItemsBackupJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTasksResponseBodyItemsBackupJob self = new DescribeBackupTasksResponseBodyItemsBackupJob();
            return TeaModel.build(map, self);
        }

        public DescribeBackupTasksResponseBodyItemsBackupJob setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeBackupTasksResponseBodyItemsBackupJob setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeBackupTasksResponseBodyItemsBackupJob setBackupJobId(String backupJobId) {
            this.backupJobId = backupJobId;
            return this;
        }
        public String getBackupJobId() {
            return this.backupJobId;
        }

        public DescribeBackupTasksResponseBodyItemsBackupJob setJobMode(String jobMode) {
            this.jobMode = jobMode;
            return this;
        }
        public String getJobMode() {
            return this.jobMode;
        }

        public DescribeBackupTasksResponseBodyItemsBackupJob setBackupProgressStatus(String backupProgressStatus) {
            this.backupProgressStatus = backupProgressStatus;
            return this;
        }
        public String getBackupProgressStatus() {
            return this.backupProgressStatus;
        }

        public DescribeBackupTasksResponseBodyItemsBackupJob setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

    }

    public static class DescribeBackupTasksResponseBodyItems extends TeaModel {
        @NameInMap("BackupJob")
        public java.util.List<DescribeBackupTasksResponseBodyItemsBackupJob> backupJob;

        public static DescribeBackupTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTasksResponseBodyItems self = new DescribeBackupTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeBackupTasksResponseBodyItems setBackupJob(java.util.List<DescribeBackupTasksResponseBodyItemsBackupJob> backupJob) {
            this.backupJob = backupJob;
            return this;
        }
        public java.util.List<DescribeBackupTasksResponseBodyItemsBackupJob> getBackupJob() {
            return this.backupJob;
        }

    }

}
