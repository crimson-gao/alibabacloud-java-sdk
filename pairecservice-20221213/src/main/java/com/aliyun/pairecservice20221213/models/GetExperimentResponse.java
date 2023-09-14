// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetExperimentResponseBody body;

    public static GetExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentResponse self = new GetExperimentResponse();
        return TeaModel.build(map, self);
    }

    public GetExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExperimentResponse setBody(GetExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentResponseBody getBody() {
        return this.body;
    }

}
