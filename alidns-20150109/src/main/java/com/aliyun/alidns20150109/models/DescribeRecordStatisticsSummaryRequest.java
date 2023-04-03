// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsSummaryRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The end of the time range to query. Specify the time in the **YYYY-MM-DD** format.</p>
     * <br>
     * <p>The default value is the day when you perform the operation.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The keyword for searches in %KeyWord% mode. The value is not case-sensitive.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language type.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of the page to return. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **100**. Minimum value: **1**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The search mode of the keyword. Valid values:</p>
     * <br>
     * <p>*   **LIKE**: fuzzy match (default).</p>
     * <p>*   **EXACT**: exact match.</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>The beginning of the time range to query. Specify the time in the **YYYY-MM-DD** format.</p>
     * <br>
     * <p>You can only query DNS records of the last 90 days.</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The threshold of query volume that can be obtained. You can also obtain data about a domain name with the query volume less than or equal to the threshold. For example, if you set this parameter to 100, you can query domain names with less than 100 queries.</p>
     */
    @NameInMap("Threshold")
    public Long threshold;

    public static DescribeRecordStatisticsSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordStatisticsSummaryRequest self = new DescribeRecordStatisticsSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecordStatisticsSummaryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeRecordStatisticsSummaryRequest setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public DescribeRecordStatisticsSummaryRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeRecordStatisticsSummaryRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeRecordStatisticsSummaryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRecordStatisticsSummaryRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRecordStatisticsSummaryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRecordStatisticsSummaryRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

    public DescribeRecordStatisticsSummaryRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeRecordStatisticsSummaryRequest setThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }
    public Long getThreshold() {
        return this.threshold;
    }

}
