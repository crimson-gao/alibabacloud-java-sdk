// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartConfigRuleEvaluationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static StartConfigRuleEvaluationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartConfigRuleEvaluationResponseBody self = new StartConfigRuleEvaluationResponseBody();
        return TeaModel.build(map, self);
    }

    public StartConfigRuleEvaluationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartConfigRuleEvaluationResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
