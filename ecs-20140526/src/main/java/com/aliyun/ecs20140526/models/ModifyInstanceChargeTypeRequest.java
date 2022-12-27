// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceChargeTypeRequest extends TeaModel {
    // Specifies whether to enable automatic payment. Valid values:
    // 
    // *   true: enables automatic payment. Make sure that you have a sufficient balance in your account. Otherwise, your order becomes invalid and is canceled.
    // *   false: An order is generated but no payment is made.
    // 
    // Default value: true.
    // 
    // >  If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ECS console to pay for the order.
    @NameInMap("AutoPay")
    public Boolean autoPay;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // Specifies whether to check the validity of the request without actually making the request. Valid values:
    // 
    // *   true: The validity of the request is checked but the request is not made. Check items include whether your AccessKey pair is valid, whether RAM users are granted required permissions, and whether the required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the `DryRunOperation` error code is returned.
    // *   false: The validity of the request is checked. If the check succeeds, a 2XX HTTP status code is returned and the request is made.
    // 
    // Default value: false.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // Specifies whether to change the billing method of all data disks attached to the instance from pay-as-you-go to subscription.
    // 
    // Default value: false.
    @NameInMap("IncludeDataDisks")
    public Boolean includeDataDisks;

    // The new billing method. Valid values:
    // 
    // *   PrePaid: the subscription billing method
    // *   PostPaid: the pay-as-you-go billing method
    // 
    // Default value: PrePaid.
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    // The IDs of instances. The value can be a JSON array that consists of up to 20 instance IDs. Separate multiple instance IDs with commas (,).
    @NameInMap("InstanceIds")
    public String instanceIds;

    // Specifies whether to return cost details of the order when the billing method is changed from subscription to pay-as-you-go.
    // 
    // Default value: false.
    @NameInMap("IsDetailFee")
    public Boolean isDetailFee;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The renewal period of the subscription instance. If the instance is hosted on a dedicated host, the renewal period of the instance cannot exceed the subscription duration of the dedicated host. Valid values:
    // 
    // Valid values when the `PeriodUnit` parameter is set to Month: `1, 2, 3, 4, 5, 6, 7, 8, 9, and 12`.
    @NameInMap("Period")
    public Integer period;

    // The unit of the renewal period (`Period`). Valid values:
    // 
    // Month
    // 
    // Default value: Month.
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // The ID of the region in which the instance is located. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyInstanceChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceChargeTypeRequest self = new ModifyInstanceChargeTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceChargeTypeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyInstanceChargeTypeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyInstanceChargeTypeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyInstanceChargeTypeRequest setIncludeDataDisks(Boolean includeDataDisks) {
        this.includeDataDisks = includeDataDisks;
        return this;
    }
    public Boolean getIncludeDataDisks() {
        return this.includeDataDisks;
    }

    public ModifyInstanceChargeTypeRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public ModifyInstanceChargeTypeRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyInstanceChargeTypeRequest setIsDetailFee(Boolean isDetailFee) {
        this.isDetailFee = isDetailFee;
        return this;
    }
    public Boolean getIsDetailFee() {
        return this.isDetailFee;
    }

    public ModifyInstanceChargeTypeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceChargeTypeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceChargeTypeRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public ModifyInstanceChargeTypeRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public ModifyInstanceChargeTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceChargeTypeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceChargeTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
