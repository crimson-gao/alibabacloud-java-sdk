// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainIspDataResponseBody extends TeaModel {
    /**
     * <p>The time interval between the data entries returned. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The accelerated domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-12-06T12:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2E5AD83F-BD7B-462E-8319-2E30E305519A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-12-05T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The access statistics by ISP.</p>
     */
    @NameInMap("Value")
    public DescribeDcdnDomainIspDataResponseBodyValue value;

    public static DescribeDcdnDomainIspDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainIspDataResponseBody self = new DescribeDcdnDomainIspDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainIspDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDcdnDomainIspDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainIspDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainIspDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainIspDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainIspDataResponseBody setValue(DescribeDcdnDomainIspDataResponseBodyValue value) {
        this.value = value;
        return this;
    }
    public DescribeDcdnDomainIspDataResponseBodyValue getValue() {
        return this.value;
    }

    public static class DescribeDcdnDomainIspDataResponseBodyValueIspProportionData extends TeaModel {
        /**
         * <p>The average response size. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>800019.0</p>
         */
        @NameInMap("AvgObjectSize")
        public String avgObjectSize;

        /**
         * <p>The average response speed. Unit: byte/ms.</p>
         * 
         * <strong>example:</strong>
         * <p>154.3345765545624</p>
         */
        @NameInMap("AvgResponseRate")
        public String avgResponseRate;

        /**
         * <p>The average response time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5183.666666666667</p>
         */
        @NameInMap("AvgResponseTime")
        public String avgResponseTime;

        /**
         * <p>The bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>380.9614285714286</p>
         */
        @NameInMap("Bps")
        public String bps;

        /**
         * <p>The proportion of network traffic. For example, a value of 90 indicates that 90% of network traffic was coming from the specified ISP.</p>
         * 
         * <strong>example:</strong>
         * <p>0.003544181046236794</p>
         */
        @NameInMap("BytesProportion")
        public String bytesProportion;

        /**
         * <p>The information about the ISP.</p>
         * 
         * <strong>example:</strong>
         * <p>China Unicom</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The name of the ISP.</p>
         * 
         * <strong>example:</strong>
         * <p>unicom</p>
         */
        @NameInMap("IspEname")
        public String ispEname;

        /**
         * <p>The proportion of the HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01155980271270037</p>
         */
        @NameInMap("Proportion")
        public String proportion;

        /**
         * <p>The number of queries per second (QPS).</p>
         * 
         * <strong>example:</strong>
         * <p>5.9523809523809524E-5</p>
         */
        @NameInMap("Qps")
        public String qps;

        /**
         * <p>The total volume of traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>2400057</p>
         */
        @NameInMap("TotalBytes")
        public String totalBytes;

        /**
         * <p>The total number of requests that are destined for your website.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalQuery")
        public String totalQuery;

        public static DescribeDcdnDomainIspDataResponseBodyValueIspProportionData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainIspDataResponseBodyValueIspProportionData self = new DescribeDcdnDomainIspDataResponseBodyValueIspProportionData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setAvgObjectSize(String avgObjectSize) {
            this.avgObjectSize = avgObjectSize;
            return this;
        }
        public String getAvgObjectSize() {
            return this.avgObjectSize;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setAvgResponseRate(String avgResponseRate) {
            this.avgResponseRate = avgResponseRate;
            return this;
        }
        public String getAvgResponseRate() {
            return this.avgResponseRate;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setAvgResponseTime(String avgResponseTime) {
            this.avgResponseTime = avgResponseTime;
            return this;
        }
        public String getAvgResponseTime() {
            return this.avgResponseTime;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setBps(String bps) {
            this.bps = bps;
            return this;
        }
        public String getBps() {
            return this.bps;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setBytesProportion(String bytesProportion) {
            this.bytesProportion = bytesProportion;
            return this;
        }
        public String getBytesProportion() {
            return this.bytesProportion;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setIspEname(String ispEname) {
            this.ispEname = ispEname;
            return this;
        }
        public String getIspEname() {
            return this.ispEname;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setProportion(String proportion) {
            this.proportion = proportion;
            return this;
        }
        public String getProportion() {
            return this.proportion;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setQps(String qps) {
            this.qps = qps;
            return this;
        }
        public String getQps() {
            return this.qps;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setTotalBytes(String totalBytes) {
            this.totalBytes = totalBytes;
            return this;
        }
        public String getTotalBytes() {
            return this.totalBytes;
        }

        public DescribeDcdnDomainIspDataResponseBodyValueIspProportionData setTotalQuery(String totalQuery) {
            this.totalQuery = totalQuery;
            return this;
        }
        public String getTotalQuery() {
            return this.totalQuery;
        }

    }

    public static class DescribeDcdnDomainIspDataResponseBodyValue extends TeaModel {
        @NameInMap("IspProportionData")
        public java.util.List<DescribeDcdnDomainIspDataResponseBodyValueIspProportionData> ispProportionData;

        public static DescribeDcdnDomainIspDataResponseBodyValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainIspDataResponseBodyValue self = new DescribeDcdnDomainIspDataResponseBodyValue();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainIspDataResponseBodyValue setIspProportionData(java.util.List<DescribeDcdnDomainIspDataResponseBodyValueIspProportionData> ispProportionData) {
            this.ispProportionData = ispProportionData;
            return this;
        }
        public java.util.List<DescribeDcdnDomainIspDataResponseBodyValueIspProportionData> getIspProportionData() {
            return this.ispProportionData;
        }

    }

}
