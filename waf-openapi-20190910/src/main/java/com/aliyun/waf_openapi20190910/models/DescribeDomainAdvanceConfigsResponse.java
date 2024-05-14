// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainAdvanceConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainAdvanceConfigsResponseBody body;

    public static DescribeDomainAdvanceConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAdvanceConfigsResponse self = new DescribeDomainAdvanceConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAdvanceConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainAdvanceConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainAdvanceConfigsResponse setBody(DescribeDomainAdvanceConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainAdvanceConfigsResponseBody getBody() {
        return this.body;
    }

}
