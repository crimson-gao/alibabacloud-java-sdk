// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ActiveCaCertificateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>007269004887******</p>
     */
    @NameInMap("Sn")
    public String sn;

    public static ActiveCaCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActiveCaCertificateResponseBody self = new ActiveCaCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ActiveCaCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ActiveCaCertificateResponseBody setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
