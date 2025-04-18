// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpdateResourceGroupAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>91C7CAB5-3B2E-4FB6-893C-0162C0******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateResourceGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceGroupAttributeResponseBody self = new UpdateResourceGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
