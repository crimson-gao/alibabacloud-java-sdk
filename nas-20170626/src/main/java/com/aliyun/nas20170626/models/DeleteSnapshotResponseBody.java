// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteSnapshotResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * <p>Every response returns a unique request ID regardless of whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotResponseBody self = new DeleteSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
