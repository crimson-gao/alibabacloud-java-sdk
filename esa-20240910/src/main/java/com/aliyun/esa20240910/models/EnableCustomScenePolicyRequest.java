// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class EnableCustomScenePolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    public static EnableCustomScenePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableCustomScenePolicyRequest self = new EnableCustomScenePolicyRequest();
        return TeaModel.build(map, self);
    }

    public EnableCustomScenePolicyRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

}
