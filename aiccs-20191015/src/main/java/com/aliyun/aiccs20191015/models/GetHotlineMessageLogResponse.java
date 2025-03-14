// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineMessageLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotlineMessageLogResponseBody body;

    public static GetHotlineMessageLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineMessageLogResponse self = new GetHotlineMessageLogResponse();
        return TeaModel.build(map, self);
    }

    public GetHotlineMessageLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotlineMessageLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotlineMessageLogResponse setBody(GetHotlineMessageLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotlineMessageLogResponseBody getBody() {
        return this.body;
    }

}
