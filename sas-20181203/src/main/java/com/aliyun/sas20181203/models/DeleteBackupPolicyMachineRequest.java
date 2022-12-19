// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteBackupPolicyMachineRequest extends TeaModel {
    // The ID of the anti-ransomware policy.
    // >  You can call the [DescribeBackupPolicies](~~DescribeBackupPolicies~~) operation to query the **Id** of anti-ransomware policies.
    @NameInMap("PolicyId")
    public Long policyId;

    // The version of the anti-ransomware policy. Valid values:
    // 
    // *   **1.0.0**
    // *   **2.0.0**
    // 
    // >  You can call the [DescribeBackupPolicies](~~DescribeBackupPolicies~~) operation to query the versions of anti-ransomware policies.
    @NameInMap("PolicyVersion")
    public String policyVersion;

    // The UUID of the server to which the anti-ransomware policy is applied.
    // 
    // >  You must specify at least one of the `UuidList` and `Uuid` parameters.
    @NameInMap("Uuid")
    public String uuid;

    // The UUIDs of the servers to which the anti-ransomware policy is applied.
    // 
    // >  You must specify at least one of the `UuidList` and `Uuid` parameters.
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static DeleteBackupPolicyMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupPolicyMachineRequest self = new DeleteBackupPolicyMachineRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBackupPolicyMachineRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public DeleteBackupPolicyMachineRequest setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    public DeleteBackupPolicyMachineRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DeleteBackupPolicyMachineRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
