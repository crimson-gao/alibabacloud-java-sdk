// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyTagGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTagGroupsResponseBody body;

    public static ModifyTagGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagGroupsResponse self = new ModifyTagGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTagGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTagGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTagGroupsResponse setBody(ModifyTagGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTagGroupsResponseBody getBody() {
        return this.body;
    }

}
