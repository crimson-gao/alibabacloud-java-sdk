// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StopSessionClusterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>w-******</p>
     */
    @NameInMap("sessionClusterId")
    public String sessionClusterId;

    public static StopSessionClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopSessionClusterResponseBody self = new StopSessionClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public StopSessionClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopSessionClusterResponseBody setSessionClusterId(String sessionClusterId) {
        this.sessionClusterId = sessionClusterId;
        return this;
    }
    public String getSessionClusterId() {
        return this.sessionClusterId;
    }

}
