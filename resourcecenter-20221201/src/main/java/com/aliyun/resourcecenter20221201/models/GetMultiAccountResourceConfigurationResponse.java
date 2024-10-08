// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetMultiAccountResourceConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMultiAccountResourceConfigurationResponseBody body;

    public static GetMultiAccountResourceConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultiAccountResourceConfigurationResponse self = new GetMultiAccountResourceConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetMultiAccountResourceConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultiAccountResourceConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMultiAccountResourceConfigurationResponse setBody(GetMultiAccountResourceConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultiAccountResourceConfigurationResponseBody getBody() {
        return this.body;
    }

}
