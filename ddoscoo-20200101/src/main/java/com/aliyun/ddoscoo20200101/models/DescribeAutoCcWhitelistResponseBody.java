// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAutoCcWhitelistResponseBody extends TeaModel {
    @NameInMap("AutoCcWhitelist")
    public java.util.List<DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist> autoCcWhitelist;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAutoCcWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoCcWhitelistResponseBody self = new DescribeAutoCcWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoCcWhitelistResponseBody setAutoCcWhitelist(java.util.List<DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist> autoCcWhitelist) {
        this.autoCcWhitelist = autoCcWhitelist;
        return this;
    }
    public java.util.List<DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist> getAutoCcWhitelist() {
        return this.autoCcWhitelist;
    }

    public DescribeAutoCcWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoCcWhitelistResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist extends TeaModel {
        @NameInMap("DestIp")
        public String destIp;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("SourceIp")
        public String sourceIp;

        @NameInMap("Type")
        public String type;

        public static DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist self = new DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist();
            return TeaModel.build(map, self);
        }

        public DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist setDestIp(String destIp) {
            this.destIp = destIp;
            return this;
        }
        public String getDestIp() {
            return this.destIp;
        }

        public DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribeAutoCcWhitelistResponseBodyAutoCcWhitelist setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
