// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateCatalogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCatalogResponseBody body;

    public static CreateCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCatalogResponse self = new CreateCatalogResponse();
        return TeaModel.build(map, self);
    }

    public CreateCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCatalogResponse setBody(CreateCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCatalogResponseBody getBody() {
        return this.body;
    }

}
