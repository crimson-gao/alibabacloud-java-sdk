// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1EEA9C98-F166-54FE-ADE3-08D8****BDFA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDefenseRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseRuleResponseBody self = new ModifyDefenseRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
