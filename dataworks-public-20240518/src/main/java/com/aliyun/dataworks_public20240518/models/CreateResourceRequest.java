// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateResourceRequest extends TeaModel {
    /**
     * <p>资源文件的项目id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static CreateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRequest self = new CreateResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateResourceRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
