// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class CreateDatabaseAccessPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDatabaseAccessPointResponseBody body;

    public static CreateDatabaseAccessPointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseAccessPointResponse self = new CreateDatabaseAccessPointResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseAccessPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDatabaseAccessPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDatabaseAccessPointResponse setBody(CreateDatabaseAccessPointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatabaseAccessPointResponseBody getBody() {
        return this.body;
    }

}
