// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAndroidInstanceGroupResponseBody extends TeaModel {
    @NameInMap("InstanceGroupIds")
    public java.util.List<String> instanceGroupIds;

    @NameInMap("InstanceGroupInfos")
    public java.util.List<CreateAndroidInstanceGroupResponseBodyInstanceGroupInfos> instanceGroupInfos;

    /**
     * <strong>example:</strong>
     * <p>22365781890****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>1A923337-44D9-5CAD-9A53-95084BD4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAndroidInstanceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAndroidInstanceGroupResponseBody self = new CreateAndroidInstanceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAndroidInstanceGroupResponseBody setInstanceGroupIds(java.util.List<String> instanceGroupIds) {
        this.instanceGroupIds = instanceGroupIds;
        return this;
    }
    public java.util.List<String> getInstanceGroupIds() {
        return this.instanceGroupIds;
    }

    public CreateAndroidInstanceGroupResponseBody setInstanceGroupInfos(java.util.List<CreateAndroidInstanceGroupResponseBodyInstanceGroupInfos> instanceGroupInfos) {
        this.instanceGroupInfos = instanceGroupInfos;
        return this;
    }
    public java.util.List<CreateAndroidInstanceGroupResponseBodyInstanceGroupInfos> getInstanceGroupInfos() {
        return this.instanceGroupInfos;
    }

    public CreateAndroidInstanceGroupResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateAndroidInstanceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAndroidInstanceGroupResponseBodyInstanceGroupInfos extends TeaModel {
        @NameInMap("InstanceGroupId")
        public String instanceGroupId;

        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        public static CreateAndroidInstanceGroupResponseBodyInstanceGroupInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateAndroidInstanceGroupResponseBodyInstanceGroupInfos self = new CreateAndroidInstanceGroupResponseBodyInstanceGroupInfos();
            return TeaModel.build(map, self);
        }

        public CreateAndroidInstanceGroupResponseBodyInstanceGroupInfos setInstanceGroupId(String instanceGroupId) {
            this.instanceGroupId = instanceGroupId;
            return this;
        }
        public String getInstanceGroupId() {
            return this.instanceGroupId;
        }

        public CreateAndroidInstanceGroupResponseBodyInstanceGroupInfos setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

    }

}
