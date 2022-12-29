// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAuditLogFilterRequest extends TeaModel {
    // The ID of the instance.
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    // The type of the audit log entries to be collected. Valid values:
    // 
    // *   **admin**: O\&M and management operations
    // *   **slow**: slow query logs
    // *   **query**: query operations
    // *   **insert**: insert operations
    // *   **update**: update operations
    // *   **delete**: delete operations
    // *   **command**: protocol commands such as the aggregate method
    @NameInMap("Filter")
    public String filter;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The role of the node in the instance. Valid values:
    // 
    // *   **primary**
    // *   **secondary**
    @NameInMap("RoleType")
    public String roleType;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyAuditLogFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAuditLogFilterRequest self = new ModifyAuditLogFilterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAuditLogFilterRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyAuditLogFilterRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ModifyAuditLogFilterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAuditLogFilterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAuditLogFilterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAuditLogFilterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyAuditLogFilterRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

    public ModifyAuditLogFilterRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
