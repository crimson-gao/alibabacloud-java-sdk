// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyServerlessAuthToMachineResponseBody extends TeaModel {
    /**
     * <p>Details of the returned data.</p>
     */
    @NameInMap("Data")
    public ModifyServerlessAuthToMachineResponseBodyData data;

    /**
     * <p>本次调用请求的ID，是由阿里云为该请求生成的唯一标识符，可用于排查和定位问题。</p>
     * 
     * <strong>example:</strong>
     * <p>A47F77A1***8CD37050E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyServerlessAuthToMachineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyServerlessAuthToMachineResponseBody self = new ModifyServerlessAuthToMachineResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyServerlessAuthToMachineResponseBody setData(ModifyServerlessAuthToMachineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyServerlessAuthToMachineResponseBodyData getData() {
        return this.data;
    }

    public ModifyServerlessAuthToMachineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyServerlessAuthToMachineResponseBodyData extends TeaModel {
        /**
         * <p>Result code. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Success</li>
         * <li><strong>1</strong>: Parameter error</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResultCode")
        public Integer resultCode;

        public static ModifyServerlessAuthToMachineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyServerlessAuthToMachineResponseBodyData self = new ModifyServerlessAuthToMachineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyServerlessAuthToMachineResponseBodyData setResultCode(Integer resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public Integer getResultCode() {
            return this.resultCode;
        }

    }

}
