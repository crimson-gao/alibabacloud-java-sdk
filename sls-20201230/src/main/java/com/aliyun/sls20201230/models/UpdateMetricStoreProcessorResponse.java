// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateMetricStoreProcessorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    public static UpdateMetricStoreProcessorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetricStoreProcessorResponse self = new UpdateMetricStoreProcessorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMetricStoreProcessorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMetricStoreProcessorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
