// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicSubDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OnsTopicSubDetailResponseBody body;

    public static OnsTopicSubDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicSubDetailResponse self = new OnsTopicSubDetailResponse();
        return TeaModel.build(map, self);
    }

    public OnsTopicSubDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsTopicSubDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsTopicSubDetailResponse setBody(OnsTopicSubDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsTopicSubDetailResponseBody getBody() {
        return this.body;
    }

}
