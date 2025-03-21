// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerTimeSpanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OnsConsumerTimeSpanResponseBody body;

    public static OnsConsumerTimeSpanResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerTimeSpanResponse self = new OnsConsumerTimeSpanResponse();
        return TeaModel.build(map, self);
    }

    public OnsConsumerTimeSpanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsConsumerTimeSpanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsConsumerTimeSpanResponse setBody(OnsConsumerTimeSpanResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsConsumerTimeSpanResponseBody getBody() {
        return this.body;
    }

}
