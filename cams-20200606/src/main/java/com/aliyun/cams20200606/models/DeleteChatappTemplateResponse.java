// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteChatappTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteChatappTemplateResponseBody body;

    public static DeleteChatappTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatappTemplateResponse self = new DeleteChatappTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChatappTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChatappTemplateResponse setBody(DeleteChatappTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChatappTemplateResponseBody getBody() {
        return this.body;
    }

}
