// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile3MetaDetailVerifyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public Mobile3MetaDetailVerifyResponseBodyResultObject resultObject;

    public static Mobile3MetaDetailVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaDetailVerifyResponseBody self = new Mobile3MetaDetailVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaDetailVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Mobile3MetaDetailVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Mobile3MetaDetailVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Mobile3MetaDetailVerifyResponseBody setResultObject(Mobile3MetaDetailVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Mobile3MetaDetailVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class Mobile3MetaDetailVerifyResponseBodyResultObject extends TeaModel {
        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("IspName")
        public String ispName;

        @NameInMap("SubCode")
        public String subCode;

        public static Mobile3MetaDetailVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            Mobile3MetaDetailVerifyResponseBodyResultObject self = new Mobile3MetaDetailVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public Mobile3MetaDetailVerifyResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public Mobile3MetaDetailVerifyResponseBodyResultObject setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public Mobile3MetaDetailVerifyResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
