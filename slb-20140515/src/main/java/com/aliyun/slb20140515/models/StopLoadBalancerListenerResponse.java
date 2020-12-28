// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class StopLoadBalancerListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopLoadBalancerListenerResponseBody body;

    public static StopLoadBalancerListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        StopLoadBalancerListenerResponse self = new StopLoadBalancerListenerResponse();
        return TeaModel.build(map, self);
    }

    public StopLoadBalancerListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopLoadBalancerListenerResponse setBody(StopLoadBalancerListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public StopLoadBalancerListenerResponseBody getBody() {
        return this.body;
    }

}
