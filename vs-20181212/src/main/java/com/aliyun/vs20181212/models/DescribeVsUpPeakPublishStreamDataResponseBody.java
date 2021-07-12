// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsUpPeakPublishStreamDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DescribeVsUpPeakPublishStreamDatas")
    public DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatas describeVsUpPeakPublishStreamDatas;

    public static DescribeVsUpPeakPublishStreamDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsUpPeakPublishStreamDataResponseBody self = new DescribeVsUpPeakPublishStreamDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsUpPeakPublishStreamDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsUpPeakPublishStreamDataResponseBody setDescribeVsUpPeakPublishStreamDatas(DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatas describeVsUpPeakPublishStreamDatas) {
        this.describeVsUpPeakPublishStreamDatas = describeVsUpPeakPublishStreamDatas;
        return this;
    }
    public DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatas getDescribeVsUpPeakPublishStreamDatas() {
        return this.describeVsUpPeakPublishStreamDatas;
    }

    public static class DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatasDescribeVsUpPeakPublishStreamData extends TeaModel {
        @NameInMap("QueryTime")
        public String queryTime;

        @NameInMap("BandWidth")
        public String bandWidth;

        @NameInMap("StatName")
        public String statName;

        @NameInMap("PeakTime")
        public String peakTime;

        @NameInMap("PublishStreamNum")
        public Integer publishStreamNum;

        public static DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatasDescribeVsUpPeakPublishStreamData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatasDescribeVsUpPeakPublishStreamData self = new DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatasDescribeVsUpPeakPublishStreamData();
            return TeaModel.build(map, self);
        }

        public DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatasDescribeVsUpPeakPublishStreamData setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatasDescribeVsUpPeakPublishStreamData setBandWidth(String bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public String getBandWidth() {
            return this.bandWidth;
        }

        public DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatasDescribeVsUpPeakPublishStreamData setStatName(String statName) {
            this.statName = statName;
            return this;
        }
        public String getStatName() {
            return this.statName;
        }

        public DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatasDescribeVsUpPeakPublishStreamData setPeakTime(String peakTime) {
            this.peakTime = peakTime;
            return this;
        }
        public String getPeakTime() {
            return this.peakTime;
        }

        public DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatasDescribeVsUpPeakPublishStreamData setPublishStreamNum(Integer publishStreamNum) {
            this.publishStreamNum = publishStreamNum;
            return this;
        }
        public Integer getPublishStreamNum() {
            return this.publishStreamNum;
        }

    }

    public static class DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatas extends TeaModel {
        @NameInMap("DescribeVsUpPeakPublishStreamData")
        public java.util.List<DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatasDescribeVsUpPeakPublishStreamData> describeVsUpPeakPublishStreamData;

        public static DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatas self = new DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatas();
            return TeaModel.build(map, self);
        }

        public DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatas setDescribeVsUpPeakPublishStreamData(java.util.List<DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatasDescribeVsUpPeakPublishStreamData> describeVsUpPeakPublishStreamData) {
            this.describeVsUpPeakPublishStreamData = describeVsUpPeakPublishStreamData;
            return this;
        }
        public java.util.List<DescribeVsUpPeakPublishStreamDataResponseBodyDescribeVsUpPeakPublishStreamDatasDescribeVsUpPeakPublishStreamData> getDescribeVsUpPeakPublishStreamData() {
            return this.describeVsUpPeakPublishStreamData;
        }

    }

}
