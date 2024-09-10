// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainSecureRiskListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>124.78.<em>.</em></p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeDomainSecureRiskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecureRiskListRequest self = new DescribeDomainSecureRiskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecureRiskListRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeDomainSecureRiskListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainSecureRiskListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
