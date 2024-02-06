// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMcubeNebulaTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMcubeNebulaTaskDetailResponseBody body;

    public static GetMcubeNebulaTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMcubeNebulaTaskDetailResponse self = new GetMcubeNebulaTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetMcubeNebulaTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMcubeNebulaTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMcubeNebulaTaskDetailResponse setBody(GetMcubeNebulaTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMcubeNebulaTaskDetailResponseBody getBody() {
        return this.body;
    }

}
