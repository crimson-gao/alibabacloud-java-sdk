// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateClusterConfigsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("ClusterId")
    public Long clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SPARK_CONF</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigValues")
    public String configValuesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5678</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static UpdateClusterConfigsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterConfigsShrinkRequest self = new UpdateClusterConfigsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterConfigsShrinkRequest setClusterId(Long clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public Long getClusterId() {
        return this.clusterId;
    }

    public UpdateClusterConfigsShrinkRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public UpdateClusterConfigsShrinkRequest setConfigValuesShrink(String configValuesShrink) {
        this.configValuesShrink = configValuesShrink;
        return this;
    }
    public String getConfigValuesShrink() {
        return this.configValuesShrink;
    }

    public UpdateClusterConfigsShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
