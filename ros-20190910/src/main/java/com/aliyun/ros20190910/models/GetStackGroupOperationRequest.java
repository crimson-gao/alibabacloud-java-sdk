// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackGroupOperationRequest extends TeaModel {
    /**
     * <p>The operation ID. You can call the [ListStackGroupOperations](https://help.aliyun.com/document_detail/151342.html) operation to query the operation ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The region ID of the stack group. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/131035.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetStackGroupOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackGroupOperationRequest self = new GetStackGroupOperationRequest();
        return TeaModel.build(map, self);
    }

    public GetStackGroupOperationRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public GetStackGroupOperationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
