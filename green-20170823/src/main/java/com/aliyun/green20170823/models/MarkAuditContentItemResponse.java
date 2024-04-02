// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class MarkAuditContentItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MarkAuditContentItemResponseBody body;

    public static MarkAuditContentItemResponse build(java.util.Map<String, ?> map) throws Exception {
        MarkAuditContentItemResponse self = new MarkAuditContentItemResponse();
        return TeaModel.build(map, self);
    }

    public MarkAuditContentItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MarkAuditContentItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MarkAuditContentItemResponse setBody(MarkAuditContentItemResponseBody body) {
        this.body = body;
        return this;
    }
    public MarkAuditContentItemResponseBody getBody() {
        return this.body;
    }

}
