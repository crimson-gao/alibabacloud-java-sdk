// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RestartInstanceRequest extends TeaModel {
    /**
     * <p>The time when you want to restart the instance. Default value: Immediately. Valid values:</p>
     * <br>
     * <p>*   **Immediately**: immediately restarts the instance.</p>
     * <p>*   **MaintainTime**: restarts the instance during the maintenance window.</p>
     * <br>
     * <p>Enumeration values:</p>
     * <br>
     * <p>*   0</p>
     * <p>*   1</p>
     * <p>*   Immediately</p>
     * <p>*   MaintainTime</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The operation that you want to perform. Set the value to **RestartInstance**.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>Specifies whether to update the instance to the latest minor version when the instance is restarted. Valid values:</p>
     * <br>
     * <p>*   **true**: updates the minor version.</p>
     * <p>*   **false**: does not update the minor version.</p>
     * <br>
     * <p>> The default value is **true**.</p>
     */
    @NameInMap("UpgradeMinorVersion")
    public Boolean upgradeMinorVersion;

    public static RestartInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartInstanceRequest self = new RestartInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RestartInstanceRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public RestartInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RestartInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RestartInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RestartInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RestartInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RestartInstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RestartInstanceRequest setUpgradeMinorVersion(Boolean upgradeMinorVersion) {
        this.upgradeMinorVersion = upgradeMinorVersion;
        return this;
    }
    public Boolean getUpgradeMinorVersion() {
        return this.upgradeMinorVersion;
    }

}
