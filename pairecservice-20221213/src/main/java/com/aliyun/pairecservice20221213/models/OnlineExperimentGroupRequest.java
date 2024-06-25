// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OnlineExperimentGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-abcdefg1234</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static OnlineExperimentGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineExperimentGroupRequest self = new OnlineExperimentGroupRequest();
        return TeaModel.build(map, self);
    }

    public OnlineExperimentGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
