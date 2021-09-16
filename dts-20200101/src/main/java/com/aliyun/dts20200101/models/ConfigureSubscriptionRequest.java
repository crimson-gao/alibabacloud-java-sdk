// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSubscriptionRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DtsJobName")
    public String dtsJobName;

    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("SourceEndpointEngineName")
    public String sourceEndpointEngineName;

    @NameInMap("SourceEndpointInstanceType")
    public String sourceEndpointInstanceType;

    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    @NameInMap("SourceEndpointPort")
    public String sourceEndpointPort;

    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    @NameInMap("SourceEndpointOwnerID")
    public String sourceEndpointOwnerID;

    @NameInMap("SourceEndpointRole")
    public String sourceEndpointRole;

    @NameInMap("DbList")
    public String dbList;

    @NameInMap("Reserve")
    public String reserve;

    @NameInMap("Checkpoint")
    public String checkpoint;

    @NameInMap("SubscriptionInstanceNetworkType")
    public String subscriptionInstanceNetworkType;

    @NameInMap("SubscriptionInstanceVPCId")
    public String subscriptionInstanceVPCId;

    @NameInMap("SubscriptionInstanceVSwitchId")
    public String subscriptionInstanceVSwitchId;

    @NameInMap("SubscriptionDataTypeDDL")
    public Boolean subscriptionDataTypeDDL;

    @NameInMap("SubscriptionDataTypeDML")
    public Boolean subscriptionDataTypeDML;

    @NameInMap("DelayPhone")
    public String delayPhone;

    @NameInMap("DelayRuleTime")
    public Long delayRuleTime;

    @NameInMap("DelayNotice")
    public Boolean delayNotice;

    @NameInMap("ErrorPhone")
    public String errorPhone;

    @NameInMap("ErrorNotice")
    public Boolean errorNotice;

    public static ConfigureSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSubscriptionRequest self = new ConfigureSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureSubscriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigureSubscriptionRequest setDtsJobName(String dtsJobName) {
        this.dtsJobName = dtsJobName;
        return this;
    }
    public String getDtsJobName() {
        return this.dtsJobName;
    }

    public ConfigureSubscriptionRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ConfigureSubscriptionRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ConfigureSubscriptionRequest setSourceEndpointEngineName(String sourceEndpointEngineName) {
        this.sourceEndpointEngineName = sourceEndpointEngineName;
        return this;
    }
    public String getSourceEndpointEngineName() {
        return this.sourceEndpointEngineName;
    }

    public ConfigureSubscriptionRequest setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
        this.sourceEndpointInstanceType = sourceEndpointInstanceType;
        return this;
    }
    public String getSourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }

    public ConfigureSubscriptionRequest setSourceEndpointRegion(String sourceEndpointRegion) {
        this.sourceEndpointRegion = sourceEndpointRegion;
        return this;
    }
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    public ConfigureSubscriptionRequest setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
        this.sourceEndpointInstanceID = sourceEndpointInstanceID;
        return this;
    }
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    public ConfigureSubscriptionRequest setSourceEndpointIP(String sourceEndpointIP) {
        this.sourceEndpointIP = sourceEndpointIP;
        return this;
    }
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    public ConfigureSubscriptionRequest setSourceEndpointPort(String sourceEndpointPort) {
        this.sourceEndpointPort = sourceEndpointPort;
        return this;
    }
    public String getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    public ConfigureSubscriptionRequest setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
        this.sourceEndpointOracleSID = sourceEndpointOracleSID;
        return this;
    }
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    public ConfigureSubscriptionRequest setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
        this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
        return this;
    }
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    public ConfigureSubscriptionRequest setSourceEndpointUserName(String sourceEndpointUserName) {
        this.sourceEndpointUserName = sourceEndpointUserName;
        return this;
    }
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

    public ConfigureSubscriptionRequest setSourceEndpointPassword(String sourceEndpointPassword) {
        this.sourceEndpointPassword = sourceEndpointPassword;
        return this;
    }
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    public ConfigureSubscriptionRequest setSourceEndpointOwnerID(String sourceEndpointOwnerID) {
        this.sourceEndpointOwnerID = sourceEndpointOwnerID;
        return this;
    }
    public String getSourceEndpointOwnerID() {
        return this.sourceEndpointOwnerID;
    }

    public ConfigureSubscriptionRequest setSourceEndpointRole(String sourceEndpointRole) {
        this.sourceEndpointRole = sourceEndpointRole;
        return this;
    }
    public String getSourceEndpointRole() {
        return this.sourceEndpointRole;
    }

    public ConfigureSubscriptionRequest setDbList(String dbList) {
        this.dbList = dbList;
        return this;
    }
    public String getDbList() {
        return this.dbList;
    }

    public ConfigureSubscriptionRequest setReserve(String reserve) {
        this.reserve = reserve;
        return this;
    }
    public String getReserve() {
        return this.reserve;
    }

    public ConfigureSubscriptionRequest setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public String getCheckpoint() {
        return this.checkpoint;
    }

    public ConfigureSubscriptionRequest setSubscriptionInstanceNetworkType(String subscriptionInstanceNetworkType) {
        this.subscriptionInstanceNetworkType = subscriptionInstanceNetworkType;
        return this;
    }
    public String getSubscriptionInstanceNetworkType() {
        return this.subscriptionInstanceNetworkType;
    }

    public ConfigureSubscriptionRequest setSubscriptionInstanceVPCId(String subscriptionInstanceVPCId) {
        this.subscriptionInstanceVPCId = subscriptionInstanceVPCId;
        return this;
    }
    public String getSubscriptionInstanceVPCId() {
        return this.subscriptionInstanceVPCId;
    }

    public ConfigureSubscriptionRequest setSubscriptionInstanceVSwitchId(String subscriptionInstanceVSwitchId) {
        this.subscriptionInstanceVSwitchId = subscriptionInstanceVSwitchId;
        return this;
    }
    public String getSubscriptionInstanceVSwitchId() {
        return this.subscriptionInstanceVSwitchId;
    }

    public ConfigureSubscriptionRequest setSubscriptionDataTypeDDL(Boolean subscriptionDataTypeDDL) {
        this.subscriptionDataTypeDDL = subscriptionDataTypeDDL;
        return this;
    }
    public Boolean getSubscriptionDataTypeDDL() {
        return this.subscriptionDataTypeDDL;
    }

    public ConfigureSubscriptionRequest setSubscriptionDataTypeDML(Boolean subscriptionDataTypeDML) {
        this.subscriptionDataTypeDML = subscriptionDataTypeDML;
        return this;
    }
    public Boolean getSubscriptionDataTypeDML() {
        return this.subscriptionDataTypeDML;
    }

    public ConfigureSubscriptionRequest setDelayPhone(String delayPhone) {
        this.delayPhone = delayPhone;
        return this;
    }
    public String getDelayPhone() {
        return this.delayPhone;
    }

    public ConfigureSubscriptionRequest setDelayRuleTime(Long delayRuleTime) {
        this.delayRuleTime = delayRuleTime;
        return this;
    }
    public Long getDelayRuleTime() {
        return this.delayRuleTime;
    }

    public ConfigureSubscriptionRequest setDelayNotice(Boolean delayNotice) {
        this.delayNotice = delayNotice;
        return this;
    }
    public Boolean getDelayNotice() {
        return this.delayNotice;
    }

    public ConfigureSubscriptionRequest setErrorPhone(String errorPhone) {
        this.errorPhone = errorPhone;
        return this;
    }
    public String getErrorPhone() {
        return this.errorPhone;
    }

    public ConfigureSubscriptionRequest setErrorNotice(Boolean errorNotice) {
        this.errorNotice = errorNotice;
        return this;
    }
    public Boolean getErrorNotice() {
        return this.errorNotice;
    }

}
