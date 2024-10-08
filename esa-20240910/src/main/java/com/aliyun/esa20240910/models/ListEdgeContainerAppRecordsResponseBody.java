// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeContainerAppRecordsResponseBody extends TeaModel {
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

    @NameInMap("Records")
    public java.util.List<ListEdgeContainerAppRecordsResponseBodyRecords> records;

    /**
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEdgeContainerAppRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeContainerAppRecordsResponseBody self = new ListEdgeContainerAppRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEdgeContainerAppRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEdgeContainerAppRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEdgeContainerAppRecordsResponseBody setRecords(java.util.List<ListEdgeContainerAppRecordsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListEdgeContainerAppRecordsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public ListEdgeContainerAppRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEdgeContainerAppRecordsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEdgeContainerAppRecordsResponseBodyRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>app-88068867578379****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>kdxceo****.yun****.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <strong>example:</strong>
         * <p>27522948436****</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <strong>example:</strong>
         * <p>2023-12-24T02:01:11Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>266****</p>
         */
        @NameInMap("RecordId")
        public Long recordId;

        /**
         * <strong>example:</strong>
         * <p>a.example.com</p>
         */
        @NameInMap("RecordName")
        public String recordName;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("SchemdId")
        public Integer schemdId;

        /**
         * <strong>example:</strong>
         * <p>5407498413****</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <strong>example:</strong>
         * <p>2021-12-22T08:32:02Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListEdgeContainerAppRecordsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeContainerAppRecordsResponseBodyRecords self = new ListEdgeContainerAppRecordsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListEdgeContainerAppRecordsResponseBodyRecords setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListEdgeContainerAppRecordsResponseBodyRecords setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public ListEdgeContainerAppRecordsResponseBodyRecords setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListEdgeContainerAppRecordsResponseBodyRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEdgeContainerAppRecordsResponseBodyRecords setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public ListEdgeContainerAppRecordsResponseBodyRecords setRecordName(String recordName) {
            this.recordName = recordName;
            return this;
        }
        public String getRecordName() {
            return this.recordName;
        }

        public ListEdgeContainerAppRecordsResponseBodyRecords setSchemdId(Integer schemdId) {
            this.schemdId = schemdId;
            return this;
        }
        public Integer getSchemdId() {
            return this.schemdId;
        }

        public ListEdgeContainerAppRecordsResponseBodyRecords setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public ListEdgeContainerAppRecordsResponseBodyRecords setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
