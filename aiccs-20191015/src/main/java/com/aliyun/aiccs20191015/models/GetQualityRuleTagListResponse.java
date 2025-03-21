// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityRuleTagListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityRuleTagListResponseBody body;

    public static GetQualityRuleTagListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleTagListResponse self = new GetQualityRuleTagListResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleTagListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityRuleTagListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityRuleTagListResponse setBody(GetQualityRuleTagListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityRuleTagListResponseBody getBody() {
        return this.body;
    }

}
