// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer7CertResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigLayer7CertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer7CertResponseBody self = new ConfigLayer7CertResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigLayer7CertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
