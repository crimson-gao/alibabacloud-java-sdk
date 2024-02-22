// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAccountsByLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAccountsByLogResponseBody body;

    public static ListAccountsByLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsByLogResponse self = new ListAccountsByLogResponse();
        return TeaModel.build(map, self);
    }

    public ListAccountsByLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccountsByLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccountsByLogResponse setBody(ListAccountsByLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccountsByLogResponseBody getBody() {
        return this.body;
    }

}
