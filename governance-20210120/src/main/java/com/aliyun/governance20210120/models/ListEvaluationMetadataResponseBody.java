// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEvaluationMetadataResponseBody extends TeaModel {
    @NameInMap("EvaluationMetadata")
    public java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadata> evaluationMetadata;

    /**
     * <strong>example:</strong>
     * <p>16B208DD-86BD-5E7D-AC93-FFD44B6FBDF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListEvaluationMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationMetadataResponseBody self = new ListEvaluationMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEvaluationMetadataResponseBody setEvaluationMetadata(java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadata> evaluationMetadata) {
        this.evaluationMetadata = evaluationMetadata;
        return this;
    }
    public java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadata> getEvaluationMetadata() {
        return this.evaluationMetadata;
    }

    public ListEvaluationMetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActionsGuidance extends TeaModel {
        @NameInMap("ButtonName")
        public String buttonName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://ram.console.aliyun.com/users">https://ram.console.aliyun.com/users</a></p>
         */
        @NameInMap("ButtonRef")
        public String buttonRef;

        @NameInMap("Content")
        public String content;

        @NameInMap("Title")
        public String title;

        public static ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActionsGuidance build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActionsGuidance self = new ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActionsGuidance();
            return TeaModel.build(map, self);
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActionsGuidance setButtonName(String buttonName) {
            this.buttonName = buttonName;
            return this;
        }
        public String getButtonName() {
            return this.buttonName;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActionsGuidance setButtonRef(String buttonRef) {
            this.buttonRef = buttonRef;
            return this;
        }
        public String getButtonRef() {
            return this.buttonRef;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActionsGuidance setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActionsGuidance setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>UnusedAccessKeyInRamUser</p>
         */
        @NameInMap("Classification")
        public String classification;

        @NameInMap("CostDescription")
        public String costDescription;

        @NameInMap("Description")
        public String description;

        @NameInMap("Guidance")
        public java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActionsGuidance> guidance;

        @NameInMap("Notice")
        public String notice;

        @NameInMap("Suggestion")
        public String suggestion;

        public static ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActions build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActions self = new ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActions();
            return TeaModel.build(map, self);
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActions setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActions setCostDescription(String costDescription) {
            this.costDescription = costDescription;
            return this;
        }
        public String getCostDescription() {
            return this.costDescription;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActions setGuidance(java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActionsGuidance> guidance) {
            this.guidance = guidance;
            return this;
        }
        public java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActionsGuidance> getGuidance() {
            return this.guidance;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActions setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActions setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediation extends TeaModel {
        @NameInMap("Actions")
        public java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActions> actions;

        /**
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("RemediationType")
        public String remediationType;

        public static ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediation build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediation self = new ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediation();
            return TeaModel.build(map, self);
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediation setActions(java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediationActions> getActions() {
            return this.actions;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediation setRemediationType(String remediationType) {
            this.remediationType = remediationType;
            return this;
        }
        public String getRemediationType() {
            return this.remediationType;
        }

    }

    public static class ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadata extends TeaModel {
        @NameInMap("Remediation")
        public java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediation> remediation;

        public static ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadata build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadata self = new ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadata();
            return TeaModel.build(map, self);
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadata setRemediation(java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediation> remediation) {
            this.remediation = remediation;
            return this;
        }
        public java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadataRemediation> getRemediation() {
            return this.remediation;
        }

    }

    public static class ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadataResourcePropertyMetadata extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>AkLastUsedTime</p>
         */
        @NameInMap("PropertyName")
        public String propertyName;

        /**
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("PropertyType")
        public String propertyType;

        public static ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadataResourcePropertyMetadata build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadataResourcePropertyMetadata self = new ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadataResourcePropertyMetadata();
            return TeaModel.build(map, self);
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadataResourcePropertyMetadata setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadataResourcePropertyMetadata setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadataResourcePropertyMetadata setPropertyType(String propertyType) {
            this.propertyType = propertyType;
            return this;
        }
        public String getPropertyType() {
            return this.propertyType;
        }

    }

    public static class ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadata extends TeaModel {
        @NameInMap("ResourcePropertyMetadata")
        public java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadataResourcePropertyMetadata> resourcePropertyMetadata;

        public static ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadata build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadata self = new ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadata();
            return TeaModel.build(map, self);
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadata setResourcePropertyMetadata(java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadataResourcePropertyMetadata> resourcePropertyMetadata) {
            this.resourcePropertyMetadata = resourcePropertyMetadata;
            return this;
        }
        public java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadataResourcePropertyMetadata> getResourcePropertyMetadata() {
            return this.resourcePropertyMetadata;
        }

    }

    public static class ListEvaluationMetadataResponseBodyEvaluationMetadataMetadata extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Security</p>
         */
        @NameInMap("Category")
        public String category;

        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>pxgtda****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("RecommendationLevel")
        public String recommendationLevel;

        @NameInMap("RemediationMetadata")
        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadata remediationMetadata;

        @NameInMap("ResourceMetadata")
        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadata resourceMetadata;

        /**
         * <strong>example:</strong>
         * <p>Account</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <strong>example:</strong>
         * <p>Released</p>
         */
        @NameInMap("Stage")
        public String stage;

        public static ListEvaluationMetadataResponseBodyEvaluationMetadataMetadata build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationMetadataResponseBodyEvaluationMetadataMetadata self = new ListEvaluationMetadataResponseBodyEvaluationMetadataMetadata();
            return TeaModel.build(map, self);
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadata setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadata setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadata setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadata setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadata setRecommendationLevel(String recommendationLevel) {
            this.recommendationLevel = recommendationLevel;
            return this;
        }
        public String getRecommendationLevel() {
            return this.recommendationLevel;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadata setRemediationMetadata(ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadata remediationMetadata) {
            this.remediationMetadata = remediationMetadata;
            return this;
        }
        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataRemediationMetadata getRemediationMetadata() {
            return this.remediationMetadata;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadata setResourceMetadata(ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadata resourceMetadata) {
            this.resourceMetadata = resourceMetadata;
            return this;
        }
        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadataResourceMetadata getResourceMetadata() {
            return this.resourceMetadata;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadata setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadataMetadata setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

    }

    public static class ListEvaluationMetadataResponseBodyEvaluationMetadata extends TeaModel {
        @NameInMap("Metadata")
        public java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadataMetadata> metadata;

        /**
         * <strong>example:</strong>
         * <p>Metric</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListEvaluationMetadataResponseBodyEvaluationMetadata build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationMetadataResponseBodyEvaluationMetadata self = new ListEvaluationMetadataResponseBodyEvaluationMetadata();
            return TeaModel.build(map, self);
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadata setMetadata(java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadataMetadata> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.List<ListEvaluationMetadataResponseBodyEvaluationMetadataMetadata> getMetadata() {
            return this.metadata;
        }

        public ListEvaluationMetadataResponseBodyEvaluationMetadata setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
