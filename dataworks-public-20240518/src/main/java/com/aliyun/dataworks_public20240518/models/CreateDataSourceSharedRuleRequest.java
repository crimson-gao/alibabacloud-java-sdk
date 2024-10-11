// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataSourceSharedRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>144544</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Dev</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <strong>example:</strong>
     * <p>1107550004253538</p>
     */
    @NameInMap("SharedUser")
    public String sharedUser;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>106560</p>
     */
    @NameInMap("TargetProjectId")
    public Long targetProjectId;

    public static CreateDataSourceSharedRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceSharedRuleRequest self = new CreateDataSourceSharedRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceSharedRuleRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateDataSourceSharedRuleRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public CreateDataSourceSharedRuleRequest setSharedUser(String sharedUser) {
        this.sharedUser = sharedUser;
        return this;
    }
    public String getSharedUser() {
        return this.sharedUser;
    }

    public CreateDataSourceSharedRuleRequest setTargetProjectId(Long targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }
    public Long getTargetProjectId() {
        return this.targetProjectId;
    }

}
