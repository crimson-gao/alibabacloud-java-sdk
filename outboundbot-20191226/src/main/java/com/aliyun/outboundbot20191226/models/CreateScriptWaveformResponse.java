// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateScriptWaveformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScriptWaveformResponseBody body;

    public static CreateScriptWaveformResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScriptWaveformResponse self = new CreateScriptWaveformResponse();
        return TeaModel.build(map, self);
    }

    public CreateScriptWaveformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScriptWaveformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScriptWaveformResponse setBody(CreateScriptWaveformResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScriptWaveformResponseBody getBody() {
        return this.body;
    }

}
