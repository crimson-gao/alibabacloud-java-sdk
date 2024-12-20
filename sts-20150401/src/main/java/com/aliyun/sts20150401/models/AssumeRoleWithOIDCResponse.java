// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleWithOIDCResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssumeRoleWithOIDCResponseBody body;

    public static AssumeRoleWithOIDCResponse build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleWithOIDCResponse self = new AssumeRoleWithOIDCResponse();
        return TeaModel.build(map, self);
    }

    public AssumeRoleWithOIDCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssumeRoleWithOIDCResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssumeRoleWithOIDCResponse setBody(AssumeRoleWithOIDCResponseBody body) {
        this.body = body;
        return this;
    }
    public AssumeRoleWithOIDCResponseBody getBody() {
        return this.body;
    }

}
