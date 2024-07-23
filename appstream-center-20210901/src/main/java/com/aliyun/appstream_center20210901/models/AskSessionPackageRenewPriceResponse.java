// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AskSessionPackageRenewPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AskSessionPackageRenewPriceResponseBody body;

    public static AskSessionPackageRenewPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        AskSessionPackageRenewPriceResponse self = new AskSessionPackageRenewPriceResponse();
        return TeaModel.build(map, self);
    }

    public AskSessionPackageRenewPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AskSessionPackageRenewPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AskSessionPackageRenewPriceResponse setBody(AskSessionPackageRenewPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public AskSessionPackageRenewPriceResponseBody getBody() {
        return this.body;
    }

}
