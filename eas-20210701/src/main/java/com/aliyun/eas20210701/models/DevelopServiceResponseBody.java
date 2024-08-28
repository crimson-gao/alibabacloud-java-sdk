// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DevelopServiceResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DevelopServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DevelopServiceResponseBody self = new DevelopServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DevelopServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DevelopServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
