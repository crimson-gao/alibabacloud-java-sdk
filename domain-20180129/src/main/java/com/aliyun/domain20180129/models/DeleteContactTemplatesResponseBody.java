// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DeleteContactTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4D73432C-7600-4779-ACBB-C3B5CA145D32</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteContactTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactTemplatesResponseBody self = new DeleteContactTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteContactTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
