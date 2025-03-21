// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ModifyElasticBandWidthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyElasticBandWidthResponseBody body;

    public static ModifyElasticBandWidthResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticBandWidthResponse self = new ModifyElasticBandWidthResponse();
        return TeaModel.build(map, self);
    }

    public ModifyElasticBandWidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyElasticBandWidthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyElasticBandWidthResponse setBody(ModifyElasticBandWidthResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyElasticBandWidthResponseBody getBody() {
        return this.body;
    }

}
