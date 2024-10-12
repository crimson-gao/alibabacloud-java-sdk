// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ListVirtualWareHouseConfigsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cc-bp1p816075e21****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vw-uf6a499c0m3w5****</p>
     */
    @NameInMap("VirtualWareHouseId")
    public String virtualWareHouseId;

    public static ListVirtualWareHouseConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualWareHouseConfigsRequest self = new ListVirtualWareHouseConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListVirtualWareHouseConfigsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ListVirtualWareHouseConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVirtualWareHouseConfigsRequest setVirtualWareHouseId(String virtualWareHouseId) {
        this.virtualWareHouseId = virtualWareHouseId;
        return this;
    }
    public String getVirtualWareHouseId() {
        return this.virtualWareHouseId;
    }

}
