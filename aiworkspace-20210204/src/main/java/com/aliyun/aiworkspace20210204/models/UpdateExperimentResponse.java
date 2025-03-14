// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExperimentResponseBody body;

    public static UpdateExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentResponse self = new UpdateExperimentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExperimentResponse setBody(UpdateExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExperimentResponseBody getBody() {
        return this.body;
    }

}
