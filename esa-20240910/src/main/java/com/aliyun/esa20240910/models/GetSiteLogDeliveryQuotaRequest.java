// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteLogDeliveryQuotaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dcdn_log_access_l1</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetSiteLogDeliveryQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSiteLogDeliveryQuotaRequest self = new GetSiteLogDeliveryQuotaRequest();
        return TeaModel.build(map, self);
    }

    public GetSiteLogDeliveryQuotaRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GetSiteLogDeliveryQuotaRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
