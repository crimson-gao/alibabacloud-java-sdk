// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAsrServerInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAsrServerInfoResponseBody body;

    public static GetAsrServerInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsrServerInfoResponse self = new GetAsrServerInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAsrServerInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAsrServerInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAsrServerInfoResponse setBody(GetAsrServerInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAsrServerInfoResponseBody getBody() {
        return this.body;
    }

}
