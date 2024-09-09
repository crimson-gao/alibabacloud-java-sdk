// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetConsumerGroupSubscriptionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Instance.NotFound</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<GetConsumerGroupSubscriptionResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Parameter instanceId is mandatory for this action .</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>157DF7D4-53FB-58C6-BEBC-A9400E7EF68A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetConsumerGroupSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerGroupSubscriptionResponseBody self = new GetConsumerGroupSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConsumerGroupSubscriptionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConsumerGroupSubscriptionResponseBody setData(java.util.List<GetConsumerGroupSubscriptionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetConsumerGroupSubscriptionResponseBodyData> getData() {
        return this.data;
    }

    public GetConsumerGroupSubscriptionResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetConsumerGroupSubscriptionResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetConsumerGroupSubscriptionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetConsumerGroupSubscriptionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConsumerGroupSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConsumerGroupSubscriptionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConsumerGroupSubscriptionResponseBodyDataConnectionDTO extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192.168.50.191@19908#-2093249153#1534215565#40385215750900</p>
         */
        @NameInMap("clientId")
        public String clientId;

        /**
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("egressIp")
        public String egressIp;

        /**
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("hostname")
        public String hostname;

        /**
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("language")
        public String language;

        /**
         * <strong>example:</strong>
         * <p>BROADCASTING</p>
         */
        @NameInMap("messageModel")
        public String messageModel;

        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static GetConsumerGroupSubscriptionResponseBodyDataConnectionDTO build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerGroupSubscriptionResponseBodyDataConnectionDTO self = new GetConsumerGroupSubscriptionResponseBodyDataConnectionDTO();
            return TeaModel.build(map, self);
        }

        public GetConsumerGroupSubscriptionResponseBodyDataConnectionDTO setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetConsumerGroupSubscriptionResponseBodyDataConnectionDTO setEgressIp(String egressIp) {
            this.egressIp = egressIp;
            return this;
        }
        public String getEgressIp() {
            return this.egressIp;
        }

        public GetConsumerGroupSubscriptionResponseBodyDataConnectionDTO setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public GetConsumerGroupSubscriptionResponseBodyDataConnectionDTO setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetConsumerGroupSubscriptionResponseBodyDataConnectionDTO setMessageModel(String messageModel) {
            this.messageModel = messageModel;
            return this;
        }
        public String getMessageModel() {
            return this.messageModel;
        }

        public GetConsumerGroupSubscriptionResponseBodyDataConnectionDTO setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetConsumerGroupSubscriptionResponseBodyDataSubscriptionDTO extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>GID_inspector_group</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("filterExpression")
        public String filterExpression;

        /**
         * <strong>example:</strong>
         * <p>UNSPECIFIED</p>
         */
        @NameInMap("filterExpressionType")
        public String filterExpressionType;

        /**
         * <strong>example:</strong>
         * <p>BROADCASTING</p>
         */
        @NameInMap("messageModel")
        public String messageModel;

        /**
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("subscriptionStatus")
        public String subscriptionStatus;

        /**
         * <strong>example:</strong>
         * <p>Topic_normal_inspector</p>
         */
        @NameInMap("topicName")
        public String topicName;

        public static GetConsumerGroupSubscriptionResponseBodyDataSubscriptionDTO build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerGroupSubscriptionResponseBodyDataSubscriptionDTO self = new GetConsumerGroupSubscriptionResponseBodyDataSubscriptionDTO();
            return TeaModel.build(map, self);
        }

        public GetConsumerGroupSubscriptionResponseBodyDataSubscriptionDTO setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public GetConsumerGroupSubscriptionResponseBodyDataSubscriptionDTO setFilterExpression(String filterExpression) {
            this.filterExpression = filterExpression;
            return this;
        }
        public String getFilterExpression() {
            return this.filterExpression;
        }

        public GetConsumerGroupSubscriptionResponseBodyDataSubscriptionDTO setFilterExpressionType(String filterExpressionType) {
            this.filterExpressionType = filterExpressionType;
            return this;
        }
        public String getFilterExpressionType() {
            return this.filterExpressionType;
        }

        public GetConsumerGroupSubscriptionResponseBodyDataSubscriptionDTO setMessageModel(String messageModel) {
            this.messageModel = messageModel;
            return this;
        }
        public String getMessageModel() {
            return this.messageModel;
        }

        public GetConsumerGroupSubscriptionResponseBodyDataSubscriptionDTO setSubscriptionStatus(String subscriptionStatus) {
            this.subscriptionStatus = subscriptionStatus;
            return this;
        }
        public String getSubscriptionStatus() {
            return this.subscriptionStatus;
        }

        public GetConsumerGroupSubscriptionResponseBodyDataSubscriptionDTO setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class GetConsumerGroupSubscriptionResponseBodyData extends TeaModel {
        @NameInMap("connectionDTO")
        public GetConsumerGroupSubscriptionResponseBodyDataConnectionDTO connectionDTO;

        @NameInMap("subscriptionDTO")
        public GetConsumerGroupSubscriptionResponseBodyDataSubscriptionDTO subscriptionDTO;

        public static GetConsumerGroupSubscriptionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerGroupSubscriptionResponseBodyData self = new GetConsumerGroupSubscriptionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConsumerGroupSubscriptionResponseBodyData setConnectionDTO(GetConsumerGroupSubscriptionResponseBodyDataConnectionDTO connectionDTO) {
            this.connectionDTO = connectionDTO;
            return this;
        }
        public GetConsumerGroupSubscriptionResponseBodyDataConnectionDTO getConnectionDTO() {
            return this.connectionDTO;
        }

        public GetConsumerGroupSubscriptionResponseBodyData setSubscriptionDTO(GetConsumerGroupSubscriptionResponseBodyDataSubscriptionDTO subscriptionDTO) {
            this.subscriptionDTO = subscriptionDTO;
            return this;
        }
        public GetConsumerGroupSubscriptionResponseBodyDataSubscriptionDTO getSubscriptionDTO() {
            return this.subscriptionDTO;
        }

    }

}
