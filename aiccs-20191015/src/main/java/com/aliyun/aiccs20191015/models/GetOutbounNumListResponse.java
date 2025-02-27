// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetOutbounNumListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOutbounNumListResponseBody body;

    public static GetOutbounNumListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOutbounNumListResponse self = new GetOutbounNumListResponse();
        return TeaModel.build(map, self);
    }

    public GetOutbounNumListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOutbounNumListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOutbounNumListResponse setBody(GetOutbounNumListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOutbounNumListResponseBody getBody() {
        return this.body;
    }

}
