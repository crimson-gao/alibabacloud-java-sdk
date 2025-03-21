// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListTaskInstanceOperationLogsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListTaskInstanceOperationLogsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListTaskInstanceOperationLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskInstanceOperationLogsResponseBody self = new ListTaskInstanceOperationLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskInstanceOperationLogsResponseBody setPagingInfo(ListTaskInstanceOperationLogsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListTaskInstanceOperationLogsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListTaskInstanceOperationLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs extends TeaModel {
        /**
         * <p>The time when the operation log was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The operation content.</p>
         * 
         * <strong>example:</strong>
         * <p>Freeze tasks</p>
         */
        @NameInMap("OperationContent")
        public String operationContent;

        /**
         * <p>The serial number of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("OperationSeq")
        public Long operationSeq;

        /**
         * <p>The ID of the instance on which the operation was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TaskInstanceId")
        public Long taskInstanceId;

        /**
         * <p>The account ID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("User")
        public String user;

        public static ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs build(java.util.Map<String, ?> map) throws Exception {
            ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs self = new ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs();
            return TeaModel.build(map, self);
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs setOperationContent(String operationContent) {
            this.operationContent = operationContent;
            return this;
        }
        public String getOperationContent() {
            return this.operationContent;
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs setOperationSeq(Long operationSeq) {
            this.operationSeq = operationSeq;
            return this;
        }
        public Long getOperationSeq() {
            return this.operationSeq;
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs setTaskInstanceId(Long taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public Long getTaskInstanceId() {
            return this.taskInstanceId;
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class ListTaskInstanceOperationLogsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The operation logs.</p>
         */
        @NameInMap("OperationLogs")
        public java.util.List<ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs> operationLogs;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListTaskInstanceOperationLogsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTaskInstanceOperationLogsResponseBodyPagingInfo self = new ListTaskInstanceOperationLogsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfo setOperationLogs(java.util.List<ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs> operationLogs) {
            this.operationLogs = operationLogs;
            return this;
        }
        public java.util.List<ListTaskInstanceOperationLogsResponseBodyPagingInfoOperationLogs> getOperationLogs() {
            return this.operationLogs;
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTaskInstanceOperationLogsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
