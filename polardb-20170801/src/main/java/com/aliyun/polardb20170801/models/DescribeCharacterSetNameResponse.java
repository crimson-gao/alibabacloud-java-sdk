// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeCharacterSetNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCharacterSetNameResponseBody body;

    public static DescribeCharacterSetNameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCharacterSetNameResponse self = new DescribeCharacterSetNameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCharacterSetNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCharacterSetNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCharacterSetNameResponse setBody(DescribeCharacterSetNameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCharacterSetNameResponseBody getBody() {
        return this.body;
    }

}
