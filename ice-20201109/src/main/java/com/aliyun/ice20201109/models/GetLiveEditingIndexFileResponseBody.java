// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveEditingIndexFileResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IndexFile")
    public String indexFile;

    public static GetLiveEditingIndexFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveEditingIndexFileResponseBody self = new GetLiveEditingIndexFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveEditingIndexFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLiveEditingIndexFileResponseBody setIndexFile(String indexFile) {
        this.indexFile = indexFile;
        return this;
    }
    public String getIndexFile() {
        return this.indexFile;
    }

}
