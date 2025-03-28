// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceCreateRequest extends TeaModel {
    /**
     * <p>The name of the instance. The name must meet the following rules:</p>
     * <ul>
     * <li>The name of the instance must be unique in the region where the instance is deployed.</li>
     * <li>The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test instance</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Description</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static OnsInstanceCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceCreateRequest self = new OnsInstanceCreateRequest();
        return TeaModel.build(map, self);
    }

    public OnsInstanceCreateRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public OnsInstanceCreateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
