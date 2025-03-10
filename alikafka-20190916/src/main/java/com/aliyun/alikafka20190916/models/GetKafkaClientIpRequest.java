// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetKafkaClientIpRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1716343502000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the consumer group.</p>
     * <blockquote>
     * <p> This parameter is required only if you set Type to byGroup.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>group_name</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_post-cn-v0h1fgs2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region where the instance is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1716343501000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The topic name.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This parameter is required only if you set Type to byTopic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>topic_name</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>The query method that you want to use to query the client IP addresses. Valid values:</p>
     * <ul>
     * <li>byInstance: queries the IP addresses of the clients that are connected to the instance within a specific period of time.</li>
     * <li>byTopic: queries the IP addresses of the clients that are connected to a specific topic on the instance within a specific period of time.</li>
     * <li>byGroup: queries the IP addresses of the clients that are connected to a specific group on the instance within a specific period of time.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>byInstance</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetKafkaClientIpRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKafkaClientIpRequest self = new GetKafkaClientIpRequest();
        return TeaModel.build(map, self);
    }

    public GetKafkaClientIpRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetKafkaClientIpRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public GetKafkaClientIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetKafkaClientIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetKafkaClientIpRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetKafkaClientIpRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public GetKafkaClientIpRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
