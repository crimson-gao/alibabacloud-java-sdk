// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RerunJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>450407b***</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static RerunJobRequest build(java.util.Map<String, ?> map) throws Exception {
        RerunJobRequest self = new RerunJobRequest();
        return TeaModel.build(map, self);
    }

    public RerunJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public RerunJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
