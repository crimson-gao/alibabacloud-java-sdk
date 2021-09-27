// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GenerateProductInstanceDeploymentConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateProductInstanceDeploymentConfigResponseBody body;

    public static GenerateProductInstanceDeploymentConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateProductInstanceDeploymentConfigResponse self = new GenerateProductInstanceDeploymentConfigResponse();
        return TeaModel.build(map, self);
    }

    public GenerateProductInstanceDeploymentConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateProductInstanceDeploymentConfigResponse setBody(GenerateProductInstanceDeploymentConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateProductInstanceDeploymentConfigResponseBody getBody() {
        return this.body;
    }

}
