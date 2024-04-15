// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AssociateNetworkPackageRequest extends TeaModel {
    /**
     * <p>The ID of the premium bandwidth plan.</p>
     */
    @NameInMap("NetworkPackageId")
    public String networkPackageId;

    /**
     * <p>The ID of the office network. You can call the [DescribeNetworkPackages](~~216079~~) to obtain the ID of the office network to which a premium bandwidth plan is bound.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AssociateNetworkPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateNetworkPackageRequest self = new AssociateNetworkPackageRequest();
        return TeaModel.build(map, self);
    }

    public AssociateNetworkPackageRequest setNetworkPackageId(String networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

    public AssociateNetworkPackageRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public AssociateNetworkPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
