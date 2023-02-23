// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLogResponseBody body;

    public static GetLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogResponse self = new GetLogResponse();
        return TeaModel.build(map, self);
    }

    public GetLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogResponse setBody(GetLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogResponseBody getBody() {
        return this.body;
    }

}
