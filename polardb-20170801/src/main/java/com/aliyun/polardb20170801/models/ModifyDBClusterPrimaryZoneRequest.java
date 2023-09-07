// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterPrimaryZoneRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>> You can call the [DescribeDBClusters](~~173433~~) operation to query information about all clusters that are deployed in a specified region, such as the cluster ID.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies an immediate or scheduled task to switch the primary zone. Valid values:</p>
     * <br>
     * <p>*   false: scheduled task</p>
     * <p>*   true: immediate task</p>
     */
    @NameInMap("FromTimeService")
    public Boolean fromTimeService;

    @NameInMap("IsSwitchOverForDisaster")
    public String isSwitchOverForDisaster;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The latest start time to run the task. Specify the time in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   The value of this parameter must be at least 30 minutes later than the value of the PlannedStartTime parameter.</p>
     * <br>
     * <p>*   By default, if you specify the `PlannedStartTime` parameter but do not specify the PlannedEndTime parameter, the latest start time of the task is set to a value that is calculated by using the following formula: `Value of the PlannedEndTime parameter + 30 minutes`. For example, if you set the `PlannedStartTime` parameter to `2021-01-14T09:00:00Z` and you do not specify the PlannedEndTime parameter, the latest start time of the task is set to `2021-01-14T09:30:00Z`.</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The earliest time to switch the primary zone within the scheduled time period. Specify the parameter in the `YYYY-MM-DDThh:mm:ssZ` format. The time must be in UTC.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   The earliest start time of the task can be a point in time within the next 24 hours. For example, if the current time is `2021-01-14T09:00:00Z`, you can specify a point in the time range from `2021-01-14T09:00:00Z` to `2021-01-15T09:00:00Z`.</p>
     * <br>
     * <p>*   If this parameter is empty, the primary zone is immediately switched.</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of in the destination primary zone.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is required for a PolarDB for Oracle or PolarDB for PostgreSQL cluster.</p>
     * <br>
     * <p>*   For a PolarDB for MySQL cluster:</p>
     * <br>
     * <p>    *   This parameter is optional if no vSwitches have been created in the destination zone. The default vSwitch is used.</p>
     * <p>    *   This parameter is required if a vSwitch has been created in the destination zone.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the destination primary zone.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](~~98041~~) operation to query available zones.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static ModifyDBClusterPrimaryZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterPrimaryZoneRequest self = new ModifyDBClusterPrimaryZoneRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterPrimaryZoneRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterPrimaryZoneRequest setFromTimeService(Boolean fromTimeService) {
        this.fromTimeService = fromTimeService;
        return this;
    }
    public Boolean getFromTimeService() {
        return this.fromTimeService;
    }

    public ModifyDBClusterPrimaryZoneRequest setIsSwitchOverForDisaster(String isSwitchOverForDisaster) {
        this.isSwitchOverForDisaster = isSwitchOverForDisaster;
        return this;
    }
    public String getIsSwitchOverForDisaster() {
        return this.isSwitchOverForDisaster;
    }

    public ModifyDBClusterPrimaryZoneRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterPrimaryZoneRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterPrimaryZoneRequest setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
        return this;
    }
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    public ModifyDBClusterPrimaryZoneRequest setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }
    public String getPlannedStartTime() {
        return this.plannedStartTime;
    }

    public ModifyDBClusterPrimaryZoneRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterPrimaryZoneRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBClusterPrimaryZoneRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public ModifyDBClusterPrimaryZoneRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ModifyDBClusterPrimaryZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
