// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteClientKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteClientKeyResponseBody body;

    public static DeleteClientKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientKeyResponse self = new DeleteClientKeyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClientKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClientKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteClientKeyResponse setBody(DeleteClientKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClientKeyResponseBody getBody() {
        return this.body;
    }

}
