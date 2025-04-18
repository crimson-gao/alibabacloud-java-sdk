// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ExportScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportScriptResponseBody body;

    public static ExportScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportScriptResponse self = new ExportScriptResponse();
        return TeaModel.build(map, self);
    }

    public ExportScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportScriptResponse setBody(ExportScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportScriptResponseBody getBody() {
        return this.body;
    }

}
