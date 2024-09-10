// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarStrategyTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSoarStrategyTaskDetailResponseBody body;

    public static DescribeSoarStrategyTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarStrategyTaskDetailResponse self = new DescribeSoarStrategyTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSoarStrategyTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSoarStrategyTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSoarStrategyTaskDetailResponse setBody(DescribeSoarStrategyTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSoarStrategyTaskDetailResponseBody getBody() {
        return this.body;
    }

}
