// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListScheduledSQLsRequest extends TeaModel {
    @NameInMap("logstore")
    public String logstore;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Long offset;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("size")
    public Long size;

    public static ListScheduledSQLsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledSQLsRequest self = new ListScheduledSQLsRequest();
        return TeaModel.build(map, self);
    }

    public ListScheduledSQLsRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ListScheduledSQLsRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public ListScheduledSQLsRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
