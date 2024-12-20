// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListRobotParamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRobotParamsResponseBody body;

    public static ListRobotParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRobotParamsResponse self = new ListRobotParamsResponse();
        return TeaModel.build(map, self);
    }

    public ListRobotParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRobotParamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRobotParamsResponse setBody(ListRobotParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRobotParamsResponseBody getBody() {
        return this.body;
    }

}
