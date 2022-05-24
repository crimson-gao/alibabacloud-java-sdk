// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteAcceleratorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAcceleratorResponseBody body;

    public static DeleteAcceleratorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAcceleratorResponse self = new DeleteAcceleratorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAcceleratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAcceleratorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAcceleratorResponse setBody(DeleteAcceleratorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAcceleratorResponseBody getBody() {
        return this.body;
    }

}
