// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateAuditCallbackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAuditCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuditCallbackResponseBody self = new UpdateAuditCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAuditCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
