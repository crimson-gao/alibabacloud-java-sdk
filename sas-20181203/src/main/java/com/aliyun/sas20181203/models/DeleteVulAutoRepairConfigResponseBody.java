// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteVulAutoRepairConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVulAutoRepairConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVulAutoRepairConfigResponseBody self = new DeleteVulAutoRepairConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVulAutoRepairConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
