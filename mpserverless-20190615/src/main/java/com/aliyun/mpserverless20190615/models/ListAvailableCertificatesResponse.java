// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListAvailableCertificatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAvailableCertificatesResponseBody body;

    public static ListAvailableCertificatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableCertificatesResponse self = new ListAvailableCertificatesResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableCertificatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableCertificatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvailableCertificatesResponse setBody(ListAvailableCertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableCertificatesResponseBody getBody() {
        return this.body;
    }

}
