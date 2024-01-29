// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetEventCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetEventCallbackResponseBody body;

    public static SetEventCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        SetEventCallbackResponse self = new SetEventCallbackResponse();
        return TeaModel.build(map, self);
    }

    public SetEventCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetEventCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetEventCallbackResponse setBody(SetEventCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public SetEventCallbackResponseBody getBody() {
        return this.body;
    }

}
