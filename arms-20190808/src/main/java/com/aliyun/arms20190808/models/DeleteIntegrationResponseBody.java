// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteIntegrationResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIntegrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntegrationResponseBody self = new DeleteIntegrationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIntegrationResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteIntegrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
