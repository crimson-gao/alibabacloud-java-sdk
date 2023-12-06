// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOssScanConfigResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public GetOssScanConfigResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetOssScanConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssScanConfigResponseBody self = new GetOssScanConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssScanConfigResponseBody setData(GetOssScanConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOssScanConfigResponseBodyData getData() {
        return this.data;
    }

    public GetOssScanConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOssScanConfigResponseBodyData extends TeaModel {
        /**
         * <p>The names of the buckets.</p>
         */
        @NameInMap("BucketNameList")
        public java.util.List<String> bucketNameList;

        /**
         * <p>Indicates whether the check policy is enabled. Valid values:</p>
         * <br>
         * <p>*   **1**: enabled.</p>
         * <p>*   **0**: disabled.</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        /**
         * <p>The end time of the check. The time is in the HH:mm:ss format.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The suffixes of the objects that are checked.</p>
         */
        @NameInMap("KeySuffixList")
        public java.util.List<String> keySuffixList;

        /**
         * <p>The days when the check is performed. The value indicates the days of the week.</p>
         */
        @NameInMap("ScanDayList")
        public java.util.List<Integer> scanDayList;

        /**
         * <p>The start time of the check. The time is in the HH:mm:ss format.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static GetOssScanConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOssScanConfigResponseBodyData self = new GetOssScanConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOssScanConfigResponseBodyData setBucketNameList(java.util.List<String> bucketNameList) {
            this.bucketNameList = bucketNameList;
            return this;
        }
        public java.util.List<String> getBucketNameList() {
            return this.bucketNameList;
        }

        public GetOssScanConfigResponseBodyData setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public GetOssScanConfigResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetOssScanConfigResponseBodyData setKeySuffixList(java.util.List<String> keySuffixList) {
            this.keySuffixList = keySuffixList;
            return this;
        }
        public java.util.List<String> getKeySuffixList() {
            return this.keySuffixList;
        }

        public GetOssScanConfigResponseBodyData setScanDayList(java.util.List<Integer> scanDayList) {
            this.scanDayList = scanDayList;
            return this;
        }
        public java.util.List<Integer> getScanDayList() {
            return this.scanDayList;
        }

        public GetOssScanConfigResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
