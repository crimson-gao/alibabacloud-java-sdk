// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Body extends TeaModel {
    // Boundary
    @NameInMap("Boundary")
    public Boundary boundary;

    // Confidence
    @NameInMap("Confidence")
    public Float confidence;

    public static Body build(java.util.Map<String, ?> map) throws Exception {
        Body self = new Body();
        return TeaModel.build(map, self);
    }

    public Body setBoundary(Boundary boundary) {
        this.boundary = boundary;
        return this;
    }
    public Boundary getBoundary() {
        return this.boundary;
    }

    public Body setConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }
    public Float getConfidence() {
        return this.confidence;
    }

    public static class AddStoryFilesResponseBodyFiles extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("URI")
        public String URI;

        public static AddStoryFilesResponseBodyFiles build(java.util.Map<String, ?> map) throws Exception {
            AddStoryFilesResponseBodyFiles self = new AddStoryFilesResponseBodyFiles();
            return TeaModel.build(map, self);
        }

        public AddStoryFilesResponseBodyFiles setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public AddStoryFilesResponseBodyFiles setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public AddStoryFilesResponseBodyFiles setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class BatchUpdateFileMetaResponseBodyFiles extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("URI")
        public String URI;

        public static BatchUpdateFileMetaResponseBodyFiles build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateFileMetaResponseBodyFiles self = new BatchUpdateFileMetaResponseBodyFiles();
            return TeaModel.build(map, self);
        }

        public BatchUpdateFileMetaResponseBodyFiles setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchUpdateFileMetaResponseBodyFiles setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public BatchUpdateFileMetaResponseBodyFiles setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class DetectImageScoreResponseBodyImageScore extends TeaModel {
        @NameInMap("OverallQualityScore")
        public Float overallQualityScore;

        public static DetectImageScoreResponseBodyImageScore build(java.util.Map<String, ?> map) throws Exception {
            DetectImageScoreResponseBodyImageScore self = new DetectImageScoreResponseBodyImageScore();
            return TeaModel.build(map, self);
        }

        public DetectImageScoreResponseBodyImageScore setOverallQualityScore(Float overallQualityScore) {
            this.overallQualityScore = overallQualityScore;
            return this;
        }
        public Float getOverallQualityScore() {
            return this.overallQualityScore;
        }

    }

    public static class SemanticQueryResponseBodyAggregationsGroups extends TeaModel {
        // 分组聚合的计数
        @NameInMap("Count")
        public Long count;

        // 分组聚合的值
        @NameInMap("Value")
        public String value;

        public static SemanticQueryResponseBodyAggregationsGroups build(java.util.Map<String, ?> map) throws Exception {
            SemanticQueryResponseBodyAggregationsGroups self = new SemanticQueryResponseBodyAggregationsGroups();
            return TeaModel.build(map, self);
        }

        public SemanticQueryResponseBodyAggregationsGroups setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public SemanticQueryResponseBodyAggregationsGroups setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SemanticQueryResponseBodyAggregations extends TeaModel {
        // 聚合字段名
        @NameInMap("Field")
        public String field;

        // 分组聚合的结果
        @NameInMap("Groups")
        public java.util.List<SemanticQueryResponseBodyAggregationsGroups> groups;

        // 聚合字段的聚合操作符
        @NameInMap("Operation")
        public String operation;

        // 聚合的统计结果
        @NameInMap("Value")
        public Float value;

        public static SemanticQueryResponseBodyAggregations build(java.util.Map<String, ?> map) throws Exception {
            SemanticQueryResponseBodyAggregations self = new SemanticQueryResponseBodyAggregations();
            return TeaModel.build(map, self);
        }

        public SemanticQueryResponseBodyAggregations setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public SemanticQueryResponseBodyAggregations setGroups(java.util.List<SemanticQueryResponseBodyAggregationsGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<SemanticQueryResponseBodyAggregationsGroups> getGroups() {
            return this.groups;
        }

        public SemanticQueryResponseBodyAggregations setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public SemanticQueryResponseBodyAggregations setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class SimpleQueryResponseBodyAggregationsGroups extends TeaModel {
        // 分组聚合的计数
        @NameInMap("Count")
        public Long count;

        // 分组聚合的值
        @NameInMap("Value")
        public String value;

        public static SimpleQueryResponseBodyAggregationsGroups build(java.util.Map<String, ?> map) throws Exception {
            SimpleQueryResponseBodyAggregationsGroups self = new SimpleQueryResponseBodyAggregationsGroups();
            return TeaModel.build(map, self);
        }

        public SimpleQueryResponseBodyAggregationsGroups setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public SimpleQueryResponseBodyAggregationsGroups setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SimpleQueryResponseBodyAggregations extends TeaModel {
        // 聚合字段名
        @NameInMap("Field")
        public String field;

        // 分组聚合的结果
        @NameInMap("Groups")
        public java.util.List<SimpleQueryResponseBodyAggregationsGroups> groups;

        // 聚合字段的聚合操作符
        @NameInMap("Operation")
        public String operation;

        @NameInMap("Value")
        public Double value;

        public static SimpleQueryResponseBodyAggregations build(java.util.Map<String, ?> map) throws Exception {
            SimpleQueryResponseBodyAggregations self = new SimpleQueryResponseBodyAggregations();
            return TeaModel.build(map, self);
        }

        public SimpleQueryResponseBodyAggregations setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public SimpleQueryResponseBodyAggregations setGroups(java.util.List<SimpleQueryResponseBodyAggregationsGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<SimpleQueryResponseBodyAggregationsGroups> getGroups() {
            return this.groups;
        }

        public SimpleQueryResponseBodyAggregations setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public SimpleQueryResponseBodyAggregations setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

}
