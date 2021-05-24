// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class TestSpeechResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestSpeechResponseBody body;

    public static TestSpeechResponse build(java.util.Map<String, ?> map) throws Exception {
        TestSpeechResponse self = new TestSpeechResponse();
        return TeaModel.build(map, self);
    }

    public TestSpeechResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestSpeechResponse setBody(TestSpeechResponseBody body) {
        this.body = body;
        return this;
    }
    public TestSpeechResponseBody getBody() {
        return this.body;
    }

}
