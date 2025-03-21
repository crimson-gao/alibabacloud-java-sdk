// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetActivityGameInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetActivityGameInfoResponseBody body;

    public static GetActivityGameInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetActivityGameInfoResponse self = new GetActivityGameInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetActivityGameInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetActivityGameInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetActivityGameInfoResponse setBody(GetActivityGameInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetActivityGameInfoResponseBody getBody() {
        return this.body;
    }

}
