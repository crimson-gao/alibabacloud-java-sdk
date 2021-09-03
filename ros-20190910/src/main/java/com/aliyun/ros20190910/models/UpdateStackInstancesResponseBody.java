// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OperationId")
    public String operationId;

    public static UpdateStackInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackInstancesResponseBody self = new UpdateStackInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateStackInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateStackInstancesResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
