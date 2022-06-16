// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListClusterNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterNodeResponseBody body;

    public static ListClusterNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterNodeResponse self = new ListClusterNodeResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterNodeResponse setBody(ListClusterNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterNodeResponseBody getBody() {
        return this.body;
    }

}
