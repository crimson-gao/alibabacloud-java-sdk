// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAvailabilityZonesRequest extends TeaModel {
    /**
     * <p>The language of the values of the returned <strong>RegionName</strong> and <strong>ZoneName</strong> parameters. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The instance type of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>dds.mongo.standard</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The architecture of the instance. Valid values:</p>
     * <ul>
     * <li><strong>normal</strong>: replica set instance</li>
     * <li><strong>sharding</strong>: sharded cluster instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The database engine version of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The secondary zone ID that is excluded from the query results. You can configure the ExcludeZoneId and ExcludeSecondaryZoneId parameters to specify the IDs of multiple zones that are excluded from the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-b</p>
     */
    @NameInMap("ExcludeSecondaryZoneId")
    public String excludeSecondaryZoneId;

    /**
     * <p>The zone ID that is excluded from the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-g</p>
     */
    @NameInMap("ExcludeZoneId")
    public String excludeZoneId;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong> (default): subscription</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The edition of the instance. High-Available Edition and Preview Edition (dbfs) are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>dbfs</p>
     */
    @NameInMap("MongoType")
    public String mongoType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the latest available regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of nodes. This parameter is available only for replica set instances.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ReplicationFactor")
    public String replicationFactor;

    /**
     * <p>The ID of the resource group. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmx2m4rqu7pry</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The storage type of the instance. </p>
     * <ul>
     * <li><strong>cloud</strong>: The system displays only zones in which cloud disk-based instances can be deployed. </li>
     * <li><strong>local</strong>: The system displays only zones in which local disk-based instances can be deployed. </li>
     * <li><strong>default</strong> or null: The system displays only zones in which cloud disk-based and local disk-based instances can be deployed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>local</p>
     */
    @NameInMap("StorageSupport")
    public String storageSupport;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>cloud_essd1</strong>: PL1 enhanced SSD (ESSD)</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
     * <li><strong>local_ssd</strong>: Local SSD</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Instances that run MongoDB 4.4 or later support only cloud disks. <strong>cloud_essd1</strong> is selected if you leave this parameter empty.</li>
     * <li>Instances that run MongoDB 4.2 and earlier support only local disks. <strong>local_ssd</strong> is selected if you leave this parameter empty.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>local_ssd</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The zone ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query available zones.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeAvailabilityZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailabilityZonesRequest self = new DescribeAvailabilityZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailabilityZonesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeAvailabilityZonesRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public DescribeAvailabilityZonesRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public DescribeAvailabilityZonesRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeAvailabilityZonesRequest setExcludeSecondaryZoneId(String excludeSecondaryZoneId) {
        this.excludeSecondaryZoneId = excludeSecondaryZoneId;
        return this;
    }
    public String getExcludeSecondaryZoneId() {
        return this.excludeSecondaryZoneId;
    }

    public DescribeAvailabilityZonesRequest setExcludeZoneId(String excludeZoneId) {
        this.excludeZoneId = excludeZoneId;
        return this;
    }
    public String getExcludeZoneId() {
        return this.excludeZoneId;
    }

    public DescribeAvailabilityZonesRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeAvailabilityZonesRequest setMongoType(String mongoType) {
        this.mongoType = mongoType;
        return this;
    }
    public String getMongoType() {
        return this.mongoType;
    }

    public DescribeAvailabilityZonesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeAvailabilityZonesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAvailabilityZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailabilityZonesRequest setReplicationFactor(String replicationFactor) {
        this.replicationFactor = replicationFactor;
        return this;
    }
    public String getReplicationFactor() {
        return this.replicationFactor;
    }

    public DescribeAvailabilityZonesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeAvailabilityZonesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAvailabilityZonesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAvailabilityZonesRequest setStorageSupport(String storageSupport) {
        this.storageSupport = storageSupport;
        return this;
    }
    public String getStorageSupport() {
        return this.storageSupport;
    }

    public DescribeAvailabilityZonesRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public DescribeAvailabilityZonesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
