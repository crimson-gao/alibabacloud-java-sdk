// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartChatWorkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartChatWorkResponseBody body;

    public static StartChatWorkResponse build(java.util.Map<String, ?> map) throws Exception {
        StartChatWorkResponse self = new StartChatWorkResponse();
        return TeaModel.build(map, self);
    }

    public StartChatWorkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartChatWorkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartChatWorkResponse setBody(StartChatWorkResponseBody body) {
        this.body = body;
        return this;
    }
    public StartChatWorkResponseBody getBody() {
        return this.body;
    }

}
