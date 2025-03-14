// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListRobotNodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListRobotNodeResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListRobotNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRobotNodeResponseBody self = new ListRobotNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRobotNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRobotNodeResponseBody setData(java.util.List<ListRobotNodeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListRobotNodeResponseBodyData> getData() {
        return this.data;
    }

    public ListRobotNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRobotNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRobotNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRobotNodeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsOutput")
        public Integer isOutput;

        @NameInMap("ModelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("NodeIdentifier")
        public String nodeIdentifier;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ProcessName")
        public String processName;

        public static ListRobotNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRobotNodeResponseBodyData self = new ListRobotNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRobotNodeResponseBodyData setIsOutput(Integer isOutput) {
            this.isOutput = isOutput;
            return this;
        }
        public Integer getIsOutput() {
            return this.isOutput;
        }

        public ListRobotNodeResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListRobotNodeResponseBodyData setNodeIdentifier(String nodeIdentifier) {
            this.nodeIdentifier = nodeIdentifier;
            return this;
        }
        public String getNodeIdentifier() {
            return this.nodeIdentifier;
        }

        public ListRobotNodeResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListRobotNodeResponseBodyData setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

    }

}
