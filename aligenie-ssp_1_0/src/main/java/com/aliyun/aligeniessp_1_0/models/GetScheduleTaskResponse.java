// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetScheduleTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScheduleTaskResponseBody body;

    public static GetScheduleTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleTaskResponse self = new GetScheduleTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetScheduleTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScheduleTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScheduleTaskResponse setBody(GetScheduleTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScheduleTaskResponseBody getBody() {
        return this.body;
    }

}
