// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateFileDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFileDirectoryResponseBody body;

    public static UpdateFileDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileDirectoryResponse self = new UpdateFileDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFileDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFileDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFileDirectoryResponse setBody(UpdateFileDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFileDirectoryResponseBody getBody() {
        return this.body;
    }

}
