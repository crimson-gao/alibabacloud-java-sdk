// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateDevicePurifyPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDevicePurifyPlanResponseBody body;

    public static CreateDevicePurifyPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDevicePurifyPlanResponse self = new CreateDevicePurifyPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateDevicePurifyPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDevicePurifyPlanResponse setBody(CreateDevicePurifyPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDevicePurifyPlanResponseBody getBody() {
        return this.body;
    }

}
