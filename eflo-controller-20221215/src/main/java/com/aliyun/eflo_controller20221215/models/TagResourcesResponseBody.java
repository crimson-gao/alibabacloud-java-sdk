// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class TagResourcesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7BB53E1-0B08-5C4E-BA66-9225548C3151</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesResponseBody self = new TagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public TagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
