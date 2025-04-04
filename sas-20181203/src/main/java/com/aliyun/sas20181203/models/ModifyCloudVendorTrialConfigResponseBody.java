// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCloudVendorTrialConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of this call request, a unique identifier generated by Alibaba Cloud for the request, which can be used to troubleshoot and pinpoint issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D65AADFC-1D20-5A6A-8F6A-9FA53C0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCloudVendorTrialConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudVendorTrialConfigResponseBody self = new ModifyCloudVendorTrialConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCloudVendorTrialConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
