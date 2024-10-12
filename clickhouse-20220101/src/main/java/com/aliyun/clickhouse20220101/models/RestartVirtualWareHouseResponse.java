// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class RestartVirtualWareHouseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartVirtualWareHouseResponseBody body;

    public static RestartVirtualWareHouseResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartVirtualWareHouseResponse self = new RestartVirtualWareHouseResponse();
        return TeaModel.build(map, self);
    }

    public RestartVirtualWareHouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartVirtualWareHouseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartVirtualWareHouseResponse setBody(RestartVirtualWareHouseResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartVirtualWareHouseResponseBody getBody() {
        return this.body;
    }

}
