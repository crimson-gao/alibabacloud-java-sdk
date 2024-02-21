// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobAlertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMigrationJobAlertResponseBody body;

    public static DescribeMigrationJobAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobAlertResponse self = new DescribeMigrationJobAlertResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMigrationJobAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMigrationJobAlertResponse setBody(DescribeMigrationJobAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMigrationJobAlertResponseBody getBody() {
        return this.body;
    }

}
