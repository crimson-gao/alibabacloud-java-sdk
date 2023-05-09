// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **UntagResources**.</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>testKey1</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the specified resource. Set the value to **INSTANCE**.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    public static UntagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesRequest self = new UntagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UntagResourcesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UntagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UntagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

}
