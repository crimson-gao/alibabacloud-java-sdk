// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InstallCmsExporterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InstallCmsExporterResponseBody body;

    public static InstallCmsExporterResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallCmsExporterResponse self = new InstallCmsExporterResponse();
        return TeaModel.build(map, self);
    }

    public InstallCmsExporterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallCmsExporterResponse setBody(InstallCmsExporterResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallCmsExporterResponseBody getBody() {
        return this.body;
    }

}
