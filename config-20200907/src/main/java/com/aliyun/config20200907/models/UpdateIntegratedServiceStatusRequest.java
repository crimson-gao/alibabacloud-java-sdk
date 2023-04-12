// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateIntegratedServiceStatusRequest extends TeaModel {
    /**
     * <p>The product code of the cloud product. Valid values:</p>
     * <br>
     * <p>*   cadt: Cloud Architecture Design Tool</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>Specifies whether you want the product to be integrated. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static UpdateIntegratedServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntegratedServiceStatusRequest self = new UpdateIntegratedServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIntegratedServiceStatusRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public UpdateIntegratedServiceStatusRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
