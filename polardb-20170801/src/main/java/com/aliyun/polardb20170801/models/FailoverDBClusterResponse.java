// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class FailoverDBClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FailoverDBClusterResponseBody body;

    public static FailoverDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        FailoverDBClusterResponse self = new FailoverDBClusterResponse();
        return TeaModel.build(map, self);
    }

    public FailoverDBClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FailoverDBClusterResponse setBody(FailoverDBClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public FailoverDBClusterResponseBody getBody() {
        return this.body;
    }

}
