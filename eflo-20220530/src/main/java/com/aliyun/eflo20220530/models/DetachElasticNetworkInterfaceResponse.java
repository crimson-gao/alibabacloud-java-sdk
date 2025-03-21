// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DetachElasticNetworkInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachElasticNetworkInterfaceResponseBody body;

    public static DetachElasticNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachElasticNetworkInterfaceResponse self = new DetachElasticNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public DetachElasticNetworkInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachElasticNetworkInterfaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachElasticNetworkInterfaceResponse setBody(DetachElasticNetworkInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachElasticNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

}
