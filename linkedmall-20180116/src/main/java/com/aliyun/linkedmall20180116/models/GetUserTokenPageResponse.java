// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetUserTokenPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserTokenPageResponseBody body;

    public static GetUserTokenPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserTokenPageResponse self = new GetUserTokenPageResponse();
        return TeaModel.build(map, self);
    }

    public GetUserTokenPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserTokenPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserTokenPageResponse setBody(GetUserTokenPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserTokenPageResponseBody getBody() {
        return this.body;
    }

}
