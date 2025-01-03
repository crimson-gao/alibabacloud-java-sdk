// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListDbfsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDbfsResponseBody body;

    public static ListDbfsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDbfsResponse self = new ListDbfsResponse();
        return TeaModel.build(map, self);
    }

    public ListDbfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDbfsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDbfsResponse setBody(ListDbfsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDbfsResponseBody getBody() {
        return this.body;
    }

}
