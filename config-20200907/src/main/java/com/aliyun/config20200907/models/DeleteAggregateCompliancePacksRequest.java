// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregateCompliancePacksRequest extends TeaModel {
    @NameInMap("CompliancePackIds")
    public String compliancePackIds;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static DeleteAggregateCompliancePacksRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregateCompliancePacksRequest self = new DeleteAggregateCompliancePacksRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAggregateCompliancePacksRequest setCompliancePackIds(String compliancePackIds) {
        this.compliancePackIds = compliancePackIds;
        return this;
    }
    public String getCompliancePackIds() {
        return this.compliancePackIds;
    }

    public DeleteAggregateCompliancePacksRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteAggregateCompliancePacksRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
