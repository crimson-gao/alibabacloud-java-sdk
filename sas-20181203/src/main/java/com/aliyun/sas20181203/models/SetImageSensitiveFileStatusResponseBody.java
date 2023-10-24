// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetImageSensitiveFileStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SetImageSensitiveFileStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SetImageSensitiveFileStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetImageSensitiveFileStatusResponseBody self = new SetImageSensitiveFileStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetImageSensitiveFileStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetImageSensitiveFileStatusResponseBody setData(SetImageSensitiveFileStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetImageSensitiveFileStatusResponseBodyData getData() {
        return this.data;
    }

    public SetImageSensitiveFileStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetImageSensitiveFileStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetImageSensitiveFileStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SetImageSensitiveFileStatusResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        public static SetImageSensitiveFileStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetImageSensitiveFileStatusResponseBodyData self = new SetImageSensitiveFileStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetImageSensitiveFileStatusResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
