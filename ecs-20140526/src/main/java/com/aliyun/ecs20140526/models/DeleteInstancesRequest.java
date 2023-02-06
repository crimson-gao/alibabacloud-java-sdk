// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteInstancesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to check the validity of the request without actually making the request. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true: The validity of the request is checked but the request is not made. Check items include whether your AccessKey pair is valid, whether Resource Access Management (RAM) users are granted required permissions, and whether the required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, DRYRUN.SUCCESS is returned.</p>
     * <p>*   false: The validity of the request is checked. If the check succeeds, a 2XX HTTP status code is returned and the request is made.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to forcefully release the instance that is in the **Running** (`Running`) state. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true: forcefully releases the instance that is in the **Running** (`Running`) state. When the Force parameter is set to true, this operation is equivalent to the power-off operation. Temporary data in the memory and storage of the instance is erased and cannot be recovered.</p>
     * <p>*   false: normally releases the instance. This value is valid only for instances that are in the **Stopped** (`Stopped`) state.</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The IDs of instances. You can specify up to 100 instance IDs in a single request.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to release an expired subscription instance.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("TerminateSubscription")
    public Boolean terminateSubscription;

    public static DeleteInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstancesRequest self = new DeleteInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteInstancesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteInstancesRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteInstancesRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public DeleteInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteInstancesRequest setTerminateSubscription(Boolean terminateSubscription) {
        this.terminateSubscription = terminateSubscription;
        return this;
    }
    public Boolean getTerminateSubscription() {
        return this.terminateSubscription;
    }

}
