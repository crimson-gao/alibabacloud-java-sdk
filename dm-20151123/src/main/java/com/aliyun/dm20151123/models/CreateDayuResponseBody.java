// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateDayuResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDayuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDayuResponseBody self = new CreateDayuResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDayuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
