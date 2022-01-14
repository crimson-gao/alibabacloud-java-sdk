// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMsacProductVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMsacProductVersionResponseBody body;

    public static GetMsacProductVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMsacProductVersionResponse self = new GetMsacProductVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetMsacProductVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMsacProductVersionResponse setBody(GetMsacProductVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMsacProductVersionResponseBody getBody() {
        return this.body;
    }

}
