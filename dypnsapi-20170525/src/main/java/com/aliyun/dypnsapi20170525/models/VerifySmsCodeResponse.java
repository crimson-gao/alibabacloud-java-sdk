// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class VerifySmsCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifySmsCodeResponseBody body;

    public static VerifySmsCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifySmsCodeResponse self = new VerifySmsCodeResponse();
        return TeaModel.build(map, self);
    }

    public VerifySmsCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifySmsCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifySmsCodeResponse setBody(VerifySmsCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifySmsCodeResponseBody getBody() {
        return this.body;
    }

}
