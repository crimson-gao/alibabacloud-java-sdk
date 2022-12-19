// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteGroupResponseBody extends TeaModel {
    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupResponseBody self = new DeleteGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
