// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainDnssecInfoRequest extends TeaModel {
    /**
     * <p>The domain name for which DNSSEC configurations to query.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language in which you want the values of some response parameters to be returned. These response parameters support multiple languages, such as the region parameter. Default value: en. Valid values: en, zh, and ja.</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeDomainDnssecInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainDnssecInfoRequest self = new DescribeDomainDnssecInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainDnssecInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainDnssecInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
