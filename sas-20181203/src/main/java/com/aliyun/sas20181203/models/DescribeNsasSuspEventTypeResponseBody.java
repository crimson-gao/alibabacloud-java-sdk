// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeNsasSuspEventTypeResponseBody extends TeaModel {
    // An array that consists of the information about the alert type.
    @NameInMap("EventTypes")
    public java.util.List<DescribeNsasSuspEventTypeResponseBodyEventTypes> eventTypes;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNsasSuspEventTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNsasSuspEventTypeResponseBody self = new DescribeNsasSuspEventTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNsasSuspEventTypeResponseBody setEventTypes(java.util.List<DescribeNsasSuspEventTypeResponseBodyEventTypes> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    public java.util.List<DescribeNsasSuspEventTypeResponseBodyEventTypes> getEventTypes() {
        return this.eventTypes;
    }

    public DescribeNsasSuspEventTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNsasSuspEventTypeResponseBodyEventTypes extends TeaModel {
        // The name of the alert type.
        @NameInMap("Name")
        public String name;

        // The number of assets for which an alert of the type is generated.
        @NameInMap("SuspEventCount")
        public Integer suspEventCount;

        // The alert type.
        @NameInMap("Type")
        public String type;

        public static DescribeNsasSuspEventTypeResponseBodyEventTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeNsasSuspEventTypeResponseBodyEventTypes self = new DescribeNsasSuspEventTypeResponseBodyEventTypes();
            return TeaModel.build(map, self);
        }

        public DescribeNsasSuspEventTypeResponseBodyEventTypes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNsasSuspEventTypeResponseBodyEventTypes setSuspEventCount(Integer suspEventCount) {
            this.suspEventCount = suspEventCount;
            return this;
        }
        public Integer getSuspEventCount() {
            return this.suspEventCount;
        }

        public DescribeNsasSuspEventTypeResponseBodyEventTypes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
