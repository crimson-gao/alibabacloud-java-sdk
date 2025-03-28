// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsAuthTokensResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSmsAuthTokensResponseBody body;

    public static GetSmsAuthTokensResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSmsAuthTokensResponse self = new GetSmsAuthTokensResponse();
        return TeaModel.build(map, self);
    }

    public GetSmsAuthTokensResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSmsAuthTokensResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSmsAuthTokensResponse setBody(GetSmsAuthTokensResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSmsAuthTokensResponseBody getBody() {
        return this.body;
    }

}
