// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitOssFileCopyJobResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("JobId")
    public String jobId;

    public static SubmitOssFileCopyJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitOssFileCopyJobResponseBody self = new SubmitOssFileCopyJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitOssFileCopyJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitOssFileCopyJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
