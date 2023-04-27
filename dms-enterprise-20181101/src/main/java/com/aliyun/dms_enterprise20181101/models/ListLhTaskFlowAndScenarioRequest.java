// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLhTaskFlowAndScenarioRequest extends TeaModel {
    /**
     * <p>The name of the user who creates the workspace.</p>
     */
    @NameInMap("SpaceId")
    public Long spaceId;

    /**
     * <p>The ID of the workspace. You can call the [GetLhSpaceByName](~~424379~~) operation to obtain the workspace ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The user ID of the task flow owner.</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static ListLhTaskFlowAndScenarioRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLhTaskFlowAndScenarioRequest self = new ListLhTaskFlowAndScenarioRequest();
        return TeaModel.build(map, self);
    }

    public ListLhTaskFlowAndScenarioRequest setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public Long getSpaceId() {
        return this.spaceId;
    }

    public ListLhTaskFlowAndScenarioRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListLhTaskFlowAndScenarioRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
