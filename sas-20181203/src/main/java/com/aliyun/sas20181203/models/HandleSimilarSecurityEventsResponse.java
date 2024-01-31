// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSimilarSecurityEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HandleSimilarSecurityEventsResponseBody body;

    public static HandleSimilarSecurityEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        HandleSimilarSecurityEventsResponse self = new HandleSimilarSecurityEventsResponse();
        return TeaModel.build(map, self);
    }

    public HandleSimilarSecurityEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HandleSimilarSecurityEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HandleSimilarSecurityEventsResponse setBody(HandleSimilarSecurityEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public HandleSimilarSecurityEventsResponseBody getBody() {
        return this.body;
    }

}
