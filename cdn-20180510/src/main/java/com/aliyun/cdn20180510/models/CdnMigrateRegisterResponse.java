// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CdnMigrateRegisterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CdnMigrateRegisterResponseBody body;

    public static CdnMigrateRegisterResponse build(java.util.Map<String, ?> map) throws Exception {
        CdnMigrateRegisterResponse self = new CdnMigrateRegisterResponse();
        return TeaModel.build(map, self);
    }

    public CdnMigrateRegisterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CdnMigrateRegisterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CdnMigrateRegisterResponse setBody(CdnMigrateRegisterResponseBody body) {
        this.body = body;
        return this;
    }
    public CdnMigrateRegisterResponseBody getBody() {
        return this.body;
    }

}
