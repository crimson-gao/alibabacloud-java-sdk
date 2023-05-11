// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchUnbindDeviceFromEdgeInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the [Link IoT Edge console](https://iot.console.aliyun.com/le/instance/list). On the **Edge Instances** page, move the pointer over the name of the edge instance from which you want to unbind multiple devices and obtain the instance ID.</p>
     * <br>
     * <p>You can also call the [QueryEdgeInstance](~~135214~~) operation to query the instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotIds")
    public java.util.List<String> iotIds;

    /**
     * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static BatchUnbindDeviceFromEdgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindDeviceFromEdgeInstanceRequest self = new BatchUnbindDeviceFromEdgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public BatchUnbindDeviceFromEdgeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchUnbindDeviceFromEdgeInstanceRequest setIotIds(java.util.List<String> iotIds) {
        this.iotIds = iotIds;
        return this;
    }
    public java.util.List<String> getIotIds() {
        return this.iotIds;
    }

    public BatchUnbindDeviceFromEdgeInstanceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
