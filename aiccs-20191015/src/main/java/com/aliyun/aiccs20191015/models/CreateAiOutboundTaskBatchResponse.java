// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAiOutboundTaskBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAiOutboundTaskBatchResponseBody body;

    public static CreateAiOutboundTaskBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAiOutboundTaskBatchResponse self = new CreateAiOutboundTaskBatchResponse();
        return TeaModel.build(map, self);
    }

    public CreateAiOutboundTaskBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAiOutboundTaskBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAiOutboundTaskBatchResponse setBody(CreateAiOutboundTaskBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAiOutboundTaskBatchResponseBody getBody() {
        return this.body;
    }

}
