// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ReindexResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Map</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static ReindexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReindexResponseBody self = new ReindexResponseBody();
        return TeaModel.build(map, self);
    }

    public ReindexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReindexResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
