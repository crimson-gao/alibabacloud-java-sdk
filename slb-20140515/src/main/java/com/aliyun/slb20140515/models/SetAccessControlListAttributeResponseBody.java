// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetAccessControlListAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>988CB45E-1643-48C0-87B4-928DDF77EA49</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetAccessControlListAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAccessControlListAttributeResponseBody self = new SetAccessControlListAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAccessControlListAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
