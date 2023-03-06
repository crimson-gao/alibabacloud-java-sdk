// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallSystemPluginRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    /**
     * <p>A unique token generated by the client to guarantee the idempotency of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static InstallSystemPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallSystemPluginRequest self = new InstallSystemPluginRequest();
        return TeaModel.build(map, self);
    }

    public InstallSystemPluginRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public InstallSystemPluginRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
