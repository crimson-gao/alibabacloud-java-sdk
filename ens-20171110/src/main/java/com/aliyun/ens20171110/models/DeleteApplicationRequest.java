// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application. To obtain the application ID, call the ListApplication operation.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The timeout period for the asynchronous release. Unit: seconds. Default value: 300.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static DeleteApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationRequest self = new DeleteApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
