// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListEnvironmentTunnelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvironmentTunnelsResponseBody body;

    public static ListEnvironmentTunnelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentTunnelsResponse self = new ListEnvironmentTunnelsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentTunnelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentTunnelsResponse setBody(ListEnvironmentTunnelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentTunnelsResponseBody getBody() {
        return this.body;
    }

}
