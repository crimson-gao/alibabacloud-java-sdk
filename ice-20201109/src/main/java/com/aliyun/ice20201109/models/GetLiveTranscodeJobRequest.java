// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveTranscodeJobRequest extends TeaModel {
    /**
     * <p>The ID of the transcoding job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetLiveTranscodeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveTranscodeJobRequest self = new GetLiveTranscodeJobRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveTranscodeJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
