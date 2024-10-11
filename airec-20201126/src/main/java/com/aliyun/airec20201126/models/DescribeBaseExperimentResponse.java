// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeBaseExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBaseExperimentResponseBody body;

    public static DescribeBaseExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBaseExperimentResponse self = new DescribeBaseExperimentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBaseExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBaseExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBaseExperimentResponse setBody(DescribeBaseExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBaseExperimentResponseBody getBody() {
        return this.body;
    }

}
