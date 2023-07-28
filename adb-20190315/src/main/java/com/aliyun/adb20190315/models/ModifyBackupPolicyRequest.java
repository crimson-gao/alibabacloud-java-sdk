// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
    /**
     * <p>The number of days for which to retain full backup files. Valid values: 7 to 730.</p>
     * <br>
     * <p>>  If you leave this parameter empty, the default value 7 is used.</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public String backupRetentionPeriod;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to enable real-time log backup. Valid values:</p>
     * <br>
     * <p>*   **Enable**</p>
     * <br>
     * <p>*   **Disable**</p>
     * <br>
     * <p>> If you leave this parameter empty, the default value Enable is used.</p>
     */
    @NameInMap("EnableBackupLog")
    public String enableBackupLog;

    /**
     * <p>The number of days for which to retain log backup files. Valid values: 7 to 730.</p>
     * <br>
     * <p>>  If you leave this parameter empty, the default value 7 is used.</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public Integer logBackupRetentionPeriod;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The days of the week on which to perform full backup. Separate multiple values with commas (,). Valid values:</p>
     * <br>
     * <p>*   **Monday**</p>
     * <p>*   **Tuesday**</p>
     * <p>*   **Wednesday**</p>
     * <p>*   **Thursday**</p>
     * <p>*   **Friday**</p>
     * <p>*   **Saturday**</p>
     * <p>*   **Sunday**</p>
     * <br>
     * <p>>  To ensure data security, we recommend that you specify at least two values.</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The start time of the full backup within a time range. Specify the time range in the HH:mmZ-HH:mmZ format. The time must be in UTC.</p>
     * <br>
     * <p>>  The time range is 1 hour.</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyRequest self = new ModifyBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyRequest setBackupRetentionPeriod(String backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public String getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public ModifyBackupPolicyRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyBackupPolicyRequest setEnableBackupLog(String enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public String getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public ModifyBackupPolicyRequest setLogBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public Integer getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    public ModifyBackupPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyBackupPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyBackupPolicyRequest setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public ModifyBackupPolicyRequest setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public ModifyBackupPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyBackupPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
