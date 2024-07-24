// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListRulesV4Request extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    @NameInMap("BusinessName")
    public String businessName;

    @NameInMap("BusinessRange")
    public Integer businessRange;

    @NameInMap("CategoryName")
    public String categoryName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CountTotal")
    public Boolean countTotal;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CreateEmpid")
    public String createEmpid;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CreateUserId")
    public Long createUserId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>2021-11-29 19:11:09</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LastUpdateEmpid")
    public String lastUpdateEmpid;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequireInfos")
    public java.util.List<String> requireInfos;

    /**
     * <strong>example:</strong>
     * <p>895EAD5312634F5AA708E3B3FA79662E</p>
     */
    @NameInMap("Rid")
    public Long rid;

    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("RuleIdOrRuleName")
    public String ruleIdOrRuleName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleScoreSingleType")
    public Integer ruleScoreSingleType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <strong>example:</strong>
     * <p>1000000090</p>
     */
    @NameInMap("SchemeId")
    public Long schemeId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SourceType")
    public Integer sourceType;

    /**
     * <strong>example:</strong>
     * <p>2021-11-29 18:11:09</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Integer type;

    @NameInMap("TypeName")
    public String typeName;

    /**
     * <strong>example:</strong>
     * <p>2021-11-29 18:11:09</p>
     */
    @NameInMap("UpdateEndTime")
    public String updateEndTime;

    /**
     * <strong>example:</strong>
     * <p>2021-11-29 16:11:09</p>
     */
    @NameInMap("UpdateStartTime")
    public String updateStartTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UpdateUserId")
    public Long updateUserId;

    public static ListRulesV4Request build(java.util.Map<String, ?> map) throws Exception {
        ListRulesV4Request self = new ListRulesV4Request();
        return TeaModel.build(map, self);
    }

    public ListRulesV4Request setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public ListRulesV4Request setBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }
    public String getBusinessName() {
        return this.businessName;
    }

    public ListRulesV4Request setBusinessRange(Integer businessRange) {
        this.businessRange = businessRange;
        return this;
    }
    public Integer getBusinessRange() {
        return this.businessRange;
    }

    public ListRulesV4Request setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public ListRulesV4Request setCountTotal(Boolean countTotal) {
        this.countTotal = countTotal;
        return this;
    }
    public Boolean getCountTotal() {
        return this.countTotal;
    }

    public ListRulesV4Request setCreateEmpid(String createEmpid) {
        this.createEmpid = createEmpid;
        return this;
    }
    public String getCreateEmpid() {
        return this.createEmpid;
    }

    public ListRulesV4Request setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public Long getCreateUserId() {
        return this.createUserId;
    }

    public ListRulesV4Request setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListRulesV4Request setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListRulesV4Request setLastUpdateEmpid(String lastUpdateEmpid) {
        this.lastUpdateEmpid = lastUpdateEmpid;
        return this;
    }
    public String getLastUpdateEmpid() {
        return this.lastUpdateEmpid;
    }

    public ListRulesV4Request setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRulesV4Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRulesV4Request setRequireInfos(java.util.List<String> requireInfos) {
        this.requireInfos = requireInfos;
        return this;
    }
    public java.util.List<String> getRequireInfos() {
        return this.requireInfos;
    }

    public ListRulesV4Request setRid(Long rid) {
        this.rid = rid;
        return this;
    }
    public Long getRid() {
        return this.rid;
    }

    public ListRulesV4Request setRuleIdOrRuleName(String ruleIdOrRuleName) {
        this.ruleIdOrRuleName = ruleIdOrRuleName;
        return this;
    }
    public String getRuleIdOrRuleName() {
        return this.ruleIdOrRuleName;
    }

    public ListRulesV4Request setRuleScoreSingleType(Integer ruleScoreSingleType) {
        this.ruleScoreSingleType = ruleScoreSingleType;
        return this;
    }
    public Integer getRuleScoreSingleType() {
        return this.ruleScoreSingleType;
    }

    public ListRulesV4Request setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public ListRulesV4Request setSchemeId(Long schemeId) {
        this.schemeId = schemeId;
        return this;
    }
    public Long getSchemeId() {
        return this.schemeId;
    }

    public ListRulesV4Request setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public Integer getSourceType() {
        return this.sourceType;
    }

    public ListRulesV4Request setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListRulesV4Request setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListRulesV4Request setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public ListRulesV4Request setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

    public ListRulesV4Request setUpdateEndTime(String updateEndTime) {
        this.updateEndTime = updateEndTime;
        return this;
    }
    public String getUpdateEndTime() {
        return this.updateEndTime;
    }

    public ListRulesV4Request setUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
        return this;
    }
    public String getUpdateStartTime() {
        return this.updateStartTime;
    }

    public ListRulesV4Request setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
        return this;
    }
    public Long getUpdateUserId() {
        return this.updateUserId;
    }

}
