// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVpdsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVpdsResponseBody body;

    public static ListVpdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpdsResponse self = new ListVpdsResponse();
        return TeaModel.build(map, self);
    }

    public ListVpdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVpdsResponse setBody(ListVpdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpdsResponseBody getBody() {
        return this.body;
    }

}
