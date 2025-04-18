// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceAclRequest extends TeaModel {
    /**
     * <p>The name of the resource on which you want to grant permissions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("resourceName")
    public String resourceName;

    /**
     * <p>The type of the resource on which you want to grant permissions.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Group</li>
     * <li>Topic</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Topic</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static GetInstanceAclRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceAclRequest self = new GetInstanceAclRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceAclRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public GetInstanceAclRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
