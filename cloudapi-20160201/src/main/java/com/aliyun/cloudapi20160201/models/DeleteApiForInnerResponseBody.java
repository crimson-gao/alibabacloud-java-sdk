// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DeleteApiForInnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApiForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiForInnerResponseBody self = new DeleteApiForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApiForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
