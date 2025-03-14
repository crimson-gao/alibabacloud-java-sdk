// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTrendTopicInputTpsRequest extends TeaModel {
    /**
     * <p>The timestamp that indicates the beginning of the time range to query. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1570852800000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The timestamp that indicates the end of the time range to query. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1570868400000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the instance to which the topic you want to query belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>MQ_INST_111111111111_DOxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The sampling period. Unit: minutes. Valid values: 1, 5, and 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The name of the topic that you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>The type of information that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: the number of messages that are published to the topic during each sampling period.</li>
     * <li><strong>1</strong>: the TPS for message publishing in the topic during each sampling period.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static OnsTrendTopicInputTpsRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTrendTopicInputTpsRequest self = new OnsTrendTopicInputTpsRequest();
        return TeaModel.build(map, self);
    }

    public OnsTrendTopicInputTpsRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public OnsTrendTopicInputTpsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public OnsTrendTopicInputTpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsTrendTopicInputTpsRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public OnsTrendTopicInputTpsRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsTrendTopicInputTpsRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
