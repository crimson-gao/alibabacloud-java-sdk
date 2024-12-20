// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class SettleOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SettleOrderResponseBody body;

    public static SettleOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        SettleOrderResponse self = new SettleOrderResponse();
        return TeaModel.build(map, self);
    }

    public SettleOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SettleOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SettleOrderResponse setBody(SettleOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public SettleOrderResponseBody getBody() {
        return this.body;
    }

}
