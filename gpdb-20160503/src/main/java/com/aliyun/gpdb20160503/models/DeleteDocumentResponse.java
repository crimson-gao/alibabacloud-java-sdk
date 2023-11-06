// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteDocumentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDocumentResponseBody body;

    public static DeleteDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocumentResponse self = new DeleteDocumentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDocumentResponse setBody(DeleteDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDocumentResponseBody getBody() {
        return this.body;
    }

}
