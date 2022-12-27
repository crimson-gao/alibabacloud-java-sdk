// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoProvisioningGroupRequest extends TeaModel {
    @NameInMap("LaunchConfiguration")
    public CreateAutoProvisioningGroupRequestLaunchConfiguration launchConfiguration;

    // The name of the auto provisioning group. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
    @NameInMap("AutoProvisioningGroupName")
    public String autoProvisioningGroupName;

    // The delivery type of the auto provisioning group. Valid values:
    // 
    // *   request: one-time asynchronous delivery. When the auto provisioning group is started, it attempts to asynchronously deliver an instance cluster that meets the target capacity only once. The group does not retry the operation regardless of whether all the instances are delivered.
    // *   instant: one-time synchronous delivery. When the auto provisioning group is started, it attempts to synchronously deliver an instance cluster that meets the target capacity only once. The list of delivered instances and the causes of delivery failures are returned in the response.
    // *   maintain: continuous delivery. When the auto provisioning group is started, it attempts to deliver an instance cluster that meets the target capacity, and monitors the real-time capacity. If the target capacity of the auto provisioning group is not reached, the auto provisioning group continues to create instances until the target capacity is reached.
    // 
    // Default value: maintain.
    @NameInMap("AutoProvisioningGroupType")
    public String autoProvisioningGroupType;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // The configs of data disks.
    @NameInMap("DataDiskConfig")
    public java.util.List<CreateAutoProvisioningGroupRequestDataDiskConfig> dataDiskConfig;

    // The type of supplemental instances. When the sum of the `PayAsYouGoTargetCapacity` and `SpotTargetCapacity` values is smaller than the value of `TotalTargetCapacity`, the auto provisioning group creates instances of the specified type to meet the target capacity. Valid values:
    // 
    // *   PayAsYouGo: pay-as-you-go instances
    // *   Spot: preemptible instances
    // 
    // Default value: Spot.
    @NameInMap("DefaultTargetCapacityType")
    public String defaultTargetCapacityType;

    // The description of the auto provisioning group.
    @NameInMap("Description")
    public String description;

    // Specifies whether to release the removed instances when the real-time capacity of the auto provisioning group exceeds the target capacity and a scale-in event is triggered. Valid values:
    // 
    // *   termination: releases the removed instances.
    // *   no-termination: only removes the instances from the auto provisioning group but does not release them.
    // 
    // Default value: no-termination.
    @NameInMap("ExcessCapacityTerminationPolicy")
    public String excessCapacityTerminationPolicy;

    // >  This parameter is in invitational preview and unavailable for general users.
    @NameInMap("HibernationOptionsConfigured")
    public Boolean hibernationOptionsConfigured;

    // The configurations of launch template.
    @NameInMap("LaunchTemplateConfig")
    public java.util.List<CreateAutoProvisioningGroupRequestLaunchTemplateConfig> launchTemplateConfig;

    // The ID of the launch template associated with the auto provisioning group. You can call the [DescribeLaunchTemplates](~~73759~~) operation to query available launch templates. When both the LaunchTemplateId and `LaunchConfiguration.*` parameters are specified, the LaunchTemplateId parameter takes precedence.
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    // The version of the launch template associated with the auto provisioning group. You can call the [DescribeLaunchTemplateVersions](~~73761~~) operation to query the versions of available launch templates.
    // 
    // Default value: the default version of the launch template.
    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    // The maximum price of preemptible instances in the auto provisioning group.
    // 
    // >  When both the `MaxSpotPrice` and `LaunchTemplateConfig.N.MaxPrice` parameters are specified, the smaller one of the two parameter values is used.
    @NameInMap("MaxSpotPrice")
    public Float maxSpotPrice;

    // The minimum target capacity of the auto provisioning group. The value must be a positive integer.  
    // 
    // When you specify this parameter, take note of the following items:
    // 
    // - This parameter takes effect only when `AutoProvisioningGroupType` is set to instant.
    // - If the number of instances that can be created in the current region is smaller than the value of this parameter, the operation cannot be called and no instances are created.
    // - If the number of instances that can be created in the current region is greater than the value of this parameter, instances can be created based on specified parameters.
    @NameInMap("MinTargetCapacity")
    public String minTargetCapacity;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The policy for creating pay-as-you-go instances. Valid values:
    // 
    // *   lowest-price: cost optimization policy. The auto provisioning group attempts to create instances of the lowest-priced instance type.
    // *   prioritized: priority-based policy. The auto provisioning group attempts to create instances based on the priority specified by the `LaunchTemplateConfig.N.Priority` parameter.
    // 
    // Default value: lowest-price.
    @NameInMap("PayAsYouGoAllocationStrategy")
    public String payAsYouGoAllocationStrategy;

    // The target capacity of pay-as-you-go instances in the auto provisioning group. The value must be smaller than the `TotalTargetCapacity` value.
    @NameInMap("PayAsYouGoTargetCapacity")
    public String payAsYouGoTargetCapacity;

    // The ID of the region in which to create the auto provisioning group. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group to which to assign the auto provisioning group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The policy for creating preemptible instances. Valid values:
    // 
    // *   lowest-price: cost optimization policy. The auto provisioning group attempts to create instances of the lowest-priced instance type.
    // *   diversified: balanced distribution policy. The auto provisioning group attempts to create instances in zones that are specified in extended configurations and then evenly distribute the instances across the zones.
    // *   capacity-optimized: capacity-optimized distribution policy. The auto provisioning group attempts to create instances that are of the optimal instance types across the optimal zones based on resource availability.
    // 
    // Default value: lowest-price.
    @NameInMap("SpotAllocationStrategy")
    public String spotAllocationStrategy;

    // The operation to be performed on the preemptible instance when it is interrupted. Valid values:
    // 
    // *   stop: stops the preemptible instance.
    // *   terminate: releases the preemptible instance.
    // 
    // Default value: terminate.
    @NameInMap("SpotInstanceInterruptionBehavior")
    public String spotInstanceInterruptionBehavior;

    // The number of preemptible instances of the lowest-priced instance type to be created by the auto provisioning group. This parameter takes effect when the `SpotAllocationStrategy` parameter is set to `lowest-price`.
    // 
    // The value of SpotInstancePoolsToUseCount must be smaller than the N value specified in `LaunchTemplateConfig.N.*` parameters.
    @NameInMap("SpotInstancePoolsToUseCount")
    public Integer spotInstancePoolsToUseCount;

    // The target capacity of preemptible instances in the auto provisioning group. The value must be smaller than the `TotalTargetCapacity` value.
    @NameInMap("SpotTargetCapacity")
    public String spotTargetCapacity;

    // The configs of system disks.
    @NameInMap("SystemDiskConfig")
    public java.util.List<CreateAutoProvisioningGroupRequestSystemDiskConfig> systemDiskConfig;

    // Specifies whether to release instances in the auto provisioning group when the auto provisioning group is deleted. Valid values:
    // 
    // *   true: releases instances in the auto provisioning group.
    // *   false: retains instances in the auto provisioning group.
    // 
    // Default value: false.
    @NameInMap("TerminateInstances")
    public Boolean terminateInstances;

    // Specifies whether to release instances in the auto provisioning group when the auto provisioning group expires. Valid values:
    // 
    // *   true: releases instances in the auto provisioning group.
    // *   false: only removes instances from the auto provisioning group but does not release them.
    // 
    // Default value: false.
    @NameInMap("TerminateInstancesWithExpiration")
    public Boolean terminateInstancesWithExpiration;

    // The total target capacity of the auto provisioning group. The value must be a positive integer.
    // 
    // The total target capacity of the auto provisioning group must be greater than or equal to the sum of the target capacity of pay-as-you-go instances specified by the `PayAsYouGoTargetCapacity` parameter and the target capacity of preemptible instances specified by the `SpotTargetCapacity` parameter.
    @NameInMap("TotalTargetCapacity")
    public String totalTargetCapacity;

    // The time at which to start the auto provisioning group. The period of time between this point in time and the point in time specified by the `ValidUntil` parameter is the effective time period of the auto provisioning group.
    // 
    // Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    // 
    // By default, an auto provisioning group is started immediately after it is created.
    @NameInMap("ValidFrom")
    public String validFrom;

    // The expiration time of the auto provisioning group. The period of time between this point in time and the point in time specified by the `ValidFrom` parameter is the effective time period of the auto provisioning group.
    // 
    // Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    // 
    // Default value: 2099-12-31T23:59:59Z.
    @NameInMap("ValidUntil")
    public String validUntil;

    public static CreateAutoProvisioningGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoProvisioningGroupRequest self = new CreateAutoProvisioningGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoProvisioningGroupRequest setLaunchConfiguration(CreateAutoProvisioningGroupRequestLaunchConfiguration launchConfiguration) {
        this.launchConfiguration = launchConfiguration;
        return this;
    }
    public CreateAutoProvisioningGroupRequestLaunchConfiguration getLaunchConfiguration() {
        return this.launchConfiguration;
    }

    public CreateAutoProvisioningGroupRequest setAutoProvisioningGroupName(String autoProvisioningGroupName) {
        this.autoProvisioningGroupName = autoProvisioningGroupName;
        return this;
    }
    public String getAutoProvisioningGroupName() {
        return this.autoProvisioningGroupName;
    }

    public CreateAutoProvisioningGroupRequest setAutoProvisioningGroupType(String autoProvisioningGroupType) {
        this.autoProvisioningGroupType = autoProvisioningGroupType;
        return this;
    }
    public String getAutoProvisioningGroupType() {
        return this.autoProvisioningGroupType;
    }

    public CreateAutoProvisioningGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAutoProvisioningGroupRequest setDataDiskConfig(java.util.List<CreateAutoProvisioningGroupRequestDataDiskConfig> dataDiskConfig) {
        this.dataDiskConfig = dataDiskConfig;
        return this;
    }
    public java.util.List<CreateAutoProvisioningGroupRequestDataDiskConfig> getDataDiskConfig() {
        return this.dataDiskConfig;
    }

    public CreateAutoProvisioningGroupRequest setDefaultTargetCapacityType(String defaultTargetCapacityType) {
        this.defaultTargetCapacityType = defaultTargetCapacityType;
        return this;
    }
    public String getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
    }

    public CreateAutoProvisioningGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAutoProvisioningGroupRequest setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        return this;
    }
    public String getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }

    public CreateAutoProvisioningGroupRequest setHibernationOptionsConfigured(Boolean hibernationOptionsConfigured) {
        this.hibernationOptionsConfigured = hibernationOptionsConfigured;
        return this;
    }
    public Boolean getHibernationOptionsConfigured() {
        return this.hibernationOptionsConfigured;
    }

    public CreateAutoProvisioningGroupRequest setLaunchTemplateConfig(java.util.List<CreateAutoProvisioningGroupRequestLaunchTemplateConfig> launchTemplateConfig) {
        this.launchTemplateConfig = launchTemplateConfig;
        return this;
    }
    public java.util.List<CreateAutoProvisioningGroupRequestLaunchTemplateConfig> getLaunchTemplateConfig() {
        return this.launchTemplateConfig;
    }

    public CreateAutoProvisioningGroupRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public CreateAutoProvisioningGroupRequest setLaunchTemplateVersion(String launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public CreateAutoProvisioningGroupRequest setMaxSpotPrice(Float maxSpotPrice) {
        this.maxSpotPrice = maxSpotPrice;
        return this;
    }
    public Float getMaxSpotPrice() {
        return this.maxSpotPrice;
    }

    public CreateAutoProvisioningGroupRequest setMinTargetCapacity(String minTargetCapacity) {
        this.minTargetCapacity = minTargetCapacity;
        return this;
    }
    public String getMinTargetCapacity() {
        return this.minTargetCapacity;
    }

    public CreateAutoProvisioningGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateAutoProvisioningGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAutoProvisioningGroupRequest setPayAsYouGoAllocationStrategy(String payAsYouGoAllocationStrategy) {
        this.payAsYouGoAllocationStrategy = payAsYouGoAllocationStrategy;
        return this;
    }
    public String getPayAsYouGoAllocationStrategy() {
        return this.payAsYouGoAllocationStrategy;
    }

    public CreateAutoProvisioningGroupRequest setPayAsYouGoTargetCapacity(String payAsYouGoTargetCapacity) {
        this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
        return this;
    }
    public String getPayAsYouGoTargetCapacity() {
        return this.payAsYouGoTargetCapacity;
    }

    public CreateAutoProvisioningGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAutoProvisioningGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateAutoProvisioningGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAutoProvisioningGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAutoProvisioningGroupRequest setSpotAllocationStrategy(String spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
        return this;
    }
    public String getSpotAllocationStrategy() {
        return this.spotAllocationStrategy;
    }

    public CreateAutoProvisioningGroupRequest setSpotInstanceInterruptionBehavior(String spotInstanceInterruptionBehavior) {
        this.spotInstanceInterruptionBehavior = spotInstanceInterruptionBehavior;
        return this;
    }
    public String getSpotInstanceInterruptionBehavior() {
        return this.spotInstanceInterruptionBehavior;
    }

    public CreateAutoProvisioningGroupRequest setSpotInstancePoolsToUseCount(Integer spotInstancePoolsToUseCount) {
        this.spotInstancePoolsToUseCount = spotInstancePoolsToUseCount;
        return this;
    }
    public Integer getSpotInstancePoolsToUseCount() {
        return this.spotInstancePoolsToUseCount;
    }

    public CreateAutoProvisioningGroupRequest setSpotTargetCapacity(String spotTargetCapacity) {
        this.spotTargetCapacity = spotTargetCapacity;
        return this;
    }
    public String getSpotTargetCapacity() {
        return this.spotTargetCapacity;
    }

    public CreateAutoProvisioningGroupRequest setSystemDiskConfig(java.util.List<CreateAutoProvisioningGroupRequestSystemDiskConfig> systemDiskConfig) {
        this.systemDiskConfig = systemDiskConfig;
        return this;
    }
    public java.util.List<CreateAutoProvisioningGroupRequestSystemDiskConfig> getSystemDiskConfig() {
        return this.systemDiskConfig;
    }

    public CreateAutoProvisioningGroupRequest setTerminateInstances(Boolean terminateInstances) {
        this.terminateInstances = terminateInstances;
        return this;
    }
    public Boolean getTerminateInstances() {
        return this.terminateInstances;
    }

    public CreateAutoProvisioningGroupRequest setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        return this;
    }
    public Boolean getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    public CreateAutoProvisioningGroupRequest setTotalTargetCapacity(String totalTargetCapacity) {
        this.totalTargetCapacity = totalTargetCapacity;
        return this;
    }
    public String getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    public CreateAutoProvisioningGroupRequest setValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    public String getValidFrom() {
        return this.validFrom;
    }

    public CreateAutoProvisioningGroupRequest setValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    public String getValidUntil() {
        return this.validUntil;
    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfigurationArn extends TeaModel {
        // >  This parameter is in invitational preview and unavailable for general users.
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        // >  This parameter is in invitational preview and unavailable for general users.
        @NameInMap("RoleType")
        public String roleType;

        // >  This parameter is in invitational preview and unavailable for general users.
        @NameInMap("Rolearn")
        public String rolearn;

        public static CreateAutoProvisioningGroupRequestLaunchConfigurationArn build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfigurationArn self = new CreateAutoProvisioningGroupRequestLaunchConfigurationArn();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationArn setAssumeRoleFor(Long assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationArn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationArn setRolearn(String rolearn) {
            this.rolearn = rolearn;
            return this;
        }
        public String getRolearn() {
            return this.rolearn;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk extends TeaModel {
        // The category of data disk N. Valid values of N: 1 to 16. Valid values of this parameter:
        // 
        // - cloud_efficiency: ultra disk
        // - cloud_ssd: standard SSD
        // - cloud_essd: ESSD
        // - cloud: basic disk
        // 
        // For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.  
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("Category")
        public String category;

        // Specifies whether to release data disk N when its associated instance is released. Valid values: 
        // 
        // - true: releases data disk N when the instance is released.
        // - false: does not release data disk N when the instance is released.
        // 
        // Default value: true. 
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        // The description of data disk N. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`. When both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("Description")
        public String description;

        // The mount point of data disk N. When both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("Device")
        public String device;

        // The name of data disk N. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, periods (.), colons (:), underscores (_), and hyphens (-).  
        // 
        // This parameter is empty by default. 
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("DiskName")
        public String diskName;

        // Specifies whether to encrypt data disk N. Valid values:
        // 
        // - true: encrypts data disk N.
        // - false: does not encrypt data disk N.
        // 
        // Default value: false. 
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("Encrypted")
        public Boolean encrypted;

        // The ID of the Key Management Service (KMS) key to be used for data disk N. When both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        // The performance level of the ESSD to be used as data disk N. The value of N must be the same as that of N in the `LaunchConfiguration.DataDisk.N.Category` parameter. Default value: PL1. Valid values: 
        // 
        // - PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
        // - PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
        // - PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
        // - PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
        // 
        // For more information about ESSD performance levels, see [ESSDs](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/essds).  
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        // The size of data disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values of this parameter: 
        // 
        // - Valid values when LaunchConfiguration.DataDisk.N.Category is set to cloud_efficiency: 20 to 32768.
        // - Valid values when LaunchConfiguration.DataDisk.N.Category is set to cloud_ssd: 20 to 32768.
        // - Valid values when LaunchConfiguration.DataDisk.N.Category is set to cloud_essd: depend on the `LaunchConfiguration.DataDisk.N.PerformanceLevel` value.    - Valid values when LaunchConfiguration.DataDisk.N.PerformanceLevel is set to PL0: 40 to 32768.
        //   - Valid values when LaunchConfiguration.DataDisk.N.PerformanceLevel is set to PL1: 20 to 32768.
        //   - Valid values when LaunchConfiguration.DataDisk.N.PerformanceLevel is set to PL2: 461 to 32768.
        //   - Valid values when LaunchConfiguration.DataDisk.N.PerformanceLevel is set to PL3: 1261 to 32768.
        // - Valid values when LaunchConfiguration.DataDisk.N.Category is set to cloud: 5 to 2000.
        // 
        // >  The value of LaunchConfiguration.DataDisk.N.Size must be greater than or equal to the size of the snapshot specified by the `LaunchConfiguration.DataDisk.N.SnapshotId` parameter.  When both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("Size")
        public Integer size;

        // The ID of the snapshot to be used to create data disk N. Valid values of N: 1 to 16. 
        // 
        // After this parameter is specified, the `LaunchConfiguration.DataDisk.N.Size` parameter is ignored. The size of data disk N is the same as that of the snapshot specified by this parameter. Use snapshots that were created on or after July 15, 2013. Otherwise, an error is returned and your request is rejected.  
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk self = new CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk extends TeaModel {
        // > This parameter is in invitational preview and is unavailable.
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        // Specifies whether to encrypt the disk. Valid values:
        // 
        // *   true: encrypts the disk.
        // *   false: does not encrypt the disk.
        // 
        // Default value: false.
        @NameInMap("Encrypted")
        public String encrypted;

        // The ID of the Key Management Service (KMS) key used by the cloud disk.
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        public static CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk self = new CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfigurationTag extends TeaModel {
        // The key of tag of the instance.
        // 
        // The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain `http://` or `https://`.
        // 
        // When both the `LaunchTemplateId` and `LaunchConfiguration.*` parameters are specified, the `LaunchTemplateId` parameter takes precedence.
        @NameInMap("Key")
        public String key;

        // The value of tag of the instance.
        // 
        // The tag value can be an empty string. It can be up to 128 characters in length. It cannot start with acs: or contain `http://` or `https://`.
        // 
        // When both the `LaunchTemplateId` and `LaunchConfiguration.*` parameters are specified, the `LaunchTemplateId` parameter takes precedence.
        @NameInMap("Value")
        public String value;

        public static CreateAutoProvisioningGroupRequestLaunchConfigurationTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfigurationTag self = new CreateAutoProvisioningGroupRequestLaunchConfigurationTag();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfiguration extends TeaModel {
        // >  This parameter is in invitational preview and unavailable for general users.
        @NameInMap("Arn")
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationArn> arn;

        // The performance mode of the burstable instance. Valid values:
        // 
        // *   Standard: the standard mode. For more information, see the "Standard mode" section in [Burstable instances](~~59977~~).
        // *   Unlimited: the unlimited mode. For more information, see the "Unlimited mode" section in [Burstable instances](~~59977~~).
        // 
        // This parameter is empty by default.
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("CreditSpecification")
        public String creditSpecification;

        // The details of data disks.
        @NameInMap("DataDisk")
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk> dataDisk;

        // The ID of the deployment set to which to deploy the instance.
        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        // The hostname of the instance. Take note of the following items:
        // 
        // *   The hostname cannot start or end with a period (.) or hyphen (-). It cannot contain consecutive periods (.) or hyphens (-).
        // *   For Windows instances, the hostname must be 2 to 15 characters in length and cannot contain periods (.) or contain only digits. It can contain letters, digits, and hyphens (-).
        // *   For instances that run other operating systems such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate a hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).
        // *   You cannot specify both the `LaunchConfiguration.HostName` and `LaunchConfiguration.HostNames.N` parameters. Otherwise, an error is returned.
        // *   When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("HostName")
        public String hostName;

        // The hostnames of instances. You can use this parameter to specify different hostnames for multiple instances.
        @NameInMap("HostNames")
        public java.util.List<String> hostNames;

        // The ID of the image to be used to create the instance. You can call the [DescribeImages](~~25534~~) operation to query available image resources. When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("ImageId")
        public String imageId;

        // The description of the instance. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`. When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        // The name of the instance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-). The default value of this parameter is the `InstanceId` value.
        // 
        // When you batch create instances, you can batch configure sequential names for the instances. For more information, see [Batch configure sequential names or hostnames for multiple instances](~~196048~~).
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("InstanceName")
        public String instanceName;

        // The billing method for network usage. Valid values:
        // 
        // *   PayByBandwidth: pay-by-bandwidth
        // *   PayByTraffic: pay-by-traffic
        // 
        // >  When the pay-by-traffic billing method for network usage is used, the maximum inbound and outbound bandwidth values are used as the upper limits of bandwidth instead of guaranteed performance specifications. When demands outstrip resource supplies, the maximum bandwidth may be affected. If you want guaranteed bandwidth for your instance, use the pay-by-bandwidth billing method.
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        // The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:
        // 
        // *   When the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of this parameter are 1 to 10 and the default value is 10.
        // *   When the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the value of `LaunchConfiguration.InternetMaxBandwidthOut`, and the default value is the value of `LaunchConfiguration.InternetMaxBandwidthOut`.
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        // The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.
        // 
        // Default value: 0.
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        // Specifies whether the instance is I/O optimized. Valid values:
        // 
        // *   none: The instance is not I/O optimized.
        // *   optimized: The instance is I/O optimized.
        // 
        // For instances of retired instance types, the default value is none. For instances of other instance types, the default value is optimized.
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("IoOptimized")
        public String ioOptimized;

        // The name of the key pair to be bound to the instance.
        // 
        // *   For Windows instances, this parameter is ignored. This parameter is empty by default.
        // *   For Linux instances, the password-based logon method is disabled by default.
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("KeyPairName")
        public String keyPairName;

        // The password of the instance. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include:
        // 
        // ``( ) ` ~ ! @ # $ % ^ & * - _ + = | { }  ``: ; \" < > , . ? /``  For Windows instances, the password cannot start with a forward slash (/). When both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence. `
        @NameInMap("Password")
        public String password;

        // Specifies whether to use the password preset in the image. Valid values:
        // 
        // *   true: uses the preset password.
        // *   false: does not use the preset password.
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("PasswordInherit")
        public Boolean passwordInherit;

        // The name of the instance Resource Access Management (RAM) role. You can call the [ListRoles](~~28713~~) operation provided by RAM to query the instance RAM roles that you created. When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("RamRoleName")
        public String ramRoleName;

        // The ID of the resource group to which to assign the instance. When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // Specifies whether to enable security hardening. Valid values:
        // 
        // *   Active: enables security hardening. This value is applicable only to public images.
        // *   Deactive: does not enable security hardening. This value is applicable to all images.
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("SecurityEnhancementStrategy")
        public String securityEnhancementStrategy;

        // The ID of the security group to which to assign the instance. When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        // The IDs of the security groups to assign the instance.
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        // The information of the system disk on the instance. When both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("SystemDisk")
        public CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk systemDisk;

        // The category of the system disk. Valid values:
        // 
        // *   cloud_efficiency: ultra disk
        // *   cloud_ssd: standard SSD
        // *   cloud_essd: enhanced SSD (ESSD)
        // *   cloud: basic disk
        // 
        // For non-I/O optimized instances of a retired instance type, the default value is cloud. For other types of instances, the default value is cloud_efficiency.
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        // The description of the system disk. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("SystemDiskDescription")
        public String systemDiskDescription;

        // The name of the system disk. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, periods (.), colons (:), underscores (\_), and hyphens (-).
        // 
        // This parameter is empty by default.
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("SystemDiskName")
        public String systemDiskName;

        // The performance level of the ESSD to be used as the system disk. Default value: PL0. Valid values:
        // 
        // *   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.
        // *   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.
        // *   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.
        // *   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.
        // 
        // For more information about ESSD performance levels, see [ESSDs](~~122389~~).
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        // The size of the system disk. Valid values: 20 to 500. Unit: GiB. This parameter value must be at least 20 and greater than or equal to the size of the image specified by the LaunchConfiguration.ImageId parameter.
        // 
        // Default value: 40 or the size of the image specified by the LaunchConfiguration.ImageId parameter, whichever is greater.
        // 
        // When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        // The tags of the instance. You can specify up to 20 tags.
        @NameInMap("Tag")
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationTag> tag;

        // The user data of the instance. The user data must be encoded in Base64. The raw data can be up to 16 KB in size. When both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.
        @NameInMap("UserData")
        public String userData;

        public static CreateAutoProvisioningGroupRequestLaunchConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfiguration self = new CreateAutoProvisioningGroupRequestLaunchConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setArn(java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationArn> arn) {
            this.arn = arn;
            return this;
        }
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationArn> getArn() {
            return this.arn;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setCreditSpecification(String creditSpecification) {
            this.creditSpecification = creditSpecification;
            return this;
        }
        public String getCreditSpecification() {
            return this.creditSpecification;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setDataDisk(java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk> getDataDisk() {
            return this.dataDisk;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setHostNames(java.util.List<String> hostNames) {
            this.hostNames = hostNames;
            return this;
        }
        public java.util.List<String> getHostNames() {
            return this.hostNames;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setPasswordInherit(Boolean passwordInherit) {
            this.passwordInherit = passwordInherit;
            return this;
        }
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSystemDisk(CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSystemDiskDescription(String systemDiskDescription) {
            this.systemDiskDescription = systemDiskDescription;
            return this;
        }
        public String getSystemDiskDescription() {
            return this.systemDiskDescription;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSystemDiskName(String systemDiskName) {
            this.systemDiskName = systemDiskName;
            return this;
        }
        public String getSystemDiskName() {
            return this.systemDiskName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setTag(java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationTag> getTag() {
            return this.tag;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class CreateAutoProvisioningGroupRequestDataDiskConfig extends TeaModel {
        // The category of data disk N. You can use this parameter to specify multiple disk categories, and the disk categories are prioritized in the order in which they are specified. If a specified disk category is unavailable, the system uses the next available disk category. Valid values: 
        // 
        // - cloud_efficiency: ultra disk
        // - cloud_ssd: standard SSD
        // - cloud_essd: ESSD
        // - cloud: basic disk
        @NameInMap("DiskCategory")
        public String diskCategory;

        public static CreateAutoProvisioningGroupRequestDataDiskConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestDataDiskConfig self = new CreateAutoProvisioningGroupRequestDataDiskConfig();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestDataDiskConfig setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchTemplateConfig extends TeaModel {
        // The instance type in extended configuration N. Valid values of N: 1 to 20. For more information about the valid values of this parameter, see [Instance families](~~25378~~).
        @NameInMap("InstanceType")
        public String instanceType;

        // The maximum price of preemptible instances in extended configuration N.
        // 
        // >  If you set one or more other `LaunchTemplateConfig.N.*` parameters, you must also set the `LaunchTemplateConfig.N.MaxPrice` parameter.
        @NameInMap("MaxPrice")
        public Double maxPrice;

        // The priority of extended configuration N. A value of 0 indicates the highest priority. Valid values: 0 to ∞.
        @NameInMap("Priority")
        public Integer priority;

        // The ID of the vSwitch in extended configuration N. The zone of the ECS instances created from the extended configuration is determined by the vSwitch.
        // 
        // >  If you set one or more other `LaunchTemplateConfig.N.*` parameters, you must also set the `LaunchTemplateConfig.N.VSwitchId` parameter.
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // The weight of the instance type specified in extended configuration N. A greater weight indicates that a single instance has more computing power and that fewer instances are required. The value must be greater than 0.
        // 
        // The weight is calculated based on the computing power of the instance type and the minimum computing power of a single instance in the cluster to be created by the auto provisioning group. For example, assume that the minimum computing power of a single instance is 8 vCPUs and 60 GiB of memory.
        // 
        // *   For an instance type with 8 vCPUs and 60 GiB of memory, you can set the weight to 1.
        // *   For an instance type with 16 vCPUs and 120 GiB of memory, you can set the weight to 2.
        @NameInMap("WeightedCapacity")
        public Double weightedCapacity;

        public static CreateAutoProvisioningGroupRequestLaunchTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchTemplateConfig self = new CreateAutoProvisioningGroupRequestLaunchTemplateConfig();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setMaxPrice(Double maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Double getMaxPrice() {
            return this.maxPrice;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setWeightedCapacity(Double weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Double getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

    public static class CreateAutoProvisioningGroupRequestSystemDiskConfig extends TeaModel {
        // The category of system disk N. You can use this parameter to specify multiple disk categories, and the disk categories are prioritized in the order in which they are specified. If a specified disk category is unavailable, the system uses the next available disk category. Valid values: 
        // 
        // - cloud_efficiency: ultra disk
        // - cloud_ssd: standard SSD
        // - cloud_essd: ESSD
        // - cloud: basic disk
        @NameInMap("DiskCategory")
        public String diskCategory;

        public static CreateAutoProvisioningGroupRequestSystemDiskConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestSystemDiskConfig self = new CreateAutoProvisioningGroupRequestSystemDiskConfig();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestSystemDiskConfig setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
        }

    }

}
