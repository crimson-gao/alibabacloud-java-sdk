// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ReleaseAliyunCommodityInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseAliyunCommodityInstanceResponseBody body;

    public static ReleaseAliyunCommodityInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAliyunCommodityInstanceResponse self = new ReleaseAliyunCommodityInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseAliyunCommodityInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseAliyunCommodityInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseAliyunCommodityInstanceResponse setBody(ReleaseAliyunCommodityInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseAliyunCommodityInstanceResponseBody getBody() {
        return this.body;
    }

}
