// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118.models;

import com.aliyun.tea.*;

public class ExtractAddressResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    /**
     * <p>RequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExtractAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExtractAddressResponseBody self = new ExtractAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ExtractAddressResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExtractAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
