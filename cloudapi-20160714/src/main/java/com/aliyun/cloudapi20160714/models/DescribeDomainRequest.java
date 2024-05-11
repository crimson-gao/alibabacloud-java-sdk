// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDomainRequest extends TeaModel {
    /**
     * <p>The custom domain name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the API group. An API group ID is generated by the system and is globally unique.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRequest self = new DescribeDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
