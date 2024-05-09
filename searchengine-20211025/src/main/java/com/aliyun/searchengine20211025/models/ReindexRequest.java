// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ReindexRequest extends TeaModel {
    @NameInMap("dataTimeSec")
    public Integer dataTimeSec;

    @NameInMap("ossDataPath")
    public String ossDataPath;

    @NameInMap("partition")
    public String partition;

    public static ReindexRequest build(java.util.Map<String, ?> map) throws Exception {
        ReindexRequest self = new ReindexRequest();
        return TeaModel.build(map, self);
    }

    public ReindexRequest setDataTimeSec(Integer dataTimeSec) {
        this.dataTimeSec = dataTimeSec;
        return this;
    }
    public Integer getDataTimeSec() {
        return this.dataTimeSec;
    }

    public ReindexRequest setOssDataPath(String ossDataPath) {
        this.ossDataPath = ossDataPath;
        return this;
    }
    public String getOssDataPath() {
        return this.ossDataPath;
    }

    public ReindexRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

}
