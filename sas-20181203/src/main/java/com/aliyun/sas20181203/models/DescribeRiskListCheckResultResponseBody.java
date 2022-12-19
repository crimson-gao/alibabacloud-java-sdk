// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskListCheckResultResponseBody extends TeaModel {
    // The number of risk items for each cloud service.
    @NameInMap("List")
    public java.util.List<DescribeRiskListCheckResultResponseBodyList> list;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRiskListCheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskListCheckResultResponseBody self = new DescribeRiskListCheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskListCheckResultResponseBody setList(java.util.List<DescribeRiskListCheckResultResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeRiskListCheckResultResponseBodyList> getList() {
        return this.list;
    }

    public DescribeRiskListCheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRiskListCheckResultResponseBodyList extends TeaModel {
        // The instance ID of the cloud service.
        @NameInMap("InstanceId")
        public String instanceId;

        // The total number of risk items detected in the current cloud service.
        @NameInMap("riskCount")
        public Long riskCount;

        public static DescribeRiskListCheckResultResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskListCheckResultResponseBodyList self = new DescribeRiskListCheckResultResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeRiskListCheckResultResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRiskListCheckResultResponseBodyList setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

    }

}
