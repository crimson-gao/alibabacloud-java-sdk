// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordLogsRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The keyword for searches in %KeyWord% mode. The value is not case-sensitive.</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

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
     * <p>The number of entries to return on each page. Maximum value: **100**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the **yyyy-MM-ddTHH:mm:ssZ** format.</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The IP address of the client.</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the **yyyy-MM-ddTHH:mm:ssZ** format.</p>
     */
    @NameInMap("endDate")
    public String endDate;

    public static DescribeRecordLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordLogsRequest self = new DescribeRecordLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecordLogsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeRecordLogsRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public DescribeRecordLogsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRecordLogsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRecordLogsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRecordLogsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeRecordLogsRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public DescribeRecordLogsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

}
