// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RetryInstallProbeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryInstallProbeResponseBody body;

    public static RetryInstallProbeResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryInstallProbeResponse self = new RetryInstallProbeResponse();
        return TeaModel.build(map, self);
    }

    public RetryInstallProbeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryInstallProbeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryInstallProbeResponse setBody(RetryInstallProbeResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryInstallProbeResponseBody getBody() {
        return this.body;
    }

}
