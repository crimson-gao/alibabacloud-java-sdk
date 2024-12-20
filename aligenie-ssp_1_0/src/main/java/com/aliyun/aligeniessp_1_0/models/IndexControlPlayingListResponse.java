// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class IndexControlPlayingListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IndexControlPlayingListResponseBody body;

    public static IndexControlPlayingListResponse build(java.util.Map<String, ?> map) throws Exception {
        IndexControlPlayingListResponse self = new IndexControlPlayingListResponse();
        return TeaModel.build(map, self);
    }

    public IndexControlPlayingListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IndexControlPlayingListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IndexControlPlayingListResponse setBody(IndexControlPlayingListResponseBody body) {
        this.body = body;
        return this;
    }
    public IndexControlPlayingListResponseBody getBody() {
        return this.body;
    }

}
