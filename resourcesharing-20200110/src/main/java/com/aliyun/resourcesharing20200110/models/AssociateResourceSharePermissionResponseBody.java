// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AssociateResourceSharePermissionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>111FB84A-60A9-403E-9067-E55D7EE95BD1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateResourceSharePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateResourceSharePermissionResponseBody self = new AssociateResourceSharePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateResourceSharePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
