// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateBackupPolicyResponseBody extends TeaModel {
    // The information about the anti-ransomware policy.
    @NameInMap("BackupPolicy")
    public CreateBackupPolicyResponseBodyBackupPolicy backupPolicy;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupPolicyResponseBody self = new CreateBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackupPolicyResponseBody setBackupPolicy(CreateBackupPolicyResponseBodyBackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }
    public CreateBackupPolicyResponseBodyBackupPolicy getBackupPolicy() {
        return this.backupPolicy;
    }

    public CreateBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateBackupPolicyResponseBodyBackupPolicy extends TeaModel {
        // The ID of the anti-ransomware policy.
        @NameInMap("Id")
        public String id;

        // The status of the anti-ransomware policy. Valid values:
        // 
        // *   **enabled**
        // *   **disabled**
        // 
        // >  After you create an anti-ransomware policy, the policy is enabled by default.
        @NameInMap("Status")
        public String status;

        public static CreateBackupPolicyResponseBodyBackupPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateBackupPolicyResponseBodyBackupPolicy self = new CreateBackupPolicyResponseBodyBackupPolicy();
            return TeaModel.build(map, self);
        }

        public CreateBackupPolicyResponseBodyBackupPolicy setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateBackupPolicyResponseBodyBackupPolicy setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
