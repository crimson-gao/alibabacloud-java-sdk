// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAnsServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAnsServicesResponseBody body;

    public static ListAnsServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAnsServicesResponse self = new ListAnsServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListAnsServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAnsServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAnsServicesResponse setBody(ListAnsServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAnsServicesResponseBody getBody() {
        return this.body;
    }

}
