// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateNodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>99EBE7CF-69C0-5089-BE3E-79563C31XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeResponseBody self = new UpdateNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
