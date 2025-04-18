// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeVirtualWareHouseStatusSetResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeVirtualWareHouseStatusSetResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>FDF272C3-8FD0-507B-8E63-A19495217339</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVirtualWareHouseStatusSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualWareHouseStatusSetResponseBody self = new DescribeVirtualWareHouseStatusSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualWareHouseStatusSetResponseBody setData(java.util.List<DescribeVirtualWareHouseStatusSetResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeVirtualWareHouseStatusSetResponseBodyData> getData() {
        return this.data;
    }

    public DescribeVirtualWareHouseStatusSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVirtualWareHouseStatusSetResponseBodyData extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVirtualWareHouseStatusSetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualWareHouseStatusSetResponseBodyData self = new DescribeVirtualWareHouseStatusSetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualWareHouseStatusSetResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeVirtualWareHouseStatusSetResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
