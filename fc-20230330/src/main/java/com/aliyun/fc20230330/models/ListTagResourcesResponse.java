// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTagResourcesOutput body;

    public static ListTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesResponse self = new ListTagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTagResourcesResponse setBody(ListTagResourcesOutput body) {
        this.body = body;
        return this;
    }
    public ListTagResourcesOutput getBody() {
        return this.body;
    }

}
