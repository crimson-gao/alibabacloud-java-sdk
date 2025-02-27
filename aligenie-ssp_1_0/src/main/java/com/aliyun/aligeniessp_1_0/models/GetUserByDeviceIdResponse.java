// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetUserByDeviceIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserByDeviceIdResponseBody body;

    public static GetUserByDeviceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserByDeviceIdResponse self = new GetUserByDeviceIdResponse();
        return TeaModel.build(map, self);
    }

    public GetUserByDeviceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserByDeviceIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserByDeviceIdResponse setBody(GetUserByDeviceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserByDeviceIdResponseBody getBody() {
        return this.body;
    }

}
