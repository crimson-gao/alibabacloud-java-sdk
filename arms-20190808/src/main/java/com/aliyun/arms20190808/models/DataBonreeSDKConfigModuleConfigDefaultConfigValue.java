// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DataBonreeSDKConfigModuleConfigDefaultConfigValue extends TeaModel {
    @NameInMap("enable")
    public Boolean enable;

    public static DataBonreeSDKConfigModuleConfigDefaultConfigValue build(java.util.Map<String, ?> map) throws Exception {
        DataBonreeSDKConfigModuleConfigDefaultConfigValue self = new DataBonreeSDKConfigModuleConfigDefaultConfigValue();
        return TeaModel.build(map, self);
    }

    public DataBonreeSDKConfigModuleConfigDefaultConfigValue setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
