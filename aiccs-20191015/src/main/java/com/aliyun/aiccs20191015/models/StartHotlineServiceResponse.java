// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartHotlineServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartHotlineServiceResponseBody body;

    public static StartHotlineServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartHotlineServiceResponse self = new StartHotlineServiceResponse();
        return TeaModel.build(map, self);
    }

    public StartHotlineServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartHotlineServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartHotlineServiceResponse setBody(StartHotlineServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartHotlineServiceResponseBody getBody() {
        return this.body;
    }

}
