// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeInstanceDetailsResponseBody extends TeaModel {
    @NameInMap("InstanceDetails")
    public java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetails> instanceDetails;

    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDetailsResponseBody self = new DescribeInstanceDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDetailsResponseBody setInstanceDetails(java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetails> instanceDetails) {
        this.instanceDetails = instanceDetails;
        return this;
    }
    public java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetails> getInstanceDetails() {
        return this.instanceDetails;
    }

    public DescribeInstanceDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Eip")
        public String eip;

        /**
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfoList self = new DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfoList setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeInstanceDetailsResponseBodyInstanceDetails extends TeaModel {
        @NameInMap("EipInfoList")
        public java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfoList> eipInfoList;

        /**
         * <strong>example:</strong>
         * <p>ddoscoo-cn-XXXXX</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>coop-line-001</p>
         */
        @NameInMap("Line")
        public String line;

        public static DescribeInstanceDetailsResponseBodyInstanceDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDetailsResponseBodyInstanceDetails self = new DescribeInstanceDetailsResponseBodyInstanceDetails();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetails setEipInfoList(java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfoList> eipInfoList) {
            this.eipInfoList = eipInfoList;
            return this;
        }
        public java.util.List<DescribeInstanceDetailsResponseBodyInstanceDetailsEipInfoList> getEipInfoList() {
            return this.eipInfoList;
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetails setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceDetailsResponseBodyInstanceDetails setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

    }

}
