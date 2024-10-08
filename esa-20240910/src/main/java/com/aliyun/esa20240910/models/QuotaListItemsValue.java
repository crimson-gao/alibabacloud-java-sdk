// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class QuotaListItemsValue extends TeaModel {
    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Value")
    public WafQuotaString value;

    public static QuotaListItemsValue build(java.util.Map<String, ?> map) throws Exception {
        QuotaListItemsValue self = new QuotaListItemsValue();
        return TeaModel.build(map, self);
    }

    public QuotaListItemsValue setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public QuotaListItemsValue setValue(WafQuotaString value) {
        this.value = value;
        return this;
    }
    public WafQuotaString getValue() {
        return this.value;
    }

}
