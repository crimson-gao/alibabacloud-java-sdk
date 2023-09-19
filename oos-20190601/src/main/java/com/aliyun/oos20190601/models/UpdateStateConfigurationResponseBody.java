// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateStateConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the configuration.</p>
     */
    @NameInMap("StateConfiguration")
    public java.util.List<UpdateStateConfigurationResponseBodyStateConfiguration> stateConfiguration;

    public static UpdateStateConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateStateConfigurationResponseBody self = new UpdateStateConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateStateConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateStateConfigurationResponseBody setStateConfiguration(java.util.List<UpdateStateConfigurationResponseBodyStateConfiguration> stateConfiguration) {
        this.stateConfiguration = stateConfiguration;
        return this;
    }
    public java.util.List<UpdateStateConfigurationResponseBodyStateConfiguration> getStateConfiguration() {
        return this.stateConfiguration;
    }

    public static class UpdateStateConfigurationResponseBodyStateConfiguration extends TeaModel {
        /**
         * <p>The configuration mode. Valid values:</p>
         */
        @NameInMap("ConfigureMode")
        public String configureMode;

        /**
         * <p>The time when the configuration was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the desired-state configuration.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The parameters.</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The resource group ID.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The CRON expression.</p>
         */
        @NameInMap("ScheduleExpression")
        public String scheduleExpression;

        /**
         * <p>The schedule type.</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        /**
         * <p>The ID of the desired-state configuration.</p>
         */
        @NameInMap("StateConfigurationId")
        public String stateConfigurationId;

        /**
         * <p>The tags added to the configuration.</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The queried resources.</p>
         */
        @NameInMap("Targets")
        public String targets;

        /**
         * <p>The template ID.</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The name of the template.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The name of the template version.</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <p>The time when the configuration was updated.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static UpdateStateConfigurationResponseBodyStateConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateStateConfigurationResponseBodyStateConfiguration self = new UpdateStateConfigurationResponseBodyStateConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setConfigureMode(String configureMode) {
            this.configureMode = configureMode;
            return this;
        }
        public String getConfigureMode() {
            return this.configureMode;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }
        public String getScheduleExpression() {
            return this.scheduleExpression;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setStateConfigurationId(String stateConfigurationId) {
            this.stateConfigurationId = stateConfigurationId;
            return this;
        }
        public String getStateConfigurationId() {
            return this.stateConfigurationId;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setTargets(String targets) {
            this.targets = targets;
            return this;
        }
        public String getTargets() {
            return this.targets;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
