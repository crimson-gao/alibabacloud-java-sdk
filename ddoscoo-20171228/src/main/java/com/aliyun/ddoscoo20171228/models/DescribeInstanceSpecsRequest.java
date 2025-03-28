// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ddoscoo-cn-XXXXX&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeInstanceSpecsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecsRequest self = new DescribeInstanceSpecsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecsRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeInstanceSpecsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
