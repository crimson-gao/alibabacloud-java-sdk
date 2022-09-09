// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteScalingRuleResponseBody body;

    public static DeleteScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScalingRuleResponse self = new DeleteScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScalingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScalingRuleResponse setBody(DeleteScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScalingRuleResponseBody getBody() {
        return this.body;
    }

}
