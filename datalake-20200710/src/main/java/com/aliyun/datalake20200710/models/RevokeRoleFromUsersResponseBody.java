// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RevokeRoleFromUsersResponseBody extends TeaModel {
    // Code
    @NameInMap("Code")
    public String code;

    // Message
    @NameInMap("Message")
    public String message;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // Success
    @NameInMap("Success")
    public Boolean success;

    public static RevokeRoleFromUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeRoleFromUsersResponseBody self = new RevokeRoleFromUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeRoleFromUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RevokeRoleFromUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RevokeRoleFromUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RevokeRoleFromUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
