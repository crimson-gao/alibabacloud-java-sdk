// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class AddAbilityByDeviceIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAbilityByDeviceIdResponseBody body;

    public static AddAbilityByDeviceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAbilityByDeviceIdResponse self = new AddAbilityByDeviceIdResponse();
        return TeaModel.build(map, self);
    }

    public AddAbilityByDeviceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAbilityByDeviceIdResponse setBody(AddAbilityByDeviceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAbilityByDeviceIdResponseBody getBody() {
        return this.body;
    }

}
