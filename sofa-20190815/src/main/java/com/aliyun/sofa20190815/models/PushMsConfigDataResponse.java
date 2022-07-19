// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushMsConfigDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PushMsConfigDataResponseBody body;

    public static PushMsConfigDataResponse build(java.util.Map<String, ?> map) throws Exception {
        PushMsConfigDataResponse self = new PushMsConfigDataResponse();
        return TeaModel.build(map, self);
    }

    public PushMsConfigDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushMsConfigDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushMsConfigDataResponse setBody(PushMsConfigDataResponseBody body) {
        this.body = body;
        return this;
    }
    public PushMsConfigDataResponseBody getBody() {
        return this.body;
    }

}
