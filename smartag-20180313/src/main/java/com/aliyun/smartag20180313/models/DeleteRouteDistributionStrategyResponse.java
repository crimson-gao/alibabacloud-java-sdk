// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteRouteDistributionStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRouteDistributionStrategyResponseBody body;

    public static DeleteRouteDistributionStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteDistributionStrategyResponse self = new DeleteRouteDistributionStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRouteDistributionStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRouteDistributionStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRouteDistributionStrategyResponse setBody(DeleteRouteDistributionStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRouteDistributionStrategyResponseBody getBody() {
        return this.body;
    }

}
