// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class Sample extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2021-12-07T12:28:52.000Z</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2021-12-07T12:28:52.000Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("Meta")
    public SampleMeta meta;

    /**
     * <strong>example:</strong>
     * <p>1638880131873</p>
     */
    @NameInMap("SampleId")
    public String sampleId;

    /**
     * <strong>example:</strong>
     * <p>样本状态 Unready 未完成配置  Ready   配置完成  Generating 样本生成中  Success  样本生成成功  Failed 样本生成失败  Formatting 格式化中  Formatted 格式化完成  FormatFailed 格式化失败  Applied 已应用到模型中</p>
     */
    @NameInMap("Status")
    public String status;

    public static Sample build(java.util.Map<String, ?> map) throws Exception {
        Sample self = new Sample();
        return TeaModel.build(map, self);
    }

    public Sample setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public Sample setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public Sample setMeta(SampleMeta meta) {
        this.meta = meta;
        return this;
    }
    public SampleMeta getMeta() {
        return this.meta;
    }

    public Sample setSampleId(String sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public String getSampleId() {
        return this.sampleId;
    }

    public Sample setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class SampleMetaConfigFeatureConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>物品特征，支持多值，逗号分隔。</p>
         */
        @NameInMap("ItemFeatures")
        public String itemFeatures;

        /**
         * <strong>example:</strong>
         * <p>用户特征，支持多值，逗号分隔。</p>
         */
        @NameInMap("UserFeatures")
        public String userFeatures;

        public static SampleMetaConfigFeatureConfig build(java.util.Map<String, ?> map) throws Exception {
            SampleMetaConfigFeatureConfig self = new SampleMetaConfigFeatureConfig();
            return TeaModel.build(map, self);
        }

        public SampleMetaConfigFeatureConfig setItemFeatures(String itemFeatures) {
            this.itemFeatures = itemFeatures;
            return this;
        }
        public String getItemFeatures() {
            return this.itemFeatures;
        }

        public SampleMetaConfigFeatureConfig setUserFeatures(String userFeatures) {
            this.userFeatures = userFeatures;
            return this;
        }
        public String getUserFeatures() {
            return this.userFeatures;
        }

    }

    public static class SampleMetaConfigLabelLogic extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("BhvTimeWindow")
        public Long bhvTimeWindow;

        /**
         * <strong>example:</strong>
         * <p>click,expose</p>
         */
        @NameInMap("NegativeBhvTypes")
        public String negativeBhvTypes;

        /**
         * <strong>example:</strong>
         * <p>like</p>
         */
        @NameInMap("PositiveBhvTypes")
        public String positiveBhvTypes;

        public static SampleMetaConfigLabelLogic build(java.util.Map<String, ?> map) throws Exception {
            SampleMetaConfigLabelLogic self = new SampleMetaConfigLabelLogic();
            return TeaModel.build(map, self);
        }

        public SampleMetaConfigLabelLogic setBhvTimeWindow(Long bhvTimeWindow) {
            this.bhvTimeWindow = bhvTimeWindow;
            return this;
        }
        public Long getBhvTimeWindow() {
            return this.bhvTimeWindow;
        }

        public SampleMetaConfigLabelLogic setNegativeBhvTypes(String negativeBhvTypes) {
            this.negativeBhvTypes = negativeBhvTypes;
            return this;
        }
        public String getNegativeBhvTypes() {
            return this.negativeBhvTypes;
        }

        public SampleMetaConfigLabelLogic setPositiveBhvTypes(String positiveBhvTypes) {
            this.positiveBhvTypes = positiveBhvTypes;
            return this;
        }
        public String getPositiveBhvTypes() {
            return this.positiveBhvTypes;
        }

    }

    public static class SampleMetaConfigWeightLogicList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>click</p>
         */
        @NameInMap("Bhv")
        public String bhv;

        /**
         * <strong>example:</strong>
         * <p>1.01</p>
         */
        @NameInMap("Weight")
        public String weight;

        public static SampleMetaConfigWeightLogicList build(java.util.Map<String, ?> map) throws Exception {
            SampleMetaConfigWeightLogicList self = new SampleMetaConfigWeightLogicList();
            return TeaModel.build(map, self);
        }

        public SampleMetaConfigWeightLogicList setBhv(String bhv) {
            this.bhv = bhv;
            return this;
        }
        public String getBhv() {
            return this.bhv;
        }

        public SampleMetaConfigWeightLogicList setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class SampleMetaConfig extends TeaModel {
        @NameInMap("BhvTableSourceIds")
        public java.util.List<String> bhvTableSourceIds;

        @NameInMap("FeatureConfig")
        public SampleMetaConfigFeatureConfig featureConfig;

        @NameInMap("LabelLogic")
        public SampleMetaConfigLabelLogic labelLogic;

        @NameInMap("WeightLogicList")
        public java.util.List<SampleMetaConfigWeightLogicList> weightLogicList;

        public static SampleMetaConfig build(java.util.Map<String, ?> map) throws Exception {
            SampleMetaConfig self = new SampleMetaConfig();
            return TeaModel.build(map, self);
        }

        public SampleMetaConfig setBhvTableSourceIds(java.util.List<String> bhvTableSourceIds) {
            this.bhvTableSourceIds = bhvTableSourceIds;
            return this;
        }
        public java.util.List<String> getBhvTableSourceIds() {
            return this.bhvTableSourceIds;
        }

        public SampleMetaConfig setFeatureConfig(SampleMetaConfigFeatureConfig featureConfig) {
            this.featureConfig = featureConfig;
            return this;
        }
        public SampleMetaConfigFeatureConfig getFeatureConfig() {
            return this.featureConfig;
        }

        public SampleMetaConfig setLabelLogic(SampleMetaConfigLabelLogic labelLogic) {
            this.labelLogic = labelLogic;
            return this;
        }
        public SampleMetaConfigLabelLogic getLabelLogic() {
            return this.labelLogic;
        }

        public SampleMetaConfig setWeightLogicList(java.util.List<SampleMetaConfigWeightLogicList> weightLogicList) {
            this.weightLogicList = weightLogicList;
            return this;
        }
        public java.util.List<SampleMetaConfigWeightLogicList> getWeightLogicList() {
            return this.weightLogicList;
        }

    }

    public static class SampleMetaExtendParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0 没有任务 1 正常 2 异常</p>
         */
        @NameInMap("LatestTaskStatus")
        public Long latestTaskStatus;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SampleCount")
        public Long sampleCount;

        public static SampleMetaExtendParams build(java.util.Map<String, ?> map) throws Exception {
            SampleMetaExtendParams self = new SampleMetaExtendParams();
            return TeaModel.build(map, self);
        }

        public SampleMetaExtendParams setLatestTaskStatus(Long latestTaskStatus) {
            this.latestTaskStatus = latestTaskStatus;
            return this;
        }
        public Long getLatestTaskStatus() {
            return this.latestTaskStatus;
        }

        public SampleMetaExtendParams setSampleCount(Long sampleCount) {
            this.sampleCount = sampleCount;
            return this;
        }
        public Long getSampleCount() {
            return this.sampleCount;
        }

    }

    public static class SampleMeta extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoUpdate")
        public Boolean autoUpdate;

        /**
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("AutoUpdateFrequency")
        public Long autoUpdateFrequency;

        /**
         * <strong>example:</strong>
         * <p>1638877561147</p>
         */
        @NameInMap("ClonedId")
        public String clonedId;

        @NameInMap("Config")
        public SampleMetaConfig config;

        @NameInMap("ExtendParams")
        public SampleMetaExtendParams extendParams;

        /**
         * <strong>example:</strong>
         * <p>Sample</p>
         */
        @NameInMap("MetaType")
        public String metaType;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>projectName.tableName</p>
         */
        @NameInMap("StoreConfig")
        public String storeConfig;

        /**
         * <strong>example:</strong>
         * <p>Cloned 复制的 System 系统的 Custom 自定义的</p>
         */
        @NameInMap("Type")
        public String type;

        public static SampleMeta build(java.util.Map<String, ?> map) throws Exception {
            SampleMeta self = new SampleMeta();
            return TeaModel.build(map, self);
        }

        public SampleMeta setAutoUpdate(Boolean autoUpdate) {
            this.autoUpdate = autoUpdate;
            return this;
        }
        public Boolean getAutoUpdate() {
            return this.autoUpdate;
        }

        public SampleMeta setAutoUpdateFrequency(Long autoUpdateFrequency) {
            this.autoUpdateFrequency = autoUpdateFrequency;
            return this;
        }
        public Long getAutoUpdateFrequency() {
            return this.autoUpdateFrequency;
        }

        public SampleMeta setClonedId(String clonedId) {
            this.clonedId = clonedId;
            return this;
        }
        public String getClonedId() {
            return this.clonedId;
        }

        public SampleMeta setConfig(SampleMetaConfig config) {
            this.config = config;
            return this;
        }
        public SampleMetaConfig getConfig() {
            return this.config;
        }

        public SampleMeta setExtendParams(SampleMetaExtendParams extendParams) {
            this.extendParams = extendParams;
            return this;
        }
        public SampleMetaExtendParams getExtendParams() {
            return this.extendParams;
        }

        public SampleMeta setMetaType(String metaType) {
            this.metaType = metaType;
            return this;
        }
        public String getMetaType() {
            return this.metaType;
        }

        public SampleMeta setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SampleMeta setStoreConfig(String storeConfig) {
            this.storeConfig = storeConfig;
            return this;
        }
        public String getStoreConfig() {
            return this.storeConfig;
        }

        public SampleMeta setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
