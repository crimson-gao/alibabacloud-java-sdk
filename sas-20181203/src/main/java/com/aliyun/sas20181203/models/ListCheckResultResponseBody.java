// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckResultResponseBody extends TeaModel {
    // An array that consists of the check items.
    @NameInMap("Checks")
    public java.util.List<ListCheckResultResponseBodyChecks> checks;

    // The pagination information.
    @NameInMap("PageInfo")
    public ListCheckResultResponseBodyPageInfo pageInfo;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ListCheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCheckResultResponseBody self = new ListCheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCheckResultResponseBody setChecks(java.util.List<ListCheckResultResponseBodyChecks> checks) {
        this.checks = checks;
        return this;
    }
    public java.util.List<ListCheckResultResponseBodyChecks> getChecks() {
        return this.checks;
    }

    public ListCheckResultResponseBody setPageInfo(ListCheckResultResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListCheckResultResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListCheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRiskListCheckResultResponseBodyList extends TeaModel {
        // The instance ID of the cloud service.
        @NameInMap("InstanceId")
        public String instanceId;

        // The total number of risk items detected in the current cloud service.
        @NameInMap("riskCount")
        public Long riskCount;

        public static DescribeRiskListCheckResultResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskListCheckResultResponseBodyList self = new DescribeRiskListCheckResultResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeRiskListCheckResultResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRiskListCheckResultResponseBodyList setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

    }

    public static class ListCheckResultResponseBodyChecksCheckPolicies extends TeaModel {
        // The requirement item ID of the check item.
        @NameInMap("RequirementId")
        public Long requirementId;

        // The item display name of the check item.
        @NameInMap("RequirementShowName")
        public String requirementShowName;

        // The section ID of the check item.
        @NameInMap("SectionId")
        public Long sectionId;

        // The section display name of the check item.
        @NameInMap("SectionShowName")
        public String sectionShowName;

        // The standard ID of the check item.
        @NameInMap("StandardId")
        public Long standardId;

        // The standard display name of the check item.
        @NameInMap("StandardShowName")
        public String standardShowName;

        public static ListCheckResultResponseBodyChecksCheckPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListCheckResultResponseBodyChecksCheckPolicies self = new ListCheckResultResponseBodyChecksCheckPolicies();
            return TeaModel.build(map, self);
        }

        public ListCheckResultResponseBodyChecksCheckPolicies setRequirementId(Long requirementId) {
            this.requirementId = requirementId;
            return this;
        }
        public Long getRequirementId() {
            return this.requirementId;
        }

        public ListCheckResultResponseBodyChecksCheckPolicies setRequirementShowName(String requirementShowName) {
            this.requirementShowName = requirementShowName;
            return this;
        }
        public String getRequirementShowName() {
            return this.requirementShowName;
        }

        public ListCheckResultResponseBodyChecksCheckPolicies setSectionId(Long sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public Long getSectionId() {
            return this.sectionId;
        }

        public ListCheckResultResponseBodyChecksCheckPolicies setSectionShowName(String sectionShowName) {
            this.sectionShowName = sectionShowName;
            return this;
        }
        public String getSectionShowName() {
            return this.sectionShowName;
        }

        public ListCheckResultResponseBodyChecksCheckPolicies setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

        public ListCheckResultResponseBodyChecksCheckPolicies setStandardShowName(String standardShowName) {
            this.standardShowName = standardShowName;
            return this;
        }
        public String getStandardShowName() {
            return this.standardShowName;
        }

    }

    public static class ListCheckResultResponseBodyChecks extends TeaModel {
        // The ID of the check item.
        @NameInMap("CheckId")
        public Long checkId;

        // The check policies.
        @NameInMap("CheckPolicies")
        public java.util.List<ListCheckResultResponseBodyChecksCheckPolicies> checkPolicies;

        // The name of the check item.
        @NameInMap("CheckShowName")
        public String checkShowName;

        // The asset subtype of the cloud service. Valid values:
        // 
        // *   If the **InstanceType** parameter is set to **ECS**, this parameter supports the following valid values:
        // 
        //     *   **INSTANCE**
        //     *   **DISK**
        //     *   **SECURITY_GROUP**
        // 
        // *   If the **InstanceType** parameter is set to **ACR**, this parameter supports the following valid values:
        // 
        //     *   **REPOSITORY_ENTERPRISE**
        //     *   **REPOSITORY_PERSON**
        // 
        // *   If the **InstanceType** parameter is set to **RAM**, this parameter supports the following valid values:
        // 
        //     *   **ALIAS**
        //     *   **USER**
        //     *   **POLICY**
        //     *   **GROUP**
        // 
        // *   If the **InstanceType** parameter is set to **WAF**, this parameter supports the following valid values:
        // 
        //     *   **DOMAIN**
        // 
        // *   If the **InstanceType** parameter is set to other values, this parameter supports the following valid values:
        // 
        //     *   **INSTANCE**
        @NameInMap("InstanceSubType")
        public String instanceSubType;

        // The asset type of the cloud service. Valid values:
        // 
        // *   **ECS**: ECS
        // *   **SLB**: SLB
        // *   **RDS**: ApsaraDB RDS
        // *   **MONGODB**: MongoDB
        // *   **KVSTORE**: Redis
        // *   **ACR**: Container Registry
        // *   **CSK**: ACK
        // *   **VPC**: VPC
        // *   **ACTIONTRAIL**: ActionTrail
        // *   **CDN**: CDN
        // *   **CAS**: Certificate Management Service (formerly SSL Certificates Service)
        // *   **RDC**: Apsara Devops
        // *   **RAM**: RAM
        // *   **DDOS**: Anti-DDoS
        // *   **WAF**: WAF
        // *   **OSS**: OSS
        // *   **POLARDB**: PolarDB
        // *   **POSTGRESQL**: ApsaraDB RDS for PostgreSQL
        // *   **MSE**: MSE
        // *   **NAS**: NAS
        // *   **SDDP**: SDDP
        // *   **EIP**: EIP
        @NameInMap("InstanceType")
        public String instanceType;

        // The timestamp when the last check was performed. Unit: milliseconds.
        @NameInMap("LastCheckTime")
        public Long lastCheckTime;

        // The risk level of the check item. Valid values:
        // 
        // *   **HIGH**
        // *   **MEDIUM**
        // *   **LOW**
        @NameInMap("RiskLevel")
        public String riskLevel;

        // The state of the check item. Valid values:
        // 
        // *   **PASS**
        // *   **NOT_PASS**
        // *   **CHECKING**
        // *   **NOT_CHECK**
        // *   **WHITELIST**
        @NameInMap("Status")
        public String status;

        // The ID of the check task.
        @NameInMap("TaskId")
        public String taskId;

        // The flag that whether this check item needs trial permission.
        @NameInMap("TrialPermission")
        public Boolean trialPermission;

        // The value of the cloud service provider.
        @NameInMap("Vendor")
        public String vendor;

        // The name of the cloud service provider.
        @NameInMap("VendorShowName")
        public String vendorShowName;

        public static ListCheckResultResponseBodyChecks build(java.util.Map<String, ?> map) throws Exception {
            ListCheckResultResponseBodyChecks self = new ListCheckResultResponseBodyChecks();
            return TeaModel.build(map, self);
        }

        public ListCheckResultResponseBodyChecks setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ListCheckResultResponseBodyChecks setCheckPolicies(java.util.List<ListCheckResultResponseBodyChecksCheckPolicies> checkPolicies) {
            this.checkPolicies = checkPolicies;
            return this;
        }
        public java.util.List<ListCheckResultResponseBodyChecksCheckPolicies> getCheckPolicies() {
            return this.checkPolicies;
        }

        public ListCheckResultResponseBodyChecks setCheckShowName(String checkShowName) {
            this.checkShowName = checkShowName;
            return this;
        }
        public String getCheckShowName() {
            return this.checkShowName;
        }

        public ListCheckResultResponseBodyChecks setInstanceSubType(String instanceSubType) {
            this.instanceSubType = instanceSubType;
            return this;
        }
        public String getInstanceSubType() {
            return this.instanceSubType;
        }

        public ListCheckResultResponseBodyChecks setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListCheckResultResponseBodyChecks setLastCheckTime(Long lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public Long getLastCheckTime() {
            return this.lastCheckTime;
        }

        public ListCheckResultResponseBodyChecks setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListCheckResultResponseBodyChecks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCheckResultResponseBodyChecks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListCheckResultResponseBodyChecks setTrialPermission(Boolean trialPermission) {
            this.trialPermission = trialPermission;
            return this;
        }
        public Boolean getTrialPermission() {
            return this.trialPermission;
        }

        public ListCheckResultResponseBodyChecks setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public ListCheckResultResponseBodyChecks setVendorShowName(String vendorShowName) {
            this.vendorShowName = vendorShowName;
            return this;
        }
        public String getVendorShowName() {
            return this.vendorShowName;
        }

    }

    public static class ListCheckResultResponseBodyPageInfo extends TeaModel {
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCheckResultResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCheckResultResponseBodyPageInfo self = new ListCheckResultResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCheckResultResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListCheckResultResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListCheckResultResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCheckResultResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
