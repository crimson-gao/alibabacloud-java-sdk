// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypesResponseBody extends TeaModel {
    @NameInMap("InstanceTypes")
    public java.util.List<DescribeInstanceTypesResponseBodyInstanceTypes> instanceTypes;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypesResponseBody self = new DescribeInstanceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypesResponseBody setInstanceTypes(java.util.List<DescribeInstanceTypesResponseBodyInstanceTypes> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<DescribeInstanceTypesResponseBodyInstanceTypes> getInstanceTypes() {
        return this.instanceTypes;
    }

    public DescribeInstanceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceTypesResponseBodyInstanceTypes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("CpuCoreCount")
        public Float cpuCoreCount;

        /**
         * <strong>example:</strong>
         * <p>dbfs.small</p>
         */
        @NameInMap("InstanceTypeDescription")
        public String instanceTypeDescription;

        /**
         * <strong>example:</strong>
         * <p>dbfs.small</p>
         */
        @NameInMap("InstanceTypeId")
        public String instanceTypeId;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("MemorySize")
        public Float memorySize;

        public static DescribeInstanceTypesResponseBodyInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseBodyInstanceTypes self = new DescribeInstanceTypesResponseBodyInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseBodyInstanceTypes setCpuCoreCount(Float cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        public Float getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypes setInstanceTypeDescription(String instanceTypeDescription) {
            this.instanceTypeDescription = instanceTypeDescription;
            return this;
        }
        public String getInstanceTypeDescription() {
            return this.instanceTypeDescription;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypes setInstanceTypeId(String instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
            return this;
        }
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public DescribeInstanceTypesResponseBodyInstanceTypes setMemorySize(Float memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Float getMemorySize() {
            return this.memorySize;
        }

    }

}
