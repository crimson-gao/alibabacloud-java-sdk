// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockStatusResponseBody extends TeaModel {
    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebLockStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockStatusResponseBody self = new ModifyWebLockStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
