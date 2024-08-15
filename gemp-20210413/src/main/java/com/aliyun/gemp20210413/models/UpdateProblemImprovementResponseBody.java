// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemImprovementResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4361a0e1-6747-4834-96ce-0c4840fd3812</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateProblemImprovementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemImprovementResponseBody self = new UpdateProblemImprovementResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProblemImprovementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
