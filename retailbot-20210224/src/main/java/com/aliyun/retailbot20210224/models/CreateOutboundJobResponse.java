// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateOutboundJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOutboundJobResponseBody body;

    public static CreateOutboundJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOutboundJobResponse self = new CreateOutboundJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateOutboundJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOutboundJobResponse setBody(CreateOutboundJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOutboundJobResponseBody getBody() {
        return this.body;
    }

}
