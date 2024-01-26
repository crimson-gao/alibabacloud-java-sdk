// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ImportAppAlertRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportAppAlertRulesResponseBody body;

    public static ImportAppAlertRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportAppAlertRulesResponse self = new ImportAppAlertRulesResponse();
        return TeaModel.build(map, self);
    }

    public ImportAppAlertRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportAppAlertRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportAppAlertRulesResponse setBody(ImportAppAlertRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportAppAlertRulesResponseBody getBody() {
        return this.body;
    }

}
