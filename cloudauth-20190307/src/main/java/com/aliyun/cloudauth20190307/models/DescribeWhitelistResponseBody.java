// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeWhitelistResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeWhitelistResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistResponseBody self = new DescribeWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWhitelistResponseBody setItems(java.util.List<DescribeWhitelistResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeWhitelistResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeWhitelistResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWhitelistResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeWhitelistResponseBodyItems extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("EndDate")
        public Long endDate;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IdCardNum")
        public String idCardNum;

        @NameInMap("StartDate")
        public Long startDate;

        @NameInMap("Uid")
        public Long uid;

        @NameInMap("Valid")
        public Integer valid;

        public static DescribeWhitelistResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhitelistResponseBodyItems self = new DescribeWhitelistResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeWhitelistResponseBodyItems setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public DescribeWhitelistResponseBodyItems setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeWhitelistResponseBodyItems setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public DescribeWhitelistResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeWhitelistResponseBodyItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeWhitelistResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeWhitelistResponseBodyItems setIdCardNum(String idCardNum) {
            this.idCardNum = idCardNum;
            return this;
        }
        public String getIdCardNum() {
            return this.idCardNum;
        }

        public DescribeWhitelistResponseBodyItems setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

        public DescribeWhitelistResponseBodyItems setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

        public DescribeWhitelistResponseBodyItems setValid(Integer valid) {
            this.valid = valid;
            return this;
        }
        public Integer getValid() {
            return this.valid;
        }

    }

}
