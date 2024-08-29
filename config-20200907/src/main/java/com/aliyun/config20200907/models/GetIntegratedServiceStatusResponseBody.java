// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetIntegratedServiceStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the product has been integrated. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The types of the integrated events. Separate multiple event types with commas (,). Valid values:</p>
     * <ul>
     * <li>ConfigurationItemChangeNotification: resource change event</li>
     * <li>NonCompliantNotification: non-compliance event</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NonCompliantNotification</p>
     */
    @NameInMap("IntegratedTypes")
    public String integratedTypes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2E396C84-8D50-5F95-97FA-C0367181BA8A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetIntegratedServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIntegratedServiceStatusResponseBody self = new GetIntegratedServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIntegratedServiceStatusResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public GetIntegratedServiceStatusResponseBody setIntegratedTypes(String integratedTypes) {
        this.integratedTypes = integratedTypes;
        return this;
    }
    public String getIntegratedTypes() {
        return this.integratedTypes;
    }

    public GetIntegratedServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
