// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RenderH5OrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenderH5OrderResponseBody body;

    public static RenderH5OrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RenderH5OrderResponse self = new RenderH5OrderResponse();
        return TeaModel.build(map, self);
    }

    public RenderH5OrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenderH5OrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenderH5OrderResponse setBody(RenderH5OrderResponseBody body) {
        this.body = body;
        return this;
    }
    public RenderH5OrderResponseBody getBody() {
        return this.body;
    }

}
