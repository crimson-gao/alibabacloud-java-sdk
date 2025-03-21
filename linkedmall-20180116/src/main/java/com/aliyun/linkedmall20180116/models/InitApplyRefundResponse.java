// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class InitApplyRefundResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitApplyRefundResponseBody body;

    public static InitApplyRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        InitApplyRefundResponse self = new InitApplyRefundResponse();
        return TeaModel.build(map, self);
    }

    public InitApplyRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitApplyRefundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitApplyRefundResponse setBody(InitApplyRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public InitApplyRefundResponseBody getBody() {
        return this.body;
    }

}
