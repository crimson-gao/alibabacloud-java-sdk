// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainOriginBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainOriginBpsDataResponseBody body;

    public static DescribeDcdnDomainOriginBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainOriginBpsDataResponse self = new DescribeDcdnDomainOriginBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainOriginBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainOriginBpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainOriginBpsDataResponse setBody(DescribeDcdnDomainOriginBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainOriginBpsDataResponseBody getBody() {
        return this.body;
    }

}
