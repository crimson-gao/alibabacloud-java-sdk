// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class PricingRequest extends TeaModel {
    /**
     * <p>solution_id returned by Enrich</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eJwz8DeySEo0NjQ01TU3TU7TNTFINNO1SE5O0jVKM0hKNjEwTElLNYwz0A32cNT1dfPVNTIwMjYwNjRQ8/A3NLI01Q0Ic0cRBwBVFxJJ</p>
     */
    @NameInMap("solution_id")
    public String solutionId;

    public static PricingRequest build(java.util.Map<String, ?> map) throws Exception {
        PricingRequest self = new PricingRequest();
        return TeaModel.build(map, self);
    }

    public PricingRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

}
