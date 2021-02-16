// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterEndpointRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("EndpointType")
    public String endpointType;

    @NameInMap("Nodes")
    public String nodes;

    @NameInMap("ReadWriteMode")
    public String readWriteMode;

    @NameInMap("AutoAddNewNodes")
    public String autoAddNewNodes;

    @NameInMap("EndpointConfig")
    public String endpointConfig;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBEndpointDescription")
    public String DBEndpointDescription;

    public static CreateDBClusterEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterEndpointRequest self = new CreateDBClusterEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBClusterEndpointRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBClusterEndpointRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDBClusterEndpointRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBClusterEndpointRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDBClusterEndpointRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateDBClusterEndpointRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public CreateDBClusterEndpointRequest setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

    public CreateDBClusterEndpointRequest setReadWriteMode(String readWriteMode) {
        this.readWriteMode = readWriteMode;
        return this;
    }
    public String getReadWriteMode() {
        return this.readWriteMode;
    }

    public CreateDBClusterEndpointRequest setAutoAddNewNodes(String autoAddNewNodes) {
        this.autoAddNewNodes = autoAddNewNodes;
        return this;
    }
    public String getAutoAddNewNodes() {
        return this.autoAddNewNodes;
    }

    public CreateDBClusterEndpointRequest setEndpointConfig(String endpointConfig) {
        this.endpointConfig = endpointConfig;
        return this;
    }
    public String getEndpointConfig() {
        return this.endpointConfig;
    }

    public CreateDBClusterEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBClusterEndpointRequest setDBEndpointDescription(String DBEndpointDescription) {
        this.DBEndpointDescription = DBEndpointDescription;
        return this;
    }
    public String getDBEndpointDescription() {
        return this.DBEndpointDescription;
    }

}
