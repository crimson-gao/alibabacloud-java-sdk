// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetTableSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TableSummary body;

    public static GetTableSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableSummaryResponse self = new GetTableSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetTableSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableSummaryResponse setBody(TableSummary body) {
        this.body = body;
        return this;
    }
    public TableSummary getBody() {
        return this.body;
    }

}
