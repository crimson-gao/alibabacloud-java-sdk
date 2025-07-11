// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenECResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScreenECResponseBody body;

    public static ScreenECResponse build(java.util.Map<String, ?> map) throws Exception {
        ScreenECResponse self = new ScreenECResponse();
        return TeaModel.build(map, self);
    }

    public ScreenECResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScreenECResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScreenECResponse setBody(ScreenECResponseBody body) {
        this.body = body;
        return this;
    }
    public ScreenECResponseBody getBody() {
        return this.body;
    }

}
