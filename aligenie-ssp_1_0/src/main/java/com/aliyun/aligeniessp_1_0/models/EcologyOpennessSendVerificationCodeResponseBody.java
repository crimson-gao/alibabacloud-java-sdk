// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class EcologyOpennessSendVerificationCodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>73C67BD9-175A-1324-8202-9FAABBB3E6FA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public EcologyOpennessSendVerificationCodeResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static EcologyOpennessSendVerificationCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EcologyOpennessSendVerificationCodeResponseBody self = new EcologyOpennessSendVerificationCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public EcologyOpennessSendVerificationCodeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public EcologyOpennessSendVerificationCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EcologyOpennessSendVerificationCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EcologyOpennessSendVerificationCodeResponseBody setResult(EcologyOpennessSendVerificationCodeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public EcologyOpennessSendVerificationCodeResponseBodyResult getResult() {
        return this.result;
    }

    public EcologyOpennessSendVerificationCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EcologyOpennessSendVerificationCodeResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("ExpireIn")
        public Integer expireIn;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RepeatInterval")
        public Integer repeatInterval;

        public static EcologyOpennessSendVerificationCodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            EcologyOpennessSendVerificationCodeResponseBodyResult self = new EcologyOpennessSendVerificationCodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public EcologyOpennessSendVerificationCodeResponseBodyResult setExpireIn(Integer expireIn) {
            this.expireIn = expireIn;
            return this;
        }
        public Integer getExpireIn() {
            return this.expireIn;
        }

        public EcologyOpennessSendVerificationCodeResponseBodyResult setRepeatInterval(Integer repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Integer getRepeatInterval() {
            return this.repeatInterval;
        }

    }

}
