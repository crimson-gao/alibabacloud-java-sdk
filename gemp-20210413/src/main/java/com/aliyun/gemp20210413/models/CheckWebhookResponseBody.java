// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CheckWebhookResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FD200FAE-E98F-496E-BFE6-4CE61E59A2E9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CheckWebhookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckWebhookResponseBody self = new CheckWebhookResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckWebhookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
