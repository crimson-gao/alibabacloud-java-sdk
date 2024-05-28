// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ReplaceCloudGtmAddressPoolAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReplaceCloudGtmAddressPoolAddressResponseBody body;

    public static ReplaceCloudGtmAddressPoolAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceCloudGtmAddressPoolAddressResponse self = new ReplaceCloudGtmAddressPoolAddressResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceCloudGtmAddressPoolAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceCloudGtmAddressPoolAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceCloudGtmAddressPoolAddressResponse setBody(ReplaceCloudGtmAddressPoolAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceCloudGtmAddressPoolAddressResponseBody getBody() {
        return this.body;
    }

}
