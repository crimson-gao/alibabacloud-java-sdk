// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateMpaasAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMpaasAppInfoResponseBody body;

    public static UpdateMpaasAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMpaasAppInfoResponse self = new UpdateMpaasAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMpaasAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMpaasAppInfoResponse setBody(UpdateMpaasAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMpaasAppInfoResponseBody getBody() {
        return this.body;
    }

}
