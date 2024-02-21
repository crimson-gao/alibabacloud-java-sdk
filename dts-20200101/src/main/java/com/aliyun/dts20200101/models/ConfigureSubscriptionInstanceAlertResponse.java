// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSubscriptionInstanceAlertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigureSubscriptionInstanceAlertResponseBody body;

    public static ConfigureSubscriptionInstanceAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSubscriptionInstanceAlertResponse self = new ConfigureSubscriptionInstanceAlertResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureSubscriptionInstanceAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureSubscriptionInstanceAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigureSubscriptionInstanceAlertResponse setBody(ConfigureSubscriptionInstanceAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureSubscriptionInstanceAlertResponseBody getBody() {
        return this.body;
    }

}
