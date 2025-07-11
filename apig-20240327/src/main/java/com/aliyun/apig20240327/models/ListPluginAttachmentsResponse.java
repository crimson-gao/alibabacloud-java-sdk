// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPluginAttachmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPluginAttachmentsResponseBody body;

    public static ListPluginAttachmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPluginAttachmentsResponse self = new ListPluginAttachmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListPluginAttachmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPluginAttachmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPluginAttachmentsResponse setBody(ListPluginAttachmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPluginAttachmentsResponseBody getBody() {
        return this.body;
    }

}
