// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceTwoFactorResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceTwoFactorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTwoFactorResponseBody self = new ModifyInstanceTwoFactorResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTwoFactorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
