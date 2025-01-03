// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AiccsSmartCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AiccsSmartCallResponseBody body;

    public static AiccsSmartCallResponse build(java.util.Map<String, ?> map) throws Exception {
        AiccsSmartCallResponse self = new AiccsSmartCallResponse();
        return TeaModel.build(map, self);
    }

    public AiccsSmartCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AiccsSmartCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AiccsSmartCallResponse setBody(AiccsSmartCallResponseBody body) {
        this.body = body;
        return this;
    }
    public AiccsSmartCallResponseBody getBody() {
        return this.body;
    }

}
