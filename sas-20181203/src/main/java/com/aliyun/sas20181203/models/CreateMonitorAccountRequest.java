// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateMonitorAccountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1026780160******,1457515594******</p>
     */
    @NameInMap("AccountIds")
    public String accountIds;

    public static CreateMonitorAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorAccountRequest self = new CreateMonitorAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorAccountRequest setAccountIds(String accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public String getAccountIds() {
        return this.accountIds;
    }

}
