// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeviceSettingResponseBody body;

    public static GetDeviceSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceSettingResponse self = new GetDeviceSettingResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceSettingResponse setBody(GetDeviceSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceSettingResponseBody getBody() {
        return this.body;
    }

}
