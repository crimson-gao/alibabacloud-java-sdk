// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class ModifyMajorCustomerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMajorCustomerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMajorCustomerResponseBody self = new ModifyMajorCustomerResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMajorCustomerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
