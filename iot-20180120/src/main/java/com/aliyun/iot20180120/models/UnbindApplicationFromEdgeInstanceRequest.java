// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnbindApplicationFromEdgeInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>361368ba5a094da9bf5625d092******</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tb4r9k3GWHJFWv******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static UnbindApplicationFromEdgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindApplicationFromEdgeInstanceRequest self = new UnbindApplicationFromEdgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindApplicationFromEdgeInstanceRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UnbindApplicationFromEdgeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnbindApplicationFromEdgeInstanceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
