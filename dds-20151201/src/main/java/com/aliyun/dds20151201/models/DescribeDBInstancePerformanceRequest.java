// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePerformanceRequest extends TeaModel {
    // The ID of the instance.
    // 
    // >  If you set this parameter to the ID of a sharded cluster instance, you must also specify the **NodeId** parameter.
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    // The end of the time range to query. Specify the time in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC. The end time must be later than the start time.
    @NameInMap("EndTime")
    public String endTime;

    // A performance metric. For more information about the valid values, see [Performance metrics](~~64048~~).
    // 
    // >  If you specify multiple metrics, separate them with commas (,).
    @NameInMap("Key")
    public String key;

    // The ID of the mongos or shard node in a sharded cluster instance. You can specify this parameter to view the performance data of a single node.
    // 
    // >  This parameter is valid only when **DBInstanceId** is set to the ID of a sharded cluster instance.
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The role of the node in a standalone or replica set instance.
    // 
    // * **Primary**
    // * **Secondary**
    // 
    // > * This parameter is valid only when you specify the **DBInstanceId** parameter to the ID of a standalone instance or a replica set instance.
    // > * If you set the **DBInstanceId** parameter to the ID of a standalone instance, the value of this parameter can only be **Primary**.
    @NameInMap("ReplicaSetRole")
    public String replicaSetRole;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The role ID of the node in a standalone or replica set instance. You can call the [DescribeReplicaSetRole](~~62134~~) operation to query the role ID of the node.
    // 
    // >  This parameter is valid only when you specify the **DBInstanceId** parameter to the ID of a standalone instance or a replica set instance.
    @NameInMap("RoleId")
    public String roleId;

    @NameInMap("SecurityToken")
    public String securityToken;

    // The beginning of the time range to query. Specify the time in the *yyyy-MM-dd*T*HH:mm*Z format. The time must be in UTC.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBInstancePerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancePerformanceRequest self = new DescribeDBInstancePerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancePerformanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstancePerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBInstancePerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDBInstancePerformanceRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeDBInstancePerformanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBInstancePerformanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstancePerformanceRequest setReplicaSetRole(String replicaSetRole) {
        this.replicaSetRole = replicaSetRole;
        return this;
    }
    public String getReplicaSetRole() {
        return this.replicaSetRole;
    }

    public DescribeDBInstancePerformanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBInstancePerformanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBInstancePerformanceRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public DescribeDBInstancePerformanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDBInstancePerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
