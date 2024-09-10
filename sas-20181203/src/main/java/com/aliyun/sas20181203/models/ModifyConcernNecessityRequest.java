// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyConcernNecessityRequest extends TeaModel {
    /**
     * <p>The priorities to fix the vulnerabilities. Valid values:</p>
     * <ul>
     * <li>asap: high</li>
     * <li>later: medium</li>
     * <li>nntf: low</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asap,nntf</p>
     */
    @NameInMap("ConcernNecessity")
    public String concernNecessity;

    public static ModifyConcernNecessityRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyConcernNecessityRequest self = new ModifyConcernNecessityRequest();
        return TeaModel.build(map, self);
    }

    public ModifyConcernNecessityRequest setConcernNecessity(String concernNecessity) {
        this.concernNecessity = concernNecessity;
        return this;
    }
    public String getConcernNecessity() {
        return this.concernNecessity;
    }

}
