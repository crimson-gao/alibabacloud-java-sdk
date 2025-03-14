// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListDialogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDialogResponseBody body;

    public static ListDialogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDialogResponse self = new ListDialogResponse();
        return TeaModel.build(map, self);
    }

    public ListDialogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDialogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDialogResponse setBody(ListDialogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDialogResponseBody getBody() {
        return this.body;
    }

}
