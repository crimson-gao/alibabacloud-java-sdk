// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetDefaultDomainResponseBody extends TeaModel {
    /**
     * <p>The default domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>examplecompany.onaliyun.com</p>
     */
    @NameInMap("DefaultDomainName")
    public String defaultDomainName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>66815255-7CCE-4759-AC37-9755794C3626</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetDefaultDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultDomainResponseBody self = new SetDefaultDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDefaultDomainResponseBody setDefaultDomainName(String defaultDomainName) {
        this.defaultDomainName = defaultDomainName;
        return this;
    }
    public String getDefaultDomainName() {
        return this.defaultDomainName;
    }

    public SetDefaultDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
