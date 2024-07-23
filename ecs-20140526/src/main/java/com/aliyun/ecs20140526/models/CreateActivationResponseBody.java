// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateActivationResponseBody extends TeaModel {
    /**
     * <p>The value of the activation code. The value is returned only once after the CreateActivation operation is called and cannot be queried afterward. Properly save the return value.</p>
     * 
     * <strong>example:</strong>
     * <p>a-hz0ch3SwhOlE1234+Xo32lAZC****</p>
     */
    @NameInMap("ActivationCode")
    public String activationCode;

    /**
     * <p>The ID of the activation code.</p>
     * 
     * <strong>example:</strong>
     * <p>4ECEEE12-56F1-4FBC-9AB1-890F1234****</p>
     */
    @NameInMap("ActivationId")
    public String activationId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4ECEEE12-56F1-4FBC-9AB1-890F1234****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateActivationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateActivationResponseBody self = new CreateActivationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateActivationResponseBody setActivationCode(String activationCode) {
        this.activationCode = activationCode;
        return this;
    }
    public String getActivationCode() {
        return this.activationCode;
    }

    public CreateActivationResponseBody setActivationId(String activationId) {
        this.activationId = activationId;
        return this;
    }
    public String getActivationId() {
        return this.activationId;
    }

    public CreateActivationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
