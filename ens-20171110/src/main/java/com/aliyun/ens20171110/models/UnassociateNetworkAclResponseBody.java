// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnassociateNetworkAclResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnassociateNetworkAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnassociateNetworkAclResponseBody self = new UnassociateNetworkAclResponseBody();
        return TeaModel.build(map, self);
    }

    public UnassociateNetworkAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
