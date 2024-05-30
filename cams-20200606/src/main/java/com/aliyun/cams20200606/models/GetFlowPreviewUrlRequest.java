// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetFlowPreviewUrlRequest extends TeaModel {
    /**
     * <p>The space ID of the user within the independent software vendor (ISV) account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The Flow ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    public static GetFlowPreviewUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFlowPreviewUrlRequest self = new GetFlowPreviewUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetFlowPreviewUrlRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public GetFlowPreviewUrlRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
