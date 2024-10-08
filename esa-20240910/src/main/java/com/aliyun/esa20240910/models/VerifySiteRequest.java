// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class VerifySiteRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static VerifySiteRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifySiteRequest self = new VerifySiteRequest();
        return TeaModel.build(map, self);
    }

    public VerifySiteRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
