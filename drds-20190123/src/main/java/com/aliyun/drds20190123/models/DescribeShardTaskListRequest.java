// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeShardTaskListRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Query")
    public String query;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskType")
    public String taskType;

    public static DescribeShardTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeShardTaskListRequest self = new DescribeShardTaskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeShardTaskListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeShardTaskListRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeShardTaskListRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeShardTaskListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeShardTaskListRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public DescribeShardTaskListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeShardTaskListRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
