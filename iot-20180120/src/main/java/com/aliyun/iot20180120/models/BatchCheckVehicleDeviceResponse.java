// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchCheckVehicleDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchCheckVehicleDeviceResponseBody body;

    public static BatchCheckVehicleDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckVehicleDeviceResponse self = new BatchCheckVehicleDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BatchCheckVehicleDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCheckVehicleDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCheckVehicleDeviceResponse setBody(BatchCheckVehicleDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCheckVehicleDeviceResponseBody getBody() {
        return this.body;
    }

}