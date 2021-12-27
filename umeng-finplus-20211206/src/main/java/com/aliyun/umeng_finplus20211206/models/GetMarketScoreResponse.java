// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211206.models;

import com.aliyun.tea.*;

public class GetMarketScoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMarketScoreResponseBody body;

    public static GetMarketScoreResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMarketScoreResponse self = new GetMarketScoreResponse();
        return TeaModel.build(map, self);
    }

    public GetMarketScoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMarketScoreResponse setBody(GetMarketScoreResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMarketScoreResponseBody getBody() {
        return this.body;
    }

}
