// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifySubscriptionRequest extends TeaModel {
    /**
     * <p>The objects of the change tracking task. The value is a JSON string. For more information, see [Objects of DTS tasks](https://help.aliyun.com/document_detail/209545.html).</p>
     * <br>
     * <p>>  You can call the [DescribeDtsJobDetail](https://help.aliyun.com/document_detail/208925.html) operation to query the original objects of the task.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DbList")
    public String dbList;

    /**
     * <p>The ID of the change tracking instance. You can call the [DescribeDtsJobs](https://help.aliyun.com/document_detail/209702.html) operation to query the instance ID.</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the change tracking task. You can call the [DescribeDtsJobs](https://help.aliyun.com/document_detail/209702.html) operation to query the task ID.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The ID of the region where the change tracking instance resides. For more information, see [List of supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to retrieve data definition language (DDL) statements. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubscriptionDataTypeDDL")
    public Boolean subscriptionDataTypeDDL;

    /**
     * <p>Specifies whether to retrieve data manipulation language (DML) statements. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubscriptionDataTypeDML")
    public Boolean subscriptionDataTypeDML;

    public static ModifySubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySubscriptionRequest self = new ModifySubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifySubscriptionRequest setDbList(String dbList) {
        this.dbList = dbList;
        return this;
    }
    public String getDbList() {
        return this.dbList;
    }

    public ModifySubscriptionRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ModifySubscriptionRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ModifySubscriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySubscriptionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifySubscriptionRequest setSubscriptionDataTypeDDL(Boolean subscriptionDataTypeDDL) {
        this.subscriptionDataTypeDDL = subscriptionDataTypeDDL;
        return this;
    }
    public Boolean getSubscriptionDataTypeDDL() {
        return this.subscriptionDataTypeDDL;
    }

    public ModifySubscriptionRequest setSubscriptionDataTypeDML(Boolean subscriptionDataTypeDML) {
        this.subscriptionDataTypeDML = subscriptionDataTypeDML;
        return this;
    }
    public Boolean getSubscriptionDataTypeDML() {
        return this.subscriptionDataTypeDML;
    }

}
