// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeQuotaResponseBody body;

    public static DescribeQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQuotaResponse self = new DescribeQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeQuotaResponse setBody(DescribeQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQuotaResponseBody getBody() {
        return this.body;
    }

}
