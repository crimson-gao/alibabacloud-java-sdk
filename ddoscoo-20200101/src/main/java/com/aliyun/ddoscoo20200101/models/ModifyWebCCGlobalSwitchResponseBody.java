// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCCGlobalSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebCCGlobalSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebCCGlobalSwitchResponseBody self = new ModifyWebCCGlobalSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebCCGlobalSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
