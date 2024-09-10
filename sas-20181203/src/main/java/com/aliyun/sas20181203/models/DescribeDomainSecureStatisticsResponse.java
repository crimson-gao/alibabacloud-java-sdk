// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainSecureStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainSecureStatisticsResponseBody body;

    public static DescribeDomainSecureStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecureStatisticsResponse self = new DescribeDomainSecureStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecureStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainSecureStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainSecureStatisticsResponse setBody(DescribeDomainSecureStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainSecureStatisticsResponseBody getBody() {
        return this.body;
    }

}
