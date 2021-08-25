// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListCompliancePackTemplatesResponseBody extends TeaModel {
    @NameInMap("CompliancePackTemplatesResult")
    public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult compliancePackTemplatesResult;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCompliancePackTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCompliancePackTemplatesResponseBody self = new ListCompliancePackTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCompliancePackTemplatesResponseBody setCompliancePackTemplatesResult(ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult compliancePackTemplatesResult) {
        this.compliancePackTemplatesResult = compliancePackTemplatesResult;
        return this;
    }
    public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult getCompliancePackTemplatesResult() {
        return this.compliancePackTemplatesResult;
    }

    public ListCompliancePackTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters extends TeaModel {
        @NameInMap("Required")
        public Boolean required;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters build(java.util.Map<String, ?> map) throws Exception {
            ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters self = new ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters();
            return TeaModel.build(map, self);
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        @NameInMap("ManagedRuleName")
        public String managedRuleName;

        @NameInMap("ConfigRuleParameters")
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters> configRuleParameters;

        public static ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules build(java.util.Map<String, ?> map) throws Exception {
            ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules self = new ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules();
            return TeaModel.build(map, self);
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules setManagedRuleIdentifier(String managedRuleIdentifier) {
            this.managedRuleIdentifier = managedRuleIdentifier;
            return this;
        }
        public String getManagedRuleIdentifier() {
            return this.managedRuleIdentifier;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules setManagedRuleName(String managedRuleName) {
            this.managedRuleName = managedRuleName;
            return this;
        }
        public String getManagedRuleName() {
            return this.managedRuleName;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules setConfigRuleParameters(java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters> configRuleParameters) {
            this.configRuleParameters = configRuleParameters;
            return this;
        }
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRulesConfigRuleParameters> getConfigRuleParameters() {
            return this.configRuleParameters;
        }

    }

    public static class ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates extends TeaModel {
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        @NameInMap("Description")
        public String description;

        @NameInMap("ConfigRules")
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules> configRules;

        @NameInMap("CompliancePackTemplateName")
        public String compliancePackTemplateName;

        @NameInMap("CompliancePackTemplateId")
        public String compliancePackTemplateId;

        public static ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates self = new ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates();
            return TeaModel.build(map, self);
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates setConfigRules(java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules> configRules) {
            this.configRules = configRules;
            return this;
        }
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplatesConfigRules> getConfigRules() {
            return this.configRules;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates setCompliancePackTemplateName(String compliancePackTemplateName) {
            this.compliancePackTemplateName = compliancePackTemplateName;
            return this;
        }
        public String getCompliancePackTemplateName() {
            return this.compliancePackTemplateName;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates setCompliancePackTemplateId(String compliancePackTemplateId) {
            this.compliancePackTemplateId = compliancePackTemplateId;
            return this;
        }
        public String getCompliancePackTemplateId() {
            return this.compliancePackTemplateId;
        }

    }

    public static class ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult extends TeaModel {
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("CompliancePackTemplates")
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates> compliancePackTemplates;

        public static ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult build(java.util.Map<String, ?> map) throws Exception {
            ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult self = new ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult();
            return TeaModel.build(map, self);
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResult setCompliancePackTemplates(java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates> compliancePackTemplates) {
            this.compliancePackTemplates = compliancePackTemplates;
            return this;
        }
        public java.util.List<ListCompliancePackTemplatesResponseBodyCompliancePackTemplatesResultCompliancePackTemplates> getCompliancePackTemplates() {
            return this.compliancePackTemplates;
        }

    }

}
