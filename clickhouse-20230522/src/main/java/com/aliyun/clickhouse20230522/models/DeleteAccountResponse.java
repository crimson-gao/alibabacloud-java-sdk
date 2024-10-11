// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAccountResponseBody body;

    public static DeleteAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccountResponse self = new DeleteAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAccountResponse setBody(DeleteAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccountResponseBody getBody() {
        return this.body;
    }

}
