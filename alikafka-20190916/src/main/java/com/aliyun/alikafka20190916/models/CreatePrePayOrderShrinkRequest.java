// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePrePayOrderShrinkRequest extends TeaModel {
    /**
     * <p>The configurations of Confluent.</p>
     * <blockquote>
     * <p> When you create an ApsaraMQ for Confluent instance, you must configure this parameter.</p>
     * </blockquote>
     */
    @NameInMap("ConfluentConfig")
    public String confluentConfigShrink;

    /**
     * <p>The type of the network in which the instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>4</strong>: Internet and virtual private cloud (VPC)</li>
     * <li><strong>5</strong>: VPC</li>
     * </ul>
     * <blockquote>
     * <p> If you create an ApsaraMQ for Confluent instance, set the value to 5. After the instance is created, you can specify whether to enable each component.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DeployType")
    public Integer deployType;

    /**
     * <p>The disk size. Unit: GB</p>
     * <p>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * <blockquote>
     * <p> If you create an ApsaraMQ for Confluent instance, you do not need to configure this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("DiskSize")
    public Integer diskSize;

    /**
     * <p>The disk type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: ultra disk</li>
     * <li><strong>1</strong>: standard SSD</li>
     * </ul>
     * <blockquote>
     * <p> If you create an ApsaraMQ for Confluent instance, you do not need to configure this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The subscription duration. Unit: months. Default value: 1. Valid values:</p>
     * <ul>
     * <li><strong>1 to 12</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The maximum Internet traffic in the instance.</p>
     * <ul>
     * <li>If you set <strong>DeployType</strong> to <strong>4</strong>, you must configure this parameter.</li>
     * <li>For information about the valid values, see <a href="https://help.aliyun.com/document_detail/72142.html">Pay-as-you-go</a>.</li>
     * </ul>
     * <blockquote>
     * <p> If you create an ApsaraMQ for Confluent instance, you do not need to configure this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>The maximum traffic in the instance. We recommend that you do not configure this parameter.</p>
     * <ul>
     * <li>You must set one of <strong>IoMax</strong> and <strong>IoMaxSpec</strong>. If both parameters are configured, the value of <strong>IoMaxSpec</strong> is used. We recommend that you configure only <strong>IoMaxSpec</strong>.</li>
     * <li>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
     * </ul>
     * <blockquote>
     * <p> If you create an ApsaraMQ for Confluent instance, you do not need to configure this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("IoMax")
    public Integer ioMax;

    /**
     * <p>The traffic specification of the instance. We recommend that you configure this parameter.</p>
     * <ul>
     * <li>You must configure one of <strong>IoMax</strong> and <strong>IoMaxSpec</strong>. If both parameters are configured, the value of <strong>IoMaxSpec</strong> is used. We recommend that you configure only <strong>IoMaxSpec</strong>.</li>
     * <li>For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
     * </ul>
     * <blockquote>
     * <p> If you create an ApsaraMQ for Confluent instance, you do not need to configure this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>alikafka.hw.2xlarge</p>
     */
    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: the subscription billing method</li>
     * <li><strong>4</strong>: the subscription billing method for ApsaraMQ for Confluent instances</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PaidType")
    public Integer paidType;

    /**
     * <p>The number of partitions. We recommend that you configure this parameter.</p>
     * <ul>
     * <li>You must configure one of PartitionNum and TopicQuota. We recommend that you configure only PartitionNum.</li>
     * <li>If you configure PartitionNum and TopicQuota at the same time, the system verifies whether the price of the partitions equals the price of the topics based on the previous topic-based selling mode. If the price of the partitions does not equal the price of the topics, an error is returned. If the price of the partitions equals the price of the topics, the instance is purchased based on the partition number.</li>
     * <li>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
     * </ul>
     * <blockquote>
     * <p> If you create an ApsaraMQ for Confluent instance, you do not need to configure this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PartitionNum")
    public Integer partitionNum;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * <p>If this parameter is left empty, the default resource group is used. You can view the resource group ID on the Resource Group page in the Resource Management console.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ac***********7q</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The instance edition. Valid values:</p>
     * <ul>
     * <li><strong>normal</strong>: Standard Edition (High Write)</li>
     * <li><strong>professional</strong>: Professional Edition (High Write)</li>
     * <li><strong>professionalForHighRead</strong>: Professional Edition (High Read)</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * <blockquote>
     * <p> If you create an ApsaraMQ for Confluent instance, you do not need to configure this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreatePrePayOrderShrinkRequestTag> tag;

    /**
     * <p>The number of topics. We recommend that you do not configure this parameter.</p>
     * <ul>
     * <li>You must configure one of PartitionNum and TopicQuota. We recommend that you configure only PartitionNum.</li>
     * <li>If you configure PartitionNum and TopicQuota at the same time, the system verifies whether the price of the partitions equals the price of the topics based on the previous topic-based selling mode. If the price of the partitions does not equal the price of the topics, an error is returned. If the price of the partitions equals the price of the topics, the instance is purchased based on the partition number.</li>
     * <li>The default value of TopicQuota varies based on the value of IoMaxSpec. If the number of topics that you use exceeds the default value, you are charged additional fees.</li>
     * <li>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
     * </ul>
     * <blockquote>
     * <p> If you create an ApsaraMQ for Confluent instance, you do not need to configure this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TopicQuota")
    public Integer topicQuota;

    public static CreatePrePayOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrePayOrderShrinkRequest self = new CreatePrePayOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrePayOrderShrinkRequest setConfluentConfigShrink(String confluentConfigShrink) {
        this.confluentConfigShrink = confluentConfigShrink;
        return this;
    }
    public String getConfluentConfigShrink() {
        return this.confluentConfigShrink;
    }

    public CreatePrePayOrderShrinkRequest setDeployType(Integer deployType) {
        this.deployType = deployType;
        return this;
    }
    public Integer getDeployType() {
        return this.deployType;
    }

    public CreatePrePayOrderShrinkRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public CreatePrePayOrderShrinkRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreatePrePayOrderShrinkRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreatePrePayOrderShrinkRequest setEipMax(Integer eipMax) {
        this.eipMax = eipMax;
        return this;
    }
    public Integer getEipMax() {
        return this.eipMax;
    }

    public CreatePrePayOrderShrinkRequest setIoMax(Integer ioMax) {
        this.ioMax = ioMax;
        return this;
    }
    public Integer getIoMax() {
        return this.ioMax;
    }

    public CreatePrePayOrderShrinkRequest setIoMaxSpec(String ioMaxSpec) {
        this.ioMaxSpec = ioMaxSpec;
        return this;
    }
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

    public CreatePrePayOrderShrinkRequest setPaidType(Integer paidType) {
        this.paidType = paidType;
        return this;
    }
    public Integer getPaidType() {
        return this.paidType;
    }

    public CreatePrePayOrderShrinkRequest setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    public CreatePrePayOrderShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePrePayOrderShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePrePayOrderShrinkRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public CreatePrePayOrderShrinkRequest setTag(java.util.List<CreatePrePayOrderShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreatePrePayOrderShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreatePrePayOrderShrinkRequest setTopicQuota(Integer topicQuota) {
        this.topicQuota = topicQuota;
        return this;
    }
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

    public static class CreatePrePayOrderShrinkRequestTag extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         * <ul>
         * <li>Valid values of N: 1 to 20.</li>
         * <li>If this parameter is left empty, the keys of all tags are matched.</li>
         * <li>The tag key can be up to 128 characters in length and cannot start with acs: or aliyun or contain <a href="http://https://%E3%80%82">http:// or https://.</a></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         * <ul>
         * <li>Valid values of N: 1 to 20.</li>
         * <li>This parameter can be left empty.</li>
         * <li>The tag value can be 1 to 128 characters in length and cannot start with acs: or aliyun or contain <a href="http://https://%E3%80%82">http:// or https://.</a></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreatePrePayOrderShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreatePrePayOrderShrinkRequestTag self = new CreatePrePayOrderShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreatePrePayOrderShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePrePayOrderShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
