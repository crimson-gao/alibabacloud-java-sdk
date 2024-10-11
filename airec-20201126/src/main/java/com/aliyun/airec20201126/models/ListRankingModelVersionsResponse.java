// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRankingModelVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRankingModelVersionsResponseBody body;

    public static ListRankingModelVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRankingModelVersionsResponse self = new ListRankingModelVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListRankingModelVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRankingModelVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRankingModelVersionsResponse setBody(ListRankingModelVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRankingModelVersionsResponseBody getBody() {
        return this.body;
    }

}
