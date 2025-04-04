// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateTrainTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTrainTaskResponseBody body;

    public static CreateTrainTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrainTaskResponse self = new CreateTrainTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrainTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrainTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrainTaskResponse setBody(CreateTrainTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrainTaskResponseBody getBody() {
        return this.body;
    }

}
