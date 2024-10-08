// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafUsageOfRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWafUsageOfRulesResponseBody body;

    public static ListWafUsageOfRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWafUsageOfRulesResponse self = new ListWafUsageOfRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListWafUsageOfRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWafUsageOfRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWafUsageOfRulesResponse setBody(ListWafUsageOfRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWafUsageOfRulesResponseBody getBody() {
        return this.body;
    }

}
