// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainUsageDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainUsageDataResponseBody body;

    public static DescribeDcdnDomainUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainUsageDataResponse self = new DescribeDcdnDomainUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainUsageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainUsageDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainUsageDataResponse setBody(DescribeDcdnDomainUsageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainUsageDataResponseBody getBody() {
        return this.body;
    }

}
