// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryLogisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLogisticsResponseBody body;

    public static QueryLogisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLogisticsResponse self = new QueryLogisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLogisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLogisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLogisticsResponse setBody(QueryLogisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLogisticsResponseBody getBody() {
        return this.body;
    }

}
