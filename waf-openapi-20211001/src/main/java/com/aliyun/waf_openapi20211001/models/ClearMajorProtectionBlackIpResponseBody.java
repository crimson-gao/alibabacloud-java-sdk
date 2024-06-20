// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ClearMajorProtectionBlackIpResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>66A98669-CC6E-4F3E-80A6-3014697B11AE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClearMajorProtectionBlackIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearMajorProtectionBlackIpResponseBody self = new ClearMajorProtectionBlackIpResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearMajorProtectionBlackIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
