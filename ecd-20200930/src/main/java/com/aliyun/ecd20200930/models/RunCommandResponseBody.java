// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RunCommandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InvokeId")
    public String invokeId;

    public static RunCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCommandResponseBody self = new RunCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunCommandResponseBody setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

}
