// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainSecureStatisticsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>113.87.<em>.</em></p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeDomainSecureStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecureStatisticsRequest self = new DescribeDomainSecureStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecureStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainSecureStatisticsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
