// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetTopicResponseBody extends TeaModel {
    /**
     * <p>The details of the event.</p>
     */
    @NameInMap("Data")
    public GetTopicResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>1031203110005</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameters are invalid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFGH-IJKLMNOPQ</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTopicResponseBody self = new GetTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTopicResponseBody setData(GetTopicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTopicResponseBodyData getData() {
        return this.data;
    }

    public GetTopicResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTopicResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTopicResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTopicResponseBodyData extends TeaModel {
        /**
         * <p>The timestamp when the event was found.</p>
         * 
         * <strong>example:</strong>
         * <p>1553524393000</p>
         */
        @NameInMap("AddTime")
        public Long addTime;

        /**
         * <p>The timestamp when the first alert was reported.</p>
         * 
         * <strong>example:</strong>
         * <p>1553524393000</p>
         */
        @NameInMap("AlertTime")
        public Long alertTime;

        /**
         * <p>The ID of the Alibaba Cloud account used by the alert recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>952795****</p>
         */
        @NameInMap("Assigner")
        public String assigner;

        /**
         * <p>The margin of the worst baseline instance. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("BaselineBuffer")
        public Long baselineBuffer;

        /**
         * <p>The ID of the baseline to which the worst baseline instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The ID of the cycle of the worst baseline instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BaselineInGroupId")
        public Integer baselineInGroupId;

        /**
         * <p>The name of the baseline to which the worst baseline instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Baseline name</p>
         */
        @NameInMap("BaselineName")
        public String baselineName;

        /**
         * <p>The status of the baseline. Valid values: ERROR, SAFE, DANGROUS, and OVER. The value ERROR indicates that no nodes are associated with the baseline, or all nodes associated with the baseline are suspended. The value SAFE indicates that nodes are run before the alert duration begins. The value DANGROUS indicates that nodes are still running after the alert duration ends but the committed completion time does not arrive. The value OVER indicates that nodes are still running after the committed completion time.</p>
         * 
         * <strong>example:</strong>
         * <p>SAFE</p>
         */
        @NameInMap("BaselineStatus")
        public String baselineStatus;

        /**
         * <p>The margin of the event. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("Buffer")
        public Long buffer;

        /**
         * <p>The timestamp when the event was last processed.</p>
         * 
         * <strong>example:</strong>
         * <p>1553524393000</p>
         */
        @NameInMap("DealTime")
        public Long dealTime;

        /**
         * <p>The ID of the Alibaba Cloud account used by the user who last processed the event.</p>
         * 
         * <strong>example:</strong>
         * <p>952795****</p>
         */
        @NameInMap("DealUser")
        public String dealUser;

        /**
         * <p>The timestamp when the event was processed.</p>
         * 
         * <strong>example:</strong>
         * <p>1553524393000</p>
         */
        @NameInMap("FixTime")
        public Long fixTime;

        /**
         * <p>The timestamp when the event occurred. A time difference may exist between the time when the event occurred and the time when the event was found.</p>
         * 
         * <strong>example:</strong>
         * <p>1553524393000</p>
         */
        @NameInMap("HappenTime")
        public Long happenTime;

        /**
         * <p>The ID of the instance that triggered the event.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The timestamp when the system reports the next alert.</p>
         * 
         * <strong>example:</strong>
         * <p>1553524393000</p>
         */
        @NameInMap("NextAlertTime")
        public Long nextAlertTime;

        /**
         * <p>The ID of the node that triggered the event.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node that triggered the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Node name</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The ID of the Alibaba Cloud account used by the event owner.</p>
         * 
         * <strong>example:</strong>
         * <p>952795****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the workspace to which the node that triggered the event belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TopicId")
        public Long topicId;

        /**
         * <p>The name of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>1234 error</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        /**
         * <p>The status of the event. Valid values: IGNORE, NEW, FIXING, and RECOVER.</p>
         * 
         * <strong>example:</strong>
         * <p>FIXING</p>
         */
        @NameInMap("TopicStatus")
        public String topicStatus;

        /**
         * <p>The type of the event. Valid values: SLOW and ERROR. The value SLOW indicates that the duration of the task is significantly longer than the average duration of the task in previous cycles. The value ERROR indicates that the task fails to run.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
        @NameInMap("TopicType")
        public String topicType;

        public static GetTopicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTopicResponseBodyData self = new GetTopicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTopicResponseBodyData setAddTime(Long addTime) {
            this.addTime = addTime;
            return this;
        }
        public Long getAddTime() {
            return this.addTime;
        }

        public GetTopicResponseBodyData setAlertTime(Long alertTime) {
            this.alertTime = alertTime;
            return this;
        }
        public Long getAlertTime() {
            return this.alertTime;
        }

        public GetTopicResponseBodyData setAssigner(String assigner) {
            this.assigner = assigner;
            return this;
        }
        public String getAssigner() {
            return this.assigner;
        }

        public GetTopicResponseBodyData setBaselineBuffer(Long baselineBuffer) {
            this.baselineBuffer = baselineBuffer;
            return this;
        }
        public Long getBaselineBuffer() {
            return this.baselineBuffer;
        }

        public GetTopicResponseBodyData setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetTopicResponseBodyData setBaselineInGroupId(Integer baselineInGroupId) {
            this.baselineInGroupId = baselineInGroupId;
            return this;
        }
        public Integer getBaselineInGroupId() {
            return this.baselineInGroupId;
        }

        public GetTopicResponseBodyData setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public GetTopicResponseBodyData setBaselineStatus(String baselineStatus) {
            this.baselineStatus = baselineStatus;
            return this;
        }
        public String getBaselineStatus() {
            return this.baselineStatus;
        }

        public GetTopicResponseBodyData setBuffer(Long buffer) {
            this.buffer = buffer;
            return this;
        }
        public Long getBuffer() {
            return this.buffer;
        }

        public GetTopicResponseBodyData setDealTime(Long dealTime) {
            this.dealTime = dealTime;
            return this;
        }
        public Long getDealTime() {
            return this.dealTime;
        }

        public GetTopicResponseBodyData setDealUser(String dealUser) {
            this.dealUser = dealUser;
            return this;
        }
        public String getDealUser() {
            return this.dealUser;
        }

        public GetTopicResponseBodyData setFixTime(Long fixTime) {
            this.fixTime = fixTime;
            return this;
        }
        public Long getFixTime() {
            return this.fixTime;
        }

        public GetTopicResponseBodyData setHappenTime(Long happenTime) {
            this.happenTime = happenTime;
            return this;
        }
        public Long getHappenTime() {
            return this.happenTime;
        }

        public GetTopicResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetTopicResponseBodyData setNextAlertTime(Long nextAlertTime) {
            this.nextAlertTime = nextAlertTime;
            return this;
        }
        public Long getNextAlertTime() {
            return this.nextAlertTime;
        }

        public GetTopicResponseBodyData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetTopicResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetTopicResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTopicResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetTopicResponseBodyData setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public GetTopicResponseBodyData setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public GetTopicResponseBodyData setTopicStatus(String topicStatus) {
            this.topicStatus = topicStatus;
            return this;
        }
        public String getTopicStatus() {
            return this.topicStatus;
        }

        public GetTopicResponseBodyData setTopicType(String topicType) {
            this.topicType = topicType;
            return this;
        }
        public String getTopicType() {
            return this.topicType;
        }

    }

}
