// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetVersionLabelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDatasetVersionLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetVersionLabelsResponseBody self = new CreateDatasetVersionLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatasetVersionLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
