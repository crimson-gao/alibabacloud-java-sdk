// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyDataFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDataFlowResponseBody body;

    public static ModifyDataFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataFlowResponse self = new ModifyDataFlowResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDataFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDataFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDataFlowResponse setBody(ModifyDataFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDataFlowResponseBody getBody() {
        return this.body;
    }

}
