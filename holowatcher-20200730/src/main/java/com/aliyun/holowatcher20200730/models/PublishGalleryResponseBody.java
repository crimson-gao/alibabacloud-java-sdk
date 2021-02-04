// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class PublishGalleryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MsgInfo")
    public String msgInfo;

    @NameInMap("MsgCode")
    public String msgCode;

    @NameInMap("Error")
    public String error;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("Success")
    public Boolean success;

    public static PublishGalleryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishGalleryResponseBody self = new PublishGalleryResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishGalleryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishGalleryResponseBody setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo;
        return this;
    }
    public String getMsgInfo() {
        return this.msgInfo;
    }

    public PublishGalleryResponseBody setMsgCode(String msgCode) {
        this.msgCode = msgCode;
        return this;
    }
    public String getMsgCode() {
        return this.msgCode;
    }

    public PublishGalleryResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public PublishGalleryResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public PublishGalleryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
