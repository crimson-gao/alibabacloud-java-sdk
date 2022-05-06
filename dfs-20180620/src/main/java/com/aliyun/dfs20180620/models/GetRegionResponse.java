// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRegionResponseBody body;

    public static GetRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegionResponse self = new GetRegionResponse();
        return TeaModel.build(map, self);
    }

    public GetRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRegionResponse setBody(GetRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRegionResponseBody getBody() {
        return this.body;
    }

}
