// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Config")
    public String config;

    public static DescribeDBClusterConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterConfigResponseBody self = new DescribeDBClusterConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterConfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
