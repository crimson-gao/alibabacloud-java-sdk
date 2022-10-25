// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class UnRelatedSlsLogStoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnRelatedSlsLogStoreResponseBody body;

    public static UnRelatedSlsLogStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        UnRelatedSlsLogStoreResponse self = new UnRelatedSlsLogStoreResponse();
        return TeaModel.build(map, self);
    }

    public UnRelatedSlsLogStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnRelatedSlsLogStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnRelatedSlsLogStoreResponse setBody(UnRelatedSlsLogStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public UnRelatedSlsLogStoreResponseBody getBody() {
        return this.body;
    }

}
