// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResetDiskDefaultKMSKeyIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ResetDiskDefaultKMSKeyIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetDiskDefaultKMSKeyIdRequest self = new ResetDiskDefaultKMSKeyIdRequest();
        return TeaModel.build(map, self);
    }

    public ResetDiskDefaultKMSKeyIdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResetDiskDefaultKMSKeyIdRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
