// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserVipsByDomainRequest extends TeaModel {
    @NameInMap("Available")
    public String available;

    @NameInMap("DomainName")
    public String domainName;

    public static DescribeDcdnUserVipsByDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserVipsByDomainRequest self = new DescribeDcdnUserVipsByDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserVipsByDomainRequest setAvailable(String available) {
        this.available = available;
        return this;
    }
    public String getAvailable() {
        return this.available;
    }

    public DescribeDcdnUserVipsByDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
