// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateAliasResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1d2baaf3-d357-46c2-832e-13560c2bd9cd</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAliasResponseBody self = new CreateAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
