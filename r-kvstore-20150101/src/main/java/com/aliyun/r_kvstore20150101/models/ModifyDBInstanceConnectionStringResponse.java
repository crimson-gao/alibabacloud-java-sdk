// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionStringResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBInstanceConnectionStringResponseBody body;

    public static ModifyDBInstanceConnectionStringResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConnectionStringResponse self = new ModifyDBInstanceConnectionStringResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConnectionStringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBInstanceConnectionStringResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBInstanceConnectionStringResponse setBody(ModifyDBInstanceConnectionStringResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBInstanceConnectionStringResponseBody getBody() {
        return this.body;
    }

}
