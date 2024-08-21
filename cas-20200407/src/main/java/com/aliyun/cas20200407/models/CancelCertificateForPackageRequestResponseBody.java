// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CancelCertificateForPackageRequestResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>082FAB35-6AB9-4FD5-8750-D36673548E76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelCertificateForPackageRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelCertificateForPackageRequestResponseBody self = new CancelCertificateForPackageRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelCertificateForPackageRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
