// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAppInfoResponseBody body;

    public static QueryAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppInfoResponse self = new QueryAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAppInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAppInfoResponse setBody(QueryAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAppInfoResponseBody getBody() {
        return this.body;
    }

}
