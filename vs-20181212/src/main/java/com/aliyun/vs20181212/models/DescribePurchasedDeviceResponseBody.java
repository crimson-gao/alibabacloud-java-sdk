// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribePurchasedDeviceResponseBody extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("SubType")
    public String subType;

    @NameInMap("Vendor")
    public String vendor;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Description")
    public String description;

    @NameInMap("RegisterCode")
    public String registerCode;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("Region")
    public String region;

    @NameInMap("Name")
    public String name;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("Id")
    public String id;

    @NameInMap("OrderId")
    public String orderId;

    public static DescribePurchasedDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedDeviceResponseBody self = new DescribePurchasedDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedDeviceResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribePurchasedDeviceResponseBody setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public DescribePurchasedDeviceResponseBody setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public DescribePurchasedDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePurchasedDeviceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribePurchasedDeviceResponseBody setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
        return this;
    }
    public String getRegisterCode() {
        return this.registerCode;
    }

    public DescribePurchasedDeviceResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribePurchasedDeviceResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribePurchasedDeviceResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribePurchasedDeviceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePurchasedDeviceResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribePurchasedDeviceResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribePurchasedDeviceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
