// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateImageEventOperationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateImageEventOperationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateImageEventOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageEventOperationResponseBody self = new UpdateImageEventOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateImageEventOperationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateImageEventOperationResponseBody setData(UpdateImageEventOperationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateImageEventOperationResponseBodyData getData() {
        return this.data;
    }

    public UpdateImageEventOperationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateImageEventOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateImageEventOperationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateImageEventOperationResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        public static UpdateImageEventOperationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateImageEventOperationResponseBodyData self = new UpdateImageEventOperationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateImageEventOperationResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
