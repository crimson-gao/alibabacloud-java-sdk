// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateNodeBatchRequest extends TeaModel {
    // The username of the account. The username must meet the following requirements:
    // 
    // * The username starts with a lowercase letter.
    // * The username contains lowercase letters, digits, and underscores (\_).
    // * The username is 4 to 16 characters in length.
    // 
    // > * Keywords cannot be used as account usernames.
    // > * The permissions of this account are fixed at read-only.
    // > * The username and password are required to be set only when you apply for an endpoint for the shard node for the first time.
    @NameInMap("AccountName")
    public String accountName;

    // The password of the account. The password must meet the following requirements:
    // 
    // *   The password contains at least three of the following character types: uppercase letters, lowercase letters, digits, and specific special characters.
    // *   These special characters include ! @ # $ % ^ & \* ( ) \_ + - =
    // *   The password is 8 to 32 characters in length.
    // 
    // >  The account password of the shard node cannot be reset.
    @NameInMap("AccountPassword")
    public String accountPassword;

    // Specifies whether to enable automatic payment. Default value: true. Valid values:
    // 
    // *   **true**: enables automatic payment. Make sure that you have sufficient balance within your account.
    // *   **false**: disables automatic payment. In this case, you must manually pay for the instance. You can perform the following operations to pay for the instance: Log on to the ApsaraDB for MongoDB console. In the upper-right corner of the page, choose **Expenses** > **Orders**. On the Orders page, find the order and complete the payment.
    @NameInMap("AutoPay")
    public Boolean autoPay;

    // The business information.
    @NameInMap("BusinessInfo")
    public String businessInfo;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.
    @NameInMap("ClientToken")
    public String clientToken;

    // The coupon code. Default value: `youhuiquan_promotion_option_id_for_blank`.
    @NameInMap("CouponNo")
    public String couponNo;

    // The ID of the instance for which you want to add nodes.
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    // The source of the request. Valid values:
    // 
    // *   **OpenApi**: ApsaraDB for MongoDB API
    // *   **mongo_buy**: ApsaraDB for MongoDB console
    @NameInMap("FromApp")
    public String fromApp;

    // The specifications of the mongos or shard node that you want to add. For more information, see [Instance types](~~57141~~).
    // 
    // >  Up to 32 mongos or shard nodes are supported for each sharded cluster instance.
    @NameInMap("NodesInfo")
    public String nodesInfo;

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

    // Specifies whether to apply for an endpoint for the shard node. Default value: false. Valid values:
    // 
    // *   **true**: applies for an endpoint for the shard node.
    // *   **false**: does not apply for an endpoint for the shard node.
    @NameInMap("ShardDirect")
    public Boolean shardDirect;

    public static CreateNodeBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeBatchRequest self = new CreateNodeBatchRequest();
        return TeaModel.build(map, self);
    }

    public CreateNodeBatchRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateNodeBatchRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateNodeBatchRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateNodeBatchRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateNodeBatchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateNodeBatchRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public CreateNodeBatchRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateNodeBatchRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public CreateNodeBatchRequest setNodesInfo(String nodesInfo) {
        this.nodesInfo = nodesInfo;
        return this;
    }
    public String getNodesInfo() {
        return this.nodesInfo;
    }

    public CreateNodeBatchRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateNodeBatchRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateNodeBatchRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateNodeBatchRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateNodeBatchRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateNodeBatchRequest setShardDirect(Boolean shardDirect) {
        this.shardDirect = shardDirect;
        return this;
    }
    public Boolean getShardDirect() {
        return this.shardDirect;
    }

}
