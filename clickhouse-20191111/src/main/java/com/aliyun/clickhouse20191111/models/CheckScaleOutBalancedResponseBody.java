// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckScaleOutBalancedResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TableDetails")
    public CheckScaleOutBalancedResponseBodyTableDetails tableDetails;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("CheckCode")
    public String checkCode;

    @NameInMap("TimeDuration")
    public String timeDuration;

    public static CheckScaleOutBalancedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckScaleOutBalancedResponseBody self = new CheckScaleOutBalancedResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckScaleOutBalancedResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public CheckScaleOutBalancedResponseBody setTableDetails(CheckScaleOutBalancedResponseBodyTableDetails tableDetails) {
        this.tableDetails = tableDetails;
        return this;
    }
    public CheckScaleOutBalancedResponseBodyTableDetails getTableDetails() {
        return this.tableDetails;
    }

    public CheckScaleOutBalancedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckScaleOutBalancedResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CheckScaleOutBalancedResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public CheckScaleOutBalancedResponseBody setCheckCode(String checkCode) {
        this.checkCode = checkCode;
        return this;
    }
    public String getCheckCode() {
        return this.checkCode;
    }

    public CheckScaleOutBalancedResponseBody setTimeDuration(String timeDuration) {
        this.timeDuration = timeDuration;
        return this;
    }
    public String getTimeDuration() {
        return this.timeDuration;
    }

    public static class CheckScaleOutBalancedResponseBodyTableDetailsTableDetail extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("Database")
        public String database;

        @NameInMap("Detail")
        public Integer detail;

        public static CheckScaleOutBalancedResponseBodyTableDetailsTableDetail build(java.util.Map<String, ?> map) throws Exception {
            CheckScaleOutBalancedResponseBodyTableDetailsTableDetail self = new CheckScaleOutBalancedResponseBodyTableDetailsTableDetail();
            return TeaModel.build(map, self);
        }

        public CheckScaleOutBalancedResponseBodyTableDetailsTableDetail setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public CheckScaleOutBalancedResponseBodyTableDetailsTableDetail setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public CheckScaleOutBalancedResponseBodyTableDetailsTableDetail setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public CheckScaleOutBalancedResponseBodyTableDetailsTableDetail setDetail(Integer detail) {
            this.detail = detail;
            return this;
        }
        public Integer getDetail() {
            return this.detail;
        }

    }

    public static class CheckScaleOutBalancedResponseBodyTableDetails extends TeaModel {
        @NameInMap("TableDetail")
        public java.util.List<CheckScaleOutBalancedResponseBodyTableDetailsTableDetail> tableDetail;

        public static CheckScaleOutBalancedResponseBodyTableDetails build(java.util.Map<String, ?> map) throws Exception {
            CheckScaleOutBalancedResponseBodyTableDetails self = new CheckScaleOutBalancedResponseBodyTableDetails();
            return TeaModel.build(map, self);
        }

        public CheckScaleOutBalancedResponseBodyTableDetails setTableDetail(java.util.List<CheckScaleOutBalancedResponseBodyTableDetailsTableDetail> tableDetail) {
            this.tableDetail = tableDetail;
            return this;
        }
        public java.util.List<CheckScaleOutBalancedResponseBodyTableDetailsTableDetail> getTableDetail() {
            return this.tableDetail;
        }

    }

}
