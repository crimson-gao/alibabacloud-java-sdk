// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainSecurityProfileRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    public static DescribeDomainSecurityProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecurityProfileRequest self = new DescribeDomainSecurityProfileRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecurityProfileRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
