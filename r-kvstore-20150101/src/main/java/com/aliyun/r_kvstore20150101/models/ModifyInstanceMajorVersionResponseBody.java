// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceMajorVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceMajorVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMajorVersionResponseBody self = new ModifyInstanceMajorVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMajorVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
