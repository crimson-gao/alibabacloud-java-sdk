// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeApplicationToOrganizationalUnitsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AuthorizeApplicationToOrganizationalUnitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeApplicationToOrganizationalUnitsResponseBody self = new AuthorizeApplicationToOrganizationalUnitsResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeApplicationToOrganizationalUnitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
