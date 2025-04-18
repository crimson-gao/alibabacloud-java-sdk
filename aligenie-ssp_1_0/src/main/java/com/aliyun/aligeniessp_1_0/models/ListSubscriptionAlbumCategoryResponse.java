// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListSubscriptionAlbumCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSubscriptionAlbumCategoryResponseBody body;

    public static ListSubscriptionAlbumCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionAlbumCategoryResponse self = new ListSubscriptionAlbumCategoryResponse();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionAlbumCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubscriptionAlbumCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubscriptionAlbumCategoryResponse setBody(ListSubscriptionAlbumCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubscriptionAlbumCategoryResponseBody getBody() {
        return this.body;
    }

}
