// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateHostShareKeyResponseBody extends TeaModel {
    @NameInMap("HostShareKeyId")
    public Long hostShareKeyId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHostShareKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHostShareKeyResponseBody self = new CreateHostShareKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHostShareKeyResponseBody setHostShareKeyId(Long hostShareKeyId) {
        this.hostShareKeyId = hostShareKeyId;
        return this;
    }
    public Long getHostShareKeyId() {
        return this.hostShareKeyId;
    }

    public CreateHostShareKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
