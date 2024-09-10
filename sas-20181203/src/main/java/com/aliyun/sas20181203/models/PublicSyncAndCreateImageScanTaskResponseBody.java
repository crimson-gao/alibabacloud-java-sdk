// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicSyncAndCreateImageScanTaskResponseBody extends TeaModel {
    /**
     * <p>The data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public PublicSyncAndCreateImageScanTaskResponseBodyData data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F9353221-40F4-5F98-B73C-2803DC804033</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PublicSyncAndCreateImageScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublicSyncAndCreateImageScanTaskResponseBody self = new PublicSyncAndCreateImageScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public PublicSyncAndCreateImageScanTaskResponseBody setData(PublicSyncAndCreateImageScanTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PublicSyncAndCreateImageScanTaskResponseBodyData getData() {
        return this.data;
    }

    public PublicSyncAndCreateImageScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PublicSyncAndCreateImageScanTaskResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether you can create more image scan tasks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * <blockquote>
         * <p> By default, a maximum of 10 image scan tasks can be running at the same time. If 10 image scan tasks are running, you cannot create an image scan task by calling this operation. You must wait for at least one of the 10 existing image scan tasks to complete before you can create an image scan task.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanCreate")
        public Boolean canCreate;

        /**
         * <p>The timestamp when the image information was collected. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1644286364150</p>
         */
        @NameInMap("CollectTime")
        public Long collectTime;

        /**
         * <p>The timestamp when the image scan task started to run. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1644286364150</p>
         */
        @NameInMap("ExecTime")
        public Long execTime;

        /**
         * <p>The number of images that have been scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("FinishCount")
        public Integer finishCount;

        /**
         * <p>The progress of the image scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The result of the image scan task. Valid values:</p>
         * <ul>
         * <li><strong>SUCCESS</strong>: The task is successful.</li>
         * <li><strong>TASK_NOT_SUPPORT_REGION</strong>: The image is deployed in a region that is not supported by container image scan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The status of the image scan task. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The task is being initialized.</li>
         * <li><strong>PRE_ANALYZER</strong>: The task is being pre-processed.</li>
         * <li><strong>SUCCESS</strong>: The task is successful.</li>
         * <li><strong>FAIL</strong>: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the image scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>a410bb3e68c217a3368bc0238c66886d</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The total number of images to scan.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static PublicSyncAndCreateImageScanTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PublicSyncAndCreateImageScanTaskResponseBodyData self = new PublicSyncAndCreateImageScanTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setCanCreate(Boolean canCreate) {
            this.canCreate = canCreate;
            return this;
        }
        public Boolean getCanCreate() {
            return this.canCreate;
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setCollectTime(Long collectTime) {
            this.collectTime = collectTime;
            return this;
        }
        public Long getCollectTime() {
            return this.collectTime;
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setExecTime(Long execTime) {
            this.execTime = execTime;
            return this;
        }
        public Long getExecTime() {
            return this.execTime;
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setFinishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }
        public Integer getFinishCount() {
            return this.finishCount;
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public PublicSyncAndCreateImageScanTaskResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
