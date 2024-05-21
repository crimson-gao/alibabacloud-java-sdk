// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryCubeOptimizationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryCubeOptimizationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCubeOptimizationRequest self = new QueryCubeOptimizationRequest();
        return TeaModel.build(map, self);
    }

    public QueryCubeOptimizationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
