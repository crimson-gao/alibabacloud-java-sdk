// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class GetLabTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLabTokenResponseBody body;

    public static GetLabTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLabTokenResponse self = new GetLabTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetLabTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLabTokenResponse setBody(GetLabTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLabTokenResponseBody getBody() {
        return this.body;
    }

}
