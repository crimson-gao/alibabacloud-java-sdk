// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class ListDatabaseAccessPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDatabaseAccessPointResponseBody body;

    public static ListDatabaseAccessPointResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseAccessPointResponse self = new ListDatabaseAccessPointResponse();
        return TeaModel.build(map, self);
    }

    public ListDatabaseAccessPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatabaseAccessPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatabaseAccessPointResponse setBody(ListDatabaseAccessPointResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatabaseAccessPointResponseBody getBody() {
        return this.body;
    }

}
