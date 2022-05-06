// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGraySevenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HuichengTestGraySevenResponseBody body;

    public static HuichengTestGraySevenResponse build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGraySevenResponse self = new HuichengTestGraySevenResponse();
        return TeaModel.build(map, self);
    }

    public HuichengTestGraySevenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HuichengTestGraySevenResponse setBody(HuichengTestGraySevenResponseBody body) {
        this.body = body;
        return this;
    }
    public HuichengTestGraySevenResponseBody getBody() {
        return this.body;
    }

}
