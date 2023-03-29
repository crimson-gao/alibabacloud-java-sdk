// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainPathDataResponseBody extends TeaModel {
    /**
     * <p>The time interval between the data entries. Unit: seconds.</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range that was queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number of the returned page. Pages start from page **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>A list of bandwidth values collected at each time interval.</p>
     */
    @NameInMap("PathDataPerInterval")
    public DescribeDomainPathDataResponseBodyPathDataPerInterval pathDataPerInterval;

    /**
     * <p>The start of the time range that was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The total count.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDomainPathDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainPathDataResponseBody self = new DescribeDomainPathDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainPathDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainPathDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainPathDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainPathDataResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainPathDataResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainPathDataResponseBody setPathDataPerInterval(DescribeDomainPathDataResponseBodyPathDataPerInterval pathDataPerInterval) {
        this.pathDataPerInterval = pathDataPerInterval;
        return this;
    }
    public DescribeDomainPathDataResponseBodyPathDataPerInterval getPathDataPerInterval() {
        return this.pathDataPerInterval;
    }

    public DescribeDomainPathDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainPathDataResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData extends TeaModel {
        /**
         * <p>The number of visits to the specified path.</p>
         */
        @NameInMap("Acc")
        public Integer acc;

        /**
         * <p>The path.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The point in time.</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The amount of network traffic. Unit: bytes.</p>
         */
        @NameInMap("Traffic")
        public Integer traffic;

        public static DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData self = new DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData setAcc(Integer acc) {
            this.acc = acc;
            return this;
        }
        public Integer getAcc() {
            return this.acc;
        }

        public DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData setTraffic(Integer traffic) {
            this.traffic = traffic;
            return this;
        }
        public Integer getTraffic() {
            return this.traffic;
        }

    }

    public static class DescribeDomainPathDataResponseBodyPathDataPerInterval extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData> usageData;

        public static DescribeDomainPathDataResponseBodyPathDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainPathDataResponseBodyPathDataPerInterval self = new DescribeDomainPathDataResponseBodyPathDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainPathDataResponseBodyPathDataPerInterval setUsageData(java.util.List<DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<DescribeDomainPathDataResponseBodyPathDataPerIntervalUsageData> getUsageData() {
            return this.usageData;
        }

    }

}
