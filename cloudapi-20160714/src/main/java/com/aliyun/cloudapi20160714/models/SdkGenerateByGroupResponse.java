// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SdkGenerateByGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SdkGenerateByGroupResponseBody body;

    public static SdkGenerateByGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        SdkGenerateByGroupResponse self = new SdkGenerateByGroupResponse();
        return TeaModel.build(map, self);
    }

    public SdkGenerateByGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SdkGenerateByGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SdkGenerateByGroupResponse setBody(SdkGenerateByGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SdkGenerateByGroupResponseBody getBody() {
        return this.body;
    }

}
