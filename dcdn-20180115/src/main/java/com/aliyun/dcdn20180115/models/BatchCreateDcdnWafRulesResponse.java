// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchCreateDcdnWafRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchCreateDcdnWafRulesResponseBody body;

    public static BatchCreateDcdnWafRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateDcdnWafRulesResponse self = new BatchCreateDcdnWafRulesResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateDcdnWafRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateDcdnWafRulesResponse setBody(BatchCreateDcdnWafRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateDcdnWafRulesResponseBody getBody() {
        return this.body;
    }

}
