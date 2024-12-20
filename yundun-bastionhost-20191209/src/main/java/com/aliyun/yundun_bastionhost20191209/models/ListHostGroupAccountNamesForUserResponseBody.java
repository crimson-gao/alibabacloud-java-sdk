// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostGroupAccountNamesForUserResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the names of host accounts.</p>
     */
    @NameInMap("HostAccountNames")
    public java.util.List<String> hostAccountNames;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListHostGroupAccountNamesForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupAccountNamesForUserResponseBody self = new ListHostGroupAccountNamesForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostGroupAccountNamesForUserResponseBody setHostAccountNames(java.util.List<String> hostAccountNames) {
        this.hostAccountNames = hostAccountNames;
        return this;
    }
    public java.util.List<String> getHostAccountNames() {
        return this.hostAccountNames;
    }

    public ListHostGroupAccountNamesForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
