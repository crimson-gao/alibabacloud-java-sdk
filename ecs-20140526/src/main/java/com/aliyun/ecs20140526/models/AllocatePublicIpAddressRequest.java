// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocatePublicIpAddressRequest extends TeaModel {
    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The public IP address to assign to the instance. This parameter is empty by default, which indicates that a public IP address is randomly assigned by the system.
    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The virtual LAN (VLAN) ID of the instance. 
    // 
    // >  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.
    @NameInMap("VlanId")
    public String vlanId;

    public static AllocatePublicIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocatePublicIpAddressRequest self = new AllocatePublicIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public AllocatePublicIpAddressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AllocatePublicIpAddressRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public AllocatePublicIpAddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AllocatePublicIpAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AllocatePublicIpAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AllocatePublicIpAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AllocatePublicIpAddressRequest setVlanId(String vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public String getVlanId() {
        return this.vlanId;
    }

}
