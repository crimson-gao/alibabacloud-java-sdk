// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchCreateRecordsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordList")
    public String recordListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static BatchCreateRecordsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateRecordsShrinkRequest self = new BatchCreateRecordsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateRecordsShrinkRequest setRecordListShrink(String recordListShrink) {
        this.recordListShrink = recordListShrink;
        return this;
    }
    public String getRecordListShrink() {
        return this.recordListShrink;
    }

    public BatchCreateRecordsShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
