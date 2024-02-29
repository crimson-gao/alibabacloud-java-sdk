// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceFoldersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataServiceFoldersResponseBody body;

    public static ListDataServiceFoldersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceFoldersResponse self = new ListDataServiceFoldersResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceFoldersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataServiceFoldersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataServiceFoldersResponse setBody(ListDataServiceFoldersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataServiceFoldersResponseBody getBody() {
        return this.body;
    }

}
