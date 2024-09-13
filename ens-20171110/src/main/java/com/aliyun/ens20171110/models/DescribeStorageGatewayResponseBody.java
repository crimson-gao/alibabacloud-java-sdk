// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeStorageGatewayResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6666C5A5-75ED-422E-A022-7121FA18C968</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageGateways")
    public java.util.List<DescribeStorageGatewayResponseBodyStorageGateways> storageGateways;

    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeStorageGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageGatewayResponseBody self = new DescribeStorageGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStorageGatewayResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageGatewayResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStorageGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStorageGatewayResponseBody setStorageGateways(java.util.List<DescribeStorageGatewayResponseBodyStorageGateways> storageGateways) {
        this.storageGateways = storageGateways;
        return this;
    }
    public java.util.List<DescribeStorageGatewayResponseBodyStorageGateways> getStorageGateways() {
        return this.storageGateways;
    }

    public DescribeStorageGatewayResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeStorageGatewayResponseBodyStorageGateways extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192.168.2.0/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <strong>example:</strong>
         * <p>2024-05-14T03:07:47Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing-cmcc</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <strong>example:</strong>
         * <p><em>.</em>.<em>.</em></p>
         */
        @NameInMap("ServiceIp")
        public String serviceIp;

        /**
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>sgw-***</p>
         */
        @NameInMap("StorageGatewayId")
        public String storageGatewayId;

        /**
         * <strong>example:</strong>
         * <p>testGateway</p>
         */
        @NameInMap("StorageGatewayName")
        public String storageGatewayName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StorageGatewayType")
        public Integer storageGatewayType;

        /**
         * <strong>example:</strong>
         * <p>n-***</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeStorageGatewayResponseBodyStorageGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageGatewayResponseBodyStorageGateways self = new DescribeStorageGatewayResponseBodyStorageGateways();
            return TeaModel.build(map, self);
        }

        public DescribeStorageGatewayResponseBodyStorageGateways setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeStorageGatewayResponseBodyStorageGateways setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeStorageGatewayResponseBodyStorageGateways setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeStorageGatewayResponseBodyStorageGateways setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeStorageGatewayResponseBodyStorageGateways setServiceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }
        public String getServiceIp() {
            return this.serviceIp;
        }

        public DescribeStorageGatewayResponseBodyStorageGateways setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeStorageGatewayResponseBodyStorageGateways setStorageGatewayId(String storageGatewayId) {
            this.storageGatewayId = storageGatewayId;
            return this;
        }
        public String getStorageGatewayId() {
            return this.storageGatewayId;
        }

        public DescribeStorageGatewayResponseBodyStorageGateways setStorageGatewayName(String storageGatewayName) {
            this.storageGatewayName = storageGatewayName;
            return this;
        }
        public String getStorageGatewayName() {
            return this.storageGatewayName;
        }

        public DescribeStorageGatewayResponseBodyStorageGateways setStorageGatewayType(Integer storageGatewayType) {
            this.storageGatewayType = storageGatewayType;
            return this;
        }
        public Integer getStorageGatewayType() {
            return this.storageGatewayType;
        }

        public DescribeStorageGatewayResponseBodyStorageGateways setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
