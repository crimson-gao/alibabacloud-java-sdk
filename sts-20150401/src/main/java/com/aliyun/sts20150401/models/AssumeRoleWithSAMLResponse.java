// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleWithSAMLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssumeRoleWithSAMLResponseBody body;

    public static AssumeRoleWithSAMLResponse build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleWithSAMLResponse self = new AssumeRoleWithSAMLResponse();
        return TeaModel.build(map, self);
    }

    public AssumeRoleWithSAMLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssumeRoleWithSAMLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssumeRoleWithSAMLResponse setBody(AssumeRoleWithSAMLResponseBody body) {
        this.body = body;
        return this;
    }
    public AssumeRoleWithSAMLResponseBody getBody() {
        return this.body;
    }

}
