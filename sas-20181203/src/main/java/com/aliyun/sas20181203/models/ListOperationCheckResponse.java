// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOperationCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOperationCheckResponseBody body;

    public static ListOperationCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperationCheckResponse self = new ListOperationCheckResponse();
        return TeaModel.build(map, self);
    }

    public ListOperationCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOperationCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOperationCheckResponse setBody(ListOperationCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOperationCheckResponseBody getBody() {
        return this.body;
    }

}
