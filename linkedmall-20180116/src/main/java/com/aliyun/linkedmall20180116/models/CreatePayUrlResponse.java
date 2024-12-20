// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreatePayUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePayUrlResponseBody body;

    public static CreatePayUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePayUrlResponse self = new CreatePayUrlResponse();
        return TeaModel.build(map, self);
    }

    public CreatePayUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePayUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePayUrlResponse setBody(CreatePayUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePayUrlResponseBody getBody() {
        return this.body;
    }

}
