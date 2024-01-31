// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeEndPointEventListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEndPointEventListResponseBody body;

    public static DescribeEndPointEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndPointEventListResponse self = new DescribeEndPointEventListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEndPointEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEndPointEventListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEndPointEventListResponse setBody(DescribeEndPointEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEndPointEventListResponseBody getBody() {
        return this.body;
    }

}
