// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmMonitorAvailableConfigRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeDnsGtmMonitorAvailableConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmMonitorAvailableConfigRequest self = new DescribeDnsGtmMonitorAvailableConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmMonitorAvailableConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
