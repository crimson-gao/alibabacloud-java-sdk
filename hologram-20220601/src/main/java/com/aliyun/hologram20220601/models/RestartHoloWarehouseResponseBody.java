// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RestartHoloWarehouseResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2A8DEF6E-067E-5DB0-BAE1-2894266E6C6A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestartHoloWarehouseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartHoloWarehouseResponseBody self = new RestartHoloWarehouseResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartHoloWarehouseResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public RestartHoloWarehouseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
