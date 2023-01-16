// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListIspTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListIspTypesResponseBody body;

    public static ListIspTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIspTypesResponse self = new ListIspTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListIspTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIspTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIspTypesResponse setBody(ListIspTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIspTypesResponseBody getBody() {
        return this.body;
    }

}