// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMsacAppByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsacAppByIdResponseBody body;

    public static DeleteMsacAppByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsacAppByIdResponse self = new DeleteMsacAppByIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsacAppByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsacAppByIdResponse setBody(DeleteMsacAppByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsacAppByIdResponseBody getBody() {
        return this.body;
    }

}
