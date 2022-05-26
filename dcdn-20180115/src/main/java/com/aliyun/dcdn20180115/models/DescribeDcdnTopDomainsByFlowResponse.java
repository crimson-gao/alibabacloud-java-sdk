// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnTopDomainsByFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnTopDomainsByFlowResponseBody body;

    public static DescribeDcdnTopDomainsByFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnTopDomainsByFlowResponse self = new DescribeDcdnTopDomainsByFlowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnTopDomainsByFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnTopDomainsByFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnTopDomainsByFlowResponse setBody(DescribeDcdnTopDomainsByFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnTopDomainsByFlowResponseBody getBody() {
        return this.body;
    }

}
