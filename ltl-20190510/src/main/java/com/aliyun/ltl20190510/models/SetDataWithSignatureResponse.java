// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class SetDataWithSignatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetDataWithSignatureResponseBody body;

    public static SetDataWithSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDataWithSignatureResponse self = new SetDataWithSignatureResponse();
        return TeaModel.build(map, self);
    }

    public SetDataWithSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDataWithSignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDataWithSignatureResponse setBody(SetDataWithSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDataWithSignatureResponseBody getBody() {
        return this.body;
    }

}
