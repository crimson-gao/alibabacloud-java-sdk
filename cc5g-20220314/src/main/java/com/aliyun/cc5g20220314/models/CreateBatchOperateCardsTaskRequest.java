// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class CreateBatchOperateCardsTaskRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EffectType")
    public String effectType;

    @NameInMap("Iccids")
    public java.util.List<String> iccids;

    @NameInMap("IccidsOssFilePath")
    public String iccidsOssFilePath;

    @NameInMap("Name")
    public String name;

    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Threshold")
    public Long threshold;

    @NameInMap("WirelessCloudConnectorIds")
    public java.util.List<String> wirelessCloudConnectorIds;

    public static CreateBatchOperateCardsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchOperateCardsTaskRequest self = new CreateBatchOperateCardsTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchOperateCardsTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBatchOperateCardsTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBatchOperateCardsTaskRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateBatchOperateCardsTaskRequest setEffectType(String effectType) {
        this.effectType = effectType;
        return this;
    }
    public String getEffectType() {
        return this.effectType;
    }

    public CreateBatchOperateCardsTaskRequest setIccids(java.util.List<String> iccids) {
        this.iccids = iccids;
        return this;
    }
    public java.util.List<String> getIccids() {
        return this.iccids;
    }

    public CreateBatchOperateCardsTaskRequest setIccidsOssFilePath(String iccidsOssFilePath) {
        this.iccidsOssFilePath = iccidsOssFilePath;
        return this;
    }
    public String getIccidsOssFilePath() {
        return this.iccidsOssFilePath;
    }

    public CreateBatchOperateCardsTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBatchOperateCardsTaskRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public CreateBatchOperateCardsTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateBatchOperateCardsTaskRequest setThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }
    public Long getThreshold() {
        return this.threshold;
    }

    public CreateBatchOperateCardsTaskRequest setWirelessCloudConnectorIds(java.util.List<String> wirelessCloudConnectorIds) {
        this.wirelessCloudConnectorIds = wirelessCloudConnectorIds;
        return this;
    }
    public java.util.List<String> getWirelessCloudConnectorIds() {
        return this.wirelessCloudConnectorIds;
    }

}
