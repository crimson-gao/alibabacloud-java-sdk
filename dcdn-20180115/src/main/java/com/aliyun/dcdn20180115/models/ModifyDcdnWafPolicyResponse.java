// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDcdnWafPolicyResponseBody body;

    public static ModifyDcdnWafPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDcdnWafPolicyResponse self = new ModifyDcdnWafPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDcdnWafPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDcdnWafPolicyResponse setBody(ModifyDcdnWafPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDcdnWafPolicyResponseBody getBody() {
        return this.body;
    }

}
