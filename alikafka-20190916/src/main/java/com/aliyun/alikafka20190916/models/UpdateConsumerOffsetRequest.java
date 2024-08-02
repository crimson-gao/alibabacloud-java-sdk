// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateConsumerOffsetRequest extends TeaModel {
    /**
     * <p>The name of the consumer group.</p>
     * <ul>
     * <li>The name can contain letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The name must be <strong>3 to 64</strong> characters in length. If a name contains more than <strong>64</strong> characters, the name is automatically truncated.</li>
     * <li>The name of a consumer group cannot be changed after the consumer group is created.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kafka-test</p>
     */
    @NameInMap("ConsumerId")
    public String consumerId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_post-cn-mp91inkw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>If you set resetType to offset, you can use this parameter to reset the consumer offset of each partition of a specific topic in the consumer group.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Offsets")
    public java.util.List<UpdateConsumerOffsetRequestOffsets> offsets;

    /**
     * <p>The region ID of the instance to which the consumer group belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The method that is used to reset the consumer offsets of the subscribed topics of a consumer group. Valid values:</p>
     * <ul>
     * <li><strong>timestamp</strong> (default)</li>
     * <li><strong>offset</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>timestamp</p>
     */
    @NameInMap("ResetType")
    public String resetType;

    /**
     * <p>The point in time when message consumption starts. The value of this parameter is a UNIX timestamp in milliseconds. The value of this parameter must be <strong>less than 0</strong> or <strong>within the retention period of the consumer offset</strong>. This parameter takes effect only if you set resetType to timestamp.</p>
     * <ul>
     * <li>If you want to reset the consumer offset to the latest offset, set this parameter to -1.</li>
     * <li>If you want to reset the consumer offset to the earliest offset, set this parameter to -2.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Time")
    public String time;

    /**
     * <p>The topic name.</p>
     * <ul>
     * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
     * <li>The name must be <strong>3 to 64</strong> characters in length. If a name contains more than <strong>64</strong> characters, the name is automatically truncated.</li>
     * <li>The name of a topic cannot be changed after the topic is created.</li>
     * </ul>
     * <p><strong>If you want to reset the consumer offsets of all topics to which the consumer subscribes, specify an empty string.</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>topic_name</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static UpdateConsumerOffsetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumerOffsetRequest self = new UpdateConsumerOffsetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConsumerOffsetRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public UpdateConsumerOffsetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateConsumerOffsetRequest setOffsets(java.util.List<UpdateConsumerOffsetRequestOffsets> offsets) {
        this.offsets = offsets;
        return this;
    }
    public java.util.List<UpdateConsumerOffsetRequestOffsets> getOffsets() {
        return this.offsets;
    }

    public UpdateConsumerOffsetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateConsumerOffsetRequest setResetType(String resetType) {
        this.resetType = resetType;
        return this;
    }
    public String getResetType() {
        return this.resetType;
    }

    public UpdateConsumerOffsetRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public UpdateConsumerOffsetRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public static class UpdateConsumerOffsetRequestOffsets extends TeaModel {
        /**
         * <p>The consumer offset of the partition.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Offset")
        public Long offset;

        /**
         * <p>The partition ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Partition")
        public Integer partition;

        public static UpdateConsumerOffsetRequestOffsets build(java.util.Map<String, ?> map) throws Exception {
            UpdateConsumerOffsetRequestOffsets self = new UpdateConsumerOffsetRequestOffsets();
            return TeaModel.build(map, self);
        }

        public UpdateConsumerOffsetRequestOffsets setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public UpdateConsumerOffsetRequestOffsets setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

    }

}
