// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteDeliveryTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123456***</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cdn-test-task</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static GetSiteDeliveryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSiteDeliveryTaskRequest self = new GetSiteDeliveryTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetSiteDeliveryTaskRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetSiteDeliveryTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
