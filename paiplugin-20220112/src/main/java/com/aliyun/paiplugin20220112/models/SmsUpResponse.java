// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class SmsUpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SmsUpResponseBody body;

    public static SmsUpResponse build(java.util.Map<String, ?> map) throws Exception {
        SmsUpResponse self = new SmsUpResponse();
        return TeaModel.build(map, self);
    }

    public SmsUpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SmsUpResponse setBody(SmsUpResponseBody body) {
        this.body = body;
        return this;
    }
    public SmsUpResponseBody getBody() {
        return this.body;
    }

}
