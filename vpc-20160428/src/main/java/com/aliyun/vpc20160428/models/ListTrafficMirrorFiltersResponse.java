// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTrafficMirrorFiltersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTrafficMirrorFiltersResponseBody body;

    public static ListTrafficMirrorFiltersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficMirrorFiltersResponse self = new ListTrafficMirrorFiltersResponse();
        return TeaModel.build(map, self);
    }

    public ListTrafficMirrorFiltersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrafficMirrorFiltersResponse setBody(ListTrafficMirrorFiltersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrafficMirrorFiltersResponseBody getBody() {
        return this.body;
    }

}
