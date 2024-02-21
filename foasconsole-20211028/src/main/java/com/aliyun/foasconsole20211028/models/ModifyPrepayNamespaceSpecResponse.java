// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyPrepayNamespaceSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPrepayNamespaceSpecResponseBody body;

    public static ModifyPrepayNamespaceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayNamespaceSpecResponse self = new ModifyPrepayNamespaceSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayNamespaceSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPrepayNamespaceSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPrepayNamespaceSpecResponse setBody(ModifyPrepayNamespaceSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPrepayNamespaceSpecResponseBody getBody() {
        return this.body;
    }

}
