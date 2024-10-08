// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafRulesetRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetWafRulesetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWafRulesetRequest self = new GetWafRulesetRequest();
        return TeaModel.build(map, self);
    }

    public GetWafRulesetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetWafRulesetRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public GetWafRulesetRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
