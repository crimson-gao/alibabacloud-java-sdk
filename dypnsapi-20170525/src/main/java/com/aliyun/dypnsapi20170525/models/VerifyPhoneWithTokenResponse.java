// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class VerifyPhoneWithTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyPhoneWithTokenResponseBody body;

    public static VerifyPhoneWithTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyPhoneWithTokenResponse self = new VerifyPhoneWithTokenResponse();
        return TeaModel.build(map, self);
    }

    public VerifyPhoneWithTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyPhoneWithTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyPhoneWithTokenResponse setBody(VerifyPhoneWithTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyPhoneWithTokenResponseBody getBody() {
        return this.body;
    }

}
