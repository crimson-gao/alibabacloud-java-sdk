// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteAppInstancesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AppInstanceIds")
    public java.util.List<String> appInstanceIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static DeleteAppInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppInstancesRequest self = new DeleteAppInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppInstancesRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public DeleteAppInstancesRequest setAppInstanceIds(java.util.List<String> appInstanceIds) {
        this.appInstanceIds = appInstanceIds;
        return this;
    }
    public java.util.List<String> getAppInstanceIds() {
        return this.appInstanceIds;
    }

    public DeleteAppInstancesRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
