// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefundOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefundOrderResponseBody body;

    public static RefundOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundOrderResponse self = new RefundOrderResponse();
        return TeaModel.build(map, self);
    }

    public RefundOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefundOrderResponse setBody(RefundOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundOrderResponseBody getBody() {
        return this.body;
    }

}
