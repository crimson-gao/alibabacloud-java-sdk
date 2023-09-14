// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListUserDefinedEventSourcesResponseBody extends TeaModel {
    /**
     * <p>The returned response code. The value Success indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListUserDefinedEventSourcesResponseBodyData data;

    /**
     * <p>The returned error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. Valid values: true and false.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListUserDefinedEventSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserDefinedEventSourcesResponseBody self = new ListUserDefinedEventSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserDefinedEventSourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserDefinedEventSourcesResponseBody setData(ListUserDefinedEventSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUserDefinedEventSourcesResponseBodyData getData() {
        return this.data;
    }

    public ListUserDefinedEventSourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserDefinedEventSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserDefinedEventSourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters extends TeaModel {
        /**
         * <p>The CIDR blocks that are used for security settings. This parameter is required only if SecurityConfig is set to ip. You can enter CIDR blocks or IP addresses.</p>
         */
        @NameInMap("Ip")
        public java.util.List<String> ip;

        /**
         * <p>The HTTP request method supported by the generated webhook URL. You can select multiple values. Valid values: GET POST PUT PATCH DELETE HEAD OPTIONS TRACE GET, POST, PUT, PATCH, DELETE, HEAD, OPTIONS, TRACE, and CONNECT.</p>
         */
        @NameInMap("Method")
        public java.util.List<String> method;

        @NameInMap("PublicWebHookUrl")
        public java.util.List<String> publicWebHookUrl;

        /**
         * <p>The security domain names. This parameter is required only if SecurityConfig is set to referer. You can enter domain names.</p>
         */
        @NameInMap("Referer")
        public java.util.List<String> referer;

        /**
         * <p>The type of security settings. Valid values: none: No configuration is required. ip: CIDR blocks. referer: security domain names.</p>
         */
        @NameInMap("SecurityConfig")
        public String securityConfig;

        /**
         * <p>The protocol type that is supported by the generated webhook URL. Valid values: HTTP HTTPS HTTP, HTTPS, and HTTP&HTTPS.</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("VpcWebHookUrl")
        public java.util.List<String> vpcWebHookUrl;

        public static ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters self = new ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters();
            return TeaModel.build(map, self);
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters setMethod(java.util.List<String> method) {
            this.method = method;
            return this;
        }
        public java.util.List<String> getMethod() {
            return this.method;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters setPublicWebHookUrl(java.util.List<String> publicWebHookUrl) {
            this.publicWebHookUrl = publicWebHookUrl;
            return this;
        }
        public java.util.List<String> getPublicWebHookUrl() {
            return this.publicWebHookUrl;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters setReferer(java.util.List<String> referer) {
            this.referer = referer;
            return this;
        }
        public java.util.List<String> getReferer() {
            return this.referer;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters setSecurityConfig(String securityConfig) {
            this.securityConfig = securityConfig;
            return this;
        }
        public String getSecurityConfig() {
            return this.securityConfig;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters setVpcWebHookUrl(java.util.List<String> vpcWebHookUrl) {
            this.vpcWebHookUrl = vpcWebHookUrl;
            return this;
        }
        public java.util.List<String> getVpcWebHookUrl() {
            return this.vpcWebHookUrl;
        }

    }

    public static class ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceKafkaParameters extends TeaModel {
        @NameInMap("ConsumerGroup")
        public String consumerGroup;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MaximumTasks")
        public Integer maximumTasks;

        @NameInMap("Network")
        public String network;

        @NameInMap("OffsetReset")
        public String offsetReset;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceKafkaParameters self = new ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceKafkaParameters();
            return TeaModel.build(map, self);
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceKafkaParameters setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceKafkaParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceKafkaParameters setMaximumTasks(Integer maximumTasks) {
            this.maximumTasks = maximumTasks;
            return this;
        }
        public Integer getMaximumTasks() {
            return this.maximumTasks;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceKafkaParameters setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceKafkaParameters setOffsetReset(String offsetReset) {
            this.offsetReset = offsetReset;
            return this;
        }
        public String getOffsetReset() {
            return this.offsetReset;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceKafkaParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceKafkaParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceKafkaParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceKafkaParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceKafkaParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters extends TeaModel {
        /**
         * <p>Indicates whether Base64 decoding is enabled. By default, Base64 decoding is enabled.</p>
         */
        @NameInMap("IsBase64Decode")
        public Boolean isBase64Decode;

        /**
         * <p>The name of the queue in MNS.</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The region where the MNS queue resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters self = new ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters();
            return TeaModel.build(map, self);
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters setIsBase64Decode(Boolean isBase64Decode) {
            this.isBase64Decode = isBase64Decode;
            return this;
        }
        public Boolean getIsBase64Decode() {
            return this.isBase64Decode;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters extends TeaModel {
        /**
         * <p>The ID of the Message Queue for RabbitMQ instance. For more information, see Limits.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the queue in the Message Queue for RabbitMQ instance. For more information, see Limits.</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The ID of the region where the Message Queue for RabbitMQ instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The vhost name of the Message Queue for RabbitMQ instance. For more information, see Limits.</p>
         */
        @NameInMap("VirtualHostName")
        public String virtualHostName;

        public static ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters self = new ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters setVirtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

    }

    public static class ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters extends TeaModel {
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The ID of the consumer group in the Message Queue for Apache RocketMQ instance.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        /**
         * <p>The ID of the Message Queue for Apache RocketMQ instance. For more information, see Limits.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceNetwork")
        public String instanceNetwork;

        @NameInMap("InstancePassword")
        public String instancePassword;

        @NameInMap("InstanceSecurityGroupId")
        public String instanceSecurityGroupId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceUsername")
        public String instanceUsername;

        @NameInMap("InstanceVSwitchIds")
        public String instanceVSwitchIds;

        @NameInMap("InstanceVpcId")
        public String instanceVpcId;

        /**
         * <p>The offset from which messages are consumed. Valid values:</p>
         * <br>
         * <p>- CONSUME_FROM_LAST_OFFSET: Messages are consumed from the latest offset. </p>
         * <br>
         * <p>- CONSUME_FROM_FIRST_OFFSET: Messages are consumed from the earliest offset. </p>
         * <br>
         * <p>- CONSUME_FROM_TIMESTAMP: Messages are consumed from the offset at the specified point in time. </p>
         * <br>
         * <p>Default value: CONSUME_FROM_LAST_OFFSET.</p>
         */
        @NameInMap("Offset")
        public String offset;

        /**
         * <p>The region where the Message Queue for Apache RocketMQ instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The tag that is used to filter messages.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The timestamp that indicates the time from which messages are consumed. This parameter is valid only if Offset is set to CONSUME_FROM_TIMESTAMP.</p>
         */
        @NameInMap("Timestamp")
        public Float timestamp;

        /**
         * <p>The name of the topic in Message Queue for Apache RocketMQ instance. For more information, see Limits.</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters self = new ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters();
            return TeaModel.build(map, self);
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setInstanceEndpoint(String instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }
        public String getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setInstanceNetwork(String instanceNetwork) {
            this.instanceNetwork = instanceNetwork;
            return this;
        }
        public String getInstanceNetwork() {
            return this.instanceNetwork;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setInstancePassword(String instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }
        public String getInstancePassword() {
            return this.instancePassword;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setInstanceSecurityGroupId(String instanceSecurityGroupId) {
            this.instanceSecurityGroupId = instanceSecurityGroupId;
            return this;
        }
        public String getInstanceSecurityGroupId() {
            return this.instanceSecurityGroupId;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setInstanceUsername(String instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }
        public String getInstanceUsername() {
            return this.instanceUsername;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setInstanceVSwitchIds(String instanceVSwitchIds) {
            this.instanceVSwitchIds = instanceVSwitchIds;
            return this;
        }
        public String getInstanceVSwitchIds() {
            return this.instanceVSwitchIds;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setInstanceVpcId(String instanceVpcId) {
            this.instanceVpcId = instanceVpcId;
            return this;
        }
        public String getInstanceVpcId() {
            return this.instanceVpcId;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setOffset(String offset) {
            this.offset = offset;
            return this;
        }
        public String getOffset() {
            return this.offset;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setTimestamp(Float timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Float getTimestamp() {
            return this.timestamp;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters extends TeaModel {
        /**
         * <p>The consumer offset. The value begin indicates the earliest offset, and the value end indicates the latest offset. You can also specify a time in seconds to start consumption.</p>
         */
        @NameInMap("ConsumePosition")
        public String consumePosition;

        /**
         * <p>The Log Service Logstore.</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The Log Service project.</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the Resource Access Management (RAM) console. For information about the permission policy of this role, see Create a custom event source of the Log Service type.</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters self = new ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters();
            return TeaModel.build(map, self);
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters setConsumePosition(String consumePosition) {
            this.consumePosition = consumePosition;
            return this;
        }
        public String getConsumePosition() {
            return this.consumePosition;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceScheduledEventParameters extends TeaModel {
        @NameInMap("Schedule")
        public String schedule;

        @NameInMap("TimeZone")
        public String timeZone;

        public static ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceScheduledEventParameters build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceScheduledEventParameters self = new ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceScheduledEventParameters();
            return TeaModel.build(map, self);
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceScheduledEventParameters setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }
        public String getSchedule() {
            return this.schedule;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceScheduledEventParameters setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class ListUserDefinedEventSourcesResponseBodyDataEventSourceList extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the queried event source.</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The timestamp that indicates when the event source was created.</p>
         */
        @NameInMap("Ctime")
        public Float ctime;

        /**
         * <p>The name of the event bus.</p>
         */
        @NameInMap("EventBusName")
        public String eventBusName;

        /**
         * <p>The type of the event resource.</p>
         */
        @NameInMap("ExternalSourceType")
        public String externalSourceType;

        /**
         * <p>The name of the queried event source.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameters that are returned if the event source is HTTP events.</p>
         */
        @NameInMap("SourceHttpEventParameters")
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters sourceHttpEventParameters;

        @NameInMap("SourceKafkaParameters")
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceKafkaParameters sourceKafkaParameters;

        /**
         * <p>The parameters that are returned if the event source is Message Service (MNS).</p>
         */
        @NameInMap("SourceMNSParameters")
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters sourceMNSParameters;

        /**
         * <p>The parameters that are returned if the event source is Message Queue for RabbitMQ.</p>
         */
        @NameInMap("SourceRabbitMQParameters")
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters sourceRabbitMQParameters;

        /**
         * <p>The parameters that are returned if the event source is Message Queue for Apache RocketMQ.</p>
         */
        @NameInMap("SourceRocketMQParameters")
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters sourceRocketMQParameters;

        /**
         * <p>The parameters that are configured if the event source is Log Service.</p>
         */
        @NameInMap("SourceSLSParameters")
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters sourceSLSParameters;

        @NameInMap("SourceScheduledEventParameters")
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceScheduledEventParameters sourceScheduledEventParameters;

        /**
         * <p>The status of the queried event source. Valid value: Activated.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the queried event source. Valid value: UserDefined: custom event source.</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListUserDefinedEventSourcesResponseBodyDataEventSourceList build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefinedEventSourcesResponseBodyDataEventSourceList self = new ListUserDefinedEventSourcesResponseBodyDataEventSourceList();
            return TeaModel.build(map, self);
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setCtime(Float ctime) {
            this.ctime = ctime;
            return this;
        }
        public Float getCtime() {
            return this.ctime;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setExternalSourceType(String externalSourceType) {
            this.externalSourceType = externalSourceType;
            return this;
        }
        public String getExternalSourceType() {
            return this.externalSourceType;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setSourceHttpEventParameters(ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters sourceHttpEventParameters) {
            this.sourceHttpEventParameters = sourceHttpEventParameters;
            return this;
        }
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceHttpEventParameters getSourceHttpEventParameters() {
            return this.sourceHttpEventParameters;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setSourceKafkaParameters(ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceKafkaParameters sourceKafkaParameters) {
            this.sourceKafkaParameters = sourceKafkaParameters;
            return this;
        }
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceKafkaParameters getSourceKafkaParameters() {
            return this.sourceKafkaParameters;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setSourceMNSParameters(ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters sourceMNSParameters) {
            this.sourceMNSParameters = sourceMNSParameters;
            return this;
        }
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceMNSParameters getSourceMNSParameters() {
            return this.sourceMNSParameters;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setSourceRabbitMQParameters(ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters sourceRabbitMQParameters) {
            this.sourceRabbitMQParameters = sourceRabbitMQParameters;
            return this;
        }
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRabbitMQParameters getSourceRabbitMQParameters() {
            return this.sourceRabbitMQParameters;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setSourceRocketMQParameters(ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters sourceRocketMQParameters) {
            this.sourceRocketMQParameters = sourceRocketMQParameters;
            return this;
        }
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceRocketMQParameters getSourceRocketMQParameters() {
            return this.sourceRocketMQParameters;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setSourceSLSParameters(ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters sourceSLSParameters) {
            this.sourceSLSParameters = sourceSLSParameters;
            return this;
        }
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceSLSParameters getSourceSLSParameters() {
            return this.sourceSLSParameters;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setSourceScheduledEventParameters(ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceScheduledEventParameters sourceScheduledEventParameters) {
            this.sourceScheduledEventParameters = sourceScheduledEventParameters;
            return this;
        }
        public ListUserDefinedEventSourcesResponseBodyDataEventSourceListSourceScheduledEventParameters getSourceScheduledEventParameters() {
            return this.sourceScheduledEventParameters;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserDefinedEventSourcesResponseBodyDataEventSourceList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListUserDefinedEventSourcesResponseBodyData extends TeaModel {
        /**
         * <p>The security domain names. This parameter is required only if SecurityConfig is set to referer. You can enter domain names.</p>
         */
        @NameInMap("EventSourceList")
        public java.util.List<ListUserDefinedEventSourcesResponseBodyDataEventSourceList> eventSourceList;

        public static ListUserDefinedEventSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserDefinedEventSourcesResponseBodyData self = new ListUserDefinedEventSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserDefinedEventSourcesResponseBodyData setEventSourceList(java.util.List<ListUserDefinedEventSourcesResponseBodyDataEventSourceList> eventSourceList) {
            this.eventSourceList = eventSourceList;
            return this;
        }
        public java.util.List<ListUserDefinedEventSourcesResponseBodyDataEventSourceList> getEventSourceList() {
            return this.eventSourceList;
        }

    }

}
