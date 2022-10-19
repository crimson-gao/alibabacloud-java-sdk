// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceResponseBody extends TeaModel {
    @NameInMap("Headers")
    public ListInstanceResponseBodyHeaders headers;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListInstanceResponseBodyResult> result;

    public static ListInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResponseBody self = new ListInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceResponseBody setHeaders(ListInstanceResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListInstanceResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceResponseBody setResult(java.util.List<ListInstanceResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListInstanceResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListInstanceResponseBodyHeaders extends TeaModel {
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListInstanceResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyHeaders self = new ListInstanceResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListInstanceResponseBodyResultClientNodeConfiguration extends TeaModel {
        @NameInMap("amount")
        public Integer amount;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskType")
        public String diskType;

        @NameInMap("spec")
        public String spec;

        public static ListInstanceResponseBodyResultClientNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyResultClientNodeConfiguration self = new ListInstanceResponseBodyResultClientNodeConfiguration();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyResultClientNodeConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ListInstanceResponseBodyResultClientNodeConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public ListInstanceResponseBodyResultClientNodeConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListInstanceResponseBodyResultClientNodeConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class ListInstanceResponseBodyResultElasticDataNodeConfiguration extends TeaModel {
        @NameInMap("amount")
        public Integer amount;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        @NameInMap("diskType")
        public String diskType;

        @NameInMap("spec")
        public String spec;

        public static ListInstanceResponseBodyResultElasticDataNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyResultElasticDataNodeConfiguration self = new ListInstanceResponseBodyResultElasticDataNodeConfiguration();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyResultElasticDataNodeConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ListInstanceResponseBodyResultElasticDataNodeConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public ListInstanceResponseBodyResultElasticDataNodeConfiguration setDiskEncryption(Boolean diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        public ListInstanceResponseBodyResultElasticDataNodeConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListInstanceResponseBodyResultElasticDataNodeConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class ListInstanceResponseBodyResultKibanaConfiguration extends TeaModel {
        @NameInMap("amount")
        public Integer amount;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskType")
        public String diskType;

        @NameInMap("spec")
        public String spec;

        public static ListInstanceResponseBodyResultKibanaConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyResultKibanaConfiguration self = new ListInstanceResponseBodyResultKibanaConfiguration();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyResultKibanaConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ListInstanceResponseBodyResultKibanaConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public ListInstanceResponseBodyResultKibanaConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListInstanceResponseBodyResultKibanaConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class ListInstanceResponseBodyResultMasterConfiguration extends TeaModel {
        @NameInMap("amount")
        public Integer amount;

        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskType")
        public String diskType;

        @NameInMap("spec")
        public String spec;

        public static ListInstanceResponseBodyResultMasterConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyResultMasterConfiguration self = new ListInstanceResponseBodyResultMasterConfiguration();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyResultMasterConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ListInstanceResponseBodyResultMasterConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public ListInstanceResponseBodyResultMasterConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListInstanceResponseBodyResultMasterConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class ListInstanceResponseBodyResultNetworkConfig extends TeaModel {
        @NameInMap("type")
        public String type;

        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("vsArea")
        public String vsArea;

        @NameInMap("vswitchId")
        public String vswitchId;

        public static ListInstanceResponseBodyResultNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyResultNetworkConfig self = new ListInstanceResponseBodyResultNetworkConfig();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyResultNetworkConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListInstanceResponseBodyResultNetworkConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListInstanceResponseBodyResultNetworkConfig setVsArea(String vsArea) {
            this.vsArea = vsArea;
            return this;
        }
        public String getVsArea() {
            return this.vsArea;
        }

        public ListInstanceResponseBodyResultNetworkConfig setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class ListInstanceResponseBodyResultNodeSpec extends TeaModel {
        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        @NameInMap("diskType")
        public String diskType;

        @NameInMap("performanceLevel")
        public String performanceLevel;

        @NameInMap("spec")
        public String spec;

        public static ListInstanceResponseBodyResultNodeSpec build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyResultNodeSpec self = new ListInstanceResponseBodyResultNodeSpec();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyResultNodeSpec setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public ListInstanceResponseBodyResultNodeSpec setDiskEncryption(Boolean diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        public ListInstanceResponseBodyResultNodeSpec setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListInstanceResponseBodyResultNodeSpec setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public ListInstanceResponseBodyResultNodeSpec setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class ListInstanceResponseBodyResultTags extends TeaModel {
        @NameInMap("tagKey")
        public String tagKey;

        @NameInMap("tagValue")
        public String tagValue;

        public static ListInstanceResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyResultTags self = new ListInstanceResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyResultTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListInstanceResponseBodyResultTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListInstanceResponseBodyResult extends TeaModel {
        @NameInMap("advancedDedicateMaster")
        public Boolean advancedDedicateMaster;

        @NameInMap("clientNodeConfiguration")
        public ListInstanceResponseBodyResultClientNodeConfiguration clientNodeConfiguration;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("dedicateMaster")
        public Boolean dedicateMaster;

        @NameInMap("description")
        public String description;

        @NameInMap("elasticDataNodeConfiguration")
        public ListInstanceResponseBodyResultElasticDataNodeConfiguration elasticDataNodeConfiguration;

        @NameInMap("esVersion")
        public String esVersion;

        @NameInMap("extendConfigs")
        public java.util.List<java.util.Map<String, ?>> extendConfigs;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("isNewDeployment")
        public String isNewDeployment;

        @NameInMap("kibanaConfiguration")
        public ListInstanceResponseBodyResultKibanaConfiguration kibanaConfiguration;

        @NameInMap("masterConfiguration")
        public ListInstanceResponseBodyResultMasterConfiguration masterConfiguration;

        @NameInMap("networkConfig")
        public ListInstanceResponseBodyResultNetworkConfig networkConfig;

        @NameInMap("nodeAmount")
        public Integer nodeAmount;

        @NameInMap("nodeSpec")
        public ListInstanceResponseBodyResultNodeSpec nodeSpec;

        @NameInMap("paymentType")
        public String paymentType;

        @NameInMap("postpaidServiceStatus")
        public String postpaidServiceStatus;

        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        @NameInMap("serviceVpc")
        public Boolean serviceVpc;

        @NameInMap("status")
        public String status;

        @NameInMap("tags")
        public java.util.List<ListInstanceResponseBodyResultTags> tags;

        @NameInMap("updatedAt")
        public String updatedAt;

        @NameInMap("vpcInstanceId")
        public String vpcInstanceId;

        public static ListInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyResult self = new ListInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyResult setAdvancedDedicateMaster(Boolean advancedDedicateMaster) {
            this.advancedDedicateMaster = advancedDedicateMaster;
            return this;
        }
        public Boolean getAdvancedDedicateMaster() {
            return this.advancedDedicateMaster;
        }

        public ListInstanceResponseBodyResult setClientNodeConfiguration(ListInstanceResponseBodyResultClientNodeConfiguration clientNodeConfiguration) {
            this.clientNodeConfiguration = clientNodeConfiguration;
            return this;
        }
        public ListInstanceResponseBodyResultClientNodeConfiguration getClientNodeConfiguration() {
            return this.clientNodeConfiguration;
        }

        public ListInstanceResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListInstanceResponseBodyResult setDedicateMaster(Boolean dedicateMaster) {
            this.dedicateMaster = dedicateMaster;
            return this;
        }
        public Boolean getDedicateMaster() {
            return this.dedicateMaster;
        }

        public ListInstanceResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstanceResponseBodyResult setElasticDataNodeConfiguration(ListInstanceResponseBodyResultElasticDataNodeConfiguration elasticDataNodeConfiguration) {
            this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
            return this;
        }
        public ListInstanceResponseBodyResultElasticDataNodeConfiguration getElasticDataNodeConfiguration() {
            return this.elasticDataNodeConfiguration;
        }

        public ListInstanceResponseBodyResult setEsVersion(String esVersion) {
            this.esVersion = esVersion;
            return this;
        }
        public String getEsVersion() {
            return this.esVersion;
        }

        public ListInstanceResponseBodyResult setExtendConfigs(java.util.List<java.util.Map<String, ?>> extendConfigs) {
            this.extendConfigs = extendConfigs;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getExtendConfigs() {
            return this.extendConfigs;
        }

        public ListInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceResponseBodyResult setIsNewDeployment(String isNewDeployment) {
            this.isNewDeployment = isNewDeployment;
            return this;
        }
        public String getIsNewDeployment() {
            return this.isNewDeployment;
        }

        public ListInstanceResponseBodyResult setKibanaConfiguration(ListInstanceResponseBodyResultKibanaConfiguration kibanaConfiguration) {
            this.kibanaConfiguration = kibanaConfiguration;
            return this;
        }
        public ListInstanceResponseBodyResultKibanaConfiguration getKibanaConfiguration() {
            return this.kibanaConfiguration;
        }

        public ListInstanceResponseBodyResult setMasterConfiguration(ListInstanceResponseBodyResultMasterConfiguration masterConfiguration) {
            this.masterConfiguration = masterConfiguration;
            return this;
        }
        public ListInstanceResponseBodyResultMasterConfiguration getMasterConfiguration() {
            return this.masterConfiguration;
        }

        public ListInstanceResponseBodyResult setNetworkConfig(ListInstanceResponseBodyResultNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }
        public ListInstanceResponseBodyResultNetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

        public ListInstanceResponseBodyResult setNodeAmount(Integer nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        public ListInstanceResponseBodyResult setNodeSpec(ListInstanceResponseBodyResultNodeSpec nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public ListInstanceResponseBodyResultNodeSpec getNodeSpec() {
            return this.nodeSpec;
        }

        public ListInstanceResponseBodyResult setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListInstanceResponseBodyResult setPostpaidServiceStatus(String postpaidServiceStatus) {
            this.postpaidServiceStatus = postpaidServiceStatus;
            return this;
        }
        public String getPostpaidServiceStatus() {
            return this.postpaidServiceStatus;
        }

        public ListInstanceResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListInstanceResponseBodyResult setServiceVpc(Boolean serviceVpc) {
            this.serviceVpc = serviceVpc;
            return this;
        }
        public Boolean getServiceVpc() {
            return this.serviceVpc;
        }

        public ListInstanceResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstanceResponseBodyResult setTags(java.util.List<ListInstanceResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListInstanceResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public ListInstanceResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListInstanceResponseBodyResult setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

}
