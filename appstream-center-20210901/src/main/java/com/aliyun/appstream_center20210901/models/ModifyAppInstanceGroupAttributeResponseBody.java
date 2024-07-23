// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceGroupAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidParameter.ProductType</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>The parameter ProductType is invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAppInstanceGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppInstanceGroupAttributeResponseBody self = new ModifyAppInstanceGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppInstanceGroupAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyAppInstanceGroupAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyAppInstanceGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
