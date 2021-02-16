// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDBClusterResponseBody body;

    public static DeleteDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBClusterResponse self = new DeleteDBClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBClusterResponse setBody(DeleteDBClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBClusterResponseBody getBody() {
        return this.body;
    }

}
