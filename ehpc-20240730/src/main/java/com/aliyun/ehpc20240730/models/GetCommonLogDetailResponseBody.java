// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetCommonLogDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CreateCluster</p>
     */
    @NameInMap("Action")
    public String action;

    /**
     * <strong>example:</strong>
     * <p>ehpc-hz-abc***</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("LogDetail")
    public java.util.List<GetCommonLogDetailResponseBodyLogDetail> logDetail;

    /**
     * <strong>example:</strong>
     * <p>operation</p>
     */
    @NameInMap("LogType")
    public String logType;

    /**
     * <strong>example:</strong>
     * <p>239***</p>
     */
    @NameInMap("OperatorUid")
    public String operatorUid;

    /**
     * <strong>example:</strong>
     * <p>464E9919-D04F-4D1D-B375-15989492****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>137***</p>
     */
    @NameInMap("Uid")
    public String uid;

    public static GetCommonLogDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCommonLogDetailResponseBody self = new GetCommonLogDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCommonLogDetailResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public GetCommonLogDetailResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetCommonLogDetailResponseBody setLogDetail(java.util.List<GetCommonLogDetailResponseBodyLogDetail> logDetail) {
        this.logDetail = logDetail;
        return this;
    }
    public java.util.List<GetCommonLogDetailResponseBodyLogDetail> getLogDetail() {
        return this.logDetail;
    }

    public GetCommonLogDetailResponseBody setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public GetCommonLogDetailResponseBody setOperatorUid(String operatorUid) {
        this.operatorUid = operatorUid;
        return this;
    }
    public String getOperatorUid() {
        return this.operatorUid;
    }

    public GetCommonLogDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCommonLogDetailResponseBody setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public static class GetCommonLogDetailResponseBodyLogDetailStages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("LogLevel")
        public String logLevel;

        /**
         * <strong>example:</strong>
         * <p>Successfully created security group sg-bcd***</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>CreateSecurityGroup</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>sg-bcd***</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <strong>example:</strong>
         * <p>2024-08-22 14:21:54</p>
         */
        @NameInMap("Time")
        public String time;

        public static GetCommonLogDetailResponseBodyLogDetailStages build(java.util.Map<String, ?> map) throws Exception {
            GetCommonLogDetailResponseBodyLogDetailStages self = new GetCommonLogDetailResponseBodyLogDetailStages();
            return TeaModel.build(map, self);
        }

        public GetCommonLogDetailResponseBodyLogDetailStages setLogLevel(String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public String getLogLevel() {
            return this.logLevel;
        }

        public GetCommonLogDetailResponseBodyLogDetailStages setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetCommonLogDetailResponseBodyLogDetailStages setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetCommonLogDetailResponseBodyLogDetailStages setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetCommonLogDetailResponseBodyLogDetailStages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCommonLogDetailResponseBodyLogDetailStages setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public GetCommonLogDetailResponseBodyLogDetailStages setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class GetCommonLogDetailResponseBodyLogDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ConfigNetwork</p>
         */
        @NameInMap("StageName")
        public String stageName;

        @NameInMap("Stages")
        public java.util.List<GetCommonLogDetailResponseBodyLogDetailStages> stages;

        public static GetCommonLogDetailResponseBodyLogDetail build(java.util.Map<String, ?> map) throws Exception {
            GetCommonLogDetailResponseBodyLogDetail self = new GetCommonLogDetailResponseBodyLogDetail();
            return TeaModel.build(map, self);
        }

        public GetCommonLogDetailResponseBodyLogDetail setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public GetCommonLogDetailResponseBodyLogDetail setStages(java.util.List<GetCommonLogDetailResponseBodyLogDetailStages> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<GetCommonLogDetailResponseBodyLogDetailStages> getStages() {
            return this.stages;
        }

    }

}
