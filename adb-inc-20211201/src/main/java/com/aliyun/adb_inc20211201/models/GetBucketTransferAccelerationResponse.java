// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class GetBucketTransferAccelerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBucketTransferAccelerationResponseBody body;

    public static GetBucketTransferAccelerationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketTransferAccelerationResponse self = new GetBucketTransferAccelerationResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketTransferAccelerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketTransferAccelerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBucketTransferAccelerationResponse setBody(GetBucketTransferAccelerationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketTransferAccelerationResponseBody getBody() {
        return this.body;
    }

}
