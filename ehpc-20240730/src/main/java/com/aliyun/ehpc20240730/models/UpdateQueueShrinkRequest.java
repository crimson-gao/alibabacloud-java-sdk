// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class UpdateQueueShrinkRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The information about the queue to be updated.</p>
     */
    @NameInMap("Queue")
    public String queueShrink;

    public static UpdateQueueShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQueueShrinkRequest self = new UpdateQueueShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQueueShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateQueueShrinkRequest setQueueShrink(String queueShrink) {
        this.queueShrink = queueShrink;
        return this;
    }
    public String getQueueShrink() {
        return this.queueShrink;
    }

}
