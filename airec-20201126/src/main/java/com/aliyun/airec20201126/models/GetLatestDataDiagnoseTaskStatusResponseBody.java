// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GetLatestDataDiagnoseTaskStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8B90B646-1678-41A3-B23F-EAC6587B0E48</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static GetLatestDataDiagnoseTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLatestDataDiagnoseTaskStatusResponseBody self = new GetLatestDataDiagnoseTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLatestDataDiagnoseTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLatestDataDiagnoseTaskStatusResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
