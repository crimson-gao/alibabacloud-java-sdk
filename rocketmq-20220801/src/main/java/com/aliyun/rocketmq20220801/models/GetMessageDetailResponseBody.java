// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetMessageDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Topic.NotFound</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetMessageDetailResponseBodyData data;

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
     * <p>FAEBD71F-E839-52F9-BD7B-8F1290525841</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetMessageDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageDetailResponseBody self = new GetMessageDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMessageDetailResponseBody setData(GetMessageDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMessageDetailResponseBodyData getData() {
        return this.data;
    }

    public GetMessageDetailResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetMessageDetailResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetMessageDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMessageDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMessageDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMessageDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMessageDetailResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("body")
        public String body;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("bodySize")
        public Integer bodySize;

        /**
         * <strong>example:</strong>
         * <p>xxx.xx.xxx.xx</p>
         */
        @NameInMap("bornHost")
        public String bornHost;

        /**
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("bornTime")
        public String bornTime;

        /**
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("messageGroup")
        public String messageGroup;

        /**
         * <strong>example:</strong>
         * <p>01BE87E485F0C7808C04543CAF00000001</p>
         */
        @NameInMap("messageId")
        public String messageId;

        @NameInMap("messageKeys")
        public java.util.List<String> messageKeys;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("messageTag")
        public String messageTag;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("messageType")
        public String messageType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>xxx.xx.xxx.xx</p>
         */
        @NameInMap("storeHost")
        public String storeHost;

        /**
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("storeTime")
        public String storeTime;

        @NameInMap("systemProperties")
        public java.util.Map<String, String> systemProperties;

        /**
         * <strong>example:</strong>
         * <p>topic_test</p>
         */
        @NameInMap("topicName")
        public String topicName;

        @NameInMap("userProperties")
        public java.util.Map<String, String> userProperties;

        public static GetMessageDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMessageDetailResponseBodyData self = new GetMessageDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMessageDetailResponseBodyData setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public GetMessageDetailResponseBodyData setBodySize(Integer bodySize) {
            this.bodySize = bodySize;
            return this;
        }
        public Integer getBodySize() {
            return this.bodySize;
        }

        public GetMessageDetailResponseBodyData setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

        public GetMessageDetailResponseBodyData setBornTime(String bornTime) {
            this.bornTime = bornTime;
            return this;
        }
        public String getBornTime() {
            return this.bornTime;
        }

        public GetMessageDetailResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMessageDetailResponseBodyData setMessageGroup(String messageGroup) {
            this.messageGroup = messageGroup;
            return this;
        }
        public String getMessageGroup() {
            return this.messageGroup;
        }

        public GetMessageDetailResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public GetMessageDetailResponseBodyData setMessageKeys(java.util.List<String> messageKeys) {
            this.messageKeys = messageKeys;
            return this;
        }
        public java.util.List<String> getMessageKeys() {
            return this.messageKeys;
        }

        public GetMessageDetailResponseBodyData setMessageTag(String messageTag) {
            this.messageTag = messageTag;
            return this;
        }
        public String getMessageTag() {
            return this.messageTag;
        }

        public GetMessageDetailResponseBodyData setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public GetMessageDetailResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetMessageDetailResponseBodyData setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public GetMessageDetailResponseBodyData setStoreTime(String storeTime) {
            this.storeTime = storeTime;
            return this;
        }
        public String getStoreTime() {
            return this.storeTime;
        }

        public GetMessageDetailResponseBodyData setSystemProperties(java.util.Map<String, String> systemProperties) {
            this.systemProperties = systemProperties;
            return this;
        }
        public java.util.Map<String, String> getSystemProperties() {
            return this.systemProperties;
        }

        public GetMessageDetailResponseBodyData setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public GetMessageDetailResponseBodyData setUserProperties(java.util.Map<String, String> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public java.util.Map<String, String> getUserProperties() {
            return this.userProperties;
        }

    }

}
