// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecLogDeliveriesResponseBody extends TeaModel {
    @NameInMap("DeliveryConfigs")
    public java.util.List<DescribeApisecLogDeliveriesResponseBodyDeliveryConfigs> deliveryConfigs;

    /**
     * <strong>example:</strong>
     * <p>2EFCFE18-78F8-5079-B312-07***48B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApisecLogDeliveriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecLogDeliveriesResponseBody self = new DescribeApisecLogDeliveriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecLogDeliveriesResponseBody setDeliveryConfigs(java.util.List<DescribeApisecLogDeliveriesResponseBodyDeliveryConfigs> deliveryConfigs) {
        this.deliveryConfigs = deliveryConfigs;
        return this;
    }
    public java.util.List<DescribeApisecLogDeliveriesResponseBodyDeliveryConfigs> getDeliveryConfigs() {
        return this.deliveryConfigs;
    }

    public DescribeApisecLogDeliveriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApisecLogDeliveriesResponseBodyDeliveryConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>risk</p>
         */
        @NameInMap("AssertKey")
        public String assertKey;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("LogRegionId")
        public String logRegionId;

        /**
         * <strong>example:</strong>
         * <p>apisec-logstore***</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <strong>example:</strong>
         * <p>apisec-project-14316572********</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        public static DescribeApisecLogDeliveriesResponseBodyDeliveryConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecLogDeliveriesResponseBodyDeliveryConfigs self = new DescribeApisecLogDeliveriesResponseBodyDeliveryConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeApisecLogDeliveriesResponseBodyDeliveryConfigs setAssertKey(String assertKey) {
            this.assertKey = assertKey;
            return this;
        }
        public String getAssertKey() {
            return this.assertKey;
        }

        public DescribeApisecLogDeliveriesResponseBodyDeliveryConfigs setLogRegionId(String logRegionId) {
            this.logRegionId = logRegionId;
            return this;
        }
        public String getLogRegionId() {
            return this.logRegionId;
        }

        public DescribeApisecLogDeliveriesResponseBodyDeliveryConfigs setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public DescribeApisecLogDeliveriesResponseBodyDeliveryConfigs setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeApisecLogDeliveriesResponseBodyDeliveryConfigs setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
