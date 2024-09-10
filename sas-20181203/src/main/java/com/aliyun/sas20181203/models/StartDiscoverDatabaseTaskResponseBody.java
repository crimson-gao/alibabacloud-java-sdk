// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartDiscoverDatabaseTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the scan task.</p>
     * 
     * <strong>example:</strong>
     * <p>48bced6d-2aee-4fa2-9aba-b846b77b****</p>
     */
    @NameInMap("CreateMark")
    public String createMark;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F46921AF-CC55-5971-92C9-7E09E160****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartDiscoverDatabaseTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDiscoverDatabaseTaskResponseBody self = new StartDiscoverDatabaseTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDiscoverDatabaseTaskResponseBody setCreateMark(String createMark) {
        this.createMark = createMark;
        return this;
    }
    public String getCreateMark() {
        return this.createMark;
    }

    public StartDiscoverDatabaseTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
