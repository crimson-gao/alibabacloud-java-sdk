// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUpPeakPublishStreamDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUpPeakPublishStreamDataResponseBody body;

    public static DescribeUpPeakPublishStreamDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpPeakPublishStreamDataResponse self = new DescribeUpPeakPublishStreamDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUpPeakPublishStreamDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUpPeakPublishStreamDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUpPeakPublishStreamDataResponse setBody(DescribeUpPeakPublishStreamDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUpPeakPublishStreamDataResponseBody getBody() {
        return this.body;
    }

}
