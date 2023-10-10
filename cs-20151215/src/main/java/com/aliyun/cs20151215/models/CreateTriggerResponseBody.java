// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateTriggerResponseBody extends TeaModel {
    /**
     * <p>The action that the trigger performs. For example, a value of `redeploy` indicates that the trigger redeploys the application.</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The ID of the trigger.</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The name of the trigger project.</p>
     */
    @NameInMap("project_id")
    public String projectId;

    /**
     * <p>The type of trigger. Default value: deployment.</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTriggerResponseBody self = new CreateTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTriggerResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public CreateTriggerResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateTriggerResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateTriggerResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateTriggerResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
