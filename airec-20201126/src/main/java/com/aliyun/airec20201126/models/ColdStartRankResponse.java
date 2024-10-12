// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ColdStartRankResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ColdStartRankResponseBody body;

    public static ColdStartRankResponse build(java.util.Map<String, ?> map) throws Exception {
        ColdStartRankResponse self = new ColdStartRankResponse();
        return TeaModel.build(map, self);
    }

    public ColdStartRankResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ColdStartRankResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ColdStartRankResponse setBody(ColdStartRankResponseBody body) {
        this.body = body;
        return this;
    }
    public ColdStartRankResponseBody getBody() {
        return this.body;
    }

}
