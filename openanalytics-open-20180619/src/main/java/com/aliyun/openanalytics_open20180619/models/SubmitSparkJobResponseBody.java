// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class SubmitSparkJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>j202011032013hangzhouf742a4330003679</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>C039FD4D-2F3C-4556-AF09-864D3A6485B2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitSparkJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSparkJobResponseBody self = new SubmitSparkJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSparkJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitSparkJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
