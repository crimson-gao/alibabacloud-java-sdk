// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIPlanRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("PlanId")
    public String planId;

    public static GetAIPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIPlanRequest self = new GetAIPlanRequest();
        return TeaModel.build(map, self);
    }

    public GetAIPlanRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public GetAIPlanRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public GetAIPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
