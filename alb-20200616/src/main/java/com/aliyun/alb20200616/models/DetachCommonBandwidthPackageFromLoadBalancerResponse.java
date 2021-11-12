// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DetachCommonBandwidthPackageFromLoadBalancerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachCommonBandwidthPackageFromLoadBalancerResponseBody body;

    public static DetachCommonBandwidthPackageFromLoadBalancerResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachCommonBandwidthPackageFromLoadBalancerResponse self = new DetachCommonBandwidthPackageFromLoadBalancerResponse();
        return TeaModel.build(map, self);
    }

    public DetachCommonBandwidthPackageFromLoadBalancerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachCommonBandwidthPackageFromLoadBalancerResponse setBody(DetachCommonBandwidthPackageFromLoadBalancerResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachCommonBandwidthPackageFromLoadBalancerResponseBody getBody() {
        return this.body;
    }

}
