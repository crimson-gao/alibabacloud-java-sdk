// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetVerificationInfoRequest extends TeaModel {
    /**
     * <p>The logon name of the RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static GetVerificationInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVerificationInfoRequest self = new GetVerificationInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetVerificationInfoRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
