// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GetSampleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8B90B646-1678-41A3-B23F-EAC6587B0E48</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Sample result;

    public static GetSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSampleResponseBody self = new GetSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSampleResponseBody setResult(Sample result) {
        this.result = result;
        return this;
    }
    public Sample getResult() {
        return this.result;
    }

}
