// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchImageByNameResponseBody body;

    public static SearchImageByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByNameResponse self = new SearchImageByNameResponse();
        return TeaModel.build(map, self);
    }

    public SearchImageByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchImageByNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchImageByNameResponse setBody(SearchImageByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchImageByNameResponseBody getBody() {
        return this.body;
    }

}
