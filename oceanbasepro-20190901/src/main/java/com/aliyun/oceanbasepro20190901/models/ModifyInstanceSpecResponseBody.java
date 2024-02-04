// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceSpecResponseBody extends TeaModel {
    /**
     * <p>The return data of the request.</p>
     */
    @NameInMap("Data")
    public ModifyInstanceSpecResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSpecResponseBody self = new ModifyInstanceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSpecResponseBody setData(ModifyInstanceSpecResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyInstanceSpecResponseBodyData getData() {
        return this.data;
    }

    public ModifyInstanceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyInstanceSpecResponseBodyData extends TeaModel {
        /**
         * <p>The result of the dry-run request.</p>
         * <p>- If the DryRun parameter is set to true and the dry run succeeds, the DryRunResult parameter returns true. Otherwise, an error code is returned.</p>
         * <p>- If the DryRun parameter is set to false, no dry run is performed and the DryRunResult parameter returns false.</p>
         */
        @NameInMap("DryRunResult")
        public Boolean dryRunResult;

        /**
         * <p>The ID of the order that you have placed.</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        public static ModifyInstanceSpecResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceSpecResponseBodyData self = new ModifyInstanceSpecResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceSpecResponseBodyData setDryRunResult(Boolean dryRunResult) {
            this.dryRunResult = dryRunResult;
            return this;
        }
        public Boolean getDryRunResult() {
            return this.dryRunResult;
        }

        public ModifyInstanceSpecResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
