// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPolicyValidDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnWafPolicyValidDomainsResponseBody body;

    public static DescribeDcdnWafPolicyValidDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafPolicyValidDomainsResponse self = new DescribeDcdnWafPolicyValidDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafPolicyValidDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafPolicyValidDomainsResponse setBody(DescribeDcdnWafPolicyValidDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafPolicyValidDomainsResponseBody getBody() {
        return this.body;
    }

}
