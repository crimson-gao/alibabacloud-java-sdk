// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemListV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBizItemListV2ResponseBody body;

    public static QueryBizItemListV2Response build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemListV2Response self = new QueryBizItemListV2Response();
        return TeaModel.build(map, self);
    }

    public QueryBizItemListV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBizItemListV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBizItemListV2Response setBody(QueryBizItemListV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBizItemListV2ResponseBody getBody() {
        return this.body;
    }

}
