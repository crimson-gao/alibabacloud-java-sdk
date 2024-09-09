// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetConsumerGroupSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConsumerGroupSubscriptionResponseBody body;

    public static GetConsumerGroupSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerGroupSubscriptionResponse self = new GetConsumerGroupSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public GetConsumerGroupSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConsumerGroupSubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConsumerGroupSubscriptionResponse setBody(GetConsumerGroupSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConsumerGroupSubscriptionResponseBody getBody() {
        return this.body;
    }

}
