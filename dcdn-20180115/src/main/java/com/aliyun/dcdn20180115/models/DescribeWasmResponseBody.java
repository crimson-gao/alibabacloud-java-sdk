// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeWasmResponseBody extends TeaModel {
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWasmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWasmResponseBody self = new DescribeWasmResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWasmResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public DescribeWasmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
