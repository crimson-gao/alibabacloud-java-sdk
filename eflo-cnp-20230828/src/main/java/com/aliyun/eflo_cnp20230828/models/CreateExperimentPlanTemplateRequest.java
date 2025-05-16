// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class CreateExperimentPlanTemplateRequest extends TeaModel {
    /**
     * <p>Privacy Level</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("PrivacyLevel")
    public String privacyLevel;

    /**
     * <p>Template Description</p>
     * 
     * <strong>example:</strong>
     * <p>The template installs jdk and tomcat on a new ECS instance.</p>
     */
    @NameInMap("TemplateDescription")
    public String templateDescription;

    /**
     * <p>Template ID</p>
     * 
     * <strong>example:</strong>
     * <p>4724</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>Template Name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>Template Pipeline</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplatePipeline")
    public java.util.List<CreateExperimentPlanTemplateRequestTemplatePipeline> templatePipeline;

    public static CreateExperimentPlanTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentPlanTemplateRequest self = new CreateExperimentPlanTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateExperimentPlanTemplateRequest setPrivacyLevel(String privacyLevel) {
        this.privacyLevel = privacyLevel;
        return this;
    }
    public String getPrivacyLevel() {
        return this.privacyLevel;
    }

    public CreateExperimentPlanTemplateRequest setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }
    public String getTemplateDescription() {
        return this.templateDescription;
    }

    public CreateExperimentPlanTemplateRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public CreateExperimentPlanTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateExperimentPlanTemplateRequest setTemplatePipeline(java.util.List<CreateExperimentPlanTemplateRequestTemplatePipeline> templatePipeline) {
        this.templatePipeline = templatePipeline;
        return this;
    }
    public java.util.List<CreateExperimentPlanTemplateRequestTemplatePipeline> getTemplatePipeline() {
        return this.templatePipeline;
    }

    public static class CreateExperimentPlanTemplateRequestTemplatePipelineEnvParams extends TeaModel {
        /**
         * <p>CPU allocation count</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("CpuPerWorker")
        public Integer cpuPerWorker;

        /**
         * <p>CUDA Version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("CudaVersion")
        public String cudaVersion;

        /**
         * <p>GPU Driver Version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        /**
         * <p>GPU allocation count</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("GpuPerWorker")
        public Integer gpuPerWorker;

        /**
         * <p>Memory (GB) allocation count</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MemoryPerWorker")
        public Integer memoryPerWorker;

        /**
         * <p>NCCL Version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("NCCLVersion")
        public String NCCLVersion;

        /**
         * <p>PyTorch Version</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("PyTorchVersion")
        public String pyTorchVersion;

        /**
         * <p>Shared Memory (GB) allocation count</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("ShareMemory")
        public Integer shareMemory;

        /**
         * <p>Number of nodes</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WorkerNum")
        public Integer workerNum;

        public static CreateExperimentPlanTemplateRequestTemplatePipelineEnvParams build(java.util.Map<String, ?> map) throws Exception {
            CreateExperimentPlanTemplateRequestTemplatePipelineEnvParams self = new CreateExperimentPlanTemplateRequestTemplatePipelineEnvParams();
            return TeaModel.build(map, self);
        }

        public CreateExperimentPlanTemplateRequestTemplatePipelineEnvParams setCpuPerWorker(Integer cpuPerWorker) {
            this.cpuPerWorker = cpuPerWorker;
            return this;
        }
        public Integer getCpuPerWorker() {
            return this.cpuPerWorker;
        }

        public CreateExperimentPlanTemplateRequestTemplatePipelineEnvParams setCudaVersion(String cudaVersion) {
            this.cudaVersion = cudaVersion;
            return this;
        }
        public String getCudaVersion() {
            return this.cudaVersion;
        }

        public CreateExperimentPlanTemplateRequestTemplatePipelineEnvParams setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public CreateExperimentPlanTemplateRequestTemplatePipelineEnvParams setGpuPerWorker(Integer gpuPerWorker) {
            this.gpuPerWorker = gpuPerWorker;
            return this;
        }
        public Integer getGpuPerWorker() {
            return this.gpuPerWorker;
        }

        public CreateExperimentPlanTemplateRequestTemplatePipelineEnvParams setMemoryPerWorker(Integer memoryPerWorker) {
            this.memoryPerWorker = memoryPerWorker;
            return this;
        }
        public Integer getMemoryPerWorker() {
            return this.memoryPerWorker;
        }

        public CreateExperimentPlanTemplateRequestTemplatePipelineEnvParams setNCCLVersion(String NCCLVersion) {
            this.NCCLVersion = NCCLVersion;
            return this;
        }
        public String getNCCLVersion() {
            return this.NCCLVersion;
        }

        public CreateExperimentPlanTemplateRequestTemplatePipelineEnvParams setPyTorchVersion(String pyTorchVersion) {
            this.pyTorchVersion = pyTorchVersion;
            return this;
        }
        public String getPyTorchVersion() {
            return this.pyTorchVersion;
        }

        public CreateExperimentPlanTemplateRequestTemplatePipelineEnvParams setShareMemory(Integer shareMemory) {
            this.shareMemory = shareMemory;
            return this;
        }
        public Integer getShareMemory() {
            return this.shareMemory;
        }

        public CreateExperimentPlanTemplateRequestTemplatePipelineEnvParams setWorkerNum(Integer workerNum) {
            this.workerNum = workerNum;
            return this;
        }
        public Integer getWorkerNum() {
            return this.workerNum;
        }

    }

    public static class CreateExperimentPlanTemplateRequestTemplatePipeline extends TeaModel {
        /**
         * <p>Configured Environment Parameters</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("EnvParams")
        public CreateExperimentPlanTemplateRequestTemplatePipelineEnvParams envParams;

        /**
         * <p>Node Order Number</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PipelineOrder")
        public Integer pipelineOrder;

        /**
         * <p>Usage Scenario, e.g., &quot;baseline&quot;</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>baseline</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>Configured Workload Parameters</p>
         */
        @NameInMap("SettingParams")
        public java.util.Map<String, String> settingParams;

        /**
         * <p>Workload ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("WorkloadId")
        public Long workloadId;

        /**
         * <p>Workload Name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorkloadName")
        public String workloadName;

        public static CreateExperimentPlanTemplateRequestTemplatePipeline build(java.util.Map<String, ?> map) throws Exception {
            CreateExperimentPlanTemplateRequestTemplatePipeline self = new CreateExperimentPlanTemplateRequestTemplatePipeline();
            return TeaModel.build(map, self);
        }

        public CreateExperimentPlanTemplateRequestTemplatePipeline setEnvParams(CreateExperimentPlanTemplateRequestTemplatePipelineEnvParams envParams) {
            this.envParams = envParams;
            return this;
        }
        public CreateExperimentPlanTemplateRequestTemplatePipelineEnvParams getEnvParams() {
            return this.envParams;
        }

        public CreateExperimentPlanTemplateRequestTemplatePipeline setPipelineOrder(Integer pipelineOrder) {
            this.pipelineOrder = pipelineOrder;
            return this;
        }
        public Integer getPipelineOrder() {
            return this.pipelineOrder;
        }

        public CreateExperimentPlanTemplateRequestTemplatePipeline setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public CreateExperimentPlanTemplateRequestTemplatePipeline setSettingParams(java.util.Map<String, String> settingParams) {
            this.settingParams = settingParams;
            return this;
        }
        public java.util.Map<String, String> getSettingParams() {
            return this.settingParams;
        }

        public CreateExperimentPlanTemplateRequestTemplatePipeline setWorkloadId(Long workloadId) {
            this.workloadId = workloadId;
            return this;
        }
        public Long getWorkloadId() {
            return this.workloadId;
        }

        public CreateExperimentPlanTemplateRequestTemplatePipeline setWorkloadName(String workloadName) {
            this.workloadName = workloadName;
            return this;
        }
        public String getWorkloadName() {
            return this.workloadName;
        }

    }

}
