// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetLoginPreferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLoginPreferenceResponseBody body;

    public static GetLoginPreferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoginPreferenceResponse self = new GetLoginPreferenceResponse();
        return TeaModel.build(map, self);
    }

    public GetLoginPreferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLoginPreferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLoginPreferenceResponse setBody(GetLoginPreferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLoginPreferenceResponseBody getBody() {
        return this.body;
    }

}
