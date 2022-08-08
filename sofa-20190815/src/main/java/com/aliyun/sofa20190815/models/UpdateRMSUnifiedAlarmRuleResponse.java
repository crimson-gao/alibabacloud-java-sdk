// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateRMSUnifiedAlarmRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRMSUnifiedAlarmRuleResponseBody body;

    public static UpdateRMSUnifiedAlarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRMSUnifiedAlarmRuleResponse self = new UpdateRMSUnifiedAlarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRMSUnifiedAlarmRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRMSUnifiedAlarmRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRMSUnifiedAlarmRuleResponse setBody(UpdateRMSUnifiedAlarmRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRMSUnifiedAlarmRuleResponseBody getBody() {
        return this.body;
    }

}
