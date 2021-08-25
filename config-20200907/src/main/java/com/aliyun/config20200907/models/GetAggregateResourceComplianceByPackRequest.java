// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceByPackRequest extends TeaModel {
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static GetAggregateResourceComplianceByPackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceComplianceByPackRequest self = new GetAggregateResourceComplianceByPackRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceComplianceByPackRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public GetAggregateResourceComplianceByPackRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
