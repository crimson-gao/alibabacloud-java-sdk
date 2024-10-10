// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCacheReserveInstancesResponseBody extends TeaModel {
    @NameInMap("InstanceInfo")
    public java.util.List<ListCacheReserveInstancesResponseBodyInstanceInfo> instanceInfo;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListCacheReserveInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCacheReserveInstancesResponseBody self = new ListCacheReserveInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCacheReserveInstancesResponseBody setInstanceInfo(java.util.List<ListCacheReserveInstancesResponseBodyInstanceInfo> instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }
    public java.util.List<ListCacheReserveInstancesResponseBodyInstanceInfo> getInstanceInfo() {
        return this.instanceInfo;
    }

    public ListCacheReserveInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCacheReserveInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCacheReserveInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCacheReserveInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListCacheReserveInstancesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListCacheReserveInstancesResponseBodyInstanceInfo extends TeaModel {
        @NameInMap("CacheReserveCapacity")
        public String cacheReserveCapacity;

        @NameInMap("CacheReserveRegion")
        public String cacheReserveRegion;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Status")
        public String status;

        public static ListCacheReserveInstancesResponseBodyInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCacheReserveInstancesResponseBodyInstanceInfo self = new ListCacheReserveInstancesResponseBodyInstanceInfo();
            return TeaModel.build(map, self);
        }

        public ListCacheReserveInstancesResponseBodyInstanceInfo setCacheReserveCapacity(String cacheReserveCapacity) {
            this.cacheReserveCapacity = cacheReserveCapacity;
            return this;
        }
        public String getCacheReserveCapacity() {
            return this.cacheReserveCapacity;
        }

        public ListCacheReserveInstancesResponseBodyInstanceInfo setCacheReserveRegion(String cacheReserveRegion) {
            this.cacheReserveRegion = cacheReserveRegion;
            return this;
        }
        public String getCacheReserveRegion() {
            return this.cacheReserveRegion;
        }

        public ListCacheReserveInstancesResponseBodyInstanceInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCacheReserveInstancesResponseBodyInstanceInfo setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListCacheReserveInstancesResponseBodyInstanceInfo setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListCacheReserveInstancesResponseBodyInstanceInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCacheReserveInstancesResponseBodyInstanceInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
