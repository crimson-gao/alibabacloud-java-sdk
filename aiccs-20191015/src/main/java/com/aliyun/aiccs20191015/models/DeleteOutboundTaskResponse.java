// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteOutboundTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOutboundTaskResponseBody body;

    public static DeleteOutboundTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOutboundTaskResponse self = new DeleteOutboundTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOutboundTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOutboundTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOutboundTaskResponse setBody(DeleteOutboundTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOutboundTaskResponseBody getBody() {
        return this.body;
    }

}
