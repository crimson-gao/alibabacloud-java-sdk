// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetMonitorResultRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("MinRecordId")
    public String minRecordId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public Long startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    @NameInMap("AlgorithmVendor")
    public String algorithmVendor;

    public static GetMonitorResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorResultRequest self = new GetMonitorResultRequest();
        return TeaModel.build(map, self);
    }

    public GetMonitorResultRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetMonitorResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetMonitorResultRequest setMinRecordId(String minRecordId) {
        this.minRecordId = minRecordId;
        return this;
    }
    public String getMinRecordId() {
        return this.minRecordId;
    }

    public GetMonitorResultRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetMonitorResultRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetMonitorResultRequest setAlgorithmVendor(String algorithmVendor) {
        this.algorithmVendor = algorithmVendor;
        return this;
    }
    public String getAlgorithmVendor() {
        return this.algorithmVendor;
    }

}
