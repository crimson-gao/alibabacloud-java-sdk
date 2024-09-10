// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteBackupPolicyMachineResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D0D6E6E4-CB8C-4897-B852-46AEFDA04B21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBackupPolicyMachineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupPolicyMachineResponseBody self = new DeleteBackupPolicyMachineResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBackupPolicyMachineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
