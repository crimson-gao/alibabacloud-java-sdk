// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobItem extends TeaModel {
    @NameInMap("CodeSource")
    public JobItemCodeSource codeSource;

    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    @NameInMap("DataSources")
    public java.util.List<JobItemDataSources> dataSources;

    /**
     * <strong>example:</strong>
     * <p>tf-mnist-test</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>3602</p>
     */
    @NameInMap("Duration")
    public Long duration;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnabledDebugger")
    public Boolean enabledDebugger;

    @NameInMap("Envs")
    public java.util.Map<String, String> envs;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:01Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:01Z</p>
     */
    @NameInMap("GmtFailedTime")
    public String gmtFailedTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T15:36:08Z</p>
     */
    @NameInMap("GmtFinishTime")
    public String gmtFinishTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:01Z</p>
     */
    @NameInMap("GmtRunningTime")
    public String gmtRunningTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:01Z</p>
     */
    @NameInMap("GmtStoppedTime")
    public String gmtStoppedTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:01Z</p>
     */
    @NameInMap("GmtSubmittedTime")
    public String gmtSubmittedTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:01Z</p>
     */
    @NameInMap("GmtSuccessedTime")
    public String gmtSuccessedTime;

    /**
     * <strong>example:</strong>
     * <p>dlc-20210126170216-mtl37ge7gkvdz</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("JobSpecs")
    public java.util.List<JobSpec> jobSpecs;

    /**
     * <strong>example:</strong>
     * <p>TFJob</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <strong>example:</strong>
     * <p>JobStoppedByUser</p>
     */
    @NameInMap("ReasonCode")
    public String reasonCode;

    /**
     * <strong>example:</strong>
     * <p>Job is stopped by user.</p>
     */
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    /**
     * <strong>example:</strong>
     * <p>dlc-quota</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>L0</p>
     */
    @NameInMap("ResourceLevel")
    public String resourceLevel;

    /**
     * <strong>example:</strong>
     * <p>my_resource_group</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Settings")
    public JobSettings settings;

    /**
     * <strong>example:</strong>
     * <p>Stopped</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>Restarting</p>
     */
    @NameInMap("SubStatus")
    public String subStatus;

    /**
     * <strong>example:</strong>
     * <p>/root/code/</p>
     */
    @NameInMap("ThirdpartyLibDir")
    public String thirdpartyLibDir;

    @NameInMap("ThirdpartyLibs")
    public java.util.List<String> thirdpartyLibs;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseOversoldResource")
    public Boolean useOversoldResource;

    /**
     * <strong>example:</strong>
     * <p>python /root/code/mnist.py</p>
     */
    @NameInMap("UserCommand")
    public String userCommand;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>pai-dlc-role</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <strong>example:</strong>
     * <p>268</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <strong>example:</strong>
     * <p>dlc-workspace</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static JobItem build(java.util.Map<String, ?> map) throws Exception {
        JobItem self = new JobItem();
        return TeaModel.build(map, self);
    }

    public JobItem setCodeSource(JobItemCodeSource codeSource) {
        this.codeSource = codeSource;
        return this;
    }
    public JobItemCodeSource getCodeSource() {
        return this.codeSource;
    }

    public JobItem setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public JobItem setDataSources(java.util.List<JobItemDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<JobItemDataSources> getDataSources() {
        return this.dataSources;
    }

    public JobItem setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public JobItem setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public JobItem setEnabledDebugger(Boolean enabledDebugger) {
        this.enabledDebugger = enabledDebugger;
        return this;
    }
    public Boolean getEnabledDebugger() {
        return this.enabledDebugger;
    }

    public JobItem setEnvs(java.util.Map<String, String> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.Map<String, String> getEnvs() {
        return this.envs;
    }

    public JobItem setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public JobItem setGmtFailedTime(String gmtFailedTime) {
        this.gmtFailedTime = gmtFailedTime;
        return this;
    }
    public String getGmtFailedTime() {
        return this.gmtFailedTime;
    }

    public JobItem setGmtFinishTime(String gmtFinishTime) {
        this.gmtFinishTime = gmtFinishTime;
        return this;
    }
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    public JobItem setGmtRunningTime(String gmtRunningTime) {
        this.gmtRunningTime = gmtRunningTime;
        return this;
    }
    public String getGmtRunningTime() {
        return this.gmtRunningTime;
    }

    public JobItem setGmtStoppedTime(String gmtStoppedTime) {
        this.gmtStoppedTime = gmtStoppedTime;
        return this;
    }
    public String getGmtStoppedTime() {
        return this.gmtStoppedTime;
    }

    public JobItem setGmtSubmittedTime(String gmtSubmittedTime) {
        this.gmtSubmittedTime = gmtSubmittedTime;
        return this;
    }
    public String getGmtSubmittedTime() {
        return this.gmtSubmittedTime;
    }

    public JobItem setGmtSuccessedTime(String gmtSuccessedTime) {
        this.gmtSuccessedTime = gmtSuccessedTime;
        return this;
    }
    public String getGmtSuccessedTime() {
        return this.gmtSuccessedTime;
    }

    public JobItem setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public JobItem setJobSpecs(java.util.List<JobSpec> jobSpecs) {
        this.jobSpecs = jobSpecs;
        return this;
    }
    public java.util.List<JobSpec> getJobSpecs() {
        return this.jobSpecs;
    }

    public JobItem setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public JobItem setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public JobItem setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public JobItem setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public JobItem setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public JobItem setResourceLevel(String resourceLevel) {
        this.resourceLevel = resourceLevel;
        return this;
    }
    public String getResourceLevel() {
        return this.resourceLevel;
    }

    public JobItem setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public JobItem setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public JobItem setSettings(JobSettings settings) {
        this.settings = settings;
        return this;
    }
    public JobSettings getSettings() {
        return this.settings;
    }

    public JobItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public JobItem setSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }
    public String getSubStatus() {
        return this.subStatus;
    }

    public JobItem setThirdpartyLibDir(String thirdpartyLibDir) {
        this.thirdpartyLibDir = thirdpartyLibDir;
        return this;
    }
    public String getThirdpartyLibDir() {
        return this.thirdpartyLibDir;
    }

    public JobItem setThirdpartyLibs(java.util.List<String> thirdpartyLibs) {
        this.thirdpartyLibs = thirdpartyLibs;
        return this;
    }
    public java.util.List<String> getThirdpartyLibs() {
        return this.thirdpartyLibs;
    }

    public JobItem setUseOversoldResource(Boolean useOversoldResource) {
        this.useOversoldResource = useOversoldResource;
        return this;
    }
    public Boolean getUseOversoldResource() {
        return this.useOversoldResource;
    }

    public JobItem setUserCommand(String userCommand) {
        this.userCommand = userCommand;
        return this;
    }
    public String getUserCommand() {
        return this.userCommand;
    }

    public JobItem setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public JobItem setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public JobItem setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public JobItem setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class JobItemCodeSource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Branch")
        public String branch;

        /**
         * <strong>example:</strong>
         * <p>code-20210111103721-85qz78ia96lu</p>
         */
        @NameInMap("CodeSourceId")
        public String codeSourceId;

        /**
         * <strong>example:</strong>
         * <p>44da109b59f8596152987eaa8f3b2487bb72ea63</p>
         */
        @NameInMap("Commit")
        public String commit;

        /**
         * <strong>example:</strong>
         * <p>/mnt/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        public static JobItemCodeSource build(java.util.Map<String, ?> map) throws Exception {
            JobItemCodeSource self = new JobItemCodeSource();
            return TeaModel.build(map, self);
        }

        public JobItemCodeSource setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public JobItemCodeSource setCodeSourceId(String codeSourceId) {
            this.codeSourceId = codeSourceId;
            return this;
        }
        public String getCodeSourceId() {
            return this.codeSourceId;
        }

        public JobItemCodeSource setCommit(String commit) {
            this.commit = commit;
            return this;
        }
        public String getCommit() {
            return this.commit;
        }

        public JobItemCodeSource setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class JobItemDataSources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>data-20210114104214-vf9lowjt3pso</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>/mnt/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        public static JobItemDataSources build(java.util.Map<String, ?> map) throws Exception {
            JobItemDataSources self = new JobItemDataSources();
            return TeaModel.build(map, self);
        }

        public JobItemDataSources setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public JobItemDataSources setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

}
