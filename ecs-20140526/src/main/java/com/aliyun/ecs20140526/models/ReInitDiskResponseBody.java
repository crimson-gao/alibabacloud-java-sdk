// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReInitDiskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReInitDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReInitDiskResponseBody self = new ReInitDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public ReInitDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
