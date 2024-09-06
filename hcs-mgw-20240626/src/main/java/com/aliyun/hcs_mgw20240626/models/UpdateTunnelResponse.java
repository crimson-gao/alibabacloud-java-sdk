// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class UpdateTunnelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    public static UpdateTunnelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTunnelResponse self = new UpdateTunnelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTunnelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTunnelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
