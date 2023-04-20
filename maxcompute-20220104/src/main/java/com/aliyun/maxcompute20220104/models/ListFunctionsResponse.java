// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListFunctionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFunctionsResponseBody body;

    public static ListFunctionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionsResponse self = new ListFunctionsResponse();
        return TeaModel.build(map, self);
    }

    public ListFunctionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFunctionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFunctionsResponse setBody(ListFunctionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFunctionsResponseBody getBody() {
        return this.body;
    }

}
