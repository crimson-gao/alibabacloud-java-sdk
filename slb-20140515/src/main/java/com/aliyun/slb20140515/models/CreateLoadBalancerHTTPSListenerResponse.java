// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerHTTPSListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLoadBalancerHTTPSListenerResponseBody body;

    public static CreateLoadBalancerHTTPSListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerHTTPSListenerResponse self = new CreateLoadBalancerHTTPSListenerResponse();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerHTTPSListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLoadBalancerHTTPSListenerResponse setBody(CreateLoadBalancerHTTPSListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLoadBalancerHTTPSListenerResponseBody getBody() {
        return this.body;
    }

}
