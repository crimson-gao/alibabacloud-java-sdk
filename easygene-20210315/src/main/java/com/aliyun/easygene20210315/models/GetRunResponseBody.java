// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetRunResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Sentieon</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AppRevision")
    public String appRevision;

    @NameInMap("BillingInstanceIds")
    public java.util.List<String> billingInstanceIds;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Calls")
    public String calls;

    /**
     * <strong>example:</strong>
     * <p>2021-06-10T13:30:20.414557061Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("DefaultRuntime")
    public String defaultRuntime;

    /**
     * <strong>example:</strong>
     * <p>test run</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>2021-06-10T13:36:20.405878292Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>s1</p>
     */
    @NameInMap("EntityName")
    public String entityName;

    /**
     * <strong>example:</strong>
     * <p>sample</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <strong>example:</strong>
     * <p>oss://my-bucket/exec/</p>
     */
    @NameInMap("ExecuteDirectory")
    public String executeDirectory;

    @NameInMap("ExecuteOptions")
    public GetRunResponseBodyExecuteOptions executeOptions;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Failures")
    public String failures;

    /**
     * <strong>example:</strong>
     * <p>easygene.cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <strong>example:</strong>
     * <p>{     &quot;workflow1.task1.param1&quot;: &quot;helloooo.txt&quot;,     &quot;workflow1.task1.param2&quot;: &quot;abc&quot;,     &quot;workflow1.task2.param1&quot;: &quot;new_helloooo.txt&quot;,     &quot;workflow1.task2.param2&quot;: &quot;def&quot; }</p>
     */
    @NameInMap("Inputs")
    public String inputs;

    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    /**
     * <strong>example:</strong>
     * <p>oss://my-bucket/output/</p>
     */
    @NameInMap("OutputFolder")
    public String outputFolder;

    /**
     * <strong>example:</strong>
     * <p>{         &quot;workflow1.bam&quot;: &quot;oss://my-bucket/test.bam&quot;,         &quot;workflow1.vcf&quot;: &quot;oss://my-bucket/test.vcf&quot;     }</p>
     */
    @NameInMap("Outputs")
    public String outputs;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>run-13BeYuxc0fxO24uA75UppTiMRoQ</p>
     */
    @NameInMap("RunId")
    public String runId;

    /**
     * <strong>example:</strong>
     * <p>test-run</p>
     */
    @NameInMap("RunName")
    public String runName;

    /**
     * <strong>example:</strong>
     * <p>EasyGene</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>2021-06-10T13:30:24.414557061Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>sub-13BeXWnGvrOl3MC124tazcJVKaV</p>
     */
    @NameInMap("SubmissionId")
    public String submissionId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Timing")
    public String timing;

    /**
     * <strong>example:</strong>
     * <p>13579222</p>
     */
    @NameInMap("User")
    public String user;

    /**
     * <strong>example:</strong>
     * <p>test-workspace</p>
     */
    @NameInMap("Workspace")
    public String workspace;

    public static GetRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRunResponseBody self = new GetRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRunResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetRunResponseBody setAppRevision(String appRevision) {
        this.appRevision = appRevision;
        return this;
    }
    public String getAppRevision() {
        return this.appRevision;
    }

    public GetRunResponseBody setBillingInstanceIds(java.util.List<String> billingInstanceIds) {
        this.billingInstanceIds = billingInstanceIds;
        return this;
    }
    public java.util.List<String> getBillingInstanceIds() {
        return this.billingInstanceIds;
    }

    public GetRunResponseBody setCalls(String calls) {
        this.calls = calls;
        return this;
    }
    public String getCalls() {
        return this.calls;
    }

    public GetRunResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetRunResponseBody setDefaultRuntime(String defaultRuntime) {
        this.defaultRuntime = defaultRuntime;
        return this;
    }
    public String getDefaultRuntime() {
        return this.defaultRuntime;
    }

    public GetRunResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetRunResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetRunResponseBody setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public GetRunResponseBody setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public GetRunResponseBody setExecuteDirectory(String executeDirectory) {
        this.executeDirectory = executeDirectory;
        return this;
    }
    public String getExecuteDirectory() {
        return this.executeDirectory;
    }

    public GetRunResponseBody setExecuteOptions(GetRunResponseBodyExecuteOptions executeOptions) {
        this.executeOptions = executeOptions;
        return this;
    }
    public GetRunResponseBodyExecuteOptions getExecuteOptions() {
        return this.executeOptions;
    }

    public GetRunResponseBody setFailures(String failures) {
        this.failures = failures;
        return this;
    }
    public String getFailures() {
        return this.failures;
    }

    public GetRunResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public GetRunResponseBody setInputs(String inputs) {
        this.inputs = inputs;
        return this;
    }
    public String getInputs() {
        return this.inputs;
    }

    public GetRunResponseBody setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public GetRunResponseBody setOutputFolder(String outputFolder) {
        this.outputFolder = outputFolder;
        return this;
    }
    public String getOutputFolder() {
        return this.outputFolder;
    }

    public GetRunResponseBody setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public GetRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRunResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public GetRunResponseBody setRunName(String runName) {
        this.runName = runName;
        return this;
    }
    public String getRunName() {
        return this.runName;
    }

    public GetRunResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetRunResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetRunResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetRunResponseBody setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
        return this;
    }
    public String getSubmissionId() {
        return this.submissionId;
    }

    public GetRunResponseBody setTiming(String timing) {
        this.timing = timing;
        return this;
    }
    public String getTiming() {
        return this.timing;
    }

    public GetRunResponseBody setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public GetRunResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class GetRunResponseBodyExecuteOptions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CallCaching")
        public Boolean callCaching;

        @NameInMap("DataLoader")
        public String dataLoader;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DeleteIntermediateResults")
        public Boolean deleteIntermediateResults;

        /**
         * <strong>example:</strong>
         * <p>NoNewCalls</p>
         */
        @NameInMap("FailureMode")
        public String failureMode;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UseRelativeOutputPaths")
        public Boolean useRelativeOutputPaths;

        public static GetRunResponseBodyExecuteOptions build(java.util.Map<String, ?> map) throws Exception {
            GetRunResponseBodyExecuteOptions self = new GetRunResponseBodyExecuteOptions();
            return TeaModel.build(map, self);
        }

        public GetRunResponseBodyExecuteOptions setCallCaching(Boolean callCaching) {
            this.callCaching = callCaching;
            return this;
        }
        public Boolean getCallCaching() {
            return this.callCaching;
        }

        public GetRunResponseBodyExecuteOptions setDataLoader(String dataLoader) {
            this.dataLoader = dataLoader;
            return this;
        }
        public String getDataLoader() {
            return this.dataLoader;
        }

        public GetRunResponseBodyExecuteOptions setDeleteIntermediateResults(Boolean deleteIntermediateResults) {
            this.deleteIntermediateResults = deleteIntermediateResults;
            return this;
        }
        public Boolean getDeleteIntermediateResults() {
            return this.deleteIntermediateResults;
        }

        public GetRunResponseBodyExecuteOptions setFailureMode(String failureMode) {
            this.failureMode = failureMode;
            return this;
        }
        public String getFailureMode() {
            return this.failureMode;
        }

        public GetRunResponseBodyExecuteOptions setUseRelativeOutputPaths(Boolean useRelativeOutputPaths) {
            this.useRelativeOutputPaths = useRelativeOutputPaths;
            return this;
        }
        public Boolean getUseRelativeOutputPaths() {
            return this.useRelativeOutputPaths;
        }

    }

}
