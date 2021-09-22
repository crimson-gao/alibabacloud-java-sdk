// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryTicketsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CaseId")
    public Long caseId;

    @NameInMap("CaseType")
    public Integer caseType;

    @NameInMap("CaseStatus")
    public Integer caseStatus;

    @NameInMap("SrType")
    public Long srType;

    @NameInMap("TaskStatus")
    public Integer taskStatus;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ChannelType")
    public Integer channelType;

    @NameInMap("TouchId")
    public Long touchId;

    @NameInMap("DealId")
    public Long dealId;

    @NameInMap("Extra")
    public java.util.Map<String, ?> extra;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("MemberId")
    public Long memberId;

    @NameInMap("ParentCaseId")
    public Long parentCaseId;

    @NameInMap("StartCaseGmtCreate")
    public Long startCaseGmtCreate;

    @NameInMap("EndCaseGmtCreate")
    public Long endCaseGmtCreate;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    public static QueryTicketsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketsRequest self = new QueryTicketsRequest();
        return TeaModel.build(map, self);
    }

    public QueryTicketsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTicketsRequest setCaseId(Long caseId) {
        this.caseId = caseId;
        return this;
    }
    public Long getCaseId() {
        return this.caseId;
    }

    public QueryTicketsRequest setCaseType(Integer caseType) {
        this.caseType = caseType;
        return this;
    }
    public Integer getCaseType() {
        return this.caseType;
    }

    public QueryTicketsRequest setCaseStatus(Integer caseStatus) {
        this.caseStatus = caseStatus;
        return this;
    }
    public Integer getCaseStatus() {
        return this.caseStatus;
    }

    public QueryTicketsRequest setSrType(Long srType) {
        this.srType = srType;
        return this;
    }
    public Long getSrType() {
        return this.srType;
    }

    public QueryTicketsRequest setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public QueryTicketsRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryTicketsRequest setChannelType(Integer channelType) {
        this.channelType = channelType;
        return this;
    }
    public Integer getChannelType() {
        return this.channelType;
    }

    public QueryTicketsRequest setTouchId(Long touchId) {
        this.touchId = touchId;
        return this;
    }
    public Long getTouchId() {
        return this.touchId;
    }

    public QueryTicketsRequest setDealId(Long dealId) {
        this.dealId = dealId;
        return this;
    }
    public Long getDealId() {
        return this.dealId;
    }

    public QueryTicketsRequest setExtra(java.util.Map<String, ?> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    public QueryTicketsRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public QueryTicketsRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public QueryTicketsRequest setParentCaseId(Long parentCaseId) {
        this.parentCaseId = parentCaseId;
        return this;
    }
    public Long getParentCaseId() {
        return this.parentCaseId;
    }

    public QueryTicketsRequest setStartCaseGmtCreate(Long startCaseGmtCreate) {
        this.startCaseGmtCreate = startCaseGmtCreate;
        return this;
    }
    public Long getStartCaseGmtCreate() {
        return this.startCaseGmtCreate;
    }

    public QueryTicketsRequest setEndCaseGmtCreate(Long endCaseGmtCreate) {
        this.endCaseGmtCreate = endCaseGmtCreate;
        return this;
    }
    public Long getEndCaseGmtCreate() {
        return this.endCaseGmtCreate;
    }

    public QueryTicketsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTicketsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
