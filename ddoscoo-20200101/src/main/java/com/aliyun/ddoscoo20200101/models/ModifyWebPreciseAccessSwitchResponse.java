// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebPreciseAccessSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWebPreciseAccessSwitchResponseBody body;

    public static ModifyWebPreciseAccessSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebPreciseAccessSwitchResponse self = new ModifyWebPreciseAccessSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebPreciseAccessSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebPreciseAccessSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebPreciseAccessSwitchResponse setBody(ModifyWebPreciseAccessSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebPreciseAccessSwitchResponseBody getBody() {
        return this.body;
    }

}
