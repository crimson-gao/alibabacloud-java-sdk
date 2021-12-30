// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostShareKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyHostShareKeyResponseBody body;

    public static ModifyHostShareKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostShareKeyResponse self = new ModifyHostShareKeyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHostShareKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHostShareKeyResponse setBody(ModifyHostShareKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHostShareKeyResponseBody getBody() {
        return this.body;
    }

}
