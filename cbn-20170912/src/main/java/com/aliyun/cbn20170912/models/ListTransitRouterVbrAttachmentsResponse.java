// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterVbrAttachmentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTransitRouterVbrAttachmentsResponseBody body;

    public static ListTransitRouterVbrAttachmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterVbrAttachmentsResponse self = new ListTransitRouterVbrAttachmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterVbrAttachmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterVbrAttachmentsResponse setBody(ListTransitRouterVbrAttachmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterVbrAttachmentsResponseBody getBody() {
        return this.body;
    }

}
