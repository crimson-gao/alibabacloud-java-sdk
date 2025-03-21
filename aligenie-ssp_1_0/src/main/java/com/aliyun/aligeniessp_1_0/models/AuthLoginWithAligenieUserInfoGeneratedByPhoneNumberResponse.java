// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBody body;

    public static AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse self = new AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse();
        return TeaModel.build(map, self);
    }

    public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse setBody(AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBody getBody() {
        return this.body;
    }

}
