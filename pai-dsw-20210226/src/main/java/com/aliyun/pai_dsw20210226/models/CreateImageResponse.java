// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class CreateImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateImageResponseBody body;

    public static CreateImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageResponse self = new CreateImageResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageResponse setBody(CreateImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageResponseBody getBody() {
        return this.body;
    }

}
