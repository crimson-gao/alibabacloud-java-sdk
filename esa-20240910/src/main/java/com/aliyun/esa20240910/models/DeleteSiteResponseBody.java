// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteSiteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247B78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSiteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSiteResponseBody self = new DeleteSiteResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSiteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
