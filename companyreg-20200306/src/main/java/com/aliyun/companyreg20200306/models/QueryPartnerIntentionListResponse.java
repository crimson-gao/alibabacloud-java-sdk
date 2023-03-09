// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryPartnerIntentionListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPartnerIntentionListResponseBody body;

    public static QueryPartnerIntentionListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPartnerIntentionListResponse self = new QueryPartnerIntentionListResponse();
        return TeaModel.build(map, self);
    }

    public QueryPartnerIntentionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPartnerIntentionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPartnerIntentionListResponse setBody(QueryPartnerIntentionListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPartnerIntentionListResponseBody getBody() {
        return this.body;
    }

}