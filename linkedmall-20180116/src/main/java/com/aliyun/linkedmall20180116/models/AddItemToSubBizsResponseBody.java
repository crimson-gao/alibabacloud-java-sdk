// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class AddItemToSubBizsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A7BE4356-7F92-533E-A31B-2EBF2D67****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddItemToSubBizsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddItemToSubBizsResponseBody self = new AddItemToSubBizsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddItemToSubBizsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddItemToSubBizsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddItemToSubBizsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
