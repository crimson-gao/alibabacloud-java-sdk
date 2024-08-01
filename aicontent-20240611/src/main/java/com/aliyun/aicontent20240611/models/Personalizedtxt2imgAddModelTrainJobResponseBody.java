// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgAddModelTrainJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public Personalizedtxt2imgAddModelTrainJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static Personalizedtxt2imgAddModelTrainJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Personalizedtxt2imgAddModelTrainJobResponseBody self = new Personalizedtxt2imgAddModelTrainJobResponseBody();
        return TeaModel.build(map, self);
    }

    public Personalizedtxt2imgAddModelTrainJobResponseBody setData(Personalizedtxt2imgAddModelTrainJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public Personalizedtxt2imgAddModelTrainJobResponseBodyData getData() {
        return this.data;
    }

    public Personalizedtxt2imgAddModelTrainJobResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public Personalizedtxt2imgAddModelTrainJobResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public Personalizedtxt2imgAddModelTrainJobResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public Personalizedtxt2imgAddModelTrainJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Personalizedtxt2imgAddModelTrainJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Personalizedtxt2imgAddModelTrainJobResponseBodyDataInferenceJobList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-12-25T12:00:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>3220</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("jobStatus")
        public String jobStatus;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("jobTrainProgress")
        public Double jobTrainProgress;

        /**
         * <strong>example:</strong>
         * <p>modelId-xxxx-xxxx-xxxx</p>
         */
        @NameInMap("modelId")
        public String modelId;

        /**
         * <strong>example:</strong>
         * <p>promptId-xxxx-xxxx-xxxx</p>
         */
        @NameInMap("promptId")
        public String promptId;

        /**
         * <strong>example:</strong>
         * <p>0000.png</p>
         */
        @NameInMap("resultImageUrl")
        public java.util.List<String> resultImageUrl;

        public static Personalizedtxt2imgAddModelTrainJobResponseBodyDataInferenceJobList build(java.util.Map<String, ?> map) throws Exception {
            Personalizedtxt2imgAddModelTrainJobResponseBodyDataInferenceJobList self = new Personalizedtxt2imgAddModelTrainJobResponseBodyDataInferenceJobList();
            return TeaModel.build(map, self);
        }

        public Personalizedtxt2imgAddModelTrainJobResponseBodyDataInferenceJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public Personalizedtxt2imgAddModelTrainJobResponseBodyDataInferenceJobList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public Personalizedtxt2imgAddModelTrainJobResponseBodyDataInferenceJobList setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public Personalizedtxt2imgAddModelTrainJobResponseBodyDataInferenceJobList setJobTrainProgress(Double jobTrainProgress) {
            this.jobTrainProgress = jobTrainProgress;
            return this;
        }
        public Double getJobTrainProgress() {
            return this.jobTrainProgress;
        }

        public Personalizedtxt2imgAddModelTrainJobResponseBodyDataInferenceJobList setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public Personalizedtxt2imgAddModelTrainJobResponseBodyDataInferenceJobList setPromptId(String promptId) {
            this.promptId = promptId;
            return this;
        }
        public String getPromptId() {
            return this.promptId;
        }

        public Personalizedtxt2imgAddModelTrainJobResponseBodyDataInferenceJobList setResultImageUrl(java.util.List<String> resultImageUrl) {
            this.resultImageUrl = resultImageUrl;
            return this;
        }
        public java.util.List<String> getResultImageUrl() {
            return this.resultImageUrl;
        }

    }

    public static class Personalizedtxt2imgAddModelTrainJobResponseBodyData extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>456</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("imageUrl")
        public java.util.List<String> imageUrl;

        @NameInMap("inferenceImageCount")
        public Integer inferenceImageCount;

        @NameInMap("inferenceJobList")
        public java.util.List<Personalizedtxt2imgAddModelTrainJobResponseBodyDataInferenceJobList> inferenceJobList;

        /**
         * <strong>example:</strong>
         * <p>TRAINING</p>
         */
        @NameInMap("jobStatus")
        public String jobStatus;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("jobTrainProgress")
        public Double jobTrainProgress;

        /**
         * <strong>example:</strong>
         * <p>modelId-xxxx-xxxx-xxxx</p>
         */
        @NameInMap("modelId")
        public String modelId;

        /**
         * <strong>example:</strong>
         * <p>可爱熊猫模型训练任务</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>panda</p>
         */
        @NameInMap("objectType")
        public String objectType;

        public static Personalizedtxt2imgAddModelTrainJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            Personalizedtxt2imgAddModelTrainJobResponseBodyData self = new Personalizedtxt2imgAddModelTrainJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public Personalizedtxt2imgAddModelTrainJobResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public Personalizedtxt2imgAddModelTrainJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public Personalizedtxt2imgAddModelTrainJobResponseBodyData setImageUrl(java.util.List<String> imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public java.util.List<String> getImageUrl() {
            return this.imageUrl;
        }

        public Personalizedtxt2imgAddModelTrainJobResponseBodyData setInferenceImageCount(Integer inferenceImageCount) {
            this.inferenceImageCount = inferenceImageCount;
            return this;
        }
        public Integer getInferenceImageCount() {
            return this.inferenceImageCount;
        }

        public Personalizedtxt2imgAddModelTrainJobResponseBodyData setInferenceJobList(java.util.List<Personalizedtxt2imgAddModelTrainJobResponseBodyDataInferenceJobList> inferenceJobList) {
            this.inferenceJobList = inferenceJobList;
            return this;
        }
        public java.util.List<Personalizedtxt2imgAddModelTrainJobResponseBodyDataInferenceJobList> getInferenceJobList() {
            return this.inferenceJobList;
        }

        public Personalizedtxt2imgAddModelTrainJobResponseBodyData setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public Personalizedtxt2imgAddModelTrainJobResponseBodyData setJobTrainProgress(Double jobTrainProgress) {
            this.jobTrainProgress = jobTrainProgress;
            return this;
        }
        public Double getJobTrainProgress() {
            return this.jobTrainProgress;
        }

        public Personalizedtxt2imgAddModelTrainJobResponseBodyData setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public Personalizedtxt2imgAddModelTrainJobResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Personalizedtxt2imgAddModelTrainJobResponseBodyData setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

}
