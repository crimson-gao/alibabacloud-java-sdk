// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIpInfoRequest extends TeaModel {
    @NameInMap("Field")
    public String field;

    @NameInMap("Ip")
    public String ip;

    public static DescribeIpInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpInfoRequest self = new DescribeIpInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpInfoRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public DescribeIpInfoRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
