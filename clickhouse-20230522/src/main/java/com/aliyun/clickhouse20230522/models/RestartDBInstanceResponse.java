// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class RestartDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartDBInstanceResponseBody body;

    public static RestartDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartDBInstanceResponse self = new RestartDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RestartDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartDBInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartDBInstanceResponse setBody(RestartDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartDBInstanceResponseBody getBody() {
        return this.body;
    }

}
