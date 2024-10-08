// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckSiteProjectNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckSiteProjectNameResponseBody body;

    public static CheckSiteProjectNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSiteProjectNameResponse self = new CheckSiteProjectNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckSiteProjectNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSiteProjectNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckSiteProjectNameResponse setBody(CheckSiteProjectNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSiteProjectNameResponseBody getBody() {
        return this.body;
    }

}
