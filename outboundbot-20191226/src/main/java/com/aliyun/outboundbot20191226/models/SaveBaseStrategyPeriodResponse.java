// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveBaseStrategyPeriodResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveBaseStrategyPeriodResponseBody body;

    public static SaveBaseStrategyPeriodResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBaseStrategyPeriodResponse self = new SaveBaseStrategyPeriodResponse();
        return TeaModel.build(map, self);
    }

    public SaveBaseStrategyPeriodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBaseStrategyPeriodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveBaseStrategyPeriodResponse setBody(SaveBaseStrategyPeriodResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBaseStrategyPeriodResponseBody getBody() {
        return this.body;
    }

}
