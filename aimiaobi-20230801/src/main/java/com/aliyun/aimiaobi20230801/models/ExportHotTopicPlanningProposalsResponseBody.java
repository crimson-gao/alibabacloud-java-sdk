// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportHotTopicPlanningProposalsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>业务数据</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ExportHotTopicPlanningProposalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportHotTopicPlanningProposalsResponseBody self = new ExportHotTopicPlanningProposalsResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportHotTopicPlanningProposalsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExportHotTopicPlanningProposalsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExportHotTopicPlanningProposalsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExportHotTopicPlanningProposalsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExportHotTopicPlanningProposalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportHotTopicPlanningProposalsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
