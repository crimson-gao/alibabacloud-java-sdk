// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryTicketsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTicketsResponseBody body;

    public static QueryTicketsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketsResponse self = new QueryTicketsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTicketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTicketsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTicketsResponse setBody(QueryTicketsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTicketsResponseBody getBody() {
        return this.body;
    }

}
