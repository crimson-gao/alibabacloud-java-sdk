// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListClusterConfigsRequest extends TeaModel {
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
     * 
     * <strong>example:</strong>
     * <p>5678</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListClusterConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterConfigsRequest self = new ListClusterConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterConfigsRequest setClusterId(Long clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public Long getClusterId() {
        return this.clusterId;
    }

    public ListClusterConfigsRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public ListClusterConfigsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
