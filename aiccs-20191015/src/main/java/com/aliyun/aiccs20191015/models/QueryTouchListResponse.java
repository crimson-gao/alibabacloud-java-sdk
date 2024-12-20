// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryTouchListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTouchListResponseBody body;

    public static QueryTouchListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTouchListResponse self = new QueryTouchListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTouchListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTouchListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTouchListResponse setBody(QueryTouchListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTouchListResponseBody getBody() {
        return this.body;
    }

}
