// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class SaveConfigJsonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveConfigJsonResponseBody body;

    public static SaveConfigJsonResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveConfigJsonResponse self = new SaveConfigJsonResponse();
        return TeaModel.build(map, self);
    }

    public SaveConfigJsonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveConfigJsonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveConfigJsonResponse setBody(SaveConfigJsonResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveConfigJsonResponseBody getBody() {
        return this.body;
    }

}
