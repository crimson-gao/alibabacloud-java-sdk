// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeIpControlsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIpControlsResponseBody body;

    public static DescribeIpControlsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpControlsResponse self = new DescribeIpControlsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpControlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpControlsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIpControlsResponse setBody(DescribeIpControlsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpControlsResponseBody getBody() {
        return this.body;
    }

}
