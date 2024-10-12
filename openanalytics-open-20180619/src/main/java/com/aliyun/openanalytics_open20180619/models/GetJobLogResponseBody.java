// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetJobLogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>INFO SparkContext: Running Spark version 2.x</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>EC031B4B-3E07-40D2-9BC5-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetJobLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobLogResponseBody self = new GetJobLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobLogResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetJobLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
