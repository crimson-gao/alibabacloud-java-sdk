// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDiskEncryptionServiceRequest extends TeaModel {
    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateDiskEncryptionServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskEncryptionServiceRequest self = new CreateDiskEncryptionServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiskEncryptionServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
