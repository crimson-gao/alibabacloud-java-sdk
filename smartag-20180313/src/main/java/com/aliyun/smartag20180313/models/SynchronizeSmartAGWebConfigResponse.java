// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class SynchronizeSmartAGWebConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SynchronizeSmartAGWebConfigResponseBody body;

    public static SynchronizeSmartAGWebConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeSmartAGWebConfigResponse self = new SynchronizeSmartAGWebConfigResponse();
        return TeaModel.build(map, self);
    }

    public SynchronizeSmartAGWebConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SynchronizeSmartAGWebConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SynchronizeSmartAGWebConfigResponse setBody(SynchronizeSmartAGWebConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SynchronizeSmartAGWebConfigResponseBody getBody() {
        return this.body;
    }

}
