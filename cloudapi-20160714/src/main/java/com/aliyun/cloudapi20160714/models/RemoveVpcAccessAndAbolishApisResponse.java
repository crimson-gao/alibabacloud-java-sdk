// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveVpcAccessAndAbolishApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveVpcAccessAndAbolishApisResponseBody body;

    public static RemoveVpcAccessAndAbolishApisResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveVpcAccessAndAbolishApisResponse self = new RemoveVpcAccessAndAbolishApisResponse();
        return TeaModel.build(map, self);
    }

    public RemoveVpcAccessAndAbolishApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveVpcAccessAndAbolishApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveVpcAccessAndAbolishApisResponse setBody(RemoveVpcAccessAndAbolishApisResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveVpcAccessAndAbolishApisResponseBody getBody() {
        return this.body;
    }

}
