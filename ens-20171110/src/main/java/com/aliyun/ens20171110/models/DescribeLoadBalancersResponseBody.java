// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancersResponseBody extends TeaModel {
    /**
     * <p>The returned ELB instances.</p>
     */
    @NameInMap("LoadBalancers")
    public DescribeLoadBalancersResponseBodyLoadBalancers loadBalancers;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Valid values: **10** to **100**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLoadBalancersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancersResponseBody self = new DescribeLoadBalancersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancersResponseBody setLoadBalancers(DescribeLoadBalancersResponseBodyLoadBalancers loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }
    public DescribeLoadBalancersResponseBodyLoadBalancers getLoadBalancers() {
        return this.loadBalancers;
    }

    public DescribeLoadBalancersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLoadBalancersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLoadBalancersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer extends TeaModel {
        /**
         * <p>The IP address that the ELB instance uses to provide services.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The version of the IP address. Valid values: ipv4 and ipv6.</p>
         */
        @NameInMap("AddressIPVersion")
        public String addressIPVersion;

        /**
         * <p>The time when the ELB instance was created. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the ENS node.</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the ELB instance.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The name of the ELB instance.</p>
         */
        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        /**
         * <p>The status of the ELB instance. Valid values:</p>
         * <br>
         * <p>*   **Active** (default): The listener for the instance can forward the received traffic based on the rule.</p>
         * <p>*   **InActive**: The listener for the instance does not forward the received traffic.</p>
         */
        @NameInMap("LoadBalancerStatus")
        public String loadBalancerStatus;

        /**
         * <p>The ID of the network.</p>
         */
        @NameInMap("NetworkId")
        public String networkId;

        /**
         * <p>The billing method. Valid values:</p>
         * <br>
         * <p>*   **PrePaid**: subscription.</p>
         * <p>*   **PostPaid**: pay-as-you-go. Only this billing method is supported.</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer self = new DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setAddressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }
        public String getAddressIPVersion() {
            return this.addressIPVersion;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setLoadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }
        public String getLoadBalancerStatus() {
            return this.loadBalancerStatus;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeLoadBalancersResponseBodyLoadBalancers extends TeaModel {
        @NameInMap("LoadBalancer")
        public java.util.List<DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer> loadBalancer;

        public static DescribeLoadBalancersResponseBodyLoadBalancers build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancersResponseBodyLoadBalancers self = new DescribeLoadBalancersResponseBodyLoadBalancers();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setLoadBalancer(java.util.List<DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer> loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }
        public java.util.List<DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer> getLoadBalancer() {
            return this.loadBalancer;
        }

    }

}
