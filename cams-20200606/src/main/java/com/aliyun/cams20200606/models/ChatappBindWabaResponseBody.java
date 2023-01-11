// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappBindWabaResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ChatappBindWabaResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ChatappBindWabaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatappBindWabaResponseBody self = new ChatappBindWabaResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatappBindWabaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChatappBindWabaResponseBody setData(ChatappBindWabaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChatappBindWabaResponseBodyData getData() {
        return this.data;
    }

    public ChatappBindWabaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChatappBindWabaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ChatappBindWabaResponseBodyData extends TeaModel {
        @NameInMap("CustSpaceId")
        public String custSpaceId;

        /**
         * <p>wabaId</p>
         */
        @NameInMap("WabaId")
        public String wabaId;

        public static ChatappBindWabaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChatappBindWabaResponseBodyData self = new ChatappBindWabaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChatappBindWabaResponseBodyData setCustSpaceId(String custSpaceId) {
            this.custSpaceId = custSpaceId;
            return this;
        }
        public String getCustSpaceId() {
            return this.custSpaceId;
        }

        public ChatappBindWabaResponseBodyData setWabaId(String wabaId) {
            this.wabaId = wabaId;
            return this;
        }
        public String getWabaId() {
            return this.wabaId;
        }

    }

}