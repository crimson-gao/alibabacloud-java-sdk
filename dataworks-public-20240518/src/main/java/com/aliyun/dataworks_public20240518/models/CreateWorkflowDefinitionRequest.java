// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateWorkflowDefinitionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static CreateWorkflowDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowDefinitionRequest self = new CreateWorkflowDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowDefinitionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateWorkflowDefinitionRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
