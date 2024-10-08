// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteLogDeliveryQuotaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dcdn_log_access_l1</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("FreeQuota")
    public Long freeQuota;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4C14840EF0EAAB6D97CDE0C5F6554ACE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetSiteLogDeliveryQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSiteLogDeliveryQuotaResponseBody self = new GetSiteLogDeliveryQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSiteLogDeliveryQuotaResponseBody setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GetSiteLogDeliveryQuotaResponseBody setFreeQuota(Long freeQuota) {
        this.freeQuota = freeQuota;
        return this;
    }
    public Long getFreeQuota() {
        return this.freeQuota;
    }

    public GetSiteLogDeliveryQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSiteLogDeliveryQuotaResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
