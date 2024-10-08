// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteWaitingRoomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWaitingRoomResponseBody body;

    public static DeleteWaitingRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWaitingRoomResponse self = new DeleteWaitingRoomResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWaitingRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWaitingRoomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWaitingRoomResponse setBody(DeleteWaitingRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWaitingRoomResponseBody getBody() {
        return this.body;
    }

}
