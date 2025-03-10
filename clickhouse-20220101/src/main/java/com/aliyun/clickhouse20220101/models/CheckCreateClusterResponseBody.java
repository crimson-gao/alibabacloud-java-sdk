// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CheckCreateClusterResponseBody extends TeaModel {
    @NameInMap("Data")
    public CheckCreateClusterResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>9A23C87D-87DF-4DA0-A50E-CB13F4F7923D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckCreateClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCreateClusterResponseBody self = new CheckCreateClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCreateClusterResponseBody setData(CheckCreateClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckCreateClusterResponseBodyData getData() {
        return this.data;
    }

    public CheckCreateClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckCreateClusterResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("ExpectedDBClusterStatus")
        public String expectedDBClusterStatus;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("ExpectedOrderFinishSeconds")
        public Long expectedOrderFinishSeconds;

        /**
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("ExpectedTargetVirtualWareHouseStatus")
        public String expectedTargetVirtualWareHouseStatus;

        public static CheckCreateClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckCreateClusterResponseBodyData self = new CheckCreateClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckCreateClusterResponseBodyData setExpectedDBClusterStatus(String expectedDBClusterStatus) {
            this.expectedDBClusterStatus = expectedDBClusterStatus;
            return this;
        }
        public String getExpectedDBClusterStatus() {
            return this.expectedDBClusterStatus;
        }

        public CheckCreateClusterResponseBodyData setExpectedOrderFinishSeconds(Long expectedOrderFinishSeconds) {
            this.expectedOrderFinishSeconds = expectedOrderFinishSeconds;
            return this;
        }
        public Long getExpectedOrderFinishSeconds() {
            return this.expectedOrderFinishSeconds;
        }

        public CheckCreateClusterResponseBodyData setExpectedTargetVirtualWareHouseStatus(String expectedTargetVirtualWareHouseStatus) {
            this.expectedTargetVirtualWareHouseStatus = expectedTargetVirtualWareHouseStatus;
            return this;
        }
        public String getExpectedTargetVirtualWareHouseStatus() {
            return this.expectedTargetVirtualWareHouseStatus;
        }

    }

}
