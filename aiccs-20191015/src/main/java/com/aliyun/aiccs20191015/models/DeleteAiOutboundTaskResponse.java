// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteAiOutboundTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAiOutboundTaskResponseBody body;

    public static DeleteAiOutboundTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAiOutboundTaskResponse self = new DeleteAiOutboundTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAiOutboundTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAiOutboundTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAiOutboundTaskResponse setBody(DeleteAiOutboundTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAiOutboundTaskResponseBody getBody() {
        return this.body;
    }

}
