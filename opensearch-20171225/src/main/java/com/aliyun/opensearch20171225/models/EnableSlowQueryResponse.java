// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class EnableSlowQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableSlowQueryResponseBody body;

    public static EnableSlowQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSlowQueryResponse self = new EnableSlowQueryResponse();
        return TeaModel.build(map, self);
    }

    public EnableSlowQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSlowQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSlowQueryResponse setBody(EnableSlowQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSlowQueryResponseBody getBody() {
        return this.body;
    }

}
