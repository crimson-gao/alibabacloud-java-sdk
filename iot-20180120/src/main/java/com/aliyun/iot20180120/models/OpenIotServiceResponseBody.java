// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class OpenIotServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20671870***</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>427DB0B3-9436-4A3C-B2BC-B961F95E9488</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenIotServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenIotServiceResponseBody self = new OpenIotServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenIotServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenIotServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
