// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>false</p>
     */
    @NameInMap("DeleteAll")
    public Boolean deleteAll;

    /**
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>\["d42921c4-5433-4abd-8075-0e536f8b\*\*\*\*"]</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>application</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>\["k1","k2"]</p>
     */
    @NameInMap("TagKeys")
    public String tagKeys;

    public static UntagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesRequest self = new UntagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesRequest setDeleteAll(Boolean deleteAll) {
        this.deleteAll = deleteAll;
        return this;
    }
    public Boolean getDeleteAll() {
        return this.deleteAll;
    }

    public UntagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UntagResourcesRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public UntagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesRequest setTagKeys(String tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public String getTagKeys() {
        return this.tagKeys;
    }

}
