// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetModuleConfigStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetModuleConfigStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>843E4805-****-7EE12FA8DBFD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetModuleConfigStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModuleConfigStatusResponseBody self = new GetModuleConfigStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModuleConfigStatusResponseBody setData(GetModuleConfigStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetModuleConfigStatusResponseBodyData getData() {
        return this.data;
    }

    public GetModuleConfigStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetModuleConfigStatusResponseBodyDataModuleConfigResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Ransom</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Pass")
        public Boolean pass;

        public static GetModuleConfigStatusResponseBodyDataModuleConfigResults build(java.util.Map<String, ?> map) throws Exception {
            GetModuleConfigStatusResponseBodyDataModuleConfigResults self = new GetModuleConfigStatusResponseBodyDataModuleConfigResults();
            return TeaModel.build(map, self);
        }

        public GetModuleConfigStatusResponseBodyDataModuleConfigResults setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public GetModuleConfigStatusResponseBodyDataModuleConfigResults setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

    }

    public static class GetModuleConfigStatusResponseBodyData extends TeaModel {
        @NameInMap("ModuleConfigResults")
        public java.util.List<GetModuleConfigStatusResponseBodyDataModuleConfigResults> moduleConfigResults;

        public static GetModuleConfigStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetModuleConfigStatusResponseBodyData self = new GetModuleConfigStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetModuleConfigStatusResponseBodyData setModuleConfigResults(java.util.List<GetModuleConfigStatusResponseBodyDataModuleConfigResults> moduleConfigResults) {
            this.moduleConfigResults = moduleConfigResults;
            return this;
        }
        public java.util.List<GetModuleConfigStatusResponseBodyDataModuleConfigResults> getModuleConfigResults() {
            return this.moduleConfigResults;
        }

    }

}
