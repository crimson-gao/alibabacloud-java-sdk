// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListSearchSourceCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSearchSourceCodeResponseBody body;

    public static ListSearchSourceCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSearchSourceCodeResponse self = new ListSearchSourceCodeResponse();
        return TeaModel.build(map, self);
    }

    public ListSearchSourceCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSearchSourceCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSearchSourceCodeResponse setBody(ListSearchSourceCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSearchSourceCodeResponseBody getBody() {
        return this.body;
    }

}
