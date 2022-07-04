// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateUserTagMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUserTagMetaResponseBody body;

    public static UpdateUserTagMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserTagMetaResponse self = new UpdateUserTagMetaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserTagMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserTagMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserTagMetaResponse setBody(UpdateUserTagMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserTagMetaResponseBody getBody() {
        return this.body;
    }

}
