// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyMultiZoneClusterNodeTypeResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMultiZoneClusterNodeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMultiZoneClusterNodeTypeResponseBody self = new ModifyMultiZoneClusterNodeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMultiZoneClusterNodeTypeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyMultiZoneClusterNodeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
