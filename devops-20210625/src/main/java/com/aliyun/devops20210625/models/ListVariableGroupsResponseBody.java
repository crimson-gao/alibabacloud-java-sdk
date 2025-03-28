// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListVariableGroupsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>assassa</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    @NameInMap("variableGroups")
    public java.util.List<ListVariableGroupsResponseBodyVariableGroups> variableGroups;

    public static ListVariableGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVariableGroupsResponseBody self = new ListVariableGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVariableGroupsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListVariableGroupsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListVariableGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVariableGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVariableGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListVariableGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListVariableGroupsResponseBody setVariableGroups(java.util.List<ListVariableGroupsResponseBodyVariableGroups> variableGroups) {
        this.variableGroups = variableGroups;
        return this;
    }
    public java.util.List<ListVariableGroupsResponseBodyVariableGroups> getVariableGroups() {
        return this.variableGroups;
    }

    public static class ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>流水线</p>
         */
        @NameInMap("name")
        public String name;

        public static ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines build(java.util.Map<String, ?> map) throws Exception {
            ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines self = new ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines();
            return TeaModel.build(map, self);
        }

        public ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListVariableGroupsResponseBodyVariableGroupsVariables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isEncrypted")
        public Boolean isEncrypted;

        /**
         * <strong>example:</strong>
         * <p>name1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("value")
        public String value;

        public static ListVariableGroupsResponseBodyVariableGroupsVariables build(java.util.Map<String, ?> map) throws Exception {
            ListVariableGroupsResponseBodyVariableGroupsVariables self = new ListVariableGroupsResponseBodyVariableGroupsVariables();
            return TeaModel.build(map, self);
        }

        public ListVariableGroupsResponseBodyVariableGroupsVariables setIsEncrypted(Boolean isEncrypted) {
            this.isEncrypted = isEncrypted;
            return this;
        }
        public Boolean getIsEncrypted() {
            return this.isEncrypted;
        }

        public ListVariableGroupsResponseBodyVariableGroupsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVariableGroupsResponseBodyVariableGroupsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListVariableGroupsResponseBodyVariableGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1586863220000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>13232343434343</p>
         */
        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        /**
         * <strong>example:</strong>
         * <p>变量组</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>12234</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>13232343434343</p>
         */
        @NameInMap("modifierAccountId")
        public String modifierAccountId;

        /**
         * <strong>example:</strong>
         * <p>变量组</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("relatedPipelines")
        public java.util.List<ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines> relatedPipelines;

        /**
         * <strong>example:</strong>
         * <p>1586863220000</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        @NameInMap("variables")
        public java.util.List<ListVariableGroupsResponseBodyVariableGroupsVariables> variables;

        public static ListVariableGroupsResponseBodyVariableGroups build(java.util.Map<String, ?> map) throws Exception {
            ListVariableGroupsResponseBodyVariableGroups self = new ListVariableGroupsResponseBodyVariableGroups();
            return TeaModel.build(map, self);
        }

        public ListVariableGroupsResponseBodyVariableGroups setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListVariableGroupsResponseBodyVariableGroups setCreatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        public ListVariableGroupsResponseBodyVariableGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVariableGroupsResponseBodyVariableGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListVariableGroupsResponseBodyVariableGroups setModifierAccountId(String modifierAccountId) {
            this.modifierAccountId = modifierAccountId;
            return this;
        }
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        public ListVariableGroupsResponseBodyVariableGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVariableGroupsResponseBodyVariableGroups setRelatedPipelines(java.util.List<ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines> relatedPipelines) {
            this.relatedPipelines = relatedPipelines;
            return this;
        }
        public java.util.List<ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines> getRelatedPipelines() {
            return this.relatedPipelines;
        }

        public ListVariableGroupsResponseBodyVariableGroups setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListVariableGroupsResponseBodyVariableGroups setVariables(java.util.List<ListVariableGroupsResponseBodyVariableGroupsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ListVariableGroupsResponseBodyVariableGroupsVariables> getVariables() {
            return this.variables;
        }

    }

}
