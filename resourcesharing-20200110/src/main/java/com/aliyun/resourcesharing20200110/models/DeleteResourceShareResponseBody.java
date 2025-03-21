// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class DeleteResourceShareResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A627EE2A-223D-4E1F-A954-394686AEA916</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteResourceShareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceShareResponseBody self = new DeleteResourceShareResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceShareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
