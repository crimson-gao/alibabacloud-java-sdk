// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateConfigRulesReportRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static GenerateConfigRulesReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateConfigRulesReportRequest self = new GenerateConfigRulesReportRequest();
        return TeaModel.build(map, self);
    }

    public GenerateConfigRulesReportRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
