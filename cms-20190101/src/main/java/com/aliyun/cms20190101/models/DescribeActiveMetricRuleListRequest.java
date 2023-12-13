// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeActiveMetricRuleListRequest extends TeaModel {
    /**
     * <p>The abbreviation of the service name. The following services support one-click alert:</p>
     * <br>
     * <p>*   ecs: Elastic Compute Service (ECS)</p>
     * <p>*   rds: ApsaraDB for RDS</p>
     * <p>*   slb: Server Load Balancer (SLB)</p>
     * <p>*   redis_standard: ApsaraDB for Redis of the standard architecture</p>
     * <p>*   redis_sharding: ApsaraDB for Redis of the cluster architecture</p>
     * <p>*   redis_splitrw: ApsaraDB for Redis of the read/write splitting architecture</p>
     * <p>*   mongodb: ApsaraDB for MongoDB of the replica set architecture</p>
     * <p>*   mongodb_sharding: ApsaraDB for MongoDB of the sharded cluster architecture</p>
     * <p>*   hbase: ApsaraDB for HBase</p>
     * <p>*   elasticsearch: Elasticsearch</p>
     * <p>*   opensearch: Open Search</p>
     */
    @NameInMap("Product")
    public String product;

    public static DescribeActiveMetricRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveMetricRuleListRequest self = new DescribeActiveMetricRuleListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeActiveMetricRuleListRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
