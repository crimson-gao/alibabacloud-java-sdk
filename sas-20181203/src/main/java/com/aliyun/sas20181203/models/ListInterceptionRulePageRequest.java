// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInterceptionRulePageRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The query condition.</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The type of the query condition. Valid values:</p>
     * <br>
     * <p>*   **ID**</p>
     * <p>*   **RULE_NAME**</p>
     * <p>*   **SRC_TARGET**</p>
     * <p>*   **DST_TARGET**</p>
     * <p>*   **DST_PORT**</p>
     * <p>*   **RULE_SWITCH**</p>
     * <p>*   **INTERCEPTOR_TYPE**</p>
     */
    @NameInMap("CriteriaType")
    public String criteriaType;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListInterceptionRulePageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInterceptionRulePageRequest self = new ListInterceptionRulePageRequest();
        return TeaModel.build(map, self);
    }

    public ListInterceptionRulePageRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListInterceptionRulePageRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public ListInterceptionRulePageRequest setCriteriaType(String criteriaType) {
        this.criteriaType = criteriaType;
        return this;
    }
    public String getCriteriaType() {
        return this.criteriaType;
    }

    public ListInterceptionRulePageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListInterceptionRulePageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
