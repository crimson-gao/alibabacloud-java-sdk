// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class CheckCallbackRequest extends TeaModel {
    @NameInMap("CallbackResultString")
    public String callbackResultString;

    public static CheckCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCallbackRequest self = new CheckCallbackRequest();
        return TeaModel.build(map, self);
    }

    public CheckCallbackRequest setCallbackResultString(String callbackResultString) {
        this.callbackResultString = callbackResultString;
        return this;
    }
    public String getCallbackResultString() {
        return this.callbackResultString;
    }

}
