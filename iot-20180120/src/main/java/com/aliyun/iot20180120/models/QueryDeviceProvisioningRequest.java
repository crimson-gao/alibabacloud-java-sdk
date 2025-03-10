// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceProvisioningRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testDevcieBwT3Un</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1ji*****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static QueryDeviceProvisioningRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceProvisioningRequest self = new QueryDeviceProvisioningRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceProvisioningRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceProvisioningRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
