// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteRemediationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRemediationsResponseBody body;

    public static DeleteRemediationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRemediationsResponse self = new DeleteRemediationsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRemediationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRemediationsResponse setBody(DeleteRemediationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRemediationsResponseBody getBody() {
        return this.body;
    }

}
