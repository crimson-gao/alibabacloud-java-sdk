// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceCountsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDiscoveredResourceCountsResponseBody body;

    public static GetDiscoveredResourceCountsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceCountsResponse self = new GetDiscoveredResourceCountsResponse();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceCountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDiscoveredResourceCountsResponse setBody(GetDiscoveredResourceCountsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiscoveredResourceCountsResponseBody getBody() {
        return this.body;
    }

}
